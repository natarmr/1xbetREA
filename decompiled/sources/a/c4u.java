package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class c4u extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ List j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4u(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = 3;
        List list = (List) obj;
        j0g0 j0g0Var = (j0g0) obj2;
        switch (this.i) {
            case 0:
                Object obj4 = j0g0Var.f15681a;
                c4u c4uVar = new c4u(b, (yje) obj3, (byte) 0);
                c4uVar.j = list;
                c4uVar.k = obj4;
                return c4uVar.invokeSuspend(Unit.f46060a);
            case 1:
                Object obj5 = j0g0Var.f15681a;
                c4u c4uVar2 = new c4u(b, (yje) obj3, (byte) 1);
                c4uVar2.j = list;
                c4uVar2.k = obj5;
                return c4uVar2.invokeSuspend(Unit.f46060a);
            case 2:
                Object obj6 = j0g0Var.f15681a;
                c4u c4uVar3 = new c4u(b, (yje) obj3, (byte) 2);
                c4uVar3.j = list;
                c4uVar3.k = obj6;
                return c4uVar3.invokeSuspend(Unit.f46060a);
            default:
                Object obj7 = j0g0Var.f15681a;
                c4u c4uVar4 = new c4u(b, (yje) obj3, b);
                c4uVar4.j = list;
                c4uVar4.k = obj7;
                return c4uVar4.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                List list = this.j;
                Object obj2 = this.k;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                e0g0 e0g0Var = j0g0.b;
                if (!(obj2 instanceof g0g0)) {
                    List<xah> list2 = (List) obj2;
                    ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                    for (xah xahVar : list2) {
                        arrayList.add(xah.a(xahVar, null, null, null, axq.y(xahVar.g, list), 49151));
                    }
                    obj2 = arrayList;
                }
                return new j0g0(obj2);
            case 1:
                List list3 = this.j;
                Object obj3 = this.k;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                e0g0 e0g0Var2 = j0g0.b;
                if (!(obj3 instanceof g0g0)) {
                    List<xah> list4 = (List) obj3;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list4, 10));
                    for (xah xahVar2 : list4) {
                        arrayList2.add(xah.a(xahVar2, null, null, null, axq.y(xahVar2.g, list3), 49151));
                    }
                    obj3 = arrayList2;
                }
                return new j0g0(obj3);
            case 2:
                List list5 = this.j;
                Object obj4 = this.k;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                e0g0 e0g0Var3 = j0g0.b;
                if (!(obj4 instanceof g0g0)) {
                    List<rbb> list6 = (List) obj4;
                    ArrayList arrayList3 = new ArrayList(r3d.q(list6, 10));
                    for (rbb rbbVar : list6) {
                        boolean zY = axq.y(rbbVar.f30176a, list5);
                        List<sum0> list7 = rbbVar.d;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list7, 10));
                        for (sum0 sum0Var : list7) {
                            arrayList4.add(sum0.a(sum0Var, axq.y(sum0Var.f32829a, list5), null, 31743));
                        }
                        arrayList3.add(rbb.a(rbbVar, arrayList4, zY, null, 129015));
                    }
                    obj4 = arrayList3;
                }
                return new j0g0(obj4);
            default:
                List list8 = this.j;
                Object obj5 = this.k;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                e0g0 e0g0Var4 = j0g0.b;
                if (!(obj5 instanceof g0g0)) {
                    List<rbb> list9 = (List) obj5;
                    ArrayList arrayList5 = new ArrayList(r3d.q(list9, 10));
                    for (rbb rbbVar2 : list9) {
                        boolean zY2 = axq.y(rbbVar2.f30176a, list8);
                        List<sum0> list10 = rbbVar2.d;
                        ArrayList arrayList6 = new ArrayList(r3d.q(list10, 10));
                        for (sum0 sum0Var2 : list10) {
                            arrayList6.add(sum0.a(sum0Var2, axq.y(sum0Var2.f32829a, list8), null, 31743));
                        }
                        arrayList5.add(rbb.a(rbbVar2, arrayList6, zY2, null, 129015));
                    }
                    obj5 = arrayList5;
                }
                return new j0g0(obj5);
        }
    }
}
