package a;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class abp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f590a;
    public final p7m0 b;
    public final p7m0 c;
    public final p7m0 d;
    public final p7m0 e;
    public final p7m0 f;
    public final p7m0 g;
    public final p7m0 h;
    public final k050 i;

    public abp() {
        jap japVar = jap.f16201a;
        this.f590a = q7m0.a(japVar);
        this.b = q7m0.a(japVar);
        this.c = q7m0.a(japVar);
        this.d = q7m0.a(japVar);
        this.e = q7m0.a("");
        this.f = q7m0.a(new HashMap());
        this.g = q7m0.a(new HashMap());
        this.h = q7m0.a(new HashMap());
        this.i = new k050();
    }

    public static rwk d(gmq gmqVar) {
        i89 i89Var = new i89(gmqVar, (byte) 18);
        x6o x6oVar = new x6o((byte) 29);
        eoh0 eoh0Var = i120.f;
        zys0.e(2, x6oVar);
        return i120.X(i89Var, eoh0Var, x6oVar);
    }

    public static List e(kap kapVar) {
        return kapVar instanceof iap ? (List) ((iap) kapVar).f14449a : iun.f15405a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object a(long j, zje zjeVar, boolean z) {
        lap lapVar;
        k050 k050Var;
        long j2;
        p7m0 p7m0Var;
        boolean z2;
        long j3;
        long j4 = j;
        if (zjeVar instanceof lap) {
            lapVar = (lap) zjeVar;
            int i = lapVar.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                lapVar.q = i - Integer.MIN_VALUE;
            } else {
                lapVar = new lap(this, zjeVar);
            }
        } else {
            lapVar = new lap(this, zjeVar);
        }
        Object obj = lapVar.o;
        wne wneVar = wne.f39444a;
        int i2 = lapVar.q;
        if (i2 == 0) {
            z1x.P(obj);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            p7m0 p7m0Var2 = this.h;
            lapVar.m = p7m0Var2;
            k050 k050Var2 = this.i;
            lapVar.n = k050Var2;
            lapVar.i = j4;
            lapVar.l = z;
            lapVar.j = j4;
            lapVar.k = jElapsedRealtime;
            lapVar.q = 1;
            if (k050Var2.d(lapVar) == wneVar) {
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
            long j5 = lapVar.k;
            long j6 = lapVar.j;
            boolean z3 = lapVar.l;
            long j7 = lapVar.i;
            k050Var = lapVar.n;
            p7m0Var = lapVar.m;
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
                linkedHashMapP.put(new Long(j4), new fd90(j2, z2, j3));
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

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object b(long j, boolean z, xvs xvsVar, zje zjeVar) {
        map mapVar;
        p7m0 p7m0Var;
        k050 k050Var;
        long j2;
        xvs xvsVar2;
        boolean z2;
        long j3;
        long j4 = j;
        if (zjeVar instanceof map) {
            mapVar = (map) zjeVar;
            int i = mapVar.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                mapVar.r = i - Integer.MIN_VALUE;
            } else {
                mapVar = new map(this, zjeVar);
            }
        } else {
            mapVar = new map(this, zjeVar);
        }
        Object obj = mapVar.p;
        wne wneVar = wne.f39444a;
        int i2 = mapVar.r;
        if (i2 == 0) {
            z1x.P(obj);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            mapVar.m = xvsVar;
            p7m0Var = this.f;
            mapVar.n = p7m0Var;
            k050 k050Var2 = this.i;
            mapVar.o = k050Var2;
            mapVar.i = j4;
            mapVar.l = z;
            mapVar.j = j4;
            mapVar.k = jElapsedRealtime;
            mapVar.r = 1;
            if (k050Var2.d(mapVar) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
            j2 = j4;
            xvsVar2 = xvsVar;
            z2 = z;
            j3 = jElapsedRealtime;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = mapVar.k;
            long j6 = mapVar.j;
            boolean z3 = mapVar.l;
            long j7 = mapVar.i;
            k050Var = mapVar.o;
            p7m0Var = mapVar.n;
            xvs xvsVar3 = mapVar.m;
            z1x.P(obj);
            j3 = j5;
            z2 = z3;
            xvsVar2 = xvsVar3;
            j4 = j6;
            j2 = j7;
        }
        while (true) {
            try {
                Object value = p7m0Var.getValue();
                LinkedHashMap linkedHashMapP = xp20.p((Map) value);
                long j8 = j3;
                linkedHashMapP.put(new Long(j4), new hd90(j2, z2, xvsVar2, j3));
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

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object c(long j, boolean z, tnp0 tnp0Var, zje zjeVar) {
        nap napVar;
        p7m0 p7m0Var;
        k050 k050Var;
        long j2;
        tnp0 tnp0Var2;
        boolean z2;
        long j3;
        long j4 = j;
        if (zjeVar instanceof nap) {
            napVar = (nap) zjeVar;
            int i = napVar.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                napVar.r = i - Integer.MIN_VALUE;
            } else {
                napVar = new nap(this, zjeVar);
            }
        } else {
            napVar = new nap(this, zjeVar);
        }
        Object obj = napVar.p;
        wne wneVar = wne.f39444a;
        int i2 = napVar.r;
        if (i2 == 0) {
            z1x.P(obj);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            napVar.m = tnp0Var;
            p7m0Var = this.g;
            napVar.n = p7m0Var;
            k050 k050Var2 = this.i;
            napVar.o = k050Var2;
            napVar.i = j4;
            napVar.l = z;
            napVar.j = j4;
            napVar.k = jElapsedRealtime;
            napVar.r = 1;
            if (k050Var2.d(napVar) == wneVar) {
                return wneVar;
            }
            k050Var = k050Var2;
            j2 = j4;
            tnp0Var2 = tnp0Var;
            z2 = z;
            j3 = jElapsedRealtime;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = napVar.k;
            long j6 = napVar.j;
            boolean z3 = napVar.l;
            long j7 = napVar.i;
            k050Var = napVar.o;
            p7m0Var = napVar.n;
            tnp0 tnp0Var3 = napVar.m;
            z1x.P(obj);
            j3 = j5;
            z2 = z3;
            tnp0Var2 = tnp0Var3;
            j4 = j6;
            j2 = j7;
        }
        while (true) {
            try {
                Object value = p7m0Var.getValue();
                LinkedHashMap linkedHashMapP = xp20.p((Map) value);
                long j8 = j3;
                linkedHashMapP.put(new Long(j4), new kd90(j2, z2, j3, tnp0Var2));
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
    public final Object f(long j, long j2, zje zjeVar) {
        xap xapVar;
        k050 k050Var;
        p7m0 p7m0Var;
        Object value;
        LinkedHashMap linkedHashMapP;
        if (zjeVar instanceof xap) {
            xapVar = (xap) zjeVar;
            int i = xapVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                xapVar.o = i - Integer.MIN_VALUE;
            } else {
                xapVar = new xap(this, zjeVar);
            }
        } else {
            xapVar = new xap(this, zjeVar);
        }
        Object obj = xapVar.m;
        wne wneVar = wne.f39444a;
        int i2 = xapVar.o;
        if (i2 == 0) {
            z1x.P(obj);
            p7m0 p7m0Var2 = this.h;
            xapVar.k = p7m0Var2;
            k050Var = this.i;
            xapVar.l = k050Var;
            xapVar.i = j2;
            xapVar.j = j;
            xapVar.o = 1;
            if (k050Var.d(xapVar) == wneVar) {
                return wneVar;
            }
            p7m0Var = p7m0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = xapVar.j;
            j2 = xapVar.i;
            k050Var = xapVar.l;
            p7m0Var = xapVar.k;
            z1x.P(obj);
        }
        do {
            try {
                value = p7m0Var.getValue();
                linkedHashMapP = xp20.p((Map) value);
                Object obj2 = linkedHashMapP.get(new Long(j));
                if (obj2 != null && ((fd90) obj2).c == j2) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(long j, long j2, zje zjeVar) {
        yap yapVar;
        k050 k050Var;
        p7m0 p7m0Var;
        Object value;
        LinkedHashMap linkedHashMapP;
        if (zjeVar instanceof yap) {
            yapVar = (yap) zjeVar;
            int i = yapVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                yapVar.o = i - Integer.MIN_VALUE;
            } else {
                yapVar = new yap(this, zjeVar);
            }
        } else {
            yapVar = new yap(this, zjeVar);
        }
        Object obj = yapVar.m;
        wne wneVar = wne.f39444a;
        int i2 = yapVar.o;
        if (i2 == 0) {
            z1x.P(obj);
            p7m0 p7m0Var2 = this.f;
            yapVar.k = p7m0Var2;
            k050Var = this.i;
            yapVar.l = k050Var;
            yapVar.i = j2;
            yapVar.j = j;
            yapVar.o = 1;
            if (k050Var.d(yapVar) == wneVar) {
                return wneVar;
            }
            p7m0Var = p7m0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = yapVar.j;
            j2 = yapVar.i;
            k050Var = yapVar.l;
            p7m0Var = yapVar.k;
            z1x.P(obj);
        }
        do {
            try {
                value = p7m0Var.getValue();
                linkedHashMapP = xp20.p((Map) value);
                Object obj2 = linkedHashMapP.get(new Long(j));
                if (obj2 != null && ((hd90) obj2).d == j2) {
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(long j, long j2, zje zjeVar) {
        zap zapVar;
        k050 k050Var;
        p7m0 p7m0Var;
        Object value;
        LinkedHashMap linkedHashMapP;
        if (zjeVar instanceof zap) {
            zapVar = (zap) zjeVar;
            int i = zapVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                zapVar.o = i - Integer.MIN_VALUE;
            } else {
                zapVar = new zap(this, zjeVar);
            }
        } else {
            zapVar = new zap(this, zjeVar);
        }
        Object obj = zapVar.m;
        wne wneVar = wne.f39444a;
        int i2 = zapVar.o;
        if (i2 == 0) {
            z1x.P(obj);
            p7m0 p7m0Var2 = this.g;
            zapVar.k = p7m0Var2;
            k050Var = this.i;
            zapVar.l = k050Var;
            zapVar.i = j2;
            zapVar.j = j;
            zapVar.o = 1;
            if (k050Var.d(zapVar) == wneVar) {
                return wneVar;
            }
            p7m0Var = p7m0Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = zapVar.j;
            j2 = zapVar.i;
            k050Var = zapVar.l;
            p7m0Var = zapVar.k;
            z1x.P(obj);
        }
        do {
            try {
                value = p7m0Var.getValue();
                linkedHashMapP = xp20.p((Map) value);
                Object obj2 = linkedHashMapP.get(new Long(j));
                if (obj2 != null && ((kd90) obj2).c == j2) {
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
