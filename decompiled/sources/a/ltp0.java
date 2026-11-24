package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class ltp0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ rtp0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ltp0(rtp0 rtp0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rtp0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        rtp0 rtp0Var = this.k;
        switch (b) {
            case 0:
                return new ltp0(rtp0Var, yjeVar, (byte) 0);
            case 1:
                return new ltp0(rtp0Var, yjeVar, (byte) 1);
            case 2:
                ltp0 ltp0Var = new ltp0(rtp0Var, yjeVar, (byte) 2);
                ltp0Var.j = ((Boolean) obj).booleanValue();
                return ltp0Var;
            default:
                return new ltp0(rtp0Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ltp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ltp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((ltp0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ltp0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        boolean z = true;
        rtp0 rtp0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    jwu jwuVar = rtp0Var.v;
                    String str = rtp0Var.E;
                    this.j = true;
                    if (jwuVar.b(str, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    jwu jwuVar2 = rtp0Var.v;
                    String str2 = rtp0Var.E;
                    this.j = true;
                    if (jwuVar2.b(str2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                boolean z4 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                boolean z5 = !z4 && ((gsp0) rtp0Var.D()).e;
                if (!z4 || (!((gsp0) rtp0Var.D()).f && !((gsp0) rtp0Var.D()).g)) {
                    z = false;
                }
                if (z5 || z) {
                    int i = rtp0.N;
                    rtp0Var.P();
                }
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    bby bbyVar = rtp0Var.J;
                    if (bbyVar != null) {
                        this.j = true;
                        if (zvw.H(bbyVar, this) == wneVar4) {
                            return wneVar4;
                        }
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                rtp0Var.J = null;
                return Unit.f46060a;
        }
    }
}
