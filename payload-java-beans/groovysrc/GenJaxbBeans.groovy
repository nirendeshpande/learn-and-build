public class GenJaxbBeans{

	def integrationLib = "../../int-lib"
	def PATH
	
	def ant = new AntBuilder()
	
	void generateBeans(){
		ant.path(id:PATH){
			fileset(dir: integrationLib + "/third-party/jaxb/jaxb-ri-2.2.6/lib", includes:"*.jar")	
		}
		
		ant.java(classname:"com.sun.tools.xjc.XJCFacade", fork:"false",classpathref:PATH){
			arg(value:"../../payload-xsd/src")
			arg(value:"-d")
			arg(value:"../../payload-java-beans/src")
		}
	}
	
	
	public static void main(String[] args) {
		GenJaxbBeans gen = new GenJaxbBeans()
		gen.generateBeans()
	}
}