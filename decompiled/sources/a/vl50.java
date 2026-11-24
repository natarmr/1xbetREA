package a;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class vl50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f37606a;
    public final Executor b;
    public final /* synthetic */ wl50 c;

    public vl50(wl50 wl50Var, qsj qsjVar, Executor executor) {
        this.c = wl50Var;
        this.f37606a = new WeakReference(qsjVar);
        this.b = executor;
    }
}
