package a;

import android.graphics.BlurMaskFilter;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class pil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1x f27048a;
    public w03 b;
    public m78 c;
    public long d;
    public long e;
    public long f;
    public k6z g;
    public float h;
    public final kjj0 i;
    public final ucs0 j;
    public vz2 k;

    public pil(kjj0 kjj0Var, x1x x1xVar) {
        this.f27048a = x1xVar;
        int i = y3d.h;
        this.d = y3d.g;
        this.e = 0L;
        this.f = 9205357640488583168L;
        this.g = k6z.f17794a;
        this.h = 1.0f;
        this.i = kjj0Var;
        this.j = saj.D();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057  */
    public final void a(fhl fhlVar, a4d a4dVar, long j, long j2, float f, int i) {
        a4d a4dVar2;
        char c;
        float f2;
        long j3;
        vz2 vz2VarC;
        x1x x1xVar = this.f27048a;
        if (x1xVar instanceof ne80) {
            this.b = ((ne80) x1xVar).f23373a;
            this.e = 0L;
        } else if (x1xVar instanceof pe80) {
            pe80 pe80Var = (pe80) x1xVar;
            wfg0 wfg0Var = pe80Var.f26840a;
            if (r8x.S(wfg0Var)) {
                this.b = null;
                this.e = wfg0Var.e;
            } else {
                this.b = pe80Var.b;
                this.e = 0L;
            }
        } else if (!(x1xVar instanceof oe80)) {
            t9f.b();
            return;
        } else {
            this.b = null;
            this.e = 0L;
        }
        if (a4dVar != null) {
            a4dVar2 = a4dVar;
        } else if (j2 != 16) {
            m78 m78Var = this.c;
            if (m78Var != null) {
                long j4 = this.d;
                int i2 = y3d.h;
                if (!h2t0.a(j4, j2)) {
                    m78Var = new m78(j2, 5);
                    this.d = j2;
                    this.c = m78Var;
                }
            } else {
                m78Var = new m78(j2, 5);
                this.d = j2;
                this.c = m78Var;
            }
            a4dVar2 = m78Var;
        } else {
            a4dVar2 = null;
        }
        long j5 = this.f;
        if (j5 != 9205357640488583168L && h7k0.b(j5, j) && this.g == fhlVar.getLayoutDirection() && this.h == fhlVar.getDensity()) {
            f2 = 0.0f;
            c = ' ';
            j3 = 4294967295L;
        } else {
            long j6 = this.e;
            w03 w03Var = this.b;
            float fW0 = fhlVar.w0(this.i.f18389a);
            float fW1 = fhlVar.w0(0.0f);
            c = ' ';
            ucs0 ucs0Var = this.j;
            if (w03Var != null) {
                float f3 = fW1 * 2.0f;
                float f4 = (fW0 * 2.0f) + f3;
                j3 = 4294967295L;
                f2 = 0.0f;
                vz2VarC = azw.c((int) Math.ceil(Float.intBitsToFloat((int) (j >> 32)) + f4), (int) Math.ceil(Float.intBitsToFloat((int) (j & 4294967295L)) + f4), 1);
                uw2 uw2VarA = vw2.a(vz2VarC);
                if (fW1 > 0.0f) {
                    float f5 = fW0 + fW1;
                    uw2VarA.g(f5, f5);
                    j47.u0(ucs0Var, fW0 > 0.0f ? new BlurMaskFilter(fW0, BlurMaskFilter.Blur.NORMAL) : null, 11);
                    uw2VarA.p(w03Var, ucs0Var);
                    j47.u0(ucs0Var, fW0 > 0.0f ? new BlurMaskFilter(fW0, BlurMaskFilter.Blur.NORMAL) : null, 3);
                    ucs0Var.z(f3);
                    uw2VarA.p(w03Var, ucs0Var);
                } else {
                    j47.u0(ucs0Var, fW0 > 0.0f ? new BlurMaskFilter(fW0, BlurMaskFilter.Blur.NORMAL) : null, 11);
                    uw2VarA.g(fW0, fW0);
                    uw2VarA.p(w03Var, ucs0Var);
                }
            } else {
                f2 = 0.0f;
                j3 = 4294967295L;
                float f6 = (fW1 * 2.0f) + (fW0 * 2.0f);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + f6;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) + f6;
                vz2 vz2VarC2 = azw.c((int) Math.ceil(fIntBitsToFloat), (int) Math.ceil(fIntBitsToFloat2), 1);
                uw2 uw2VarA2 = vw2.a(vz2VarC2);
                float f7 = fIntBitsToFloat - fW0;
                float f8 = fIntBitsToFloat2 - fW0;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j6 >> 32));
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j6 & 4294967295L));
                j47.u0(ucs0Var, fW0 > 0.0f ? new BlurMaskFilter(fW0, BlurMaskFilter.Blur.NORMAL) : null, 11);
                uw2VarA2.f36374a.drawRoundRect(fW0, fW0, f7, f8, fIntBitsToFloat3, fIntBitsToFloat4, (Paint) ucs0Var.c);
                vz2VarC = vz2VarC2;
            }
            this.k = vz2VarC;
            this.f = j;
            this.g = fhlVar.getLayoutDirection();
            this.h = fhlVar.getDensity();
        }
        vz2 vz2Var = this.k;
        if (vz2Var != null) {
            float f9 = -(fhlVar.w0(f2) + fhlVar.w0(this.i.f18389a));
            fhl.m0(fhlVar, vz2Var, (((long) Float.floatToRawIntBits(f9)) << c) | (((long) Float.floatToRawIntBits(f9)) & j3), f, a4dVar2, i, 8);
        }
    }
}
