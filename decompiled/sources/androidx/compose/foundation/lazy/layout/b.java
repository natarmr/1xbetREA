package androidx.compose.foundation.lazy.layout;

import a.zmx;
import a.zz2;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public final Object a(int i) {
        zmx zmxVarQ = b().q(i);
        return zmxVarQ.c.getType().invoke(Integer.valueOf(i - zmxVarQ.f44646a));
    }

    public abstract zz2 b();

    public final Object c(int i) {
        Object objInvoke;
        zmx zmxVarQ = b().q(i);
        int i2 = i - zmxVarQ.f44646a;
        Function1 key = zmxVarQ.c.getKey();
        return (key == null || (objInvoke = key.invoke(Integer.valueOf(i2))) == null) ? new DefaultLazyKey(i) : objInvoke;
    }
}
