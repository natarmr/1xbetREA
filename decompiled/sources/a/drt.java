package a;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class drt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f8u f6579a;

    public drt(f8u f8uVar) {
        this.f6579a = f8uVar;
    }

    public ArrayList a() {
        bop0 bop0Var = bop0.FIRST;
        f8u f8uVar = this.f6579a;
        return CollectionsKt.q0(f8uVar.a(bop0Var), f8uVar.a(bop0.SECOND));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    public ArrayList b(d9a0 d9a0Var) {
        bop0 bop0Var = bop0.FIRST;
        f8u f8uVar = this.f6579a;
        ArrayList arrayListA = f8uVar.a(bop0Var);
        ArrayList arrayListA2 = f8uVar.a(bop0.SECOND);
        bop0[] bop0VarArrValues = bop0.values();
        ArrayList arrayList = new ArrayList();
        for (bop0 bop0Var2 : bop0VarArrValues) {
            jyb jybVarL = gl5.l(d9a0Var, arrayListA, arrayListA2, bop0Var2, false);
            if (((jybVarL instanceof gyb) || (jybVarL instanceof fyb)) && bop0Var2 != bop0.UNDEFINED) {
                ArrayList arrayListQ0 = CollectionsKt.q0(arrayListA, arrayListA2);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayListQ0) {
                    if (((d9a0) obj).f5691a == d9a0Var.f5691a) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Integer.valueOf(((d9a0) it.next()).f));
                }
                if (!arrayList3.contains(Integer.valueOf(bop0Var2.f2946a))) {
                    arrayList.add(bop0Var2);
                }
            } else if (!(jybVarL instanceof iyb)) {
                arrayList.add(bop0Var2);
            }
        }
        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Integer.valueOf(((bop0) it2.next()).f2946a));
        }
        return arrayList4;
    }

    public drt(gl5 gl5Var, f8u f8uVar) {
        this.f6579a = f8uVar;
    }
}
