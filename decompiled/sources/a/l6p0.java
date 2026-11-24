package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class l6p0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ o6p0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l6p0(o6p0 o6p0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = o6p0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        o6p0 o6p0Var = this.k;
        switch (b) {
            case 0:
                l6p0 l6p0Var = new l6p0(o6p0Var, yjeVar, (byte) 0);
                l6p0Var.j = obj;
                return l6p0Var;
            default:
                l6p0 l6p0Var2 = new l6p0(o6p0Var, yjeVar, (byte) 1);
                l6p0Var2.j = obj;
                return l6p0Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((l6p0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((l6p0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.i;
        o6p0 o6p0Var = this.k;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                o6p0Var.r.b((Throwable) obj2, new ofo0((byte) 21));
                break;
            default:
                uaq0 uaq0Var = (uaq0) obj2;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                nc5 nc5VarS = o6p0Var.x.s(o6p0Var.p, o6p0Var.q, uaq0Var, 0L);
                p7m0 p7m0Var = o6p0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, z5p0.a((z5p0) value, null, nc5VarS, false, false, false, false, null, 251)));
                break;
        }
        return Unit.f46060a;
    }
}
