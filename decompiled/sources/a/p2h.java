package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class p2h extends bnn0 implements xdr {
    public final /* synthetic */ byte i = 1;
    public boolean j;
    public final /* synthetic */ int k;
    public final /* synthetic */ List l;
    public final /* synthetic */ long m;
    public /* synthetic */ Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2h(CyberGamesPage cyberGamesPage, sip sipVar, List list, int i, long j, yje yjeVar) {
        super(3, yjeVar);
        this.o = cyberGamesPage;
        this.p = sipVar;
        this.l = list;
        this.k = i;
        this.m = j;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.i;
        Object obj4 = this.p;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                int i = this.k;
                long j = this.m;
                p2h p2hVar = new p2h((CyberGamesPage) this.o, (sip) obj4, this.l, i, j, (yje) obj3);
                p2hVar.n = (hhq0) obj;
                p2hVar.j = zBooleanValue;
                return p2hVar.invokeSuspend(Unit.f46060a);
            default:
                p2h p2hVar2 = new p2h((yje) obj3, (dgu) obj4, this.k, this.l, this.m);
                p2hVar2.n = (kmq) obj;
                p2hVar2.o = obj2;
                return p2hVar2.invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        byte b = this.i;
        Object obj2 = this.p;
        switch (b) {
            case 0:
                hhq0 hhq0Var = (hhq0) this.n;
                boolean z = this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                sip sipVar = (sip) obj2;
                return new kmb((CyberGamesPage) this.o, sipVar, this.l, hhq0Var, z && sipVar == sip.c, this.k, this.m);
            default:
                dgu dguVar = (dgu) obj2;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    kmq kmqVar = (kmq) this.n;
                    c3c0 c3c0Var = (c3c0) this.o;
                    z220 z220Var = (z220) dguVar.f6058a;
                    jvn jvnVarB = ((uzc) dguVar.b).b();
                    String strB0 = CollectionsKt.b0(this.l, Separators.COMMA, null, null, null, 62);
                    boolean zA = ((gst0) dguVar.c).a();
                    c3c0Var.getClass();
                    vsg0 vsg0VarR = gfx.R(((sjh) z220Var.d).f32303a, kpb.v(sip.c), null, new cc40(z220Var, jvnVarB, this.k, strB0, this.m, zA, c3c0Var, null), 252);
                    this.n = null;
                    this.o = null;
                    this.j = true;
                    if (slb.Q(kmqVar, vsg0VarR, this) == wneVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2h(yje yjeVar, dgu dguVar, int i, List list, long j) {
        super(3, yjeVar);
        this.p = dguVar;
        this.k = i;
        this.l = list;
        this.m = j;
    }
}
