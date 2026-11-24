package a;

import android.text.TextUtils;
import androidx.media3.common.Timeline$Window;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class xvj {
    public static final rcf0 p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Timeline$Window f41562a;
    public final amq0 b;
    public final hu5 c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final wcf0 m;
    public final ConcurrentHashMap n;
    public long o;

    static {
        v3x v3xVar = b4x.b;
        Object[] objArr = {"file", RemoteMessageConst.Notification.CONTENT, RemoteMessageConst.DATA, "android.resource", "rawresource", "asset"};
        h8x.w(6, objArr);
        p = b4x.k(6, objArr);
    }

    public xvj() {
        hu5 hu5Var = new hu5((byte) 4);
        hu5Var.d = 0;
        hu5Var.e = new o52[100];
        a(1000, "bufferForPlaybackMs", 0, "0");
        a(1000, "bufferForPlaybackForLocalPlaybackMs", 0, "0");
        a(2000, "bufferForPlaybackAfterRebufferMs", 0, "0");
        a(1000, "bufferForPlaybackAfterRebufferForLocalPlaybackMs", 0, "0");
        a(50000, "minBufferMs", 1000, "bufferForPlaybackMs");
        a(1000, "minBufferForLocalPlaybackMs", 1000, "bufferForPlaybackForLocalPlaybackMs");
        a(50000, "minBufferMs", 2000, "bufferForPlaybackAfterRebufferMs");
        a(1000, "minBufferForLocalPlaybackMs", 1000, "bufferForPlaybackAfterRebufferForLocalPlaybackMs");
        a(50000, "maxBufferMs", 50000, "minBufferMs");
        a(50000, "maxBufferForLocalPlaybackMs", 1000, "minBufferForLocalPlaybackMs");
        a(0, "backBufferDurationMs", 0, "0");
        this.f41562a = new Timeline$Window();
        this.b = new amq0();
        this.c = hu5Var;
        long jM = vtt0.M(50000L);
        this.d = jM;
        long jM2 = vtt0.M(1000L);
        this.e = jM2;
        this.f = jM;
        this.g = jM;
        this.h = jM2;
        this.i = jM2;
        this.j = vtt0.M(2000L);
        this.k = jM2;
        this.l = vtt0.M(0L);
        this.n = new ConcurrentHashMap();
        this.m = wcf0.b(wcf0.g);
        this.o = -1L;
    }

    public static void a(int i, String str, int i2, String str2) {
        x0x.C(i >= i2, "%s cannot be less than %s", str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0074  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    public final boolean b(rl00 rl00Var) {
        int i;
        boolean z;
        boolean z2;
        int i2;
        a4a0 a4a0Var = rl00Var.f30675a;
        wvj wvjVar = (wvj) this.n.get(a4a0Var);
        wvjVar.getClass();
        wvj wvjVar2 = (wvj) this.n.get(a4a0Var);
        wvjVar2.getClass();
        synchronized (wvjVar2) {
            i = wvjVar2.d;
        }
        int i3 = i * 65536;
        wvj wvjVar3 = (wvj) this.n.get(a4a0Var);
        wvjVar3.getClass();
        boolean z3 = i3 >= wvjVar3.c;
        if (a4a0Var.equals(a4a0.c)) {
            return !z3;
        }
        bmq0 bmq0Var = rl00Var.b;
        en30 en30Var = bmq0Var.m(bmq0Var.g(rl00Var.c.f37698a, this.b).c, this.f41562a, 0L).b.b;
        if (en30Var == null) {
            z = false;
        } else {
            String scheme = en30Var.f8073a.getScheme();
            if (TextUtils.isEmpty(scheme) || p.contains(scheme)) {
                z = true;
            } else {
                z = false;
            }
        }
        long jMin = z ? this.e : this.d;
        long j = z ? this.g : this.f;
        float f = rl00Var.e;
        if (f > 1.0f) {
            jMin = Math.min(vtt0.y(f, jMin), j);
        }
        long jMax = Math.max(jMin, 500000L);
        boolean z4 = z3;
        long j2 = rl00Var.d;
        if (j2 < jMax) {
            Runtime runtime = Runtime.getRuntime();
            long jMaxMemory = runtime.maxMemory();
            if (runtime.totalMemory() >= jMaxMemory) {
                long jFreeMemory = runtime.freeMemory();
                hu5 hu5Var = this.c;
                synchronized (hu5Var) {
                    i2 = hu5Var.d * 65536;
                }
                if (jFreeMemory + ((long) i2) >= jMaxMemory / 25) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            } else {
                z2 = true;
            }
            boolean z5 = (z && z2) || !z4;
            wvjVar.b = z5;
            if (!z5 && z && !z2) {
                f1t0.a0("DefaultLoadControl", "Stopped loading before minBufferUs reached due to memory pressure, despite prioritizeTimeOverSizeThresholds=true.");
            }
            if (!wvjVar.b && rl00Var.d < 500000) {
                f1t0.g0("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z4) {
            wvjVar.b = false;
        }
        return wvjVar.b;
    }

    public final void c() {
        boolean zIsEmpty = this.n.isEmpty();
        hu5 hu5Var = this.c;
        int i = 0;
        if (zIsEmpty) {
            synchronized (hu5Var) {
                hu5Var.Y(0);
            }
        } else {
            Iterator it = this.n.values().iterator();
            while (it.hasNext()) {
                i += ((wvj) it.next()).c;
            }
            hu5Var.Y(i);
        }
    }
}
