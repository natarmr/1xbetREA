package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.game.universal.api.EsportsUniversalScreenParams;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class y6o extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ b7o j;
    public final /* synthetic */ hdb k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6o(b7o b7oVar, hdb hdbVar, yje yjeVar) {
        super(2, yjeVar);
        this.j = b7oVar;
        this.k = hdbVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new y6o(this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y6o) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objB;
        CyberGamesPage cyberGamesPage;
        char c;
        m9s m9sVar;
        b7o b7oVar = this.j;
        EsportsUniversalScreenParams esportsUniversalScreenParams = b7oVar.p;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            j3c j3cVar = b7oVar.G;
            long j = esportsUniversalScreenParams.d;
            this.i = true;
            objB = j3cVar.b(j, this);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objB = obj;
        }
        boolean zBooleanValue = ((Boolean) objB).booleanValue();
        EsportsUniversalScreenParams esportsUniversalScreenParams2 = b7oVar.p;
        long j2 = esportsUniversalScreenParams2.d;
        if (j2 == 40) {
            cyberGamesPage = CyberGamesPage.Real.INSTANCE;
        } else {
            cyberGamesPage = zBooleanValue ? CyberGamesPage.Virtual.INSTANCE : CyberGamesPage.OneXCyber.INSTANCE;
        }
        CyberGamesPage cyberGamesPage2 = cyberGamesPage;
        z0s z0sVar = b7oVar.x;
        long j3 = esportsUniversalScreenParams2.e;
        long j4 = esportsUniversalScreenParams2.j;
        sff0 sff0Var = ((l6o) b7oVar.D()).p;
        List list = ((l6o) b7oVar.D()).q;
        ypl0 ypl0Var = ((l6o) b7oVar.D()).e;
        int i = esportsUniversalScreenParams.k;
        boolean z2 = esportsUniversalScreenParams.b;
        String str = esportsUniversalScreenParams.i;
        if (str.length() == 0) {
            jlr jlrVar = ((l6o) b7oVar.D()).c;
            c = 1;
            xkr xkrVar = jlrVar instanceof xkr ? (xkr) jlrVar : null;
            str = (xkrVar == null || (m9sVar = xkrVar.d) == null) ? null : m9sVar.f;
            if (str == null) {
                str = "";
            }
        } else {
            c = 1;
        }
        String str2 = str;
        jlr jlrVar2 = ((l6o) b7oVar.D()).c;
        xkr xkrVar2 = jlrVar2 instanceof xkr ? (xkr) jlrVar2 : null;
        m9s m9sVar2 = xkrVar2 != null ? xkrVar2.d : null;
        hdb[] hdbVarArr = new hdb[2];
        hdbVarArr[0] = new ddb(i, j2, j3, j4, m9sVar2, sff0Var, ypl0Var, str2, list, cyberGamesPage2, z2);
        hdbVarArr[c] = this.k;
        i3t0.B(b7oVar, z0sVar, hdbVarArr);
        return Unit.f46060a;
    }
}
