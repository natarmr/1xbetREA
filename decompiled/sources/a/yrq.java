package a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.gov.nist.core.Separators;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class yrq implements psn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43133a;
    public final xrq b;
    public final Object c = new Object();
    public Handler d;
    public ThreadPoolExecutor e;
    public ThreadPoolExecutor f;
    public rcb g;

    public yrq(Context context, xrq xrqVar) {
        z1x.x(context, "Context cannot be null");
        this.f43133a = context.getApplicationContext();
        this.b = xrqVar;
    }

    @Override // a.psn
    public final void a(rcb rcbVar) {
        synchronized (this.c) {
            this.g = rcbVar;
        }
        synchronized (this.c) {
            try {
                if (this.g == null) {
                    return;
                }
                ThreadPoolExecutor threadPoolExecutor = this.e;
                if (threadPoolExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new pqd("emojiCompat", (byte) 0));
                    threadPoolExecutor2.allowCoreThreadTimeOut(true);
                    this.f = threadPoolExecutor2;
                    this.e = threadPoolExecutor2;
                    threadPoolExecutor = threadPoolExecutor2;
                }
                threadPoolExecutor.execute(new ccf(this, (byte) 25));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.c) {
            try {
                this.g = null;
                Handler handler = this.d;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.d = null;
                ThreadPoolExecutor threadPoolExecutor = this.f;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.e = null;
                this.f = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ssq c() {
        try {
            Context context = this.f43133a;
            Object[] objArr = {this.b};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            rsq rsqVarA = vrq.a(context, Collections.unmodifiableList(arrayList));
            boolean z = rsqVarA.b;
            if (z) {
                itt0.k(ua80.e(z ? 1 : 0, "fetchFonts failed (", Separators.RPAREN));
                return null;
            }
            ssq[] ssqVarArr = (ssq[]) rsqVarA.f31043a.get(0);
            if (ssqVarArr != null && ssqVarArr.length != 0) {
                return ssqVarArr[0];
            }
            itt0.k("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            e9d0.m("provider not found", e);
            return null;
        }
    }
}
