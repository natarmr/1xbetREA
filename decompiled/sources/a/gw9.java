package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class gw9 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ iw9 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gw9(iw9 iw9Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = iw9Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        iw9 iw9Var = this.k;
        switch (b) {
            case 0:
                return new gw9(iw9Var, yjeVar, (byte) 0);
            case 1:
                return new gw9(iw9Var, yjeVar, (byte) 1);
            default:
                return new gw9(iw9Var, yjeVar, (byte) 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        vne vneVar = (vne) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                ((gw9) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            case 1:
                ((gw9) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
                return wne.f39444a;
            default:
                return ((gw9) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        jnu0 jnu0Var;
        r9a r9aVar;
        Object objC;
        byte b = 1;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    iw9 iw9Var = this.k;
                    xae0 xae0Var = iw9Var.g.g;
                    fw9 fw9Var = new fw9(iw9Var, (byte) 0);
                    this.j = true;
                    if (xae0Var.f40549a.c(fw9Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                csj.b();
                return null;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    iw9 iw9Var2 = this.k;
                    vae0 vae0Var = iw9Var2.g.i;
                    fw9 fw9Var2 = new fw9(iw9Var2, b);
                    this.j = true;
                    if (vae0Var.f37082a.c(fw9Var2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                csj.b();
                return null;
            default:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    iw9 iw9Var3 = this.k;
                    this.j = true;
                    mie0 mie0Var = new mie0();
                    synchronized (iw9Var3.q) {
                        jnu0Var = iw9Var3.y;
                        r9aVar = iw9Var3.z;
                        mie0Var.f21842a = r9aVar;
                    }
                    if (jnu0Var == null || r9aVar == null || (objC = jnu0Var.i.c(new na(mie0Var, iw9Var3, (byte) 18), this)) != wneVar3) {
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
