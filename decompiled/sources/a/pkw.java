package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;

/* JADX INFO: loaded from: classes4.dex */
public final class pkw extends bnn0 implements Function1 {
    public boolean i;
    public final /* synthetic */ ukw j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkw(ukw ukwVar, yje yjeVar) {
        super(1, yjeVar);
        this.j = ukwVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new pkw(this.j, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((pkw) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ms2 rq2Var;
        r1g r1gVar;
        String str;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            int i = ukw.X;
            ukw ukwVar = this.j;
            if (((zjw) ukwVar.D()).f) {
                rq2Var = ukwVar.o.b instanceof CyberGamesParentSectionModel.FromPopular ? new fr2() : new jr2();
            } else {
                rq2Var = new rq2();
            }
            hjd hjdVar = ukwVar.v;
            if (!((zjw) ukwVar.D()).f) {
                CyberGamesPage cyberGamesPage = ((zjw) ukwVar.D()).g.f7971a;
                if (cyberGamesPage != null) {
                    if (cyberGamesPage instanceof CyberGamesPage.Real) {
                        r1gVar = r1g.CYBERSPORT_REAL;
                    } else if (cyberGamesPage instanceof CyberGamesPage.Virtual) {
                        r1gVar = r1g.CYBERSPORT_VIRTUAL;
                    } else if (cyberGamesPage instanceof CyberGamesPage.OneXCyber) {
                        r1gVar = r1g.CYBER;
                    }
                    str = r1gVar.f29679a;
                }
                t9f.b();
                return null;
            }
            str = "popular_new_esports";
            cid cidVar = new cid(str, rq2Var);
            this.i = true;
            hjdVar.getClass();
            if (hjdVar.a(cidVar, this) == wneVar) {
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
