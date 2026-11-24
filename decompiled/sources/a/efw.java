package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class efw extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ hfw k;
    public final /* synthetic */ m0k0 l;
    public final /* synthetic */ zxj0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ efw(hfw hfwVar, m0k0 m0k0Var, zxj0 zxj0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = hfwVar;
        this.l = m0k0Var;
        this.m = zxj0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new efw(this.k, this.l, this.m, yjeVar, (byte) 0);
            case 1:
                return new efw(this.k, this.l, this.m, yjeVar, (byte) 1);
            default:
                return new efw(this.k, this.l, this.m, yjeVar, (byte) 2);
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
        }
        return ((efw) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        zxj0 zxj0Var = this.m;
        hfw hfwVar = this.k;
        m0k0 m0k0Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    cr crVar = hfwVar.A;
                    gwe gweVar = gwe.CYBER;
                    this.j = true;
                    obj = crVar.b(m0k0Var, zxj0Var, gweVar, hrs.f13547a, this);
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
                hew hewVar = new hew((aud) obj, m0k0Var.z, String.valueOf(m0k0Var.Y));
                int i = hfw.J;
                hfwVar.G(hewVar);
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    gud gudVar = hfwVar.z;
                    gwe gweVar2 = gwe.CYBER;
                    this.j = true;
                    obj = gud.f(gudVar, m0k0Var, zxj0Var, gweVar2, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                hew hewVar2 = new hew((aud) obj, m0k0Var.z, String.valueOf(m0k0Var.Y));
                int i2 = hfw.J;
                hfwVar.G(hewVar2);
                return Unit.f46060a;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    xzp xzpVar = hfwVar.B;
                    gwe gweVar3 = gwe.CYBER;
                    this.j = true;
                    obj = xzpVar.N(m0k0Var, zxj0Var, gweVar3, this);
                    if (obj == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                hew hewVar3 = new hew((vtd) obj, m0k0Var.z, String.valueOf(m0k0Var.Y));
                int i3 = hfw.J;
                hfwVar.G(hewVar3);
                return Unit.f46060a;
        }
    }
}
