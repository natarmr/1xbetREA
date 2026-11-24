package a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class imv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f15044a = 0;
    private static volatile Choreographer choreographer;

    static {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = new hmv(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        objInvoke.getClass();
        return (Handler) objInvoke;
    }

    public static final Object b(bnn0 bnn0Var) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            n5a n5aVar = new n5a(1, pnx.b(bnn0Var));
            n5aVar.r();
            choreographer2.postFrameCallback(new d73(n5aVar, (byte) 1));
            Object objP = n5aVar.p();
            wne wneVar = wne.f39444a;
            return objP;
        }
        n5a n5aVar2 = new n5a(1, pnx.b(bnn0Var));
        n5aVar2.r();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            c(n5aVar2);
        } else {
            rwj rwjVar = tvk.f34603a;
            ys10.f43147a.q(n5aVar2.e, new mx2(n5aVar2, (byte) 15));
        }
        Object objP2 = n5aVar2.p();
        wne wneVar2 = wne.f39444a;
        return objP2;
    }

    public static final void c(n5a n5aVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer2.getClass();
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new d73(n5aVar, (byte) 1));
    }
}
