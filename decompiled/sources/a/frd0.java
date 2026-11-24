package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class frd0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ lrd0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ frd0(lrd0 lrd0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = lrd0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        lrd0 lrd0Var = this.k;
        switch (b) {
            case 0:
                frd0 frd0Var = new frd0(lrd0Var, yjeVar, (byte) 0);
                frd0Var.j = ((Boolean) obj).booleanValue();
                return frd0Var;
            case 1:
                return new frd0(lrd0Var, yjeVar, (byte) 1);
            default:
                return new frd0(lrd0Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((frd0) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((frd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((frd0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        lrd0 lrd0Var = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                if (z && (((yqd0) lrd0Var.D()).f43071a || ((yqd0) lrd0Var.D()).b)) {
                    bby bbyVar = lrd0Var.B;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    lrd0Var.B = sac.Z(jiu0.a(lrd0Var), ibc.w0(30L, bfn.SECONDS), lrd0Var.r.b, krd0.f18760a, new frd0(lrd0Var, yjeVar, (byte) 2));
                    lrd0Var.M(false);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bby bbyVar2 = lrd0Var.B;
                    if (bbyVar2 != null) {
                        this.j = true;
                        if (zvw.H(bbyVar2, this) == wneVar2) {
                            return wneVar2;
                        }
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    jwu jwuVar = lrd0Var.z;
                    String str = lrd0Var.o;
                    this.j = true;
                    if (jwuVar.b(str, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
