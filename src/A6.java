//資訊三甲  作業六
//姓名： 劉彥余
//學號： D0240176

import java.util.ArrayList;

public class A6 {
	public static void main(String[] args) {
		Component answer = new TestPaper();
		
		if (answer instanceof TestPaper) {
			answer.addQuestion(new Question("y - 10 = ...calculate  y"));
			answer.addQuestion(new Question("x + 8 = ...calculate x "));

		}
		answer.doQuestion();
	}
}

abstract class Component {
	abstract void doQuestion();

	abstract void addQuestion(Question question);
}

class TestPaper extends Component {
	ArrayList<Component> list;

	public TestPaper() {
		list = new ArrayList<>();
	}

	public void addQuestion(Question q) {
		list.add(q);
	}

	@Override
	void doQuestion() {
		list.forEach(Component::doQuestion);
	}
}

class Question extends Component {
	String description;

	public Question(String desc) {
		this.description = desc;
	}

	public void print() {
		System.out.println(this.description);
	}

	@Override
	void doQuestion() {
		print();
	}

	@Override
	void addQuestion(Question question) {

	}
}