package a;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n8z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23114a;
    public int b;
    public boolean c;
    public boolean d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public long a(int i, int i2) {
        int i3;
        v8z v8zVar = (v8z) this.e;
        int[] iArr = v8zVar.f37007a;
        if (i2 == 1) {
            i3 = iArr[i];
        } else {
            int i4 = (i2 + i) - 1;
            int[] iArr2 = v8zVar.b;
            i3 = (iArr2[i4] + iArr[i4]) - iArr2[i];
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (this.c) {
            if (i3 < 0) {
                zcx.a("width must be >= 0");
            }
            return r4e.h(i3, i3, 0, Integer.MAX_VALUE);
        }
        if (i3 < 0) {
            zcx.a("height must be >= 0");
        }
        return r4e.h(0, Integer.MAX_VALUE, i3, i3);
    }

    public s8z b(int i) {
        tyj tyjVarB = ((y8z) this.h).b(i);
        int i2 = tyjVarB.b;
        int size = tyjVarB.f34759a.size();
        int i3 = 0;
        int i4 = (size == 0 || i2 + size == this.f23114a) ? 0 : this.b;
        r8z[] r8zVarArr = new r8z[size];
        int i5 = 0;
        while (true) {
            List list = tyjVarB.f34759a;
            if (i3 >= size) {
                return new s8z(i, r8zVarArr, (v8z) this.f, list, this.d, i4);
            }
            int i6 = (int) ((pgv) list.get(i3)).f26968a;
            r8z r8zVarN1 = ((m8z) this.g).n1(i2 + i3, a(i5, i6), i5, i6, i4);
            i5 += i6;
            r8zVarArr[i3] = r8zVarN1;
            i3++;
        }
    }

    public Matrix c(Size size, int i, Rect rect) {
        Matrix matrix = null;
        if (!h()) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        if (h()) {
            matrix = new Matrix((Matrix) this.g);
            matrix.postConcat(e(i, size));
        }
        matrix.invert(matrix2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        return matrix2;
    }

    public Size d() {
        return jls0.c(this.f23114a) ? new Size(((Rect) this.f).height(), ((Rect) this.f).width()) : new Size(((Rect) this.f).width(), ((Rect) this.f).height());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007a  */
    /* JADX WARN: Code duplicated, block: B:18:0x007d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    public Matrix e(int i, Size size) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        z1x.y(null, h());
        if (jls0.d(size, true, d())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size sizeD = d();
            RectF rectF3 = new RectF(0.0f, 0.0f, sizeD.getWidth(), sizeD.getHeight());
            Matrix matrix = new Matrix();
            bvb0 bvb0Var = (bvb0) this.h;
            int iOrdinal = bvb0Var.ordinal();
            if (iOrdinal == 0) {
                scaleToFit = Matrix.ScaleToFit.START;
            } else if (iOrdinal == 1) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
            } else if (iOrdinal == 2) {
                scaleToFit = Matrix.ScaleToFit.END;
            } else if (iOrdinal == 3) {
                scaleToFit = Matrix.ScaleToFit.START;
            } else if (iOrdinal == 4) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
            } else if (iOrdinal != 5) {
                l8x.X("PreviewTransform", "Unexpected crop rect: " + bvb0Var);
                scaleToFit = Matrix.ScaleToFit.FILL;
            } else {
                scaleToFit = Matrix.ScaleToFit.END;
            }
            if (bvb0Var == bvb0.FIT_CENTER || bvb0Var == bvb0.FIT_START || bvb0Var == bvb0.FIT_END) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i == 1) {
                float width = size.getWidth() / 2.0f;
                float f = width + width;
                rectF = new RectF(f - rectF3.right, rectF3.top, f - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        Matrix matrixA = jls0.a(new RectF((Rect) this.f), rectF, this.f23114a, false);
        if (this.c && this.d) {
            boolean zC = jls0.c(this.f23114a);
            Rect rect = (Rect) this.f;
            if (zC) {
                matrixA.preScale(1.0f, -1.0f, rect.centerX(), ((Rect) this.f).centerY());
                return matrixA;
            }
            matrixA.preScale(-1.0f, 1.0f, rect.centerX(), ((Rect) this.f).centerY());
        }
        return matrixA;
    }

    public Matrix f() {
        z1x.y(null, h());
        RectF rectF = new RectF(0.0f, 0.0f, ((Size) this.e).getWidth(), ((Size) this.e).getHeight());
        return jls0.a(rectF, rectF, !this.d ? this.f23114a : -hp4.K(this.b), false);
    }

    public RectF g(int i, Size size) {
        z1x.y(null, h());
        Matrix matrixE = e(i, size);
        RectF rectF = new RectF(0.0f, 0.0f, ((Size) this.e).getWidth(), ((Size) this.e).getHeight());
        matrixE.mapRect(rectF);
        return rectF;
    }

    public boolean h() {
        return (((Rect) this.f) == null || ((Size) this.e) == null || !(!this.d || this.b != -1)) ? false : true;
    }
}
