package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class hxe0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ cqq l;
    public final /* synthetic */ wpq m;
    public final /* synthetic */ pz40 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hxe0(boolean z, cqq cqqVar, wpq wpqVar, pz40 pz40Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = z;
        this.l = cqqVar;
        this.m = wpqVar;
        this.n = pz40Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new hxe0(this.k, this.l, this.m, this.n, yjeVar, (byte) 0);
            default:
                return new hxe0(this.k, this.l, this.m, this.n, yjeVar, (byte) 1);
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
        return ((hxe0) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        pz40 pz40Var = this.n;
        wpq wpqVar = this.m;
        cqq cqqVar = this.l;
        boolean z = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    wk30 wk30Var = new wk30(i120.W(ydx.V(null, new kg2((byte) 7, z))), (byte) 27);
                    exe0 exe0Var = new exe0(cqqVar, wpqVar, pz40Var, (byte) 0);
                    this.j = true;
                    if (wk30Var.c(exe0Var, this) == wneVar) {
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
            default:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    qaf0 qaf0Var = new qaf0(i120.W(ydx.V(null, new kg2((byte) 7, z))), (byte) 0);
                    exe0 exe0Var2 = new exe0(cqqVar, wpqVar, pz40Var, (byte) 1);
                    this.j = true;
                    if (qaf0Var.c(exe0Var2, this) == wneVar2) {
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
        }
    }
}
