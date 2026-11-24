package a;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class w03 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f38329a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public w03(Path path) {
        this.f38329a = path;
    }

    public static void a(w03 w03Var, w03 w03Var2) {
        Path path = w03Var.f38329a;
        if (w03Var2 instanceof w03) {
            path.addPath(w03Var2.f38329a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            v4i0.p("Unable to obtain android.graphics.Path");
        }
    }

    public static void b(w03 w03Var, wfg0 wfg0Var) {
        x190 x190Var = x190.f40111a;
        RectF rectF = w03Var.b;
        if (rectF == null) {
            rectF = new RectF();
            w03Var.b = rectF;
        }
        float f = wfg0Var.f39069a;
        long j = wfg0Var.h;
        long j2 = wfg0Var.g;
        long j3 = wfg0Var.f;
        long j4 = wfg0Var.e;
        rectF.set(f, wfg0Var.b, wfg0Var.c, wfg0Var.d);
        float[] fArr = w03Var.c;
        if (fArr == null) {
            fArr = new float[8];
            w03Var.c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = w03Var.f38329a;
        RectF rectF2 = w03Var.b;
        rectF2.getClass();
        float[] fArr2 = w03Var.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, z03.c(x190Var));
    }

    public final void c() {
        this.f38329a.close();
    }

    public final jge0 d() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        this.f38329a.computeBounds(rectF, true);
        return new jge0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void e(float f, float f2) {
        this.f38329a.lineTo(f, f2);
    }

    public final void f(float f, float f2) {
        this.f38329a.moveTo(f, f2);
    }

    public final boolean g(w03 w03Var, w03 w03Var2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(w03Var instanceof w03)) {
            v4i0.p("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = w03Var.f38329a;
        if (w03Var2 instanceof w03) {
            return this.f38329a.op(path, w03Var2.f38329a, op);
        }
        v4i0.p("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void h() {
        this.f38329a.reset();
    }

    public final void i() {
        this.f38329a.rewind();
    }

    public final void j(int i) {
        this.f38329a.setFillType(i == 1 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void k(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.f38329a.transform(matrix3);
    }
}
