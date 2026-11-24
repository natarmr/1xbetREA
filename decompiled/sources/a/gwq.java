package a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class gwq extends yzp {
    public final yzp c;

    public gwq(yzp yzpVar) {
        yzpVar.getClass();
        this.c = yzpVar;
    }

    @Override // a.yzp
    public final s5k0 a(y190 y190Var) {
        y190Var.getClass();
        return this.c.a(y190Var);
    }

    @Override // a.yzp
    public final void c(y190 y190Var, y190 y190Var2) throws IOException {
        y190Var.getClass();
        y190Var2.getClass();
        this.c.c(y190Var, y190Var2);
    }

    @Override // a.yzp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // a.yzp
    public final void e(y190 y190Var) throws IOException {
        y190Var.getClass();
        this.c.e(y190Var);
    }

    @Override // a.yzp
    public final void k(y190 y190Var) throws IOException {
        y190Var.getClass();
        this.c.k(y190Var);
    }

    @Override // a.yzp
    public final List q(y190 y190Var) throws IOException {
        y190Var.getClass();
        List<y190> listQ = this.c.q(y190Var);
        ArrayList arrayList = new ArrayList();
        for (y190 y190Var2 : listQ) {
            y190Var2.getClass();
            arrayList.add(y190Var2);
        }
        v3d.s(arrayList);
        return arrayList;
    }

    public final String toString() {
        return sre0.f32672a.b(getClass()).J() + '(' + this.c + ')';
    }

    @Override // a.yzp
    public final h7k v(y190 y190Var) {
        y190Var.getClass();
        h7k h7kVarV = this.c.v(y190Var);
        if (h7kVarV == null) {
            return null;
        }
        y190 y190Var2 = (y190) h7kVarV.d;
        if (y190Var2 == null) {
            return h7kVarV;
        }
        boolean z = h7kVarV.b;
        boolean z2 = h7kVarV.c;
        Long l = (Long) h7kVarV.e;
        Long l2 = (Long) h7kVarV.f;
        Long l3 = (Long) h7kVarV.g;
        Long l4 = (Long) h7kVarV.h;
        Map map = (Map) h7kVarV.i;
        map.getClass();
        return new h7k(z, z2, y190Var2, l, l2, l3, l4, map);
    }

    @Override // a.yzp
    public final uey w(y190 y190Var) {
        return this.c.w(y190Var);
    }

    @Override // a.yzp
    public s5k0 x(y190 y190Var, boolean z) {
        y190Var.getClass();
        return this.c.x(y190Var, z);
    }

    @Override // a.yzp
    public final emk0 y(y190 y190Var) {
        y190Var.getClass();
        return this.c.y(y190Var);
    }
}
