package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class z1a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f43608a;
    public final lmv b;
    public ScheduledFuture e;
    public ru f;
    public j2a g;
    public jrs0 h;
    public s88 i;
    public final Object c = new Object();
    public final Object d = new Object();
    public final y1a j = new y1a(this, 0);
    public volatile List k = iun.f15405a;
    public final AtomicBoolean l = new AtomicBoolean(false);
    public final CopyOnWriteArrayList m = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList n = new CopyOnWriteArrayList();
    public final LinkedHashMap o = new LinkedHashMap();

    public z1a(Executor executor, lmv lmvVar) {
        this.f43608a = executor;
        this.b = lmvVar;
    }

    public final void a(String str) {
        j2a j2aVar = this.g;
        if (j2aVar == null) {
            return;
        }
        try {
            n0a n0aVarH = j2aVar.b(str).h();
            n0aVarH.getClass();
            e(n0aVarH);
        } catch (IllegalArgumentException unused) {
            l8x.E0("CameraPresencePrvdr", "CameraInternal not found for " + str + ". Cannot setup state observer.");
        }
    }

    public final void b(Set set, Set set2) {
        boolean zIsEmpty = set.isEmpty();
        CopyOnWriteArrayList<x1a> copyOnWriteArrayList = this.n;
        if (!zIsEmpty) {
            l8x.e0("CameraPresencePrvdr", "Notifying " + set.size() + " cameras added.");
            for (x1a x1aVar : copyOnWriteArrayList) {
                x1aVar.b.execute(new w1(x1aVar, set));
            }
        }
        if (set2.isEmpty()) {
            return;
        }
        l8x.e0("CameraPresencePrvdr", "Notifying " + set2.size() + " cameras removed.");
        for (x1a x1aVar2 : copyOnWriteArrayList) {
            x1aVar2.b.execute(new fy2(x1aVar2, set2, (byte) 15));
        }
    }

    public final void c(String str) {
        synchronized (this.c) {
            ee60 ee60Var = (ee60) this.o.remove(str);
            j2a j2aVar = this.g;
            if (ee60Var != null && j2aVar != null) {
                try {
                    ((lmv) j120.T()).execute(new fy2(j2aVar.b(str), ee60Var, (byte) 16));
                    l8x.U("CameraPresencePrvdr", "Removed state observer for: " + str);
                } catch (IllegalArgumentException unused) {
                }
            }
        }
    }

    public final void d(int i, List list) {
        if (i > 0 && this.l.get()) {
            this.e = this.b.schedule(new v1a(this, list, i, (byte) 1), i == 3 ? 0L : 400L, TimeUnit.MILLISECONDS);
        } else if (i <= 0) {
            l8x.E0("CameraPresencePrvdr", "Exhausted all retries for camera list refresh.");
        }
    }

    public final void e(n0a n0aVar) {
        final String strE = n0aVar.e();
        strE.getClass();
        if (this.l.get()) {
            synchronized (this.c) {
                if (this.o.containsKey(strE)) {
                    return;
                }
                ee60 ee60Var = new ee60() { // from class: a.w1a
                    @Override // a.ee60
                    public final void a(Object obj) {
                        o15 o15Var = (o15) obj;
                        z1a z1aVar = this.f38389a;
                        if (!z1aVar.l.get()) {
                            l8x.U("CameraPresencePrvdr", "Ignore camera state change handling since already stop monitoring");
                            return;
                        }
                        if (o15Var.b != null) {
                            StringBuilder sbT = kng0.t("Camera ", strE, " state changed to ");
                            sbT.append(dw9.C(o15Var.f24461a));
                            sbT.append(" with error: ");
                            p15 p15Var = o15Var.b;
                            sbT.append(p15Var != null ? Integer.valueOf(p15Var.f26183a) : null);
                            sbT.append(". Triggering refresh.");
                            l8x.E0("CameraPresencePrvdr", sbT.toString());
                            z1aVar.f43608a.execute(new u1a(z1aVar, (byte) 2));
                        }
                    }
                };
                ((lmv) j120.T()).execute(new fy2(n0aVar, ee60Var, (byte) 17));
                this.o.put(strE, ee60Var);
                l8x.U("CameraPresencePrvdr", "Registered state observer for camera: ".concat(strE));
            }
        }
    }

    public final void f() {
        if (!this.l.getAndSet(false)) {
            l8x.U("CameraPresencePrvdr", "Shutdown called when not monitoring. Ignoring.");
            return;
        }
        l8x.e0("CameraPresencePrvdr", "Shutting down CameraPresenceProvider monitoring.");
        synchronized (this.d) {
            try {
                ScheduledFuture scheduledFuture = this.e;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        jrs0 jrs0Var = this.h;
        if (jrs0Var != null) {
            jrs0Var.a(this.j);
        }
        synchronized (this.c) {
            if (!this.o.isEmpty()) {
                Map mapN = xp20.n(this.o);
                this.o.clear();
                j2a j2aVar = this.g;
                if (j2aVar != null) {
                    LinkedHashSet<s0a> linkedHashSetC = j2aVar.c();
                    ArrayList arrayList = new ArrayList();
                    for (s0a s0aVar : linkedHashSetC) {
                        n0a n0aVarH = s0aVar != null ? s0aVar.h() : null;
                        if (n0aVarH != null) {
                            arrayList.add(n0aVarH);
                        }
                    }
                    l8x.U("CameraPresencePrvdr", "Clearing all " + mapN.size() + " state observers.");
                    for (Map.Entry entry : mapN.entrySet()) {
                        ((lmv) j120.T()).execute(new b1(arrayList, (ee60) entry.getValue(), (String) entry.getKey(), (byte) 6));
                    }
                }
            }
        }
        this.i = null;
        this.m.clear();
        this.n.clear();
        this.k = iun.f15405a;
        this.f = null;
        this.g = null;
    }

    public final void g(s88 s88Var, ru ruVar, j2a j2aVar) {
        ruVar.getClass();
        j2aVar.getClass();
        byte b = 0;
        if (this.l.compareAndSet(false, true)) {
            l8x.e0("CameraPresencePrvdr", "Starting CameraPresenceProvider monitoring.");
            this.i = s88Var;
            Set setD = ruVar.d();
            setD.getClass();
            Set<String> set = setD;
            ArrayList arrayList = new ArrayList(r3d.q(set, 10));
            for (String str : set) {
                str.getClass();
                arrayList.add(xf0.H(str, null, null));
            }
            this.k = arrayList;
            this.f = ruVar;
            this.g = j2aVar;
            this.h = (jrs0) ruVar.f;
            this.f43608a.execute(new u1a(this, b));
            jrs0 jrs0Var = this.h;
            if (jrs0Var != null) {
                jrs0Var.b(new rgi0(this.f43608a), this.j);
            }
        }
    }
}
