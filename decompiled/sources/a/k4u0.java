package a;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class k4u0 {
    public static final Matrix p = new Matrix();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f17685a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final h4u0 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final gx3 o;

    public k4u0(k4u0 k4u0Var) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        gx3 gx3Var = new gx3(0);
        this.o = gx3Var;
        this.g = new h4u0(k4u0Var.g, gx3Var);
        this.f17685a = new Path(k4u0Var.f17685a);
        this.b = new Path(k4u0Var.b);
        this.h = k4u0Var.h;
        this.i = k4u0Var.i;
        this.j = k4u0Var.j;
        this.k = k4u0Var.k;
        this.l = k4u0Var.l;
        this.m = k4u0Var.m;
        String str = k4u0Var.m;
        if (str != null) {
            gx3Var.put(str, this);
        }
        this.n = k4u0Var.n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(h4u0 h4u0Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        int i4;
        Matrix matrix2 = h4u0Var.f12452a;
        ArrayList arrayList = h4u0Var.b;
        matrix2.set(matrix);
        Matrix matrix3 = h4u0Var.f12452a;
        matrix3.preConcat(h4u0Var.j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            i4u0 i4u0Var = (i4u0) arrayList.get(i5);
            if (i4u0Var instanceof h4u0) {
                a((h4u0) i4u0Var, matrix3, canvas, i, i2);
            } else {
                if (i4u0Var instanceof j4u0) {
                    j4u0 j4u0Var = (j4u0) i4u0Var;
                    float f2 = i / this.j;
                    float f3 = i2 / this.k;
                    float fMin = Math.min(f2, f3);
                    Matrix matrix4 = this.c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f2, f3);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c], fArr[1]);
                    boolean z = c;
                    i3 = i5;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f4 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f4) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f17685a;
                        path.reset();
                        a390[] a390VarArr = j4u0Var.f15902a;
                        if (a390VarArr != null) {
                            gfx.K(a390VarArr, path);
                        }
                        Path path2 = this.b;
                        path2.reset();
                        if (j4u0Var instanceof f4u0) {
                            path2.setFillType(j4u0Var.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            g4u0 g4u0Var = (g4u0) j4u0Var;
                            float f5 = g4u0Var.i;
                            if (f5 != 0.0f || g4u0Var.j != 1.0f) {
                                float f6 = g4u0Var.k;
                                float f7 = (f5 + f6) % 1.0f;
                                float f8 = (g4u0Var.j + f6) % 1.0f;
                                PathMeasure pathMeasure = this.f;
                                PathMeasure pathMeasure2 = pathMeasure;
                                if (pathMeasure == null) {
                                    PathMeasure pathMeasure3 = new PathMeasure();
                                    this.f = pathMeasure3;
                                    pathMeasure2 = pathMeasure3;
                                }
                                pathMeasure2.setPath(path, z);
                                float length = this.f.getLength();
                                float f9 = f7 * length;
                                float f10 = f8 * length;
                                path.reset();
                                PathMeasure pathMeasure4 = this.f;
                                if (f9 > f10) {
                                    pathMeasure4.getSegment(f9, length, path, true);
                                    f = 0.0f;
                                    this.f.getSegment(0.0f, f10, path, true);
                                } else {
                                    f = 0.0f;
                                    pathMeasure4.getSegment(f9, f10, path, true);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            zz2 zz2Var = g4u0Var.f;
                            float f11 = 255.0f;
                            if (((Shader) zz2Var.b) == null && zz2Var.f45232a == 0) {
                                f11 = 255.0f;
                                i4 = 16777215;
                            } else {
                                if (this.e == null) {
                                    i4 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i4 = 16777215;
                                }
                                Paint paint2 = this.e;
                                Shader shader = (Shader) zz2Var.b;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(g4u0Var.h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i6 = zz2Var.f45232a;
                                    float f12 = g4u0Var.h;
                                    PorterDuff.Mode mode = n4u0.j;
                                    paint2.setColor((i6 & i4) | (((int) (Color.alpha(i6) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(g4u0Var.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            zz2 zz2Var2 = g4u0Var.d;
                            if (((Shader) zz2Var2.b) != null || zz2Var2.f45232a != 0) {
                                if (this.d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.d;
                                Paint.Join join = g4u0Var.m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = g4u0Var.l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(g4u0Var.n);
                                Shader shader2 = (Shader) zz2Var2.b;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(g4u0Var.g * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i7 = zz2Var2.f45232a;
                                    float f13 = g4u0Var.g;
                                    PorterDuff.Mode mode2 = n4u0.j;
                                    paint4.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(g4u0Var.e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public k4u0() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new gx3(0);
        this.g = new h4u0();
        this.f17685a = new Path();
        this.b = new Path();
    }
}
