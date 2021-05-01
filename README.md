# Generic Classes
<br>
Generics, farklı referans veri tiplerini alan, hangi referans tipini alacağına karar verebileceğimiz ve üzerinde benzer işlemler yapabileceğimiz bir sınıfdır.
<br>
```

```
List list = new ArrayList();
list.add("Merhaba Dünya");
list.add(123);
for (int i = 0; i < list.size(); i++) {
    String string = (String) list.get(i);
}

```
<br>
 >>> Yukarıdaki örnekte ClassCastException hatası alırız.<br>
 Çünkü 2 farklı veri tipiyle listeyi oluşturmaya çalışıyorum.Bunu generic kullanmadan aşağıdaki şekilde çözebilirsiniz. Ama bu yapı kullanışlı değildir.
 <br>

```
     // Generic ifadeler kullanılarak
List<String> list = new ArrayList<String>();
list.add("Merhaba Dünya");
list.add(123);
for (int i = 0; i < list.size(); i++) {
    String string = list.get(i);
}
```

<br>

```
// Interface ile kullanım
public interface Comparable<T> {
    public int compareTo(T object);
}// Class ile kullanım
public class Printer<T> {
    public void print(T object) {
        System.out.println(object);
    }
}// Method ile kullanım -1
public <T> T myGenericMethod(){
    T object = null;
    //***
    return object;
}// Method ile kullanım -2
public <T> T myGenericMethodWithParameter(T object){
    return object;
}// Method ile kullanım -3
public <T> void myGenericVoidMethod(T object){
    System.out.println(object);
}
```
<br>

- Genericler uygulamalarınızda ki hataları minimuma indirmeyi amaçlar. Özellikle Runtime sırasında oluşacak ClassCastException hatalarını derleme sırasında yakalayabiliriz.

- Neden Generic tip tanımlarken T kullanılıyor? Neden X,Y,Z değil?

Generic ifadelerde dikkat etmişsinizdir hep T harifini kullandık. Bunun nedeni Java Naming Convention (Java İsimlendirme Standartları).<br>
![java-standart](https://miro.medium.com/max/700/1*ByVvLDTIU7rBtleJb-KhiA.png)



