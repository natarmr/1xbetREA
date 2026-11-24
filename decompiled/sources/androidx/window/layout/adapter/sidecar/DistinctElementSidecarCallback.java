package androidx.window.layout.adapter.sidecar;

import a.vtj0;
import a.wtj0;
import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    public SidecarDeviceState b;
    public final SidecarInterface.SidecarCallback d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45413a = new Object();
    public final WeakHashMap c = new WeakHashMap();

    public DistinctElementSidecarCallback(wtj0 wtj0Var, SidecarInterface.SidecarCallback sidecarCallback) {
        this.d = sidecarCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (a.vtj0.b(r1) == a.vtj0.b(r4)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L3
            return
        L3:
            java.lang.Object r0 = r3.f45413a
            monitor-enter(r0)
            androidx.window.sidecar.SidecarDeviceState r1 = r3.b     // Catch: java.lang.Throwable -> L1e
            boolean r2 = kotlin.jvm.internal.Intrinsics.d(r1, r4)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto Lf
            goto L1c
        Lf:
            if (r1 != 0) goto L12
            goto L20
        L12:
            int r1 = a.vtj0.b(r1)     // Catch: java.lang.Throwable -> L1e
            int r2 = a.vtj0.b(r4)     // Catch: java.lang.Throwable -> L1e
            if (r1 != r2) goto L20
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L1e:
            r3 = move-exception
            goto L29
        L20:
            r3.b = r4     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            androidx.window.sidecar.SidecarInterface$SidecarCallback r3 = r3.d
            r3.onDeviceStateChanged(r4)
            return
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback.onDeviceStateChanged(androidx.window.sidecar.SidecarDeviceState):void");
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        boolean zB;
        synchronized (this.f45413a) {
            try {
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo2 = (SidecarWindowLayoutInfo) this.c.get(iBinder);
                if (Intrinsics.d(sidecarWindowLayoutInfo2, sidecarWindowLayoutInfo)) {
                    zB = true;
                } else {
                    zB = (sidecarWindowLayoutInfo2 == null || sidecarWindowLayoutInfo == null) ? false : wtj0.b(vtj0.c(sidecarWindowLayoutInfo2), vtj0.c(sidecarWindowLayoutInfo));
                }
                if (zB) {
                    return;
                }
                this.c.put(iBinder, sidecarWindowLayoutInfo);
                this.d.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
