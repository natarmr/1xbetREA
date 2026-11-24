package a;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class bfn0 implements cr30 {
    public final cr30 b;
    public final xzs0 c;
    public HashMap d;
    public final n0o0 e;

    public bfn0(cr30 cr30Var, xzs0 xzs0Var) {
        cr30Var.getClass();
        xzs0Var.getClass();
        this.b = cr30Var;
        maz.b(new fyk0(xzs0Var, (byte) 16));
        this.c = new xzs0(tke.m0(xzs0Var.f41769a));
        this.e = maz.b(new fyk0(this, (byte) 17));
    }

    @Override // a.cr30
    public final Collection a(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        return i(this.b.a(g950Var, ux50Var));
    }

    @Override // a.cr30
    public final Collection b(cek cekVar, Function1 function1) {
        cekVar.getClass();
        return (Collection) this.e.getValue();
    }

    @Override // a.cr30
    public final Set c() {
        return this.b.c();
    }

    @Override // a.cr30
    public final foc d(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        foc focVarD = this.b.d(g950Var, ux50Var);
        if (focVarD != null) {
            return (foc) h(focVarD);
        }
        return null;
    }

    @Override // a.cr30
    public final Set e() {
        return this.b.e();
    }

    @Override // a.cr30
    public final Collection f(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        return i(this.b.f(g950Var, ux50Var));
    }

    @Override // a.cr30
    public final Set g() {
        return this.b.g();
    }

    public final vjj h(vjj vjjVar) {
        xzs0 xzs0Var = this.c;
        if (xzs0Var.f41769a.e()) {
            return vjjVar;
        }
        HashMap map = this.d;
        if (map == null) {
            map = new HashMap();
            this.d = map;
        }
        Object objF = map.get(vjjVar);
        if (objF == null) {
            if (!(vjjVar instanceof wen0)) {
                udk.e(vjjVar, "Unknown descriptor in scope: ");
                return null;
            }
            objF = ((wen0) vjjVar).f(xzs0Var);
            if (objF == null) {
                hny.m(vjjVar, " substitution fails", "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but ");
                return null;
            }
            map.put(vjjVar, objF);
        }
        return (vjj) objF;
    }

    public final Collection i(Collection collection) {
        if (this.c.f41769a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(h((vjj) it.next()));
        }
        return linkedHashSet;
    }
}
