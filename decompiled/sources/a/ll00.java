package a;

import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class ll00 extends bnn0 implements xdr {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ kmq k;
    public /* synthetic */ Object l;
    public final /* synthetic */ j700 m;
    public final /* synthetic */ int n;
    public final /* synthetic */ List o;
    public final /* synthetic */ List p;
    public final /* synthetic */ Set q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ long s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Integer u;
    public final /* synthetic */ Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ll00(yje yjeVar, j700 j700Var, Object obj, int i, List list, List list2, Set set, boolean z, long j, boolean z2, Integer num, byte b) {
        super(3, yjeVar);
        this.i = b;
        this.m = j700Var;
        this.v = obj;
        this.n = i;
        this.o = list;
        this.p = list2;
        this.q = set;
        this.r = z;
        this.s = j;
        this.t = z2;
        this.u = num;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.v;
        switch (b) {
            case 0:
                ll00 ll00Var = new ll00((yje) obj3, this.m, (nvu) obj4, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (byte) 0);
                ll00Var.k = (kmq) obj;
                ll00Var.l = obj2;
                return ll00Var.invokeSuspend(Unit.f46060a);
            default:
                ll00 ll00Var2 = new ll00((yje) obj3, this.m, (y3v) obj4, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (byte) 1);
                ll00Var2.k = (kmq) obj;
                ll00Var2.l = obj2;
                return ll00Var2.invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        byte b = this.i;
        Object obj2 = this.v;
        j700 j700Var = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    kmq kmqVar = this.k;
                    if (((Boolean) this.l).booleanValue()) {
                        z = true;
                    } else {
                        j700Var.getClass();
                        if (j700Var == j700.c) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    vsg0 vsg0Var = new vsg0(new gl00(this.t, (nvu) obj2, this.o, this.n, this.m, this.p, this.r, this.s, z, this.u, this.q, null, (byte) 0));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar, vsg0Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    kmq kmqVar2 = this.k;
                    if (((Boolean) this.l).booleanValue()) {
                        z2 = true;
                    } else {
                        j700Var.getClass();
                        if (j700Var == j700.c) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    vsg0 vsg0Var2 = new vsg0(new gl00(this.t, (y3v) obj2, this.o, this.n, this.m, this.p, this.r, this.s, z2, this.u, this.q, null, (byte) 1));
                    this.k = null;
                    this.l = null;
                    this.j = true;
                    if (slb.Q(kmqVar2, vsg0Var2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
        }
    }
}
