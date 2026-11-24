package a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.function.Consumer;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class gkd implements ScrollCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tai0 f11439a;
    public final mkx b;
    public final u9h0 c;
    public final AndroidComposeView d;
    public final sje e;
    public final tlw f;

    public gkd(tai0 tai0Var, mkx mkxVar, sje sjeVar, u9h0 u9h0Var, AndroidComposeView androidComposeView) {
        this.f11439a = tai0Var;
        this.b = mkxVar;
        this.c = u9h0Var;
        this.d = androidComposeView;
        this.e = d5c.S(sjeVar, gnk.f11592a);
        this.f = new tlw(mkxVar.a(), new cx8(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ScrollCaptureSession scrollCaptureSession, mkx mkxVar, zje zjeVar) {
        fkd fkdVar;
        int i;
        int i2;
        ScrollCaptureSession scrollCaptureSessionM;
        mkx mkxVar2;
        int i3;
        int i4;
        int iD;
        int iD2;
        int i5;
        int i6;
        Canvas canvasLockHardwareCanvas;
        if (zjeVar instanceof fkd) {
            fkdVar = (fkd) zjeVar;
            int i7 = fkdVar.o;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                fkdVar.o = i7 - Integer.MIN_VALUE;
            } else {
                fkdVar = new fkd(this, zjeVar);
            }
        } else {
            fkdVar = new fkd(this, zjeVar);
        }
        Object obj = fkdVar.m;
        wne wneVar = wne.f39444a;
        int i8 = fkdVar.o;
        tlw tlwVar = this.f;
        if (i8 == 0) {
            z1x.P(obj);
            i = mkxVar.b;
            i2 = mkxVar.d;
            fkdVar.i = scrollCaptureSession;
            fkdVar.j = mkxVar;
            fkdVar.k = i;
            fkdVar.l = i2;
            fkdVar.o = 1;
            if (i > i2) {
                tlwVar.getClass();
                throw new IllegalArgumentException(("Expected min=" + i + " ≤ max=" + i2).toString());
            }
            int i9 = i2 - i;
            int i10 = tlwVar.f34167a;
            if (i9 > i10) {
                c99.s(f140.j(i9, "Expected range (", i10, ") to be ≤ viewportSize="));
                return null;
            }
            Object objB = tlwVar.b((((i9 / 2) + i) - (i10 / 2)) - tlwVar.b, fkdVar);
            if (objB != wneVar) {
                objB = Unit.f46060a;
            }
            if (objB != wneVar) {
                objB = Unit.f46060a;
            }
            if (objB != wneVar) {
            }
            return wneVar;
        }
        if (i8 == 1) {
            int i11 = fkdVar.l;
            int i12 = fkdVar.k;
            mkx mkxVar3 = fkdVar.j;
            ScrollCaptureSession scrollCaptureSessionM2 = kn4.m(fkdVar.i);
            z1x.P(obj);
            i = i12;
            mkxVar = mkxVar3;
            i2 = i11;
            scrollCaptureSession = scrollCaptureSessionM2;
        } else {
            if (i8 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i4 = fkdVar.l;
            i3 = fkdVar.k;
            mkxVar2 = fkdVar.j;
            scrollCaptureSessionM = kn4.m(fkdVar.i);
            z1x.P(obj);
        }
        iD = l1e0.d(i3 - si30.b(tlwVar.b), 0, tlwVar.f34167a);
        iD2 = l1e0.d(i4 - si30.b(tlwVar.b), 0, tlwVar.f34167a);
        i5 = mkxVar2.f21964a;
        i6 = mkxVar2.c;
        if (iD == iD2) {
            return mkx.e;
        }
        canvasLockHardwareCanvas = scrollCaptureSessionM.getSurface().lockHardwareCanvas();
        try {
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iD);
            mkx mkxVar4 = this.b;
            canvasLockHardwareCanvas.translate(-mkxVar4.f21964a, -mkxVar4.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iB = si30.b(tlwVar.b);
            return new mkx(i5, iD + iB, i6, iD2 + iB);
        } finally {
            scrollCaptureSessionM.getSurface().unlockCanvasAndPost(canvasLockHardwareCanvas);
        }
        y2d y2dVar = new y2d((byte) 13);
        fkdVar.i = scrollCaptureSession;
        fkdVar.j = mkxVar;
        fkdVar.k = i;
        fkdVar.l = i2;
        fkdVar.o = 2;
        if (s0x.P(fkdVar.getContext()).e(y2dVar, fkdVar) != wneVar) {
            scrollCaptureSessionM = scrollCaptureSession;
            mkxVar2 = mkxVar;
            i3 = i;
            i4 = i2;
            iD = l1e0.d(i3 - si30.b(tlwVar.b), 0, tlwVar.f34167a);
            iD2 = l1e0.d(i4 - si30.b(tlwVar.b), 0, tlwVar.f34167a);
            i5 = mkxVar2.f21964a;
            i6 = mkxVar2.c;
            if (iD == iD2) {
                return mkx.e;
            }
            canvasLockHardwareCanvas = scrollCaptureSessionM.getSurface().lockHardwareCanvas();
            canvasLockHardwareCanvas.save();
            canvasLockHardwareCanvas.translate(-i5, -iD);
            mkx mkxVar5 = this.b;
            canvasLockHardwareCanvas.translate(-mkxVar5.f21964a, -mkxVar5.b);
            this.d.getRootView().draw(canvasLockHardwareCanvas);
            int iB2 = si30.b(tlwVar.b);
            return new mkx(i5, iD + iB2, i6, iD2 + iB2);
        }
        return wneVar;
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        qjj.W(this.e, z560.b, null, new jtb(this, runnable, null, (byte) 10), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        c4m0 c4m0VarW = qjj.W(this.e, null, null, new ic1((Object) this, (Object) scrollCaptureSession, (Object) rect, (Object) consumer, (yje) null, (byte) 13), 3);
        c4m0VarW.invokeOnCompletion(new ejd(cancellationSignal, (byte) 1));
        cancellationSignal.setOnCancelListener(new hkd(c4m0VarW, (byte) 0));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(e9x.U(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = 0.0f;
        ((hgk0) this.c.f35284a).setValue(Boolean.TRUE);
        runnable.run();
    }
}
