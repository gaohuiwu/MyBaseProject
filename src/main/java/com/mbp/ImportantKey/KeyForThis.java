package com.mbp.ImportantKey;

/**
 * FileName:KeyForThis
 * Author:  ghw06
 * Date:    2018/4/3 11:03
 * Description: this关键字的多种用法
 */
public class KeyForThis {

	int x;
	int y;

	/**
	 * 情况1
	 * 当成员变量和局部变量重名时
	 * 在方法中使用this时 表示的该方法所在类中的成员变量
	 */
	String s = "Hello";

	public KeyForThis(String s) {
		System.out.println("局部变量--> s=" + s);
		System.out.println("代表成员变量-->this.s=" + this.s);
		this.s = s;//把参数值赋给成员变量，成员变量值改变
		System.out.println("改变后的成员变量-->this.s=" + this.s);
	}

	public KeyForThis() {
		//this("用this调用另一个构造函数");
	}

	/**
	 * 情况2
	 * 把自己当作参数传递时，也可以用this.(this作当前参数进行传递)
	 * 在这个例子中，对象A的构造函数中，用new B(this)把对象A自己作为参数传递给了对象B的构造函数
	 */
	/*class A {
		public A() {
			new B(this).print();// 调用B的方法
		}
		public void print() {
			System.out.println("HelloAA from A!");
		}
	}
	class B {
		A a;
		public B(A a) {
			this.a = a;
		}
		public void print() {
			a.print();//调用A的方法
			System.out.println("HelloAB from B!");
		}
	}
	public class HelloA {
		public static void main(String[] args) {
			A aaa = new A();
			aaa.print();
			B bbb = new B(aaa);
			bbb.print();
		}
	}*/
	/**
	 * 情况3
	 * 有时候，我们会用到一些内部类和匿名类，如事件处理。当在匿名类中用this时，
	 * 这个this则指的是匿名类或内部类本身。这时如果我们要使用外部类的方法和变量的话，
	 * 则应该加上外部类的类名。
	 */
	/*public class HelloB {
		int i = 1;

		public HelloB() {
			Thread thread = new Thread() {
				public void run() {
					for (int j=0;j<20;j++) {
						HelloB.this.run();//调用外部类的方法
						try {
							sleep(1000);
						} catch (InterruptedException ie) {
						}
					}
				}
			}; // 注意这里有分号
			thread.start();
		}

		public void run() {
			System.out.println("i = " + i);
			i++;
		}

		public static void main(String[] args) throws Exception {
			new HelloB();
		}
	}*/
	/**
	 * 情况4
	 * 在构造函数中，通过this可以调用同一类中别的构造函数。
	 * 值得注意的是：
	 　　1：在构造调用另一个构造函数，调用动作必须置于最起始的位置。
	 　　2：不能在构造函数以外的任何函数内调用构造函数。
	 　　3：在一个构造函数内只能调用一个构造函数。
	 */
	/*public class ThisTest {
		ThisTest(String str) {
			System.out.println(str);
		}
		ThisTest() {
			this("this测试成功！");
		}

		public static void main(String[] args) {
			ThisTest thistest = new ThisTest();
		}
	}*/

	/**
	 * 情况5
	 * this同时传递多个参数
	 * 代码中的showtest(this),这里的this就是把当前实例化的p传给了showtest（）方法，从而就运行了
	 */
	static void showTest(KeyForThis k) {
		System.out.println(k.x + "" + k.y);
	}

	void seeit() {
		showTest(this);
	}

	public static void main(String[] args) {
		KeyForThis k = new KeyForThis();
		k.x = 9;
		k.y = 10;
		k.seeit();
	}
}
