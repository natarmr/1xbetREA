package a;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class rhu0 extends View {
    public static final ruc m = new ruc((byte) 4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final chl f30506a;
    public final b6a b;
    public final a6a c;
    public boolean d;
    public Outline e;
    public boolean f;
    public w6k g;
    public k6z h;
    public Function1 i;
    public dfv j;
    public float k;
    public float l;

    public rhu0(chl chlVar, b6a b6aVar, a6a a6aVar) {
        super(chlVar.getContext());
        this.f30506a = chlVar;
        this.b = b6aVar;
        this.c = a6aVar;
        setOutlineProvider(m);
        this.f = true;
        this.g = dj8.h;
        this.h = k6z.f17794a;
        ffv.f9463a.getClass();
        this.i = fvr.x;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float f = this.k;
        a6a a6aVar = this.c;
        b6a b6aVar = this.b;
        if (f > 0.0f || this.l > 0.0f) {
            int iSave = canvas.save();
            canvas.translate(this.k, this.l);
            uw2 uw2Var = b6aVar.f2042a;
            Canvas canvas2 = uw2Var.f36374a;
            uw2Var.f36374a = canvas;
            w6k w6kVar = this.g;
            k6z k6zVar = this.h;
            float width = getWidth();
            long jFloatToRawIntBits = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width) << 32);
            dfv dfvVar = this.j;
            Function1 function1 = this.i;
            nr nrVar = a6aVar.b;
            nr nrVar2 = a6aVar.b;
            w6k w6kVarJ = nrVar.j();
            k6z k6zVarO = nrVar2.o();
            x5a x5aVarI = nrVar2.i();
            long jP = nrVar2.p();
            dfv dfvVar2 = (dfv) nrVar2.c;
            nrVar2.F(w6kVar);
            nrVar2.G(k6zVar);
            nrVar2.E(uw2Var);
            nrVar2.H(jFloatToRawIntBits);
            nrVar2.c = dfvVar;
            uw2Var.l();
            try {
                function1.invoke(a6aVar);
                uw2Var.i();
                nrVar2.F(w6kVarJ);
                nrVar2.G(k6zVarO);
                nrVar2.E(x5aVarI);
                nrVar2.H(jP);
                nrVar2.c = dfvVar2;
                b6aVar.f2042a.f36374a = canvas2;
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                uw2Var.i();
                nrVar2.F(w6kVarJ);
                nrVar2.G(k6zVarO);
                nrVar2.E(x5aVarI);
                nrVar2.H(jP);
                nrVar2.c = dfvVar2;
                throw th;
            }
        } else {
            uw2 uw2Var2 = b6aVar.f2042a;
            Canvas canvas3 = uw2Var2.f36374a;
            uw2Var2.f36374a = canvas;
            w6k w6kVar2 = this.g;
            k6z k6zVar2 = this.h;
            float width2 = getWidth();
            long jFloatToRawIntBits2 = (4294967295L & ((long) Float.floatToRawIntBits(getHeight()))) | (Float.floatToRawIntBits(width2) << 32);
            dfv dfvVar3 = this.j;
            Function1 function2 = this.i;
            nr nrVar3 = a6aVar.b;
            nr nrVar4 = a6aVar.b;
            w6k w6kVarJ2 = nrVar3.j();
            k6z k6zVarO2 = nrVar4.o();
            x5a x5aVarI2 = nrVar4.i();
            long jP2 = nrVar4.p();
            dfv dfvVar4 = (dfv) nrVar4.c;
            nrVar4.F(w6kVar2);
            nrVar4.G(k6zVar2);
            nrVar4.E(uw2Var2);
            nrVar4.H(jFloatToRawIntBits2);
            nrVar4.c = dfvVar3;
            uw2Var2.l();
            try {
                function2.invoke(a6aVar);
                uw2Var2.i();
                nrVar4.F(w6kVarJ2);
                nrVar4.G(k6zVarO2);
                nrVar4.E(x5aVarI2);
                nrVar4.H(jP2);
                nrVar4.c = dfvVar4;
                b6aVar.f2042a.f36374a = canvas3;
            } catch (Throwable th2) {
                uw2Var2.i();
                nrVar4.F(w6kVarJ2);
                nrVar4.G(k6zVarO2);
                nrVar4.E(x5aVarI2);
                nrVar4.H(jP2);
                nrVar4.c = dfvVar4;
                throw th2;
            }
        }
        this.d = false;
    }

    public final boolean getCanUseCompositingLayer$ui_graphics() {
        return this.f;
    }

    public final b6a getCanvasHolder() {
        return this.b;
    }

    public final View getOwnerView() {
        return this.f30506a;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.d) {
            return;
        }
        this.d = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics(boolean z) {
        if (this.f != z) {
            this.f = z;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z) {
        this.d = z;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
