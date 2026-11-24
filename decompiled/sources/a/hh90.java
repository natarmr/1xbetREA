package a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class hh90 extends f4 implements Map, ohy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public eh90 f13052a;
    public evz b = new evz();
    public oqs0 c;
    public Object d;
    public int e;
    public int f;

    public hh90(eh90 eh90Var) {
        this.f13052a = eh90Var;
        this.c = eh90Var.d;
        this.f = eh90Var.e;
    }

    @Override // a.f4
    public final Set a() {
        return new lh90(this, (byte) 0);
    }

    @Override // a.f4
    public final Set b() {
        return new lh90(this, (byte) 1);
    }

    @Override // a.f4
    public final int c() {
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = oqs0.e;
        g(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // a.f4
    public final Collection d() {
        return new mo20(this, (byte) 2);
    }

    /* JADX INFO: renamed from: e */
    public eh90 f() {
        oqs0 oqs0Var = this.c;
        eh90 eh90Var = this.f13052a;
        if (oqs0Var != eh90Var.d) {
            this.b = new evz();
            eh90Var = new eh90(this.c, this.f);
        }
        this.f13052a = eh90Var;
        return eh90Var;
    }

    public /* bridge */ eh90 f() {
        return f();
    }

    public final void g(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.d = null;
        this.c = this.c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        eh90 eh90VarF = null;
        eh90 eh90Var = map instanceof eh90 ? (eh90) map : null;
        if (eh90Var == null) {
            hh90 hh90Var = map instanceof hh90 ? (hh90) map : null;
            if (hh90Var != null) {
                eh90VarF = hh90Var.f();
            }
        } else {
            eh90VarF = eh90Var;
        }
        if (eh90VarF == null) {
            super.putAll(map);
            return;
        }
        s6k s6kVar = new s6k();
        s6kVar.f31707a = 0;
        int i = this.f;
        this.c = this.c.m(eh90VarF.d, 0, s6kVar, this);
        int i2 = (eh90VarF.e + i) - s6kVar.f31707a;
        if (i != i2) {
            g(i2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i = this.f;
        oqs0 oqs0VarO = this.c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (oqs0VarO == null) {
            oqs0VarO = oqs0.e;
        }
        this.c = oqs0VarO;
        return i != this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.d = null;
        oqs0 oqs0VarN = this.c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (oqs0VarN == null) {
            oqs0VarN = oqs0.e;
        }
        this.c = oqs0VarN;
        return this.d;
    }
}
