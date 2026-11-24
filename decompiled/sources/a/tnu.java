package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class tnu extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ List j;
    public /* synthetic */ sw00 k;
    public final /* synthetic */ List l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tnu(List list, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.l = list;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        List list = this.l;
        List list2 = (List) obj;
        sw00 sw00Var = (sw00) obj2;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                tnu tnuVar = new tnu(list, yjeVar, (byte) 0);
                tnuVar.j = list2;
                tnuVar.k = sw00Var;
                return tnuVar.invokeSuspend(Unit.f46060a);
            default:
                tnu tnuVar2 = new tnu(list, yjeVar, (byte) 1);
                tnuVar2.j = list2;
                tnuVar2.k = sw00Var;
                return tnuVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        List<gza0> list = this.l;
        switch (b) {
            case 0:
                List list2 = this.j;
                sw00 sw00Var = this.k;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (gza0 gza0Var : list) {
                    arrayList.add(new gza0(gza0Var.f12173a, "", gza0Var.c, gza0Var.d, list2, sw00Var.f32897a));
                }
                return arrayList;
            default:
                List list3 = this.j;
                sw00 sw00Var2 = this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                for (gza0 gza0Var2 : list) {
                    arrayList2.add(new gza0(gza0Var2.f12173a, gza0Var2.b, gza0Var2.c, fza0.c, list3, sw00Var2.f32897a));
                }
                return arrayList2;
        }
    }
}
