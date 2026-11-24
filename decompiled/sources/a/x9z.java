package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class x9z extends faz {
    public final wqe0 n;
    public final r9z o;
    public final bu00 p;
    public final xg q;

    public x9z(f7u f7uVar, wqe0 wqe0Var, r9z r9zVar) {
        super(f7uVar, null);
        this.n = wqe0Var;
        this.o = r9zVar;
        eu00 eu00Var = (eu00) ((v7i) f7uVar.b).i;
        this.p = new bu00(eu00Var, new aaw(f7uVar, this, (byte) 26));
        this.q = eu00Var.d(new ygy(this, f7uVar, (byte) 10));
    }

    @Override // a.baz, a.dr30, a.cr30
    public final Collection b(cek cekVar, Function1 function1) {
        cekVar.getClass();
        if (!cekVar.a(cek.l | cek.e)) {
            return iun.f15405a;
        }
        Iterable iterable = (Iterable) this.d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            vjj vjjVar = (vjj) obj;
            if (vjjVar instanceof wm40) {
                g950 name = ((wm40) vjjVar).getName();
                name.getClass();
                if (((Boolean) function1.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // a.dr30, a.cr30
    public final foc d(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        return v(g950Var, null);
    }

    @Override // a.baz, a.dr30, a.cr30
    public final Collection f(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        return iun.f15405a;
    }

    @Override // a.baz
    public final Set h(cek cekVar, Function1 function1) {
        cekVar.getClass();
        if (!cekVar.a(cek.e)) {
            return xun.f41520a;
        }
        Set set = (Set) this.p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(g950.e((String) it.next()));
            }
            return hashSet;
        }
        this.n.getClass();
        iun iunVar = iun.f15405a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        iunVar.getClass();
        hun.f13690a.getClass();
        return linkedHashSet;
    }

    @Override // a.baz
    public final vjj q() {
        return this.o;
    }

    public final wm40 v(g950 g950Var, mqe0 mqe0Var) {
        g950 g950Var2 = lxk0.f20818a;
        g950Var.getClass();
        String strB = g950Var.b();
        strB.getClass();
        if (strB.length() <= 0 || g950Var.b) {
            return null;
        }
        Set set = (Set) this.p.invoke();
        if (mqe0Var == null && set != null && !set.contains(g950Var.b())) {
            return null;
        }
        return (wm40) this.q.invoke(new t9z(g950Var, mqe0Var));
    }
}
