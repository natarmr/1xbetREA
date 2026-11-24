package a;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: loaded from: classes.dex */
public final class a9v extends f3k implements ehl {
    public final /* synthetic */ byte q = 1;
    public final az2 r;
    public final jjn s;
    public Object t;

    public a9v(jnn0 jnn0Var, az2 az2Var, jjn jjnVar, lh80 lh80Var) {
        this.r = az2Var;
        this.s = jjnVar;
        this.t = lh80Var;
        Z0(jnn0Var);
    }

    public static boolean c1(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public static boolean d1(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public RenderNode e1() {
        RenderNode renderNode = (RenderNode) this.t;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeF = xl50.f();
        this.t = renderNodeF;
        return renderNodeF;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01fe A[PHI: r21
  0x01fe: PHI (r21v2 boolean) = (r21v1 boolean), (r21v11 boolean) binds: [B:94:0x01b5, B:102:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.ehl
    public final void u0(g7z g7zVar) {
        boolean zD1;
        long j;
        char c;
        boolean z;
        boolean zC1;
        Canvas canvas;
        byte b = this.q;
        az2 az2Var = this.r;
        jjn jjnVar = this.s;
        switch (b) {
            case 0:
                lh80 lh80Var = (lh80) this.t;
                a6a a6aVar = g7zVar.f10839a;
                az2Var.l(a6aVar.d());
                if (h7k0.f(a6aVar.d())) {
                    g7zVar.a();
                    return;
                }
                g7zVar.a();
                ((hgk0) az2Var.d).getValue();
                Canvas canvasB = vw2.b(a6aVar.b.i());
                if (jjn.f(jjnVar.f)) {
                    EdgeEffect edgeEffectC = jjnVar.c();
                    float f = -Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L));
                    zD1 = d1(270.0f, (((long) Float.floatToRawIntBits(g7zVar.w0(lh80Var.b(g7zVar.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32), edgeEffectC, canvasB);
                } else {
                    zD1 = false;
                }
                if (jjn.f(jjnVar.d)) {
                    EdgeEffect edgeEffectE = jjnVar.e();
                    zD1 = d1(0.0f, (((long) Float.floatToRawIntBits(g7zVar.w0(lh80Var.c))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), edgeEffectE, canvasB) || zD1;
                }
                if (jjn.f(jjnVar.g)) {
                    EdgeEffect edgeEffectD = jjnVar.d();
                    zD1 = d1(90.0f, (((long) Float.floatToRawIntBits(g7zVar.w0(lh80Var.c(g7zVar.getLayoutDirection())) + (-((float) si30.b(Float.intBitsToFloat((int) (a6aVar.d() >> 32))))))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), edgeEffectD, canvasB) || zD1;
                }
                if (jjn.f(jjnVar.e)) {
                    EdgeEffect edgeEffectB = jjnVar.b();
                    float fW0 = g7zVar.w0(lh80Var.e);
                    zD1 = d1(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (a6aVar.d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (a6aVar.d() & 4294967295L))) + fW0)) & 4294967295L), edgeEffectB, canvasB) || zD1;
                }
                if (zD1) {
                    az2Var.g();
                    return;
                }
                return;
            default:
                a6a a6aVar2 = g7zVar.f10839a;
                az2Var.l(a6aVar2.d());
                Canvas canvasB2 = vw2.b(a6aVar2.b.i());
                ((hgk0) az2Var.d).getValue();
                if (h7k0.f(a6aVar2.d())) {
                    g7zVar.a();
                    return;
                }
                if (!canvasB2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = jjnVar.d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = jjnVar.e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = jjnVar.f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = jjnVar.g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = jjnVar.h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = jjnVar.i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = jjnVar.j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = jjnVar.k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    g7zVar.a();
                    return;
                }
                float fW1 = g7zVar.w0(30.0f);
                boolean z2 = jjn.f(jjnVar.d) || jjn.g(jjnVar.h) || jjn.f(jjnVar.e) || jjn.g(jjnVar.i);
                boolean z3 = jjn.f(jjnVar.f) || jjn.g(jjnVar.j) || jjn.f(jjnVar.g) || jjn.g(jjnVar.k);
                if (z2 && z3) {
                    j = 4294967295L;
                    c = ' ';
                    e1().setPosition(0, 0, canvasB2.getWidth(), canvasB2.getHeight());
                } else {
                    j = 4294967295L;
                    c = ' ';
                    if (z2) {
                        e1().setPosition(0, 0, (si30.b(fW1) * 2) + canvasB2.getWidth(), canvasB2.getHeight());
                    } else {
                        if (!z3) {
                            g7zVar.a();
                            return;
                        }
                        e1().setPosition(0, 0, canvasB2.getWidth(), (si30.b(fW1) * 2) + canvasB2.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = e1().beginRecording();
                if (jjn.g(jjnVar.j)) {
                    EdgeEffect edgeEffectA = jjnVar.j;
                    if (edgeEffectA == null) {
                        edgeEffectA = jjnVar.a(ma80.b);
                        jjnVar.j = edgeEffectA;
                    }
                    c1(90.0f, edgeEffectA, recordingCanvasBeginRecording);
                    edgeEffectA.finish();
                }
                if (jjn.f(jjnVar.f)) {
                    EdgeEffect edgeEffectC2 = jjnVar.c();
                    zC1 = c1(270.0f, edgeEffectC2, recordingCanvasBeginRecording);
                    if (jjn.g(jjnVar.f)) {
                        z = z3;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (az2Var.f() & j));
                        EdgeEffect edgeEffectA2 = jjnVar.j;
                        if (edgeEffectA2 == null) {
                            edgeEffectA2 = jjnVar.a(ma80.b);
                            jjnVar.j = edgeEffectA2;
                        }
                        int i = Build.VERSION.SDK_INT;
                        float f2 = i >= 31 ? gy2.f(edgeEffectC2) : 0.0f;
                        float f3 = 1.0f - fIntBitsToFloat;
                        if (i >= 31) {
                            gy2.i(edgeEffectA2, f2, f3);
                        } else {
                            edgeEffectA2.onPull(f2, f3);
                        }
                    } else {
                        z = z3;
                    }
                } else {
                    z = z3;
                    zC1 = false;
                }
                if (jjn.g(jjnVar.h)) {
                    EdgeEffect edgeEffectA3 = jjnVar.h;
                    if (edgeEffectA3 == null) {
                        edgeEffectA3 = jjnVar.a(ma80.f21447a);
                        jjnVar.h = edgeEffectA3;
                    }
                    c1(180.0f, edgeEffectA3, recordingCanvasBeginRecording);
                    edgeEffectA3.finish();
                }
                if (jjn.f(jjnVar.d)) {
                    EdgeEffect edgeEffectE2 = jjnVar.e();
                    zC1 = c1(0.0f, edgeEffectE2, recordingCanvasBeginRecording) || zC1;
                    if (jjn.g(jjnVar.d)) {
                        canvas = canvasB2;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (az2Var.f() >> c));
                        EdgeEffect edgeEffectA4 = jjnVar.h;
                        if (edgeEffectA4 == null) {
                            edgeEffectA4 = jjnVar.a(ma80.f21447a);
                            jjnVar.h = edgeEffectA4;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float f4 = i2 >= 31 ? gy2.f(edgeEffectE2) : 0.0f;
                        if (i2 >= 31) {
                            gy2.i(edgeEffectA4, f4, fIntBitsToFloat2);
                        } else {
                            edgeEffectA4.onPull(f4, fIntBitsToFloat2);
                        }
                    } else {
                        canvas = canvasB2;
                    }
                } else {
                    canvas = canvasB2;
                }
                if (jjn.g(jjnVar.k)) {
                    EdgeEffect edgeEffectA5 = jjnVar.k;
                    if (edgeEffectA5 == null) {
                        edgeEffectA5 = jjnVar.a(ma80.b);
                        jjnVar.k = edgeEffectA5;
                    }
                    c1(270.0f, edgeEffectA5, recordingCanvasBeginRecording);
                    edgeEffectA5.finish();
                }
                if (jjn.f(jjnVar.g)) {
                    EdgeEffect edgeEffectD2 = jjnVar.d();
                    zC1 = c1(90.0f, edgeEffectD2, recordingCanvasBeginRecording) || zC1;
                    if (jjn.g(jjnVar.g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (az2Var.f() & j));
                        EdgeEffect edgeEffectA6 = jjnVar.k;
                        if (edgeEffectA6 == null) {
                            edgeEffectA6 = jjnVar.a(ma80.b);
                            jjnVar.k = edgeEffectA6;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float f5 = i3 >= 31 ? gy2.f(edgeEffectD2) : 0.0f;
                        if (i3 >= 31) {
                            gy2.i(edgeEffectA6, f5, fIntBitsToFloat3);
                        } else {
                            edgeEffectA6.onPull(f5, fIntBitsToFloat3);
                        }
                    }
                }
                if (jjn.g(jjnVar.i)) {
                    EdgeEffect edgeEffectA7 = jjnVar.i;
                    if (edgeEffectA7 == null) {
                        edgeEffectA7 = jjnVar.a(ma80.f21447a);
                        jjnVar.i = edgeEffectA7;
                    }
                    c1(0.0f, edgeEffectA7, recordingCanvasBeginRecording);
                    edgeEffectA7.finish();
                }
                if (jjn.f(jjnVar.e)) {
                    EdgeEffect edgeEffectB2 = jjnVar.b();
                    boolean z4 = c1(180.0f, edgeEffectB2, recordingCanvasBeginRecording) || zC1;
                    if (jjn.g(jjnVar.e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (az2Var.f() >> c));
                        EdgeEffect edgeEffectA8 = jjnVar.i;
                        if (edgeEffectA8 == null) {
                            edgeEffectA8 = jjnVar.a(ma80.f21447a);
                            jjnVar.i = edgeEffectA8;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float f6 = i4 >= 31 ? gy2.f(edgeEffectB2) : 0.0f;
                        float f7 = 1.0f - fIntBitsToFloat4;
                        if (i4 >= 31) {
                            gy2.i(edgeEffectA8, f6, f7);
                        } else {
                            edgeEffectA8.onPull(f6, f7);
                        }
                    }
                    zC1 = z4;
                }
                if (zC1) {
                    az2Var.g();
                }
                float f8 = z ? 0.0f : fW1;
                float f9 = z2 ? 0.0f : fW1;
                k6z layoutDirection = g7zVar.getLayoutDirection();
                uw2 uw2Var = new uw2();
                uw2Var.f36374a = recordingCanvasBeginRecording;
                long jD = a6aVar2.d();
                w6k w6kVarJ = a6aVar2.b.j();
                k6z k6zVarO = a6aVar2.b.o();
                x5a x5aVarI = a6aVar2.b.i();
                long jP = a6aVar2.b.p();
                nr nrVar = a6aVar2.b;
                Canvas canvas2 = canvas;
                dfv dfvVar = (dfv) nrVar.c;
                nrVar.F(g7zVar);
                nrVar.G(layoutDirection);
                nrVar.E(uw2Var);
                nrVar.H(jD);
                nrVar.c = null;
                uw2Var.l();
                try {
                    ((fvt0) a6aVar2.b.b).A(f8, f9);
                    try {
                        g7zVar.a();
                        float f10 = -f8;
                        float f11 = -f9;
                        ((fvt0) a6aVar2.b.b).A(f10, f11);
                        uw2Var.i();
                        nr nrVar2 = a6aVar2.b;
                        nrVar2.F(w6kVarJ);
                        nrVar2.G(k6zVarO);
                        nrVar2.E(x5aVarI);
                        nrVar2.H(jP);
                        nrVar2.c = dfvVar;
                        e1().endRecording();
                        int iSave = canvas2.save();
                        canvas2.translate(f10, f11);
                        canvas2.drawRenderNode(e1());
                        canvas2.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        ((fvt0) a6aVar2.b.b).A(-f8, -f9);
                        throw th;
                    }
                } catch (Throwable th2) {
                    uw2Var.i();
                    nr nrVar3 = a6aVar2.b;
                    nrVar3.F(w6kVarJ);
                    nrVar3.G(k6zVarO);
                    nrVar3.E(x5aVarI);
                    nrVar3.H(jP);
                    nrVar3.c = dfvVar;
                    throw th2;
                }
        }
    }

    public a9v(jnn0 jnn0Var, az2 az2Var, jjn jjnVar) {
        this.r = az2Var;
        this.s = jjnVar;
        Z0(jnn0Var);
    }
}
