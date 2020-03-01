package com.springcloud.eurekaserverconsoumer.cfgbeans;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("aaa",111);
        map.put("sss",222);
        map.put("a",12);
        map.put("b",34);
        map.put("c",56);
        for (Map.Entry<String,Integer> entry: map.entrySet()) {
            String key = entry.getKey().toString();
            String value = entry.getValue().toString();
            System.out.println("key="+ key + "value=" + value);
        }

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key="+ key + "value="+ value);
        }

        for (Iterator i = map.keySet().iterator(); i.hasNext();) {
            Object obj = i.next();
            System.out.println("key="+ obj + "value="+map.get(obj));
        }
    }
}
