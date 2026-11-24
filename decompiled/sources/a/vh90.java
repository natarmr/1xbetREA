package a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class vh90 extends f4 implements sh90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public uh90 f37419a;
    public Object b;
    public Object c;
    public final gh90 d;

    public vh90(uh90 uh90Var) {
        this.f37419a = uh90Var;
        this.b = uh90Var.d;
        this.c = uh90Var.e;
        this.d = new gh90(uh90Var.f);
    }

    @Override // a.f4
    public final Set a() {
        return new kh90(this, (byte) 1);
    }

    @Override // a.f4
    public final Set b() {
        return new lo20(this, (byte) 2);
    }

    @Override // a.sh90
    public final th90 build() {
        uh90 uh90Var = this.f37419a;
        if (uh90Var != null) {
            return uh90Var;
        }
        uh90 uh90Var2 = new uh90(this.b, this.c, this.d.build());
        this.f37419a = uh90Var2;
        return uh90Var2;
    }

    @Override // a.f4
    public final int c() {
        return this.d.c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        gh90 gh90Var = this.d;
        if (!gh90Var.isEmpty()) {
            this.f37419a = null;
        }
        gh90Var.clear();
        ujn ujnVar = ujn.k;
        this.b = ujnVar;
        this.c = ujnVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // a.f4
    public final Collection d() {
        return new mo20(this, (byte) 3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        gh90 gh90Var = this.d;
        Map map = (Map) obj;
        if (gh90Var.c() != map.size()) {
            return false;
        }
        if (map instanceof uh90) {
            return gh90Var.c.g(((uh90) obj).f.d, new ch90((byte) 12));
        }
        if (map instanceof vh90) {
            return gh90Var.c.g(((vh90) obj).d.c, new ch90((byte) 13));
        }
        if (map instanceof dh90) {
            return gh90Var.c.g(((dh90) obj).d, new ch90((byte) 14));
        }
        return map instanceof gh90 ? gh90Var.c.g(((gh90) obj).c, new ch90((byte) 15)) : super.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        wb00 wb00Var = (wb00) this.d.get(obj);
        if (wb00Var != null) {
            return wb00Var.f38853a;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        gh90 gh90Var = this.d;
        wb00 wb00Var = (wb00) gh90Var.get(obj);
        if (wb00Var != null) {
            Object obj3 = wb00Var.f38853a;
            if (obj3 == obj2) {
                return obj2;
            }
            this.f37419a = null;
            gh90Var.put(obj, new wb00(obj2, wb00Var.b, wb00Var.c));
            return obj3;
        }
        this.f37419a = null;
        if (isEmpty()) {
            this.b = obj;
            this.c = obj;
            gh90Var.put(obj, new wb00(obj2));
            return null;
        }
        Object obj4 = this.c;
        Object obj5 = gh90Var.get(obj4);
        obj5.getClass();
        wb00 wb00Var2 = (wb00) obj5;
        gh90Var.put(obj4, new wb00(wb00Var2.f38853a, wb00Var2.b, obj));
        gh90Var.put(obj, new wb00(obj2, obj4));
        this.c = obj;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        gh90 gh90Var = this.d;
        wb00 wb00Var = (wb00) gh90Var.remove(obj);
        if (wb00Var == null) {
            return null;
        }
        Object obj2 = wb00Var.c;
        Object obj3 = wb00Var.b;
        this.f37419a = null;
        ujn ujnVar = ujn.k;
        if (obj3 != ujnVar) {
            Object obj4 = gh90Var.get(obj3);
            obj4.getClass();
            wb00 wb00Var2 = (wb00) obj4;
            gh90Var.put(obj3, new wb00(wb00Var2.f38853a, wb00Var2.b, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 != ujnVar) {
            Object obj5 = gh90Var.get(obj2);
            obj5.getClass();
            wb00 wb00Var3 = (wb00) obj5;
            gh90Var.put(obj2, new wb00(wb00Var3.f38853a, obj3, wb00Var3.c));
        } else {
            this.c = obj3;
        }
        return wb00Var.f38853a;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        wb00 wb00Var = (wb00) this.d.get(obj);
        if (wb00Var == null || !Intrinsics.d(wb00Var.f38853a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
