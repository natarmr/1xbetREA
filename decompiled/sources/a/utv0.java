package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class utv0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36275a;
    public final /* synthetic */ buv0 b;

    public /* synthetic */ utv0(buv0 buv0Var, byte b) {
        this.f36275a = b;
        this.b = buv0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        float f;
        float f2;
        float fA;
        Integer num;
        byte b = this.f36275a;
        int iIntValue = 0;
        z = false;
        boolean z = false;
        buv0 buv0Var = this.b;
        switch (b) {
            case 0:
                float fFloatValue = ((Number) buv0Var.j.d()).floatValue();
                cuv0 cuv0Var = buv0Var.k;
                int size = cuv0Var.f5004a.size();
                float f3 = 0.0f;
                if (size == 0) {
                    return new osv0(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float fB = size > 1 ? twn.b(size, 1, 60, 220) : 220;
                float f4 = 60.0f / fB;
                float f5 = 220.0f / fB;
                float f6 = 0.0f;
                float f7 = 0.0f;
                float f8 = 0.0f;
                float f9 = 0.0f;
                for (Object obj : cuv0Var.f5004a) {
                    int i = iIntValue + 1;
                    if (iIntValue < 0) {
                        q3d.p();
                        throw null;
                    }
                    tsv0 tsv0Var = (tsv0) obj;
                    if (tsv0Var == tsv0.d && (num = cuv0Var.b) != null) {
                        iIntValue = num.intValue();
                    }
                    float fW0 = buv0Var.c.a().w0(buv0.n);
                    float f10 = iIntValue * f4;
                    float f11 = f10 + f5;
                    float f12 = f3;
                    if (f11 > 1.0f) {
                        f11 = 1.0f;
                    }
                    float f13 = f11 - f10;
                    if (f13 <= f12) {
                        fA = 1.0f;
                        f = f12;
                        f2 = 1.0f;
                    } else {
                        float f14 = (fFloatValue - f10) / f13;
                        f = f12;
                        f2 = 1.0f;
                        fA = buv0.m.a(l1e0.c(f14, f, 1.0f));
                    }
                    float f15 = (f2 - fA) * fW0;
                    int iOrdinal = tsv0Var.ordinal();
                    if (iOrdinal == 0) {
                        f6 = f15;
                    } else if (iOrdinal == 1) {
                        f7 = f15;
                    } else if (iOrdinal == 2) {
                        f8 = f15;
                    } else {
                        if (iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        f9 = f15;
                    }
                    iIntValue = i;
                    f3 = f;
                }
                return new osv0(f6, f7, f8, f9);
            case 1:
                return Boolean.valueOf(buv0Var.f3254a.b());
            default:
                if (((t33) buv0Var.b.c).e() && !((Boolean) ((hgk0) buv0Var.i).getValue()).booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
