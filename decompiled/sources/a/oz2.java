package a;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class oz2 implements b7r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalCaptureResult f26085a;
    public final pz2 b;
    public final Map c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [a.lun, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.util.ArrayMap] */
    public oz2(TotalCaptureResult totalCaptureResult, String str, gnf0 gnf0Var) {
        Map physicalCameraResults;
        ?? arrayMap;
        totalCaptureResult.getClass();
        str.getClass();
        gnf0Var.getClass();
        this.f26085a = totalCaptureResult;
        this.b = new pz2(totalCaptureResult, str);
        try {
            Trace.beginSection("physicalCaptureResults");
            int i = Build.VERSION.SDK_INT;
            if (i >= 31) {
                physicalCameraResults = totalCaptureResult.getPhysicalCameraTotalResults();
                physicalCameraResults.getClass();
            } else if (i >= 28) {
                physicalCameraResults = totalCaptureResult.getPhysicalCameraResults();
            } else {
                physicalCameraResults = lun.f20680a;
                physicalCameraResults.getClass();
            }
            if (physicalCameraResults == null || physicalCameraResults.isEmpty()) {
                arrayMap = lun.f20680a;
                arrayMap.getClass();
            } else {
                arrayMap = new ArrayMap(physicalCameraResults.size());
                for (Map.Entry entry : physicalCameraResults.entrySet()) {
                    String str2 = (String) entry.getKey();
                    g0a.a(str2);
                    arrayMap.put(new g0a(str2), new pz2((CaptureResult) entry.getValue(), str2));
                }
            }
            Trace.endSection();
            this.c = arrayMap;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        tre0 tre0Var = sre0.f32672a;
        boolean zEquals = sgyVar.equals(tre0Var.b(CaptureResult.class));
        TotalCaptureResult totalCaptureResult = this.f26085a;
        if (zEquals) {
            totalCaptureResult.getClass();
            return totalCaptureResult;
        }
        if (!sgyVar.equals(tre0Var.b(TotalCaptureResult.class)) || totalCaptureResult == null) {
            return null;
        }
        return totalCaptureResult;
    }

    @Override // a.b7r
    public final pz2 getMetadata() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameInfo(camera: ");
        pz2 pz2Var = this.b;
        sb.append((Object) g0a.b(pz2Var.b));
        sb.append(", frameNumber: ");
        sb.append(pz2Var.f27824a.getFrameNumber());
        sb.append(')');
        return sb.toString();
    }
}
