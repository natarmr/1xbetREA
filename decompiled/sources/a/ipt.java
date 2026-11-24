package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ipt extends bnn0 implements ydr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ipt(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a4  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable thA;
        switch (this.i) {
            case 0:
                Object obj2 = this.j;
                Object obj3 = this.k;
                Object obj4 = this.l;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                List listJ = q3d.j(new j0g0(obj2), new j0g0(obj3), new j0g0(obj4));
                ArrayList arrayList = new ArrayList();
                Iterator it = listJ.iterator();
                while (it.hasNext()) {
                    Object obj5 = ((j0g0) it.next()).f15681a;
                    iun iunVar = iun.f15405a;
                    if (obj5 instanceof g0g0) {
                        obj5 = iunVar;
                    }
                    w3d.u(arrayList, (Iterable) obj5);
                }
                if (arrayList.isEmpty()) {
                    Iterator it2 = listJ.iterator();
                    while (it2.hasNext()) {
                        thA = j0g0.a(((j0g0) it2.next()).f15681a);
                        if (thA != null) {
                            if (thA != null) {
                                throw thA;
                            }
                        }
                    }
                    thA = null;
                    if (thA != null) {
                        throw thA;
                    }
                }
                return arrayList;
            case 1:
                Object obj6 = this.j;
                Object obj7 = this.k;
                Object obj8 = this.l;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return new i3v(obj6, obj7, obj8);
            default:
                Object obj9 = this.j;
                Object obj10 = this.k;
                Object obj11 = this.l;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                return new j0g0(new fqu0(new j0g0(obj9), new j0g0(obj10), new j0g0(obj11)));
        }
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = 4;
        j0g0 j0g0Var = (j0g0) obj;
        switch (this.i) {
            case 0:
                Object obj5 = j0g0Var.f15681a;
                Object obj6 = ((j0g0) obj2).f15681a;
                Object obj7 = ((j0g0) obj3).f15681a;
                ipt iptVar = new ipt(i, (yje) obj4, (byte) 0);
                iptVar.j = obj5;
                iptVar.k = obj6;
                iptVar.l = obj7;
                return iptVar.invokeSuspend(Unit.f46060a);
            case 1:
                Object obj8 = j0g0Var.f15681a;
                Object obj9 = ((j0g0) obj2).f15681a;
                Object obj10 = ((j0g0) obj3).f15681a;
                ipt iptVar2 = new ipt(i, (yje) obj4, (byte) 1);
                iptVar2.j = obj8;
                iptVar2.k = obj9;
                iptVar2.l = obj10;
                return iptVar2.invokeSuspend(Unit.f46060a);
            default:
                Object obj11 = j0g0Var.f15681a;
                Object obj12 = ((j0g0) obj2).f15681a;
                Object obj13 = ((j0g0) obj3).f15681a;
                ipt iptVar3 = new ipt(i, (yje) obj4, (byte) 2);
                iptVar3.j = obj11;
                iptVar3.k = obj12;
                iptVar3.l = obj13;
                return iptVar3.invokeSuspend(Unit.f46060a);
        }
    }
}
