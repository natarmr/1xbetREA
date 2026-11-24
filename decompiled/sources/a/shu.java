package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class shu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j400 f32232a;

    public shu(j400 j400Var) {
        j400Var.getClass();
        this.f32232a = j400Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, ucq ucqVar, zje zjeVar) throws Throwable {
        rhu rhuVar;
        if (zjeVar instanceof rhu) {
            rhuVar = (rhu) zjeVar;
            int i = rhuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                rhuVar.l = i - Integer.MIN_VALUE;
            } else {
                rhuVar = new rhu(this, zjeVar);
            }
        } else {
            rhuVar = new rhu(this, zjeVar);
        }
        Object objA = rhuVar.j;
        wne wneVar = wne.f39444a;
        int i2 = rhuVar.l;
        if (i2 == 0) {
            z1x.P(objA);
            rhuVar.i = ucqVar;
            rhuVar.l = 1;
            objA = this.f32232a.a(str, rhuVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ucqVar = rhuVar.i;
            z1x.P(objA);
        }
        fzz fzzVar = (fzz) objA;
        List list = fzzVar.f10434a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (ulb.T(((pcq) obj).b, ucqVar)) {
                arrayList.add(obj);
            }
        }
        List list2 = fzzVar.b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list2) {
            if (ulb.T(((niq0) obj2).b, ucqVar)) {
                arrayList2.add(obj2);
            }
        }
        return new fzz(arrayList, arrayList2);
    }
}
