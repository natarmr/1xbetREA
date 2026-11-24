package a;

import android.util.Log;
import android.view.Surface;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class i3a implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f14088a;
    public final int b;
    public final x04 c;
    public final /* synthetic */ j3a d;

    public i3a(j3a j3aVar, Surface surface) {
        surface.getClass();
        this.d = j3aVar;
        this.f14088a = surface;
        z04 z04Var = j3a.d;
        z04Var.getClass();
        this.b = z04.b.incrementAndGet(z04Var);
        this.c = o2e.X(false);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Surface surface;
        List<spt0> listL0;
        if (this.c.a()) {
            j3a j3aVar = this.d;
            synchronized (j3aVar.f15821a) {
                surface = this.f14088a;
                Integer num = (Integer) j3aVar.b.get(surface);
                if (num == null) {
                    throw new IllegalStateException(("Surface " + surface + " (" + this + ") has no use count").toString());
                }
                int iIntValue = num.intValue() - 1;
                j3aVar.b.put(surface, Integer.valueOf(iIntValue));
                if (iIntValue == 0) {
                    listL0 = CollectionsKt.L0(j3aVar.c);
                    j3aVar.b.remove(surface);
                } else {
                    listL0 = null;
                }
            }
            if (listL0 != null) {
                for (spt0 spt0Var : listL0) {
                    spt0Var.getClass();
                    surface.getClass();
                    synchronized (spt0Var.e) {
                        try {
                            hzj hzjVar = (hzj) spt0Var.g.remove(surface);
                            if (hzjVar != null) {
                                if (l8x.f0("CXCP")) {
                                    Log.d("CXCP", "SurfaceInactive " + hzjVar + " in " + spt0Var);
                                }
                                spt0Var.c.j(hzjVar);
                                try {
                                    hzjVar.b();
                                } catch (IllegalStateException e) {
                                    if (l8x.j0()) {
                                        Log.w("CXCP", "Error when " + surface + " going to decrease the use count.", e);
                                    }
                                }
                                spt0Var.e();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    public final String toString() {
        return "SurfaceToken-" + this.b;
    }
}
