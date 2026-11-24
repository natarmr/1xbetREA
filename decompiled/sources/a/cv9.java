package a;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class cv9 extends sv9 implements oq8 {
    public final Object e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public cv9(Constructor constructor, Object obj, boolean z) {
        Class declaringClass = constructor.getDeclaringClass();
        declaringClass.getClass();
        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
        genericParameterTypes.getClass();
        int i = z ? 2 : 1;
        super(constructor, declaringClass, (Type[]) (genericParameterTypes.length <= i + 1 ? new Type[0] : qx3.k(genericParameterTypes, 1, genericParameterTypes.length - i)));
        this.e = obj;
        this.f = z;
    }

    @Override // a.bv9
    public final Object call(Object[] objArr) {
        objArr.getClass();
        d(objArr.length);
        Object obj = this.e;
        boolean z = this.f;
        Member member = this.c;
        if (!z) {
            jdg0 jdg0Var = new jdg0(3);
            jdg0Var.a(obj);
            jdg0Var.b(objArr);
            jdg0Var.a(null);
            ArrayList arrayList = jdg0Var.b;
            return ((Constructor) member).newInstance(arrayList.toArray(new Object[arrayList.size()]));
        }
        jdg0 jdg0Var2 = new jdg0(4);
        jdg0Var2.a(obj);
        jdg0Var2.b(objArr);
        jdg0Var2.a(null);
        jdg0Var2.a(null);
        ArrayList arrayList2 = jdg0Var2.b;
        return ((Constructor) member).newInstance(arrayList2.toArray(new Object[arrayList2.size()]));
    }
}
