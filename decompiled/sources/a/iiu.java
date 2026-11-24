package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class iiu extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ ywq0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iiu(byte b, yje yjeVar, ywq0 ywq0Var) {
        super(3, yjeVar);
        this.i = b;
        this.m = ywq0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        ywq0 ywq0Var = this.m;
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                iiu iiuVar = new iiu((byte) 0, yjeVar, ywq0Var);
                iiuVar.k = kmqVar;
                iiuVar.l = obj2;
                return iiuVar.invokeSuspend(Unit.f46060a);
            default:
                iiu iiuVar2 = new iiu((byte) 1, yjeVar, ywq0Var);
                iiuVar2.k = kmqVar;
                iiuVar2.l = obj2;
                return iiuVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        ywq0 ywq0Var = this.m;
        byte b2 = 1;
        yje yjeVar = null;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kmq kmqVar = this.k;
                    utb utbVarC = aoq.c((gmq) this.l, new iiu(b2, yjeVar, ywq0Var));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, utbVarC, this) == wneVar) {
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
                n0o0 n0o0Var = (n0o0) ywq0Var.g;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    kmq kmqVar2 = this.k;
                    acu acuVarK = ((v7i) ywq0Var.c).k((List) this.l, ((sff0) n0o0Var.getValue()).J1, ((sff0) n0o0Var.getValue()).O1);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, acuVarK, this) == wneVar2) {
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
