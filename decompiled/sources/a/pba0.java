package a;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;

/* JADX INFO: loaded from: classes.dex */
public final class pba0 extends SurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pz40 f26696a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pba0(Context context, pz40 pz40Var) {
        super(context);
        this.f26696a = pz40Var;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        super.dispatchDraw(canvas);
        if (Build.VERSION.SDK_INT == 34) {
            pz40 pz40Var = this.f26696a;
            SurfaceSyncGroup surfaceSyncGroupQ = mmv.q(pz40Var.getValue());
            if (surfaceSyncGroupQ != null) {
                surfaceSyncGroupQ.markSyncReady();
            }
            pz40Var.setValue(null);
        }
    }
}
