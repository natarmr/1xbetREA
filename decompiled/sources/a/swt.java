package a;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class swt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1q0 f32940a;
    public final lhf0 b;

    public swt(j1q0 j1q0Var, lhf0 lhf0Var) {
        j1q0Var.getClass();
        this.f32940a = j1q0Var;
        this.b = lhf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(z7b[] z7bVarArr, zje zjeVar) {
        rnu rnuVar;
        if (zjeVar instanceof rnu) {
            rnuVar = (rnu) zjeVar;
            int i = rnuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                rnuVar.l = i - Integer.MIN_VALUE;
            } else {
                rnuVar = new rnu(this, zjeVar);
            }
        } else {
            rnuVar = new rnu(this, zjeVar);
        }
        Object objF = rnuVar.j;
        Object obj = wne.f39444a;
        int i2 = rnuVar.l;
        if (i2 == 0) {
            z1x.P(objF);
            boolean zA = this.f32940a.f15748a.a();
            rnuVar.i = z7bVarArr;
            rnuVar.l = 1;
            objF = this.b.f(zA, rnuVar);
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z7bVarArr = rnuVar.i;
            z1x.P(objF);
        }
        List list = (List) objF;
        if (z7bVarArr.length == 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList(z7bVarArr.length);
        for (z7b z7bVar : z7bVarArr) {
            arrayList.add(new Long(z7bVar.f43909a));
        }
        Set setP0 = CollectionsKt.P0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (setP0.contains(new Long(((vh0) obj2).f))) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public swt(lhf0 lhf0Var, j1q0 j1q0Var) {
        j1q0Var.getClass();
        this.b = lhf0Var;
        this.f32940a = j1q0Var;
    }
}
