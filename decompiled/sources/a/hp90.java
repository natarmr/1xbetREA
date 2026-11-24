package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class hp90 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ kp90 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp90(kp90 kp90Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = kp90Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kp90 kp90Var = this.k;
        switch (b) {
            case 0:
                hp90 hp90Var = new hp90(kp90Var, yjeVar, (byte) 0);
                hp90Var.j = obj;
                return hp90Var;
            default:
                hp90 hp90Var2 = new hp90(kp90Var, yjeVar, (byte) 1);
                hp90Var2.j = obj;
                return hp90Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((hp90) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((hp90) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        kp90 kp90Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    nq90 nq90Var = (nq90) obj3;
                    List list = kp90Var.y.s1;
                    kq90 kq90Var = nq90Var instanceof kq90 ? (kq90) nq90Var : null;
                    if (!CollectionsKt.L(list, kq90Var != null ? kq90Var.g : null)) {
                        arrayList.add(obj3);
                    }
                }
                int i = kp90.z;
                p7m0 p7m0Var = kp90Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, br90.a((br90) value, null, null, arrayList, false, 47)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                kp90Var.q.b((Throwable) obj2, new so90((byte) 1));
                break;
        }
        return Unit.f46060a;
    }
}
