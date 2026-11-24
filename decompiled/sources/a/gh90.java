package a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class gh90 extends f4 implements sh90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dh90 f11286a;
    public xuz b = new xuz();
    public nqs0 c;
    public Object d;
    public int e;
    public int f;
    public int g;

    public gh90(dh90 dh90Var) {
        this.f11286a = dh90Var;
        this.c = dh90Var.d;
        this.g = dh90Var.e;
    }

    @Override // a.f4
    public final Set a() {
        return new kh90(this, (byte) 0);
    }

    @Override // a.f4
    public final Set b() {
        return new lo20(this, (byte) 1);
    }

    @Override // a.f4
    public final int c() {
        return this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        nqs0 nqs0Var = nqs0.e;
        nqs0Var.getClass();
        f(nqs0Var);
        g(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // a.f4
    public final Collection d() {
        return new mo20(this, (byte) 1);
    }

    @Override // a.sh90
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final dh90 build() {
        dh90 dh90Var = this.f11286a;
        if (dh90Var != null) {
            return dh90Var;
        }
        dh90 dh90Var2 = new dh90(this.c, c());
        this.f11286a = dh90Var2;
        this.b = new xuz();
        return dh90Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.g != map.size()) {
            return false;
        }
        if (map instanceof dh90) {
            return this.c.g(((dh90) obj).d, new ch90((byte) 4));
        }
        if (map instanceof gh90) {
            return this.c.g(((gh90) obj).c, new ch90((byte) 5));
        }
        if (map instanceof uh90) {
            return this.c.g(((uh90) obj).f.d, new ch90((byte) 6));
        }
        return map instanceof vh90 ? this.c.g(((vh90) obj).d.c, new ch90((byte) 7)) : super.equals(obj);
    }

    public final void f(nqs0 nqs0Var) {
        if (nqs0Var != this.c) {
            this.c = nqs0Var;
            this.f11286a = null;
        }
    }

    public final void g(int i) {
        this.g = i;
        this.e++;
        this.f++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return this.c.h(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.d = null;
        f(this.c.n(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this));
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        if (map.isEmpty()) {
            return;
        }
        dh90 dh90VarBuild = null;
        dh90 dh90Var = map instanceof dh90 ? (dh90) map : null;
        if (dh90Var == null) {
            gh90 gh90Var = map instanceof gh90 ? (gh90) map : null;
            if (gh90Var != null) {
                dh90VarBuild = gh90Var.build();
            }
        } else {
            dh90VarBuild = dh90Var;
        }
        if (dh90VarBuild == null) {
            super.putAll(map);
            return;
        }
        r6k r6kVar = new r6k();
        r6kVar.f29936a = 0;
        int iC = c();
        nqs0 nqs0Var = this.c;
        nqs0 nqs0Var2 = dh90VarBuild.d;
        nqs0Var2.getClass();
        f(nqs0Var.o(nqs0Var2, 0, r6kVar, this));
        int iC2 = (dh90VarBuild.c() + iC) - r6kVar.f29936a;
        if (iC != iC2) {
            g(iC2);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iC = c();
        nqs0 nqs0VarQ = this.c.q(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (nqs0VarQ == null) {
            nqs0VarQ = nqs0.e;
            nqs0VarQ.getClass();
        }
        f(nqs0VarQ);
        return iC != c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        this.d = null;
        nqs0 nqs0VarP = this.c.p(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (nqs0VarP == null) {
            nqs0VarP = nqs0.e;
            nqs0VarP.getClass();
        }
        f(nqs0VarP);
        return this.d;
    }
}
