package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class kp70 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ sp70 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kp70(sp70 sp70Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = sp70Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        sp70 sp70Var = this.k;
        switch (b) {
            case 0:
                return new kp70(sp70Var, yjeVar, (byte) 0);
            case 1:
                return new kp70(sp70Var, yjeVar, (byte) 1);
            default:
                kp70 kp70Var = new kp70(sp70Var, yjeVar, (byte) 2);
                kp70Var.j = ((Boolean) obj).booleanValue();
                return kp70Var;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((kp70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((kp70) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((kp70) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        sp70 sp70Var = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    fpx fpxVar = sp70Var.v;
                    long jA = sp70Var.I.f42064a.a();
                    this.j = true;
                    obj = fpxVar.a(jA, this);
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
                sp70Var.u.a(((Boolean) obj).booleanValue());
                p7m0 p7m0Var = sp70Var.R;
                Boolean bool = Boolean.TRUE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    a1g a1gVarF0 = dub.f0(sp70Var.P, sp70Var.Q, sp70Var.R, new pp70(sp70Var, null));
                    this.j = true;
                    if (slb.N(a1gVarF0, this) == wneVar2) {
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
            default:
                boolean z3 = this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (z3) {
                    sp70Var.y(sp70Var.r.a() == vrs.b);
                } else {
                    sp70Var.y(true);
                }
                return Unit.f46060a;
        }
    }
}
