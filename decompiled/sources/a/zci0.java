package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class zci0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ ldi0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zci0(ldi0 ldi0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = ldi0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ldi0 ldi0Var = this.j;
        switch (b) {
            case 0:
                return new zci0(ldi0Var, yjeVar, (byte) 0);
            default:
                return new zci0(ldi0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((zci0) create((kbi0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((zci0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        p7m0 p7m0Var;
        List list;
        byte b = this.i;
        ldi0 ldi0Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var2 = ldi0Var.H;
                do {
                    value = p7m0Var2.getValue();
                    zie0 zie0Var = obk0.b;
                    p7m0Var = ldi0Var.G;
                    list = ((kbi0) p7m0Var.getValue()).b;
                    zie0Var.getClass();
                } while (!p7m0Var2.m(value, uci0.a((uci0) value, zie0.d(list), zie0.f(((kbi0) p7m0Var.getValue()).b), zie0.e(((kbi0) p7m0Var.getValue()).b), zie0.c(((kbi0) p7m0Var.getValue()).b), null, false, false, 4065)));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                c4m0 c4m0Var = ldi0Var.D;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    yje yjeVar = null;
                    ldi0Var.D = sac.T(new fnq(ldi0Var.u.b(), new yci0(ldi0Var, yjeVar, (byte) 5), (byte) 4), d5c.S(jiu0.a(ldi0Var), ldi0Var.e.f22085a), new bai0(ldi0Var, yjeVar, (byte) 3));
                }
                break;
        }
        return Unit.f46060a;
    }
}
