package a;

/* JADX INFO: loaded from: classes.dex */
public final class cvj implements pj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5031a;
    public final pj30 b;
    public final Enum c;
    public final Enum d;

    public /* synthetic */ cvj(pj30 pj30Var, Enum r2, Enum r3, byte b) {
        this.f5031a = b;
        this.b = pj30Var;
        this.c = r2;
        this.d = r3;
    }

    @Override // a.pj30
    public final int D(int i) {
        switch (this.f5031a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b.D(i);
    }

    @Override // a.pj30
    public final int L(int i) {
        switch (this.f5031a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b.L(i);
    }

    @Override // a.pj30
    public final int P(int i) {
        switch (this.f5031a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b.P(i);
    }

    @Override // a.pj30
    public final pu90 S(long j) {
        byte b = this.f5031a;
        Enum r1 = this.c;
        Enum r2 = this.d;
        pj30 pj30Var = this.b;
        switch (b) {
            case 0:
                dnx dnxVar = (dnx) r1;
                if (((hnx) r2) == hnx.f13367a) {
                    return new qiq(dnxVar == dnx.b ? pj30Var.P(p4e.h(j)) : pj30Var.L(p4e.h(j)), p4e.d(j) ? p4e.h(j) : 32767, (byte) 0);
                }
                return new qiq(p4e.e(j) ? p4e.i(j) : 32767, dnxVar == dnx.b ? pj30Var.b(p4e.i(j)) : pj30Var.D(p4e.i(j)), (byte) 0);
            case 1:
                ck30 ck30Var = (ck30) r1;
                if (((dk30) r2) == dk30.f6214a) {
                    return new qiq(ck30Var == ck30.b ? pj30Var.P(p4e.h(j)) : pj30Var.L(p4e.h(j)), p4e.d(j) ? p4e.h(j) : 32767, (byte) 1);
                }
                return new qiq(p4e.e(j) ? p4e.i(j) : 32767, ck30Var == ck30.b ? pj30Var.b(p4e.i(j)) : pj30Var.D(p4e.i(j)), (byte) 1);
            default:
                v460 v460Var = (v460) r1;
                if (((w460) r2) == w460.f38530a) {
                    return new qiq(v460Var == v460.b ? pj30Var.P(p4e.h(j)) : pj30Var.L(p4e.h(j)), p4e.d(j) ? p4e.h(j) : 32767, (byte) 2);
                }
                return new qiq(p4e.e(j) ? p4e.i(j) : 32767, v460Var == v460.b ? pj30Var.b(p4e.i(j)) : pj30Var.D(p4e.i(j)), (byte) 2);
        }
    }

    @Override // a.pj30
    public final int b(int i) {
        switch (this.f5031a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b.b(i);
    }

    @Override // a.pj30
    public final Object n() {
        switch (this.f5031a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b.n();
    }
}
