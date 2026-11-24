package a;

import android.content.Context;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class thv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ thv0 f33979a = new thv0();
    public static final n0o0 b;
    public static final gqw0 c;

    static {
        sre0.f32672a.b(uhv0.class).J();
        b = maz.b(new y9v0((byte) 6));
        c = gqw0.j1;
    }

    public static w4p0 a(Context context) {
        jhv0 jhv0Var = (jhv0) b.getValue();
        if (jhv0Var == null) {
            auj0 auj0Var = auj0.c;
            if (auj0.c == null) {
                ReentrantLock reentrantLock = auj0.d;
                reentrantLock.lock();
                try {
                    if (auj0.c == null) {
                        ytj0 ytj0Var = null;
                        try {
                            sbu0 sbu0VarB = xtj0.b();
                            if (sbu0VarB != null) {
                                sbu0 sbu0Var = sbu0.f;
                                sbu0Var.getClass();
                                Object value = sbu0VarB.e.getValue();
                                value.getClass();
                                Object value2 = sbu0Var.e.getValue();
                                value2.getClass();
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    ytj0 ytj0Var2 = new ytj0(context);
                                    if (ytj0Var2.e()) {
                                        ytj0Var = ytj0Var2;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        auj0.c = new auj0(ytj0Var);
                    }
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            jhv0Var = auj0.c;
            jhv0Var.getClass();
        }
        w4p0 w4p0Var = new w4p0(new njv0(), jhv0Var, new bzs0());
        c.getClass();
        return w4p0Var;
    }
}
