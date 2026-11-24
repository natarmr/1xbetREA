package a;

import android.view.AttachedSurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class qba0 extends bnn0 implements Function2 {
    public final /* synthetic */ SurfaceView i;
    public final /* synthetic */ pz40 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qba0(SurfaceView surfaceView, pz40 pz40Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = surfaceView;
        this.j = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new qba0(this.i, this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qba0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        SurfaceView surfaceView = this.i;
        AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
        if (rootSurfaceControl != null) {
            SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
            if (!surfaceSyncGroup.add(rootSurfaceControl, new d12((byte) 3))) {
                jf4.n("Failed to add rootSurfaceControl to SurfaceSyncGroup");
                return null;
            }
            this.j.setValue(surfaceSyncGroup);
            surfaceView.invalidate();
            rootSurfaceControl.applyTransactionOnDraw(xl50.j());
        }
        return Unit.f46060a;
    }
}
