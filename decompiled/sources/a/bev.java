package a;

import android.util.Log;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class bev implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zz9 f2469a;
    public final Map b;
    public final Map c;
    public final List d;
    public final vne e;
    public final sje f;
    public final w5z g;
    public final Object h;
    public volatile boolean i;
    public ucs0 j;
    public cmf0 k;
    public final Map l;
    public Map m;
    public final x04 n;
    public cmf0 o;
    public Map p;
    public Map q;
    public Map r;
    public final List s;
    public ucs0 t;

    public bev(zz9 zz9Var, Map map, Map map2, ArrayList arrayList, List list, vne vneVar, lne lneVar) {
        vneVar.getClass();
        this.f2469a = zz9Var;
        this.b = map;
        this.c = map2;
        this.d = list;
        this.e = vneVar;
        sje sjeVarA = d5c.a(kotlin.coroutines.e.c(lneVar, new rne("CXCP-GraphLoop")));
        this.f = sjeVarA;
        int i = 0;
        Class<bev> cls = bev.class;
        w5z w5zVar = new w5z(new vft(1, this, cls, "finalizeUnprocessedCommands", "finalizeUnprocessedCommands(Ljava/util/List;)V", i, (byte) 8), new ens(2, this, cls, "process", "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i, (byte) 6));
        yje yjeVar = null;
        if (!((x04) w5zVar.c).a()) {
            jf4.n("ProcessingQueue cannot be re-started!");
            throw null;
        }
        if (qjj.W(sjeVarA, null, null, new c670(w5zVar, yjeVar, (byte) 20), 3).isCancelled()) {
            w5zVar.h0(null);
        }
        this.g = w5zVar;
        this.h = new Object();
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.l = lunVar;
        this.n = o2e.X(true);
        this.p = lunVar;
        this.q = lunVar;
        this.r = map2;
        this.s = arrayList;
    }

    public final void a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cmf0 cmf0Var = (cmf0) arrayList.get(i);
            List list = this.s;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((bmf0) list.get(i2)).q(cmf0Var);
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            cmf0 cmf0Var2 = (cmf0) arrayList.get(i3);
            int size4 = cmf0Var2.d.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((bmf0) cmf0Var2.d.get(i4)).q(cmf0Var2);
            }
        }
    }

    public final boolean c(boolean z, List list, Map map) throws Throwable {
        Map mapB;
        ucs0 ucs0Var = this.t;
        if (ucs0Var == null) {
            return false;
        }
        Map map2 = this.p;
        if (map.isEmpty()) {
            mapB = this.r;
        } else {
            jo20 jo20Var = new jo20();
            Map map3 = this.q;
            map3.getClass();
            jo20Var.putAll(map3);
            jo20Var.putAll(map);
            jo20Var.putAll(this.c);
            mapB = jo20Var.b();
        }
        boolean zD = ucs0Var.D(z, list, this.b, map2, mapB, this.s);
        if (!zD) {
            if (z) {
                Log.w("CXCP", "Failed to repeat with " + CollectionsKt.v0(list));
                return zD;
            }
            if (map.isEmpty()) {
                Log.w("CXCP", "Failed to submit capture with " + list);
                return zD;
            }
            Log.w("CXCP", "Failed to trigger with " + CollectionsKt.v0(list) + " and " + map);
        }
        return zD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.h) {
            try {
                if (this.i) {
                    return;
                }
                this.i = true;
                ucs0 ucs0Var = this.j;
                Object[] objArr = 0;
                yje yjeVar = null;
                if (ucs0Var != null) {
                    qjj.W(this.e, null, null, new ydv(ucs0Var, yjeVar, objArr == true ? 1 : 0), 3);
                }
                this.j = null;
                this.g.k0(pdv.c);
                int size = this.d.size();
                for (int i = 0; i < size; i++) {
                    ((xdv) this.d.get(i)).g();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final cmf0 d() {
        cmf0 cmf0Var;
        synchronized (this.h) {
            cmf0Var = this.k;
        }
        return cmf0Var;
    }

    public final void e(List list, int i, qdv qdvVar, boolean z) {
        if (this.n.b()) {
            ArrayList arrayList = qdvVar.f28553a;
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            if (c(false, arrayList, lunVar)) {
                list.remove(i);
                return;
            }
        }
        if (!z || i <= 0) {
            return;
        }
        int i2 = i - 1;
        if (((wdv) list.get(i2)) instanceof tdv) {
            k(i2, list, false);
        } else {
            jf4.n("Check failed.");
        }
    }

    public final void k(int i, List list, boolean z) {
        int i2;
        int i3 = i;
        while (true) {
            int i4 = 0;
            if (-1 >= i3) {
                if (!z || (i2 = i + 1) >= list.size()) {
                    return;
                }
                wdv wdvVar = (wdv) list.get(i2);
                if (wdvVar instanceof qdv) {
                    e(list, i2, (qdv) wdvVar, false);
                    return;
                } else {
                    if (wdvVar instanceof vdv) {
                        q(list, i2, (vdv) wdvVar);
                        return;
                    }
                    return;
                }
            }
            wdv wdvVar2 = (wdv) list.get(i3);
            if (wdvVar2 instanceof tdv) {
                cmf0 cmf0Var = ((tdv) wdvVar2).f33789a;
                List listC = kotlin.collections.a.c(cmf0Var);
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                if (c(true, listC, lunVar)) {
                    this.o = cmf0Var;
                    list.remove(i3);
                    while (i4 < i3) {
                        if (((wdv) list.get(i4)) instanceof tdv) {
                            list.remove(i4);
                            i3--;
                        } else {
                            i4++;
                        }
                    }
                    return;
                }
            }
            i3--;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bd -> B:37:0x00d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d6 -> B:36:0x00d7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e5 -> B:39:0x00e6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object l(java.util.List r18, int r19, a.udv r20, a.yje r21) {
        /*
            Method dump skipped, instruction units count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bev.l(java.util.List, int, a.udv, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3 A[PHI: r3 r8 r11
  0x00d3: PHI (r3v5 int) = (r3v3 int), (r3v8 int) binds: [B:32:0x0099, B:47:0x00d1] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r8v8 java.util.List) = (r8v7 java.util.List), (r8v9 java.util.List) binds: [B:32:0x0099, B:47:0x00d1] A[DONT_GENERATE, DONT_INLINE]
  0x00d3: PHI (r11v6 int) = (r11v5 int), (r11v7 int) binds: [B:32:0x0099, B:47:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0099 -> B:48:0x00d3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00be -> B:47:0x00d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ce -> B:47:0x00d1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object n(java.util.List r11, a.yje r12) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bev.n(java.util.List, a.yje):java.lang.Object");
    }

    public final void q(List list, int i, vdv vdvVar) {
        cmf0 cmf0Var = this.o;
        if (cmf0Var == null && i == 0) {
            list.remove(i);
            return;
        }
        if (this.n.b() && cmf0Var != null && c(false, kotlin.collections.a.c(cmf0Var), vdvVar.f37250a)) {
            list.remove(i);
            return;
        }
        if (i > 0) {
            int i2 = i - 1;
            if (((wdv) list.get(i2)) instanceof tdv) {
                k(i2, list, false);
            } else {
                jf4.n("Check failed.");
            }
        }
    }

    public final boolean r() {
        Boolean boolValueOf;
        ucs0 ucs0Var = this.t;
        if (ucs0Var == null) {
            return false;
        }
        cmf0 cmf0Var = this.o;
        if (cmf0Var != null) {
            boolValueOf = Boolean.valueOf(ucs0Var.D(true, kotlin.collections.a.c(cmf0Var), this.b, this.p, this.r, this.s));
        } else {
            boolValueOf = null;
        }
        return Intrinsics.d(boolValueOf, Boolean.TRUE);
    }

    public final String toString() {
        return "GraphLoop(" + this.f2469a + ')';
    }

    public final void v(boolean z) {
        this.n.f40052a = z ? 1 : 0;
        if (z) {
            this.g.k0(pdv.b);
        }
    }

    public final void w(ucs0 ucs0Var) {
        synchronized (this.h) {
            ucs0 ucs0Var2 = this.j;
            this.j = ucs0Var;
            if (this.i) {
                yje yjeVar = null;
                this.j = null;
                if (ucs0Var != null) {
                    qjj.W(this.e, null, null, new ydv(ucs0Var, yjeVar, (byte) 1), 3);
                }
                return;
            }
            if (ucs0Var2 != ucs0Var) {
                this.g.k0(new udv(ucs0Var2, ucs0Var));
            }
            if (ucs0Var == null) {
                int size = this.d.size();
                for (int i = 0; i < size; i++) {
                    ((xdv) this.d.get(i)).f();
                }
            }
        }
    }
}
