package cache;

import java.util.HashMap;
import java.util.Map;

public class TimeFactory {
    // Map com os times mais acessados
    private static final Map<String, Time> times = new HashMap<String, Time>();

    private static final Time CORINTHIANS = new Time("CORINTHIANS");
    private static final Time PALMEIRAS = new Time("PALMEIRAS");
    private static final Time SANTOS = new Time("SANTOS");
    private static final Time SAO_PAULO = new Time("SAO PAULO");

    static {
        times.put("CORINTHIANS", CORINTHIANS);
        System.out.println(times.get("CORINTHIANS"));
        times.put("PALMEIRAS", PALMEIRAS);
        System.out.println(times.get("PALMEIRAS"));
        times.put("SANTOS", SANTOS);
        System.out.println(times.get("SANTOS"));
        times.put("SAO_PAULO", SAO_PAULO);
        System.out.println(times.get("SAO_PAULO"));
    }

    public static Time getTimeByName(String name) {
        // Se for um dos times mais acessados
        if(times.containsKey(name)) {
            return times.get(name);
        } else {
            return new Time(name);
        }
    }
}
