package a;

import java.util.List;
import kotlin.Unit;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class r2h extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ kmq j;
    public /* synthetic */ Object k;
    public final /* synthetic */ o3c l;
    public final /* synthetic */ CyberGamesPage m;
    public final /* synthetic */ sip n;
    public final /* synthetic */ List o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2h(yje yjeVar, o3c o3cVar, CyberGamesPage cyberGamesPage, sip sipVar, List list, long j) {
        super(3, yjeVar);
        this.l = o3cVar;
        this.m = cyberGamesPage;
        this.n = sipVar;
        this.o = list;
        this.p = j;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        r2h r2hVar = new r2h((yje) obj3, this.l, this.m, this.n, this.o, this.p);
        r2hVar.j = (kmq) obj;
        r2hVar.k = obj2;
        return r2hVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object obj2 = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            kmq kmqVar = this.j;
            int iIntValue = ((Number) this.k).intValue();
            o3c o3cVar = this.l;
            p7m0 p7m0Var = ((cqc) o3cVar.e).f4786a.f4698a.f6413a;
            p7m0 p7m0Var2 = ((cog) ((bwl) o3cVar.f).f3330a).f4698a.b;
            p2h p2hVar = new p2h(this.m, this.n, this.o, iIntValue, this.p, null);
            this.j = null;
            this.k = null;
            this.i = true;
            f7k.J(kmqVar);
            Object objG = tdc.G(this, kmqVar, new kh1((Object) p2hVar, (yje) null, (byte) 9), pul.j, new gmq[]{p7m0Var, p7m0Var2});
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
