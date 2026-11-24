package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pt40 implements Comparable {
    public static final String[] r = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fhn f27547a;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int b = 0;
    public float i = Float.NaN;
    public int j = -1;
    public int k = -1;
    public float l = Float.NaN;
    public ds40 m = null;
    public LinkedHashMap n = new LinkedHashMap();
    public int o = 0;
    public double[] p = new double[18];
    public double[] q = new double[18];

    public static boolean b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    public static void e(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
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

    public final void a(m3e m3eVar) {
        int iE;
        this.f27547a = fhn.f(m3eVar.d.d);
        o3e o3eVar = m3eVar.d;
        this.j = o3eVar.e;
        this.k = o3eVar.b;
        this.i = o3eVar.h;
        this.b = o3eVar.f;
        this.l = m3eVar.e.C;
        for (String str : m3eVar.g.keySet()) {
            x2e x2eVar = (x2e) m3eVar.g.get(str);
            if (x2eVar != null && (iE = hne.E(x2eVar.c)) != 4 && iE != 5 && iE != 7) {
                this.n.put(str, x2eVar);
            }
        }
    }

    public final void c(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.e;
        float fCos = this.f;
        float f2 = this.g;
        float f3 = this.h;
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
        ds40 ds40Var = this.m;
        if (ds40Var != null) {
            float[] fArr2 = new float[2];
            ds40Var.b(d, fArr2, new float[2]);
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
        return Float.compare(this.d, ((pt40) obj).d);
    }

    public final void d(float f, float f2, float f3, float f4) {
        this.e = f;
        this.f = f2;
        this.g = f3;
        this.h = f4;
    }

    public final void f(ds40 ds40Var, pt40 pt40Var) {
        double d = (((this.g / 2.0f) + this.e) - pt40Var.e) - (pt40Var.g / 2.0f);
        double d2 = (((this.h / 2.0f) + this.f) - pt40Var.f) - (pt40Var.h / 2.0f);
        this.m = ds40Var;
        this.e = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.l)) {
            this.f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f = (float) Math.toRadians(this.l);
        }
    }
}
