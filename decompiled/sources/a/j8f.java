package a;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class j8f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16080a;
    public final qaj b;
    public final zn00 c;
    public final long d;
    public c5k e;
    public c5k f;
    public f8f g;
    public final hxw h;
    public final xzp i;
    public final xp2 j;
    public final xp2 k;
    public final a8f l;
    public final k8f m;
    public final nr00 n;
    public final cu o;

    public j8f(nfq nfqVar, hxw hxwVar, k8f k8fVar, qaj qajVar, xp2 xp2Var, xp2 xp2Var2, xzp xzpVar, a8f a8fVar, nr00 nr00Var, cu cuVar) {
        this.b = qajVar;
        nfqVar.a();
        this.f16080a = nfqVar.f23449a;
        this.h = hxwVar;
        this.m = k8fVar;
        this.j = xp2Var;
        this.k = xp2Var2;
        this.i = xzpVar;
        this.l = a8fVar;
        this.n = nr00Var;
        this.o = cuVar;
        this.d = System.currentTimeMillis();
        this.c = new zn00((byte) 9);
    }

    public final void a(sd60 sd60Var) {
        cu.d();
        cu.d();
        this.e.a();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.c(new i8f(this));
                this.g.h();
                if (!sd60Var.e().b.f3655a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.g.d(sd60Var)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.g.i(((TaskCompletionSource) ((AtomicReference) sd60Var.i).get()).getTask());
                c();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(sd60 sd60Var) {
        Future<?> futureSubmit = ((aaf) this.o.b).f520a.submit(new g8f(this, sd60Var, (byte) 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void c() {
        cu.d();
        try {
            c5k c5kVar = this.e;
            xzp xzpVar = (xzp) c5kVar.b;
            if (new File((File) xzpVar.c, (String) c5kVar.f3775a).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }
}
