package a;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class smx extends sv9 {
    public smx(Method method) {
        super(method, kotlin.collections.a.c(method.getDeclaringClass()));
    }

    @Override // a.bv9
    public final Object call(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (a().size() != length) {
            c99.i(a().size(), length);
            return null;
        }
        Object obj = objArr[0];
        Object[] objArrK = objArr.length <= 1 ? new Object[0] : qx3.k(objArr, 1, objArr.length);
        objArrK.getClass();
        return ((Method) this.c).invoke(obj, Arrays.copyOf(objArrK, objArrK.length));
    }
}
