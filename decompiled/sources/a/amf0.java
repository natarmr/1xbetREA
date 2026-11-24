package a;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class amf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f1105a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final vkr0 h;
    public final zn00 i;
    public int j;
    public long k;

    public amf0(vkr0 vkr0Var, lwi0 lwi0Var, zn00 zn00Var) {
        double d = lwi0Var.d;
        double d2 = lwi0Var.e;
        long j = ((long) lwi0Var.f) * 1000;
        this.f1105a = d;
        this.b = d2;
        this.c = j;
        this.h = vkr0Var;
        this.i = zn00Var;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int size = this.f.size();
        int i = this.j;
        int iMin = size == this.e ? Math.min(100, i + iCurrentTimeMillis) : Math.max(0, i - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(x15 x15Var, TaskCompletionSource taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + x15Var.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.h.z(new p35(x15Var.f40103a, mwb0.c, null), new iyj(this, taskCompletionSource, SystemClock.elapsedRealtime() - this.d < 2000, x15Var));
    }
}
