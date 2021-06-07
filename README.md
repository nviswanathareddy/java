@Component(service = Servlet.class, property = {Constants.SERVICE_DESCRIPTION + "=Path and Tag based search servlet",
        "sling.servlet.methods=" + HttpConstants.METHOD_GET, "sling.servlet.paths=" + "/bin/tagServlet"})
@Designate(ocd = TagOptionsServlet.Configuration.class)
public class TagOptionsServlet extends SlingSafeMethodsServlet {
@Activate
    @Modified
    protected void Activate(Configuration config) {
        this.serverDomain = config.serverDomain();
    }

    @ObjectClassDefinition(name = "UHC externalizer server domain")
    public @interface Configuration {
        @AttributeDefinition(
                name = "Server Domain",
                description = "This configuration should have a valid name from externalizer configuration. Please refer \"Day CQ Externalizer Configuration\""
        )
        String serverDomain() default "local";
    }
ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(allCF);
        byte[] jsonResp = json.getBytes("UTF-8");

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.setContentLength(jsonResp.length);
        response.getOutputStream().write(jsonResp);
