package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class c1e extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ g1e k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1e(g1e g1eVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = g1eVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        g1e g1eVar = this.k;
        switch (b) {
            case 0:
                return new c1e(g1eVar, yjeVar, (byte) 0);
            case 1:
                return new c1e(g1eVar, yjeVar, (byte) 1);
            default:
                return new c1e(g1eVar, yjeVar, (byte) 2);
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
        return ((c1e) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.i;
        byte b2 = 2;
        g1e g1eVar = this.k;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    suk sukVar = g1eVar.m;
                    this.j = true;
                    if (sukVar.a() == wneVar) {
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
                    omi0 omi0VarN = g1eVar.l.n();
                    jz6 jz6Var = new jz6(g1eVar, b2);
                    this.j = true;
                    if (omi0VarN.c(jz6Var, this) == wneVar2) {
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
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    qgd qgdVar = g1eVar.o;
                    ckk0 ckk0Var = ckk0.f;
                    qgdVar.getClass();
                    vsg0 vsg0Var = new vsg0(new zm70((Object) qgdVar, (Object) ckk0Var, yjeVar, (byte) 8));
                    jtb jtbVar = new jtb(g1eVar, yjeVar, (byte) 15);
                    this.j = true;
                    Object objC = vsg0Var.c(new vnq(h660.f12515a, jtbVar, (byte) 2), this);
                    if (objC != wneVar3) {
                        objC = Unit.f46060a;
                    }
                    if (objC != wneVar3) {
                        objC = Unit.f46060a;
                    }
                    if (objC == wneVar3) {
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
