package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public abstract class jiu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s2m0 f16594a = new s2m0();

    public static final bvc a(diu0 diu0Var) {
        bvc bvcVar;
        CoroutineContext coroutineContextX;
        diu0Var.getClass();
        synchronized (f16594a) {
            bvcVar = (bvc) diu0Var.u("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (bvcVar == null) {
                try {
                    try {
                        rwj rwjVar = tvk.f34603a;
                        coroutineContextX = ys10.f43147a.x();
                    } catch (IllegalStateException unused) {
                        coroutineContextX = kotlin.coroutines.g.f46065a;
                    }
                } catch (q660 unused2) {
                    coroutineContextX = kotlin.coroutines.g.f46065a;
                }
                bvc bvcVar2 = new bvc(coroutineContextX.plus(qem0.e()));
                diu0Var.s("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", bvcVar2);
                bvcVar = bvcVar2;
            }
        }
        return bvcVar;
    }
}
