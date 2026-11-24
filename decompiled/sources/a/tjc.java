package a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class tjc extends whl {
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public boolean n;
    public float o;
    public final RectF p;
    public final Pair q;

    public tjc(dkc dkcVar) {
        super(dkcVar);
        this.p = new RectF();
        this.q = new Pair(new vhl(), new vhl());
    }

    @Override // a.whl
    public final void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        float fWidth = rect.width() / k();
        float fHeight = rect.height() / k();
        dkc dkcVar = (dkc) this.f39171a;
        float f2 = (dkcVar.r / 2.0f) + dkcVar.s;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (dkcVar.t != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        int i = dkcVar.f34840a;
        this.f = i * f;
        this.g = Math.min(i / 2, dkcVar.a()) * f;
        this.h = dkcVar.l * f;
        int i2 = dkcVar.r;
        int i3 = dkcVar.f34840a;
        float f4 = (i2 - i3) / 2.0f;
        this.i = f4;
        if (z || z2) {
            float f5 = ((1.0f - f) * i3) / 2.0f;
            if ((z && dkcVar.g == 2) || (z2 && dkcVar.h == 1)) {
                this.i = f4 + f5;
            } else if ((z && dkcVar.g == 1) || (z2 && dkcVar.h == 2)) {
                this.i = f4 - f5;
            }
        }
        if (z2 && dkcVar.h == 3) {
            this.o = f;
        } else {
            this.o = 1.0f;
        }
    }

    @Override // a.whl
    public final void c(Canvas canvas, Paint paint, uhl uhlVar, int i) {
        int iT = d7x.t(uhlVar.c, i);
        canvas.save();
        canvas.rotate(uhlVar.g);
        this.n = uhlVar.h;
        float f = uhlVar.f35684a;
        float f2 = uhlVar.b;
        int i2 = uhlVar.d;
        i(canvas, paint, f, f2, iT, i2, i2, uhlVar.e, uhlVar.f, true);
        canvas.restore();
    }

    @Override // a.whl
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iT = d7x.t(i, i2);
        this.n = false;
        i(canvas, paint, f, f2, iT, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // a.whl
    public final int e() {
        return k();
    }

    @Override // a.whl
    public final int f() {
        return k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.whl
    public final void g() {
        int i;
        Path path = this.b;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            if (i3 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
            i3++;
        }
        Matrix matrix = this.e;
        matrix.reset();
        float f = this.i;
        matrix.setScale(f, f);
        path.transform(matrix);
        dkc dkcVar = (dkc) this.f39171a;
        boolean zB = dkcVar.b(this.n);
        PathMeasure pathMeasure = this.d;
        if (zB) {
            pathMeasure.setPath(path, false);
            float f2 = this.k;
            path.rewind();
            float length = pathMeasure.getLength();
            float f3 = 2.0f;
            int iMax = Math.max(3, (int) ((length / (this.n ? dkcVar.j : dkcVar.k)) / 2.0f)) * 2;
            this.j = length / iMax;
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < iMax; i4++) {
                vhl vhlVar = new vhl();
                float f4 = i4;
                pathMeasure.getPosTan(this.j * f4, vhlVar.f37435a, vhlVar.b);
                vhl vhlVar2 = new vhl();
                float f5 = this.j;
                pathMeasure.getPosTan((f5 / 2.0f) + (f4 * f5), vhlVar2.f37435a, vhlVar2.b);
                arrayList.add(vhlVar);
                vhlVar2.a(f2 * 2.0f);
                arrayList.add(vhlVar2);
            }
            arrayList.add((vhl) arrayList.get(0));
            vhl vhlVar3 = (vhl) arrayList.get(0);
            float[] fArr = vhlVar3.f37435a;
            char c = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i5 = 1;
            while (i5 < arrayList.size()) {
                vhl vhlVar4 = (vhl) arrayList.get(i5);
                float f6 = (this.j / f3) * 0.48f;
                float[] fArr2 = vhlVar3.f37435a;
                float[] fArr3 = vhlVar3.b;
                float[] fArr4 = new float[i];
                float[] fArr5 = new float[i];
                System.arraycopy(fArr2, i2, fArr4, i2, i);
                System.arraycopy(fArr3, i2, fArr5, i2, i);
                new Matrix();
                float[] fArr6 = vhlVar4.f37435a;
                float[] fArr7 = vhlVar4.b;
                float[] fArr8 = new float[i];
                float[] fArr9 = new float[i];
                System.arraycopy(fArr6, i2, fArr8, i2, i);
                System.arraycopy(fArr7, i2, fArr9, i2, i);
                new Matrix();
                char c2 = c;
                float fAtan2 = (float) Math.atan2(fArr5[c], fArr5[i2]);
                double d = fArr4[i2];
                double d2 = f6;
                int i6 = i2;
                double d3 = fAtan2;
                fArr4[i6] = (float) ((Math.cos(d3) * d2) + d);
                fArr4[c2] = (float) ((Math.sin(d3) * d2) + ((double) fArr4[c2]));
                double d4 = -f6;
                double dAtan2 = (float) Math.atan2(fArr9[c2], fArr9[i6]);
                fArr8[i6] = (float) ((Math.cos(dAtan2) * d4) + ((double) fArr8[i6]));
                float fSin = (float) ((Math.sin(dAtan2) * d4) + ((double) fArr8[c2]));
                fArr8[c2] = fSin;
                float f7 = fArr4[i6];
                float f8 = fArr4[c2];
                float f9 = fArr8[i6];
                float[] fArr10 = vhlVar4.f37435a;
                path.cubicTo(f7, f8, f9, fSin, fArr10[i6], fArr10[c2]);
                i5++;
                vhlVar3 = vhlVar4;
                c = c2;
                i2 = i6;
                pathMeasure = pathMeasure;
                i = 2;
                f3 = 2.0f;
            }
        }
        pathMeasure.setPath(path, i2);
    }

    public final void i(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        Canvas canvas2;
        float f6 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f7 = f % 1.0f;
        if (f7 < 0.0f) {
            f7 += 1.0f;
        }
        if (this.o < 1.0f) {
            float f8 = f7 + f6;
            if (f8 > 1.0f) {
                i(canvas, paint, f7, 1.0f, i, i2, 0, f3, f4, z);
                i(canvas, paint, 1.0f, f8, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.g / this.i);
        float f9 = f6 - 0.99f;
        if (f9 >= 0.0f) {
            float f10 = ((f9 * degrees) / 180.0f) / 0.01f;
            f6 += f10;
            if (!z) {
                f7 -= f10 / 2.0f;
            }
        }
        float F = p7x.F(1.0f - this.o, 1.0f, f7);
        float F2 = p7x.F(0.0f, this.o, f6);
        float degrees2 = (float) Math.toDegrees(i2 / this.i);
        float degrees3 = ((F2 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.i));
        float f11 = (F * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        dkc dkcVar = (dkc) this.f39171a;
        boolean z2 = dkcVar.b(this.n) && z && f3 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f);
        float f12 = this.g * 2.0f;
        float f13 = degrees * 2.0f;
        PathMeasure pathMeasure = this.d;
        if (degrees3 < f13) {
            float f14 = degrees3 / f13;
            float f15 = (degrees * f14) + f11;
            vhl vhlVar = new vhl();
            if (z2) {
                float length = (pathMeasure.getLength() * (f15 / 360.0f)) / 2.0f;
                float f16 = this.h * f3;
                float f17 = this.i;
                if (f17 != this.m || f16 != this.k) {
                    this.k = f16;
                    this.m = f17;
                    g();
                }
                pathMeasure.getPosTan(length, vhlVar.f37435a, vhlVar.b);
            } else {
                vhlVar.c(f15 + 90.0f);
                vhlVar.a(-this.i);
            }
            paint.setStyle(Paint.Style.FILL);
            j(canvas, paint, vhlVar, f12, this.f, f14);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(dkcVar.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f18 = f11 + degrees;
        float f19 = degrees3 - f13;
        Pair pair = this.q;
        ((vhl) pair.first).b();
        ((vhl) pair.second).b();
        if (z2) {
            float f20 = f18 / 360.0f;
            float f21 = f19 / 360.0f;
            float f22 = this.h * f3;
            int i4 = this.n ? dkcVar.j : dkcVar.k;
            float f23 = this.i;
            if (f23 != this.m || f22 != this.k || i4 != this.l) {
                this.k = f22;
                this.l = i4;
                this.m = f23;
                g();
            }
            Path path = this.c;
            path.rewind();
            float fT = r7x.t(f21, 0.0f, 1.0f);
            if (dkcVar.b(this.n)) {
                float f24 = f4 / ((float) ((((double) this.i) * 6.283185307179586d) / ((double) this.j)));
                f20 += f24;
                f5 = 0.0f - (f24 * 360.0f);
            } else {
                f5 = 0.0f;
            }
            float f25 = f20 % 1.0f;
            float length2 = (pathMeasure.getLength() * f25) / 2.0f;
            float length3 = (pathMeasure.getLength() * (f25 + fT)) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            vhl vhlVar2 = (vhl) pair.first;
            vhlVar2.b();
            pathMeasure.getPosTan(length2, vhlVar2.f37435a, vhlVar2.b);
            vhl vhlVar3 = (vhl) pair.second;
            vhlVar3.b();
            pathMeasure.getPosTan(length3, vhlVar3.f37435a, vhlVar3.b);
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setRotate(f5);
            vhlVar2.c(f5);
            vhlVar3.c(f5);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((vhl) pair.first).c(f18 + 90.0f);
            ((vhl) pair.first).a(-this.i);
            ((vhl) pair.second).c(f18 + f19 + 90.0f);
            ((vhl) pair.second).a(-this.i);
            float f26 = this.i;
            float f27 = -f26;
            RectF rectF = this.p;
            rectF.set(f27, f27, f26, f26);
            canvas.drawArc(rectF, f18, f19, false, paint);
            canvas2 = canvas;
        }
        if (dkcVar.c() || this.g <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        j(canvas2, paint, (vhl) pair.first, f12, this.f, 1.0f);
        j(canvas, paint, (vhl) pair.second, f12, this.f, 1.0f);
    }

    public final void j(Canvas canvas, Paint paint, vhl vhlVar, float f, float f2, float f3) {
        float fMin = Math.min(f2, this.f);
        float f4 = f / 2.0f;
        float fMin2 = Math.min(f4, (this.g * fMin) / this.f);
        RectF rectF = new RectF((-f) / 2.0f, (-fMin) / 2.0f, f4, fMin / 2.0f);
        canvas.save();
        float[] fArr = vhlVar.f37435a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(whl.h(vhlVar.b));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    public final int k() {
        u06 u06Var = this.f39171a;
        return (((dkc) u06Var).s * 2) + ((dkc) u06Var).r;
    }
}
