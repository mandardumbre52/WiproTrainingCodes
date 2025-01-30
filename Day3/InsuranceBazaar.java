package Day3;

import java.util.*;

public class InsuranceBazaar {
    private static Map<Integer, String> policyMap = new TreeMap<>();
    
    public static void addPolicyDetails(int policyId, String policyName) {
        policyMap.put(policyId, policyName);
    }
    
    public static List<Integer> searchBasedOnPolicyType(String policyType) {
        List<Integer> policyIds = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : policyMap.entrySet()) {
            if (entry.getValue().toLowerCase().contains(policyType.toLowerCase())) {
                policyIds.add(entry.getKey());
            }
        }
        return policyIds;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of Policy names you want to store:");
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Policy ID:");
            int policyId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the Policy Name:");
            String policyName = sc.nextLine();
            addPolicyDetails(policyId, policyName);
        }
        
        for (Map.Entry<Integer, String> entry : policyMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        System.out.println("Enter the policy type to be searched:");
        String policyType = sc.nextLine();
        List<Integer> result = searchBasedOnPolicyType(policyType);
        for (int id : result) {
            System.out.println(id);
        }
        sc.close();
    }
}
