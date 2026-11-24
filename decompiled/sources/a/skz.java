package a;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class skz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f32373a = new Object();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final ArrayDeque d = new ArrayDeque();
    public wy9 e;

    /* JADX WARN: Code duplicated, block: B:25:0x0047 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:4:0x0003, B:6:0x001f, B:10:0x0024, B:12:0x0030, B:13:0x0032, B:15:0x0035, B:38:0x0078, B:39:0x007b, B:44:0x008d, B:45:0x0090, B:48:0x0093, B:49:0x0098, B:20:0x003b, B:21:0x003c, B:22:0x003d, B:23:0x0041, B:25:0x0047, B:27:0x005e, B:30:0x0069, B:31:0x006b, B:33:0x006d, B:34:0x0074, B:37:0x0077, B:32:0x006c, B:14:0x0033), top: B:52:0x0003, inners: #1, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(okz okzVar, rrd rrdVar, wy9 wy9Var) {
        Iterator it;
        okz okzVar2;
        boolean z;
        synchronized (this.f32373a) {
            try {
                boolean z2 = true;
                z1x.u(!((List) rrdVar.g).isEmpty());
                this.e = wy9Var;
                clz clzVarI = okzVar.i();
                e(clzVarI);
                rkz rkzVarC = c(clzVarI);
                if (rkzVarC == null) {
                    return;
                }
                Set set = (Set) this.c.get(rkzVarC);
                wy9 wy9Var2 = this.e;
                if (wy9Var2 != null) {
                    synchronized (wy9Var2.b) {
                        z = wy9Var2.f;
                    }
                    if (z != 2) {
                        it = set.iterator();
                        while (it.hasNext()) {
                            okzVar2 = (okz) this.b.get((f45) it.next());
                            okzVar2.getClass();
                            if (!okzVar2.equals(okzVar) && !okzVar2.j().isEmpty()) {
                                synchronized (okzVar2.f25429a) {
                                }
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                        }
                    }
                    throw th;
                }
                it = set.iterator();
                while (it.hasNext()) {
                    okzVar2 = (okz) this.b.get((f45) it.next());
                    okzVar2.getClass();
                    if (!okzVar2.equals(okzVar)) {
                        synchronized (okzVar2.f25429a) {
                            throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                        }
                    }
                }
                try {
                    okzVar.c(rrdVar);
                    if (clzVarI.x().i.compareTo(lkz.d) < 0) {
                        z2 = false;
                    }
                    if (z2) {
                        g(clzVarI);
                    }
                } catch (n3a e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final okz b(clz clzVar, t3a t3aVar, veg0 veg0Var) {
        synchronized (this.f32373a) {
            try {
                z1x.t("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", this.b.get(new f45(System.identityHashCode(clzVar), t3aVar.d)) == null);
                okz okzVar = new okz(clzVar, t3aVar, veg0Var);
                if (((ArrayList) t3aVar.y()).isEmpty()) {
                    okzVar.s();
                }
                if (clzVar.x().i == lkz.f20223a) {
                    return okzVar;
                }
                f(okzVar);
                return okzVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final rkz c(clz clzVar) {
        synchronized (this.f32373a) {
            try {
                for (rkz rkzVar : this.c.keySet()) {
                    if (clzVar.equals(rkzVar.b)) {
                        return rkzVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d(clz clzVar) {
        synchronized (this.f32373a) {
            try {
                rkz rkzVarC = c(clzVar);
                if (rkzVarC == null) {
                    return false;
                }
                Iterator it = ((Set) this.c.get(rkzVarC)).iterator();
                while (it.hasNext()) {
                    okz okzVar = (okz) this.b.get((f45) it.next());
                    okzVar.getClass();
                    if (!okzVar.j().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(clz clzVar) {
        HashMap map;
        ap apVar;
        rkz rkzVarC = c(clzVar);
        if (rkzVarC == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        Set set = (Set) this.c.get(rkzVarC);
        Objects.requireNonNull(set);
        Iterator it = set.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.b;
            if (!zHasNext) {
                break;
            }
            f45 f45Var = (f45) it.next();
            okz okzVar = (okz) map.get(f45Var);
            if (okzVar != null) {
                t3a t3aVar = okzVar.c;
                if (t3aVar.f33257a.f1226a.m() || ((apVar = t3aVar.b) != null && apVar.f1226a.m())) {
                    hashSet.add(f45Var);
                }
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        l8x.E0("LifecycleCameraRepository", "Removing " + hashSet.size() + " stale LifecycleCamera(s).");
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            okz okzVar2 = (okz) map.get((f45) it2.next());
            Objects.requireNonNull(okzVar2);
            k(okzVar2);
        }
    }

    public final void f(okz okzVar) {
        synchronized (this.f32373a) {
            try {
                clz clzVarI = okzVar.i();
                f45 f45Var = new f45(System.identityHashCode(clzVarI), okzVar.c.d);
                rkz rkzVarC = c(clzVarI);
                Set hashSet = rkzVarC != null ? (Set) this.c.get(rkzVarC) : new HashSet();
                hashSet.add(f45Var);
                this.b.put(f45Var, okzVar);
                if (rkzVarC == null) {
                    rkz rkzVar = new rkz(clzVarI, this);
                    this.c.put(rkzVar, hashSet);
                    clzVarI.x().a(rkzVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x003a A[Catch: all -> 0x000b, TryCatch #1 {all -> 0x000b, blocks: (B:4:0x0003, B:6:0x0009, B:10:0x000d, B:12:0x0015, B:28:0x0047, B:29:0x004a, B:13:0x001b, B:15:0x001f, B:16:0x0021, B:18:0x0024, B:23:0x002a, B:24:0x002b, B:25:0x002c, B:27:0x003a, B:17:0x0022), top: B:35:0x0003, inners: #0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void g(clz clzVar) {
        clz clzVar2;
        boolean z;
        synchronized (this.f32373a) {
            try {
                if (d(clzVar)) {
                    if (this.d.isEmpty()) {
                        this.d.push(clzVar);
                    } else {
                        wy9 wy9Var = this.e;
                        if (wy9Var != null) {
                            synchronized (wy9Var.b) {
                                z = wy9Var.f;
                            }
                            if (z != 2) {
                                clzVar2 = (clz) this.d.peek();
                                if (!clzVar.equals(clzVar2)) {
                                    i(clzVar2);
                                    this.d.remove(clzVar);
                                    this.d.push(clzVar);
                                }
                            }
                        } else {
                            clzVar2 = (clz) this.d.peek();
                            if (!clzVar.equals(clzVar2)) {
                                i(clzVar2);
                                this.d.remove(clzVar);
                                this.d.push(clzVar);
                            }
                        }
                    }
                    m(clzVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(clz clzVar) {
        synchronized (this.f32373a) {
            try {
                this.d.remove(clzVar);
                i(clzVar);
                if (!this.d.isEmpty()) {
                    m((clz) this.d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(clz clzVar) {
        synchronized (this.f32373a) {
            try {
                rkz rkzVarC = c(clzVar);
                if (rkzVarC == null) {
                    return;
                }
                Iterator it = ((Set) this.c.get(rkzVarC)).iterator();
                while (it.hasNext()) {
                    okz okzVar = (okz) this.b.get((f45) it.next());
                    okzVar.getClass();
                    okzVar.s();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(HashSet hashSet) {
        synchronized (this.f32373a) {
            try {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    okz okzVar = (okz) this.b.get((f45) it.next());
                    if (okzVar != null) {
                        okzVar.t();
                        h(okzVar.i());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(okz okzVar) {
        synchronized (this.f32373a) {
            try {
                clz clzVarI = okzVar.i();
                f45 f45Var = new f45(System.identityHashCode(clzVarI), okzVar.c.d);
                this.b.remove(f45Var);
                HashSet hashSet = new HashSet();
                for (rkz rkzVar : this.c.keySet()) {
                    if (clzVarI.equals(rkzVar.b)) {
                        Set set = (Set) this.c.get(rkzVar);
                        set.remove(f45Var);
                        if (set.isEmpty()) {
                            hashSet.add(rkzVar.b);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    l((clz) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(clz clzVar) {
        synchronized (this.f32373a) {
            try {
                rkz rkzVarC = c(clzVar);
                if (rkzVarC == null) {
                    return;
                }
                h(clzVar);
                Iterator it = ((Set) this.c.get(rkzVarC)).iterator();
                while (it.hasNext()) {
                    this.b.remove((f45) it.next());
                }
                this.c.remove(rkzVarC);
                rkzVarC.b.x().f(rkzVarC);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(clz clzVar) {
        synchronized (this.f32373a) {
            try {
                Iterator it = ((Set) this.c.get(c(clzVar))).iterator();
                while (it.hasNext()) {
                    okz okzVar = (okz) this.b.get((f45) it.next());
                    okzVar.getClass();
                    if (!okzVar.j().isEmpty()) {
                        okzVar.u();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
