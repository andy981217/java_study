package test.ch10.resource;

public class TryWithResource {

	public static void main(String[] args) {
		try(MyResource res = new MyResource("A")){
			String data = res.read1();
			int value = Integer.parseInt(data); //int형 변환
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		try(MyResource res =new MyResource("A")){
			String data = res.read2();
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}

