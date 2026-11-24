package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.Request;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes3.dex */
public final class mxk0 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ nxk0 j;
    public final /* synthetic */ RealInterceptorChain k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxk0(nxk0 nxk0Var, RealInterceptorChain realInterceptorChain, yje yjeVar) {
        super(2, yjeVar);
        this.j = nxk0Var;
        this.k = realInterceptorChain;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new mxk0(this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mxk0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (z) {
            if (z) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        wdu wduVar = this.j.f24287a;
        Request request = this.k.e;
        this.i = true;
        owp0 owp0Var = (owp0) wduVar.b;
        ((n4u) wduVar.g).e();
        ((knf0) ((yk50) ((hru) wduVar.h).f13549a).b).getClass();
        ((aqt) wduVar.e).a();
        long jB = ((viu) wduVar.c).f37499a.b();
        String strA = ((knf0) ((db9) wduVar.i).f5792a.b).a();
        ((yfu) wduVar.j).j();
        Object objF = owp0Var.f(request, 1357, 22, "org.xbet.client1", jB, strA, 1, ((knf0) ((nr00) ((x4u) wduVar.d).f40284a).f23980a).b(), ((us3) ((peg0) ((cmt) wduVar.f).b).b).c().toString(), this);
        return objF == wneVar ? wneVar : objF;
    }
}
