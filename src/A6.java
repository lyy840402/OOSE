import java.util.ArrayList;

public abstract class A6 {

	abstract void doQuestion();
    abstract void addQuestion(Question question);
	
	}

	class Testpaper extends A6{
		ArrayList<A6>list;
		
		public Testpaper (){
			list = new ArrayList <A6> ( ) ;
		}
		void addQuestion(A6 e){
			list.add (e);
		}
		public void op() {
			int a = 1;
			a = a+1;
			for(A6 e: list)
				e.op();
		}
		@Override
		void doQuestion() {
			
		}
		@Override
		void addQuestion(Question question) {
			
		}
	} 
	
	
	

	class Question extends A6 {
		String description;

		public Question(String desc) {
			this.description = desc;
		}

		public void print() {
			char[] desc;
			System.out.println(desc);
		}

		@Override
		public
		void op() {
			// TODO Auto-generated method stub
			
		}
	}

