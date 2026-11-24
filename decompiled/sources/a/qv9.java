package a;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class qv9 extends jv9 implements oq8 {
    public final boolean f;
    public final Object g;

    /* JADX WARN: Illegal instructions before constructor call */
    public qv9(Method method, boolean z, Object obj) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        genericParameterTypes.getClass();
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : qx3.k(genericParameterTypes, 1, genericParameterTypes.length)));
        this.f = z;
        this.g = obj;
    }

    @Override // a.jv9, a.bv9
    public final Object call(Object[] objArr) {
        objArr.getClass();
        d(objArr.length);
        jdg0 jdg0Var = new jdg0(2);
        jdg0Var.a(this.g);
        jdg0Var.b(objArr);
        ArrayList arrayList = jdg0Var.b;
        return g(null, arrayList.toArray(new Object[arrayList.size()]));
    }
}
