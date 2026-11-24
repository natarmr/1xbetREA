package a;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o6x0 implements g5x0, c7x0 {
    @Override // a.c7x0
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Object mo8a(atm0 atm0Var) throws GeneralSecurityException {
        f9x0 f9x0Var = new f9x0();
        if (esw0.b(2)) {
            return f9x0Var;
        }
        hny.o("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        return null;
    }

    @Override // a.g5x0
    public vkr0 a(atm0 atm0Var) {
        gfk0 gfk0Var = gfk0.h;
        vkr0 vkr0Var = ((o5x0) atm0Var).f24707a;
        o5x0.u(vkr0Var, gfk0Var);
        return vkr0Var;
    }
}
