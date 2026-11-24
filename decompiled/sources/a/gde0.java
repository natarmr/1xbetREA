package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gde0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ hde0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gde0(hde0 hde0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hde0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        hde0 hde0Var = this.k;
        switch (b) {
            case 0:
                return new gde0(hde0Var, yjeVar, (byte) 0);
            default:
                return new gde0(hde0Var, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((gde0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        hde0 hde0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    p7m0 p7m0Var = hde0Var.j;
                    Boolean bool = Boolean.TRUE;
                    p7m0Var.getClass();
                    p7m0Var.o(null, bool);
                    zbe0 zbe0Var = zbe0.c;
                    this.j = true;
                    if (hde0Var.x(zbe0Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    p7m0 p7m0Var2 = hde0Var.j;
                    Boolean bool2 = Boolean.TRUE;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, bool2);
                    zbe0 zbe0Var2 = zbe0.c;
                    this.j = true;
                    if (hde0Var.x(zbe0Var2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
