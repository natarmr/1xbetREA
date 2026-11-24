package a;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class zy9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nx9 f45194a;

    public zy9(nx9 nx9Var) {
        nx9Var.getClass();
        this.f45194a = nx9Var;
    }

    public static ArrayList a(zy9 zy9Var) {
        ArrayList arrayListD;
        cx9 cx9Var = zy9Var.d().b;
        synchronized (cx9Var.f) {
            arrayListD = cx9Var.g;
        }
        if (arrayListD == null) {
            arrayListD = cx9Var.d();
        }
        if (arrayListD == null) {
            Log.w("CXCP", "Failed to load cameraIds from " + ((Object) mx9.a("CXCP-Camera2")));
        }
        return arrayListD;
    }

    public static c1a b(zy9 zy9Var, String str) {
        zy9Var.getClass();
        str.getClass();
        return zy9Var.d().c.a(str);
    }

    public static Set c(zy9 zy9Var) {
        cx9 cx9Var = zy9Var.d().b;
        if (Build.VERSION.SDK_INT < 30) {
            cx9Var.getClass();
            return xun.f41520a;
        }
        synchronized (cx9Var.f) {
        }
        CameraManager cameraManager = (CameraManager) cx9Var.f5112a.get();
        try {
            cameraManager.getClass();
            Set concurrentCameraIds = cameraManager.getConcurrentCameraIds();
            concurrentCameraIds.getClass();
            Log.d("CXCP", "Loaded ConcurrentCameraIdsSet " + concurrentCameraIds);
            Set<Set> set = concurrentCameraIds;
            ArrayList arrayList = new ArrayList(r3d.q(set, 10));
            for (Set<String> set2 : set) {
                ArrayList arrayList2 = new ArrayList(r3d.q(set2, 10));
                for (String str : set2) {
                    g0a.a(str);
                    arrayList2.add(new g0a(str));
                }
                arrayList.add(CollectionsKt.P0(arrayList2));
            }
            return CollectionsKt.P0(arrayList);
        } catch (CameraAccessException e) {
            Log.w("CXCP", "Failed to query CameraManager#getConcurrentStreamingCameraIds", e);
            return null;
        }
    }

    public final wv9 d() {
        nx9 nx9Var = this.f45194a;
        try {
            Trace.beginSection("getCameraBackend");
            nx9Var.d.getClass();
            wv9 wv9VarA = nx9Var.a("CXCP-Camera2");
            if (wv9VarA != null) {
                Trace.endSection();
                return wv9VarA;
            }
            throw new IllegalStateException(("Failed to load CameraBackend " + ((Object) mx9.a("CXCP-Camera2"))).toString());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
