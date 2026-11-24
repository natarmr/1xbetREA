package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class qkf0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ rkf0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qkf0(rkf0 rkf0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rkf0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rkf0 rkf0Var = this.k;
        switch (b) {
            case 0:
                return new qkf0(rkf0Var, yjeVar, (byte) 0);
            default:
                return new qkf0(rkf0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws ri9 {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                ((qkf0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            default:
                return ((qkf0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws ri9 {
        byte b = this.i;
        rkf0 rkf0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    long jA = rkf0Var.a();
                    this.j = true;
                    if (qcc.P(jA, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                rkf0Var.d.a();
                throw new ri9();
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    long jA2 = rkf0Var.a();
                    this.j = true;
                    if (qcc.P(jA2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                rkf0Var.d.a();
                return Unit.f46060a;
        }
    }
}
