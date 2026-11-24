package a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class kfv implements ffv {
    public int A;
    public int B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public p4 G;
    public int H;
    public final b6a b;
    public final a6a c;
    public final RenderNode d;
    public long e;
    public Paint f;
    public Matrix g;
    public boolean h;
    public float i;
    public int j;
    public a4d k;
    public long l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public long r;
    public long s;
    public float t;
    public float u;
    public float v;
    public float w;
    public boolean x;
    public int y;
    public int z;

    public kfv() {
        b6a b6aVar = new b6a();
        a6a a6aVar = new a6a();
        this.b = b6aVar;
        this.c = a6aVar;
        RenderNode renderNode = new RenderNode("graphicsLayer");
        this.d = renderNode;
        this.e = 0L;
        renderNode.setClipToBounds(false);
        b(renderNode, 0);
        this.i = 1.0f;
        this.j = 3;
        this.l = 9205357640488583168L;
        this.m = 1.0f;
        this.n = 1.0f;
        long j = y3d.b;
        this.r = j;
        this.s = j;
        this.w = 8.0f;
        this.H = 0;
    }

    @Override // a.ffv
    public final void A(a4d a4dVar) {
        this.k = a4dVar;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setColorFilter(a4dVar != null ? a4dVar.f217a : null);
        c();
    }

    @Override // a.ffv
    public final void B(float f) {
        this.w = f;
        this.d.setCameraDistance(f);
    }

    @Override // a.ffv
    public final void C(float f) {
        this.t = f;
        this.d.setRotationX(f);
    }

    @Override // a.ffv
    public final int D() {
        return this.j;
    }

    @Override // a.ffv
    public final void E(float f) {
        this.u = f;
        this.d.setRotationY(f);
    }

    @Override // a.ffv
    public final float F() {
        return this.m;
    }

    @Override // a.ffv
    public final void G(float f) {
        this.q = f;
        this.d.setElevation(f);
    }

    @Override // a.ffv
    public final void H(float f) {
        this.v = f;
        this.d.setRotationZ(f);
    }

    @Override // a.ffv
    public final void I(Outline outline, long j) {
        this.d.setOutline(outline);
        this.h = outline != null;
        a();
    }

    @Override // a.ffv
    public final void J(float f) {
        this.n = f;
        this.d.setScaleY(f);
    }

    @Override // a.ffv
    public final void K(w6k w6kVar, k6z k6zVar, dfv dfvVar, s43 s43Var) {
        a6a a6aVar = this.c;
        RecordingCanvas recordingCanvasBeginRecording = this.d.beginRecording();
        float f = this.y;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.z)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        try {
            b6a b6aVar = this.b;
            uw2 uw2Var = b6aVar.f2042a;
            Canvas canvas = uw2Var.f36374a;
            uw2Var.f36374a = recordingCanvasBeginRecording;
            nr nrVar = a6aVar.b;
            nrVar.F(w6kVar);
            nrVar.G(k6zVar);
            nrVar.c = dfvVar;
            nrVar.H(this.e);
            nrVar.E(uw2Var);
            if (this.y > 0.0f || this.z > 0.0f) {
                int i = (int) (jFloatToRawIntBits >> 32);
                int i2 = (int) (jFloatToRawIntBits & 4294967295L);
                uw2Var.g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
                s43Var.invoke(a6aVar);
                uw2Var.g(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            } else {
                s43Var.invoke(a6aVar);
            }
            b6aVar.f2042a.f36374a = canvas;
        } finally {
            this.d.endRecording();
        }
    }

    @Override // a.ffv
    public final void L(x5a x5aVar) {
        vw2.b(x5aVar).drawRenderNode(this.d);
    }

    @Override // a.ffv
    public final void M(long j) {
        this.l = j;
        d();
    }

    @Override // a.ffv
    public final float N() {
        return this.p;
    }

    @Override // a.ffv
    public final float O() {
        return this.o;
    }

    @Override // a.ffv
    public final float P() {
        return this.t;
    }

    @Override // a.ffv
    public final void Q(int i) {
        this.H = i;
        c();
    }

    @Override // a.ffv
    public final void R(float f) {
        this.o = f;
        this.d.setTranslationX(f);
    }

    @Override // a.ffv
    public final void S(p4 p4Var) {
        this.G = p4Var;
        if (Build.VERSION.SDK_INT >= 31) {
            this.d.setRenderEffect(p4Var != null ? p4Var.n0() : null);
        }
    }

    @Override // a.ffv
    public final float T() {
        return this.q;
    }

    @Override // a.ffv
    public final float U() {
        return this.n;
    }

    public final void a() {
        boolean z = this.x;
        boolean z2 = false;
        boolean z3 = z && !this.h;
        if (z && this.h) {
            z2 = true;
        }
        if (z3 != this.C) {
            this.C = z3;
            this.d.setClipToBounds(z3);
        }
        if (z2 != this.D) {
            this.D = z2;
            this.d.setClipToOutline(z2);
        }
    }

    public final void b(RenderNode renderNode, int i) {
        Paint paint = this.f;
        if (i == 1) {
            renderNode.setUseCompositingLayer(true, paint);
            renderNode.setHasOverlappingRendering(true);
        } else if (i == 2) {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, paint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    public final void c() {
        int i = this.H;
        if (i != 1 && this.j == 3 && this.k == null && this.G == null) {
            b(this.d, i);
        } else {
            b(this.d, 1);
        }
    }

    public final void d() {
        long j = this.l;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.d;
        if (j2 == 9205357640488583168L) {
            renderNode.setPivotX((Float.intBitsToFloat((int) (this.e >> 32)) / 2.0f) + this.y);
            this.d.setPivotY((Float.intBitsToFloat((int) (this.e & 4294967295L)) / 2.0f) + this.z);
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)) + this.y);
            this.d.setPivotY(Float.intBitsToFloat((int) (this.l & 4294967295L)) + this.z);
        }
    }

    public final void e() {
        RenderNode renderNode = this.d;
        int i = this.E;
        renderNode.setPosition(i - this.y, this.F - this.z, i + ((int) Float.intBitsToFloat((int) (this.e >> 32))) + this.A, this.F + ((int) Float.intBitsToFloat((int) (this.e & 4294967295L))) + this.B);
    }

    @Override // a.ffv
    public final float g() {
        return this.i;
    }

    @Override // a.ffv
    public final p4 h() {
        return this.G;
    }

    @Override // a.ffv
    public final void i(float f) {
        this.p = f;
        this.d.setTranslationY(f);
    }

    @Override // a.ffv
    public final void j(int i) {
        this.j = i;
        Paint paint = this.f;
        if (paint == null) {
            paint = new Paint();
            this.f = paint;
        }
        paint.setBlendMode(dj8.b0(i));
        c();
    }

    @Override // a.ffv
    public final void k() {
        this.d.discardDisplayList();
    }

    @Override // a.ffv
    public final int l() {
        return this.H;
    }

    @Override // a.ffv
    public final a4d m() {
        return this.k;
    }

    @Override // a.ffv
    public final void n(int i, int i2, long j) {
        this.E = i;
        this.F = i2;
        boolean zB = h7k0.b(this.e, n2x.Q(j));
        this.e = n2x.Q(j);
        e();
        if (zB || !ne60.c(this.l, 9205357640488583168L)) {
            return;
        }
        this.d.setPivotX((((int) (j >> 32)) / 2.0f) + this.y);
        this.d.setPivotY((((int) (j & 4294967295L)) / 2.0f) + this.z);
    }

    @Override // a.ffv
    public final float o() {
        return this.u;
    }

    @Override // a.ffv
    public final boolean p() {
        return this.d.hasDisplayList();
    }

    @Override // a.ffv
    public final float q() {
        return this.v;
    }

    @Override // a.ffv
    public final long r() {
        return this.r;
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
        int i5 = this.y;
        if (i == i5 && i2 == this.z && i3 == this.A && i4 == this.B) {
            return;
        }
        boolean z = (i == i5 && i2 == this.z) ? false : true;
        this.y = i;
        this.z = i2;
        this.A = i3;
        this.B = i4;
        e();
        if (z) {
            d();
        }
    }

    @Override // a.ffv
    public final void setAlpha(float f) {
        this.i = f;
        this.d.setAlpha(f);
    }

    @Override // a.ffv
    public final long t() {
        return this.s;
    }

    @Override // a.ffv
    public final void u(long j) {
        this.r = j;
        this.d.setAmbientShadowColor(fbc.U(j));
    }

    @Override // a.ffv
    public final void v(float f) {
        this.m = f;
        this.d.setScaleX(f);
    }

    @Override // a.ffv
    public final float w() {
        return this.w;
    }

    @Override // a.ffv
    public final void x(boolean z) {
        this.x = z;
        a();
    }

    @Override // a.ffv
    public final void y(long j) {
        this.s = j;
        this.d.setSpotShadowColor(fbc.U(j));
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
