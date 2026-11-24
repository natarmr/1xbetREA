package a;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class rmx extends sv9 implements oq8 {
    public final Object e;

    public rmx(Method method, Object obj) {
        super(method, iun.f15405a);
        this.e = obj;
    }

    @Override // a.bv9
    public final Object call(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        if (a().size() != length) {
            c99.i(a().size(), length);
            return null;
        }
        return ((Method) this.c).invoke(this.e, Arrays.copyOf(objArr, objArr.length));
    }
}
