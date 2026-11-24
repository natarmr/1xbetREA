package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class cu2 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public /* synthetic */ nv2 j;
    public final /* synthetic */ agk0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cu2(agk0 agk0Var, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.k = agk0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        nv2 nv2Var = (nv2) obj;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                cu2 cu2Var = new cu2(this.k, yjeVar, (byte) 0);
                cu2Var.j = nv2Var;
                return cu2Var.invokeSuspend(Unit.f46060a);
            case 1:
                cu2 cu2Var2 = new cu2(this.k, yjeVar, (byte) 1);
                cu2Var2.j = nv2Var;
                return cu2Var2.invokeSuspend(Unit.f46060a);
            case 2:
                cu2 cu2Var3 = new cu2(this.k, yjeVar, (byte) 2);
                cu2Var3.j = nv2Var;
                return cu2Var3.invokeSuspend(Unit.f46060a);
            default:
                cu2 cu2Var4 = new cu2(this.k, yjeVar, (byte) 3);
                cu2Var4.j = nv2Var;
                return cu2Var4.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        agk0 agk0Var = this.k;
        nv2 nv2Var = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                nv2Var.a(agk0Var.l(), 0.0f);
                break;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                nv2Var.a(agk0Var.l(), 0.0f);
                break;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                nv2Var.a(agk0Var.l(), 0.0f);
                break;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                nv2Var.a(agk0Var.l(), 0.0f);
                break;
        }
        return Unit.f46060a;
    }
}
