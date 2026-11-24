package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class mo90 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ no90 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mo90(no90 no90Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = no90Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        no90 no90Var = this.k;
        switch (b) {
            case 0:
                mo90 mo90Var = new mo90(no90Var, yjeVar, (byte) 0);
                mo90Var.j = obj;
                return mo90Var;
            default:
                mo90 mo90Var2 = new mo90(no90Var, yjeVar, (byte) 1);
                mo90Var2.j = obj;
                return mo90Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((mo90) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((mo90) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        no90 no90Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : (List) obj2) {
                    nq90 nq90Var = (nq90) obj3;
                    List list = no90Var.w.s1;
                    kq90 kq90Var = nq90Var instanceof kq90 ? (kq90) nq90Var : null;
                    if (!CollectionsKt.L(list, kq90Var != null ? kq90Var.g : null)) {
                        arrayList.add(obj3);
                    }
                }
                mo1 mo1Var = new mo1(arrayList, (byte) 3);
                int i = no90.y;
                no90Var.H(mo1Var);
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                no90Var.q.b((Throwable) obj2, new ch90((byte) 28));
                break;
        }
        return Unit.f46060a;
    }
}
