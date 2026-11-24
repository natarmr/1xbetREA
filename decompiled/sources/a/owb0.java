package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class owb0 extends kx3 {
    public ukk0[] f;
    public ukk0[] g;
    public int h;
    public dq00 i;

    @Override // a.kx3
    public final ukk0 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            ukk0[] ukk0VarArr = this.f;
            ukk0 ukk0Var = ukk0VarArr[i2];
            if (!zArr[ukk0Var.b]) {
                dq00 dq00Var = this.i;
                dq00Var.b = ukk0Var;
                int i3 = 8;
                if (i != -1) {
                    ukk0 ukk0Var2 = ukk0VarArr[i];
                    while (i3 >= 0) {
                        float f = ukk0Var2.h[i3];
                        float f2 = ((ukk0) dq00Var.b).h[i3];
                        if (f2 != f) {
                            if (f2 >= f) {
                                break;
                            }
                            i = i2;
                            break;
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (i3 >= 0) {
                        float f3 = ((ukk0) dq00Var.b).h[i3];
                        if (f3 > 0.0f) {
                            break;
                        }
                        if (f3 < 0.0f) {
                            i = i2;
                            break;
                        }
                        i3--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // a.kx3
    public final boolean e() {
        return this.h == 0;
    }

    @Override // a.kx3
    public final void i(p900 p900Var, kx3 kx3Var, boolean z) {
        ukk0 ukk0Var = kx3Var.f19033a;
        if (ukk0Var == null) {
            return;
        }
        float[] fArr = ukk0Var.h;
        yw3 yw3Var = kx3Var.d;
        int iD = yw3Var.d();
        for (int i = 0; i < iD; i++) {
            ukk0 ukk0VarE = yw3Var.e(i);
            float f = yw3Var.f(i);
            dq00 dq00Var = this.i;
            dq00Var.b = ukk0VarE;
            if (ukk0VarE.f35831a) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((ukk0) dq00Var.b).h;
                    float f2 = (fArr[i2] * f) + fArr2[i2];
                    fArr2[i2] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        ((ukk0) dq00Var.b).h[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((owb0) dq00Var.c).k((ukk0) dq00Var.b);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = fArr[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        ((ukk0) dq00Var.b).h[i3] = f4;
                    } else {
                        ((ukk0) dq00Var.b).h[i3] = 0.0f;
                    }
                }
                j(ukk0VarE);
            }
            this.b = (kx3Var.b * f) + this.b;
        }
        k(ukk0Var);
    }

    public final void j(ukk0 ukk0Var) {
        int i;
        ukk0[] ukk0VarArr;
        int i2 = this.h + 1;
        ukk0[] ukk0VarArr2 = this.f;
        if (i2 > ukk0VarArr2.length) {
            ukk0[] ukk0VarArr3 = (ukk0[]) Arrays.copyOf(ukk0VarArr2, ukk0VarArr2.length * 2);
            this.f = ukk0VarArr3;
            this.g = (ukk0[]) Arrays.copyOf(ukk0VarArr3, ukk0VarArr3.length * 2);
        }
        ukk0[] ukk0VarArr4 = this.f;
        int i3 = this.h;
        ukk0VarArr4[i3] = ukk0Var;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && ukk0VarArr4[i3].b > ukk0Var.b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                ukk0VarArr = this.g;
                if (i5 >= i) {
                    break;
                }
                ukk0VarArr[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(ukk0VarArr, 0, i, new lk30((byte) 19));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        ukk0Var.f35831a = true;
        ukk0Var.a(this);
    }

    public final void k(ukk0 ukk0Var) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == ukk0Var) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        ukk0Var.f35831a = false;
                        return;
                    } else {
                        ukk0[] ukk0VarArr = this.f;
                        int i3 = i + 1;
                        ukk0VarArr[i] = ukk0VarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // a.kx3
    public final String toString() {
        dq00 dq00Var = this.i;
        String strO = kng0.o(new StringBuilder(" goal -> ("), this.b, ") : ");
        for (int i = 0; i < this.h; i++) {
            dq00Var.b = this.f[i];
            strO = strO + dq00Var + Separators.SP;
        }
        return strO;
    }
}
