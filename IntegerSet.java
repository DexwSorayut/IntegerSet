import java.util.ArrayList;

/**
 * ADT ที่เก็บ Integer แบบเรียงลำดับจากน้อยไปมาก โดยไม่ซ้ำกัน
 */
    // Rep Invariant (RI):
    //  เลขจะต้องไม่ซ้ำกัน
    //  เลขต้องเรียงลำดับจากน้อยไปมาก
    //
    // Abstraction Function (AF):
    // AF(์Number) = the set of characters in the string Number.

public class IntegerSet {
    
    private ArrayList<Integer> Number ;  //Rep

    public IntegerSet(){
        Number = new ArrayList<>();
        CheckRep();
    }

    private void CheckRep(){
        // ตรวจสอบ(1) เป็น null หรือไม่
            if (Number == null) {
                throw new RuntimeException("Number is null!");
            }

        // ตรวจสอบ(2) เรียงจากน้อยไปมากหรือไม่ และ มีตัวซ้ำหรือไม่
            for(int i = 0 ; i < Number.size() -1 ; i++){
                if (Number.get(i) >= Number.get(i+1)) {
                    throw new RuntimeException("Rep invariant violated!");
                }
            }
    }

    /**
     * เพิ่มค่าเข้าในเซต
     * @param A ค่าที่ต้องการเพิ่ม
     */
    public void add(Integer A){
        if(A == null)
            return ;
        if(Number.size() > 0){
            if(!Number.contains(A))
            for(int i = 0 ; i < Number.size() ; i++){
                if(i == Number.size() - 1){
                    Number.add(A);
                    break;
                }

                if(Number.get(i) < A && Number.get(i+1) > A){
                    Number.add(i , A);
                    break;
                }
            }
        }
        else{
            Number.add(A);
        }
        CheckRep();
    }

    /**
     * ลบค่าออกจากเซต
     * @param A ค่าที่ต้องการลด
     */
    public void remove(Integer A){
        Number.remove(A);
        CheckRep();
    }

    /**
     * ตรวจสอบว่ามีตัวเลขซ้ำกันในเซตหรือไม่
     * @param A ตัวเลขที่ตรวจสอบ
     * @return true ถ้า A อยู่ในเซต , false ถ้า A ไม่ได้อยู่ในเซต
     */
    public boolean contains(Integer A){
        return Number.contains(A) ;
    }

    /**
     * คืนค่าขนาดของเซต
     * @return จำนวนสมาชิกในเซต
     */
    public int size(){
        return Number.size() ;
    }
 
    public String toString(){
        return Number.toString() ;
    }

}
