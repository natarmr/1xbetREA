package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class h6k0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ k6k0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6k0(k6k0 k6k0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = k6k0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        k6k0 k6k0Var = this.k;
        switch (b) {
            case 0:
                return new h6k0(k6k0Var, yjeVar, (byte) 0);
            case 1:
                return new h6k0(k6k0Var, yjeVar, (byte) 1);
            case 2:
                return new h6k0(k6k0Var, yjeVar, (byte) 2);
            default:
                return new h6k0(k6k0Var, yjeVar, (byte) 3);
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
        return ((h6k0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        k6k0 k6k0Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    tn30 tn30Var = k6k0Var.g;
                    this.j = true;
                    if (tn30Var.e(this) == wneVar) {
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
                    lnq lnqVarZ = dtb.z(i120.W(k6k0Var.h.f29675a.b()), 1);
                    i6k0 i6k0Var = new i6k0(k6k0Var, (byte) 0);
                    this.j = true;
                    if (lnqVarZ.c(i6k0Var, this) == wneVar2) {
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
                    tn30 tn30Var2 = k6k0Var.g;
                    this.j = true;
                    if (tn30Var2.e(this) == wneVar3) {
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
                    tn30 tn30Var3 = k6k0Var.g;
                    this.j = true;
                    if (tn30Var3.e(this) == wneVar4) {
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
