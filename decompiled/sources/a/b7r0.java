package a;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class b7r0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2122a;
    public final /* synthetic */ g7r0 b;

    public /* synthetic */ b7r0(g7r0 g7r0Var, byte b) {
        this.f2122a = b;
        this.b = g7r0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        idt idtVar;
        Collection collection;
        Object value2;
        Iterable iterable;
        byte b = this.f2122a;
        g7r0 g7r0Var = this.b;
        switch (b) {
            case 0:
                List list = (List) obj;
                int i = g7r0.L;
                p7m0 p7m0Var = g7r0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    g7r0Var.f.getClass();
                } while (!p7m0Var.m(value, w6r0.a((w6r0) value, false, false, null, null, null, null, null, null, null, null, null, false, false, null, null, new idt(list), false, false, false, 7733247)));
                odt odtVar = ((w6r0) g7r0Var.D()).q;
                idtVar = odtVar instanceof idt ? (idt) odtVar : null;
                if (idtVar == null || (collection = idtVar.f14602a) == null) {
                    collection = iun.f15405a;
                }
                hjd hjdVar = g7r0Var.v;
                did didVar = new did(CollectionsKt.q0(collection, list));
                hjdVar.getClass();
                Object objA = hjdVar.a(didVar, yjeVar);
                return objA == wne.f39444a ? objA : Unit.f46060a;
            default:
                List list2 = (List) obj;
                int i2 = g7r0.L;
                p7m0 p7m0Var2 = g7r0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    g7r0Var.f.getClass();
                } while (!p7m0Var2.m(value2, w6r0.a((w6r0) value2, false, false, null, null, null, null, null, null, null, null, null, false, false, null, new idt(list2), null, false, false, false, 8060927)));
                odt odtVar2 = ((w6r0) g7r0Var.D()).r;
                idtVar = odtVar2 instanceof idt ? (idt) odtVar2 : null;
                if (idtVar == null || (iterable = idtVar.f14602a) == null) {
                    iterable = iun.f15405a;
                }
                hjd hjdVar2 = g7r0Var.v;
                did didVar2 = new did(CollectionsKt.q0(list2, iterable));
                hjdVar2.getClass();
                Object objA2 = hjdVar2.a(didVar2, yjeVar);
                return objA2 == wne.f39444a ? objA2 : Unit.f46060a;
        }
    }
}
