package a;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class fv9 extends sv9 {
    /* JADX WARN: Illegal instructions before constructor call */
    public fv9(Constructor constructor) {
        Class declaringClass = constructor.getDeclaringClass();
        declaringClass.getClass();
        super(constructor, declaringClass, xww.E(constructor));
    }

    @Override // a.bv9
    public final Object call(Object[] objArr) {
        objArr.getClass();
        d(objArr.length);
        return ((Constructor) this.c).newInstance(Arrays.copyOf(objArr, objArr.length));
    }
}
