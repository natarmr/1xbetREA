package a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class dh90 extends h3 implements th90 {
    public static final dh90 f = new dh90(nqs0.e, 0);
    public final nqs0 d;
    public final int e;

    public dh90(nqs0 nqs0Var, int i) {
        nqs0Var.getClass();
        this.d = nqs0Var;
        this.e = i;
    }

    @Override // a.h3
    public final Set a() {
        return new oh90(this, (byte) 0);
    }

    @Override // a.h3
    public final Set b() {
        return new oh90(this, (byte) 1);
    }

    @Override // a.h3
    public final int c() {
        return this.e;
    }

    @Override // a.h3, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // a.h3
    public final Collection d() {
        return new g3(this, (byte) 2);
    }

    @Override // a.h3, java.util.Map
    public final boolean equals(Object obj) {
        byte b = 1;
        if (obj == this) {
            return true;
        }
        byte b2 = 0;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.e == map.size()) {
                boolean z = map instanceof uh90;
                nqs0 nqs0Var = this.d;
                if (z) {
                    return nqs0Var.g(((uh90) obj).f.d, new ch90(b2));
                }
                if (map instanceof vh90) {
                    return nqs0Var.g(((vh90) obj).d.c, new ch90(b));
                }
                if (map instanceof dh90) {
                    return nqs0Var.g(((dh90) obj).d, new ch90((byte) 2));
                }
                return map instanceof gh90 ? nqs0Var.g(((gh90) obj).c, new ch90((byte) 3)) : super.equals(obj);
            }
        }
        return false;
    }

    @Override // a.h3, java.util.Map, a.th90
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final dh90 put(Object obj, Object obj2) {
        s88 s88VarV = this.d.v(obj, obj != null ? obj.hashCode() : 0, 0, obj2);
        return s88VarV == null ? this : new dh90((nqs0) s88VarV.c, this.e + (s88VarV.b ? 1 : 0));
    }

    @Override // a.h3, java.util.Map
    public final Object get(Object obj) {
        return this.d.h(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map, a.th90
    public final th90 putAll(Map map) {
        map.getClass();
        if (map.isEmpty()) {
            return this;
        }
        gh90 gh90Var = new gh90(this);
        gh90Var.putAll(map);
        return gh90Var.build();
    }
}
