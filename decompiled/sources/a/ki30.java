package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class ki30 extends Drawable implements blj0 {
    public static final Paint g1;
    public static final ji30[] h1;
    public lul0 A;
    public final kul0[] B;
    public float[] Y;
    public float[] Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final onv f18317a;
    public ii30 b;
    public final tkj0[] c;
    public final tkj0[] d;
    public final BitSet e;
    public boolean f;
    public viq f1;
    public boolean g;
    public final Matrix h;
    public final Path i;
    public final Path j;
    public final RectF k;
    public final RectF l;
    public final Region m;
    public final Region n;
    public final Paint o;
    public final Paint p;
    public final ujj0 q;
    public final pyu r;
    public final pwi s;
    public PorterDuffColorFilter t;
    public PorterDuffColorFilter u;
    public int v;
    public final RectF w;
    public boolean x;
    public boolean y;
    public akj0 z;

    static {
        daf dafVar = new daf();
        dafVar.S(0.0f);
        dafVar.c();
        Paint paint = new Paint(1);
        g1 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        h1 = new ji30[4];
        int i = 0;
        while (true) {
            ji30[] ji30VarArr = h1;
            if (i >= ji30VarArr.length) {
                return;
            }
            ji30VarArr[i] = new ji30(i);
            i++;
        }
    }

    public ki30(ii30 ii30Var) {
        this.f18317a = new onv(this);
        this.c = new tkj0[4];
        this.d = new tkj0[4];
        this.e = new BitSet(8);
        this.h = new Matrix();
        this.i = new Path();
        this.j = new Path();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.n = new Region();
        Paint paint = new Paint(1);
        this.o = paint;
        Paint paint2 = new Paint(1);
        this.p = paint2;
        this.q = new ujj0();
        this.s = pwi.j();
        this.w = new RectF();
        this.x = true;
        this.y = true;
        this.B = new kul0[4];
        this.b = ii30Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        y();
        w(getState());
        this.r = new pyu(this);
    }

    public final void b(RectF rectF, Path path) {
        this.s.b(this.b.f14810a.d(), this.Y, this.b.i, rectF, this.r, path);
        if (this.b.h != 1.0f) {
            Matrix matrix = this.h;
            matrix.reset();
            float f = this.b.h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.w, true);
    }

    public final float c(RectF rectF, akj0 akj0Var, float[] fArr) {
        if (fArr == null) {
            if (akj0Var.k(rectF)) {
                return akj0Var.e.a(rectF);
            }
            return -1.0f;
        }
        if (this.y) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final int d(int i) {
        ii30 ii30Var = this.b;
        float f = ii30Var.m + 0.0f + ii30Var.l;
        csn csnVar = ii30Var.b;
        return csnVar != null ? csnVar.a(f, i) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        Paint paint2 = this.o;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.b.k;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        Paint paint3 = this.p;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.b.j);
        int alpha2 = paint3.getAlpha();
        int i2 = this.b.k;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = m() || !p();
        Paint.Style style = this.b.p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.f;
            paint = paint2;
            Path path = this.i;
            if (z2) {
                if (z) {
                    b(h(), path);
                }
                this.f = false;
            }
            if (m()) {
                canvas.save();
                canvas.translate((int) (((double) this.b.o) * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.b.o)));
                if (this.x) {
                    Rect bounds = getBounds();
                    RectF rectF = this.w;
                    int iWidth = (int) (rectF.width() - bounds.width());
                    int iHeight = (int) (rectF.height() - bounds.height());
                    if (iWidth < 0 || iHeight < 0) {
                        itt0.n(dw9.t("Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", iWidth, " extra height: ", " path bounds: ", iHeight), rectF);
                        return;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(vqd.a(this.b.n, 2, (int) rectF.width(), iWidth), vqd.a(this.b.n, 2, (int) rectF.height(), iHeight), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    int i3 = bounds.left;
                    int i4 = this.b.n;
                    float f = (i3 - i4) - iWidth;
                    float f2 = (bounds.top - i4) - iHeight;
                    canvas2.translate(-f, -f2);
                    e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            f(canvas, paint, path, this.b.f14810a.d(), this.Y, h());
        } else {
            paint = paint2;
        }
        if (n()) {
            if (this.g) {
                akj0 akj0VarJ = j();
                daf dafVarL = akj0VarJ.l();
                dne dneVar = akj0VarJ.e;
                onv onvVar = this.f18317a;
                dafVarL.f = onvVar.l(dneVar);
                dafVarL.g = onvVar.l(akj0VarJ.f);
                dafVarL.i = onvVar.l(akj0VarJ.h);
                dafVarL.h = onvVar.l(akj0VarJ.g);
                this.z = dafVarL.c();
                float[] fArr = this.Y;
                if (fArr != null) {
                    if (this.Z == null) {
                        this.Z = new float[fArr.length];
                    }
                    float fK = k();
                    int i5 = 0;
                    while (true) {
                        float[] fArr2 = this.Y;
                        if (i5 >= fArr2.length) {
                            break;
                        }
                        this.Z[i5] = Math.max(0.0f, fArr2[i5] - fK);
                        i5++;
                    }
                } else {
                    this.Z = null;
                }
                if (z) {
                    akj0 akj0Var = this.z;
                    float[] fArr3 = this.Z;
                    float f3 = this.b.i;
                    RectF rectFH = h();
                    RectF rectF2 = this.l;
                    rectF2.set(rectFH);
                    float fK2 = k();
                    rectF2.inset(fK2, fK2);
                    this.s.b(akj0Var, fArr3, f3, rectF2, null, this.j);
                }
                this.g = false;
            }
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.e.cardinality() > 0) {
            Log.w("ki30", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.b.o;
        Path path = this.i;
        ujj0 ujj0Var = this.q;
        if (i != 0) {
            canvas.drawPath(path, (Paint) ujj0Var.d);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            tkj0 tkj0Var = this.c[i2];
            int i3 = this.b.n;
            Matrix matrix = tkj0.b;
            tkj0Var.a(matrix, ujj0Var, i3, canvas);
            this.d[i2].a(matrix, ujj0Var, this.b.n, canvas);
        }
        if (this.x) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.b.o));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.b.o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, g1);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, akj0 akj0Var, float[] fArr, RectF rectF) {
        float fC = c(rectF, akj0Var, fArr);
        if (fC < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fC * this.b.i;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public void g(Canvas canvas) {
        akj0 akj0Var = this.z;
        float[] fArr = this.Z;
        RectF rectFH = h();
        RectF rectF = this.l;
        rectF.set(rectFH);
        float fK = k();
        rectF.inset(fK, fK);
        f(canvas, this.p, this.j, akj0Var, fArr, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.b.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.b.getClass();
        RectF rectFH = h();
        if (rectFH.isEmpty()) {
            return;
        }
        float fC = c(rectFH, this.b.f14810a.d(), this.Y);
        if (fC >= 0.0f) {
            outline.setRoundRect(getBounds(), fC * this.b.i);
            return;
        }
        boolean z = this.f;
        Path path = this.i;
        if (z) {
            b(rectFH, path);
            this.f = false;
        }
        plc.L(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.b.g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.m;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.i;
        b(rectFH, path);
        Region region2 = this.n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        Rect bounds = getBounds();
        RectF rectF = this.k;
        rectF.set(bounds);
        return rectF;
    }

    public final float i() {
        float[] fArr = this.Y;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFH = h();
        akj0 akj0VarJ = j();
        pwi pwiVar = this.s;
        pwiVar.getClass();
        float fA = akj0VarJ.e.a(rectFH);
        akj0 akj0VarJ2 = j();
        pwiVar.getClass();
        float fA2 = akj0VarJ2.h.a(rectFH) + fA;
        akj0 akj0VarJ3 = j();
        pwiVar.getClass();
        float fA3 = fA2 - akj0VarJ3.g.a(rectFH);
        akj0 akj0VarJ4 = j();
        pwiVar.getClass();
        return (fA3 - akj0VarJ4.f.a(rectFH)) / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f = true;
        this.g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.b.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.b.getClass();
        ColorStateList colorStateList2 = this.b.d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.b.c;
        return (colorStateList3 != null && colorStateList3.isStateful()) || this.b.f14810a.f();
    }

    public final akj0 j() {
        return this.b.f14810a.d();
    }

    public final float k() {
        if (n()) {
            return this.p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float l() {
        float[] fArr = this.Y;
        return fArr != null ? fArr[3] : this.b.f14810a.d().e.a(h());
    }

    public final boolean m() {
        ii30 ii30Var = this.b;
        ii30Var.getClass();
        return ii30Var.n > 0 && !p() && !this.i.isConvex() && Build.VERSION.SDK_INT < 29;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.b = new ii30(this.b);
        return this;
    }

    public final boolean n() {
        Paint.Style style = this.b.p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p.getStrokeWidth() > 0.0f;
    }

    public final void o(Context context) {
        this.b.b = new csn(context);
        z();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f = true;
        this.g = true;
        super.onBoundsChange(rect);
        if (!this.b.f14810a.f() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        boolean z = false;
        for (kul0 kul0Var : this.B) {
            if (kul0Var != null && kul0Var.f) {
                z = true;
                break;
            }
        }
        x(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.b.f14810a.f()) {
            x(iArr, false);
        }
        boolean z = w(iArr) || y();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p() {
        if (this.b.f14810a.b(getState()).k(h())) {
            return this.Y == null || this.y;
        }
        return false;
    }

    public final void q(lul0 lul0Var) {
        if (this.A == lul0Var) {
            return;
        }
        this.A = lul0Var;
        int i = 0;
        while (true) {
            kul0[] kul0VarArr = this.B;
            if (i >= kul0VarArr.length) {
                x(getState(), true);
                invalidateSelf();
                return;
            }
            if (kul0VarArr[i] == null) {
                kul0VarArr[i] = new kul0(this, h1[i]);
            }
            kul0 kul0Var = kul0VarArr[i];
            lul0 lul0Var2 = new lul0();
            lul0Var2.a((float) lul0Var.b);
            double d = lul0Var.f20677a;
            lul0Var2.b((float) (d * d));
            kul0Var.m = lul0Var2;
            i++;
        }
    }

    public final void r(float f) {
        ii30 ii30Var = this.b;
        if (ii30Var.m != f) {
            ii30Var.m = f;
            z();
        }
    }

    public final void s(ColorStateList colorStateList) {
        ii30 ii30Var = this.b;
        if (ii30Var.c != colorStateList) {
            ii30Var.c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        ii30 ii30Var = this.b;
        if (ii30Var.k != i) {
            ii30Var.k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.b.getClass();
        super.invalidateSelf();
    }

    @Override // a.blj0
    public final void setShapeAppearanceModel(akj0 akj0Var) {
        this.b.f14810a = akj0Var;
        this.Y = null;
        this.Z = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.b.e = colorStateList;
        y();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        ii30 ii30Var = this.b;
        if (ii30Var.f != mode) {
            ii30Var.f = mode;
            y();
            super.invalidateSelf();
        }
    }

    public final void t(float f) {
        ii30 ii30Var = this.b;
        if (ii30Var.i != f) {
            ii30Var.i = f;
            this.f = true;
            this.g = true;
            invalidateSelf();
        }
    }

    public final void u() {
        this.q.t(-12303292);
        this.b.getClass();
        super.invalidateSelf();
    }

    public final void v(zjj0 zjj0Var) {
        if (zjj0Var instanceof akj0) {
            setShapeAppearanceModel((akj0) zjj0Var);
            return;
        }
        u7m0 u7m0Var = (u7m0) zjj0Var;
        ii30 ii30Var = this.b;
        if (ii30Var.f14810a != u7m0Var) {
            ii30Var.f14810a = u7m0Var;
            x(getState(), true);
            invalidateSelf();
        }
    }

    public final boolean w(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.b.c == null || color2 == (colorForState2 = this.b.c.getColorForState(iArr, (color2 = (paint2 = this.o).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.b.d == null || color == (colorForState = this.b.d.getColorForState(iArr, (color = (paint = this.p).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    public final void x(int[] iArr, boolean z) {
        boolean z2;
        dne dneVar;
        RectF rectFH = h();
        if (!this.b.f14810a.f() || rectFH.isEmpty()) {
            return;
        }
        int i = 0;
        boolean z3 = z | (this.A == null);
        if (this.Y == null) {
            this.Y = new float[4];
        }
        akj0 akj0VarB = this.b.f14810a.b(iArr);
        float[] fArr = this.Y;
        if (fArr.length > 1) {
            float f = fArr[0];
            int i2 = 1;
            while (true) {
                if (i2 < fArr.length) {
                    if (fArr[i2] == f) {
                        i2++;
                    }
                } else if (akj0VarB.k(h())) {
                    z2 = true;
                }
                z2 = false;
            }
        } else if (akj0VarB.k(h())) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.y = z2;
        if (!z2) {
            this.f = true;
            this.g = true;
        }
        while (i < 4) {
            this.s.getClass();
            if (i == 1) {
                dneVar = akj0VarB.g;
            } else if (i != 2) {
                dneVar = i != 3 ? akj0VarB.f : akj0VarB.e;
            } else {
                dneVar = akj0VarB.h;
            }
            float fA = dneVar.a(rectFH);
            if (z3) {
                this.Y[i] = fA;
            }
            kul0[] kul0VarArr = this.B;
            kul0 kul0Var = kul0VarArr[i];
            if (kul0Var != null) {
                kul0Var.a(fA);
                if (z3) {
                    kul0VarArr[i].d();
                }
            }
            i++;
        }
        if (z3) {
            invalidateSelf();
        }
    }

    public final boolean y() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.u;
        ii30 ii30Var = this.b;
        ColorStateList colorStateList = ii30Var.e;
        PorterDuff.Mode mode = ii30Var.f;
        if (colorStateList == null || mode == null) {
            int color = this.o.getColor();
            int iD = d(color);
            this.v = iD;
            porterDuffColorFilter = iD != color ? new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iD2 = d(colorStateList.getColorForState(getState(), 0));
            this.v = iD2;
            porterDuffColorFilter = new PorterDuffColorFilter(iD2, mode);
        }
        this.t = porterDuffColorFilter;
        this.b.getClass();
        this.u = null;
        this.b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.t) && Objects.equals(porterDuffColorFilter3, this.u)) ? false : true;
    }

    public final void z() {
        ii30 ii30Var = this.b;
        float f = ii30Var.m + 0.0f;
        ii30Var.n = (int) Math.ceil(0.75f * f);
        this.b.o = (int) Math.ceil(f * 0.25f);
        y();
        if (m() || !p()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public ki30(Context context, AttributeSet attributeSet, int i, int i2) {
        this(akj0.h(context, attributeSet, i, i2).c());
    }

    public ki30(akj0 akj0Var) {
        this(new ii30(akj0Var));
    }

    public ki30(zjj0 zjj0Var) {
        this(new ii30(zjj0Var));
    }

    public ki30() {
        this(new akj0());
    }
}
