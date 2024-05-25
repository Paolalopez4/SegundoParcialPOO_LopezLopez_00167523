public class AdapterForToken implements Api{
    private Paypal services;

    @Override
    public String token(String business) {
        return (services.getUser() + ":" + business);
    }
}
