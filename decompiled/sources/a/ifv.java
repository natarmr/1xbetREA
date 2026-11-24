package a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class ifv implements ffv {
    public static final AtomicBoolean K = new AtomicBoolean(true);
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public p4 J;
    public final b6a b;
    public final a6a c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public a4d l;
    public float m;
    public boolean n;
    public long o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public long u;
    public long v;
    public float w;
    public float x;
    public float y;
    public float z;

    public ifv(AndroidComposeView androidComposeView, b6a b6aVar, a6a a6aVar) {
        this.b = b6aVar;
        this.c = a6aVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.d = renderNodeCreate;
        this.e = 0L;
        this.i = 0L;
        if (K.getAndSet(false)) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                kjf0.c(renderNodeCreate, kjf0.a(renderNodeCreate));
                kjf0.d(renderNodeCreate, kjf0.b(renderNodeCreate));
            }
            jjf0.a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        renderNodeCreate.setClipToBounds(false);
        b(0);
        this.j = 0;
        this.k = 3;
        this.m = 1.0f;
        this.o = 9205357640488583168L;
        this.p = 1.0f;
        this.q = 1.0f;
        long j = y3d.b;
        this.u = j;
        this.v = j;
        this.z = 8.0f;
    }

    @Override // a.ffv
    public final void A(a4d a4dVar) {
        this.l = a4dVar;
        if (a4dVar == null) {
            c();
            return;
        }
        b(1);
        RenderNode renderNode = this.d;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(a4dVar.f217a);
        renderNode.setLayerPaint(paint);
    }

    @Override // a.ffv
    public final void B(float f) {
        this.z = f;
        this.d.setCameraDistance(-f);
    }

    @Override // a.ffv
    public final void C(float f) {
        this.w = f;
        this.d.setRotationX(f);
    }

    @Override // a.ffv
    public final int D() {
        return this.k;
    }

    @Override // a.ffv
    public final void E(float f) {
        this.x = f;
        this.d.setRotationY(f);
    }

    @Override // a.ffv
    public final float F() {
        return this.p;
    }

    @Override // a.ffv
    public final void G(float f) {
        this.t = f;
        this.d.setElevation(f);
    }

    @Override // a.ffv
    public final void H(float f) {
        this.y = f;
        this.d.setRotation(f);
    }

    @Override // a.ffv
    public final void I(Outline outline, long j) {
        this.i = j;
        this.d.setOutline(outline);
        this.h = outline != null;
        a();
    }

    @Override // a.ffv
    public final void J(float f) {
        this.q = f;
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
    public final void K(w6k w6kVar, k6z k6zVar, dfv dfvVar, s43 s43Var) throws Throwable {
        DisplayListCanvas displayListCanvas;
        int i;
        int i2;
        w6k w6kVarJ;
        k6z k6zVarO;
        x5a x5aVarI;
        long jP;
        dfv dfvVar2;
        a6a a6aVar = this.c;
        nr nrVar = a6aVar.b;
        DisplayListCanvas displayListCanvasStart = this.d.start(Math.max(((int) (this.e >> 32)) + this.B + this.D, (int) (this.i >> 32)), Math.max(((int) (this.e & 4294967295L)) + this.C + this.E, (int) (this.i & 4294967295L)));
        float f = this.B;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.C)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            uw2 uw2Var = this.b.f2042a;
            Canvas canvas = uw2Var.f36374a;
            uw2Var.f36374a = (Canvas) displayListCanvasStart;
            try {
                try {
                    if (this.B <= 0.0f) {
                        try {
                            if (this.C <= 0.0f) {
                                long jQ = n2x.Q(this.e);
                                w6k w6kVarJ2 = nrVar.j();
                                k6z k6zVarO2 = nrVar.o();
                                x5a x5aVarI2 = nrVar.i();
                                canvas = canvas;
                                long jP2 = nrVar.p();
                                displayListCanvasStart = displayListCanvasStart;
                                dfv dfvVar3 = (dfv) nrVar.c;
                                nrVar.F(w6kVar);
                                nrVar.G(k6zVar);
                                nrVar.E(uw2Var);
                                nrVar.H(jQ);
                                nrVar.c = dfvVar;
                                uw2Var.l();
                                try {
                                    s43Var.invoke(a6aVar);
                                    uw2Var.i();
                                    nrVar.F(w6kVarJ2);
                                    nrVar.G(k6zVarO2);
                                    nrVar.E(x5aVarI2);
                                    nrVar.H(jP2);
                                    nrVar.c = dfvVar3;
                                } catch (Throwable th) {
                                    uw2Var.i();
                                    nrVar.F(w6kVarJ2);
                                    nrVar.G(k6zVarO2);
                                    nrVar.E(x5aVarI2);
                                    nrVar.H(jP2);
                                    nrVar.c = dfvVar3;
                                    throw th;
                                }
                            }
                            uw2Var.f36374a = canvas;
                            this.d.end(displayListCanvasStart);
                            return;
                        } catch (Throwable th2) {
                            th = th2;
                            displayListCanvasStart = displayListCanvasStart;
                            displayListCanvas = displayListCanvasStart;
                            this.d.end(displayListCanvas);
                            throw th;
                        }
                    }
                    s43Var.invoke(a6aVar);
                    uw2Var.i();
                    nrVar.F(w6kVarJ);
                    nrVar.G(k6zVarO);
                    nrVar.E(x5aVarI);
                    nrVar.H(jP);
                    nrVar.c = dfvVar2;
                    uw2Var.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                    uw2Var.f36374a = canvas;
                    this.d.end(displayListCanvasStart);
                    return;
                } catch (Throwable th3) {
                    displayListCanvas = displayListCanvasStart;
                    try {
                        uw2Var.i();
                        nrVar.F(w6kVarJ);
                        nrVar.G(k6zVarO);
                        nrVar.E(x5aVarI);
                        nrVar.H(jP);
                        nrVar.c = dfvVar2;
                        throw th3;
                    } catch (Throwable th4) {
                        th = th4;
                        this.d.end(displayListCanvas);
                        throw th;
                    }
                }
                i = (int) (jFloatToRawIntBits >> 32);
                i2 = (int) (jFloatToRawIntBits & 4294967295L);
                uw2Var.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                long jQ2 = n2x.Q(this.e);
                w6kVarJ = nrVar.j();
                k6zVarO = nrVar.o();
                x5aVarI = nrVar.i();
                jP = nrVar.p();
                dfvVar2 = (dfv) nrVar.c;
                nrVar.F(w6kVar);
                nrVar.G(k6zVar);
                nrVar.E(uw2Var);
                nrVar.H(jQ2);
                nrVar.c = dfvVar;
                uw2Var.l();
            } catch (Throwable th5) {
                th = th5;
                displayListCanvas = displayListCanvasStart;
                this.d.end(displayListCanvas);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            displayListCanvas = displayListCanvasStart;
        }
    }

    @Override // a.ffv
    public final void L(x5a x5aVar) {
        DisplayListCanvas displayListCanvasB = vw2.b(x5aVar);
        displayListCanvasB.getClass();
        displayListCanvasB.drawRenderNode(this.d);
    }

    @Override // a.ffv
    public final void M(long j) {
        this.o = j;
        d();
    }

    @Override // a.ffv
    public final float N() {
        return this.s;
    }

    @Override // a.ffv
    public final float O() {
        return this.r;
    }

    @Override // a.ffv
    public final float P() {
        return this.w;
    }

    @Override // a.ffv
    public final void Q(int i) {
        this.j = i;
        c();
    }

    @Override // a.ffv
    public final void R(float f) {
        this.r = f;
        this.d.setTranslationX(f);
    }

    @Override // a.ffv
    public final void S(p4 p4Var) {
        this.J = p4Var;
    }

    @Override // a.ffv
    public final float T() {
        return this.t;
    }

    @Override // a.ffv
    public final float U() {
        return this.q;
    }

    public final void a() {
        boolean z = this.A;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.F) {
            this.F = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.G) {
            this.G = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void b(int i) {
        RenderNode renderNode = this.d;
        if (i == 1) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.f);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void c() {
        int i = this.j;
        if (i != 1 && this.k == 3 && this.l == null) {
            b(i);
        } else {
            b(1);
        }
    }

    public final void d() {
        long j = this.o;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            this.n = true;
            this.d.setPivotX((((int) (this.e >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (4294967295L & this.e)) / 2.0f) + this.C);
        } else {
            this.n = false;
            this.d.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.B);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.o & 4294967295L)) + this.C);
        }
    }

    public final void e() {
        RenderNode renderNode = this.d;
        int i = this.H;
        int i2 = i - this.B;
        int i3 = this.I;
        int i4 = i3 - this.C;
        long j = this.e;
        renderNode.setLeftTopRightBottom(i2, i4, i + ((int) (j >> 32)) + this.D, i3 + ((int) (j & 4294967295L)) + this.E);
    }

    @Override // a.ffv
    public final float g() {
        return this.m;
    }

    @Override // a.ffv
    public final p4 h() {
        return this.J;
    }

    @Override // a.ffv
    public final void i(float f) {
        this.s = f;
        this.d.setTranslationY(f);
    }

    @Override // a.ffv
    public final void j(int i) {
        if (this.k == i) {
            return;
        }
        this.k = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setXfermode(new PorterDuffXfermode(dj8.d0(i)));
        c();
    }

    @Override // a.ffv
    public final void k() {
        jjf0.a(this.d);
    }

    @Override // a.ffv
    public final int l() {
        return this.j;
    }

    @Override // a.ffv
    public final a4d m() {
        return this.l;
    }

    @Override // a.ffv
    public final void n(int i, int i2, long j) {
        this.H = i;
        this.I = i2;
        boolean zA = qkx.a(this.e, j);
        this.e = j;
        e();
        if (zA) {
            return;
        }
        if (this.n || ne60.c(this.o, 9205357640488583168L)) {
            this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.B);
            this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.C);
        }
    }

    @Override // a.ffv
    public final float o() {
        return this.x;
    }

    @Override // a.ffv
    public final boolean p() {
        return this.d.isValid();
    }

    @Override // a.ffv
    public final float q() {
        return this.y;
    }

    @Override // a.ffv
    public final long r() {
        return this.u;
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
        int i5 = this.B;
        if (i == i5 && i2 == this.C && i3 == this.D && i4 == this.E) {
            return;
        }
        boolean z = (i == i5 && i2 == this.C) ? false : true;
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = i4;
        e();
        if (z) {
            d();
        }
    }

    @Override // a.ffv
    public final void setAlpha(float f) {
        this.m = f;
        this.d.setAlpha(f);
    }

    @Override // a.ffv
    public final long t() {
        return this.v;
    }

    @Override // a.ffv
    public final void u(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.u = j;
            kjf0.c(this.d, fbc.U(j));
        }
    }

    @Override // a.ffv
    public final void v(float f) {
        this.p = f;
        this.d.setScaleX(f);
    }

    @Override // a.ffv
    public final float w() {
        return this.z;
    }

    @Override // a.ffv
    public final void x(boolean z) {
        this.A = z;
        a();
    }

    @Override // a.ffv
    public final void y(long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.v = j;
            kjf0.d(this.d, fbc.U(j));
        }
    }

    @Override // a.ffv
    public final Matrix z() {
        Matrix matrix = this.g;
        if (matrix == null) {
            matrix = new Matrix();
            this.g = matrix;
        }
        this.d.getMatrix(matrix);
        return matrix;
    }
}
