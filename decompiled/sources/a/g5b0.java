package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class g5b0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ j5b0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g5b0(j5b0 j5b0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = j5b0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        j5b0 j5b0Var = this.k;
        switch (b) {
            case 0:
                g5b0 g5b0Var = new g5b0(j5b0Var, yjeVar, (byte) 0);
                g5b0Var.j = obj;
                return g5b0Var;
            case 1:
                g5b0 g5b0Var2 = new g5b0(j5b0Var, yjeVar, (byte) 1);
                g5b0Var2.j = obj;
                return g5b0Var2;
            default:
                g5b0 g5b0Var3 = new g5b0(j5b0Var, yjeVar, (byte) 2);
                g5b0Var3.j = obj;
                return g5b0Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((g5b0) create((d5b0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((g5b0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((g5b0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        j5b0 j5b0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                d5b0 d5b0Var = (d5b0) obj2;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                bby bbyVar = j5b0Var.p;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                j5b0Var.d.g((d5b0Var instanceof a5b0) || (d5b0Var instanceof c5b0));
                break;
            case 1:
                List list = (List) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                tro troVar = ((vro) j5b0Var.m.getValue()).f37909a;
                sro sroVar = troVar instanceof sro ? (sro) troVar : null;
                List list2 = sroVar != null ? sroVar.f32688a : null;
                if (list2 == null) {
                    list2 = iun.f15405a;
                }
                ArrayList arrayListQ0 = CollectionsKt.q0(list2, list);
                iij iijVar = j5b0Var.h;
                iijVar.getClass();
                iijVar.h = arrayListQ0;
                p7m0 p7m0Var = j5b0Var.m;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, vro.a((vro) value, null, new sro(list, jwb.B(list, false, j5b0Var.f, gkb.b0(((sff0) j5b0Var.r.getValue()).g.A))), 1)));
                break;
            default:
                List list3 = (List) obj2;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                tro troVar2 = ((vro) j5b0Var.m.getValue()).b;
                sro sroVar2 = troVar2 instanceof sro ? (sro) troVar2 : null;
                List list4 = sroVar2 != null ? sroVar2.f32688a : null;
                if (list4 == null) {
                    list4 = iun.f15405a;
                }
                ArrayList arrayListQ1 = CollectionsKt.q0(list3, list4);
                iij iijVar2 = j5b0Var.h;
                iijVar2.getClass();
                iijVar2.h = arrayListQ1;
                p7m0 p7m0Var2 = j5b0Var.m;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, vro.a((vro) value2, new sro(list3, jwb.B(list3, true, j5b0Var.f, gkb.b0(((sff0) j5b0Var.r.getValue()).g.A))), null, 2)));
                break;
        }
        return Unit.f46060a;
    }
}
