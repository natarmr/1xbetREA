package a;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class a5x0 {
    public static final Logger c = Logger.getLogger(a5x0.class.getName());
    public static final a5x0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f294a;
    public ConcurrentHashMap b;

    static {
        a5x0 a5x0Var = new a5x0();
        a5x0Var.f294a = new ConcurrentHashMap();
        a5x0Var.b = new ConcurrentHashMap();
        d = a5x0Var;
    }

    public final l5x0 a(Class cls, String str) throws GeneralSecurityException {
        l5x0 l5x0VarE = e(str);
        if (l5x0VarE.b.equals(cls)) {
            return l5x0VarE;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(l5x0VarE.getClass());
        String strValueOf2 = String.valueOf(l5x0VarE.b);
        StringBuilder sbN = b1j.n("Primitive type ", name, " not supported by key manager of type ", strValueOf, ", which only supports: ");
        sbN.append(strValueOf2);
        throw new GeneralSecurityException(sbN.toString());
    }

    public final synchronized void b(l5x0 l5x0Var, int i, boolean z) {
        if (!esw0.a(i)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        d(l5x0Var, z);
    }

    public final synchronized void c(l5x0 l5x0Var, boolean z) {
        b(l5x0Var, 1, z);
    }

    public final synchronized void d(l5x0 l5x0Var, boolean z) {
        try {
            String str = l5x0Var.f19481a;
            if (z && this.b.containsKey(str) && !((Boolean) this.b.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            l5x0 l5x0Var2 = (l5x0) this.f294a.get(str);
            if (l5x0Var2 != null && !l5x0Var2.getClass().equals(l5x0Var.getClass())) {
                c.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + l5x0Var2.getClass().getName() + ", cannot be re-registered with " + l5x0Var.getClass().getName());
            }
            this.f294a.putIfAbsent(str, l5x0Var);
            this.b.put(str, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized l5x0 e(String str) {
        if (!this.f294a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (l5x0) this.f294a.get(str);
    }
}
