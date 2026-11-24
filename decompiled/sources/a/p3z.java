package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class p3z extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ tzi l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ byte o;
    public final /* synthetic */ u3z p;
    public final /* synthetic */ Long q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p3z(yje yjeVar, tzi tziVar, boolean z, boolean z2, int i, u3z u3zVar, Long l) {
        super(3, yjeVar);
        this.l = tziVar;
        this.m = z;
        this.n = z2;
        this.o = i;
        this.p = u3zVar;
        this.q = l;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        p3z p3zVar = new p3z((yje) obj3, this.l, this.m, this.n, this.o, this.p, this.q);
        p3zVar.j = (kmq) obj;
        p3zVar.k = obj2;
        return p3zVar.invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r4v2, types: [a.kmq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ?? r4;
        gmq fnqVar;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = this.j;
            l4z l4zVar = (l4z) this.k;
            if (l4zVar != null) {
                boolean z2 = l4zVar instanceof i4z;
                Long l = this.q;
                u3z u3zVar = this.p;
                byte b = this.o;
                boolean z3 = this.n;
                boolean z4 = this.m;
                tzi tziVar = this.l;
                if (z2) {
                    i4z i4zVar = (i4z) l4zVar;
                    yje yjeVar = null;
                    r4 = 0;
                    fnqVar = new dnq(new fnq(nkb.H(30L, i2o.LineGameFinished, new djx((byte) 25), new y2x(i4zVar, (byte) 25), new q4z((abu) tziVar.b, i4zVar, z4, z3, b, null, (byte) 0)), new r3z(tziVar, l4zVar, yjeVar, (byte) 0), (byte) 4), new s3z(tziVar, u3zVar, l, yjeVar, (byte) 0), (byte) 1);
                } else {
                    r4 = 0;
                    r4 = 0;
                    byte b2 = 27;
                    byte b3 = 26;
                    if (l4zVar instanceof j4z) {
                        gxu gxuVar = (gxu) tziVar.c;
                        j4z j4zVar = (j4z) l4zVar;
                        fnqVar = new dnq(new fnq(nkb.H(8L, i2o.LiveGameFinished, new adw(gxuVar, b3), new wqv(gxuVar, j4zVar, (byte) 27), new q4z(gxuVar, j4zVar, z4, z3, b, null, (byte) 1)), new r3z(tziVar, l4zVar, r4, (byte) 1), (byte) 4), new s3z(tziVar, u3zVar, l, r4, (byte) 1), (byte) 1);
                    } else if (l4zVar instanceof k4z) {
                        onv onvVar = (onv) tziVar.d;
                        k4z k4zVar = (k4z) l4zVar;
                        fnqVar = new fnq(new vsg0(new lqs(new ffd(onvVar, k4zVar, r4, (byte) 16), new adw(k4zVar, b2), new y2x(k4zVar, (byte) 26), new djx((byte) 26), null)), new r3z(tziVar, l4zVar, r4, (byte) 2), (byte) 4);
                    }
                }
                this.j = r4;
                this.k = r4;
                this.i = true;
                if (slb.Q(kmqVar, fnqVar, this) == wneVar) {
                    return wneVar;
                }
            }
            t9f.b();
            return null;
        }
        if (!z) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        return Unit.f46060a;
    }
}
