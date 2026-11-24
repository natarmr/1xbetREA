package a;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class rv9 extends jv9 {
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rv9(byte b, int i, Method method, boolean z) {
        super(method, z, i);
        this.f = b;
    }

    @Override // a.jv9, a.bv9
    public final Object call(Object[] objArr) {
        byte b = this.f;
        objArr.getClass();
        switch (b) {
            case 0:
                d(objArr.length);
                return g(objArr[0], objArr.length <= 1 ? new Object[0] : qx3.k(objArr, 1, objArr.length));
            case 1:
                d(objArr.length);
                f(tx3.B(objArr));
                return g(null, objArr.length <= 1 ? new Object[0] : qx3.k(objArr, 1, objArr.length));
            default:
                d(objArr.length);
                return g(null, objArr);
        }
    }
}
