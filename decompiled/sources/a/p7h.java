package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class p7h extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ a8h m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p7h(byte b, yje yjeVar, a8h a8hVar) {
        super(3, yjeVar);
        this.i = b;
        this.m = a8hVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        a8h a8hVar = this.m;
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj3;
        switch (b) {
            case 0:
                p7h p7hVar = new p7h((byte) 0, yjeVar, a8hVar);
                p7hVar.k = kmqVar;
                p7hVar.l = obj2;
                return p7hVar.invokeSuspend(Unit.f46060a);
            default:
                p7h p7hVar2 = new p7h((byte) 1, yjeVar, a8hVar);
                p7hVar2.k = kmqVar;
                p7hVar2.l = obj2;
                return p7hVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        a8h a8hVar = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    kmq kmqVar = this.k;
                    long jLongValue = ((Number) this.l).longValue();
                    t7h t7hVar = new t7h(i120.W(new rno(a8hVar.x.f28994a.f13403a.c, jLongValue, (byte) 0)), jLongValue, (byte) 0);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, t7hVar, this) == wneVar) {
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
                    long jLongValue2 = ((Number) this.l).longValue();
                    t7h t7hVar2 = new t7h(new rno(a8hVar.w.f35365a.f13403a.b, jLongValue2, (byte) 1), jLongValue2, (byte) 1);
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, t7hVar2, this) == wneVar2) {
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
