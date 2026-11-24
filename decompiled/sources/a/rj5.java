package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class rj5 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30575a;
    public final /* synthetic */ kmq b;
    public final /* synthetic */ dk5 c;

    public /* synthetic */ rj5(kmq kmqVar, dk5 dk5Var, byte b) {
        this.f30575a = b;
        this.b = kmqVar;
        this.c = dk5Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:9:0x0021  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        qj5 qj5Var;
        xj5 xj5Var;
        ak5 ak5Var;
        byte b = this.f30575a;
        byte b2 = 5;
        dk5 dk5Var = this.c;
        kmq kmqVar = this.b;
        yje yjeVar2 = null;
        switch (b) {
            case 0:
                if (yjeVar instanceof qj5) {
                    qj5Var = (qj5) yjeVar;
                    int i = qj5Var.j;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        qj5Var.j = i - Integer.MIN_VALUE;
                    } else {
                        qj5Var = new qj5(this, yjeVar);
                    }
                } else {
                    qj5Var = new qj5(this, yjeVar);
                }
                Object obj2 = qj5Var.i;
                wne wneVar = wne.f39444a;
                int i2 = qj5Var.j;
                if (i2 == 0) {
                    z1x.P(obj2);
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(j0x.M((mjz) it.next(), dk5Var.B));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : arrayList) {
                        if (obj3 instanceof tjz) {
                            arrayList2.add(obj3);
                        }
                    }
                    qj5Var.j = 1;
                    if (kmqVar.a(arrayList2, qj5Var) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj2);
                }
                return Unit.f46060a;
            case 1:
                if (yjeVar instanceof xj5) {
                    xj5Var = (xj5) yjeVar;
                    int i3 = xj5Var.j;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        xj5Var.j = i3 - Integer.MIN_VALUE;
                    } else {
                        xj5Var = new xj5(this, yjeVar);
                    }
                } else {
                    xj5Var = new xj5(this, yjeVar);
                }
                Object obj4 = xj5Var.i;
                wne wneVar2 = wne.f39444a;
                int i4 = xj5Var.j;
                if (i4 == 0) {
                    z1x.P(obj4);
                    fl80 fl80Var = (fl80) obj;
                    vj5 vj5Var = new vj5(dk5Var, yjeVar2, (byte) 0);
                    fl80Var.getClass();
                    fl80 fl80Var2 = new fl80(new fnq(fl80Var.f9726a, vj5Var, b2), fl80Var.b, fl80Var.c, pul.n);
                    xj5Var.j = 1;
                    if (kmqVar.a(fl80Var2, xj5Var) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj4);
                }
                return Unit.f46060a;
            default:
                if (yjeVar instanceof ak5) {
                    ak5Var = (ak5) yjeVar;
                    int i5 = ak5Var.j;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        ak5Var.j = i5 - Integer.MIN_VALUE;
                    } else {
                        ak5Var = new ak5(this, yjeVar);
                    }
                } else {
                    ak5Var = new ak5(this, yjeVar);
                }
                Object obj5 = ak5Var.i;
                wne wneVar3 = wne.f39444a;
                int i6 = ak5Var.j;
                if (i6 == 0) {
                    z1x.P(obj5);
                    fl80 fl80Var3 = (fl80) obj;
                    vj5 vj5Var2 = new vj5(dk5Var, yjeVar2, (byte) 3);
                    fl80Var3.getClass();
                    fl80 fl80Var4 = new fl80(new fnq(fl80Var3.f9726a, vj5Var2, b2), fl80Var3.b, fl80Var3.c, pul.n);
                    ak5Var.j = 1;
                    if (kmqVar.a(fl80Var4, ak5Var) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (i6 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj5);
                }
                return Unit.f46060a;
        }
    }
}
