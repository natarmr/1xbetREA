package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class n4m extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ rah0 k;
    public final /* synthetic */ pz40 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n4m(rah0 rah0Var, pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = rah0Var;
        this.l = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        pz40 pz40Var = this.l;
        rah0 rah0Var = this.k;
        switch (b) {
            case 0:
                return new n4m(rah0Var, pz40Var, yjeVar, (byte) 0);
            default:
                return new n4m(rah0Var, pz40Var, yjeVar, (byte) 1);
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
        return ((n4m) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        byte b = this.i;
        rah0 rah0Var = this.k;
        pz40 pz40Var = this.l;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return Unit.f46060a;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                qoj0 qoj0Var = rah0Var.e.f12108a;
                yy0 yy0Var = new yy0(pz40Var, (byte) 7);
                this.j = true;
                qoj0Var.c(yy0Var, this);
                return wneVar;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    if (((tly) pz40Var.getValue()).f34169a) {
                        int iL = rah0Var.f.l();
                        this.j = true;
                        if (rah0Var.f(iL, new nul0(null, 7), this) == wneVar2) {
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
        }
    }
}
