package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class pst extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ uii m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pst(yje yjeVar, uii uiiVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = uiiVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (this.i) {
            case 0:
                pst pstVar = new pst(yjeVar, this.m, (byte) 0);
                pstVar.k = kmqVar;
                pstVar.l = obj2;
                return pstVar.invokeSuspend(Unit.f46060a);
            default:
                pst pstVar2 = new pst(yjeVar, this.m, (byte) 1);
                pstVar2.k = kmqVar;
                pstVar2.l = obj2;
                return pstVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        uii uiiVar = this.m;
        yje yjeVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kmq kmqVar = this.k;
                    gmq eu4Var = !((Boolean) this.l).booleanValue() ? new eu4(nl6.f23712a, (byte) 12) : aoq.c(i120.W(((ik6) ((ocl) uiiVar.b).f25032a).f14910a.f13193a), new pst(yjeVar, uiiVar, b2));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, eu4Var, this) == wneVar) {
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
                    kmq kmqVar2 = this.k;
                    gmq eu4Var2 = !((Boolean) this.l).booleanValue() ? new eu4(ll6.f20231a, (byte) 12) : new p6d(((bl6) ((lsn) uiiVar.e).f20589a).f.f40929a, ((rbu) uiiVar.f).a(), new wx4(uiiVar, (yje) null, (byte) 14), (byte) 1);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, eu4Var2, this) == wneVar2) {
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
