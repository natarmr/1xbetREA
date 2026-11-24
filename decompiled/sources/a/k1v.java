package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class k1v extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ wdu m;
    public final /* synthetic */ int n;
    public final /* synthetic */ long o;
    public final /* synthetic */ hie0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1v(yje yjeVar, Function1 function1, wdu wduVar, int i, long j, hie0 hie0Var) {
        super(3, yjeVar);
        this.l = function1;
        this.m = wduVar;
        this.n = i;
        this.o = j;
        this.p = hie0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        k1v k1vVar = new k1v((yje) obj3, this.l, this.m, this.n, this.o, this.p);
        k1vVar.j = (kmq) obj;
        k1vVar.k = obj2;
        return k1vVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = this.j;
            jvn jvnVar = (jvn) this.k;
            long j = this.o;
            wdu wduVar = this.m;
            vsg0 vsg0VarH0 = bkb.h0(30L, TimeUnit.SECONDS, new h1v(wduVar, this.n, jvnVar, j, (yje) null));
            hie0 hie0Var = this.p;
            a1g a1gVar = new a1g(new qqu(vsg0VarH0, hie0Var, (byte) 11), new h0v(wduVar, null, (byte) 2), (byte) 20);
            xvu xvuVar = new xvu(hie0Var, (byte) 3);
            Function1 i1vVar = this.l;
            if (i1vVar == null) {
                i1vVar = new i1v(wduVar, null, (byte) 0);
            }
            a1g a1gVarP = uvw.P(a1gVar, xvuVar, 30L, i1vVar, new j1v(wduVar, null, (byte) 0), null, 40);
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
