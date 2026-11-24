package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class obp extends bnn0 implements aer {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ List k;
    public /* synthetic */ List l;
    public /* synthetic */ Pair m;
    public /* synthetic */ List n;
    public final /* synthetic */ ccp o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obp(ccp ccpVar, yje yjeVar) {
        super(6, yjeVar);
        this.o = ccpVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        kmq kmqVar = this.j;
        List list = this.k;
        List list2 = this.l;
        Pair pair = this.m;
        List list3 = this.n;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            int i = ccp.u0;
            ccp ccpVar = this.o;
            Pair pairO = ccpVar.O(pair);
            nn60 nn60Var = ccpVar.j0;
            Iterable iterable = (Iterable) pairO.f46059a;
            ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                axq.t(((i8p) it.next()).f14350a, arrayList);
            }
            i3t0.B(ccpVar, nn60Var, new en60[]{new xm60(arrayList)});
            o470 o470Var = ccpVar.E;
            wep wepVar = wep.b;
            lc00 lc00VarM = ccpVar.M(list, list2, pairO, list3);
            o470Var.getClass();
            lc00VarM.getClass();
            ((rrc) o470Var.f24619a).J(wepVar, lc00VarM);
            ec80 ec80Var = new ec80(list, list2, (List) pairO.b, list3, iun.f15405a);
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.i = true;
            if (kmqVar.a(ec80Var, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    @Override // a.aer
    public final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        obp obpVar = new obp(this.o, (yje) obj6);
        obpVar.j = (kmq) obj;
        obpVar.k = (List) obj2;
        obpVar.l = (List) obj3;
        obpVar.m = (Pair) obj4;
        obpVar.n = (List) obj5;
        return obpVar.invokeSuspend(Unit.f46060a);
    }
}
