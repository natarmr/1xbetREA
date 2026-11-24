package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class q9x0 extends atm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o9x0 f28371a;
    public final rkt0 b;

    public q9x0(o9x0 o9x0Var, rkt0 rkt0Var) {
        this.f28371a = o9x0Var;
        this.b = rkt0Var;
    }

    public static q9x0 u(o9x0 o9x0Var, rkt0 rkt0Var) throws GeneralSecurityException {
        if (o9x0Var.f24902a == ((icw0) rkt0Var.b).f14556a.length) {
            return new q9x0(o9x0Var, rkt0Var);
        }
        hny.o("Key size mismatch");
        return null;
    }

    @Override // a.atm0
    public final fpw0 s() {
        return this.f28371a;
    }
}
