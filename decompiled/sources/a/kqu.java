package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class kqu extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ long m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kqu(long j, Object obj, yje yjeVar, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.n = obj;
        this.m = j;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.n;
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                kqu kquVar = new kqu(this.m, (f7u) obj4, yjeVar, (byte) 0);
                kquVar.k = kmqVar;
                kquVar.l = obj2;
                return kquVar.invokeSuspend(Unit.f46060a);
            default:
                kqu kquVar2 = new kqu(this.m, (f1v) obj4, yjeVar, (byte) 1);
                kquVar2.k = kmqVar;
                kquVar2.l = obj2;
                return kquVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object obj2 = this.n;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kmq kmqVar = this.k;
                    vsg0 vsg0VarH0 = bkb.h0(30L, timeUnit, new n1(obj2, this.l, this.m, (yje) null, (byte) 13));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, vsg0VarH0, this) == wneVar) {
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
                    vsg0 vsg0VarH1 = bkb.h0(30L, timeUnit, new upp((f1v) obj2, (jvn) this.l, this.m, (yje) null, (byte) 2));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, vsg0VarH1, this) == wneVar2) {
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
