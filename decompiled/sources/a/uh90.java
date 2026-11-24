package a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class uh90 extends h3 implements th90 {
    public static final uh90 g;
    public final Object d;
    public final Object e;
    public final dh90 f;

    static {
        ujn ujnVar = ujn.k;
        dh90 dh90Var = dh90.f;
        dh90Var.getClass();
        g = new uh90(ujnVar, ujnVar, dh90Var);
    }

    public uh90(Object obj, Object obj2, dh90 dh90Var) {
        this.d = obj;
        this.e = obj2;
        this.f = dh90Var;
    }

    @Override // a.h3
    public final Set a() {
        return new yh90(this, (byte) 0);
    }

    @Override // a.h3
    public final Set b() {
        return new yh90(this, (byte) 1);
    }

    @Override // a.h3
    public final int c() {
        return this.f.c();
    }

    @Override // a.h3, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // a.h3
    public final Collection d() {
        return new g3(this, (byte) 4);
    }

    @Override // a.h3, java.util.Map
    public final boolean equals(Object obj) {
        dh90 dh90Var = this.f;
        nqs0 nqs0Var = dh90Var.d;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (dh90Var.c() != map.size()) {
            return false;
        }
        if (map instanceof uh90) {
            return nqs0Var.g(((uh90) obj).f.d, new ch90((byte) 8));
        }
        if (map instanceof vh90) {
            return nqs0Var.g(((vh90) obj).d.c, new ch90((byte) 9));
        }
        if (map instanceof dh90) {
            return nqs0Var.g(((dh90) obj).d, new ch90((byte) 10));
        }
        return map instanceof gh90 ? nqs0Var.g(((gh90) obj).c, new ch90((byte) 11)) : super.equals(obj);
    }

    @Override // a.h3, java.util.Map
    public final Object get(Object obj) {
        wb00 wb00Var = (wb00) this.f.get(obj);
        if (wb00Var != null) {
            return wb00Var.f38853a;
        }
        return null;
    }

    @Override // a.h3, java.util.Map, a.th90
    public final th90 put(Object obj, Object obj2) {
        boolean zIsEmpty = isEmpty();
        dh90 dh90Var = this.f;
        if (zIsEmpty) {
            return new uh90(obj, obj, dh90Var.put(obj, new wb00(obj2)));
        }
        wb00 wb00Var = (wb00) dh90Var.get(obj);
        Object obj3 = this.e;
        Object obj4 = this.d;
        if (wb00Var != null) {
            return wb00Var.f38853a == obj2 ? this : new uh90(obj4, obj3, dh90Var.put(obj, new wb00(obj2, wb00Var.b, wb00Var.c)));
        }
        Object obj5 = dh90Var.get(obj3);
        obj5.getClass();
        wb00 wb00Var2 = (wb00) obj5;
        return new uh90(obj4, obj, dh90Var.put(obj3, new wb00(wb00Var2.f38853a, wb00Var2.b, obj)).put(obj, new wb00(obj2, obj3)));
    }

    @Override // java.util.Map, a.th90
    public final th90 putAll(Map map) {
        map.getClass();
        if (map.isEmpty()) {
            return this;
        }
        vh90 vh90Var = new vh90(this);
        vh90Var.putAll(map);
        return vh90Var.build();
    }
}
