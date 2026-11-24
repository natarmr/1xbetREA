package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class zhy extends ihy {
    public static final /* synthetic */ int d = 0;
    public final Class b;
    public final a8z c = maz.a(wez.f39042a, new why(this, 0));

    public zhy(Class cls) {
        this.b = cls;
    }

    @Override // a.ihy
    public final Collection D() {
        return iun.f15405a;
    }

    @Override // a.ihy
    public final Collection E() {
        return iun.f15405a;
    }

    @Override // a.ihy
    public final Collection F(g950 g950Var) {
        mre0 mre0Var = ((yhy) this.c.getValue()).e;
        iiy iiyVar = yhy.g[1];
        Object objInvoke = mre0Var.invoke();
        objInvoke.getClass();
        return ((cr30) objInvoke).a(g950Var, ux50.b);
    }

    @Override // a.ihy
    public final d0d0 N(int i) {
        mre0 mre0Var = ((yhy) this.c.getValue()).e;
        iiy iiyVar = yhy.g[1];
        Object objInvoke = mre0Var.invoke();
        objInvoke.getClass();
        cr30 cr30Var = (cr30) objInvoke;
        qfk qfkVar = cr30Var instanceof qfk ? (qfk) cr30Var : null;
        if (qfkVar != null) {
            g45 g45Var = qfkVar.b;
            m3d0 m3d0Var = qfkVar.h;
            ijt ijtVar = dgy.l;
            ijtVar.getClass();
            p3d0 p3d0Var = (p3d0) h8x.M(m3d0Var, ijtVar, i);
            if (p3d0Var != null) {
                ir00 ir00Var = new ir00(this);
                h950 h950Var = (h950) g45Var.b;
                g4d0 g4d0Var = m3d0Var.g;
                g4d0Var.getClass();
                return (d0d0) xtt0.g(this.b, ir00Var, p3d0Var, h950Var, new roi0(g4d0Var), (e28) g45Var.f, x0.s);
            }
        }
        return null;
    }

    @Override // a.ihy
    public final dqy O(int i) {
        cqy cqyVar = (cqy) CollectionsKt.x0((List) ((yhy) this.c.getValue()).c.getValue());
        if (cqyVar == null) {
            return null;
        }
        zpy zpyVar = jfy.b;
        zpyVar.getClass();
        return (dqy) CollectionsKt.W(i, ((jfy) slb.V(cqyVar.d, zpyVar)).f16452a);
    }

    @Override // a.ihy
    public final Class P() {
        Class cls = (Class) ((yhy) this.c.getValue()).f.getValue();
        return cls == null ? this.b : cls;
    }

    @Override // a.ihy
    public final Collection Q(g950 g950Var) {
        mre0 mre0Var = ((yhy) this.c.getValue()).e;
        iiy iiyVar = yhy.g[1];
        Object objInvoke = mre0Var.invoke();
        objInvoke.getClass();
        return ((cr30) objInvoke).f(g950Var, ux50.b);
    }

    public final ArrayList T() {
        List list = (List) ((yhy) this.c.getValue()).c.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList, ((cqy) it.next()).f4817a);
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zhy) {
            return this.b.equals(((zhy) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // a.elc
    public final Class j() {
        return this.b;
    }

    public final String toString() {
        return "file class " + bqe0.a(this.b).a();
    }
}
