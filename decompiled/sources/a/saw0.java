package a;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class saw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pq00 f31903a;
    public boolean b = false;
    public boolean c = false;
    public boolean d = true;
    public boolean e = false;
    public Executor f;
    public volatile h04 g;
    public volatile h04 h;
    public final Semaphore i;
    public final Set j;

    public saw0(SignInHubActivity signInHubActivity, Set set) {
        signInHubActivity.getApplicationContext();
        this.i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.h != null || this.g == null) {
            return;
        }
        this.g.getClass();
        if (this.f == null) {
            this.f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        h04 h04Var = this.g;
        Executor executor = this.f;
        if (h04Var.b == 1) {
            h04Var.b = 2;
            executor.execute(h04Var.f12214a);
            return;
        }
        int iE = hne.E(h04Var.b);
        if (iE == 1) {
            jf4.n("Cannot execute task: the task is already running.");
        } else if (iE != 2) {
            jf4.n("We should never reach this state");
        } else {
            jf4.n("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
    }

    public final void b() {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            ((j9w0) it.next()).getClass();
            e9d0.b();
            return;
        }
        try {
            this.i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
    }

    public final boolean c() {
        if (this.g == null) {
            return false;
        }
        boolean z = this.b;
        if (!z) {
            if (z) {
                d();
            } else {
                this.e = true;
            }
        }
        h04 h04Var = this.h;
        h04 h04Var2 = this.g;
        if (h04Var != null) {
            h04Var2.getClass();
            this.g = null;
            return false;
        }
        h04Var2.getClass();
        h04 h04Var3 = this.g;
        h04Var3.c.set(true);
        boolean zCancel = h04Var3.f12214a.cancel(false);
        if (zCancel) {
            this.h = this.g;
        }
        this.g = null;
        return zCancel;
    }

    public final void d() {
        c();
        this.g = new h04(this);
        a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        Class<?> cls = getClass();
        sb.append(cls.getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(cls)));
        sb.append(" id=0}");
        return sb.toString();
    }
}
