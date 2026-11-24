package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.api.virtualgamescategories.VirtualGameCategoryParams;

/* JADX INFO: loaded from: classes4.dex */
public final class bqu0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dqu0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bqu0(dqu0 dqu0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dqu0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dqu0 dqu0Var = this.k;
        switch (b) {
            case 0:
                bqu0 bqu0Var = new bqu0(dqu0Var, yjeVar, (byte) 0);
                bqu0Var.j = ((j0g0) obj).f15681a;
                return bqu0Var;
            default:
                bqu0 bqu0Var2 = new bqu0(dqu0Var, yjeVar, (byte) 1);
                bqu0Var2.j = obj;
                return bqu0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                j0g0 j0g0Var = (j0g0) obj;
                Object obj3 = j0g0Var.f15681a;
                return ((bqu0) create(j0g0Var, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((bqu0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        j0g0 j0g0Var;
        VirtualGameCategoryParams virtualGameCategoryParams;
        sff0 sff0Var;
        List list;
        boolean z;
        boolean z2;
        boolean z3;
        byte b = this.i;
        dqu0 dqu0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int i = dqu0.D;
                p7m0 p7m0Var = dqu0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    upu0 upu0Var = (upu0) value;
                    j0g0Var = new j0g0(obj2);
                    virtualGameCategoryParams = upu0Var.f36085a;
                    sff0Var = upu0Var.b;
                    list = upu0Var.d;
                    z = upu0Var.e;
                    z2 = upu0Var.f;
                    z3 = upu0Var.g;
                    list.getClass();
                } while (!p7m0Var.m(value, new upu0(virtualGameCategoryParams, sff0Var, j0g0Var, list, z, z2, z3)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                qjj.W((vne) obj2, null, null, new aqu0(dqu0Var, null, (byte) 1), 3);
                break;
        }
        return Unit.f46060a;
    }
}
