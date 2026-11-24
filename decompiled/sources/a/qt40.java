package a;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qt40 implements Comparable {
    public static final String[] q = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fhn f29283a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h = Float.NaN;
    public int i = -1;
    public String j = null;
    public float k = Float.NaN;
    public zr40 l = null;
    public HashMap m = new HashMap();
    public int n = 0;
    public double[] o = new double[18];
    public double[] p = new double[18];

    public static boolean b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    public static void d(float f, float f2, float[] fArr, int[] iArr, double[] dArr) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    public final void a(ywu ywuVar) {
        short s;
        this.f29283a = fhn.f(((cu40) ywuVar.c).b);
        cu40 cu40Var = (cu40) ywuVar.c;
        this.i = cu40Var.c;
        this.j = cu40Var.f4970a;
        this.h = cu40Var.d;
        vdv0 vdv0Var = (vdv0) ywuVar.b;
        k4e k4eVar = vdv0Var.f37251a;
        if (k4eVar != null) {
            this.k = k4eVar.E;
        }
        for (String str : vdv0Var.r.keySet()) {
            iyf iyfVar = (iyf) ((vdv0) ywuVar.b).r.get(str);
            if (iyfVar != null && (s = iyfVar.b) != 903 && s != 904 && s != 906) {
                this.m.put(str, iyfVar);
            }
        }
    }

    public final void c(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.d;
        float fCos = this.e;
        float f2 = this.f;
        float f3 = this.g;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f4 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                f = f4;
            } else if (i3 == 2) {
                fCos = f4;
            } else if (i3 == 3) {
                f2 = f4;
            } else if (i3 == 4) {
                f3 = f4;
            }
        }
        zr40 zr40Var = this.l;
        if (zr40Var != null) {
            float[] fArr2 = new float[2];
            zr40Var.b(d, fArr2, new float[2]);
            float f5 = fArr2[0];
            float f6 = fArr2[1];
            double d2 = f;
            double d3 = fCos;
            double dSin = Math.sin(d3) * d2;
            fCos = (float) ((((double) f6) - (Math.cos(d3) * d2)) - ((double) (f3 / 2.0f)));
            f = (float) ((dSin + ((double) f5)) - ((double) (f2 / 2.0f)));
        }
        fArr[i] = (f2 / 2.0f) + f + 0.0f;
        fArr[i + 1] = (f3 / 2.0f) + fCos + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.c, ((qt40) obj).c);
    }

    public final void e(zr40 zr40Var, qt40 qt40Var) {
        double d = (((this.f / 2.0f) + this.d) - qt40Var.d) - (qt40Var.f / 2.0f);
        double d2 = (((this.g / 2.0f) + this.e) - qt40Var.e) - (qt40Var.g / 2.0f);
        this.l = zr40Var;
        this.d = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.k)) {
            this.e = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.e = (float) Math.toRadians(this.k);
        }
    }
}
