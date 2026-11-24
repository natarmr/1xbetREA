package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class per extends fyj0 {
    public per(vjj vjjVar, per perVar, int i, boolean z) {
        super(vjjVar, perVar, ujn.c, d180.g, i, gmk0.x0);
        this.n = true;
        this.v = z;
        this.w = false;
    }

    @Override // a.oer, a.sq30
    public final boolean isExternal() {
        return false;
    }

    @Override // a.oer, a.mer
    public final boolean isInline() {
        return false;
    }

    @Override // a.fyj0, a.oer
    public final oer q1(int i, g93 g93Var, vjj vjjVar, mer merVar, g950 g950Var, gmk0 gmk0Var) {
        vjjVar.getClass();
        if (i == 0) {
            throw null;
        }
        g93Var.getClass();
        return new per(vjjVar, (per) merVar, i, this.v);
    }

    @Override // a.oer
    public final oer r1(ner nerVar) throws wzs0 {
        g950 g950Var;
        per perVar = (per) super.r1(nerVar);
        if (perVar == null) {
            return null;
        }
        List listZ = perVar.z();
        listZ.getClass();
        if (listZ.isEmpty()) {
            return perVar;
        }
        Iterator it = listZ.iterator();
        while (it.hasNext()) {
            wsy type = ((k3u0) it.next()).getType();
            type.getClass();
            if (bfb.O(type) != null) {
                List listZ2 = perVar.z();
                listZ2.getClass();
                ArrayList arrayList = new ArrayList(r3d.q(listZ2, 10));
                Iterator it2 = listZ2.iterator();
                while (it2.hasNext()) {
                    wsy type2 = ((k3u0) it2.next()).getType();
                    type2.getClass();
                    arrayList.add(bfb.O(type2));
                }
                int size = perVar.z().size() - arrayList.size();
                boolean z = true;
                if (size == 0) {
                    List listZ3 = perVar.z();
                    listZ3.getClass();
                    ArrayList<Pair> arrayListT0 = CollectionsKt.T0(arrayList, listZ3);
                    if (arrayListT0.isEmpty()) {
                        return perVar;
                    }
                    for (Pair pair : arrayListT0) {
                        if (!Intrinsics.d((g950) pair.f46059a, ((k3u0) pair.b).getName())) {
                        }
                    }
                    return perVar;
                }
                List<k3u0> listZ4 = perVar.z();
                listZ4.getClass();
                ArrayList arrayList2 = new ArrayList(r3d.q(listZ4, 10));
                for (k3u0 k3u0Var : listZ4) {
                    g950 name = k3u0Var.getName();
                    name.getClass();
                    int i = k3u0Var.g;
                    int i2 = i - size;
                    if (i2 >= 0 && (g950Var = (g950) arrayList.get(i2)) != null) {
                        name = g950Var;
                    }
                    arrayList2.add(k3u0Var.p1(perVar, name, i));
                }
                ner nerVarU1 = perVar.u1(xzs0.b);
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        if (((g950) it3.next()) == null) {
                        }
                    }
                    z = false;
                }
                nerVarU1.v = Boolean.valueOf(z);
                nerVarU1.g = arrayList2;
                nerVarU1.e = perVar.a();
                oer oerVarR1 = super.r1(nerVarU1);
                oerVarR1.getClass();
                return oerVarR1;
            }
        }
        return perVar;
    }

    @Override // a.oer, a.mer
    public final boolean w() {
        return false;
    }
}
