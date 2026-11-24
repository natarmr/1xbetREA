package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class wvu extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ pwi l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Integer n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ hie0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvu(yje yjeVar, pwi pwiVar, int i, Integer num, boolean z, boolean z2, boolean z3, hie0 hie0Var) {
        super(3, yjeVar);
        this.l = pwiVar;
        this.m = i;
        this.n = num;
        this.o = z;
        this.p = z2;
        this.q = z3;
        this.r = hie0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        wvu wvuVar = new wvu((yje) obj3, this.l, this.m, this.n, this.o, this.p, this.q, this.r);
        wvuVar.j = (kmq) obj;
        wvuVar.k = obj2;
        return wvuVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        kmq kmqVar = this.j;
        Object obj2 = this.k;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        yje yjeVar = null;
        if (!z) {
            z1x.P(obj);
            jvn jvnVar = (jvn) obj2;
            pwi pwiVar = this.l;
            a6u a6uVar = (a6u) pwiVar.b;
            jvnVar.getClass();
            a1g a1gVarI0 = ebc.i0(bkb.h0(30L, TimeUnit.SECONDS, new zvu(a6uVar, this.m, this.n, jvnVar, this.o, this.p, null)), 30L, new umu((byte) 4), new jcs(a6uVar, (byte) 25));
            hie0 hie0Var = this.r;
            dnq dnqVar = new dnq(new a1g(a1gVarI0, new yvu(pwiVar, new xvu(hie0Var, (byte) 0), new u5u((Object) pwiVar, yjeVar, (byte) 6), this.q, null), (byte) 20), new ko0((Object) pwiVar, yjeVar, (byte) 21), (byte) 1);
            fns fnsVar = new fns((Object) hie0Var, (Object) pwiVar, yjeVar, (byte) 23);
            this.j = null;
            this.k = null;
            this.i = true;
            f7k.J(kmqVar);
            Object objC = dnqVar.c(new vnq(kmqVar, fnsVar, (byte) 2), this);
            if (objC != wneVar) {
                objC = Unit.f46060a;
            }
            if (objC != wneVar) {
                objC = Unit.f46060a;
            }
            if (objC == wneVar) {
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
    }
}
