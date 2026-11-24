package a;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class y9n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f42258a = q7m0.a(xun.f41520a);
    public final p7m0 b = q7m0.a(new HashMap());
    public final k050 c = new k050();

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(long j, zje zjeVar, boolean z) {
        u9n0 u9n0Var;
        k050 k050Var;
        long j2;
        p7m0 p7m0Var;
        boolean z2;
        long j3;
        long j4 = j;
        if (zjeVar instanceof u9n0) {
            u9n0Var = (u9n0) zjeVar;
            int i = u9n0Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                u9n0Var.q = i - Integer.MIN_VALUE;
            } else {
                u9n0Var = new u9n0(this, zjeVar);
            }
        } else {
            u9n0Var = new u9n0(this, zjeVar);
        }
        Object obj = u9n0Var.o;
        wne wneVar = wne.f39444a;
        int i2 = u9n0Var.q;
        if (i2 == 0) {
            z1x.P(obj);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            p7m0 p7m0Var2 = this.b;
            u9n0Var.m = p7m0Var2;
            k050 k050Var2 = this.c;
            u9n0Var.n = k050Var2;
            u9n0Var.i = z;
            u9n0Var.j = j4;
            u9n0Var.k = j4;
            u9n0Var.l = jElapsedRealtime;
            u9n0Var.q = 1;
            if (k050Var2.d(u9n0Var) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
            j2 = j4;
            p7m0Var = p7m0Var2;
            z2 = z;
            j3 = jElapsedRealtime;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = u9n0Var.l;
            long j6 = u9n0Var.k;
            long j7 = u9n0Var.j;
            boolean z3 = u9n0Var.i;
            k050Var = u9n0Var.n;
            p7m0Var = u9n0Var.m;
            z1x.P(obj);
            j3 = j5;
            z2 = z3;
            j4 = j6;
            j2 = j7;
        }
        while (true) {
            try {
                Object value = p7m0Var.getValue();
                LinkedHashMap linkedHashMapP = xp20.p((Map) value);
                long j8 = j3;
                linkedHashMapP.put(new Long(j4), new o8n0(j2, z2, j3));
                if (p7m0Var.m(value, linkedHashMapP)) {
                    Long l = new Long(j8);
                    k050Var.c(null);
                    return l;
                }
                j3 = j8;
            } catch (Throwable th) {
                k050Var.c(null);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, long j2, zje zjeVar) {
        x9n0 x9n0Var;
        k050 k050Var;
        p7m0 p7m0Var;
        Object value;
        LinkedHashMap linkedHashMapP;
        if (zjeVar instanceof x9n0) {
            x9n0Var = (x9n0) zjeVar;
            int i = x9n0Var.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                x9n0Var.o = i - Integer.MIN_VALUE;
            } else {
                x9n0Var = new x9n0(this, zjeVar);
            }
        } else {
            x9n0Var = new x9n0(this, zjeVar);
        }
        Object obj = x9n0Var.m;
        wne wneVar = wne.f39444a;
        int i2 = x9n0Var.o;
        if (i2 == 0) {
            z1x.P(obj);
            p7m0 p7m0Var2 = this.b;
            x9n0Var.k = p7m0Var2;
            k050Var = this.c;
            x9n0Var.l = k050Var;
            x9n0Var.i = j2;
            x9n0Var.j = j;
            x9n0Var.o = 1;
            if (k050Var.d(x9n0Var) == wneVar) {
                return wneVar;
            }
            p7m0Var = p7m0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = x9n0Var.j;
            j2 = x9n0Var.i;
            k050Var = x9n0Var.l;
            p7m0Var = x9n0Var.k;
            z1x.P(obj);
        }
        do {
            try {
                value = p7m0Var.getValue();
                linkedHashMapP = xp20.p((Map) value);
                Object obj2 = linkedHashMapP.get(new Long(j));
                if (obj2 != null && ((o8n0) obj2).c == j2) {
                    linkedHashMapP.remove(new Long(j));
                }
            } catch (Throwable th) {
                k050Var.c(null);
                throw th;
            }
        } while (!p7m0Var.m(value, linkedHashMapP));
        k050Var.c(null);
        return Unit.f46060a;
    }
}
