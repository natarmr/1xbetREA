package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class avh extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ dvh k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ avh(dvh dvhVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = dvhVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        dvh dvhVar = this.k;
        switch (b) {
            case 0:
                avh avhVar = new avh(dvhVar, yjeVar, (byte) 0);
                avhVar.j = obj;
                return avhVar;
            default:
                avh avhVar2 = new avh(dvhVar, yjeVar, (byte) 1);
                avhVar2.j = obj;
                return avhVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((avh) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((avh) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        dvh dvhVar = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                dvhVar.t.b((Throwable) obj2, new zuh((byte) 0));
                break;
            default:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                nc5 nc5VarS = dvhVar.o.s(dvhVar.q, dvhVar.r, uaq0Var, 0L);
                p7m0 p7m0Var = dvhVar.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, ruh.a((ruh) value, nc5VarS, false, false, false, null, null, null, null, null, null, 8187)));
                break;
        }
        return Unit.f46060a;
    }
}
