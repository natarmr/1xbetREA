package a;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yfk0 implements Set, vhy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ngk0 f42547a;
    public final /* synthetic */ byte b;

    public yfk0(ngk0 ngk0Var, byte b) {
        this.b = b;
        this.f42547a = ngk0Var;
    }

    private final boolean b(Collection collection) {
        eh90 eh90Var;
        int i;
        rfk0 rfk0VarH;
        boolean zA;
        Set setP0 = CollectionsKt.P0(collection);
        ngk0 ngk0Var = this.f42547a;
        boolean z = false;
        do {
            synchronized (q8a.h) {
                mgk0 mgk0Var = (mgk0) xfk0.f(ngk0Var.f23490a);
                eh90Var = mgk0Var.c;
                i = mgk0Var.d;
            }
            eh90Var.getClass();
            hh90 hh90VarG = eh90Var.g();
            Iterator it = ngk0Var.b.iterator();
            while (((a8m0) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((a8m0) it).next();
                if (!setP0.contains(entry.getKey())) {
                    hh90VarG.remove(entry.getKey());
                    z = true;
                }
            }
            eh90 eh90VarF = hh90VarG.f();
            if (Intrinsics.d(eh90VarF, eh90Var)) {
                break;
            }
            mgk0 mgk0Var2 = ngk0Var.f23490a;
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                zA = ngk0.a((mgk0) xfk0.w(mgk0Var2, ngk0Var, rfk0VarH), i, eh90VarF);
            }
            xfk0.l(rfk0VarH, ngk0Var);
        } while (!zA);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.b) {
            case 0:
                q8a.x0();
                throw null;
            case 1:
                q8a.x0();
                throw null;
            default:
                q8a.x0();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.b) {
            case 0:
                q8a.x0();
                throw null;
            case 1:
                q8a.x0();
                throw null;
            default:
                q8a.x0();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f42547a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.b;
        ngk0 ngk0Var = this.f42547a;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof khy) && !(obj instanceof nhy))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return Intrinsics.d(ngk0Var.get(entry.getKey()), entry.getValue());
            case 1:
                return ngk0Var.containsKey(obj);
            default:
                return ngk0Var.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.b;
        ngk0 ngk0Var = this.f42547a;
        switch (b) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            return false;
                        }
                    }
                }
                return true;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!ngk0Var.containsKey(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!ngk0Var.containsValue(it3.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f42547a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.b;
        ngk0 ngk0Var = this.f42547a;
        switch (b) {
            case 0:
                return new a8m0(ngk0Var, ((h4x) ngk0Var.c().c.entrySet()).iterator(), (byte) 0);
            case 1:
                return new a8m0(ngk0Var, ((h4x) ngk0Var.c().c.entrySet()).iterator(), (byte) 1);
            default:
                return new a8m0(ngk0Var, ((h4x) ngk0Var.c().c.entrySet()).iterator(), (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v8 java.lang.Object, still in use, count: 2, list:
          (r3v8 java.lang.Object) from 0x002e: PHI (r3 I:??) = (r3v3 java.lang.Object), (r3v8 java.lang.Object) binds: [B:10:0x002d, B:30:0x002e] A[DONT_GENERATE, DONT_INLINE]
          (r3v8 java.lang.Object) from 0x0020: CHECK_CAST (java.util.Map$Entry) (r3v8 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            byte r0 = r5.b
            r1 = 0
            r2 = 1
            a.ngk0 r5 = r5.f42547a
            switch(r0) {
                case 0: goto L43;
                case 1: goto L3b;
                default: goto L9;
            }
        L9:
            a.yfk0 r0 = r5.b
            java.util.Iterator r0 = r0.iterator()
        Lf:
            r3 = r0
            a.a8m0 r3 = (a.a8m0) r3
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L2d
            r3 = r0
            a.a8m0 r3 = (a.a8m0) r3
            java.lang.Object r3 = r3.next()
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r4 = r4.getValue()
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r6)
            if (r4 == 0) goto Lf
            goto L2e
        L2d:
            r3 = 0
        L2e:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L3a
            java.lang.Object r6 = r3.getKey()
            r5.remove(r6)
            r1 = r2
        L3a:
            return r1
        L3b:
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L42
            r1 = r2
        L42:
            return r1
        L43:
            boolean r0 = r6 instanceof java.util.Map.Entry
            if (r0 == 0) goto L5c
            boolean r0 = r6 instanceof a.khy
            if (r0 == 0) goto L4f
            boolean r0 = r6 instanceof a.nhy
            if (r0 == 0) goto L5c
        L4f:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r6 = r6.getKey()
            java.lang.Object r5 = r5.remove(r6)
            if (r5 == 0) goto L5c
            r1 = r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.yfk0.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        eh90 eh90Var;
        int i;
        rfk0 rfk0VarH;
        boolean zA;
        boolean z = false;
        switch (this.b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it.hasNext()) {
                        if (this.f42547a.remove(((Map.Entry) it.next()).getKey()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                }
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        if (this.f42547a.remove(it2.next()) != null || z3) {
                            z3 = true;
                        }
                    }
                    return z3;
                }
            default:
                Set setP0 = CollectionsKt.P0(collection);
                ngk0 ngk0Var = this.f42547a;
                do {
                    synchronized (q8a.h) {
                        mgk0 mgk0Var = (mgk0) xfk0.f(ngk0Var.f23490a);
                        eh90Var = mgk0Var.c;
                        i = mgk0Var.d;
                    }
                    eh90Var.getClass();
                    hh90 hh90VarG = eh90Var.g();
                    Iterator it3 = ngk0Var.b.iterator();
                    while (((a8m0) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((a8m0) it3).next();
                        if (setP0.contains(entry.getValue())) {
                            hh90VarG.remove(entry.getKey());
                            z = true;
                        }
                    }
                    eh90 eh90VarF = hh90VarG.f();
                    if (!Intrinsics.d(eh90VarF, eh90Var)) {
                        mgk0 mgk0Var2 = ngk0Var.f23490a;
                        synchronized (xfk0.c) {
                            rfk0VarH = xfk0.h();
                            zA = ngk0.a((mgk0) xfk0.w(mgk0Var2, ngk0Var, rfk0VarH), i, eh90VarF);
                        }
                        xfk0.l(rfk0VarH, ngk0Var);
                    }
                    return z;
                } while (!zA);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        eh90 eh90Var;
        int i;
        rfk0 rfk0VarH;
        boolean zA;
        eh90 eh90Var2;
        int i2;
        rfk0 rfk0VarH2;
        boolean zA2;
        boolean z = false;
        switch (this.b) {
            case 0:
                Collection<Map.Entry> collection2 = collection;
                int iA = wp20.a(r3d.q(collection2, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Map.Entry entry : collection2) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
                ngk0 ngk0Var = this.f42547a;
                do {
                    synchronized (q8a.h) {
                        mgk0 mgk0Var = (mgk0) xfk0.f(ngk0Var.f23490a);
                        eh90Var = mgk0Var.c;
                        i = mgk0Var.d;
                    }
                    eh90Var.getClass();
                    hh90 hh90VarG = eh90Var.g();
                    Iterator it = ngk0Var.b.iterator();
                    while (((a8m0) it).hasNext()) {
                        Map.Entry entry2 = (Map.Entry) ((a8m0) it).next();
                        if (!linkedHashMap.containsKey(entry2.getKey()) || !Intrinsics.d(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                            hh90VarG.remove(entry2.getKey());
                            z = true;
                        }
                    }
                    eh90 eh90VarF = hh90VarG.f();
                    if (!Intrinsics.d(eh90VarF, eh90Var)) {
                        mgk0 mgk0Var2 = ngk0Var.f23490a;
                        synchronized (xfk0.c) {
                            rfk0VarH = xfk0.h();
                            zA = ngk0.a((mgk0) xfk0.w(mgk0Var2, ngk0Var, rfk0VarH), i, eh90VarF);
                        }
                        xfk0.l(rfk0VarH, ngk0Var);
                    }
                    return z;
                } while (!zA);
                return z;
            case 1:
                return b(collection);
            default:
                Set setP0 = CollectionsKt.P0(collection);
                ngk0 ngk0Var2 = this.f42547a;
                do {
                    synchronized (q8a.h) {
                        mgk0 mgk0Var3 = (mgk0) xfk0.f(ngk0Var2.f23490a);
                        eh90Var2 = mgk0Var3.c;
                        i2 = mgk0Var3.d;
                    }
                    eh90Var2.getClass();
                    hh90 hh90VarG2 = eh90Var2.g();
                    Iterator it2 = ngk0Var2.b.iterator();
                    while (((a8m0) it2).hasNext()) {
                        Map.Entry entry3 = (Map.Entry) ((a8m0) it2).next();
                        if (!setP0.contains(entry3.getValue())) {
                            hh90VarG2.remove(entry3.getKey());
                            z = true;
                        }
                    }
                    eh90 eh90VarF2 = hh90VarG2.f();
                    if (!Intrinsics.d(eh90VarF2, eh90Var2)) {
                        mgk0 mgk0Var4 = ngk0Var2.f23490a;
                        synchronized (xfk0.c) {
                            rfk0VarH2 = xfk0.h();
                            zA2 = ngk0.a((mgk0) xfk0.w(mgk0Var4, ngk0Var2, rfk0VarH2), i2, eh90VarF2);
                        }
                        xfk0.l(rfk0VarH2, ngk0Var2);
                    }
                    return z;
                } while (!zA2);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f42547a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return wha0.V(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return wha0.W(this, objArr);
    }
}
