package edu.wust.dp.Visitor;
/**
 * �� ģʽ���ó��������������Ϊһ�����е��������¹��ܣ����ò����Ǽ������飺
 * 1���¹��ܻ᲻�������й��ܳ��ּ��������⣿
 * 2���Ժ�᲻������Ҫ��ӣ�
 * 3���� ���಻�����޸Ĵ�����ô�죿
 * �����Щ���⣬��õĽ����������ʹ�÷�����ģʽ��
 * ������ģʽ���������ݽṹ����ȶ���ϵͳ�������ݽṹ���㷨���
 * @author yy
 *
 */
public class Test {


 public static void main(String[] args) {            
         Visitor visitor = new MyVisitor();  
         Subject sub = new MySubject();  
         sub.accept(visitor); 
     }  
 } 