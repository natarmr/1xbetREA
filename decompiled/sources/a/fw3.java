package a;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class fw3 extends xnm0 {
    public static volatile fw3 b;
    public static final ew3 c = new ew3((byte) 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vxj f10239a = new vxj();

    public static fw3 y() {
        if (b != null) {
            return b;
        }
        synchronized (fw3.class) {
            try {
                if (b == null) {
                    b = new fw3();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public final void z(Runnable runnable) {
        vxj vxjVar = this.f10239a;
        if (vxjVar.c == null) {
            synchronized (vxjVar.f38201a) {
                try {
                    if (vxjVar.c == null) {
                        vxjVar.c = vxj.y(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        vxjVar.c.post(runnable);
    }
}
