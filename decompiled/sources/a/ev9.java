package a;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class ev9 extends sv9 implements oq8 {
    public final Object e;

    /* JADX WARN: Illegal instructions before constructor call */
    public ev9(Constructor constructor, Object obj) {
        Class declaringClass = constructor.getDeclaringClass();
        declaringClass.getClass();
        super(constructor, declaringClass, xww.E(constructor));
        this.e = obj;
    }

    @Override // a.bv9
    public final Object call(Object[] objArr) {
        objArr.getClass();
        d(objArr.length + 1);
        Constructor constructor = (Constructor) this.c;
        jdg0 jdg0Var = new jdg0(2);
        jdg0Var.a(this.e);
        jdg0Var.b(objArr);
        ArrayList arrayList = jdg0Var.b;
        return constructor.newInstance(arrayList.toArray(new Object[arrayList.size()]));
    }
}
