package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class y1v extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ rrd m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ int o;
    public final /* synthetic */ hie0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1v(yje yjeVar, Function1 function1, rrd rrdVar, boolean z, int i, hie0 hie0Var) {
        super(3, yjeVar);
        this.l = function1;
        this.m = rrdVar;
        this.n = z;
        this.o = i;
        this.p = hie0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        y1v y1vVar = new y1v((yje) obj3, this.l, this.m, this.n, this.o, this.p);
        y1vVar.j = (kmq) obj;
        y1vVar.k = obj2;
        return y1vVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = this.j;
            jvn jvnVar = (jvn) this.k;
            int i = this.o;
            rrd rrdVar = this.m;
            vsg0 vsg0VarH0 = bkb.h0(8L, TimeUnit.SECONDS, new eae(rrdVar, this.n, i, jvnVar, (yje) null));
            hie0 hie0Var = this.p;
            a1g a1gVar = new a1g(new qqu(vsg0VarH0, hie0Var, (byte) 12), new h0v(rrdVar, null, (byte) 3), (byte) 20);
            xvu xvuVar = new xvu(hie0Var, (byte) 4);
            Function1 x1vVar = this.l;
            if (x1vVar == null) {
                x1vVar = new x1v(rrdVar, null, (byte) 0);
            }
            a1g a1gVarP = uvw.P(a1gVar, xvuVar, 8L, x1vVar, new j1v(rrdVar, null, (byte) 1), null, 40);
            this.j = null;
            this.k = null;
            this.i = true;
            f7k.J(kmqVar);
            Object objC = a1gVarP.c(new uap(kmqVar, (byte) 12), this);
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
