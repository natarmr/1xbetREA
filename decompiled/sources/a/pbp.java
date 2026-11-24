package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class pbp extends bnn0 implements ydr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public boolean k;
    public /* synthetic */ Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pbp(Object obj, boolean z, yje yjeVar, byte b) {
        super(4, yjeVar);
        this.i = b;
        this.n = obj;
        this.k = z;
    }

    /* JADX WARN: Code duplicated, block: B:78:0x0175  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z;
        byte b = this.i;
        Object obj2 = null;
        Object obj3 = this.n;
        switch (b) {
            case 0:
                ccp ccpVar = (ccp) obj3;
                kmq kmqVar = (kmq) this.l;
                Pair pair = (Pair) this.m;
                List list = (List) this.j;
                wne wneVar = wne.f39444a;
                boolean z2 = this.k;
                if (!z2) {
                    z1x.P(obj);
                    int i = ccp.u0;
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
                    iun iunVar = iun.f15405a;
                    lc00 lc00VarM = ccpVar.M(iunVar, iunVar, pairO, list);
                    o470Var.getClass();
                    lc00VarM.getClass();
                    ((rrc) o470Var.f24619a).J(wepVar, lc00VarM);
                    ec80 ec80Var = new ec80(iunVar, iunVar, (List) pairO.b, list, iunVar);
                    this.l = null;
                    this.m = null;
                    this.j = null;
                    this.k = true;
                    if (kmqVar.a(ec80Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                cvo0 cvo0Var = (cvo0) this.l;
                List list2 = (List) this.j;
                sw00 sw00Var = (sw00) this.m;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (!sw00Var.f32897a || axq.z((q7d0) ((roi0) ((f4u) ((kki) obj3).e).b).f30839a, "DAILY_EVENTS_DIALOG_SHOWN", false) || !this.k) {
                    return new v1j(false);
                }
                if ((cvo0Var instanceof bvo0) || (cvo0Var instanceof avo0)) {
                    return w1j.f38402a;
                }
                for (Object obj4 : list2) {
                    n85 n85Var = (n85) obj4;
                    if (n85Var.g == wuo0.b && n85Var.f()) {
                        obj2 = obj4;
                        return new v1j(obj2 != null);
                    }
                }
                return new v1j(obj2 != null);
            default:
                w5z w5zVar = (w5z) obj3;
                rb60 rb60Var = (rb60) this.l;
                rb60 rb60Var2 = (rb60) this.m;
                rb60 rb60Var3 = (rb60) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = ((rb60Var instanceof pb60) && hic.C(((pb60) rb60Var).b)) || ((rb60Var2 instanceof pb60) && hic.C(((pb60) rb60Var2).b)) || ((rb60Var3 instanceof pb60) && hic.C(((pb60) rb60Var3).b));
                List listA = rb60Var.a();
                List listA2 = rb60Var2.a();
                List listA3 = rb60Var3.a();
                List listJ = this.k ? q3d.j(rb60Var, rb60Var2, rb60Var3) : q3d.j(rb60Var, rb60Var2);
                enm enmVar = new enm((Object) w5zVar, (Object) rb60Var, (Object) rb60Var2, (Object) rb60Var3, (byte) 23);
                w5zVar.getClass();
                ArrayList<rb60> arrayList2 = new ArrayList();
                for (Object obj5 : listJ) {
                    if (!((Boolean) enmVar.invoke((rb60) obj5)).booleanValue()) {
                        arrayList2.add(obj5);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : listJ) {
                    rb60 rb60Var4 = (rb60) obj6;
                    if (((Boolean) enmVar.invoke(rb60Var4)).booleanValue() && !rb60Var4.a().isEmpty()) {
                        arrayList3.add(obj6);
                    }
                }
                if (arrayList2.isEmpty() || !arrayList3.isEmpty() || arrayList2.isEmpty()) {
                    z = false;
                } else {
                    for (rb60 rb60Var5 : arrayList2) {
                        if (rb60Var5 instanceof pb60) {
                            Throwable th = ((pb60) rb60Var5).b;
                            if ((th instanceof zhi0) || (th instanceof hr30)) {
                                z = true;
                            }
                        }
                    }
                    z = false;
                }
                return new o8p(listA, listA2, listA3, z3, z);
        }
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.i;
        Object obj5 = this.n;
        switch (b) {
            case 0:
                pbp pbpVar = new pbp((ccp) obj5, (yje) obj4);
                pbpVar.l = (kmq) obj;
                pbpVar.m = (Pair) obj2;
                pbpVar.j = (List) obj3;
                return pbpVar.invokeSuspend(Unit.f46060a);
            case 1:
                pbp pbpVar2 = new pbp((kki) obj5, this.k, (yje) obj4, (byte) 1);
                pbpVar2.l = (cvo0) obj;
                pbpVar2.j = (List) obj2;
                pbpVar2.m = (sw00) obj3;
                return pbpVar2.invokeSuspend(Unit.f46060a);
            default:
                pbp pbpVar3 = new pbp((w5z) obj5, this.k, (yje) obj4, (byte) 2);
                pbpVar3.l = (rb60) obj;
                pbpVar3.m = (rb60) obj2;
                pbpVar3.j = (rb60) obj3;
                return pbpVar3.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbp(ccp ccpVar, yje yjeVar) {
        super(4, yjeVar);
        this.i = (byte) 0;
        this.n = ccpVar;
    }
}
