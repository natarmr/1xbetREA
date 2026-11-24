package a;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes2.dex */
public final class bcw0 extends dwb {
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;
    public static final AtomicReference f;
    public static final AtomicLong g;
    public static final ConcurrentLinkedQueue h;
    public volatile dwb b;

    static {
        String str = Build.FINGERPRINT;
        c = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        d = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        e = "eng".equals(str3) || "userdebug".equals(str3);
        f = new AtomicReference();
        g = new AtomicLong();
        h = new ConcurrentLinkedQueue();
    }

    public static void d() {
        while (true) {
            zbw0 zbw0Var = (zbw0) h.poll();
            if (zbw0Var == null) {
                return;
            }
            g.getAndDecrement();
            bcw0 bcw0Var = zbw0Var.f44138a;
            lfx0 lfx0Var = zbw0Var.b;
            yfx0 yfx0Var = lfx0Var.c;
            if ((yfx0Var != null && Boolean.TRUE.equals(yfx0Var.C(xfx0.g))) || bcw0Var.a(lfx0Var.f19980a)) {
                bcw0Var.b(lfx0Var);
            }
        }
    }

    @Override // a.dwb
    public final boolean a(Level level) {
        return this.b == null || this.b.a(level);
    }

    @Override // a.dwb
    public final void b(lfx0 lfx0Var) {
        if (this.b != null) {
            this.b.b(lfx0Var);
            return;
        }
        if (g.incrementAndGet() > 20) {
            h.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        h.offer(new zbw0(this, lfx0Var));
        if (this.b != null) {
            d();
        }
    }

    @Override // a.dwb
    public final void c(RuntimeException runtimeException, lfx0 lfx0Var) {
        if (this.b != null) {
            this.b.c(runtimeException, lfx0Var);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
