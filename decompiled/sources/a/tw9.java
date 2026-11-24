package a;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tw9 extends CameraCaptureSession.CaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34639a;
    public final boolean b;
    public final ArrayList c;
    public final ArrayList d;
    public final List e;
    public final svu f;
    public final ArrayMap g;
    public final ArrayMap h;
    public final lrm0 i;
    public final bsm0 j;
    public final long k;
    public final odd l;
    public volatile Integer m;

    public tw9(String str, boolean z, ArrayList arrayList, ArrayList arrayList2, List list, svu svuVar, ArrayMap arrayMap, ArrayMap arrayMap2, lrm0 lrm0Var, bsm0 bsm0Var) {
        str.getClass();
        list.getClass();
        bsm0Var.getClass();
        this.f34639a = str;
        this.b = z;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = list;
        this.f = svuVar;
        this.g = arrayMap;
        this.h = arrayMap2;
        this.i = lrm0Var;
        this.j = bsm0Var;
        b14 b14Var = vw9.b;
        b14Var.getClass();
        this.k = b14.b.incrementAndGet(b14Var);
        this.l = new odd();
        if (arrayList.size() == arrayList2.size()) {
            return;
        }
        jf4.n("CaptureRequestList and CaptureMetadataList must have a 1:1 mapping.");
        throw null;
    }

    public final int a() {
        int iIntValue;
        if (this.m != null) {
            Integer num = this.m;
            if (num != null) {
                return num.intValue();
            }
            udk.a(33, "SequenceNumber has not been set for ", this);
            return 0;
        }
        synchronized (this) {
            Integer num2 = this.m;
            if (num2 == null) {
                throw new IllegalStateException(("SequenceNumber has not been set for " + this + '!').toString());
            }
            iIntValue = num2.intValue();
        }
        return iIntValue;
    }

    public final void b(gnf0 gnf0Var, long j, qmf0 qmf0Var) {
        this.f.o(this);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((bmf0) list.get(i)).w(gnf0Var, j, qmf0Var);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = gnf0Var.getRequest().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((bmf0) gnf0Var.getRequest().d.get(i2)).w(gnf0Var, j, qmf0Var);
        }
        Trace.endSection();
    }

    public final void c(CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult, long j) {
        captureRequest.getClass();
        totalCaptureResult.getClass();
        Trace.beginSection("onCaptureCompleted");
        Trace.beginSection("onCaptureSequenceComplete");
        this.f.o(this);
        Trace.endSection();
        gnf0 gnf0VarI = i(captureRequest);
        oz2 oz2Var = new oz2(totalCaptureResult, this.f34639a, gnf0VarI);
        Trace.beginSection("onTotalCaptureResult");
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((bmf0) list.get(i)).y(gnf0VarI, j, oz2Var);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = gnf0VarI.getRequest().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((bmf0) gnf0VarI.getRequest().d.get(i2)).y(gnf0VarI, j, oz2Var);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.beginSection("onComplete");
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            ((bmf0) list.get(i3)).d(gnf0VarI, j, oz2Var);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = gnf0VarI.getRequest().d.size();
        for (int i4 = 0; i4 < size4; i4++) {
            ((bmf0) gnf0VarI.getRequest().d.get(i4)).d(gnf0VarI, j, oz2Var);
        }
        Trace.endSection();
        Trace.endSection();
        Trace.endSection();
    }

    public final void d(CaptureRequest captureRequest, long j) {
        captureRequest.getClass();
        Trace.beginSection("onCaptureFailed");
        this.l.N(Unit.f46060a);
        gnf0 gnf0VarI = i(captureRequest);
        b(gnf0VarI, j, new uso(gnf0VarI, j));
        Trace.endSection();
    }

    public final void e(CaptureRequest captureRequest, int i) {
        captureRequest.getClass();
        Trace.beginSection("onCaptureProcessProgressed");
        gnf0 gnf0VarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bmf0) list.get(i2)).e(gnf0VarI, i);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = gnf0VarI.getRequest().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((bmf0) gnf0VarI.getRequest().d.get(i3)).e(gnf0VarI, i);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void f(int i) {
        Trace.beginSection("onCaptureSequenceAborted");
        this.l.N(Unit.f46060a);
        this.f.o(this);
        if (a() != i) {
            String str = "onCaptureSequenceAborted was invoked on " + a() + ", but expected " + i + '!';
            this.j.getClass();
            Log.w("CXCP", str);
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            gnf0 gnf0Var = (gnf0) arrayList.get(i2);
            List list = this.e;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((bmf0) list.get(i3)).x(gnf0Var);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            gnf0 gnf0Var2 = (gnf0) arrayList.get(i4);
            int size4 = gnf0Var2.getRequest().d.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((bmf0) gnf0Var2.getRequest().d.get(i5)).x(gnf0Var2);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void g(int i, long j) {
        Trace.beginSection("onCaptureSequenceCompleted");
        this.l.N(Unit.f46060a);
        this.f.o(this);
        if (a() != i) {
            String str = "onCaptureSequenceCompleted was invoked on " + a() + ", but expected " + i + '!';
            this.j.getClass();
            Log.w("CXCP", str);
        }
        Trace.beginSection("InvokeInternalListeners");
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            gnf0 gnf0Var = (gnf0) arrayList.get(i2);
            List list = this.e;
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((bmf0) list.get(i3)).a(gnf0Var, j);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = arrayList.size();
        for (int i4 = 0; i4 < size3; i4++) {
            gnf0 gnf0Var2 = (gnf0) arrayList.get(i4);
            int size4 = gnf0Var2.getRequest().d.size();
            for (int i5 = 0; i5 < size4; i5++) {
                ((bmf0) gnf0Var2.getRequest().d.get(i5)).a(gnf0Var2, j);
            }
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final void h(CaptureRequest captureRequest, long j, long j2) {
        captureRequest.getClass();
        Trace.beginSection("onCaptureStarted");
        this.l.N(Unit.f46060a);
        gnf0 gnf0VarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((bmf0) list.get(i)).v(gnf0VarI, j, j2);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = gnf0VarI.getRequest().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((bmf0) gnf0VarI.getRequest().d.get(i2)).v(gnf0VarI, j, j2);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final gnf0 i(CaptureRequest captureRequest) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (arrayList.get(i) == captureRequest) {
                return (gnf0) this.d.get(i);
            }
        }
        itt0.l("Failed to find CaptureRequest ", captureRequest, " in ", arrayList);
        return null;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
        krm0 krm0Var;
        Object next;
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        surface.getClass();
        Trace.beginSection("onCaptureBufferLost");
        mrm0 mrm0Var = (mrm0) this.g.get(surface);
        ArrayMap arrayMap = this.h;
        if (mrm0Var == null) {
            xe80 xe80Var = (xe80) arrayMap.get(surface);
            mrm0 mrm0Var2 = null;
            if (xe80Var != null) {
                int i = xe80Var.f40733a;
                Iterator it = this.i.h.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((krm0) next).f18773a != i);
                krm0Var = (krm0) next;
            } else {
                krm0Var = null;
            }
            if (krm0Var != null) {
                f3a f3aVar = krm0Var.j;
                if (f3aVar == null) {
                    Intrinsics.h("stream");
                    throw null;
                }
                mrm0Var2 = new mrm0(f3aVar.f8851a);
            }
            mrm0Var = mrm0Var2;
        }
        xe80 xe80Var2 = (xe80) arrayMap.get(surface);
        if (mrm0Var == null) {
            StringBuilder sb = new StringBuilder("Unable to find the streamId for ");
            sb.append(surface);
            c99.r(sb, " on ", f7r.a(j));
            return;
        }
        if (xe80Var2 == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find the outputId for ");
            sb2.append(surface);
            c99.r(sb2, " on ", f7r.a(j));
            return;
        }
        gnf0 gnf0VarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bmf0) list.get(i2)).getClass();
            gnf0VarI.getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = gnf0VarI.getRequest().d.size();
        for (int i3 = 0; i3 < size2; i3++) {
            ((bmf0) gnf0VarI.getRequest().d.get(i3)).getClass();
        }
        Trace.endSection();
        Trace.beginSection("InvokeInternalListeners");
        int size3 = list.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((bmf0) list.get(i4)).r(gnf0VarI, j, mrm0Var.f22281a, xe80Var2.f40733a);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size4 = gnf0VarI.getRequest().d.size();
        for (int i5 = 0; i5 < size4; i5++) {
            ((bmf0) gnf0VarI.getRequest().d.get(i5)).r(gnf0VarI, j, mrm0Var.f22281a, xe80Var2.f40733a);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        totalCaptureResult.getClass();
        c(captureRequest, totalCaptureResult, totalCaptureResult.getFrameNumber());
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureFailure.getClass();
        Trace.beginSection("onCaptureFailed");
        this.l.N(Unit.f46060a);
        gnf0 gnf0VarI = i(captureRequest);
        b(gnf0VarI, captureFailure.getFrameNumber(), new ww2(gnf0VarI, captureFailure));
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        captureResult.getClass();
        Trace.beginSection("onCaptureProgressed");
        long frameNumber = captureResult.getFrameNumber();
        pz2 pz2Var = new pz2(captureResult, this.f34639a);
        gnf0 gnf0VarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((bmf0) list.get(i)).c(gnf0VarI, frameNumber, pz2Var);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = gnf0VarI.getRequest().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((bmf0) gnf0VarI.getRequest().d.get(i2)).c(gnf0VarI, frameNumber, pz2Var);
        }
        Trace.endSection();
        Trace.endSection();
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
        cameraCaptureSession.getClass();
        f(i);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
        cameraCaptureSession.getClass();
        g(i, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        h(captureRequest, j2, j);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
    public void onReadoutStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
        cameraCaptureSession.getClass();
        captureRequest.getClass();
        Trace.beginSection("onReadoutStarted");
        gnf0 gnf0VarI = i(captureRequest);
        Trace.beginSection("InvokeInternalListeners");
        List list = this.e;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((bmf0) list.get(i)).l(gnf0VarI, j2, j);
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = gnf0VarI.getRequest().d.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((bmf0) gnf0VarI.getRequest().d.get(i2)).l(gnf0VarI, j2, j);
        }
        Trace.endSection();
        Trace.endSection();
    }

    public final String toString() {
        return "Camera2CaptureSequence-" + this.k;
    }
}
