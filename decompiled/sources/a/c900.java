package a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class c900 extends whl {
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public boolean m;
    public float n;
    public Pair o;

    @Override // a.whl
    public final void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        if (this.f != rect.width()) {
            this.f = rect.width();
            g();
        }
        float fE = e();
        canvas.translate((rect.width() / 2.0f) + rect.left, Math.max(0.0f, (rect.height() - fE) / 2.0f) + (rect.height() / 2.0f) + rect.top);
        k900 k900Var = (k900) this.f39171a;
        if (k900Var.s) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f2 = this.f / 2.0f;
        float f3 = fE / 2.0f;
        canvas.clipRect(-f2, -f3, f2, f3);
        int i = k900Var.f34840a;
        this.g = i * f;
        this.h = Math.min(i / 2, k900Var.a()) * f;
        this.j = k900Var.l * f;
        this.i = Math.min(k900Var.f34840a / 2.0f, k900Var.e()) * f;
        if (z || z2) {
            if ((z && k900Var.g == 2) || (z2 && k900Var.h == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z || (z2 && k900Var.h != 3)) {
                canvas.translate(0.0f, ((1.0f - f) * k900Var.f34840a) / 2.0f);
            }
        }
        if (z2 && k900Var.h == 3) {
            this.n = f;
        } else {
            this.n = 1.0f;
        }
    }

    @Override // a.whl
    public final void b(Canvas canvas, Paint paint, int i, int i2) {
        int iT = d7x.t(i, i2);
        this.m = false;
        k900 k900Var = (k900) this.f39171a;
        int iMin = Math.min(k900Var.t, k900Var.f34840a);
        if (iMin <= 0 || iT == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(iT);
        Integer num = k900Var.u;
        float[] fArr = {(this.f / 2.0f) - (num != null ? (k900Var.t / 2.0f) + num.floatValue() : this.g / 2.0f), 0.0f};
        float f = iMin;
        j(canvas, paint, new vhl(fArr, new float[]{1.0f, 0.0f}), f, f, (this.h * f) / this.g, null, 0.0f, 0.0f, 0.0f, false);
    }

    @Override // a.whl
    public final void c(Canvas canvas, Paint paint, uhl uhlVar, int i) {
        int iT = d7x.t(uhlVar.c, i);
        this.m = uhlVar.h;
        float f = uhlVar.f35684a;
        float f2 = uhlVar.b;
        int i2 = uhlVar.d;
        i(canvas, paint, f, f2, iT, i2, i2, uhlVar.e, uhlVar.f, true);
    }

    @Override // a.whl
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iT = d7x.t(i, i2);
        this.m = false;
        i(canvas, paint, f, f2, iT, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // a.whl
    public final void g() {
        Path path = this.b;
        path.rewind();
        k900 k900Var = (k900) this.f39171a;
        if (k900Var.b(this.m)) {
            int i = this.m ? k900Var.j : k900Var.k;
            float f = this.f;
            int i2 = (int) (f / i);
            this.k = f / i2;
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = i3 * 2;
                float f2 = i4 + 1;
                path.cubicTo(i4 + 0.48f, 0.0f, f2 - 0.48f, 1.0f, f2, 1.0f);
                float f3 = f2 + 0.48f;
                float f4 = i4 + 2;
                path.cubicTo(f3, 1.0f, f4 - 0.48f, 0.0f, f4, 0.0f);
            }
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setScale(this.k / 2.0f, -2.0f);
            matrix.postTranslate(0.0f, 1.0f);
            path.transform(matrix);
        } else {
            path.lineTo(this.f, 0.0f);
        }
        this.d.setPath(path, false);
    }

    public final void i(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float F;
        float F2;
        k900 k900Var;
        float f5;
        Canvas canvas2;
        Pair pair = this.o;
        float fT = r7x.t(f, 0.0f, 1.0f);
        float fT2 = r7x.t(f2, 0.0f, 1.0f);
        float F3 = p7x.F(1.0f - this.n, 1.0f, fT);
        float F4 = p7x.F(1.0f - this.n, 1.0f, fT2);
        int iT = (int) ((r7x.t(F3, 0.0f, 0.01f) * i2) / 0.01f);
        int iT2 = (int) (((1.0f - r7x.t(F4, 0.99f, 1.0f)) * i3) / 0.01f);
        float f6 = this.f;
        int i4 = (int) ((F3 * f6) + iT);
        int i5 = (int) ((F4 * f6) - iT2);
        float f7 = this.h;
        float f8 = this.i;
        if (f7 != f8) {
            float fMax = Math.max(f7, f8);
            float f9 = this.f;
            float f10 = fMax / f9;
            F = p7x.F(this.h, this.i, r7x.t(i4 / f9, 0.0f, f10) / f10);
            float f11 = this.h;
            float f12 = this.i;
            float f13 = this.f;
            F2 = p7x.F(f11, f12, r7x.t((f13 - i5) / f13, 0.0f, f10) / f10);
        } else {
            F = f7;
            F2 = F;
        }
        float f14 = (-this.f) / 2.0f;
        k900 k900Var2 = (k900) this.f39171a;
        boolean z2 = k900Var2.b(this.m) && z && f3 > 0.0f;
        if (i4 <= i5) {
            float f15 = i4 + F;
            float f16 = i5 - F2;
            float f17 = F * 2.0f;
            float f18 = F2 * 2.0f;
            paint.setColor(i);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.g);
            ((vhl) pair.first).b();
            ((vhl) pair.second).b();
            ((vhl) pair.first).e(f15 + f14);
            ((vhl) pair.second).e(f16 + f14);
            if (i4 == 0 && f16 + F2 < f15 + F) {
                vhl vhlVar = (vhl) pair.first;
                float f19 = this.g;
                j(canvas, paint, vhlVar, f17, f19, F, (vhl) pair.second, f18, f19, F2, true);
                return;
            }
            if (f15 - F > f16 - F2) {
                vhl vhlVar2 = (vhl) pair.second;
                float f20 = this.g;
                j(canvas, paint, vhlVar2, f18, f20, F2, (vhl) pair.first, f17, f20, F, false);
                return;
            }
            float f21 = F2;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(k900Var2.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            if (z2) {
                float f22 = this.f;
                float f23 = f15 / f22;
                float f24 = f16 / f22;
                k900Var = k900Var2;
                int i6 = this.m ? k900Var.j : k900Var.k;
                if (i6 != this.l) {
                    this.l = i6;
                    g();
                }
                Path path = this.c;
                path.rewind();
                float f25 = (-this.f) / 2.0f;
                boolean zB = k900Var.b(this.m);
                if (zB) {
                    float f26 = this.f;
                    f5 = 1.0f;
                    float f27 = this.k;
                    float f28 = f26 / f27;
                    float f29 = f4 / f28;
                    float f30 = f28 / (f28 + 1.0f);
                    f23 = (f23 + f29) * f30;
                    f24 = (f24 + f29) * f30;
                    f25 -= f27 * f4;
                } else {
                    f5 = 1.0f;
                }
                PathMeasure pathMeasure = this.d;
                float length = pathMeasure.getLength() * f23;
                float length2 = pathMeasure.getLength() * f24;
                pathMeasure.getSegment(length, length2, path, true);
                vhl vhlVar3 = (vhl) pair.first;
                vhlVar3.b();
                pathMeasure.getPosTan(length, vhlVar3.f37435a, vhlVar3.b);
                vhl vhlVar4 = (vhl) pair.second;
                vhlVar4.b();
                pathMeasure.getPosTan(length2, vhlVar4.f37435a, vhlVar4.b);
                Matrix matrix = this.e;
                matrix.reset();
                matrix.setTranslate(f25, 0.0f);
                vhlVar3.e(f25);
                vhlVar4.e(f25);
                if (zB) {
                    float f31 = this.j * f3;
                    matrix.postScale(f5, f31);
                    vhlVar3.d(f31);
                    vhlVar4.d(f31);
                }
                path.transform(matrix);
                canvas2 = canvas;
                canvas2.drawPath(path, paint);
            } else {
                float[] fArr = ((vhl) pair.first).f37435a;
                float f32 = fArr[0];
                float f33 = fArr[1];
                float[] fArr2 = ((vhl) pair.second).f37435a;
                canvas.drawLine(f32, f33, fArr2[0], fArr2[1], paint);
                canvas2 = canvas;
                k900Var = k900Var2;
            }
            if (k900Var.c()) {
                return;
            }
            if (f15 > 0.0f && F > 0.0f) {
                j(canvas2, paint, (vhl) pair.first, f17, this.g, F, null, 0.0f, 0.0f, 0.0f, false);
            }
            if (f16 >= this.f || f21 <= 0.0f) {
                return;
            }
            j(canvas, paint, (vhl) pair.second, f18, this.g, f21, null, 0.0f, 0.0f, 0.0f, false);
        }
    }

    public final void j(Canvas canvas, Paint paint, vhl vhlVar, float f, float f2, float f3, vhl vhlVar2, float f4, float f5, float f6, boolean z) {
        float f7;
        float f8;
        float fMin = Math.min(f2, this.g);
        float f9 = (-f) / 2.0f;
        float f10 = (-fMin) / 2.0f;
        float f11 = f / 2.0f;
        float f12 = fMin / 2.0f;
        RectF rectF = new RectF(f9, f10, f11, f12);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (vhlVar2 != null) {
            float[] fArr = vhlVar2.b;
            float[] fArr2 = vhlVar2.f37435a;
            float fMin2 = Math.min(f5, this.g);
            float fMin3 = Math.min(f4 / 2.0f, (f6 * fMin2) / this.g);
            RectF rectF2 = new RectF();
            if (z) {
                float f13 = (fArr2[0] - fMin3) - (vhlVar.f37435a[0] - f3);
                if (f13 > 0.0f) {
                    vhlVar2.e((-f13) / 2.0f);
                    f8 = f4 + f13;
                } else {
                    f8 = f4;
                }
                rectF2.set(0.0f, f10, f11, f12);
            } else {
                float f14 = (fArr2[0] + fMin3) - (vhlVar.f37435a[0] + f3);
                if (f14 < 0.0f) {
                    vhlVar2.e((-f14) / 2.0f);
                    f7 = f4 - f14;
                } else {
                    f7 = f4;
                }
                rectF2.set(f9, f10, 0.0f, f12);
                f8 = f7;
            }
            RectF rectF3 = new RectF((-f8) / 2.0f, (-fMin2) / 2.0f, f8 / 2.0f, fMin2 / 2.0f);
            canvas.translate(fArr2[0], fArr2[1]);
            canvas.rotate(whl.h(fArr));
            Path path = new Path();
            path.addRoundRect(rectF3, fMin3, fMin3, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.rotate(-whl.h(fArr));
            canvas.translate(-fArr2[0], -fArr2[1]);
            float[] fArr3 = vhlVar.f37435a;
            canvas.translate(fArr3[0], fArr3[1]);
            canvas.rotate(whl.h(vhlVar.b));
            canvas.drawRect(rectF2, paint);
            canvas.drawRoundRect(rectF, f3, f3, paint);
        } else {
            float[] fArr4 = vhlVar.f37435a;
            canvas.translate(fArr4[0], fArr4[1]);
            canvas.rotate(whl.h(vhlVar.b));
            canvas.drawRoundRect(rectF, f3, f3, paint);
        }
        canvas.restore();
    }
}
