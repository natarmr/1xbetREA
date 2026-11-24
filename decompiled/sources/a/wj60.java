package a;

import android.javax.sip.message.Response;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class wj60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ lge0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj60(lge0 lge0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = lge0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        lge0 lge0Var = this.k;
        switch (b) {
            case 0:
                return new wj60(lge0Var, yjeVar, (byte) 0);
            case 1:
                return new wj60(lge0Var, yjeVar, (byte) 1);
            case 2:
                return new wj60(lge0Var, yjeVar, (byte) 2);
            default:
                return new wj60(lge0Var, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((wj60) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        lge0 lge0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    if (lge0Var.a(this) == wneVar) {
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
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    t33 t33Var = lge0Var.b;
                    ne60 ne60Var = new ne60(lge0Var.f20005a.g());
                    uts0 uts0VarM0 = ro4.m0(Response.BUSY_EVERYWHERE, 0, hhn.f13072a, 2);
                    this.j = true;
                    if (t33.a(t33Var, ne60Var, uts0VarM0, null, null, this, 12) == wneVar2) {
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
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    t33 t33Var2 = lge0Var.c;
                    h7k0 h7k0Var = new h7k0(lge0Var.f20005a.f());
                    uts0 uts0VarM1 = ro4.m0(Response.BUSY_EVERYWHERE, 0, hhn.f13072a, 2);
                    this.j = true;
                    if (t33.a(t33Var2, h7k0Var, uts0VarM1, null, null, this, 12) == wneVar3) {
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
            default:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    t33 t33Var3 = lge0Var.d;
                    ycl yclVar = new ycl(lge0Var.e);
                    uts0 uts0VarM2 = ro4.m0(Response.BUSY_EVERYWHERE, 0, hhn.f13072a, 2);
                    this.j = true;
                    if (t33.a(t33Var3, yclVar, uts0VarM2, null, null, this, 12) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
