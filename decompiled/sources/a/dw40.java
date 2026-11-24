package a;

/* JADX INFO: loaded from: classes.dex */
public final class dw40 implements w6k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a9q0 f6779a;
    public final /* synthetic */ ew40 b;

    public dw40(ew40 ew40Var) {
        this.b = ew40Var;
    }

    @Override // a.w6k
    public final float X(long j) {
        if (!daq0.d(j)) {
            return getDensity() * s(j);
        }
        ew40 ew40Var = this.b;
        if (daq0.d(ew40Var.l.f42262a.b)) {
            jf4.n("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is Em\nDeclare the composable's style.fontSize with Sp units instead.");
            return 0.0f;
        }
        if (daq0.a(ew40Var.l.f42262a.b, daq0.c)) {
            jf4.n("InternalAutoSize -> toPx(): Cannot convert Em to Px when style.fontSize is not set. Please specify a font size.");
            return 0.0f;
        }
        return daq0.c(j) * X(ew40Var.l.f42262a.b);
    }

    public final a9q0 a(long j, long j2) {
        long jH;
        ew40 ew40Var = this.b;
        y9q0 y9q0Var = ew40Var.l;
        long jA = daq0.d(j2) ? fw40.a(ew40Var.l.f42262a.b, j2) : j2;
        if (!daq0.a(jA, ew40Var.l.f42262a.b)) {
            ew40Var.f(y9q0.a(ew40Var.l, 0L, jA, null, null, null, 0L, null, null, 0, 0, 0L, null, null, 16777213));
        }
        if (ew40Var.f > 1) {
            k6z k6zVar = ew40Var.n;
            k6zVar.getClass();
            jH = ew40Var.h(j, k6zVar);
        } else {
            jH = j;
        }
        k6z k6zVar2 = ew40Var.n;
        k6zVar2.getClass();
        bw40 bw40VarB = ew40Var.b(jH, k6zVar2);
        k6z k6zVar3 = ew40Var.n;
        k6zVar3.getClass();
        a9q0 a9q0VarG = ew40Var.g(k6zVar3, jH, bw40VarB);
        this.f6779a = a9q0VarG;
        ew40Var.f(y9q0Var);
        return a9q0VarG;
    }

    @Override // a.w6k
    public final float getDensity() {
        w6k w6kVar = this.b.k;
        w6kVar.getClass();
        return w6kVar.getDensity();
    }

    @Override // a.w6k
    public final float v0() {
        w6k w6kVar = this.b.k;
        w6kVar.getClass();
        return w6kVar.v0();
    }
}
