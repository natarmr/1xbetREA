package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class xrg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41369a;
    public final float b;
    public float c;
    public float d;
    public boolean e = false;

    public xrg0(float f, float f2, float f3, float f4) {
        this.c = 0.0f;
        this.d = 0.0f;
        this.f41369a = f;
        this.b = f2;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            this.c = (float) (((double) f3) / dSqrt);
            this.d = (float) (((double) f4) / dSqrt);
        }
    }

    public final void a(float f, float f2) {
        float f3 = f - this.f41369a;
        float f4 = f2 - this.b;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            f3 = (float) (((double) f3) / dSqrt);
            f4 = (float) (((double) f4) / dSqrt);
        }
        float f5 = this.c;
        if (f3 != (-f5) || f4 != (-this.d)) {
            this.c = f5 + f3;
            this.d += f4;
        } else {
            this.e = true;
            this.c = -f4;
            this.d = f3;
        }
    }

    public final void b(xrg0 xrg0Var) {
        float f = xrg0Var.c;
        float f2 = this.c;
        if (f == (-f2)) {
            float f3 = xrg0Var.d;
            if (f3 == (-this.d)) {
                this.e = true;
                this.c = -f3;
                this.d = xrg0Var.c;
                return;
            }
        }
        this.c = f2 + f;
        this.d += xrg0Var.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Separators.LPAREN);
        sb.append(this.f41369a);
        sb.append(Separators.COMMA);
        sb.append(this.b);
        sb.append(Separators.SP);
        sb.append(this.c);
        sb.append(Separators.COMMA);
        return kng0.o(sb, this.d, Separators.RPAREN);
    }
}
