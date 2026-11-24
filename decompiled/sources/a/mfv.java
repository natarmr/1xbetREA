package a;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class mfv implements ffv {
    public static final lfv I = new lfv();
    public float A;
    public float B;
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public p4 H;
    public final chl b;
    public final b6a c;
    public final rhu0 d;
    public final Resources e;
    public final Rect f;
    public Paint g;
    public int h;
    public int i;
    public long j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public a4d o;
    public int p;
    public float q;
    public boolean r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public long y;
    public long z;

    public mfv(chl chlVar) {
        b6a b6aVar = new b6a();
        a6a a6aVar = new a6a();
        this.b = chlVar;
        this.c = b6aVar;
        rhu0 rhu0Var = new rhu0(chlVar, b6aVar, a6aVar);
        this.d = rhu0Var;
        this.e = chlVar.getResources();
        this.f = new Rect();
        chlVar.addView(rhu0Var);
        rhu0Var.setClipBounds(null);
        this.j = 0L;
        View.generateViewId();
        this.n = 3;
        this.p = 0;
        this.q = 1.0f;
        this.s = 9205357640488583168L;
        this.t = 1.0f;
        this.u = 1.0f;
        long j = y3d.b;
        this.y = j;
        this.z = j;
    }

    @Override // a.ffv
    public final void A(a4d a4dVar) {
        this.o = a4dVar;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setColorFilter(a4dVar != null ? a4dVar.f217a : null);
        c();
    }

    @Override // a.ffv
    public final void B(float f) {
        this.d.setCameraDistance(f * this.e.getDisplayMetrics().densityDpi);
    }

    @Override // a.ffv
    public final void C(float f) {
        this.A = f;
        this.d.setRotationX(f);
    }

    @Override // a.ffv
    public final int D() {
        return this.n;
    }

    @Override // a.ffv
    public final void E(float f) {
        this.B = f;
        this.d.setRotationY(f);
    }

    @Override // a.ffv
    public final float F() {
        return this.t;
    }

    @Override // a.ffv
    public final void G(float f) {
        this.x = f;
        this.d.setElevation(f);
    }

    @Override // a.ffv
    public final void H(float f) {
        this.C = f;
        this.d.setRotation(f);
    }

    @Override // a.ffv
    public final void I(Outline outline, long j) {
        rhu0 rhu0Var = this.d;
        rhu0Var.e = outline;
        rhu0Var.invalidateOutline();
        if ((this.m || rhu0Var.getClipToOutline()) && outline != null) {
            rhu0Var.setClipToOutline(true);
            if (this.m) {
                this.m = false;
                this.k = true;
            }
        }
        this.l = outline != null;
    }

    @Override // a.ffv
    public final void J(float f) {
        this.u = f;
        this.d.setScaleY(f);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // a.ffv
    public final void K(w6k w6kVar, k6z k6zVar, dfv dfvVar, s43 s43Var) {
        rhu0 rhu0Var = this.d;
        ViewParent parent = rhu0Var.getParent();
        chl chlVar = this.b;
        if (parent == null) {
            chlVar.addView(rhu0Var);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.D)) << 32) | (((long) Float.floatToRawIntBits(this.E)) & 4294967295L);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        rhu0Var.g = w6kVar;
        rhu0Var.h = k6zVar;
        rhu0Var.i = s43Var;
        rhu0Var.j = dfvVar;
        rhu0Var.k = fIntBitsToFloat;
        rhu0Var.l = fIntBitsToFloat2;
        if (rhu0Var.isAttachedToWindow()) {
            rhu0Var.setVisibility(4);
            rhu0Var.setVisibility(0);
            try {
                uw2 uw2Var = this.c.f2042a;
                lfv lfvVar = I;
                Canvas canvas = uw2Var.f36374a;
                uw2Var.f36374a = lfvVar;
                chlVar.a(uw2Var, rhu0Var, rhu0Var.getDrawingTime());
                uw2Var.f36374a = canvas;
            } catch (ClassCastException unused) {
            }
        }
    }

    @Override // a.ffv
    public final void L(x5a x5aVar) {
        Rect rect;
        boolean z = this.k;
        rhu0 rhu0Var = this.d;
        if (z) {
            if ((this.m || rhu0Var.getClipToOutline()) && !this.l) {
                rect = this.f;
                rect.left = 0;
                rect.top = 0;
                rect.right = rhu0Var.getWidth();
                rect.bottom = rhu0Var.getHeight();
            } else {
                rect = null;
            }
            rhu0Var.setClipBounds(rect);
        }
        if (vw2.b(x5aVar).isHardwareAccelerated()) {
            this.b.a(x5aVar, rhu0Var, rhu0Var.getDrawingTime());
        }
    }

    @Override // a.ffv
    public final void M(long j) {
        this.s = j;
        this.r = (j & 9223372034707292159L) == 9205357640488583168L;
        d();
    }

    @Override // a.ffv
    public final float N() {
        return this.w;
    }

    @Override // a.ffv
    public final float O() {
        return this.v;
    }

    @Override // a.ffv
    public final float P() {
        return this.A;
    }

    @Override // a.ffv
    public final void Q(int i) {
        this.p = i;
        c();
    }

    @Override // a.ffv
    public final void R(float f) {
        this.v = f;
        this.d.setTranslationX(f);
    }

    @Override // a.ffv
    public final void S(p4 p4Var) {
        this.H = p4Var;
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.setRenderEffect(p4Var != null ? p4Var.n0() : null);
        }
    }

    @Override // a.ffv
    public final float T() {
        return this.x;
    }

    @Override // a.ffv
    public final float U() {
        return this.u;
    }

    public final void a(int i) {
        Paint paint = this.g;
        rhu0 rhu0Var = this.d;
        boolean z = true;
        if (i == 1) {
            rhu0Var.setLayerType(2, paint);
        } else if (i == 2) {
            rhu0Var.setLayerType(0, paint);
            z = false;
        } else {
            rhu0Var.setLayerType(0, paint);
        }
        rhu0Var.setCanUseCompositingLayer$ui_graphics(z);
    }

    public final void b() {
        boolean z = this.m;
        rhu0 rhu0Var = this.d;
        if (z || rhu0Var.getClipToOutline()) {
            this.k = true;
        }
        int i = this.h;
        int i2 = i - this.D;
        int i3 = this.i;
        int i4 = i3 - this.E;
        long j = this.j;
        rhu0Var.layout(i2, i4, i + ((int) (j >> 32)) + this.F, i3 + ((int) (j & 4294967295L)) + this.G);
    }

    public final void c() {
        int i = this.p;
        if (i != 1 && this.n == 3 && this.o == null) {
            a(i);
        } else {
            a(1);
        }
    }

    public final void d() {
        boolean z = this.r;
        rhu0 rhu0Var = this.d;
        if (z || ne60.c(this.s, 9205357640488583168L)) {
            rhu0Var.setPivotX((((int) (this.j >> 32)) / 2.0f) + this.D);
            rhu0Var.setPivotY((((int) (this.j & 4294967295L)) / 2.0f) + this.E);
        } else {
            rhu0Var.setPivotX(Float.intBitsToFloat((int) (this.s >> 32)) + this.D);
            rhu0Var.setPivotY(Float.intBitsToFloat((int) (this.s & 4294967295L)) + this.E);
        }
    }

    @Override // a.ffv
    public final float g() {
        return this.q;
    }

    @Override // a.ffv
    public final p4 h() {
        return this.H;
    }

    @Override // a.ffv
    public final void i(float f) {
        this.w = f;
        this.d.setTranslationY(f);
    }

    @Override // a.ffv
    public final void j(int i) {
        this.n = i;
        Paint paint = this.g;
        if (paint == null) {
            paint = new Paint();
            this.g = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(dj8.d0(i)));
        c();
    }

    @Override // a.ffv
    public final void k() {
        this.b.removeViewInLayout(this.d);
    }

    @Override // a.ffv
    public final int l() {
        return this.p;
    }

    @Override // a.ffv
    public final a4d m() {
        return this.o;
    }

    @Override // a.ffv
    public final void n(int i, int i2, long j) {
        if (!qkx.a(this.j, j)) {
            this.h = i;
            this.i = i2;
            this.j = j;
            b();
            return;
        }
        int i3 = this.h;
        rhu0 rhu0Var = this.d;
        if (i3 != i) {
            rhu0Var.offsetLeftAndRight(i - i3);
        }
        int i4 = this.i;
        if (i4 != i2) {
            rhu0Var.offsetTopAndBottom(i2 - i4);
        }
        this.h = i;
        this.i = i2;
    }

    @Override // a.ffv
    public final float o() {
        return this.B;
    }

    @Override // a.ffv
    public final float q() {
        return this.C;
    }

    @Override // a.ffv
    public final long r() {
        return this.y;
    }

    @Override // a.ffv
    public final void s(int i, int i2, int i3, int i4) {
        if (!(i >= 0 && i2 >= 0 && i3 >= 0 && i4 >= 0)) {
            StringBuilder sbT = dw9.t("Outsets cannot be negative! Left: ", i, ", Top: ", ", Right: ", i2);
            sbT.append(i3);
            sbT.append(", Bottom: ");
            sbT.append(i4);
            wcx.a(sbT.toString());
        }
        int i5 = this.D;
        if (i == i5 && i2 == this.E && i3 == this.F && i4 == this.G) {
            return;
        }
        boolean z = (i == i5 && i2 == this.E) ? false : true;
        this.D = i;
        this.E = i2;
        this.F = i3;
        this.G = i4;
        b();
        if (z) {
            d();
        }
    }

    @Override // a.ffv
    public final void setAlpha(float f) {
        this.q = f;
        this.d.setAlpha(f);
    }

    @Override // a.ffv
    public final long t() {
        return this.z;
    }

    @Override // a.ffv
    public final void u(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.y = j;
            this.d.setOutlineAmbientShadowColor(fbc.U(j));
        }
    }

    @Override // a.ffv
    public final void v(float f) {
        this.t = f;
        this.d.setScaleX(f);
    }

    @Override // a.ffv
    public final float w() {
        return this.d.getCameraDistance() / this.e.getDisplayMetrics().densityDpi;
    }

    @Override // a.ffv
    public final void x(boolean z) {
        boolean z2 = false;
        this.m = z && !this.l;
        this.k = true;
        if (z && this.l) {
            z2 = true;
        }
        this.d.setClipToOutline(z2);
    }

    @Override // a.ffv
    public final void y(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.z = j;
            this.d.setOutlineSpotShadowColor(fbc.U(j));
        }
    }

    @Override // a.ffv
    public final Matrix z() {
        return this.d.getMatrix();
    }
}
