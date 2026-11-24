package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class vd60 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public final /* synthetic */ ufk0 k;
    public final /* synthetic */ ywv0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vd60(ufk0 ufk0Var, ywv0 ywv0Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = ufk0Var;
        this.l = ywv0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                return new vd60(this.k, this.l, yjeVar, (byte) 0);
            default:
                return new vd60(this.k, this.l, yjeVar, (byte) 1);
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
        return ((vd60) create(vneVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ufk0 ufk0Var = this.k;
        ywv0 ywv0Var = this.l;
        byte b2 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    i89 i89Var = new i89(ydx.V(ufk0Var, new td60(ywv0Var, (byte) 0)), (byte) 22);
                    ud60 ud60Var = new ud60(ywv0Var, yjeVar, (byte) 0);
                    this.j = true;
                    if (slb.O(i89Var, ud60Var, this) == wneVar) {
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
            default:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    lnq lnqVarZ = dtb.z(ydx.V(ufk0Var, new td60(ywv0Var, (byte) 2)), 1);
                    ud60 ud60Var2 = new ud60(ywv0Var, yjeVar, b2);
                    this.j = true;
                    if (slb.O(lnqVarZ, ud60Var2, this) == wneVar2) {
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
        }
    }
}
