package a;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class zm40 extends wjj implements ym40 {
    public final eu00 d;
    public final ary e;
    public final Map f;
    public final zg80 g;
    public yuu h;
    public pg80 i;
    public final boolean j;
    public final zt00 k;
    public final n0o0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm40(g950 g950Var, eu00 eu00Var, ary aryVar, int i) {
        super(ujn.c, g950Var);
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        this.d = eu00Var;
        this.e = aryVar;
        if (!g950Var.b) {
            e9d0.i(g950Var, "Module name must be special: ");
            throw null;
        }
        this.f = lunVar;
        zg80.f44332a.getClass();
        zg80 zg80Var = (zg80) h0(xg80.b);
        this.g = zg80Var == null ? yg80.b : zg80Var;
        this.j = true;
        this.k = eu00Var.c(new caz(this, (byte) 5));
        this.l = maz.b(new gey(this, (byte) 1));
    }

    @Override // a.ym40
    public final List Y() {
        yuu yuuVar = this.h;
        if (yuuVar != null) {
            return (List) yuuVar.d;
        }
        String str = getName().f10896a;
        str.getClass();
        hny.m(str, " were not set", "Dependencies of module ");
        return null;
    }

    @Override // a.ym40
    public final boolean Z(ym40 ym40Var) {
        ym40Var.getClass();
        if (this == ym40Var) {
            return true;
        }
        yuu yuuVar = this.h;
        yuuVar.getClass();
        return CollectionsKt.L((xun) yuuVar.c, ym40Var) || Y().contains(ym40Var) || ym40Var.Y().contains(this);
    }

    @Override // a.ym40
    public final ary c() {
        return this.e;
    }

    @Override // a.ym40
    public final gdz c0(swq swqVar) {
        swqVar.getClass();
        o1();
        return (gdz) this.k.invoke(swqVar);
    }

    @Override // a.ym40
    public final Object h0(pfw pfwVar) {
        pfwVar.getClass();
        Object obj = this.f.get(pfwVar);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // a.vjj
    public final Object i0(zjj zjjVar, Object obj) {
        return zjjVar.o(this, obj);
    }

    @Override // a.vjj
    public final vjj j() {
        return null;
    }

    @Override // a.ym40
    public final Collection n(swq swqVar, Function1 function1) {
        swqVar.getClass();
        o1();
        o1();
        return ((hld) this.l.getValue()).n(swqVar, function1);
    }

    public final void o1() {
        if (this.j) {
            return;
        }
        if (h0(unx.f35983a) != null) {
            hny.b();
        } else {
            throw new byw("Accessing invalid module descriptor " + this);
        }
    }

    @Override // a.wjj, a.p4
    public final String toString() {
        StringBuilder sb = new StringBuilder(wjj.n1(this));
        if (!this.j) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        pg80 pg80Var = this.i;
        sb.append(pg80Var != null ? pg80Var.getClass().getSimpleName() : null);
        return sb.toString();
    }
}
