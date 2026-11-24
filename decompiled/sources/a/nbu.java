package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class nbu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn0 f23258a;
    public final j1q0 b;

    public nbu(j1q0 j1q0Var, dn0 dn0Var) {
        j1q0Var.getClass();
        dn0Var.getClass();
        this.b = j1q0Var;
        this.f23258a = dn0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object a(List list, String str, boolean z, zje zjeVar) {
        mbu mbuVar;
        if (zjeVar instanceof mbu) {
            mbuVar = (mbu) zjeVar;
            int i = mbuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbuVar.l = i - Integer.MIN_VALUE;
            } else {
                mbuVar = new mbu(this, zjeVar);
            }
        } else {
            mbuVar = new mbu(this, zjeVar);
        }
        mbu mbuVar2 = mbuVar;
        Object objD = mbuVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = mbuVar2.l;
        if (i2 == 0) {
            ArrayList arrayListT = twn.t(objD);
            for (Object obj : list) {
                mlr mlrVar = (mlr) obj;
                if (StringsKt.W(mlrVar.e) || StringsKt.W(mlrVar.g)) {
                    arrayListT.add(obj);
                }
            }
            ArrayList arrayList = new ArrayList(r3d.q(arrayListT, 10));
            Iterator it = arrayListT.iterator();
            while (it.hasNext()) {
                axq.t(((mlr) it.next()).f22006a, arrayList);
            }
            Set setP0 = CollectionsKt.P0(arrayList);
            if (setP0.isEmpty()) {
                return list;
            }
            boolean zA = this.b.f15748a.a();
            mbuVar2.i = list;
            mbuVar2.l = 1;
            objD = this.f23258a.d(setP0, zA, str, z, false, mbuVar2);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = mbuVar2.i;
            z1x.P(objD);
        }
        Iterable iterable = (Iterable) objD;
        int iA = wp20.a(r3d.q(iterable, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Object obj2 : iterable) {
            linkedHashMap.put(new Long(((mlr) obj2).f22006a), obj2);
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        for (mlr mlrVar2 : list) {
            mlr mlrVar3 = (mlr) linkedHashMap.get(new Long(mlrVar2.f22006a));
            if (mlrVar3 != null) {
                mlrVar2 = mlrVar3;
            }
            arrayList2.add(mlrVar2);
        }
        return arrayList2;
    }

    public nbu(dn0 dn0Var, j1q0 j1q0Var) {
        j1q0Var.getClass();
        this.f23258a = dn0Var;
        this.b = j1q0Var;
    }
}
