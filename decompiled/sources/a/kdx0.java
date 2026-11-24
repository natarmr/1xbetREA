package a;

import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class kdx0 extends icx0 {
    public static final kdx0 g;
    public final sdx0 f;

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        g = new kdx0("<skip trace>", uuidRandomUUID, icx0.a(uuidRandomUUID), rdx0.e, wcx0.c());
    }

    public kdx0(String str, UUID uuid, String str2, sdx0 sdx0Var, bex0 bex0Var) {
        super(str, uuid, str2, bex0Var);
        x0x.A(sdx0Var.c);
        this.f = sdx0Var;
    }

    @Override // a.icx0
    public final sdx0 c() {
        sdx0 sdx0Var = rdx0.e;
        sdx0 sdx0Var2 = this.f;
        sdx0Var2.getClass();
        sdx0 sdx0Var3 = rdx0.e;
        if (sdx0Var2 == sdx0Var3) {
            return sdx0Var;
        }
        sdx0Var.getClass();
        if (sdx0Var == sdx0Var3) {
            return sdx0Var2;
        }
        f4x<sdx0> f4xVarL = f4x.l(2, sdx0Var2, sdx0Var);
        if (f4xVarL.isEmpty()) {
            return sdx0Var3;
        }
        if (f4xVarL.size() == 1) {
            return (sdx0) f4xVarL.iterator().next();
        }
        int i = 0;
        for (sdx0 sdx0Var4 : f4xVarL) {
            do {
                i += sdx0Var4.b.c;
                sdx0Var4 = sdx0Var4.f32053a;
            } while (sdx0Var4 != null);
        }
        if (i == 0) {
            return rdx0.e;
        }
        nuj0 nuj0Var = new nuj0(i);
        for (sdx0 sdx0Var5 : f4xVarL) {
            do {
                int i2 = 0;
                while (true) {
                    nuj0 nuj0Var2 = sdx0Var5.b;
                    if (i2 >= nuj0Var2.c) {
                        break;
                    }
                    x0x.y("Duplicate bindings: %s", nuj0Var2.f(i2), nuj0Var.put((pdx0) nuj0Var2.f(i2), nuj0Var2.j(i2)) == null);
                    i2++;
                }
                sdx0Var5 = sdx0Var5.f32053a;
            } while (sdx0Var5 != null);
        }
        return new rdx0(null, nuj0Var).a();
    }
}
