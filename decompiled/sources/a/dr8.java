package a;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class dr8 implements ff60, l5u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6545a;
    public long b;
    public Object c;
    public Object d;

    public dr8(long j, int i) {
        x0x.K(((o52) this.c) == null);
        this.f6545a = j;
        this.b = j + ((long) i);
    }

    @Override // a.l5u0
    public boolean a() {
        return true;
    }

    @Override // a.l5u0
    public long b(t73 t73Var, t73 t73Var2, t73 t73Var3) {
        return Long.MAX_VALUE;
    }

    @Override // a.l5u0
    public t73 c(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        return ((o5u0) this.c).c(m(j), t73Var, t73Var2, n(j, t73Var, t73Var3, t73Var2));
    }

    @Override // a.ff60
    public long d(guo guoVar) {
        long j = this.b;
        if (j < 0) {
            return -1L;
        }
        long j2 = -(j + 2);
        this.b = -1L;
        return j2;
    }

    @Override // a.l5u0
    public t73 h(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        return ((o5u0) this.c).h(m(j), t73Var, t73Var2, n(j, t73Var, t73Var3, t73Var2));
    }

    @Override // a.ff60
    public fvh0 i() {
        x0x.K(this.f6545a != -1);
        return new ca5((ajq) this.c, this.f6545a, (byte) 1);
    }

    @Override // a.ff60
    public void j(long j) {
        long[] jArr = (long[]) ((jtj) this.d).b;
        this.b = jArr[vtt0.f(jArr, j, true)];
    }

    public void k(Object obj, Object obj2, obe0 obe0Var) {
        obe0 obe0Var2 = (obe0) obj2;
        ((y78) ((r34) this.d).b).w((jr30) obj, obe0Var2.f24974a, obe0Var2.b, obe0Var2.c);
    }

    public long l() {
        long j = this.b;
        if (j != -1) {
            return j;
        }
        long jO = 0;
        for (Map.Entry entry : ((LinkedHashMap) this.c).entrySet()) {
            jO += o(entry.getKey(), entry.getValue());
        }
        this.b = jO;
        return jO;
    }

    public long m(long j) {
        long j2 = this.b;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.f6545a;
        long j5 = j3 / j4;
        return (((kkf0) this.d) == kkf0.f18436a || j5 % 2 == 0) ? j3 - (j5 * j4) : ((j5 + 1) * j4) - j3;
    }

    public t73 n(long j, t73 t73Var, t73 t73Var2, t73 t73Var3) {
        long j2 = this.b;
        long j3 = j + j2;
        long j4 = this.f6545a;
        return j3 > j4 ? ((o5u0) this.c).h(j4 - j2, t73Var, t73Var3, t73Var2) : t73Var2;
    }

    public long o(Object obj, Object obj2) throws Exception {
        try {
            long j = ((obe0) obj2).c;
            if (j >= 0) {
                return j;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j).toString());
        } catch (Exception e) {
            this.b = -1L;
            throw e;
        }
    }

    public void p(Exception exc) throws Exception {
        boolean z;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
        }
        if (this.f6545a == -9223372036854775807L) {
            ((osj) this.d).r.getClass();
            synchronized (l44.r) {
                z = l44.t > 0;
            }
            if (!z) {
                this.f6545a = 200 + jElapsedRealtime;
            }
        }
        long j = this.f6545a;
        if (j == -9223372036854775807L || jElapsedRealtime < j) {
            this.b = jElapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.c;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.c;
        this.c = null;
        this.f6545a = -9223372036854775807L;
        this.b = -9223372036854775807L;
        throw exc3;
    }

    public void q(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        while (l() > j) {
            if (linkedHashMap.isEmpty()) {
                if (l() == 0) {
                    return;
                }
                jf4.n("sizeOf() is returning inconsistent values");
                return;
            } else {
                Map.Entry entry = (Map.Entry) CollectionsKt.T(linkedHashMap.entrySet());
                Object key = entry.getKey();
                Object value = entry.getValue();
                linkedHashMap.remove(key);
                this.b = l() - o(key, value);
                k(key, value, null);
            }
        }
    }

    public boolean r(long j, boolean z, boolean z2) {
        w4x0 w4x0Var = (w4x0) this.d;
        w4x0Var.m1();
        w4x0Var.n1();
        kxw0 kxw0Var = (kxw0) w4x0Var.b;
        boolean zA = kxw0Var.a();
        uuw0 uuw0Var = kxw0Var.f;
        if (zA) {
            wvw0 wvw0Var = kxw0Var.e;
            kxw0.e(wvw0Var);
            rvw0 rvw0Var = wvw0Var.q;
            kxw0Var.k.getClass();
            rvw0Var.b(System.currentTimeMillis());
        }
        long j2 = j - this.f6545a;
        if (!z && j2 < 1000) {
            kxw0.g(uuw0Var);
            uuw0Var.o.b(Long.valueOf(j2), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z2) {
            j2 = j - this.b;
            this.b = j;
        }
        kxw0.g(uuw0Var);
        uuw0Var.o.b(Long.valueOf(j2), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j2);
        boolean z3 = !kxw0Var.d.B1();
        c2x0 c2x0Var = kxw0Var.l;
        kxw0.f(c2x0Var);
        x6x0.i2(c2x0Var.p1(z3), bundle, true);
        if (!z2) {
            b1x0 b1x0Var = kxw0Var.m;
            kxw0.f(b1x0Var);
            b1x0Var.s1(bundle, "auto", "_e");
        }
        this.f6545a = j;
        q4x0 q4x0Var = (q4x0) this.c;
        q4x0Var.c();
        q4x0Var.b(((Long) btw0.p0.a(null)).longValue());
        return true;
    }

    public dr8(osj osjVar) {
        this.d = osjVar;
        this.f6545a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public dr8(String str, byte[] bArr, long j, long j2) {
        this.c = str;
        this.d = bArr;
        this.f6545a = j;
        this.b = j2;
    }
}
