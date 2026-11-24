package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class r7u extends bnn0 implements ydr {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public /* synthetic */ Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ List m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r7u(List list, yje yjeVar, byte b) {
        super(4, yjeVar);
        this.i = b;
        this.m = list;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        List list = this.m;
        switch (b) {
            case 0:
                Object obj2 = this.j;
                Object obj3 = this.k;
                Object obj4 = this.l;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return new w7o(obj2, obj3, obj4, list);
            default:
                Object obj5 = this.j;
                Object obj6 = this.k;
                Object obj7 = this.l;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                return new e9p0(obj5, obj6, obj7, list);
        }
    }

    @Override // a.ydr
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.i;
        List list = this.m;
        j0g0 j0g0Var = (j0g0) obj;
        switch (b) {
            case 0:
                Object obj5 = j0g0Var.f15681a;
                Object obj6 = ((j0g0) obj2).f15681a;
                Object obj7 = ((j0g0) obj3).f15681a;
                r7u r7uVar = new r7u(list, (yje) obj4, (byte) 0);
                r7uVar.j = obj5;
                r7uVar.k = obj6;
                r7uVar.l = obj7;
                return r7uVar.invokeSuspend(Unit.f46060a);
            default:
                Object obj8 = j0g0Var.f15681a;
                Object obj9 = ((j0g0) obj2).f15681a;
                Object obj10 = ((j0g0) obj3).f15681a;
                r7u r7uVar2 = new r7u(list, (yje) obj4, (byte) 1);
                r7uVar2.j = obj8;
                r7uVar2.k = obj9;
                r7uVar2.l = obj10;
                return r7uVar2.invokeSuspend(Unit.f46060a);
        }
    }
}
