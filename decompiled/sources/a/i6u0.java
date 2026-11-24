package a;

/* JADX INFO: loaded from: classes.dex */
public final class i6u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14261a;
    public final h6u0 b;
    public final int c;
    public final zaj[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public i6u0(boolean z, h6u0 h6u0Var) {
        int i;
        this.f14261a = z;
        this.b = h6u0Var;
        if (z && h6u0Var.equals(h6u0.f12546a)) {
            jf4.n("Lsq2 not (yet) supported for differential axes");
            throw null;
        }
        int iOrdinal = h6u0Var.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                throw null;
            }
            i = 2;
        }
        this.c = i;
        this.d = new zaj[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        zaj[] zajVarArr = this.d;
        zaj zajVar = zajVarArr[i];
        if (zajVar != null) {
            zajVar.f44071a = j;
            zajVar.b = f;
        } else {
            zaj zajVar2 = new zaj();
            zajVar2.f44071a = j;
            zajVar2.b = f;
            zajVarArr[i] = zajVar2;
        }
    }

    public final float b() {
        boolean z;
        h6u0 h6u0Var;
        float[] fArr;
        int i;
        float[] fArr2;
        int i2;
        float f;
        float f2;
        float fSignum;
        int i3 = this.e;
        zaj[] zajVarArr = this.d;
        zaj zajVar = zajVarArr[i3];
        if (zajVar == null) {
            return 0.0f;
        }
        int i4 = 0;
        zaj zajVar2 = zajVar;
        do {
            zaj zajVar3 = zajVarArr[i3];
            z = this.f14261a;
            h6u0Var = this.b;
            float[] fArr3 = this.f;
            fArr = this.g;
            if (zajVar3 == null) {
                i = i4;
                fArr2 = fArr3;
                i2 = 1;
                f = 0.0f;
            } else {
                long j = zajVar.f44071a;
                i = i4;
                f = 0.0f;
                long j2 = zajVar3.f44071a;
                float f3 = j - j2;
                fArr2 = fArr3;
                i2 = 1;
                float fAbs = Math.abs(j2 - zajVar2.f44071a);
                zajVar2 = (h6u0Var == h6u0.f12546a || z) ? zajVar3 : zajVar;
                if (f3 <= 100.0f && fAbs <= 40.0f) {
                    fArr2[i] = zajVar3.b;
                    fArr[i] = -f3;
                    if (i3 == 0) {
                        i3 = 20;
                    }
                    i3--;
                    i4 = i + 1;
                }
            }
            i4 = i;
            break;
        } while (i4 < 20);
        if (i4 < this.c) {
            return f;
        }
        int iOrdinal = h6u0Var.ordinal();
        if (iOrdinal == 0) {
            try {
                float[] fArr4 = this.h;
                dqm0.x(fArr, fArr2, i4, fArr4);
                f2 = fArr4[1];
            } catch (IllegalArgumentException unused) {
                f2 = f;
            }
            fSignum = f2;
        } else {
            if (iOrdinal != i2) {
                t9f.b();
                return f;
            }
            int i5 = i4 - i2;
            float f4 = fArr[i5];
            int i6 = i5;
            float f5 = f;
            while (i6 > 0) {
                int i7 = i6 - 1;
                float f6 = fArr[i7];
                if (f4 != f6) {
                    float f7 = (z ? -fArr2[i7] : fArr2[i6] - fArr2[i7]) / (f4 - f6);
                    float fAbs2 = (Math.abs(f7) * (f7 - (Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f))))) + f5;
                    if (i6 == i5) {
                        fAbs2 *= 0.5f;
                    }
                    f5 = fAbs2;
                }
                i6--;
                f4 = f6;
            }
            fSignum = Math.signum(f5) * ((float) Math.sqrt(Math.abs(f5) * 2.0f));
        }
        return fSignum * 1000.0f;
    }

    public final float c(float f) {
        if (f <= 0.0f) {
            xcx.b("maximumVelocity should be a positive value. You specified=" + f);
        }
        float fB = b();
        if (fB == 0.0f || Float.isNaN(fB)) {
            return 0.0f;
        }
        if (fB <= 0.0f) {
            float f2 = -f;
            if (fB < f2) {
                return f2;
            }
        } else if (fB > f) {
            return f;
        }
        return fB;
    }

    public /* synthetic */ i6u0() {
        this(false, h6u0.f12546a);
    }

    public i6u0(boolean z) {
        this(z, h6u0.b);
    }
}
