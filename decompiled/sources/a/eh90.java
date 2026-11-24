package a;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class eh90 extends h3 implements Map, khy {
    public static final eh90 f = new eh90(oqs0.e, 0);
    public final oqs0 d;
    public final int e;

    public eh90(oqs0 oqs0Var, int i) {
        this.d = oqs0Var;
        this.e = i;
    }

    @Override // a.h3
    public final Set a() {
        return new ph90(this, (byte) 0);
    }

    @Override // a.h3
    public final Set b() {
        return new ph90(this, (byte) 1);
    }

    @Override // a.h3
    public final int c() {
        return this.e;
    }

    @Override // a.h3, java.util.Map
    public boolean containsKey(Object obj) {
        return this.d.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // a.h3
    public final Collection d() {
        return new g3(this, (byte) 3);
    }

    public hh90 f() {
        return new hh90(this);
    }

    public /* bridge */ hh90 g() {
        return f();
    }

    @Override // a.h3, java.util.Map
    public Object get(Object obj) {
        return this.d.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    public final eh90 h(Object obj, zb00 zb00Var) {
        s88 s88VarU = this.d.u(obj, obj != null ? obj.hashCode() : 0, 0, zb00Var);
        return s88VarU == null ? this : new eh90((oqs0) s88VarU.c, this.e + (s88VarU.b ? 1 : 0));
    }
}
