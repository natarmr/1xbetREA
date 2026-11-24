package a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
public final class uw2 implements x5a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Canvas f36374a = vw2.f38128a;
    public Rect b;
    public Rect c;

    @Override // a.x5a
    public final void a(float f, float f2) {
        this.f36374a.scale(f, f2);
    }

    @Override // a.x5a
    public final void b(long j, long j2, ucs0 ucs0Var) {
        this.f36374a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) ucs0Var.c);
    }

    @Override // a.x5a
    public final void c(w03 w03Var) {
        Canvas canvas = this.f36374a;
        if (w03Var instanceof w03) {
            canvas.clipPath(w03Var.f38329a, Region.Op.INTERSECT);
        } else {
            v4i0.p("Unable to obtain android.graphics.Path");
        }
    }

    @Override // a.x5a
    public final void d(float f, float f2, float f3, float f4, float f5, float f6, ucs0 ucs0Var) {
        this.f36374a.drawRoundRect(f, f2, f3, f4, f5, f6, saj.V(ucs0Var));
    }

    @Override // a.x5a
    public final void e(float f, long j, ucs0 ucs0Var) {
        this.f36374a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) ucs0Var.c);
    }

    @Override // a.x5a
    public final void f(float f, float f2, float f3, float f4, int i) {
        this.f36374a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // a.x5a
    public final void g(float f, float f2) {
        this.f36374a.translate(f, f2);
    }

    @Override // a.x5a
    public final void i() {
        this.f36374a.restore();
    }

    @Override // a.x5a
    public final void j() {
        y9a.P(this.f36374a, true);
    }

    @Override // a.x5a
    public final void k(float f) {
        this.f36374a.rotate(f);
    }

    @Override // a.x5a
    public final void l() {
        this.f36374a.save();
    }

    @Override // a.x5a
    public final void m(float f, float f2, float f3, float f4, ucs0 ucs0Var) {
        this.f36374a.drawRect(f, f2, f3, f4, saj.V(ucs0Var));
    }

    @Override // a.x5a
    public final void n() {
        y9a.P(this.f36374a, false);
    }

    @Override // a.x5a
    public final void o(float[] fArr) {
        if (a8k0.z(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        tke.a0(matrix, fArr);
        this.f36374a.concat(matrix);
    }

    @Override // a.x5a
    public final void p(w03 w03Var, ucs0 ucs0Var) {
        Canvas canvas = this.f36374a;
        if (w03Var instanceof w03) {
            canvas.drawPath(w03Var.f38329a, saj.V(ucs0Var));
        } else {
            v4i0.p("Unable to obtain android.graphics.Path");
        }
    }

    @Override // a.x5a
    public final void q(vz2 vz2Var, long j, ucs0 ucs0Var) {
        this.f36374a.drawBitmap(j2e.G(vz2Var), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), (Paint) ucs0Var.c);
    }

    @Override // a.x5a
    public final void r(jge0 jge0Var, ucs0 ucs0Var) {
        this.f36374a.saveLayer(jge0Var.f16474a, jge0Var.b, jge0Var.c, jge0Var.d, (Paint) ucs0Var.c, 31);
    }

    @Override // a.x5a
    public final void s(vz2 vz2Var, long j, long j2, long j3, ucs0 ucs0Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.f36374a;
        Bitmap bitmapG = j2e.G(vz2Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = 0;
        rect2.top = 0;
        rect2.right = (int) (j3 >> 32);
        rect2.bottom = (int) (j3 & 4294967295L);
        canvas.drawBitmap(bitmapG, rect, rect2, (Paint) ucs0Var.c);
    }

    @Override // a.x5a
    public final void t(float f, float f2, float f3, float f4, float f5, float f6, ucs0 ucs0Var) {
        this.f36374a.drawArc(f, f2, f3, f4, f5, f6, false, (Paint) ucs0Var.c);
    }
}
