package edu.wust.dp.Decorator;

/**
 * 
 * @author yy
 *װ����ģʽ��Ӧ�ó�����
1����Ҫ��չһ����Ĺ��ܡ�
2����̬��Ϊһ���������ӹ��ܣ����һ��ܶ�̬���������̳в���������һ�㣬�̳еĹ����Ǿ�̬�ģ����ܶ�̬��ɾ����
ȱ�㣺�����������ƵĶ��󣬲����Ŵ�
 */

public class Decorator implements Sourceable{
	private Sourceable source;  
    
    public Decorator(Sourceable source){  
        super();  
        this.source = source;  
    }  
    @Override  
    public void method() {  
        System.out.println("before decorator!");  
        source.method();  
        System.out.println("after decorator!");  
    }  
}
