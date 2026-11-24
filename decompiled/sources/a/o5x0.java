package a;

/* JADX INFO: loaded from: classes2.dex */
public final class o5x0 extends atm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vkr0 f24707a;

    public o5x0(vkr0 vkr0Var, gfk0 gfk0Var) {
        u(vkr0Var, gfk0Var);
        this.f24707a = vkr0Var;
    }

    public static void u(vkr0 vkr0Var, gfk0 gfk0Var) {
        hbb hbbVar = (hbb) vkr0Var.d;
        if (hbbVar == hbb.j || hbbVar == hbb.k) {
            gfk0.n(gfk0Var);
        }
    }

    @Override // a.atm0
    public final fpw0 s() {
        vkr0 vkr0Var = this.f24707a;
        return new m5x0((String) vkr0Var.b, (lpw0) vkr0Var.e);
    }

    @Override // a.atm0
    public final Integer t() {
        return (Integer) this.f24707a.f;
    }

    public final icw0 v() {
        vkr0 vkr0Var = this.f24707a;
        lpw0 lpw0Var = (lpw0) vkr0Var.e;
        Integer num = (Integer) vkr0Var.f;
        if (lpw0Var.equals(lpw0.e)) {
            return icw0.a(new byte[0]);
        }
        if (lpw0Var.equals(lpw0.c)) {
            return q6x0.b(num.intValue());
        }
        if (lpw0Var == lpw0.d || lpw0Var == lpw0.f) {
            return q6x0.a(num.intValue());
        }
        hny.o("Unknown output prefix type");
        return null;
    }
}
