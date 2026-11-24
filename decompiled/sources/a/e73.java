package a;

import android.os.Looper;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e73 {
    public static final ThreadLocal i = new ThreadLocal();
    public final xex e;
    public c5k h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nuj0 f7315a = new nuj0(0);
    public final ArrayList b = new ArrayList();
    public final yk50 c = new yk50((Object) this, (byte) 5);
    public final w1 d = new w1((Object) this, (byte) 7);
    public boolean f = false;
    public float g = 1.0f;

    public e73(xex xexVar) {
        this.e = xexVar;
    }

    public static e73 a() {
        ThreadLocal threadLocal = i;
        if (threadLocal.get() == null) {
            xex xexVar = new xex();
            xexVar.f40764a = Choreographer.getInstance();
            xexVar.b = Looper.myLooper();
            threadLocal.set(new e73(xexVar));
        }
        return (e73) threadLocal.get();
    }
}
