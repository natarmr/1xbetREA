package a;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lba0 extends rer implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final lba0 f19746a = new lba0(2, my90.class, "clearVideoSurfaceView", "clearVideoSurfaceView(Landroid/view/SurfaceView;)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        my90 my90Var = (my90) obj;
        SurfaceView surfaceView = (SurfaceView) obj2;
        my90Var.getClass();
        ulo uloVar = (ulo) my90Var;
        uloVar.c0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        uloVar.c0();
        if (holder != null && holder == uloVar.U) {
            uloVar.d();
        }
        return Unit.f46060a;
    }
}
