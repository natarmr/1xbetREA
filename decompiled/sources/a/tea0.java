package a;

import android.view.AttachedSurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;

/* JADX INFO: loaded from: classes.dex */
public final class tea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SurfaceSyncGroup f33811a;

    public final /* synthetic */ void a(SurfaceView surfaceView, wss wssVar) {
        AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
        if (rootSurfaceControl == null) {
            return;
        }
        SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
        this.f33811a = surfaceSyncGroup;
        x0x.K(surfaceSyncGroup.add(rootSurfaceControl, new d12((byte) 3)));
        wssVar.run();
        rootSurfaceControl.applyTransactionOnDraw(xl50.j());
    }
}
