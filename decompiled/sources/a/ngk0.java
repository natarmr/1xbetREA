package a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ngk0 implements b8m0, Map, ohy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mgk0 f23490a;
    public final yfk0 b;
    public final yfk0 c;
    public final yfk0 d;

    public ngk0() {
        eh90 eh90Var = eh90.f;
        rfk0 rfk0VarH = xfk0.h();
        mgk0 mgk0Var = new mgk0(rfk0VarH.g(), eh90Var);
        if (!(rfk0VarH instanceof x8v)) {
            mgk0Var.b = new mgk0(1L, eh90Var);
        }
        this.f23490a = mgk0Var;
        this.b = new yfk0(this, (byte) 0);
        this.c = new yfk0(this, (byte) 1);
        this.d = new yfk0(this, (byte) 2);
    }

    public static boolean a(mgk0 mgk0Var, int i, eh90 eh90Var) {
        boolean z;
        synchronized (q8a.h) {
            int i2 = mgk0Var.d;
            if (i2 == i) {
                mgk0Var.c = eh90Var;
                z = true;
                mgk0Var.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final mgk0 c() {
        return (mgk0) xfk0.s(this.f23490a, this);
    }

    @Override // java.util.Map
    public final void clear() {
        rfk0 rfk0VarH;
        eh90 eh90Var = ((mgk0) xfk0.f(this.f23490a)).c;
        eh90 eh90Var2 = eh90.f;
        if (eh90Var2 != eh90Var) {
            mgk0 mgk0Var = this.f23490a;
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                mgk0 mgk0Var2 = (mgk0) xfk0.w(mgk0Var, this, rfk0VarH);
                synchronized (q8a.h) {
                    mgk0Var2.c = eh90Var2;
                    mgk0Var2.d++;
                }
            }
            xfk0.l(rfk0VarH, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return c().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return c().c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.b;
    }

    @Override // a.b8m0
    public final e8m0 g() {
        return this.f23490a;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return c().c.get(obj);
    }

    @Override // a.b8m0
    public final void h(e8m0 e8m0Var) {
        this.f23490a = (mgk0) e8m0Var;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return c().c.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        eh90 eh90Var;
        int i;
        Object objPut;
        rfk0 rfk0VarH;
        boolean zA;
        do {
            synchronized (q8a.h) {
                mgk0 mgk0Var = (mgk0) xfk0.f(this.f23490a);
                eh90Var = mgk0Var.c;
                i = mgk0Var.d;
            }
            eh90Var.getClass();
            hh90 hh90VarG = eh90Var.g();
            objPut = hh90VarG.put(obj, obj2);
            eh90 eh90VarF = hh90VarG.f();
            if (Intrinsics.d(eh90VarF, eh90Var)) {
                break;
            }
            mgk0 mgk0Var2 = this.f23490a;
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                zA = a((mgk0) xfk0.w(mgk0Var2, this, rfk0VarH), i, eh90VarF);
            }
            xfk0.l(rfk0VarH, this);
        } while (!zA);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        eh90 eh90Var;
        int i;
        rfk0 rfk0VarH;
        boolean zA;
        do {
            synchronized (q8a.h) {
                mgk0 mgk0Var = (mgk0) xfk0.f(this.f23490a);
                eh90Var = mgk0Var.c;
                i = mgk0Var.d;
            }
            eh90Var.getClass();
            hh90 hh90VarG = eh90Var.g();
            hh90VarG.putAll(map);
            eh90 eh90VarF = hh90VarG.f();
            if (Intrinsics.d(eh90VarF, eh90Var)) {
                return;
            }
            mgk0 mgk0Var2 = this.f23490a;
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                zA = a((mgk0) xfk0.w(mgk0Var2, this, rfk0VarH), i, eh90VarF);
            }
            xfk0.l(rfk0VarH, this);
        } while (!zA);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        eh90 eh90Var;
        int i;
        V vRemove;
        rfk0 rfk0VarH;
        boolean zA;
        do {
            synchronized (q8a.h) {
                mgk0 mgk0Var = (mgk0) xfk0.f(this.f23490a);
                eh90Var = mgk0Var.c;
                i = mgk0Var.d;
            }
            eh90Var.getClass();
            hh90 hh90VarG = eh90Var.g();
            vRemove = hh90VarG.remove(obj);
            eh90 eh90VarF = hh90VarG.f();
            if (Intrinsics.d(eh90VarF, eh90Var)) {
                break;
            }
            mgk0 mgk0Var2 = this.f23490a;
            synchronized (xfk0.c) {
                rfk0VarH = xfk0.h();
                zA = a((mgk0) xfk0.w(mgk0Var2, this, rfk0VarH), i, eh90VarF);
            }
            xfk0.l(rfk0VarH, this);
        } while (!zA);
        return vRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return c().c.size();
    }

    public final String toString() {
        return "SnapshotStateMap(value=" + ((mgk0) xfk0.f(this.f23490a)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.d;
    }
}
