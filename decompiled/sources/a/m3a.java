package a;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m3a implements sbe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21104a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m3a(Object obj, Object obj2, byte b) {
        this.f21104a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // a.sbe
    public final void accept(Object obj) {
        byte b = this.f21104a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((Surface) obj3).release();
                ((SurfaceTexture) obj2).release();
                break;
            case 1:
                txj txjVar = (txj) obj3;
                imn0 imn0Var = (imn0) obj2;
                imn0Var.close();
                Surface surface = (Surface) txjVar.h.remove(imn0Var);
                if (surface != null) {
                    p8l p8lVar = txjVar.f34703a;
                    vfr.d((AtomicBoolean) p8lVar.c, true);
                    vfr.c((Thread) p8lVar.b);
                    p8lVar.u(surface, true);
                }
                break;
            case 2:
                mbn mbnVar = (mbn) obj3;
                imn0 imn0Var2 = (imn0) obj2;
                imn0Var2.close();
                Surface surface2 = (Surface) mbnVar.h.remove(imn0Var2);
                if (surface2 != null) {
                    jbn jbnVar = mbnVar.f21518a;
                    vfr.d((AtomicBoolean) jbnVar.c, true);
                    vfr.c((Thread) jbnVar.b);
                    jbnVar.u(surface2, true);
                }
                break;
            default:
                ytj0 ytj0Var = (ytj0) obj3;
                Activity activity = (Activity) obj2;
                gxu gxuVar = ytj0Var.e;
                if (gxuVar != null) {
                    gxuVar.v(activity, ytj0Var.a(activity));
                }
                break;
        }
    }
}
