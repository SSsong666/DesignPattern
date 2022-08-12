package JVM;

import singleton.Singleton01;

import java.io.*;

/**
 * 自定义类加载器
 */
public class OverrideFindClass extends ClassLoader {
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File file = new File("E:/myGitProduct/DesignPattern/", name.replace(".", "/").concat(".class"));
        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream baps = new ByteArrayOutputStream();
            int b = 0;
            while ((b = fis.read()) != 0) {
                baps.write(b);
            }
            byte[] bytes = baps.toByteArray();
            baps.close();
            fis.close();
            return defineClass(name, bytes, 0, bytes.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.findClass(name);
    }

    public static void main(String[] args) throws Exception {
        ClassLoader l = new OverrideFindClass();
        Class clazz = l.loadClass("src.factory.color.Green");
        Singleton01 singleton01 = (Singleton01) clazz.newInstance();
        singleton01.show();
        System.out.println(l.getClass().getClassLoader());
        System.out.println(l.getParent());
    }
}
