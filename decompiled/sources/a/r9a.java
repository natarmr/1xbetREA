package a;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class r9a implements ey9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iev f30069a;
    public final m9a b;
    public final w5z c;
    public final j3a d;
    public final cao0 e;
    public final vz9 f;
    public final lrm0 g;
    public final qcq0 h;
    public final vne i;
    public final int j;
    public final Object k;
    public final c14 l;
    public final Map m;
    public final Map n;
    public doq0 o;
    public final o470 p;
    public yy9 q;
    public n9a r;
    public Map s;
    public LinkedHashMap t;
    public o9a u;
    public final CountDownLatch v;
    public boolean w;
    public final CountDownLatch x;
    public Map y;
    public final LinkedHashMap z;

    public r9a(iev ievVar, m9a m9aVar, w5z w5zVar, j3a j3aVar, cao0 cao0Var, vz9 vz9Var, plc plcVar, lrm0 lrm0Var, bsm0 bsm0Var, qcq0 qcq0Var, vne vneVar) {
        m9aVar.getClass();
        j3aVar.getClass();
        cao0Var.getClass();
        bsm0Var.getClass();
        qcq0Var.getClass();
        vneVar.getClass();
        this.f30069a = ievVar;
        this.b = m9aVar;
        this.c = w5zVar;
        this.d = j3aVar;
        this.e = cao0Var;
        this.f = vz9Var;
        this.g = lrm0Var;
        this.h = qcq0Var;
        this.i = vneVar;
        z04 z04Var = s9a.f31844a;
        z04Var.getClass();
        this.j = z04.b.incrementAndGet(z04Var);
        this.k = new Object();
        this.l = o2e.Z(Boolean.FALSE);
        this.m = Collections.synchronizedMap(new HashMap());
        this.n = Collections.synchronizedMap(new HashMap());
        this.p = null;
        this.u = o9a.f24869a;
        this.v = new CountDownLatch(1);
        this.x = new CountDownLatch(1);
        this.z = new LinkedHashMap();
    }

    @Override // a.iki0
    public final void a() {
        if (this.l.a(Boolean.FALSE, Boolean.TRUE)) {
            Log.d("CXCP", this + " session finalizing");
            Trace.beginSection(this + "#onSessionFinalized");
            n();
            m(0L);
            Trace.endSection();
        }
    }

    @Override // a.ey9
    public final void b(fy9 fy9Var) {
        fy9Var.getClass();
        Log.d("CXCP", this + " Closed");
        Trace.beginSection(this + "#onClosed");
        n();
        this.x.countDown();
        o470 o470Var = this.p;
        if (o470Var != null) {
            o470Var.j();
        }
        Trace.endSection();
    }

    @Override // a.ey9
    public final void c(fy9 fy9Var) {
        fy9Var.getClass();
        Log.d("CXCP", this + " Active");
    }

    @Override // a.iki0
    public final void d() {
        Log.d("CXCP", this + " session disconnecting");
        Trace.beginSection(this + "#onSessionDisconnected");
        k();
        try {
            Trace.beginSection(this + "#onSessionDisconnected Await");
            this.v.await();
            Trace.endSection();
        } finally {
            Trace.endSection();
        }
    }

    @Override // a.ey9
    public final void e(fy9 fy9Var) {
        fy9Var.getClass();
        Log.w("CXCP", this + " Configuration Failed");
        Trace.beginSection(this + "#onConfigureFailed");
        this.f30069a.a(new mev(9, false));
        n();
        this.x.countDown();
        o470 o470Var = this.p;
        if (o470Var != null) {
            o470Var.j();
        }
        Trace.endSection();
    }

    @Override // a.ey9
    public final void f(fy9 fy9Var) {
        fy9Var.getClass();
        Log.d("CXCP", this + " Configured");
        Trace.beginSection(this + "#configure");
        i(fy9Var);
        this.x.countDown();
        o470 o470Var = this.p;
        if (o470Var != null) {
            o470Var.j();
        }
        Trace.endSection();
    }

    @Override // a.ey9
    public final void g(fy9 fy9Var) {
        fy9Var.getClass();
        Log.d("CXCP", this + " Ready");
    }

    @Override // a.ey9
    public final void h(fy9 fy9Var) {
        fy9Var.getClass();
        Log.d("CXCP", this + " CaptureQueueEmpty");
    }

    public final void i(fy9 fy9Var) {
        synchronized (this.k) {
            try {
                n9a n9aVar = this.r;
                if (n9aVar == null && fy9Var != null) {
                    w5z w5zVar = this.c;
                    Map map = this.m;
                    map.getClass();
                    Map map2 = this.n;
                    map2.getClass();
                    uw9 uw9VarJ = w5zVar.j(fy9Var, map, map2);
                    n9a n9aVar2 = new n9a(fy9Var, new ucs0(uw9VarJ), uw9VarJ);
                    this.r = n9aVar2;
                    n9aVar = n9aVar2;
                }
                if (this.u == o9a.c && n9aVar != null) {
                    boolean z = (this.s == null || this.t == null) ? false : true;
                    if (z) {
                        l(false);
                    }
                    synchronized (this.k) {
                        this.e.getClass();
                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                        doq0 doq0Var = this.o;
                        doq0Var.getClass();
                        Log.i("CXCP", "Configured " + this + " in " + String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((jElapsedRealtimeNanos - doq0Var.f6426a) / 1000000.0d)}, 1)));
                        this.f30069a.b(n9aVar.b);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(Map map) {
        map.getClass();
        synchronized (this.k) {
            try {
                o9a o9aVar = this.u;
                if (o9aVar != o9a.d && o9aVar != o9a.e) {
                    Map map2 = this.y;
                    if (map2 == null) {
                        map2 = lun.f20680a;
                        map2.getClass();
                    }
                    p(map2, map);
                    this.y = map;
                    Map map3 = this.s;
                    yje yjeVar = null;
                    if (map3 != null && this.t == null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry entry : map.entrySet()) {
                            if (map3.containsKey(entry.getKey())) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        if (linkedHashMap.size() == map3.size()) {
                            this.t = linkedHashMap;
                            qjj.W(this.i, null, null, new wa(this, yjeVar, (byte) 28), 3);
                        }
                    }
                    qjj.W(this.i, null, null, new p9a(this, yjeVar, (byte) 1), 3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (this.k) {
            try {
                o9a o9aVar = this.u;
                o9a o9aVar2 = o9a.d;
                if (o9aVar != o9aVar2 && o9aVar != o9a.e) {
                    this.u = o9aVar2;
                    n9a n9aVar = this.r;
                    yje yjeVar = null;
                    boolean z = false;
                    if (n9aVar != null) {
                        this.r = null;
                    } else {
                        if (this.f.d && this.w) {
                            z = true;
                        }
                        n9aVar = null;
                    }
                    o470 o470Var = this.p;
                    if (o470Var != null) {
                        o470Var.j();
                    }
                    if (z) {
                        Log.d("CXCP", "Waiting for CameraCaptureSession configuration");
                        if (((Unit) this.h.b(3000L, new m91(this, yjeVar, (byte) 7))) == null) {
                            Log.e("CXCP", "Waiting for CameraCaptureSession configuration timed out");
                        }
                        synchronized (this.k) {
                            n9aVar = this.r;
                            this.r = null;
                        }
                    }
                    Trace.beginSection(this.f30069a + "#onGraphStopping");
                    iev ievVar = this.f30069a;
                    Log.d("CXCP", ievVar + " onGraphStopping");
                    ievVar.e.n(pev.b);
                    ievVar.c.w(null);
                    for (sev sevVar : ievVar.d) {
                        sevVar.f32090a.b(sevVar.a(), pev.b);
                    }
                    Trace.endSection();
                    if (n9aVar != null) {
                        ucs0 ucs0Var = n9aVar.b;
                        Log.d("CXCP", this + " Shutdown");
                        Trace.beginSection(this + "#shutdown");
                        if (this.f.f38288a && ((Unit) this.h.b(2000L, new r72(this, ucs0Var, yjeVar, (byte) 6))) == null) {
                            Log.e("CXCP", "Failed to abort captures in 2000ms");
                        }
                        Trace.beginSection(this + "#disconnect");
                        n9aVar.c.c();
                        Trace.endSection();
                        if (this.f.d && ((Unit) this.h.b(3000L, new r72(this, n9aVar, yjeVar, (byte) 5))) == null) {
                            Log.e("CXCP", "Failed to close the capture session in 3000ms");
                        }
                        Trace.beginSection(this.f30069a + "#onGraphStopped");
                        this.f30069a.c();
                        Trace.endSection();
                        Trace.endSection();
                    } else {
                        Trace.beginSection(this.f30069a + "#onGraphStopped");
                        this.f30069a.c();
                        Trace.endSection();
                    }
                    this.v.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(boolean z) {
        n9a n9aVar;
        Map map;
        LinkedHashMap linkedHashMap;
        boolean z2;
        synchronized (this.k) {
            n9aVar = this.r;
            map = this.s;
            linkedHashMap = this.t;
        }
        if (n9aVar == null || map == null || linkedHashMap == null) {
            return;
        }
        Trace.beginSection(this + "#finalizeOutputConfigurations");
        this.e.getClass();
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        for (Map.Entry entry : map.entrySet()) {
            mrm0 mrm0Var = (mrm0) entry.getKey();
            int i = mrm0Var.f22281a;
            o03 o03Var = (o03) entry.getValue();
            Object obj = linkedHashMap.get(mrm0Var);
            if (obj == null) {
                jf4.n("Required value was null.");
                return;
            }
            o03Var.a((Surface) obj);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashSet.add((o03) ((Map.Entry) it.next()).getValue());
        }
        n9aVar.f23129a.K(CollectionsKt.L0(linkedHashSet));
        synchronized (this.k) {
            try {
                if (this.u == o9a.c) {
                    this.m.putAll(linkedHashMap);
                    Iterator it2 = linkedHashMap.entrySet().iterator();
                    while (true) {
                        z2 = true;
                        if (!it2.hasNext()) {
                            this.e.getClass();
                            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                            StringBuilder sb = new StringBuilder();
                            sb.append("Finalized ");
                            ArrayList arrayList = new ArrayList(map.size());
                            Iterator it3 = map.entrySet().iterator();
                            while (it3.hasNext()) {
                                mrm0 mrm0Var2 = (mrm0) ((Map.Entry) it3.next()).getKey();
                                int i2 = mrm0Var2.f22281a;
                                arrayList.add(mrm0Var2);
                            }
                            sb.append(arrayList);
                            sb.append(" for ");
                            sb.append(this);
                            sb.append(" in ");
                            sb.append(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf(jElapsedRealtimeNanos2 / 1000000.0d)}, 1)));
                            Log.i("CXCP", sb.toString());
                            break;
                        }
                        Map.Entry entry2 = (Map.Entry) it2.next();
                        int i3 = ((mrm0) entry2.getKey()).f22281a;
                        Surface surface = (Surface) entry2.getValue();
                        f3a f3aVarA = this.g.a(i3);
                        if (f3aVarA == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        if (f3aVarA.b.size() != 1) {
                            throw new IllegalStateException("Cannot finalize a multi-output stream!");
                        }
                        Map map2 = this.n;
                        map2.getClass();
                        map2.put(new xe80(((krm0) CollectionsKt.v0(f3aVarA.b)).f18773a), surface);
                    }
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z2 && z) {
            iev ievVar = this.f30069a;
            Log.d("CXCP", ievVar + " onGraphModified");
            ievVar.c.g.k0(pdv.b);
        }
        Trace.endSection();
    }

    public final void m(long j) {
        List<AutoCloseable> listL0;
        boolean zIsTerminated;
        if (j != 0) {
            qjj.W(this.i, null, null, new ir(j, this, null), 3);
            return;
        }
        Log.d("CXCP", "Finalizing " + this);
        synchronized (this.k) {
            listL0 = CollectionsKt.L0(this.z.values());
            this.z.clear();
        }
        for (AutoCloseable autoCloseable : listL0) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    e9d0.o();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0027  */
    public final void n() {
        long j;
        boolean z;
        int i;
        k();
        synchronized (this.k) {
            try {
                o9a o9aVar = this.u;
                o9a o9aVar2 = o9a.e;
                j = 0;
                if (o9aVar != o9aVar2) {
                    z = true;
                    if (this.q != null && this.w && (i = this.f.c) != 1) {
                        if (i == 2) {
                            j = 2000;
                        } else {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                this.q = null;
                this.u = o9aVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            m(j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00db  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:53:0x0120  */
    /* JADX WARN: Code duplicated, block: B:62:0x0133 A[Catch: all -> 0x01c5, TryCatch #0 {all -> 0x01c5, blocks: (B:55:0x0123, B:57:0x0129, B:60:0x012f, B:62:0x0133, B:64:0x0157, B:66:0x0196, B:67:0x01a3, B:69:0x01a9, B:71:0x01b9, B:76:0x01ca, B:78:0x01d4, B:82:0x01dd, B:83:0x01f4, B:84:0x01f5), top: B:97:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0157 A[Catch: all -> 0x01c5, TryCatch #0 {all -> 0x01c5, blocks: (B:55:0x0123, B:57:0x0129, B:60:0x012f, B:62:0x0133, B:64:0x0157, B:66:0x0196, B:67:0x01a3, B:69:0x01a9, B:71:0x01b9, B:76:0x01ca, B:78:0x01d4, B:82:0x01dd, B:83:0x01f4, B:84:0x01f5), top: B:97:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0196 A[Catch: all -> 0x01c5, TryCatch #0 {all -> 0x01c5, blocks: (B:55:0x0123, B:57:0x0129, B:60:0x012f, B:62:0x0133, B:64:0x0157, B:66:0x0196, B:67:0x01a3, B:69:0x01a9, B:71:0x01b9, B:76:0x01ca, B:78:0x01d4, B:82:0x01dd, B:83:0x01f4, B:84:0x01f5), top: B:97:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a9 A[Catch: all -> 0x01c5, TryCatch #0 {all -> 0x01c5, blocks: (B:55:0x0123, B:57:0x0129, B:60:0x012f, B:62:0x0133, B:64:0x0157, B:66:0x0196, B:67:0x01a3, B:69:0x01a9, B:71:0x01b9, B:76:0x01ca, B:78:0x01d4, B:82:0x01dd, B:83:0x01f4, B:84:0x01f5), top: B:97:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x01dd A[Catch: all -> 0x01c5, TRY_ENTER, TryCatch #0 {all -> 0x01c5, blocks: (B:55:0x0123, B:57:0x0129, B:60:0x012f, B:62:0x0133, B:64:0x0157, B:66:0x0196, B:67:0x01a3, B:69:0x01a9, B:71:0x01b9, B:76:0x01ca, B:78:0x01d4, B:82:0x01dd, B:83:0x01f4, B:84:0x01f5), top: B:97:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0105, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0157, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:82:0x01dd, please report this as an issue */
    public final Object o(zje zjeVar) {
        q9a q9aVar;
        mie0 mie0VarJ;
        mie0 mie0Var;
        mie0 mie0Var2;
        mie0 mie0Var3;
        yy9 yy9Var;
        String strF;
        String strB;
        yy9 yy9Var2;
        String strF2;
        l9a l9aVarA;
        o9a o9aVar;
        Map map;
        Map map2;
        LinkedHashMap linkedHashMap;
        if (zjeVar instanceof q9a) {
            q9aVar = (q9a) zjeVar;
            int i = q9aVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                q9aVar.m = i - Integer.MIN_VALUE;
            } else {
                q9aVar = new q9a(this, zjeVar);
            }
        } else {
            q9aVar = new q9a(this, zjeVar);
        }
        Object obj = q9aVar.k;
        wne wneVar = wne.f39444a;
        int i2 = q9aVar.m;
        try {
            if (i2 == 0) {
                mie0VarJ = ohs0.j(obj);
                mie0Var = new mie0();
                synchronized (this.k) {
                    if (this.u != o9a.f24869a) {
                        return Unit.f46060a;
                    }
                    mie0VarJ.f21842a = this.y;
                    yy9 yy9Var3 = this.q;
                    mie0Var.f21842a = yy9Var3;
                    if (mie0VarJ.f21842a != null && yy9Var3 != null) {
                        this.u = o9a.b;
                        this.w = true;
                        this.e.getClass();
                        this.o = new doq0(SystemClock.elapsedRealtimeNanos());
                        o470 o470Var = this.p;
                        if (o470Var != null) {
                            Log.d("CXCP", "Awaiting session lock");
                            q9aVar.i = mie0VarJ;
                            q9aVar.j = mie0Var;
                            q9aVar.m = 1;
                            if (o470Var.c(q9aVar) == wneVar) {
                                return wneVar;
                            }
                            mie0Var2 = mie0VarJ;
                            mie0Var3 = mie0Var;
                        }
                        StringBuilder sb = new StringBuilder("Creating CameraCaptureSession from ");
                        yy9Var = (yy9) mie0Var.f21842a;
                        if (yy9Var != null) {
                            strF = yy9Var.F();
                        } else {
                            strF = null;
                        }
                        if (strF == null) {
                            strB = "null";
                        } else {
                            strB = g0a.b(strF);
                        }
                        sb.append((Object) strB);
                        sb.append(" using ");
                        sb.append(this);
                        sb.append(" with ");
                        sb.append(mie0VarJ.f21842a);
                        Log.i("CXCP", sb.toString());
                        StringBuilder sb2 = new StringBuilder("CameraDevice-");
                        yy9Var2 = (yy9) mie0Var.f21842a;
                        if (yy9Var2 != null) {
                            strF2 = yy9Var2.F();
                        } else {
                            strF2 = null;
                        }
                        Trace.beginSection(axq.n(sb2, strF2, "#createCaptureSession"));
                        m9a m9aVar = this.b;
                        Object obj2 = mie0Var.f21842a;
                        obj2.getClass();
                        Object obj3 = mie0VarJ.f21842a;
                        obj3.getClass();
                        l9aVarA = m9aVar.a((yy9) obj2, (Map) obj3, this);
                        Trace.endSection();
                        if (!(l9aVarA instanceof k9a)) {
                            Log.e("CXCP", "Failed to create capture session for " + this + '!');
                            return Unit.f46060a;
                        }
                        synchronized (this.k) {
                            try {
                                o9aVar = this.u;
                                if (o9aVar != o9a.d && o9aVar != o9a.e) {
                                    if (o9aVar == o9a.b) {
                                        throw new IllegalStateException(("Unexpected state: " + this.u).toString());
                                    }
                                    this.u = o9a.c;
                                    Map map3 = this.m;
                                    Object obj4 = mie0VarJ.f21842a;
                                    obj4.getClass();
                                    map3.putAll((Map) obj4);
                                    this.n.putAll(((k9a) l9aVarA).b);
                                    map = ((k9a) l9aVarA).f17905a;
                                    if (!map.isEmpty()) {
                                        Log.i("CXCP", "Created " + this + " with " + CollectionsKt.L0(((Map) mie0VarJ.f21842a).keySet()) + ". Waiting to finalize " + CollectionsKt.L0(map.keySet()));
                                        this.s = map;
                                        map2 = this.y;
                                        if (map2 != null) {
                                            linkedHashMap = new LinkedHashMap();
                                            for (Map.Entry entry : map2.entrySet()) {
                                                if (map.containsKey(entry.getKey())) {
                                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                                }
                                            }
                                        } else {
                                            linkedHashMap = null;
                                        }
                                        if (linkedHashMap != null && linkedHashMap.size() == map.size()) {
                                            this.t = linkedHashMap;
                                        }
                                    }
                                    i(null);
                                    return Unit.f46060a;
                                }
                                Log.i("CXCP", "Warning: " + this + " was " + this.u + " while configuration was in progress.");
                                return Unit.f46060a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return Unit.f46060a;
                }
            }
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mie0Var3 = q9aVar.j;
            mie0Var2 = q9aVar.i;
            z1x.P(obj);
            Trace.beginSection(axq.n(sb2, strF2, "#createCaptureSession"));
            m9a m9aVar2 = this.b;
            Object obj5 = mie0Var.f21842a;
            obj5.getClass();
            Object obj6 = mie0VarJ.f21842a;
            obj6.getClass();
            l9aVarA = m9aVar2.a((yy9) obj5, (Map) obj6, this);
            Trace.endSection();
            if (!(l9aVarA instanceof k9a)) {
                Log.e("CXCP", "Failed to create capture session for " + this + '!');
                return Unit.f46060a;
            }
            synchronized (this.k) {
                o9aVar = this.u;
                if (o9aVar != o9a.d) {
                    if (o9aVar == o9a.b) {
                        throw new IllegalStateException(("Unexpected state: " + this.u).toString());
                    }
                    this.u = o9a.c;
                    Map map4 = this.m;
                    Object obj7 = mie0VarJ.f21842a;
                    obj7.getClass();
                    map4.putAll((Map) obj7);
                    this.n.putAll(((k9a) l9aVarA).b);
                    map = ((k9a) l9aVarA).f17905a;
                    if (!map.isEmpty()) {
                        Log.i("CXCP", "Created " + this + " with " + CollectionsKt.L0(((Map) mie0VarJ.f21842a).keySet()) + ". Waiting to finalize " + CollectionsKt.L0(map.keySet()));
                        this.s = map;
                        map2 = this.y;
                        if (map2 != null) {
                            linkedHashMap = new LinkedHashMap();
                            while (r13.hasNext()) {
                                if (map.containsKey(entry.getKey())) {
                                    linkedHashMap.put(entry.getKey(), entry.getValue());
                                }
                            }
                        } else {
                            linkedHashMap = null;
                        }
                        if (linkedHashMap != null) {
                            this.t = linkedHashMap;
                        }
                    }
                    i(null);
                    return Unit.f46060a;
                }
                Log.i("CXCP", "Warning: " + this + " was " + this.u + " while configuration was in progress.");
                return Unit.f46060a;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
        mie0VarJ = mie0Var2;
        mie0Var = mie0Var3;
        StringBuilder sb3 = new StringBuilder("Creating CameraCaptureSession from ");
        yy9Var = (yy9) mie0Var.f21842a;
        if (yy9Var != null) {
            strF = yy9Var.F();
        } else {
            strF = null;
        }
        if (strF == null) {
            strB = "null";
        } else {
            strB = g0a.b(strF);
        }
        sb3.append((Object) strB);
        sb3.append(" using ");
        sb3.append(this);
        sb3.append(" with ");
        sb3.append(mie0VarJ.f21842a);
        Log.i("CXCP", sb3.toString());
        StringBuilder sb4 = new StringBuilder("CameraDevice-");
        yy9Var2 = (yy9) mie0Var.f21842a;
        if (yy9Var2 != null) {
            strF2 = yy9Var2.F();
        } else {
            strF2 = null;
        }
    }

    public final void p(Map map, Map map2) throws Exception {
        Surface surface;
        AutoCloseable autoCloseable;
        boolean zIsTerminated;
        Set setP0 = CollectionsKt.P0(map.values());
        Set setP1 = CollectionsKt.P0(map2.values());
        Iterator it = eui0.f(setP0, setP1).iterator();
        do {
            boolean zHasNext = it.hasNext();
            LinkedHashMap linkedHashMap = this.z;
            if (!zHasNext) {
                for (Surface surface2 : eui0.f(setP1, setP0)) {
                    linkedHashMap.put(surface2, this.d.a(surface2));
                }
                return;
            }
            surface = (Surface) it.next();
            autoCloseable = (AutoCloseable) linkedHashMap.remove(surface);
            if (autoCloseable == null) {
                autoCloseable = null;
            } else if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    e9d0.o();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        } while (autoCloseable != null);
        c99.t(surface, " doesn't have a matching surface token!", "Surface ");
    }

    public final String toString() {
        return "CaptureSessionState-" + this.j;
    }
}
