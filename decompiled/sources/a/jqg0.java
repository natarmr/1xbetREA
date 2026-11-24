package a;

/* JADX INFO: loaded from: classes.dex */
public final class jqg0 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f16952a;
    public final int b;

    public jqg0(float f) {
        this.f16952a = f;
        this.b = 1;
    }

    public final float a() {
        float f;
        float f2;
        int iE = hne.E(this.b);
        float f3 = this.f16952a;
        if (iE == 0) {
            return f3;
        }
        if (iE == 3) {
            return f3 * 96.0f;
        }
        if (iE == 4) {
            f = f3 * 96.0f;
            f2 = 2.54f;
        } else if (iE == 5) {
            f = f3 * 96.0f;
            f2 = 25.4f;
        } else if (iE == 6) {
            f = f3 * 96.0f;
            f2 = 72.0f;
        } else {
            if (iE != 7) {
                return f3;
            }
            f = f3 * 96.0f;
            f2 = 6.0f;
        }
        return f / f2;
    }

    public final float b(esg0 esg0Var) {
        if (this.b != 9) {
            return d(esg0Var);
        }
        csg0 csg0Var = (csg0) esg0Var.c;
        gz40 gz40Var = csg0Var.g;
        if (gz40Var == null) {
            gz40Var = csg0Var.f;
        }
        float f = this.f16952a;
        if (gz40Var == null) {
            return f;
        }
        float fSqrt = gz40Var.d;
        float f2 = gz40Var.e;
        if (fSqrt != f2) {
            fSqrt = (float) (Math.sqrt((f2 * f2) + (fSqrt * fSqrt)) / 1.414213562373095d);
        }
        return (f * fSqrt) / 100.0f;
    }

    public final float c(esg0 esg0Var, float f) {
        return this.b == 9 ? (this.f16952a * f) / 100.0f : d(esg0Var);
    }

    public final float d(esg0 esg0Var) {
        float textSize;
        int iE = hne.E(this.b);
        float f = this.f16952a;
        switch (iE) {
            case 1:
                textSize = ((csg0) esg0Var.c).d.getTextSize();
                break;
            case 2:
                textSize = ((csg0) esg0Var.c).d.getTextSize() / 2.0f;
                break;
            case 3:
                esg0Var.getClass();
                return f * 96.0f;
            case 4:
                esg0Var.getClass();
                return (f * 96.0f) / 2.54f;
            case 5:
                esg0Var.getClass();
                return (f * 96.0f) / 25.4f;
            case 6:
                esg0Var.getClass();
                return (f * 96.0f) / 72.0f;
            case 7:
                esg0Var.getClass();
                return (f * 96.0f) / 6.0f;
            case 8:
                csg0 csg0Var = (csg0) esg0Var.c;
                gz40 gz40Var = csg0Var.g;
                if (gz40Var == null) {
                    gz40Var = csg0Var.f;
                }
                if (gz40Var != null) {
                    return (f * gz40Var.d) / 100.0f;
                }
            default:
                return f;
        }
        return textSize * f;
    }

    public final float e(esg0 esg0Var) {
        if (this.b != 9) {
            return d(esg0Var);
        }
        csg0 csg0Var = (csg0) esg0Var.c;
        gz40 gz40Var = csg0Var.g;
        if (gz40Var == null) {
            gz40Var = csg0Var.f;
        }
        float f = this.f16952a;
        return gz40Var == null ? f : (f * gz40Var.e) / 100.0f;
    }

    public final boolean f() {
        return this.f16952a < 0.0f;
    }

    public final boolean g() {
        return this.f16952a == 0.0f;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.f16952a));
        switch (this.b) {
            case 1:
                str = "px";
                break;
            case 2:
                str = "em";
                break;
            case 3:
                str = "ex";
                break;
            case 4:
                str = "in";
                break;
            case 5:
                str = "cm";
                break;
            case 6:
                str = "mm";
                break;
            case 7:
                str = "pt";
                break;
            case 8:
                str = "pc";
                break;
            case 9:
                str = "percent";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        return sb.toString();
    }

    public jqg0(float f, int i) {
        this.f16952a = f;
        this.b = i;
    }
}
