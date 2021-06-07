@Component(service = Servlet.class, property = {Constants.SERVICE_DESCRIPTION + "=experience fragment custom export servlet",
        "sling.servlet.methods=" + HttpConstants.METHOD_GET, "sling.servlet.paths=" + "/bin/export"})
@Designate(ocd = CustomJSONExport.Configuration.class)
public class CustomJSONExport extends SlingSafeMethodsServlet {
    private static final Logger LOG=LoggerFactory.getLogger(CustomJSONExport.class);
}

    @Override
    protected doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws IOException{
        String xf_path=request.getParameter("xf_path")?request.getParameter("xf_path"):"";
        Object output=null;
        if(isBlank(xf_path)){
            output="Empty experience fragment path";
            LOG.info("Empty xf_path");
        }

        ResourceResolver resolver=request.getResourceResolver();
        //Reosurce xf=resolver.getResource(xf_path);
        String base_path="/content/experience-fragments/suncorp/insurance/aami/caasapi/experience-fragment-caas/master/jcr:content/root/contentfragmentlist";

        Resource xf=resolver.getResource(base_path);
        xf.get


    String xf_path=request.
    ObjectMapper objectMapper = new ObjectMapper();
    String json = objectMapper.writeValueAsString(allCF);
    byte[] jsonResp = json.getBytes("UTF-8");

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.setContentLength(jsonResp.length);
        response.getOutputStream().write(jsonResp);
}
    @Activate
    @Modified
    protected void Activate(Configuration config) {
        this.serverDomain = config.serverDomain();
    }

    @ObjectClassDefinition(name = "externalizer server domain")
    public @interface Configuration {
        @AttributeDefinition(
                name = "Server Domain",
                description = "This configuration should have a valid name from externalizer configuration. Please refer \"Day CQ Externalizer Configuration\""
        )
        String serverDomain() default "local";
    }

