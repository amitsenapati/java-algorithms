import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class IPAddressFrequency {

    private static final String[] INPUT_SENTENCES = new String[]{
            "48878 128.206.6.136",
            "34782 128.206.6.137",
            "12817 23.234.22.106"
    };

    private static final String IPADDRESS_PATTERN =
            "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

    private static Pattern pattern = null;

    public static void main(String[] args){
        pattern = Pattern.compile(IPADDRESS_PATTERN);
        Map<String, Integer> ipMap = new HashMap<>(INPUT_SENTENCES.length);

        for(String text : INPUT_SENTENCES){
            String ip = extractIP(text);
            int count = ipMap.getOrDefault(ip, 0);
            ipMap.put(ip, count + 1);
        }
        System.out.println(ipMap);
        Map<Integer, List<String>> byCount = ipMap.keySet().stream().collect(Collectors.groupingBy(ipMap::get));
        System.out.println(byCount);
        TreeSet<Integer> sortedbyCount = new TreeSet<>(byCount.keySet());
        Iterator iterator = sortedbyCount.descendingIterator();
        if(iterator.hasNext()){
            System.out.println(byCount.get(iterator.next()));
        }

    }

    private static String extractIP(String text){
        Matcher matcher = pattern.matcher(text);
            if(matcher.find())
                return matcher.group();
            else return "0.0.0.0";
    }
}
