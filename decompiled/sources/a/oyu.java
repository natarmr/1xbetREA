package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class oyu extends bnn0 implements ydr {
    public final /* synthetic */ byte i;
    public /* synthetic */ List j;
    public /* synthetic */ List k;
    public /* synthetic */ List l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oyu(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                List<mmp0> list = this.j;
                List list2 = this.k;
                List list3 = this.l;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (mmp0 mmp0Var : list) {
                    arrayList.add(new nmp0(mmp0Var.f22052a, mmp0Var.b, mmp0Var.c, mmp0Var.d, axq.y(mmp0Var.f22052a, list2), axq.y(mmp0Var.f22052a, list3)));
                }
                return arrayList;
            default:
                List list4 = this.j;
                List list5 = this.k;
                List list6 = this.l;
                wne wneVar2 = wne.f39444a;
                ArrayList<vr20> arrayListT = twn.t(obj);
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    w3d.u(arrayListT, r3d.r(((sr20) it.next()).f32656a));
                }
                ArrayList arrayList2 = new ArrayList(r3d.q(arrayListT, 10));
                for (vr20 vr20Var : arrayListT) {
                    arrayList2.add(tlb.h0(vr20Var, r8x.Q(list6, vr20Var, vr20Var.c), r8x.Q(list5, vr20Var, vr20Var.c), uyc.IDLE));
                }
                return arrayList2;
        }
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 4;
        List list = (List) obj;
        List list2 = (List) obj2;
        List list3 = (List) obj3;
        yje yjeVar = (yje) obj4;
        switch (this.i) {
            case 0:
                oyu oyuVar = new oyu(i, yjeVar, (byte) 0);
                oyuVar.j = list;
                oyuVar.k = list2;
                oyuVar.l = list3;
                return oyuVar.invokeSuspend(Unit.f46060a);
            default:
                oyu oyuVar2 = new oyu(i, yjeVar, (byte) 1);
                oyuVar2.j = list;
                oyuVar2.k = list2;
                oyuVar2.l = list3;
                return oyuVar2.invokeSuspend(Unit.f46060a);
        }
    }
}
