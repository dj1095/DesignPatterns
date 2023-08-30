package designpatterns.structural.adpater;

public class Adapter implements IClient{
    private ThirdPartyService thirdPartyService;

    public Adapter(ThirdPartyService thirdPartyService) {
        this.thirdPartyService = thirdPartyService;
    }

    @Override
    public void processData(String xmlData) {
        JsonType json = convertXMLToJson(xmlData);
        thirdPartyService.processAnalytics(json);
    }

    //Just Dummy type to show that we send processed data to third party service
    private JsonType convertXMLToJson(String xmlData) {
        return new JsonType();
    }
}
