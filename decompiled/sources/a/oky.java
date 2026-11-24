package a;

import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class oky {
    public static final Logger b = Logger.getLogger(oky.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f25428a;

    public oky(oky okyVar) {
        this.f25428a = new ConcurrentHashMap(okyVar.f25428a);
    }

    public final synchronized nky a(String str) {
        if (!this.f25428a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (nky) this.f25428a.get(str);
    }

    public final synchronized void b(v0 v0Var) {
        int iP = v0Var.p();
        if (!(iP != 1 ? brm0.b(iP) : brm0.a(iP))) {
            throw new GeneralSecurityException("failed to register key manager " + v0Var.getClass() + " as it is not FIPS compatible.");
        }
        c(new nky(v0Var));
    }

    public final synchronized void c(nky nkyVar) {
        v0 v0Var = nkyVar.f23703a;
        Class cls = (Class) v0Var.d;
        if (!((Map) v0Var.c).keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException("Given internalKeyMananger " + v0Var.toString() + " does not support primitive class " + cls.getName());
        }
        String strQ = v0Var.q();
        nky nkyVar2 = (nky) this.f25428a.get(strQ);
        if (nkyVar2 != null && !nkyVar2.f23703a.getClass().equals(nkyVar.f23703a.getClass())) {
            b.warning("Attempted overwrite of a registered key manager for key type ".concat(strQ));
            throw new GeneralSecurityException("typeUrl (" + strQ + ") is already registered with " + nkyVar2.f23703a.getClass().getName() + ", cannot be re-registered with " + nkyVar.f23703a.getClass().getName());
        }
        this.f25428a.putIfAbsent(strQ, nkyVar);
    }

    public oky() {
        this.f25428a = new ConcurrentHashMap();
    }
}
