package com.javarush.test.level14.lesson08.bonus03;

/* Singleton
����� �������� ���������� (��������� �������(������) Singleton), ���� ��������� ������� ����� ���� ������ ������ ����.

����������� Singleton pattern:
1. ������ ����� Singleton � ��������� �����.
2. ������ � ���� ����������� ����� getInstance().
3. ����� getInstance ������ ���������� ���� � ��� �� ������ ������ Singleton ��� ����� ������ ������ getInstance.
4. �������, ����� ������� ����� ��������� �������� ������ �������� ����� ������.
5. ������ ��� ������������ � ������ Singleton ���������� (private).

6. � ����� ������ ���� ����������� ������� ������ (��������� ������) ������ ��������� ����� getInstance.
*/

public class Singleton
{
    private Singleton(){
    }

    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}
