package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class yr90 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ es90 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yr90(es90 es90Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = es90Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        es90 es90Var = this.k;
        switch (b) {
            case 0:
                yr90 yr90Var = new yr90(es90Var, yjeVar, (byte) 0);
                yr90Var.j = obj;
                return yr90Var;
            default:
                yr90 yr90Var2 = new yr90(es90Var, yjeVar, (byte) 1);
                yr90Var2.j = obj;
                return yr90Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((yr90) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((yr90) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        cr90 cr90Var;
        byte b = this.i;
        es90 es90Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    nq90 nq90Var = (nq90) obj3;
                    List list = es90Var.l.s1;
                    kq90 kq90Var = nq90Var instanceof kq90 ? (kq90) nq90Var : null;
                    if (!CollectionsKt.L(list, kq90Var != null ? kq90Var.g : null)) {
                        arrayList.add(obj3);
                    }
                }
                g090 g090Var = es90Var.i;
                g090Var.getClass();
                p7m0 p7m0Var = (p7m0) g090Var.b;
                do {
                    value = p7m0Var.getValue();
                    cr90Var = (cr90) value;
                } while (!p7m0Var.m(value, cr90.a(cr90Var, null, null, arrayList, !arrayList.equals(cr90Var.e), null, null, 463)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                es90Var.d.b((Throwable) obj2, new so90((byte) 5));
                break;
        }
        return Unit.f46060a;
    }
}
