package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class eaz extends faz {
    public static final /* synthetic */ int p = 0;
    public final mqe0 n;
    public final l9z o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaz(f7u f7uVar, mqe0 mqe0Var, l9z l9zVar) {
        super(f7uVar, null);
        mqe0Var.getClass();
        this.n = mqe0Var;
        this.o = l9zVar;
    }

    public static d0d0 v(d0d0 d0d0Var) {
        if (d0d0Var.l() != 2) {
            return d0d0Var;
        }
        Collection collectionK = d0d0Var.k();
        collectionK.getClass();
        Collection<d0d0> collection = collectionK;
        ArrayList arrayList = new ArrayList(r3d.q(collection, 10));
        for (d0d0 d0d0Var2 : collection) {
            d0d0Var2.getClass();
            arrayList.add(v(d0d0Var2));
        }
        return (d0d0) CollectionsKt.v0(CollectionsKt.L0(CollectionsKt.O0(arrayList)));
    }

    @Override // a.dr30, a.cr30
    public final foc d(g950 g950Var, ux50 ux50Var) {
        g950Var.getClass();
        ux50Var.getClass();
        return null;
    }

    @Override // a.baz
    public final Set i(cek cekVar, Function1 function1) {
        cekVar.getClass();
        LinkedHashSet linkedHashSetO0 = CollectionsKt.O0(((ckj) this.e.invoke()).c());
        l9z l9zVar = this.o;
        eaz eazVarR = pvm0.r(l9zVar);
        Set setC = eazVarR != null ? eazVarR.c() : null;
        if (setC == null) {
            setC = xun.f41520a;
        }
        linkedHashSetO0.addAll(setC);
        if (this.n.f22221a.isEnum()) {
            linkedHashSetO0.addAll(q3d.j(j4m0.c, j4m0.f15892a));
        }
        f7u f7uVar = this.b;
        linkedHashSetO0.addAll(((kld) ((e6o0) ((v7i) f7uVar.b).o)).g(l9zVar, f7uVar));
        return linkedHashSetO0;
    }

    @Override // a.baz
    public final void j(g950 g950Var, ArrayList arrayList) {
        f7u f7uVar = this.b;
        ((kld) ((e6o0) ((v7i) f7uVar.b).o)).d(this.o, g950Var, arrayList, f7uVar);
    }

    @Override // a.baz
    public final ckj k() {
        return new ilc(this.n, j9x.w);
    }

    @Override // a.baz
    public final void m(LinkedHashSet linkedHashSet, g950 g950Var) {
        l9z l9zVar = this.o;
        eaz eazVarR = pvm0.r(l9zVar);
        linkedHashSet.addAll(rcb.i1(g950Var, eazVarR == null ? xun.f41520a : CollectionsKt.P0(eazVarR.a(g950Var, ux50.e)), linkedHashSet, l9zVar, ((lm50) ((km50) ((v7i) this.b.b).m)).d));
        if (this.n.f22221a.isEnum()) {
            if (g950Var.equals(j4m0.c)) {
                linkedHashSet.add(obb.Q(l9zVar));
            } else if (g950Var.equals(j4m0.f15892a)) {
                linkedHashSet.add(obb.R(l9zVar));
            }
        }
    }

    @Override // a.baz
    public final void n(g950 g950Var, ArrayList arrayList) {
        f0d0 f0d0VarP;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        caz cazVar = new caz(g950Var, (byte) 0);
        l9z l9zVar = this.o;
        ntb.H(kotlin.collections.a.c(l9zVar), m2a.r, new daz(l9zVar, linkedHashSet, cazVar));
        boolean zIsEmpty = arrayList.isEmpty();
        f7u f7uVar = this.b;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                d0d0 d0d0VarV = v((d0d0) obj);
                Object arrayList2 = linkedHashMap.get(d0d0VarV);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(d0d0VarV, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                w3d.u(arrayList3, rcb.i1(g950Var, (Collection) ((Map.Entry) it.next()).getValue(), arrayList, l9zVar, ((lm50) ((km50) ((v7i) f7uVar.b).m)).d));
            }
            arrayList.addAll(arrayList3);
        } else {
            arrayList.addAll(rcb.i1(g950Var, linkedHashSet, arrayList, l9zVar, ((lm50) ((km50) ((v7i) f7uVar.b).m)).d));
        }
        if (this.n.f22221a.isEnum() && g950Var.equals(j4m0.b) && (f0d0VarP = obb.P(l9zVar)) != null) {
            arrayList.add(f0d0VarP);
        }
    }

    @Override // a.baz
    public final Set o(cek cekVar) {
        cekVar.getClass();
        LinkedHashSet linkedHashSetO0 = CollectionsKt.O0(((ckj) this.e.invoke()).f());
        j9x j9xVar = j9x.x;
        l9z l9zVar = this.o;
        ntb.H(kotlin.collections.a.c(l9zVar), m2a.r, new daz(l9zVar, linkedHashSetO0, j9xVar));
        if (this.n.f22221a.isEnum()) {
            linkedHashSetO0.add(j4m0.b);
        }
        return linkedHashSetO0;
    }

    @Override // a.baz
    public final vjj q() {
        return this.o;
    }
}
