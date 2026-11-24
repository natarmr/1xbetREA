package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class pcr0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ scr0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pcr0(scr0 scr0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = scr0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        scr0 scr0Var = this.k;
        switch (b) {
            case 0:
                pcr0 pcr0Var = new pcr0(scr0Var, yjeVar, (byte) 0);
                pcr0Var.j = obj;
                return pcr0Var;
            default:
                pcr0 pcr0Var2 = new pcr0(scr0Var, yjeVar, (byte) 1);
                pcr0Var2.j = obj;
                return pcr0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((pcr0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((pcr0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        scr0 scr0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                scr0Var.r.b((Throwable) obj2, new shq0((byte) 21));
                break;
            default:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                nc5 nc5VarS = scr0Var.x.s(scr0Var.o, scr0Var.p, uaq0Var, 0L);
                p7m0 p7m0Var = scr0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, gcr0.a((gcr0) value, null, null, nc5VarS, false, false, false, false, null, 251)));
                break;
        }
        return Unit.f46060a;
    }
}
