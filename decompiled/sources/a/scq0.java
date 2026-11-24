package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class scq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32000a;
    public final lm40 b;
    public final Function1 c;
    public scq0 d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ vn00 h;

    public scq0(vn00 vn00Var, int i, lm40 lm40Var, Function1 function1) {
        this.h = vn00Var;
        this.f32000a = i;
        this.b = lm40Var;
        this.c = function1;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        bff0 bff0Var;
        bff0 bff0Var2;
        long j5 = this.h.d;
        lm40 lm40Var = this.b;
        s460 s460VarX = vcc.X(lm40Var, 2);
        e7z e7zVarZ = vcc.Z(lm40Var);
        boolean zJ = e7zVarZ.J();
        tzi tziVar = e7zVarZ.h1;
        if (zJ) {
            if (((s460) tziVar.e) != s460VarX) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = s460VarX.c;
                s460 s460Var = (s460) tziVar.e;
                s460Var.getClass();
                long J = x1x.J(s460Var.F(s460VarX, jFloatToRawIntBits));
                bff0Var = new bff0(J, (4294967295L & ((long) (((int) (J & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (J >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, lm40Var);
            } else {
                bff0Var = new bff0(j, j2, j3, j4, j5, fArr, lm40Var);
            }
            bff0Var2 = bff0Var;
        } else {
            bff0Var2 = null;
        }
        if (bff0Var2 == null) {
            return;
        }
        this.c.invoke(bff0Var2);
    }

    public final void b() {
        vn00 vn00Var = this.h;
        ey40 ey40Var = (ey40) vn00Var.e;
        int i = this.f32000a;
        scq0 scq0Var = (scq0) ey40Var.h(i);
        if (scq0Var != null) {
            if (scq0Var == this) {
                scq0 scq0Var2 = this.d;
                this.d = null;
                if (scq0Var2 != null) {
                    ey40Var.g(i, scq0Var2);
                    return;
                }
                e7z e7zVarZ = vcc.Z(this.b.f20279a);
                if (e7zVarZ.I()) {
                    oge0 rectManager = h7z.a(e7zVarZ).getRectManager();
                    rectManager.getClass();
                    if (e7zVarZ.g != -4) {
                        zz2 zz2Var = rectManager.c;
                        int iD = rectManager.d(e7zVarZ);
                        long[] jArr = (long[]) zz2Var.b;
                        int i2 = iD + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
            ey40Var.g(i, scq0Var);
            while (true) {
                scq0 scq0Var3 = scq0Var.d;
                if (scq0Var3 == null) {
                    break;
                }
                if (scq0Var3 == this) {
                    scq0Var.d = this.d;
                    this.d = null;
                    return;
                }
                scq0Var = scq0Var3;
            }
        }
        scq0 scq0Var4 = (scq0) vn00Var.f;
        if (scq0Var4 == this) {
            vn00Var.f = scq0Var4.d;
            this.d = null;
            return;
        }
        scq0 scq0Var5 = scq0Var4 != null ? scq0Var4.d : null;
        while (true) {
            scq0 scq0Var6 = scq0Var4;
            scq0Var4 = scq0Var5;
            if (scq0Var4 == null) {
                return;
            }
            if (scq0Var4 == this) {
                if (scq0Var6 != null) {
                    scq0Var6.d = scq0Var4.d;
                }
                this.d = null;
                return;
            }
            scq0Var5 = scq0Var4.d;
        }
    }
}
