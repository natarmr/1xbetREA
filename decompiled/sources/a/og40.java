package a;

/* JADX INFO: loaded from: classes.dex */
public final class og40 {
    public static og40 h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k6z f25199a;
    public final y9q0 b;
    public final z6k c;
    public final mrq d;
    public final y9q0 e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public og40(k6z k6zVar, y9q0 y9q0Var, z6k z6kVar, mrq mrqVar) {
        this.f25199a = k6zVar;
        this.b = y9q0Var;
        this.c = z6kVar;
        this.d = mrqVar;
        this.e = afn0.A(y9q0Var, k6zVar);
    }

    public final long a(int i, long j) {
        int iJ;
        float f = this.g;
        float f2 = this.f;
        int i2 = 1;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = pg40.f26937a;
            iun iunVar = iun.f15405a;
            y9q0 y9q0Var = this.e;
            mrq mrqVar = this.d;
            z6k z6kVar = this.c;
            s03 s03Var = new s03(new v03(str, y9q0Var, iunVar, iunVar, mrqVar, z6kVar, false), 1, 1, r4e.b(0, 0, 0, 0, 15));
            i2 = 1;
            float f3 = new s03(new v03(pg40.b, y9q0Var, iunVar, iunVar, this.d, z6kVar, true), 2, 1, r4e.b(0, 0, 0, 0, 15)).f;
            float f4 = s03Var.f;
            float f5 = f3 - f4;
            this.g = f4;
            this.f = f5;
            f2 = f5;
            f = f4;
        }
        if (i != i2) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            iJ = iRound >= 0 ? iRound : 0;
            int iH = p4e.h(j);
            if (iJ > iH) {
                iJ = iH;
            }
        } else {
            iJ = p4e.j(j);
        }
        return r4e.a(p4e.k(j), p4e.i(j), iJ, p4e.h(j));
    }
}
