package a;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$ExtensionCaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes.dex */
public final class pw2 extends CameraExtensionSession$ExtensionCaptureCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27690a;
    public final tw9 b;
    public final /* synthetic */ qw2 c;
    public final Serializable d;

    public pw2(qw2 qw2Var, tw9 tw9Var) {
        this.f27690a = (byte) 0;
        this.c = qw2Var;
        this.b = tw9Var;
        this.d = new ConcurrentLinkedQueue();
    }

    public final void onCaptureFailed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        byte b = this.f27690a;
        tw9 tw9Var = this.b;
        Serializable serializable = this.d;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        switch (b) {
            case 0:
                if (((ConcurrentLinkedQueue) serializable).isEmpty()) {
                    qw2 qw2Var = this.c;
                    long jIncrementAndGet = b14.b.incrementAndGet(qw2Var.e);
                    qw2Var.f.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                    ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                }
                Object objRemove = ((ConcurrentLinkedQueue) serializable).remove();
                objRemove.getClass();
                tw9Var.d(captureRequest, ((Number) objRemove).longValue());
                break;
            default:
                Object obj = ((LinkedHashMap) serializable).get(captureRequest);
                obj.getClass();
                LinkedHashMap linkedHashMap = (LinkedHashMap) serializable;
                if (((List) obj).size() != 1) {
                    StringBuilder sb = new StringBuilder("onCaptureFailed is not triggered for repeating requests. Request frame numbers: ");
                    Object obj2 = linkedHashMap.get(captureRequest);
                    obj2.getClass();
                    sb.append(((List) obj2).stream());
                    Log.i("CXCP", sb.toString());
                } else {
                    Object obj3 = linkedHashMap.get(captureRequest);
                    obj3.getClass();
                    tw9Var.d(captureRequest, ((Number) ((List) obj3).get(0)).longValue());
                }
                break;
        }
    }

    public final void onCaptureProcessProgressed(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, int i) {
        byte b = this.f27690a;
        tw9 tw9Var = this.b;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        switch (b) {
            case 0:
                tw9Var.e(captureRequest, i);
                break;
            default:
                tw9Var.e(captureRequest, i);
                break;
        }
    }

    public final void onCaptureProcessStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest) {
        byte b = this.f27690a;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
    }

    public void onCaptureResultAvailable(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        switch (this.f27690a) {
            case 0:
                cameraExtensionSession.getClass();
                captureRequest.getClass();
                totalCaptureResult.getClass();
                Serializable serializable = this.d;
                if (((ConcurrentLinkedQueue) serializable).isEmpty()) {
                    qw2 qw2Var = this.c;
                    long jIncrementAndGet = b14.b.incrementAndGet(qw2Var.e);
                    qw2Var.f.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                    ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                }
                Object objRemove = ((ConcurrentLinkedQueue) serializable).remove();
                objRemove.getClass();
                this.b.c(captureRequest, totalCaptureResult, ((Number) objRemove).longValue());
                break;
            default:
                super.onCaptureResultAvailable(cameraExtensionSession, captureRequest, totalCaptureResult);
                break;
        }
    }

    public final void onCaptureSequenceAborted(CameraExtensionSession cameraExtensionSession, int i) {
        byte b = this.f27690a;
        tw9 tw9Var = this.b;
        cameraExtensionSession.getClass();
        switch (b) {
            case 0:
                tw9Var.f(i);
                break;
            default:
                tw9Var.f(i);
                break;
        }
    }

    public final void onCaptureSequenceCompleted(CameraExtensionSession cameraExtensionSession, int i) {
        byte b = this.f27690a;
        tw9 tw9Var = this.b;
        qw2 qw2Var = this.c;
        cameraExtensionSession.getClass();
        switch (b) {
            case 0:
                Long l = (Long) qw2Var.f.get(cameraExtensionSession);
                l.getClass();
                tw9Var.g(i, l.longValue());
                break;
            default:
                Long l2 = (Long) qw2Var.f.get(cameraExtensionSession);
                l2.getClass();
                tw9Var.g(i, l2.longValue());
                break;
        }
    }

    public final void onCaptureStarted(CameraExtensionSession cameraExtensionSession, CaptureRequest captureRequest, long j) {
        byte b = this.f27690a;
        Serializable serializable = this.d;
        qw2 qw2Var = this.c;
        cameraExtensionSession.getClass();
        captureRequest.getClass();
        switch (b) {
            case 0:
                long jIncrementAndGet = b14.b.incrementAndGet(qw2Var.e);
                qw2Var.f.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet));
                ((ConcurrentLinkedQueue) serializable).add(Long.valueOf(jIncrementAndGet));
                this.b.h(captureRequest, jIncrementAndGet, j);
                break;
            default:
                long jIncrementAndGet2 = b14.b.incrementAndGet(qw2Var.e);
                qw2Var.f.put(cameraExtensionSession, Long.valueOf(jIncrementAndGet2));
                LinkedHashMap linkedHashMap = (LinkedHashMap) serializable;
                Object arrayList = linkedHashMap.get(captureRequest);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(captureRequest, arrayList);
                }
                ((List) arrayList).add(Long.valueOf(jIncrementAndGet2));
                this.b.h(captureRequest, jIncrementAndGet2, j);
                break;
        }
    }

    public pw2(qw2 qw2Var, tw9 tw9Var, LinkedHashMap linkedHashMap) {
        this.f27690a = (byte) 1;
        this.c = qw2Var;
        this.b = tw9Var;
        this.d = linkedHashMap;
    }
}
