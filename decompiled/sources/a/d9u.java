package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class d9u extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ali l;
    public final /* synthetic */ List m;
    public final /* synthetic */ long n;
    public final /* synthetic */ int o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9u(yje yjeVar, ali aliVar, List list, long j, int i, boolean z, boolean z2) {
        super(3, yjeVar);
        this.l = aliVar;
        this.m = list;
        this.n = j;
        this.o = i;
        this.p = z;
        this.q = z2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        d9u d9uVar = new d9u((yje) obj3, this.l, this.m, this.n, this.o, this.p, this.q);
        d9uVar.j = (kmq) obj;
        d9uVar.k = obj2;
        return d9uVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object obj2 = wne.f39444a;
        boolean z = this.i;
        yje yjeVar = null;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = this.j;
            jvn jvnVar = (jvn) this.k;
            ali aliVar = this.l;
            vsg0 vsg0Var = new vsg0(new c9u(true, aliVar, this.o, this.m, jvnVar, this.n, this.p, this.q, null));
            vsg0 vsg0Var2 = new vsg0(new c9u(false, aliVar, this.o, this.m, jvnVar, this.n, this.p, this.q, null));
            e9u e9uVar = e9u.h;
            this.j = null;
            this.k = null;
            this.i = true;
            f7k.J(kmqVar);
            Object objG = tdc.G(this, kmqVar, new kh1((Object) e9uVar, yjeVar, (byte) 9), pul.j, new gmq[]{vsg0Var, vsg0Var2});
            if (objG != wne.f39444a) {
                objG = Unit.f46060a;
            }
            if (objG != wne.f39444a) {
                objG = Unit.f46060a;
            }
            if (objG == obj2) {
                return obj2;
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
