package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class kpn extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ mpn k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpn(mpn mpnVar, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = mpnVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        mpn mpnVar = this.k;
        switch (b) {
            case 0:
                return new kpn(mpnVar, yjeVar, (byte) 0);
            default:
                return new kpn(mpnVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
        }
        return ((kpn) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        byte b = this.i;
        mpn mpnVar = this.k;
        switch (b) {
            case 0:
                m1e m1eVar = mpnVar.B;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    gmq gmqVarB = m1eVar.b();
                    this.j = true;
                    obj = ntb.K(gmqVarB, this);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    int i = mpn.K;
                    mpnVar.M();
                    p7m0 p7m0Var = mpnVar.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        mpnVar.f.getClass();
                    } while (!p7m0Var.m(value, ipn.a((ipn) value, lon.f20401a)));
                }
                int i2 = mpn.K;
                c4m0 c4m0Var = mpnVar.I;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                mpnVar.I = i3t0.L(mpnVar, new fnq(m1eVar.b(), new hij(mpnVar, null, (byte) 8), (byte) 4), null, null, 3);
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(300L, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i3 = mpn.K;
                p7m0 p7m0Var2 = mpnVar.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, ipn.a((ipn) value2, non.f23875a)));
                return Unit.f46060a;
        }
    }
}
