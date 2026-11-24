package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.support.feature.result.CommonConstant;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t4s0 implements pjt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t4s0 f33337a;
    private static final ugi0 descriptor;

    static {
        t4s0 t4s0Var = new t4s0();
        f33337a = t4s0Var;
        zna0 zna0Var = new zna0("org.xplatform.aggregator.impl.tournaments.data.models.TournamentResponse", t4s0Var, 14);
        zna0Var.j("blockHeader", true);
        zna0Var.j("blockImage", true);
        zna0Var.j("blockGame", true);
        zna0Var.j("blockPrize", true);
        zna0Var.j("blockProduct", true);
        zna0Var.j("blockRule", true);
        zna0Var.j("blockRuleStage", true);
        zna0Var.j("blockFullRule", true);
        zna0Var.j("blockStage", true);
        zna0Var.j(ParameterNames.ID, true);
        zna0Var.j("kind", true);
        zna0Var.j("providerTournamentWithStages", true);
        zna0Var.j(CommonConstant.KEY_STATUS, true);
        zna0Var.j(Payload.TYPE, true);
        descriptor = zna0Var;
    }

    @Override // a.pjt
    public final jiy[] childSerializers() {
        jiy jiyVarJ0 = mrv.j0(k88.f17862a);
        jiy jiyVarJ1 = mrv.j0(n88.f23077a);
        jiy jiyVarJ2 = mrv.j0(e88.f7361a);
        jiy jiyVarJ3 = mrv.j0(x88.f40451a);
        jiy jiyVarJ4 = mrv.j0(a98.f464a);
        jiy jiyVarJ5 = mrv.j0(l98.f19638a);
        jiy jiyVarJ6 = mrv.j0(p98.f26595a);
        jiy jiyVarJ7 = mrv.j0(a88.f413a);
        jiy jiyVarJ8 = mrv.j0(t98.f33549a);
        jiy jiyVarJ9 = mrv.j0(s710.f31729a);
        okx okxVar = okx.f25427a;
        return new jiy[]{jiyVarJ0, jiyVarJ1, jiyVarJ2, jiyVarJ3, jiyVarJ4, jiyVarJ5, jiyVarJ6, jiyVarJ7, jiyVarJ8, jiyVarJ9, mrv.j0(okxVar), mrv.j0(sm8.f32432a), mrv.j0(okxVar), mrv.j0(okxVar)};
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        m88 m88Var;
        ugi0 ugi0Var = descriptor;
        bld bldVarA = rkjVar.a(ugi0Var);
        Boolean bool = null;
        Integer num = null;
        Long l = null;
        Integer num2 = null;
        v98 v98Var = null;
        int i = 0;
        Integer num3 = null;
        p88 p88Var = null;
        g88 g88Var = null;
        z88 z88Var = null;
        c98 c98Var = null;
        n98 n98Var = null;
        r98 r98Var = null;
        c88 c88Var = null;
        boolean z = true;
        m88 m88Var2 = null;
        while (z) {
            int iF = bldVarA.f(ugi0Var);
            switch (iF) {
                case -1:
                    m88Var = m88Var2;
                    z = false;
                    num = num;
                    g88Var = g88Var;
                    m88Var2 = m88Var;
                    bool = bool;
                    break;
                case 0:
                    m88Var = (m88) bldVarA.e(ugi0Var, 0, k88.f17862a, m88Var2);
                    i |= 1;
                    p88Var = p88Var;
                    num = num;
                    g88Var = g88Var;
                    m88Var2 = m88Var;
                    bool = bool;
                    break;
                case 1:
                    bool = bool;
                    p88Var = (p88) bldVarA.e(ugi0Var, 1, n88.f23077a, p88Var);
                    i |= 2;
                    g88Var = g88Var;
                    bool = bool;
                    break;
                case 2:
                    bool = bool;
                    g88Var = (g88) bldVarA.e(ugi0Var, 2, e88.f7361a, g88Var);
                    i |= 4;
                    p88Var = p88Var;
                    bool = bool;
                    break;
                case 3:
                    z88Var = (z88) bldVarA.e(ugi0Var, 3, x88.f40451a, z88Var);
                    i |= 8;
                    p88Var = p88Var;
                    g88Var = g88Var;
                    break;
                case 4:
                    c98Var = (c98) bldVarA.e(ugi0Var, 4, a98.f464a, c98Var);
                    i |= 16;
                    p88Var = p88Var;
                    g88Var = g88Var;
                    break;
                case 5:
                    n98Var = (n98) bldVarA.e(ugi0Var, 5, l98.f19638a, n98Var);
                    i |= 32;
                    p88Var = p88Var;
                    g88Var = g88Var;
                    break;
                case 6:
                    r98Var = (r98) bldVarA.e(ugi0Var, 6, p98.f26595a, r98Var);
                    i |= 64;
                    p88Var = p88Var;
                    g88Var = g88Var;
                    break;
                case 7:
                    c88Var = (c88) bldVarA.e(ugi0Var, 7, a88.f413a, c88Var);
                    i |= 128;
                    p88Var = p88Var;
                    g88Var = g88Var;
                    break;
                case 8:
                    v98Var = (v98) bldVarA.e(ugi0Var, 8, t98.f33549a, v98Var);
                    i |= 256;
                    p88Var = p88Var;
                    g88Var = g88Var;
                    break;
                case 9:
                    l = (Long) bldVarA.e(ugi0Var, 9, s710.f31729a, l);
                    i |= 512;
                    p88Var = p88Var;
                    g88Var = g88Var;
                    break;
                case 10:
                    num = (Integer) bldVarA.e(ugi0Var, 10, okx.f25427a, num);
                    i |= 1024;
                    p88Var = p88Var;
                    g88Var = g88Var;
                    break;
                case 11:
                    bool = (Boolean) bldVarA.e(ugi0Var, 11, sm8.f32432a, bool);
                    i |= 2048;
                    p88Var = p88Var;
                    g88Var = g88Var;
                    break;
                case 12:
                    num2 = (Integer) bldVarA.e(ugi0Var, 12, okx.f25427a, num2);
                    i |= 4096;
                    p88Var = p88Var;
                    g88Var = g88Var;
                    break;
                case 13:
                    num3 = (Integer) bldVarA.e(ugi0Var, 13, okx.f25427a, num3);
                    i |= 8192;
                    p88Var = p88Var;
                    g88Var = g88Var;
                    break;
                default:
                    itt0.c(iF);
                    return null;
            }
        }
        Boolean bool2 = bool;
        m88 m88Var3 = m88Var2;
        bldVarA.c(ugi0Var);
        return new d5s0(i, m88Var3, p88Var, g88Var, z88Var, c98Var, n98Var, r98Var, c88Var, v98Var, l, num, bool2, num2, num3);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return descriptor;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        d5s0 d5s0Var = (d5s0) obj;
        d5s0Var.getClass();
        Integer num = d5s0Var.n;
        Integer num2 = d5s0Var.m;
        Boolean bool = d5s0Var.l;
        Integer num3 = d5s0Var.k;
        Long l = d5s0Var.j;
        v98 v98Var = d5s0Var.i;
        c88 c88Var = d5s0Var.h;
        r98 r98Var = d5s0Var.g;
        n98 n98Var = d5s0Var.f;
        c98 c98Var = d5s0Var.e;
        z88 z88Var = d5s0Var.d;
        g88 g88Var = d5s0Var.c;
        p88 p88Var = d5s0Var.b;
        m88 m88Var = d5s0Var.f5523a;
        ugi0 ugi0Var = descriptor;
        cld cldVarA = bwnVar.a(ugi0Var);
        if (cldVarA.u(ugi0Var) || m88Var != null) {
            cldVarA.p(ugi0Var, 0, k88.f17862a, m88Var);
        }
        if (cldVarA.u(ugi0Var) || p88Var != null) {
            cldVarA.p(ugi0Var, 1, n88.f23077a, p88Var);
        }
        if (cldVarA.u(ugi0Var) || g88Var != null) {
            cldVarA.p(ugi0Var, 2, e88.f7361a, g88Var);
        }
        if (cldVarA.u(ugi0Var) || z88Var != null) {
            cldVarA.p(ugi0Var, 3, x88.f40451a, z88Var);
        }
        if (cldVarA.u(ugi0Var) || c98Var != null) {
            cldVarA.p(ugi0Var, 4, a98.f464a, c98Var);
        }
        if (cldVarA.u(ugi0Var) || n98Var != null) {
            cldVarA.p(ugi0Var, 5, l98.f19638a, n98Var);
        }
        if (cldVarA.u(ugi0Var) || r98Var != null) {
            cldVarA.p(ugi0Var, 6, p98.f26595a, r98Var);
        }
        if (cldVarA.u(ugi0Var) || c88Var != null) {
            cldVarA.p(ugi0Var, 7, a88.f413a, c88Var);
        }
        if (cldVarA.u(ugi0Var) || v98Var != null) {
            cldVarA.p(ugi0Var, 8, t98.f33549a, v98Var);
        }
        if (cldVarA.u(ugi0Var) || l != null) {
            cldVarA.p(ugi0Var, 9, s710.f31729a, l);
        }
        if (cldVarA.u(ugi0Var) || num3 != null) {
            cldVarA.p(ugi0Var, 10, okx.f25427a, num3);
        }
        if (cldVarA.u(ugi0Var) || bool != null) {
            cldVarA.p(ugi0Var, 11, sm8.f32432a, bool);
        }
        if (cldVarA.u(ugi0Var) || num2 != 0) {
            cldVarA.p(ugi0Var, 12, okx.f25427a, num2);
        }
        if (cldVarA.u(ugi0Var) || num != 0) {
            cldVarA.p(ugi0Var, 13, okx.f25427a, num);
        }
        cldVarA.c(ugi0Var);
    }
}
