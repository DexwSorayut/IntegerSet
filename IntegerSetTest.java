public class IntegerSetTest {

    public static void main(String[] args) {
        
        System.out.println("--- Starting IntegerSet Manual Tests ---");
        int passed = 0;
        int failed = 0;

        // Test 1: การเพิ่มสมาชิก
        System.out.println("\n--- Testing add() ---");
        IntegerSet set = new IntegerSet();
        set.add(1); 
        set.add(2); 
        set.add(3);
        String expected1 = "[1, 2, 3]";
        if (set.toString().equals(expected1)) {
            System.out.println("PASSED: Add and sort works correctly.");
            passed++;
        } else {
            System.out.println("FAILED: Expected " + expected1 + " but got " + set.toString());
            failed++;
        }

         // Test 2: การเพิ่มข้อมูลที่มีอยู่แล้ว
        System.out.println("\n--- Testing adding duplicates ---");
        set.add(1); // เพิ่ม "1" ที่มีอยู่แล้ว
        if (set.size() == 3) {
            System.out.println("PASSED: Adding a duplicate does not change the size.");
            passed++;
        } else {
            System.out.println("FAILED: Size should be 3 but got " + set.size());
            failed++;
        }

        // Test 3: การลบข้อมูล
        System.out.println("\n--- Testing remove() ---");
        set.remove(2);
        String expected2 = "[1, 3]";
        if (set.toString().equals(expected2)) {
            System.out.println("PASSED: Remove works correctly.");
            passed++;
        } else {
            System.out.println("FAILED: Expected " + expected2 + " but got " + set.toString());
            failed++;
        }

        // Test 4: การตรวจสอบข้อมูล (contains)
        System.out.println("\n--- Testing contains() ---");
        if (set.contains(1) && !set.contains(2)) {
            System.out.println("PASSED: Contains works correctly after removal.");
            passed++;
        } else {
            System.out.println("FAILED: Contains check is incorrect.");
            failed++;
        }

        // Test 5: การแทรกข้อมูล
        System.out.println("\n--- Testing contains() ---");
        set.add(4); 
        set.add(5); 
        String expected3 = "[1, 3, 4, 5]";
        if (set.toString().equals(expected3)) {
            System.out.println("PASSED: Add and sort works correctly.");
            passed++;
        } else {
            System.out.println("FAILED: Expected " + expected3 + " but got " + set.toString());
            failed++;
        }


        // --- สรุปผล ---
        System.out.println("\n--------------------");
        System.out.println("--- Test Summary ---");
        System.out.println("Passed: " + passed + ", Failed: " + failed);
        if (failed == 0) {
            System.out.println("Excellent! All tests passed!");
        } else {
            System.out.println("Some tests failed.");
        }
    }
}
