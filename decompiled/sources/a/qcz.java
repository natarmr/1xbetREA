package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qcz implements ffk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28508a = 0;
    public final /* synthetic */ bch0 b;
    public final /* synthetic */ Object c;

    public qcz(xk80 xk80Var, ngz ngzVar, sk80 sk80Var) {
        this.b = xk80Var;
        this.c = ngzVar;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0190  */
    @Override // a.ffk0
    public final float a(float f) {
        byte b = this.f28508a;
        Object obj = this.c;
        bch0 bch0Var = this.b;
        switch (b) {
            case 0:
                xcz xczVar = (xcz) bch0Var;
                List list = xczVar.j().l;
                ifk0 ifk0Var = (ifk0) obj;
                int size = list.size();
                float f2 = Float.NEGATIVE_INFINITY;
                float f3 = Float.POSITIVE_INFINITY;
                for (int i = 0; i < size; i++) {
                    ncz nczVar = (ncz) list.get(i);
                    ncz nczVar2 = nczVar != null ? nczVar : null;
                    if (nczVar2 == null || !nczVar2.w) {
                        int iL = vdx.L(xczVar.j());
                        int i2 = -xczVar.j().m;
                        int i3 = xczVar.j().r;
                        int i4 = nczVar.q;
                        int i5 = nczVar.p;
                        int i6 = xczVar.j().o;
                        float fA = i5 - ifk0Var.a(iL, i4, i2, i3);
                        if (fA <= 0.0f && fA > f2) {
                            f2 = fA;
                        }
                        if (fA >= 0.0f && fA < f3) {
                            f3 = fA;
                        }
                    }
                }
                char c = Math.abs(f) < ((mcz) ((hgk0) xczVar.f).getValue()).i.w0(400.0f) ? (char) 0 : f > 0.0f ? (char) 1 : (char) 2;
                if (c == 0) {
                    if (Math.abs(f3) <= Math.abs(f2)) {
                        f2 = f3;
                    }
                } else if (c == 1) {
                    f2 = f3;
                } else if (c != 2) {
                    f2 = 0.0f;
                }
                if (f2 == Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) {
                    return 0.0f;
                }
                return f2;
            default:
                xk80 xk80Var = (xk80) bch0Var;
                ifk0 ifk0Var2 = xk80Var.m().n;
                List list2 = xk80Var.m().f27124a;
                int size2 = list2.size();
                float f4 = Float.NEGATIVE_INFINITY;
                float f5 = Float.POSITIVE_INFINITY;
                for (int i7 = 0; i7 < size2; i7++) {
                    wj30 wj30Var = (wj30) list2.get(i7);
                    int iC = n6x.C(xk80Var.m());
                    int i8 = -xk80Var.m().f;
                    int i9 = xk80Var.m().d;
                    int i10 = xk80Var.m().b;
                    int i11 = wj30Var.j;
                    xk80Var.n();
                    float fA2 = i11 - ifk0Var2.a(iC, i10, i8, i9);
                    if (fA2 <= 0.0f && fA2 > f4) {
                        f4 = fA2;
                    }
                    if (fA2 >= 0.0f && fA2 < f5) {
                        f5 = fA2;
                    }
                }
                if (f4 == Float.NEGATIVE_INFINITY) {
                    f4 = f5;
                }
                if (f5 == Float.POSITIVE_INFINITY) {
                    f5 = f4;
                }
                if (!xk80Var.d()) {
                    if (l7x.N(xk80Var, f)) {
                        f4 = 0.0f;
                        f5 = 0.0f;
                    } else {
                        f5 = 0.0f;
                    }
                }
                if (!xk80Var.c()) {
                    f4 = 0.0f;
                    if (!l7x.N(xk80Var, f)) {
                        f5 = 0.0f;
                    }
                }
                Float fValueOf = Float.valueOf(f4);
                Float fValueOf2 = Float.valueOf(f5);
                float fFloatValue = fValueOf.floatValue();
                float fFloatValue2 = fValueOf2.floatValue();
                float fFloatValue3 = ((Number) ((ngz) obj).F(Float.valueOf(f), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2))).floatValue();
                if (fFloatValue3 != fFloatValue && fFloatValue3 != fFloatValue2 && fFloatValue3 != 0.0f) {
                    adx.c("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0");
                }
                if (fFloatValue3 == Float.POSITIVE_INFINITY || fFloatValue3 == Float.NEGATIVE_INFINITY) {
                    return 0.0f;
                }
                return fFloatValue3;
        }
    }

    @Override // a.ffk0
    public final float b(float f, float f2) {
        byte b = this.f28508a;
        bch0 bch0Var = this.b;
        int i = 0;
        switch (b) {
            case 0:
                float fAbs = Math.abs(f2);
                List list = ((xcz) bch0Var).j().l;
                if (!list.isEmpty()) {
                    int size = list.size();
                    int size2 = list.size();
                    int i2 = 0;
                    while (i < size2) {
                        i2 += ((ncz) list.get(i)).q;
                        i++;
                    }
                    i = i2 / size;
                }
                float f3 = fAbs - i;
                return Math.signum(f2) * (f3 >= 0.0f ? f3 : 0.0f);
            default:
                xk80 xk80Var = (xk80) bch0Var;
                int iO = xk80Var.o();
                pz40 pz40Var = xk80Var.m;
                int i3 = ((pk80) ((hgk0) pz40Var).getValue()).c + iO;
                if (i3 == 0) {
                    return 0.0f;
                }
                int i4 = xk80Var.e;
                if (f < 0.0f) {
                    i4++;
                }
                int iD = l1e0.d(((int) (f2 / i3)) + i4, 0, xk80Var.n());
                xk80Var.o();
                int i5 = ((pk80) ((hgk0) pz40Var).getValue()).c;
                long j = i4;
                long j2 = j - 1;
                if (j2 < 0) {
                    j2 = 0;
                }
                int i6 = (int) j2;
                long j3 = j + 1;
                if (j3 > 2147483647L) {
                    j3 = 2147483647L;
                }
                int iAbs = Math.abs((l1e0.d(l1e0.d(iD, i6, (int) j3), 0, xk80Var.n()) - i4) * i3) - i3;
                i = iAbs >= 0 ? iAbs : 0;
                if (i == 0) {
                    return i;
                }
                return Math.signum(f) * i;
        }
    }

    public qcz(xcz xczVar, ifk0 ifk0Var) {
        this.b = xczVar;
        this.c = ifk0Var;
    }
}
