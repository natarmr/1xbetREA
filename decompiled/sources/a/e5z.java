package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class e5z extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ a6u l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ byte o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e5z(yje yjeVar, a6u a6uVar, boolean z, boolean z2, int i, long j, long j2, boolean z3, long j3) {
        super(3, yjeVar);
        this.l = a6uVar;
        this.m = z;
        this.n = z2;
        this.o = i;
        this.p = j;
        this.q = j2;
        this.r = z3;
        this.s = j3;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        e5z e5zVar = new e5z((yje) obj3, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
        e5zVar.j = (kmq) obj;
        e5zVar.k = obj2;
        return e5zVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        gmq eu4Var;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = this.j;
            l4z l4zVar = (l4z) this.k;
            if (l4zVar != null) {
                boolean z2 = l4zVar instanceof i4z;
                byte b = this.o;
                boolean z3 = this.n;
                boolean z4 = this.m;
                a6u a6uVar = this.l;
                if (z2) {
                    i4z i4zVar = (i4z) l4zVar;
                    vsg0 vsg0VarH = nkb.H(30L, i2o.LineGameFinished, new djx((byte) 25), new y2x(i4zVar, (byte) 25), new q4z((abu) a6uVar.b, i4zVar, z4, z3, b, null, (byte) 0));
                    long j = this.p;
                    eu4Var = new dnq(new j5z(vsg0VarH, j, (byte) 0), new g5z(this.l, this.q, this.r, this.s, j, null, (byte) 0), (byte) 1);
                } else if (l4zVar instanceof j4z) {
                    gxu gxuVar = (gxu) a6uVar.c;
                    j4z j4zVar = (j4z) l4zVar;
                    vsg0 vsg0VarH2 = nkb.H(8L, i2o.LiveGameFinished, new adw(gxuVar, (byte) 26), new wqv(gxuVar, j4zVar, (byte) 27), new q4z(gxuVar, j4zVar, z4, z3, b, null, (byte) 1));
                    long j2 = this.p;
                    eu4Var = new dnq(new j5z(vsg0VarH2, j2, (byte) 1), new g5z(this.l, this.q, this.r, this.s, j2, null, (byte) 1), (byte) 1);
                } else if (l4zVar instanceof k4z) {
                    eu4Var = new eu4(null, (byte) 12);
                }
                this.j = null;
                this.k = null;
                this.i = true;
                if (slb.Q(kmqVar, eu4Var, this) == wneVar) {
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
