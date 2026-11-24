package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class e2c0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ org.xplatform.personal.impl.presentation.edit.n j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2c0(org.xplatform.personal.impl.presentation.edit.n nVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = nVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        org.xplatform.personal.impl.presentation.edit.n nVar = this.j;
        switch (b) {
            case 0:
                return new e2c0(nVar, yjeVar, (byte) 0);
            default:
                return new e2c0(nVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((e2c0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((e2c0) create((kmq) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var = this.j.s;
                do {
                    value = p7m0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!p7m0Var.m(value, Boolean.FALSE));
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                sdj sdjVar = org.xplatform.personal.impl.presentation.edit.n.v;
                org.xplatform.personal.impl.presentation.edit.n nVar = this.j;
                sac.V(jiu0.a(nVar), new e9b0(1, nVar, org.xplatform.personal.impl.presentation.edit.n.class, "handleLoadDataError", "handleLoadDataError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, nVar.k.b, new org.xplatform.personal.impl.presentation.edit.j(nVar, null), 10);
                break;
        }
        return Unit.f46060a;
    }
}
