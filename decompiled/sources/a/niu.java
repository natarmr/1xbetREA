package a;

import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.presentation.EsportsGamesScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class niu extends bnn0 implements xdr {
    public boolean i;
    public /* synthetic */ hhq0 j;
    public /* synthetic */ boolean k;
    public final /* synthetic */ ywq0 l;
    public final /* synthetic */ EsportsGamesScreenParams m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public niu(ywq0 ywq0Var, EsportsGamesScreenParams esportsGamesScreenParams, yje yjeVar) {
        super(3, yjeVar);
        this.l = ywq0Var;
        this.m = esportsGamesScreenParams;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        niu niuVar = new niu(this.l, this.m, (yje) obj3);
        niuVar.j = (hhq0) obj;
        niuVar.k = zBooleanValue;
        return niuVar.invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        or30 or30Var;
        hhq0 hhq0Var = this.j;
        boolean z = this.k;
        wne wneVar = wne.f39444a;
        boolean z2 = this.i;
        ywq0 ywq0Var = this.l;
        EsportsGamesScreenParams esportsGamesScreenParams = this.m;
        if (!z2) {
            z1x.P(obj);
            rtu rtuVar = (rtu) ywq0Var.b;
            boolean c = esportsGamesScreenParams.getC();
            this.j = hhq0Var;
            this.k = z;
            this.i = true;
            objA = rtuVar.a(c, 0, this);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (!z2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objA = obj;
        }
        c3c0 c3c0Var = (c3c0) objA;
        if (!esportsGamesScreenParams.getC()) {
            z = false;
        }
        if (esportsGamesScreenParams instanceof EsportsGamesScreenParams.BestGames) {
            khf0 khf0Var = (khf0) ywq0Var.f;
            EsportsGamesScreenParams.BestGames bestGames = (EsportsGamesScreenParams.BestGames) esportsGamesScreenParams;
            CyberGamesPage cyberGamesPageD = org.xplatform.cyber.section.api.domain.entity.d.d(bestGames.f46561a);
            bek bekVar = sip.f32274a;
            boolean z3 = bestGames.b;
            bekVar.getClass();
            sip sipVarF = bek.f(z3);
            c3c0Var.getClass();
            sb6 sb6Var = (sb6) khf0Var.b;
            jvn jvnVarB = ((uzc) khf0Var.c).b();
            boolean zA = ((gst0) khf0Var.d).a();
            lnf0 lnf0VarD = sb6Var.f31917a.d();
            jo20 jo20Var = new jo20();
            qbt.a(jo20Var, jvnVarB);
            qbt.d(jo20Var, c3c0Var.f3668a, zA);
            qbt.g(lnf0VarD.b, jo20Var);
            qbt.h(jo20Var);
            qbt.i(jo20Var, z);
            qbt.j(lnf0VarD.f20342a, jo20Var);
            qbt.l(jo20Var);
            qbt.o(jo20Var, c3c0Var.b, c3c0Var.c);
            qbt.p(jo20Var);
            return new ak9(gfx.R(sb6Var.b.h(cyberGamesPageD, sipVarF), kpb.v(sipVarF), new o85((byte) 23), new rb6(sb6Var, sipVarF, jo20Var.b(), cyberGamesPageD, null), 60), (byte) 2);
        }
        if (esportsGamesScreenParams instanceof EsportsGamesScreenParams.ChampsGames) {
            edu eduVar = (edu) ywq0Var.e;
            EsportsGamesScreenParams.ChampsGames champsGames = (EsportsGamesScreenParams.ChampsGames) esportsGamesScreenParams;
            Set setP0 = CollectionsKt.P0(champsGames.c);
            bek bekVar2 = sip.f32274a;
            boolean z4 = champsGames.b;
            bekVar2.getClass();
            return new zj2(eduVar.h(setP0, bek.f(z4), c3c0Var, z), ywq0Var, hhq0Var, (byte) 12);
        }
        if (!(esportsGamesScreenParams instanceof EsportsGamesScreenParams.SportGames)) {
            t9f.b();
            return null;
        }
        EsportsGamesScreenParams.SportGames sportGames = (EsportsGamesScreenParams.SportGames) esportsGamesScreenParams;
        int i = sportGames.d;
        long j = i == CyberGamesPage.Real.INSTANCE.f46556a ? sportGames.b : sportGames.f46563a;
        u8u u8uVar = (u8u) ywq0Var.d;
        bek bekVar3 = sip.f32274a;
        boolean z5 = sportGames.c;
        bekVar3.getClass();
        sip sipVarF2 = bek.f(z5);
        CyberGamesPage cyberGamesPageD2 = org.xplatform.cyber.section.api.domain.entity.d.d(i);
        long j2 = hhq0Var.b;
        long j3 = hhq0Var.c;
        ygq0 ygq0Var = hhq0Var.f13078a;
        c3c0Var.getClass();
        ygq0Var.getClass();
        phf0 phf0Var = (phf0) u8uVar.c;
        jvn jvnVarB2 = ((uzc) u8uVar.b).b();
        int i2 = c3c0Var.f3668a;
        lnf0 lnf0VarD2 = ((knf0) phf0Var.c).d();
        jo20 jo20Var2 = new jo20();
        qbt.a(jo20Var2, jvnVarB2);
        qbt.c(i2, jo20Var2);
        if (j2 != -1 && j3 != -1 && ygq0Var == ygq0.CUSTOM_DATE) {
            jo20Var2.put("dateFrom", Long.valueOf(j2 / 1000));
            jo20Var2.put("dateTo", Long.valueOf(j3 / 1000));
        }
        qbt.g(lnf0VarD2.b, jo20Var2);
        qbt.h(jo20Var2);
        qbt.i(jo20Var2, z);
        qbt.j(lnf0VarD2.f20342a, jo20Var2);
        qbt.e(jo20Var2, ygq0Var);
        qbt.l(jo20Var2);
        qbt.m(jo20Var2, cyberGamesPageD2, j);
        qbt.o(jo20Var2, c3c0Var.b, c3c0Var.c);
        qbt.p(jo20Var2);
        jo20 jo20VarB = jo20Var2.b();
        c5k c5kVar = (c5k) phf0Var.b;
        int iOrdinal = sipVarF2.ordinal();
        if (iOrdinal == 0) {
            or30Var = (or30) c5kVar.b;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            or30Var = (or30) c5kVar.f3775a;
        }
        return gfx.R(or30Var, kpb.v(sipVarF2), null, new bm4(phf0Var, sipVarF2, cyberGamesPageD2, jo20VarB, null, (byte) 3), 252);
    }
}
