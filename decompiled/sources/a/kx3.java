package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class kx3 {
    public final yw3 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ukk0 f19033a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public kx3(nr nrVar) {
        this.d = new yw3(this, nrVar);
    }

    public final void a(p900 p900Var, int i) {
        ukk0 ukk0VarJ = p900Var.j(i);
        yw3 yw3Var = this.d;
        yw3Var.g(ukk0VarJ, 1.0f);
        yw3Var.g(p900Var.j(i), -1.0f);
    }

    public final void b(ukk0 ukk0Var, ukk0 ukk0Var2, ukk0 ukk0Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        yw3 yw3Var = this.d;
        if (z) {
            yw3Var.g(ukk0Var, 1.0f);
            yw3Var.g(ukk0Var2, -1.0f);
            yw3Var.g(ukk0Var3, -1.0f);
        } else {
            yw3Var.g(ukk0Var, -1.0f);
            yw3Var.g(ukk0Var2, 1.0f);
            yw3Var.g(ukk0Var3, 1.0f);
        }
    }

    public final void c(ukk0 ukk0Var, ukk0 ukk0Var2, ukk0 ukk0Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        yw3 yw3Var = this.d;
        if (z) {
            yw3Var.g(ukk0Var, 1.0f);
            yw3Var.g(ukk0Var2, -1.0f);
            yw3Var.g(ukk0Var3, 1.0f);
        } else {
            yw3Var.g(ukk0Var, -1.0f);
            yw3Var.g(ukk0Var2, 1.0f);
            yw3Var.g(ukk0Var3, -1.0f);
        }
    }

    public ukk0 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f19033a == null && this.b == 0.0f && this.d.d() == 0;
    }

    public final ukk0 f(boolean[] zArr, ukk0 ukk0Var) {
        int i;
        yw3 yw3Var = this.d;
        int iD = yw3Var.d();
        ukk0 ukk0Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iD; i2++) {
            float f2 = yw3Var.f(i2);
            if (f2 < 0.0f) {
                ukk0 ukk0VarE = yw3Var.e(i2);
                if ((zArr == null || !zArr[ukk0VarE.b]) && ukk0VarE != ukk0Var && (((i = ukk0VarE.l) == 3 || i == 4) && f2 < f)) {
                    f = f2;
                    ukk0Var2 = ukk0VarE;
                }
            }
        }
        return ukk0Var2;
    }

    public final void g(ukk0 ukk0Var) {
        ukk0 ukk0Var2 = this.f19033a;
        yw3 yw3Var = this.d;
        if (ukk0Var2 != null) {
            yw3Var.g(ukk0Var2, -1.0f);
            this.f19033a.c = -1;
            this.f19033a = null;
        }
        float fH = yw3Var.h(ukk0Var, true) * (-1.0f);
        this.f19033a = ukk0Var;
        if (fH == 1.0f) {
            return;
        }
        this.b /= fH;
        int i = yw3Var.h;
        for (int i2 = 0; i != -1 && i2 < yw3Var.f43351a; i2++) {
            float[] fArr = yw3Var.g;
            fArr[i] = fArr[i] / fH;
            i = yw3Var.f[i];
        }
    }

    public final void h(p900 p900Var, ukk0 ukk0Var, boolean z) {
        if (ukk0Var.f) {
            yw3 yw3Var = this.d;
            float fC = yw3Var.c(ukk0Var);
            this.b = (ukk0Var.e * fC) + this.b;
            yw3Var.h(ukk0Var, z);
            if (z) {
                ukk0Var.b(this);
            }
            if (yw3Var.d() == 0) {
                this.e = true;
                p900Var.b = true;
            }
        }
    }

    public void i(p900 p900Var, kx3 kx3Var, boolean z) {
        yw3 yw3Var = this.d;
        yw3Var.getClass();
        float fC = yw3Var.c(kx3Var.f19033a);
        yw3Var.h(kx3Var.f19033a, z);
        yw3 yw3Var2 = kx3Var.d;
        int iD = yw3Var2.d();
        for (int i = 0; i < iD; i++) {
            ukk0 ukk0VarE = yw3Var2.e(i);
            yw3Var.a(ukk0VarE, yw3Var2.c(ukk0VarE) * fC, z);
        }
        this.b = (kx3Var.b * fC) + this.b;
        if (z) {
            kx3Var.f19033a.b(this);
        }
        if (this.f19033a == null || yw3Var.d() != 0) {
            return;
        }
        this.e = true;
        p900Var.b = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.f19033a == null ? "0" : "" + this.f19033a).concat(" = ");
        if (this.b != 0.0f) {
            strConcat = strConcat + this.b;
            z = true;
        } else {
            z = false;
        }
        yw3 yw3Var = this.d;
        int iD = yw3Var.d();
        for (int i = 0; i < iD; i++) {
            ukk0 ukk0VarE = yw3Var.e(i);
            if (ukk0VarE != null) {
                float f = yw3Var.f(i);
                if (f != 0.0f) {
                    String string = ukk0VarE.toString();
                    if (z) {
                        if (f > 0.0f) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            f *= -1.0f;
                        }
                    } else if (f < 0.0f) {
                        strConcat = strConcat.concat("- ");
                        f *= -1.0f;
                    }
                    strConcat = f == 1.0f ? strConcat.concat(string) : strConcat + f + Separators.SP + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }
}
