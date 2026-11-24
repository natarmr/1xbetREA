package a;

import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class b6x0 {
    public static final b6x0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2078a = new HashMap();

    static {
        yqw0 yqw0Var = new yqw0((byte) 12);
        b6x0 b6x0Var = new b6x0();
        try {
            b6x0Var.a(yqw0Var, t5x0.class);
            b = b6x0Var;
        } catch (GeneralSecurityException e) {
            hny.q("unexpected error.", e);
        }
    }

    public final synchronized void a(yqw0 yqw0Var, Class cls) {
        try {
            yqw0 yqw0Var2 = (yqw0) this.f2078a.get(cls);
            if (yqw0Var2 != null && !yqw0Var2.equals(yqw0Var)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + String.valueOf(cls) + " already inserted");
            }
            this.f2078a.put(cls, yqw0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized atm0 b(fpw0 fpw0Var, Integer num) {
        yqw0 yqw0Var;
        yqw0Var = (yqw0) this.f2078a.get(fpw0Var.getClass());
        if (yqw0Var == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + String.valueOf(fpw0Var) + ": no key creator for this class was registered.");
        }
        return yqw0Var.a(fpw0Var, num);
    }
}
