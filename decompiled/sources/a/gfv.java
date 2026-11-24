package a;

import android.os.Build;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class gfv implements bg80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dfv f11224a;
    public final afv b;
    public final AndroidComposeView c;
    public Function2 d;
    public Function0 e;
    public boolean g;
    public float[] i;
    public boolean j;
    public int n;
    public x1x p;
    public boolean q;
    public boolean r;
    public boolean t;
    public long f = 9223372034707292159L;
    public final float[] h = ui30.a();
    public w6k k = hic.g();
    public k6z l = k6z.f17794a;
    public final a6a m = new a6a();
    public long o = ils0.b;
    public boolean s = true;
    public final t3t u = new t3t(this, 16);

    public gfv(dfv dfvVar, afv afvVar, AndroidComposeView androidComposeView, Function2 function2, Function0 function0) {
        this.f11224a = dfvVar;
        this.b = afvVar;
        this.c = androidComposeView;
        this.d = function2;
        this.e = function0;
    }

    public final float[] a() {
        float[] fArrA = this.i;
        if (fArrA == null) {
            fArrA = ui30.a();
            this.i = fArrA;
        }
        if (this.r) {
            this.r = false;
            float[] fArrB = b();
            if (this.s) {
                return fArrB;
            }
            if (!d7x.C(fArrB, fArrA)) {
                fArrA[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArrA[0])) {
            return null;
        }
        return fArrA;
    }

    public final float[] b() {
        boolean z = this.q;
        float[] fArr = this.h;
        if (z) {
            dfv dfvVar = this.f11224a;
            long jU = dfvVar.z;
            ffv ffvVar = dfvVar.f6018a;
            if ((9223372034707292159L & jU) == 9205357640488583168L) {
                jU = p7x.u(n2x.Q(this.f));
            }
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jU >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jU & 4294967295L));
            float fO = ffvVar.O();
            float fN = ffvVar.N();
            float fP = ffvVar.P();
            float fO2 = ffvVar.o();
            float fQ = ffvVar.q();
            float F = ffvVar.F();
            float fU = ffvVar.U();
            double d = ((double) fP) * 0.017453292519943295d;
            float fSin = (float) Math.sin(d);
            float fCos = (float) Math.cos(d);
            float f = -fSin;
            float f2 = (fN * fCos) - (0.0f * fSin);
            float f3 = (0.0f * fCos) + (fN * fSin);
            double d2 = ((double) fO2) * 0.017453292519943295d;
            float fSin2 = (float) Math.sin(d2);
            float fCos2 = (float) Math.cos(d2);
            float f4 = -fSin2;
            float f5 = fSin * fSin2;
            float f6 = fSin * fCos2;
            float f7 = fCos * fSin2;
            float f8 = fCos * fCos2;
            float f9 = (f3 * fSin2) + (fO * fCos2);
            float f10 = (f3 * fCos2) + ((-fO) * fSin2);
            double d3 = ((double) fQ) * 0.017453292519943295d;
            float fSin3 = (float) Math.sin(d3);
            float fCos3 = (float) Math.cos(d3);
            float f11 = -fSin3;
            float f12 = (fCos3 * f5) + (f11 * fCos2);
            float f13 = (f5 * fSin3) + (fCos2 * fCos3);
            float f14 = fSin3 * fCos;
            float f15 = f13 * F;
            float f16 = f14 * F;
            float f17 = ((fSin3 * f6) + (fCos3 * f4)) * F;
            float f18 = f12 * fU;
            float f19 = fCos * fCos3 * fU;
            float f20 = ((fCos3 * f6) + (f11 * f4)) * fU;
            float f21 = f7 * 1.0f;
            float f22 = f * 1.0f;
            float f23 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f15;
                fArr[1] = f16;
                fArr[2] = f17;
                fArr[3] = 0.0f;
                fArr[4] = f18;
                fArr[5] = f19;
                fArr[6] = f20;
                fArr[7] = 0.0f;
                fArr[8] = f21;
                fArr[9] = f22;
                fArr[10] = f23;
                fArr[11] = 0.0f;
                float f24 = -fIntBitsToFloat;
                fArr[12] = ((f15 * f24) - (fIntBitsToFloat2 * f18)) + f9 + fIntBitsToFloat;
                fArr[13] = ((f16 * f24) - (fIntBitsToFloat2 * f19)) + f2 + fIntBitsToFloat2;
                fArr[14] = ((f24 * f17) - (fIntBitsToFloat2 * f20)) + f10;
                fArr[15] = 1.0f;
            }
            this.q = false;
            this.s = a8k0.z(fArr);
        }
        return fArr;
    }

    public final void c() {
        if (this.j || this.g) {
            return;
        }
        this.c.invalidate();
        f(true);
    }

    public final void d(long j) {
        boolean zM = AndroidComposeView.m();
        AndroidComposeView androidComposeView = this.c;
        if (zM) {
            androidComposeView.N(-4.0f);
        }
        dfv dfvVar = this.f11224a;
        if (!ikx.b(dfvVar.t, j)) {
            dfvVar.t = j;
            dfvVar.f6018a.n((int) (j >> 32), (int) (j & 4294967295L), dfvVar.u);
        }
        if (Build.VERSION.SDK_INT < 26) {
            androidComposeView.invalidate();
            return;
        }
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }

    public final void e(long j) {
        if (qkx.a(j, this.f)) {
            return;
        }
        if (AndroidComposeView.m()) {
            this.c.N(-4.0f);
        }
        this.f = j;
        c();
    }

    public final void f(boolean z) {
        if (z != this.j) {
            this.j = z;
            AndroidComposeView androidComposeView = this.c;
            vy40 vy40Var = androidComposeView.A;
            boolean z2 = androidComposeView.f1;
            if (!z) {
                if (z2) {
                    return;
                }
                vy40Var.k(this);
                vy40 vy40Var2 = androidComposeView.B;
                if (vy40Var2 != null) {
                    vy40Var2.k(this);
                    return;
                }
                return;
            }
            if (!z2) {
                vy40Var.a(this);
                return;
            }
            vy40 vy40Var3 = androidComposeView.B;
            if (vy40Var3 == null) {
                vy40Var3 = new vy40();
                androidComposeView.B = vy40Var3;
            }
            vy40Var3.a(this);
        }
    }

    public final void g() {
        AndroidComposeView.m();
        if (this.j) {
            if (!ils0.a(this.o, ils0.b) && !qkx.a(this.f11224a.u, this.f)) {
                dfv dfvVar = this.f11224a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.o >> 32)) * ((int) (this.f >> 32));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.o & 4294967295L)) * ((int) (this.f & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
                if (!ne60.c(dfvVar.z, jFloatToRawIntBits)) {
                    dfvVar.z = jFloatToRawIntBits;
                    dfvVar.f6018a.M(jFloatToRawIntBits);
                }
            }
            this.f11224a.f(this.k, this.l, this.f, this.u);
            f(false);
        }
    }
}
