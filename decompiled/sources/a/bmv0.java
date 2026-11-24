package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class bmv0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ emv0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bmv0(emv0 emv0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = emv0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        emv0 emv0Var = this.k;
        switch (b) {
            case 0:
                bmv0 bmv0Var = new bmv0(emv0Var, yjeVar, (byte) 0);
                bmv0Var.j = obj;
                return bmv0Var;
            default:
                bmv0 bmv0Var2 = new bmv0(emv0Var, yjeVar, (byte) 1);
                bmv0Var2.j = obj;
                return bmv0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((bmv0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((bmv0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        emv0 emv0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                emv0Var.t.b((Throwable) obj2, new i9v0((byte) 8));
                break;
            default:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                nc5 nc5VarS = emv0Var.o.s(emv0Var.q, emv0Var.r, uaq0Var, 0L);
                p7m0 p7m0Var = emv0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, vlv0.a((vlv0) value, nc5VarS, false, false, false, null, null, null, null, null, null, 16375)));
                break;
        }
        return Unit.f46060a;
    }
}
