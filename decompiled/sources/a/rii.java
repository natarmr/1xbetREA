package a;

import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import org.xplatform.aggregator.loyalty_program.api.navigation.models.LoyaltyProgramScreenParams;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes3.dex */
public final class rii implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30544a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rii(Object obj, int i, byte b) {
        this.f30544a = b;
        this.c = obj;
        this.b = i;
    }

    private final Object a() {
        lki lkiVar = (lki) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new i6i(this, (byte) 7);
            case 1:
                sek sekVar = lkiVar.b;
                s7t0 s7t0Var = (s7t0) lkiVar.D.get();
                pbt pbtVarL2 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL2);
                return i5t.r(sekVar, s7t0Var, pbtVarL2);
            case 2:
                sek sekVar2 = lkiVar.b;
                g8i g8iVar = lkiVar.f20204a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                d3c d3cVar = (d3c) lkiVar.e.get();
                fq fqVar = (fq) lkiVar.x.get();
                qpt qptVar = (qpt) lkiVar.y.get();
                gmt gmtVar = (gmt) lkiVar.j.get();
                rgs rgsVar = (rgs) lkiVar.C.get();
                r9u r9uVarH4 = g8iVar.h4();
                x1x.x(r9uVarH4);
                return i5t.C(sekVar2, pbtVarL3, d3cVar, fqVar, qptVar, gmtVar, rgsVar, r9uVarH4);
            case 3:
                sek sekVar3 = lkiVar.b;
                pbt pbtVarL4 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL4);
                return new d3c(pbtVarL4);
            case 4:
                sek sekVar4 = lkiVar.b;
                lzt lztVar = (lzt) lkiVar.f.get();
                zmi0 zmi0Var = (zmi0) lkiVar.g.get();
                pbt pbtVarL5 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL5);
                return mkg.g(sekVar4, lztVar, zmi0Var, pbtVarL5, (xyb) lkiVar.h.get(), (yyb) lkiVar.l.get(), (fpi0) lkiVar.m.get(), (nqt) lkiVar.n.get(), (spx) lkiVar.o.get(), (oqt) lkiVar.p.get(), (hni0) lkiVar.q.get(), (vcu) lkiVar.r.get(), (d3c) lkiVar.e.get(), (wni0) lkiVar.s.get(), (ztt) lkiVar.k.get(), (pqt) lkiVar.t.get(), (itt) lkiVar.u.get(), (q78) lkiVar.v.get(), (gmt) lkiVar.j.get(), (ecs) lkiVar.w.get());
            case 5:
                sek sekVar5 = lkiVar.b;
                g8i g8iVar2 = lkiVar.f20204a;
                pbt pbtVarL6 = g8iVar2.L2();
                x1x.x(pbtVarL6);
                m1e m1eVarQ1 = g8iVar2.q1();
                x1x.x(m1eVarQ1);
                return new lzt(pbtVarL6, m1eVarQ1);
            case 6:
                sek sekVar6 = lkiVar.b;
                pbt pbtVarL7 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL7);
                return new zmi0(pbtVarL7);
            case 7:
                sek sekVar7 = lkiVar.b;
                pbt pbtVarL8 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL8);
                return new xyb(pbtVarL8);
            case 8:
                sek sekVar8 = lkiVar.b;
                k1u k1uVar = (k1u) lkiVar.i.get();
                gmt gmtVar2 = (gmt) lkiVar.j.get();
                ztt zttVar = (ztt) lkiVar.k.get();
                pbt pbtVarL9 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL9);
                return i5t.a(sekVar8, k1uVar, gmtVar2, zttVar, pbtVarL9);
            case 9:
                sek sekVar9 = lkiVar.b;
                return new k1u(lkiVar.b());
            case 10:
                sek sekVar10 = lkiVar.b;
                pbt pbtVarL10 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL10);
                return new gmt(pbtVarL10);
            case 11:
                sek sekVar11 = lkiVar.b;
                pbt pbtVarL11 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL11);
                return new ztt(pbtVarL11);
            case 12:
                sek sekVar12 = lkiVar.b;
                pbt pbtVarL12 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL12);
                return new fpi0(pbtVarL12);
            case 13:
                sek sekVar13 = lkiVar.b;
                pbt pbtVarL13 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL13);
                return new nqt(pbtVarL13);
            case 14:
                sek sekVar14 = lkiVar.b;
                pbt pbtVarL14 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL14);
                return new spx(pbtVarL14);
            case 15:
                sek sekVar15 = lkiVar.b;
                pbt pbtVarL15 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL15);
                return new oqt(pbtVarL15);
            case 16:
                sek sekVar16 = lkiVar.b;
                pbt pbtVarL16 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL16);
                return new hni0(pbtVarL16);
            case 17:
                sek sekVar17 = lkiVar.b;
                pbt pbtVarL17 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL17);
                return new vcu(pbtVarL17);
            case 18:
                sek sekVar18 = lkiVar.b;
                pbt pbtVarL18 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL18);
                return new wni0(pbtVarL18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar19 = lkiVar.b;
                pbt pbtVarL19 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL19);
                return new pqt(pbtVarL19);
            case 20:
                sek sekVar20 = lkiVar.b;
                pbt pbtVarL20 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL20);
                return new itt(pbtVarL20);
            case 21:
                sek sekVar21 = lkiVar.b;
                pbt pbtVarL21 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL21);
                return new q78(pbtVarL21);
            case 22:
                sek sekVar22 = lkiVar.b;
                pbt pbtVarL22 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL22);
                return new ecs(pbtVarL22);
            case 23:
                sek sekVar23 = lkiVar.b;
                pbt pbtVarL23 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL23);
                return new qpt(pbtVarL23);
            case 24:
                sek sekVar24 = lkiVar.b;
                fq fqVar2 = (fq) lkiVar.x.get();
                fqx fqxVar = (fqx) lkiVar.z.get();
                wox woxVar = (wox) lkiVar.A.get();
                return i5t.g(fqVar2, sekVar24, (qpt) lkiVar.y.get(), (r8u) lkiVar.B.get(), woxVar, fqxVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar25 = lkiVar.b;
                pbt pbtVarL24 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL24);
                return new fqx(pbtVarL24);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar26 = lkiVar.b;
                pbt pbtVarL25 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL25);
                return new wox(pbtVarL25);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar27 = lkiVar.b;
                pbt pbtVarL26 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL26);
                return new r8u(pbtVarL26);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                sek sekVar28 = lkiVar.b;
                pbt pbtVarL27 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL27);
                return new qa60(pbtVarL27);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar29 = lkiVar.b;
                pbt pbtVarL28 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL28);
                return new ipi0(pbtVarL28);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                sek sekVar30 = lkiVar.b;
                pbt pbtVarL29 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL29);
                return new xsi0(pbtVarL29);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                sek sekVar31 = lkiVar.b;
                pbt pbtVarL30 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL30);
                return new gpx(pbtVarL30);
            case 32:
                sek sekVar32 = lkiVar.b;
                pbt pbtVarL31 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL31);
                return new vni0(pbtVarL31);
            case 33:
                sek sekVar33 = lkiVar.b;
                pbt pbtVarL32 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL32);
                return new hs(pbtVarL32);
            case 34:
                sek sekVar34 = lkiVar.b;
                pbt pbtVarL33 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL33);
                return new eni0(pbtVarL33);
            case 35:
                return i5t.z(lkiVar.b, (aws) lkiVar.M.get());
            case 36:
                sek sekVar35 = lkiVar.b;
                yvs yvsVarG2 = lkiVar.f20204a.G2();
                x1x.x(yvsVarG2);
                return new aws(yvsVarG2);
            case 37:
                sek sekVar36 = lkiVar.b;
                pbt pbtVarL34 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL34);
                return new hj50(pbtVarL34);
            case 38:
                sek sekVar37 = lkiVar.b;
                pbt pbtVarL35 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL35);
                return new qhf0(pbtVarL35);
            case 39:
                return i5t.d(lkiVar.b, (foi0) lkiVar.Q.get(), (fq) lkiVar.x.get());
            case 40:
                sek sekVar38 = lkiVar.b;
                pbt pbtVarL36 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL36);
                return new foi0(pbtVarL36);
            case 41:
                sek sekVar39 = lkiVar.b;
                fq fqVar3 = (fq) lkiVar.x.get();
                r8u r8uVar = (r8u) lkiVar.B.get();
                return i5t.B(fqVar3, sekVar39, (qpt) lkiVar.y.get(), r8uVar, (wox) lkiVar.A.get(), (fqx) lkiVar.z.get());
            case 42:
                evz evzVar = lkiVar.c;
                return new y5s(s470.LUCKY_CARD, false, false, false, false, false, 384);
            case 43:
                return i5t.b(lkiVar.b, (fq) lkiVar.x.get(), (fqx) lkiVar.z.get());
            case 44:
                return i5t.c(lkiVar.b, (aws) lkiVar.M.get());
            case 45:
                sek sekVar40 = lkiVar.b;
                pbt pbtVarL37 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL37);
                return new hsj0(pbtVarL37);
            case 46:
                sek sekVar41 = lkiVar.b;
                g8i g8iVar3 = lkiVar.f20204a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL38 = g8iVar3.L2();
                x1x.x(pbtVarL38);
                return new t0u(pbtVarL38, wsf0VarF0);
            case 47:
                sek sekVar42 = lkiVar.b;
                pbt pbtVarL39 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL39);
                return new tbu(pbtVarL39);
            case 48:
                return i5t.f(lkiVar.b, (a6s) lkiVar.Z.get());
            case 49:
                return i5t.e(lkiVar.b);
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                n5d0 n5d0Var = lkiVar.F;
                g8i g8iVar4 = lkiVar.f20204a;
                qa60 qa60Var = (qa60) n5d0Var.get();
                fq fqVar4 = (fq) lkiVar.x.get();
                mne mneVarV1 = g8iVar4.v1();
                lzt lztVar2 = (lzt) lkiVar.f.get();
                xcc xccVar = (xcc) lkiVar.U.get();
                i5m0 i5m0Var = (i5m0) lkiVar.f0.get();
                vju vjuVar = (vju) lkiVar.i0.get();
                ztt zttVar2 = (ztt) lkiVar.k.get();
                fpi0 fpi0Var = (fpi0) lkiVar.m.get();
                spx spxVar = (spx) lkiVar.o.get();
                oqt oqtVar = (oqt) lkiVar.p.get();
                vcu vcuVar = (vcu) lkiVar.r.get();
                m1e m1eVarQ2 = g8iVar4.q1();
                x1x.x(m1eVarQ2);
                return new uj10(qa60Var, fqVar4, mneVarV1, lztVar2, xccVar, i5m0Var, vjuVar, zttVar2, fpi0Var, spxVar, oqtVar, vcuVar, m1eVarQ2);
            case 51:
                return i5t.A(lkiVar.b, (fq) lkiVar.x.get(), lkiVar.f20204a.f0(), (g9c) lkiVar.c0.get(), (itt) lkiVar.u.get(), (yyb) lkiVar.l.get(), (lg60) lkiVar.e0.get());
            case 52:
                sek sekVar43 = lkiVar.b;
                pbt pbtVarL40 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL40);
                return new g9c(pbtVarL40);
            case 53:
                sek sekVar44 = lkiVar.b;
                qni0 qni0Var = (qni0) lkiVar.d0.get();
                pbt pbtVarL41 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL41);
                return i5t.v(sekVar44, qni0Var, pbtVarL41);
            case 54:
                sek sekVar45 = lkiVar.b;
                pbt pbtVarL42 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL42);
                return new qni0(pbtVarL42);
            case 55:
                evz evzVar2 = lkiVar.c;
                yj10 yj10Var = (yj10) lkiVar.h0.get();
                ztt zttVar3 = (ztt) lkiVar.k.get();
                itt ittVar = (itt) lkiVar.u.get();
                gmt gmtVar3 = (gmt) lkiVar.j.get();
                yj10Var.getClass();
                zttVar3.getClass();
                ittVar.getClass();
                gmtVar3.getClass();
                return new vju(yj10Var, zttVar3, ittVar, gmtVar3);
            case 56:
                evz evzVar3 = lkiVar.c;
                g8i g8iVar5 = lkiVar.f20204a;
                knf0 knf0VarJ8 = g8iVar5.J8();
                x1x.x(knf0VarJ8);
                wj10 wj10Var = (wj10) lkiVar.g0.get();
                btt0 btt0VarO8 = g8iVar5.o8();
                x1x.x(btt0VarO8);
                return new yj10(knf0VarJ8, wj10Var, btt0VarO8);
            case 57:
                evz evzVar4 = lkiVar.c;
                gii0 gii0VarJ9 = lkiVar.f20204a.j9();
                x1x.x(gii0VarJ9);
                return new wj10(gii0VarJ9);
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object b() {
        pki pkiVar = (pki) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new i6i(this, (byte) 8);
            case 1:
                sek sekVar = pkiVar.b;
                s7t0 s7t0Var = (s7t0) pkiVar.E.get();
                pbt pbtVarL2 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL2);
                return i5t.r(sekVar, s7t0Var, pbtVarL2);
            case 2:
                sek sekVar2 = pkiVar.b;
                g8i g8iVar = pkiVar.f27135a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                d3c d3cVar = (d3c) pkiVar.f.get();
                fq fqVar = (fq) pkiVar.y.get();
                qpt qptVar = (qpt) pkiVar.z.get();
                gmt gmtVar = (gmt) pkiVar.k.get();
                rgs rgsVar = (rgs) pkiVar.D.get();
                r9u r9uVarH4 = g8iVar.h4();
                x1x.x(r9uVarH4);
                return i5t.C(sekVar2, pbtVarL3, d3cVar, fqVar, qptVar, gmtVar, rgsVar, r9uVarH4);
            case 3:
                sek sekVar3 = pkiVar.b;
                pbt pbtVarL4 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL4);
                return new d3c(pbtVarL4);
            case 4:
                sek sekVar4 = pkiVar.b;
                lzt lztVar = (lzt) pkiVar.g.get();
                zmi0 zmi0Var = (zmi0) pkiVar.h.get();
                pbt pbtVarL5 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL5);
                return mkg.g(sekVar4, lztVar, zmi0Var, pbtVarL5, (xyb) pkiVar.i.get(), (yyb) pkiVar.m.get(), (fpi0) pkiVar.n.get(), (nqt) pkiVar.o.get(), (spx) pkiVar.p.get(), (oqt) pkiVar.q.get(), (hni0) pkiVar.r.get(), (vcu) pkiVar.s.get(), (d3c) pkiVar.f.get(), (wni0) pkiVar.t.get(), (ztt) pkiVar.l.get(), (pqt) pkiVar.u.get(), (itt) pkiVar.v.get(), (q78) pkiVar.w.get(), (gmt) pkiVar.k.get(), (ecs) pkiVar.x.get());
            case 5:
                sek sekVar5 = pkiVar.b;
                g8i g8iVar2 = pkiVar.f27135a;
                pbt pbtVarL6 = g8iVar2.L2();
                x1x.x(pbtVarL6);
                m1e m1eVarQ1 = g8iVar2.q1();
                x1x.x(m1eVarQ1);
                return new lzt(pbtVarL6, m1eVarQ1);
            case 6:
                sek sekVar6 = pkiVar.b;
                pbt pbtVarL7 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL7);
                return new zmi0(pbtVarL7);
            case 7:
                sek sekVar7 = pkiVar.b;
                pbt pbtVarL8 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL8);
                return new xyb(pbtVarL8);
            case 8:
                sek sekVar8 = pkiVar.b;
                k1u k1uVar = (k1u) pkiVar.j.get();
                gmt gmtVar2 = (gmt) pkiVar.k.get();
                ztt zttVar = (ztt) pkiVar.l.get();
                pbt pbtVarL9 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL9);
                return i5t.a(sekVar8, k1uVar, gmtVar2, zttVar, pbtVarL9);
            case 9:
                sek sekVar9 = pkiVar.b;
                return new k1u(pkiVar.b());
            case 10:
                sek sekVar10 = pkiVar.b;
                pbt pbtVarL10 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL10);
                return new gmt(pbtVarL10);
            case 11:
                sek sekVar11 = pkiVar.b;
                pbt pbtVarL11 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL11);
                return new ztt(pbtVarL11);
            case 12:
                sek sekVar12 = pkiVar.b;
                pbt pbtVarL12 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL12);
                return new fpi0(pbtVarL12);
            case 13:
                sek sekVar13 = pkiVar.b;
                pbt pbtVarL13 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL13);
                return new nqt(pbtVarL13);
            case 14:
                sek sekVar14 = pkiVar.b;
                pbt pbtVarL14 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL14);
                return new spx(pbtVarL14);
            case 15:
                sek sekVar15 = pkiVar.b;
                pbt pbtVarL15 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL15);
                return new oqt(pbtVarL15);
            case 16:
                sek sekVar16 = pkiVar.b;
                pbt pbtVarL16 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL16);
                return new hni0(pbtVarL16);
            case 17:
                sek sekVar17 = pkiVar.b;
                pbt pbtVarL17 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL17);
                return new vcu(pbtVarL17);
            case 18:
                sek sekVar18 = pkiVar.b;
                pbt pbtVarL18 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL18);
                return new wni0(pbtVarL18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar19 = pkiVar.b;
                pbt pbtVarL19 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL19);
                return new pqt(pbtVarL19);
            case 20:
                sek sekVar20 = pkiVar.b;
                pbt pbtVarL20 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL20);
                return new itt(pbtVarL20);
            case 21:
                sek sekVar21 = pkiVar.b;
                pbt pbtVarL21 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL21);
                return new q78(pbtVarL21);
            case 22:
                sek sekVar22 = pkiVar.b;
                pbt pbtVarL22 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL22);
                return new ecs(pbtVarL22);
            case 23:
                sek sekVar23 = pkiVar.b;
                pbt pbtVarL23 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL23);
                return new qpt(pbtVarL23);
            case 24:
                sek sekVar24 = pkiVar.b;
                fq fqVar2 = (fq) pkiVar.y.get();
                fqx fqxVar = (fqx) pkiVar.A.get();
                wox woxVar = (wox) pkiVar.B.get();
                return i5t.g(fqVar2, sekVar24, (qpt) pkiVar.z.get(), (r8u) pkiVar.C.get(), woxVar, fqxVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar25 = pkiVar.b;
                pbt pbtVarL24 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL24);
                return new fqx(pbtVarL24);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar26 = pkiVar.b;
                pbt pbtVarL25 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL25);
                return new wox(pbtVarL25);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar27 = pkiVar.b;
                pbt pbtVarL26 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL26);
                return new r8u(pbtVarL26);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                sek sekVar28 = pkiVar.b;
                pbt pbtVarL27 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL27);
                return new qa60(pbtVarL27);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar29 = pkiVar.b;
                pbt pbtVarL28 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL28);
                return new ipi0(pbtVarL28);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                sek sekVar30 = pkiVar.b;
                pbt pbtVarL29 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL29);
                return new xsi0(pbtVarL29);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                sek sekVar31 = pkiVar.b;
                pbt pbtVarL30 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL30);
                return new gpx(pbtVarL30);
            case 32:
                sek sekVar32 = pkiVar.b;
                pbt pbtVarL31 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL31);
                return new vni0(pbtVarL31);
            case 33:
                sek sekVar33 = pkiVar.b;
                pbt pbtVarL32 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL32);
                return new hs(pbtVarL32);
            case 34:
                sek sekVar34 = pkiVar.b;
                pbt pbtVarL33 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL33);
                return new eni0(pbtVarL33);
            case 35:
                return i5t.z(pkiVar.b, (aws) pkiVar.N.get());
            case 36:
                sek sekVar35 = pkiVar.b;
                yvs yvsVarG2 = pkiVar.f27135a.G2();
                x1x.x(yvsVarG2);
                return new aws(yvsVarG2);
            case 37:
                sek sekVar36 = pkiVar.b;
                pbt pbtVarL34 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL34);
                return new hj50(pbtVarL34);
            case 38:
                sek sekVar37 = pkiVar.b;
                pbt pbtVarL35 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL35);
                return new qhf0(pbtVarL35);
            case 39:
                return i5t.d(pkiVar.b, (foi0) pkiVar.R.get(), (fq) pkiVar.y.get());
            case 40:
                sek sekVar38 = pkiVar.b;
                pbt pbtVarL36 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL36);
                return new foi0(pbtVarL36);
            case 41:
                sek sekVar39 = pkiVar.b;
                fq fqVar3 = (fq) pkiVar.y.get();
                r8u r8uVar = (r8u) pkiVar.C.get();
                return i5t.B(fqVar3, sekVar39, (qpt) pkiVar.z.get(), r8uVar, (wox) pkiVar.B.get(), (fqx) pkiVar.A.get());
            case 42:
                atz atzVar = pkiVar.c;
                return new y5s(s470.LUCKY_WHEEL, false, false, false, false, false, 448);
            case 43:
                return i5t.b(pkiVar.b, (fq) pkiVar.y.get(), (fqx) pkiVar.A.get());
            case 44:
                return i5t.c(pkiVar.b, (aws) pkiVar.N.get());
            case 45:
                sek sekVar40 = pkiVar.b;
                pbt pbtVarL37 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL37);
                return new hsj0(pbtVarL37);
            case 46:
                sek sekVar41 = pkiVar.b;
                g8i g8iVar3 = pkiVar.f27135a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL38 = g8iVar3.L2();
                x1x.x(pbtVarL38);
                return new t0u(pbtVarL38, wsf0VarF0);
            case 47:
                sek sekVar42 = pkiVar.b;
                pbt pbtVarL39 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL39);
                return new tbu(pbtVarL39);
            case 48:
                return i5t.f(pkiVar.b, (a6s) pkiVar.a0.get());
            case 49:
                return i5t.e(pkiVar.b);
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                return new nki(this);
            case 51:
                g8i g8iVar4 = pkiVar.f27135a;
                g8i g8iVar5 = pkiVar.f27135a;
                gii0 gii0VarJ9 = g8iVar4.j9();
                x1x.x(gii0VarJ9);
                zpu zpuVar = new zpu(gii0VarJ9, (byte) 21);
                btt0 btt0VarO8 = g8iVar5.o8();
                x1x.x(btt0VarO8);
                j5t j5tVarJ2 = g8iVar5.J2();
                x1x.x(j5tVarJ2);
                return new go10(zpuVar, btt0VarO8, j5tVarJ2);
            case 52:
                sek sekVar43 = pkiVar.b;
                g8i g8iVar6 = pkiVar.f27135a;
                pbt pbtVarL40 = g8iVar6.L2();
                x1x.x(pbtVarL40);
                return new zcu(pbtVarL40, g8iVar6.Qa());
            case 53:
                return i5t.n(pkiVar.b, (scu) pkiVar.f0.get(), pkiVar.f27135a.f5());
            case 54:
                sek sekVar44 = pkiVar.b;
                g8i g8iVar7 = pkiVar.f27135a;
                pbt pbtVarL41 = g8iVar7.L2();
                x1x.x(pbtVarL41);
                return new scu(pbtVarL41, g8iVar7.Qa());
            case 55:
                return i5t.m(pkiVar.b, (scu) pkiVar.f0.get(), pkiVar.f27135a.f5());
            case 56:
                sek sekVar45 = pkiVar.b;
                pbt pbtVarL42 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL42);
                return i5t.y(sekVar45, pbtVarL42, (rgs) pkiVar.D.get(), (vrs0) pkiVar.T.get());
            case 57:
                sek sekVar46 = pkiVar.b;
                g8i g8iVar8 = pkiVar.f27135a;
                pbt pbtVarL43 = g8iVar8.L2();
                x1x.x(pbtVarL43);
                return new ipu(pbtVarL43, g8iVar8.Qa());
            case 58:
                return new oki(this);
            case 59:
                return i5t.s(pkiVar.b, (scu) pkiVar.f0.get(), pkiVar.f27135a.f5());
            case 60:
                sek sekVar47 = pkiVar.b;
                pbt pbtVarL44 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL44);
                return new tni0(pbtVarL44);
            case 61:
                sek sekVar48 = pkiVar.b;
                pbt pbtVarL45 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL45);
                return new g9c(pbtVarL45);
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object c() {
        kki kkiVar = (kki) this.c;
        rrc rrcVar = (rrc) kkiVar.e;
        byte b = this.b;
        if (b == 0) {
            return new nku((p430) ((n5d0) kkiVar.b).get());
        }
        if (b == 1) {
            return new p430(new he1(rrcVar, (byte) 2), new nv20(rrcVar), (mne) kkiVar.f);
        }
        if (b == 2) {
            return new eu90((p430) ((n5d0) kkiVar.b).get());
        }
        c99.h(b);
        return null;
    }

    private final Object d() {
        gr70 gr70Var = ((pli) this.c).K;
        byte b = this.b;
        if (b == 0) {
            return new oli(this);
        }
        if (b == 1) {
            smu smuVarV = gr70Var.v();
            x1x.x(smuVarV);
            return smuVarV;
        }
        if (b != 2) {
            c99.h(b);
            return null;
        }
        rmu rmuVarP = gr70Var.p();
        x1x.x(rmuVarP);
        return rmuVarP;
    }

    private final Object e() {
        h6i h6iVar = (h6i) this.c;
        byte b = this.b;
        if (b == 0) {
            return new xli(this);
        }
        if (b == 1) {
            j400 j400Var = (j400) ((n5d0) h6iVar.m).get();
            j400Var.getClass();
            return new bqi0(j400Var);
        }
        if (b == 2) {
            return euw.q((wsz) h6iVar.d, (f400) ((n5d0) h6iVar.c).get(), (btt0) h6iVar.f, (e400) h6iVar.g, (mne) h6iVar.b, (kuy) h6iVar.h);
        }
        if (b == 3) {
            gii0 gii0Var = (gii0) h6iVar.e;
            gii0Var.getClass();
            return new f400(gii0Var);
        }
        if (b != 4) {
            c99.h(b);
            return null;
        }
        j400 j400Var2 = (j400) ((n5d0) h6iVar.m).get();
        j400Var2.getClass();
        return new ivt(j400Var2);
    }

    private final Object f() {
        mdi mdiVar = (mdi) this.c;
        yfu yfuVar = (yfu) mdiVar.L;
        x0u x0uVar = (x0u) mdiVar.R;
        rou rouVar = mdiVar.j;
        pyt pytVar = (pyt) mdiVar.v;
        xmt xmtVar = (xmt) mdiVar.u;
        v88 v88Var = mdiVar.l;
        gg5 gg5Var = (gg5) mdiVar.Q;
        l7k l7kVar = (l7k) mdiVar.Z;
        duj dujVar = mdiVar.m;
        cad cadVar = mdiVar.b;
        j1q0 j1q0Var = (j1q0) mdiVar.w;
        lrc lrcVar = (lrc) mdiVar.N;
        nr00 nr00Var = (nr00) mdiVar.z;
        onv onvVar = (onv) mdiVar.J;
        wsf0 wsf0Var = mdiVar.d;
        ntu ntuVar = (ntu) mdiVar.x;
        iqt iqtVar = (iqt) mdiVar.B;
        pru pruVar = mdiVar.e;
        kt2 kt2Var = (kt2) mdiVar.F;
        ehf0 ehf0Var = (ehf0) mdiVar.p;
        byte b = this.b;
        if (b == 0) {
            kc60 kc60Var = new kc60(mdiVar.f);
            dn0 dn0VarG = ((i7i) ehf0Var.b).g();
            x1x.x(dn0VarG);
            jr0 jr0VarH = ((i7i) ehf0Var.b).h();
            x1x.x(jr0VarH);
            phf0 phf0Var = new phf0(new oif0(dn0VarG, new xoc(jr0VarH), j1q0Var), ntuVar, pruVar);
            i7i i7iVar = (i7i) ehf0Var.b;
            nr nrVar = new nr((Object) new moc((dn0) i7iVar.B.get()), i7iVar.d, (Object) i7iVar.b, (byte) 28);
            dn0 dn0VarG2 = ((i7i) ehf0Var.b).g();
            x1x.x(dn0VarG2);
            jr0 jr0VarH2 = ((i7i) ehf0Var.b).h();
            x1x.x(jr0VarH2);
            ouu ouuVar = new ouu((Object) new yuu(dn0VarG2, new xoc(jr0VarH2), j1q0Var), ntuVar, pruVar, (byte) 22);
            i7i i7iVar2 = (i7i) ehf0Var.b;
            dn0 dn0VarG3 = i7iVar2.g();
            x1x.x(dn0VarG3);
            soc socVar = new soc(dn0VarG3, (char) 0);
            xx0 xx0VarI = i7iVar2.i();
            x1x.x(xx0VarI);
            abu abuVar = new abu(xx0VarI, j1q0Var);
            dn0 dn0VarG4 = i7iVar2.g();
            x1x.x(dn0VarG4);
            svu svuVar = (svu) mdiVar.y;
            mne mneVarH = ((psc) cadVar.b).h();
            x1x.x(mneVarH);
            a6u a6uVar = new a6u((Object) socVar, (Object) abuVar, (Object) new j5v(dn0VarG4, j1q0Var, svuVar, mneVarH), (Object) ntuVar, (Object) pruVar, (byte) 22);
            xex xexVarB = ((i7i) ehf0Var.b).b();
            zn00 zn00VarV = ((i7i) ehf0Var.b).v();
            pw70 pw70Var = (pw70) mdiVar.s.get();
            nc0 nc0VarA = mdiVar.a();
            s91 s91Var = (s91) mdiVar.E;
            oeg0 oeg0Var = (oeg0) mdiVar.g;
            u58 u58Var = new u58(kt2Var, (byte) 3);
            gg5 gg5Var2 = (gg5) mdiVar.G;
            mne mneVarH2 = ((psc) cadVar.b).h();
            x1x.x(mneVarH2);
            ctf0 ctf0Var = mdiVar.c;
            s64 s64Var = (s64) mdiVar.H;
            cmt cmtVar = (cmt) mdiVar.I;
            a6u a6uVar2 = new a6u((Object) ehf0Var.h(), (Object) ((i7i) ehf0Var.b).n(), (Object) ntuVar, (Object) iqtVar, (Object) pruVar, (byte) 6);
            f7u f7uVarQ = ((i7i) ehf0Var.b).q();
            p4u p4uVarR = ((mii0) onvVar.f25567a).r();
            xfu xfuVarS = ((mii0) onvVar.f25567a).s();
            lrc lrcVarP = ((mii0) onvVar.f25567a).p();
            wgu wguVar = (wgu) mdiVar.K;
            erc ercVarW = ((kki) ((nr00) mdiVar.M).f23980a).w();
            f3j f3jVarF = ((mci) lrcVar.b).f();
            m1e m1eVar = mdiVar.q;
            qu quVar = new qu(kt2Var, (byte) 1);
            ix0 ix0Var = (ix0) mdiVar.O;
            vd1 vd1Var = new vd1(kt2Var, (byte) 0);
            ix0 ix0Var2 = (ix0) mdiVar.h;
            ih5 ih5Var = new ih5(kt2Var, (byte) 0);
            hsj hsjVarG = ehf0Var.g();
            cu cuVarR = ((i7i) ehf0Var.b).r();
            ytt yttVarA = ((vqc) nr00Var.f23980a).a();
            yo4 yo4Var = new yo4(kt2Var, (byte) 5);
            pmi pmiVar = (pmi) mdiVar.P;
            a6u a6uVarT = ((i7i) ehf0Var.b).t();
            dgu dguVar = new dgu(new yr((dn0) ((i7i) ehf0Var.b).B.get()), ntuVar, iqtVar, pruVar);
            dn0 dn0VarG5 = ((i7i) ehf0Var.b).g();
            x1x.x(dn0VarG5);
            return new d650(kc60Var, xmtVar, pytVar, phf0Var, nrVar, ouuVar, a6uVar, xexVarB, zn00VarV, pw70Var, nc0VarA, s91Var, oeg0Var, u58Var, gg5Var2, mneVarH2, ctf0Var, s64Var, cmtVar, a6uVar2, f7uVarQ, p4uVarR, xfuVarS, lrcVarP, wguVar, yfuVar, ercVarW, f3jVarF, m1eVar, dujVar, quVar, ix0Var, vd1Var, ix0Var2, ih5Var, gg5Var, rouVar, hsjVarG, cuVarR, yttVarA, yo4Var, pmiVar, x0uVar, a6uVarT, dguVar, new f7u((Object) new yr(dn0VarG5, false), (Object) ntuVar, (Object) iqtVar, (Object) pruVar, (byte) 14), ((i7i) ehf0Var.b).w(), iqtVar, ((vqc) nr00Var.f23980a).o(), ((poq0) mdiVar.n).f27342a.d(), ((rrc) ((wsf0) mdiVar.S).b).I(), (xfu) mdiVar.r, (bwl) mdiVar.T, (e41) mdiVar.U, (s31) mdiVar.V, ((g45) wsf0Var.b).y(), wsf0Var.s(), (bzt) mdiVar.W, (q250) mdiVar.X, new s31(kt2Var, (byte) 6), new ih5(kt2Var, (byte) 2), ((g45) wsf0Var.b).G(), v88Var, l7kVar, (cyu) mdiVar.c0, ((g45) wsf0Var.b).Q(), pruVar, ((g45) wsf0Var.b).Y(), (dmt) mdiVar.d0, ((mci) lrcVar.b).l());
        }
        if (b == 1) {
            return new pw70((oeg0) mdiVar.g, new jdk0(), ((vqc) nr00Var.f23980a).o());
        }
        if (b != 2) {
            c99.h(b);
            return null;
        }
        oeg0 oeg0Var2 = (oeg0) mdiVar.g;
        mne mneVarH3 = ((psc) cadVar.b).h();
        x1x.x(mneVarH3);
        nc0 nc0VarA2 = mdiVar.a();
        oeg0 oeg0Var3 = (oeg0) mdiVar.g;
        ctf0 ctf0Var2 = mdiVar.c;
        ih5 ih5Var2 = new ih5(kt2Var, (byte) 2);
        ih5 ih5Var3 = new ih5(kt2Var, (byte) 0);
        g45 g45Var = (g45) wsf0Var.b;
        kb0 kb0Var = new kb0(dujVar, oeg0Var3, ctf0Var2, ih5Var2, l7kVar, gg5Var, v88Var, ih5Var3, g45Var.y(), g45Var.Q(), g45Var.Y(), iqtVar, g45Var.G(), wsf0Var.s(), ((i7i) ehf0Var.b).e());
        i7i i7iVar3 = (i7i) ehf0Var.b;
        zri zriVar = new zri(new rpt(new mii0((z41) i7iVar3.A, new xr((gii0) i7iVar3.m, (byte) 5), (knf0) i7iVar3.i, (btt0) i7iVar3.k)), new x1u((gst0) i7iVar3.t, (byte) 1), (byte) 27);
        i7i i7iVar4 = (i7i) ehf0Var.b;
        oif0 oif0Var = new oif0(new e1u(new mii0((z41) i7iVar4.A, new xr((gii0) i7iVar4.m, (byte) 5), (knf0) i7iVar4.i, (btt0) i7iVar4.k), (byte) 22), (x0u) i7iVar4.z, new x1u((gst0) i7iVar4.t, (byte) 1), (byte) 26);
        hsj hsjVarG2 = ehf0Var.g();
        ytt yttVarA2 = ((vqc) nr00Var.f23980a).a();
        ieu ieuVar = (ieu) mdiVar.e0;
        wgu wguVar2 = (wgu) mdiVar.K;
        a6u a6uVar3 = new a6u((Object) ehf0Var.h(), (Object) ((i7i) ehf0Var.b).n(), (Object) ntuVar, (Object) iqtVar, (Object) pruVar, (byte) 6);
        soc socVarW = ((i7i) ehf0Var.b).w();
        p4u p4uVarR2 = ((mii0) onvVar.f25567a).r();
        xfu xfuVar = (xfu) mdiVar.r;
        bwl bwlVar = (bwl) mdiVar.T;
        f7u f7uVarQ2 = ((i7i) ehf0Var.b).q();
        jqt jqtVar = new jqt(mdiVar.f);
        g3j g3jVarG = ((mci) lrcVar.b).g();
        rpt rptVarX = lrcVar.x();
        pmi pmiVarH = ((mci) lrcVar.b).h();
        a6u a6uVarT2 = ((i7i) ehf0Var.b).t();
        ytt yttVarO = ((vqc) nr00Var.f23980a).o();
        xex xexVarB2 = ((i7i) ehf0Var.b).b();
        zn00 zn00VarV2 = ((i7i) ehf0Var.b).v();
        eyg0 eyg0VarI = ((rrc) ((wsf0) mdiVar.S).b).I();
        r8i r8iVarD = ((poq0) mdiVar.n).f27342a.d();
        xfu xfuVarS2 = ((mii0) onvVar.f25567a).s();
        lrc lrcVarP2 = ((mii0) onvVar.f25567a).p();
        m1e m1eVar2 = mdiVar.q;
        u58 u58Var2 = new u58(kt2Var, (byte) 3);
        s64 s64Var2 = (s64) mdiVar.H;
        s91 s91Var2 = (s91) mdiVar.E;
        gg5 gg5Var3 = (gg5) mdiVar.G;
        erc ercVarW2 = ((kki) ((nr00) mdiVar.M).f23980a).w();
        ix0 ix0Var3 = (ix0) mdiVar.O;
        e41 e41Var = (e41) mdiVar.U;
        s31 s31Var = (s31) mdiVar.V;
        vd1 vd1Var2 = new vd1(kt2Var, (byte) 0);
        ix0 ix0Var4 = (ix0) mdiVar.h;
        ctf0 ctf0Var3 = mdiVar.c;
        bzt bztVar = (bzt) mdiVar.W;
        yo4 yo4Var2 = new yo4(kt2Var, (byte) 5);
        pw70 pw70Var2 = (pw70) mdiVar.s.get();
        s31 s31Var2 = new s31(kt2Var, (byte) 6);
        cyu cyuVar = (cyu) mdiVar.c0;
        dn0 dn0VarG6 = ((i7i) ehf0Var.b).g();
        x1x.x(dn0VarG6);
        ali aliVar = new ali((Object) new nbu(dn0VarG6, j1q0Var), (Object) ntuVar, (Object) iqtVar, pruVar);
        dn0 dn0VarG7 = ((i7i) ehf0Var.b).g();
        x1x.x(dn0VarG7);
        return new p850(oeg0Var2, mneVarH3, nc0VarA2, kb0Var, zriVar, oif0Var, xmtVar, pytVar, pruVar, hsjVarG2, yttVarA2, ieuVar, rouVar, wguVar2, x0uVar, a6uVar3, socVarW, yfuVar, p4uVarR2, xfuVar, bwlVar, f7uVarQ2, iqtVar, jqtVar, g3jVarG, rptVarX, pmiVarH, a6uVarT2, yttVarO, xexVarB2, zn00VarV2, eyg0VarI, r8iVarD, xfuVarS2, lrcVarP2, m1eVar2, u58Var2, s64Var2, s91Var2, gg5Var3, ercVarW2, ix0Var3, e41Var, s31Var, vd1Var2, ix0Var4, ctf0Var3, bztVar, yo4Var2, pw70Var2, dujVar, s31Var2, cyuVar, aliVar, new z220((Object) new j910(dn0VarG7, j1q0Var), (Object) ntuVar, (Object) iqtVar, (Object) pruVar, (byte) 20), (cmt) mdiVar.I, (q250) mdiVar.X);
    }

    private final Object g() {
        ami amiVar = (ami) this.c;
        byte b = this.b;
        if (b == 0) {
            return new zli(this);
        }
        if (b == 1) {
            return new loc();
        }
        if (b == 2) {
            return new kzt(amiVar.a());
        }
        if (b == 3) {
            gii0 gii0Var = amiVar.c;
            gii0Var.getClass();
            return new scc0(gii0Var);
        }
        if (b == 4) {
            return new twc(amiVar.a());
        }
        c99.h(b);
        return null;
    }

    @Override // a.o5d0
    public final Object get() {
        Object hfwVar;
        Object sf10Var;
        byte b = this.f30544a;
        byte b2 = 0;
        Object obj = this.c;
        byte b3 = this.b;
        switch (b) {
            case 0:
                if (b3 == 0) {
                    return new qii(this);
                }
                if (b3 == 1) {
                    sii siiVar = (sii) obj;
                    return new l77(new y2m0((byte) 20), siiVar.h, siiVar.p, new b6u(((uii) siiVar.e.f15470a).r(), (byte) 13));
                }
                if (b3 == 2) {
                    return new s5w();
                }
                c99.h(b3);
                return null;
            case 1:
                v8i v8iVar = (v8i) obj;
                pru pruVar = (pru) v8iVar.e;
                xri xriVar = (xri) v8iVar.u;
                duj dujVar = (duj) v8iVar.g;
                cad cadVar = v8iVar.f36984a;
                pyg pygVar = (pyg) v8iVar.f;
                sue sueVar = (sue) v8iVar.s;
                if (b3 == 0) {
                    mne mneVarH = ((psc) cadVar.b).h();
                    x1x.x(mneVarH);
                    hzg hzgVarA = pygVar.a();
                    x1x.x(hzgVarA);
                    m1e m1eVar = (m1e) v8iVar.i;
                    ctf0 ctf0Var = (ctf0) v8iVar.j;
                    f4u f4uVar = new f4u((pew) ((n5d0) v8iVar.y).get());
                    j2u j2uVar = (j2u) v8iVar.k;
                    pmi pmiVar = (pmi) v8iVar.l;
                    epc epcVarL = ((lp4) v8iVar.m).l();
                    x1x.x(epcVarL);
                    uii uiiVar = new uii(f4uVar, j2uVar, pmiVar, epcVarL, (kqc) v8iVar.n, pruVar);
                    rrd rrdVarC = v8iVar.c();
                    pew pewVar = (pew) ((n5d0) v8iVar.y).get();
                    pewVar.getClass();
                    ugf0 ugf0Var = new ugf0();
                    ugf0Var.f35622a = pewVar;
                    n4u n4uVar = new n4u((pew) ((n5d0) v8iVar.y).get());
                    svu svuVarA = xriVar.a();
                    x1x.x(svuVarA);
                    oeg0 oeg0Var = (oeg0) v8iVar.v;
                    vqc vqcVarI = pygVar.i();
                    gud gudVarQ = sueVar.q();
                    x1x.x(gudVarQ);
                    cr crVarH = sueVar.h();
                    xzp xzpVarK = sueVar.k();
                    x1x.x(xzpVarK);
                    esg0 esg0VarR = sueVar.r();
                    x1x.x(esg0VarR);
                    hfwVar = new hfw(mneVarH, hzgVarA, dujVar, m1eVar, ctf0Var, uiiVar, pruVar, rrdVarC, ugf0Var, n4uVar, svuVarA, oeg0Var, vqcVarI, gudVarQ, crVarH, xzpVarK, esg0VarR);
                } else {
                    if (b3 == 1) {
                        return new pew(new svu(v8iVar.b, (byte) 16), (mew) ((n5d0) v8iVar.x).get());
                    }
                    if (b3 == 2) {
                        return new mew();
                    }
                    if (b3 == 3) {
                        return new n530();
                    }
                    if (b3 == 4) {
                        mne mneVarH2 = ((psc) cadVar.b).h();
                        x1x.x(mneVarH2);
                        hzg hzgVarA2 = pygVar.a();
                        x1x.x(hzgVarA2);
                        return new v93(mneVarH2, hzgVarA2, new e1u((pew) ((n5d0) v8iVar.y).get()), (oeg0) v8iVar.v, pygVar.i());
                    }
                    if (b3 != 5) {
                        c99.h(b3);
                        return null;
                    }
                    mne mneVarH3 = ((psc) cadVar.b).h();
                    x1x.x(mneVarH3);
                    hzg hzgVarA3 = pygVar.a();
                    x1x.x(hzgVarA3);
                    m1e m1eVar2 = (m1e) v8iVar.i;
                    ctf0 ctf0Var2 = (ctf0) v8iVar.j;
                    svu svuVarA2 = xriVar.a();
                    x1x.x(svuVarA2);
                    gud gudVarQ2 = sueVar.q();
                    x1x.x(gudVarQ2);
                    cr crVarH2 = sueVar.h();
                    xzp xzpVarK2 = sueVar.k();
                    x1x.x(xzpVarK2);
                    esg0 esg0VarR2 = sueVar.r();
                    x1x.x(esg0VarR2);
                    hfwVar = new zzh0(mneVarH3, hzgVarA3, dujVar, m1eVar2, ctf0Var2, svuVarA2, gudVarQ2, crVarH2, xzpVarK2, esg0VarR2, new e1u((pew) ((n5d0) v8iVar.y).get()), v8iVar.c(), pruVar);
                }
                return hfwVar;
            case 2:
                xii xiiVar = (xii) obj;
                iip iipVar = xiiVar.e;
                pru pruVar2 = xiiVar.d;
                if (b3 != 0) {
                    if (b3 == 1) {
                        return new iiw();
                    }
                    if (b3 == 2) {
                        return new bwp();
                    }
                    if (b3 == 3) {
                        return new xcb();
                    }
                    c99.h(b3);
                    return null;
                }
                i1w0 i1w0Var = xiiVar.f40946a;
                g2v g2vVar = xiiVar.b;
                ctf0 ctf0Var3 = xiiVar.c;
                j3c j3cVarV = iipVar.V();
                x1x.x(j3cVarV);
                rtu rtuVar = new rtu(new rou(xiiVar.f, (byte) 0), new x4v(xiiVar.g, (byte) 0));
                v7i v7iVarK = ((gbi) xiiVar.h.f20589a).k();
                knf0 knf0Var = xiiVar.i;
                gii0 gii0Var = xiiVar.j;
                a6u a6uVar = new a6u(pruVar2, j3cVarV, rtuVar, v7iVarK, new u8u(new a6u(knf0Var, new zpu(gii0Var, (byte) 9), (iiw) xiiVar.y.get(), new jtj(new fhj(gii0Var, (byte) 12), (bwp) xiiVar.z.get()), new khf0(xiiVar.i, new xex(gii0Var, (byte) 16), (xcb) xiiVar.A.get())), xiiVar.k));
                luu luuVarW = ((daf) xiiVar.l.f35622a).w();
                x1x.x(luuVarW);
                y78 y78Var = xiiVar.m;
                lbu lbuVar = xiiVar.n;
                svu svuVarA3 = xiiVar.o.a();
                x1x.x(svuVarA3);
                wiu wiuVar = xiiVar.p;
                r9u r9uVar = xiiVar.q;
                hjd hjdVarA = xiiVar.r.a();
                x1x.x(hjdVarA);
                mne mneVarH4 = ((psc) xiiVar.s.b).h();
                x1x.x(mneVarH4);
                m1e m1eVar3 = xiiVar.t;
                kys0 kys0Var = xiiVar.u;
                uxs0 uxs0Var = xiiVar.v;
                vjp vjpVarS = iipVar.S();
                x1x.x(vjpVarS);
                return new tkw(i1w0Var, g2vVar, ctf0Var3, a6uVar, luuVarW, y78Var, lbuVar, pruVar2, svuVarA3, wiuVar, r9uVar, hjdVarA, mneVarH4, m1eVar3, kys0Var, uxs0Var, vjpVarS, xiiVar.w, xiiVar.x);
            case 3:
                o3c o3cVar = (o3c) obj;
                if (b3 == 0) {
                    i1w0 i1w0Var2 = (i1w0) o3cVar.f24576a;
                    mne mneVarH5 = ((psc) ((cad) o3cVar.b).b).h();
                    x1x.x(mneVarH5);
                    return new woz(i1w0Var2, mneVarH5, (gtu) ((n5d0) o3cVar.j).get());
                }
                if (b3 == 1) {
                    ((s200) ((n5d0) o3cVar.i).get()).getClass();
                    return new gtu();
                }
                if (b3 == 2) {
                    return euw.o((gtz) o3cVar.c, (a200) ((n5d0) o3cVar.h).get(), (knf0) o3cVar.e, (btt0) o3cVar.f, (us00) o3cVar.g);
                }
                if (b3 != 3) {
                    c99.h(b3);
                    return null;
                }
                gii0 gii0Var2 = (gii0) o3cVar.d;
                gii0Var2.getClass();
                return new a200(gii0Var2);
            case 4:
                qv2 qv2Var = (qv2) obj;
                if (b3 == 0) {
                    ssi0 ssi0Var = (ssi0) ((n5d0) qv2Var.l).get();
                    mne mneVarH6 = ((psc) ((cad) qv2Var.g).b).h();
                    x1x.x(mneVarH6);
                    return new qpz(ssi0Var, mneVarH6, (i1w0) qv2Var.h, (duj) qv2Var.i, (etu) ((n5d0) qv2Var.m).get());
                }
                if (b3 == 1) {
                    p200 p200Var = (p200) ((n5d0) qv2Var.k).get();
                    p200Var.getClass();
                    return new ssi0(p200Var);
                }
                if (b3 == 2) {
                    return euw.l((dvz) qv2Var.b, (b200) ((n5d0) qv2Var.j).get(), (btt0) qv2Var.d, (knf0) qv2Var.e, (ctf0) qv2Var.f);
                }
                if (b3 == 3) {
                    gii0 gii0Var3 = (gii0) qv2Var.c;
                    gii0Var3.getClass();
                    return new b200(gii0Var3);
                }
                if (b3 == 4) {
                    ((p200) ((n5d0) qv2Var.k).get()).getClass();
                    return new etu();
                }
                c99.h(b3);
                return null;
            case 5:
                qv2 qv2Var2 = (qv2) obj;
                if (b3 == 0) {
                    tsi0 tsi0Var = (tsi0) ((n5d0) qv2Var2.l).get();
                    mne mneVarH7 = ((psc) ((cad) qv2Var2.g).b).h();
                    x1x.x(mneVarH7);
                    return new lqz(tsi0Var, mneVarH7, (i1w0) qv2Var2.h, (duj) qv2Var2.i, (ftu) ((n5d0) qv2Var2.m).get());
                }
                if (b3 == 1) {
                    q200 q200Var = (q200) ((n5d0) qv2Var2.k).get();
                    q200Var.getClass();
                    return new tsi0(q200Var);
                }
                if (b3 == 2) {
                    return euw.m((jyz) qv2Var2.b, (c200) ((n5d0) qv2Var2.j).get(), (btt0) qv2Var2.d, (knf0) qv2Var2.e, (us00) qv2Var2.f);
                }
                if (b3 == 3) {
                    gii0 gii0Var4 = (gii0) qv2Var2.c;
                    gii0Var4.getClass();
                    return new c200(gii0Var4);
                }
                if (b3 == 4) {
                    ((q200) ((n5d0) qv2Var2.k).get()).getClass();
                    return new ftu();
                }
                c99.h(b3);
                return null;
            case 6:
                nc0 nc0Var = (nc0) obj;
                if (b3 == 0) {
                    vsi0 vsi0Var = (vsi0) ((n5d0) nc0Var.l).get();
                    mne mneVarH8 = ((psc) ((cad) nc0Var.h).b).h();
                    x1x.x(mneVarH8);
                    return new irz(vsi0Var, mneVarH8, (i1w0) nc0Var.i, (duj) nc0Var.b, (htu) ((n5d0) nc0Var.m).get(), (bzt) nc0Var.j);
                }
                if (b3 == 1) {
                    s200 s200Var = (s200) ((n5d0) nc0Var.c).get();
                    s200Var.getClass();
                    return new vsi0(s200Var);
                }
                if (b3 == 2) {
                    return euw.o((gtz) nc0Var.d, (a200) ((n5d0) nc0Var.k).get(), (knf0) nc0Var.f, (btt0) nc0Var.g, (us00) nc0Var.f23267a);
                }
                if (b3 == 3) {
                    gii0 gii0Var5 = (gii0) nc0Var.e;
                    gii0Var5.getClass();
                    return new a200(gii0Var5);
                }
                if (b3 != 4) {
                    c99.h(b3);
                    return null;
                }
                s200 s200Var2 = (s200) ((n5d0) nc0Var.c).get();
                s200Var2.getClass();
                return new htu(s200Var2);
            case 7:
                cr crVar = (cr) obj;
                if (b3 == 0) {
                    pru pruVarR = ((uii) ((iw20) crVar.c).f15470a).r();
                    sa10 sa10Var = (sa10) crVar.d;
                    diu diuVar = (diu) ((n5d0) crVar.b).get();
                    uqi0 uqi0Var = (uqi0) ((n5d0) crVar.q).get();
                    i1w0 i1w0Var3 = (i1w0) crVar.j;
                    m1e m1eVar4 = (m1e) crVar.k;
                    ctf0 ctf0Var4 = (ctf0) crVar.l;
                    mne mneVarH9 = ((psc) ((cad) crVar.m).b).h();
                    x1x.x(mneVarH9);
                    return new euz(pruVarR, sa10Var, diuVar, uqi0Var, i1w0Var3, m1eVar4, ctf0Var4, mneVarH9, (duj) crVar.n);
                }
                if (b3 == 1) {
                    s200 s200Var3 = (s200) ((n5d0) crVar.p).get();
                    s200Var3.getClass();
                    return new diu(s200Var3);
                }
                if (b3 == 2) {
                    return euw.o((gtz) crVar.e, (a200) ((n5d0) crVar.o).get(), (knf0) crVar.g, (btt0) crVar.h, (us00) crVar.i);
                }
                if (b3 == 3) {
                    gii0 gii0Var6 = (gii0) crVar.f;
                    gii0Var6.getClass();
                    return new a200(gii0Var6);
                }
                if (b3 != 4) {
                    c99.h(b3);
                    return null;
                }
                s200 s200Var4 = (s200) ((n5d0) crVar.p).get();
                s200Var4.getClass();
                return new uqi0(s200Var4);
            case 8:
                v7i v7iVar = (v7i) obj;
                if (b3 == 0) {
                    pru pruVarR2 = ((uii) ((iw20) v7iVar.i).f15470a).r();
                    sa10 sa10Var2 = (sa10) v7iVar.e;
                    zhu zhuVar = (zhu) ((n5d0) v7iVar.n).get();
                    i1w0 i1w0Var4 = (i1w0) v7iVar.f36925a;
                    m1e m1eVar5 = (m1e) v7iVar.d;
                    ctf0 ctf0Var5 = (ctf0) v7iVar.c;
                    mne mneVarH10 = ((psc) ((cad) v7iVar.h).b).h();
                    x1x.x(mneVarH10);
                    return new qvz(pruVarR2, sa10Var2, zhuVar, i1w0Var4, m1eVar5, ctf0Var5, mneVarH10, (duj) v7iVar.g);
                }
                if (b3 == 1) {
                    p200 p200Var2 = (p200) ((n5d0) v7iVar.b).get();
                    p200Var2.getClass();
                    return new zhu(p200Var2);
                }
                if (b3 == 2) {
                    return euw.l((dvz) v7iVar.f, (b200) ((n5d0) v7iVar.m).get(), (btt0) v7iVar.k, (knf0) v7iVar.l, (ctf0) v7iVar.c);
                }
                if (b3 != 3) {
                    c99.h(b3);
                    return null;
                }
                gii0 gii0Var7 = (gii0) v7iVar.j;
                gii0Var7.getClass();
                return new b200(gii0Var7);
            case 9:
                o3c o3cVar2 = (o3c) obj;
                if (b3 == 0) {
                    return euw.k((htz) o3cVar2.f24576a, (lwz) ((n5d0) o3cVar2.i).get(), (kwz) o3cVar2.c, (njo) o3cVar2.d, (btt0) o3cVar2.e, (ctf0) o3cVar2.f);
                }
                if (b3 == 1) {
                    gii0 gii0Var8 = (gii0) o3cVar2.b;
                    gii0Var8.getClass();
                    return new lwz(gii0Var8);
                }
                if (b3 != 2) {
                    c99.h(b3);
                    return null;
                }
                twz twzVar = (twz) ((n5d0) o3cVar2.j).get();
                twzVar.getClass();
                return new mhu(twzVar);
            case 10:
                cr crVar2 = (cr) obj;
                if (b3 == 0) {
                    return new pji(this);
                }
                if (b3 == 1) {
                    twz twzVar2 = (twz) ((n5d0) crVar2.b).get();
                    twzVar2.getClass();
                    return new mhu(twzVar2);
                }
                if (b3 == 2) {
                    return euw.k((htz) crVar2.c, (lwz) ((n5d0) crVar2.p).get(), (kwz) crVar2.e, (njo) crVar2.f, (btt0) crVar2.g, (ctf0) crVar2.h);
                }
                if (b3 != 3) {
                    c99.h(b3);
                    return null;
                }
                gii0 gii0Var9 = (gii0) crVar2.d;
                gii0Var9.getClass();
                return new lwz(gii0Var9);
            case 11:
                cr crVar3 = (cr) obj;
                if (b3 == 0) {
                    pru pruVarR3 = ((uii) ((iw20) crVar3.c).f15470a).r();
                    sa10 sa10Var3 = (sa10) crVar3.d;
                    aiu aiuVar = (aiu) ((n5d0) crVar3.b).get();
                    sqi0 sqi0Var = (sqi0) ((n5d0) crVar3.q).get();
                    i1w0 i1w0Var5 = (i1w0) crVar3.j;
                    m1e m1eVar6 = (m1e) crVar3.k;
                    ctf0 ctf0Var6 = (ctf0) crVar3.l;
                    mne mneVarH11 = ((psc) ((cad) crVar3.m).b).h();
                    x1x.x(mneVarH11);
                    return new bzz(pruVarR3, sa10Var3, aiuVar, sqi0Var, i1w0Var5, m1eVar6, ctf0Var6, mneVarH11, (duj) crVar3.n);
                }
                if (b3 == 1) {
                    q200 q200Var2 = (q200) ((n5d0) crVar3.p).get();
                    q200Var2.getClass();
                    return new aiu(q200Var2);
                }
                if (b3 == 2) {
                    return euw.m((jyz) crVar3.e, (c200) ((n5d0) crVar3.o).get(), (btt0) crVar3.g, (knf0) crVar3.h, (us00) crVar3.i);
                }
                if (b3 == 3) {
                    gii0 gii0Var10 = (gii0) crVar3.f;
                    gii0Var10.getClass();
                    return new c200(gii0Var10);
                }
                if (b3 != 4) {
                    c99.h(b3);
                    return null;
                }
                q200 q200Var3 = (q200) ((n5d0) crVar3.p).get();
                q200Var3.getClass();
                return new sqi0(q200Var3);
            case 12:
                o3c o3cVar3 = (o3c) obj;
                if (b3 == 0) {
                    w000 w000Var = (w000) o3cVar3.f24576a;
                    d200 d200Var = (d200) ((n5d0) o3cVar3.i).get();
                    ieu ieuVar = w000.f38324a;
                    x1x.y(ieuVar);
                    return euw.n(w000Var, d200Var, ieuVar, (btt0) o3cVar3.c, (knf0) o3cVar3.d, (us00) o3cVar3.e);
                }
                if (b3 == 1) {
                    gii0 gii0Var11 = (gii0) o3cVar3.b;
                    gii0Var11.getClass();
                    return new d200(gii0Var11);
                }
                if (b3 != 2) {
                    c99.h(b3);
                    return null;
                }
                r200 r200Var = (r200) ((n5d0) o3cVar3.j).get();
                r200Var.getClass();
                return new biu(r200Var);
            case 13:
                v5i v5iVar = (v5i) obj;
                switch (b3) {
                    case 0:
                        pru pruVarR4 = ((uii) ((iw20) v5iVar.e).f15470a).r();
                        ocl oclVar = (ocl) v5iVar.g;
                        biu biuVar = (biu) ((n5d0) v5iVar.q).get();
                        tqi0 tqi0Var = (tqi0) ((n5d0) v5iVar.r).get();
                        rti0 rti0Var = (rti0) ((n5d0) v5iVar.s).get();
                        i1w0 i1w0Var6 = (i1w0) v5iVar.f;
                        m1e m1eVar7 = (m1e) v5iVar.m;
                        ctf0 ctf0Var7 = (ctf0) v5iVar.b;
                        mne mneVarH12 = ((psc) ((cad) v5iVar.o).b).h();
                        x1x.x(mneVarH12);
                        return new p100(pruVarR4, oclVar, biuVar, tqi0Var, rti0Var, i1w0Var6, m1eVar7, ctf0Var7, mneVarH12, (duj) v5iVar.c, (rot) ((n5d0) v5iVar.t).get(), (msc) ((n5d0) v5iVar.u).get(), (lsc) ((n5d0) v5iVar.d).get());
                    case 1:
                        r200 r200Var2 = (r200) ((n5d0) v5iVar.p).get();
                        r200Var2.getClass();
                        return new biu(r200Var2);
                    case 2:
                        w000 w000Var2 = (w000) v5iVar.h;
                        d200 d200Var2 = (d200) ((n5d0) v5iVar.n).get();
                        ieu ieuVar2 = w000.f38324a;
                        x1x.y(ieuVar2);
                        return euw.n(w000Var2, d200Var2, ieuVar2, (btt0) v5iVar.j, (knf0) v5iVar.k, (us00) v5iVar.l);
                    case 3:
                        gii0 gii0Var12 = (gii0) v5iVar.i;
                        gii0Var12.getClass();
                        return new d200(gii0Var12);
                    case 4:
                        r200 r200Var3 = (r200) ((n5d0) v5iVar.p).get();
                        r200Var3.getClass();
                        return new tqi0(r200Var3);
                    case 5:
                        r200 r200Var4 = (r200) ((n5d0) v5iVar.p).get();
                        r200Var4.getClass();
                        return new rti0(r200Var4);
                    case 6:
                        r200 r200Var5 = (r200) ((n5d0) v5iVar.p).get();
                        r200Var5.getClass();
                        return new rot(r200Var5);
                    case 7:
                        r200 r200Var6 = (r200) ((n5d0) v5iVar.p).get();
                        r200Var6.getClass();
                        return new msc(r200Var6);
                    case 8:
                        r200 r200Var7 = (r200) ((n5d0) v5iVar.p).get();
                        r200Var7.getClass();
                        return new lsc(r200Var7);
                    default:
                        c99.h(b3);
                        return null;
                }
            case 14:
                nc0 nc0Var2 = (nc0) obj;
                if (b3 == 0) {
                    LimitNeGroupEnum limitNeGroupEnum = (LimitNeGroupEnum) ((yox) nc0Var2.d).f43005a;
                    bei0 bei0Var = (bei0) ((n5d0) nc0Var2.m).get();
                    i1w0 i1w0Var7 = (i1w0) nc0Var2.i;
                    ctf0 ctf0Var8 = (ctf0) nc0Var2.c;
                    mne mneVarH13 = ((psc) ((cad) nc0Var2.b).b).h();
                    x1x.x(mneVarH13);
                    return new v000(limitNeGroupEnum, bei0Var, i1w0Var7, ctf0Var8, mneVarH13, (duj) nc0Var2.j);
                }
                if (b3 == 1) {
                    r200 r200Var8 = (r200) ((n5d0) nc0Var2.l).get();
                    r200Var8.getClass();
                    return new bei0(r200Var8);
                }
                if (b3 == 2) {
                    w000 w000Var3 = (w000) nc0Var2.e;
                    d200 d200Var3 = (d200) ((n5d0) nc0Var2.k).get();
                    ieu ieuVar3 = w000.f38324a;
                    x1x.y(ieuVar3);
                    return euw.n(w000Var3, d200Var3, ieuVar3, (btt0) nc0Var2.g, (knf0) nc0Var2.f23267a, (us00) nc0Var2.h);
                }
                if (b3 != 3) {
                    c99.h(b3);
                    return null;
                }
                gii0 gii0Var13 = (gii0) nc0Var2.f;
                gii0Var13.getClass();
                return new d200(gii0Var13);
            case 15:
                cr crVar4 = (cr) obj;
                if (b3 == 0) {
                    return new sji(this);
                }
                if (b3 == 1) {
                    j400 j400Var = (j400) ((n5d0) crVar4.b).get();
                    j400Var.getClass();
                    return new shu(j400Var);
                }
                if (b3 != 2) {
                    if (b3 != 3) {
                        c99.h(b3);
                        return null;
                    }
                    gii0 gii0Var14 = (gii0) crVar4.d;
                    gii0Var14.getClass();
                    return new f400(gii0Var14);
                }
                wsz wszVar = (wsz) crVar4.c;
                f400 f400Var = (f400) ((n5d0) crVar4.p).get();
                btt0 btt0Var = (btt0) crVar4.e;
                e400 e400Var = (e400) crVar4.f;
                mne mneVarH14 = ((psc) ((cad) crVar4.g).b).h();
                x1x.x(mneVarH14);
                return euw.q(wszVar, f400Var, btt0Var, e400Var, mneVarH14, (kuy) crVar4.h);
            case 16:
                gr70 gr70Var = ((uji) obj).f;
                if (b3 == 0) {
                    return new tji(this);
                }
                if (b3 == 1) {
                    smu smuVarV = gr70Var.v();
                    x1x.x(smuVarV);
                    return smuVarV;
                }
                if (b3 != 2) {
                    c99.h(b3);
                    return null;
                }
                rmu rmuVarP = gr70Var.p();
                x1x.x(rmuVarP);
                return rmuVarP;
            case 17:
                aki akiVar = (aki) obj;
                switch (b3) {
                    case 0:
                        f310 f310Var = (f310) akiVar.e.get();
                        f310Var.getClass();
                        return new iju(f310Var);
                    case 1:
                        x010 x010Var = (x010) akiVar.d.get();
                        svu svuVar = new svu(akiVar.f1024a, (byte) 28);
                        knf0 knf0Var2 = akiVar.b;
                        mne mneVarH15 = ((psc) akiVar.c.b).h();
                        x1x.x(mneVarH15);
                        return new f310(x010Var, svuVar, knf0Var2, mneVarH15);
                    case 2:
                        x010 x010Var2 = new x010();
                        x010Var2.f40047a = q7m0.a(null);
                        return x010Var2;
                    case 3:
                        return new lju((f310) akiVar.e.get());
                    case 4:
                        return new cju((f310) akiVar.e.get());
                    case 5:
                        f310 f310Var2 = (f310) akiVar.e.get();
                        f310Var2.getClass();
                        return new rju(f310Var2);
                    case 6:
                        return new oju((f310) akiVar.e.get());
                    case 7:
                        return new stb0((f310) akiVar.e.get());
                    case 8:
                        return new fju((f310) akiVar.e.get());
                    default:
                        c99.h(b3);
                        return null;
                }
            case 18:
                if (b3 == 0) {
                    return new dki(this, b2);
                }
                if (b3 == 1) {
                    return new eki(this);
                }
                if (b3 != 2) {
                    c99.h(b3);
                    return null;
                }
                i910 i910Var = new i910();
                i910Var.f14367a = new gx90(0L, 0, 0, 0, iun.f15405a);
                return i910Var;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                v5i v5iVar2 = (v5i) obj;
                duj dujVar2 = (duj) v5iVar2.c;
                au0 au0Var = (au0) v5iVar2.n;
                zg zgVar = (zg) v5iVar2.m;
                gle0 gle0Var = (gle0) v5iVar2.l;
                x0u x0uVar = (x0u) v5iVar2.k;
                bzt bztVar = (bzt) v5iVar2.i;
                yfu yfuVar = (yfu) v5iVar2.h;
                cad cadVar2 = (cad) v5iVar2.o;
                LoyaltyProgramScreenParams loyaltyProgramScreenParams = (LoyaltyProgramScreenParams) v5iVar2.e;
                if (b3 == 0) {
                    mne mneVarH16 = ((psc) cadVar2.b).h();
                    x1x.x(mneVarH16);
                    sf10Var = new sf10(loyaltyProgramScreenParams, mneVarH16, new p4u((qi10) ((n5d0) v5iVar2.s).get()), new xfu((qi10) ((n5d0) v5iVar2.s).get()), new lrc((qi10) ((n5d0) v5iVar2.s).get()), yfuVar, bztVar, (wgu) v5iVar2.j, x0uVar, (ctf0) v5iVar2.b, gle0Var, zgVar, au0Var, (m1e) v5iVar2.p, dujVar2, mbl.a((zix) v5iVar2.t), mbl.a((zix) v5iVar2.u));
                } else {
                    if (b3 == 1) {
                        return new qi10(new pyu((gii0) v5iVar2.f, (byte) 22), (btt0) v5iVar2.g);
                    }
                    if (b3 != 2) {
                        c99.h(b3);
                        return null;
                    }
                    mne mneVarH17 = ((psc) cadVar2.b).h();
                    x1x.x(mneVarH17);
                    sf10Var = new ph10(loyaltyProgramScreenParams, mneVarH17, new p4u((qi10) ((n5d0) v5iVar2.s).get()), new xfu((qi10) ((n5d0) v5iVar2.s).get()), new lrc((qi10) ((n5d0) v5iVar2.s).get()), yfuVar, bztVar, (wgu) v5iVar2.j, x0uVar, (ctf0) v5iVar2.b, gle0Var, zgVar, au0Var, (m1e) v5iVar2.p, (uf3) v5iVar2.q, dujVar2, mbl.a((zix) v5iVar2.t), mbl.a((zix) v5iVar2.u));
                }
                return sf10Var;
            case 20:
                return a();
            case 21:
                return b();
            case 22:
                zki zkiVar = (zki) obj;
                if (b3 == 0) {
                    return new o720(new yfu(zkiVar.a()), zkiVar.g);
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        return new yki(this);
                    }
                    c99.h(b3);
                    return null;
                }
                pwi pwiVarC = zkiVar.c();
                yfu yfuVar2 = new yfu(zkiVar.a());
                buo0 buo0Var = zkiVar.n;
                drt drtVarB = zkiVar.b();
                bn6 bn6Var = zkiVar.o;
                duj dujVar3 = zkiVar.p;
                au0 au0Var2 = zkiVar.q;
                mne mneVarH18 = ((psc) zkiVar.e.b).h();
                x1x.x(mneVarH18);
                return new y920(pwiVarC, yfuVar2, buo0Var, drtVarB, bn6Var, dujVar3, au0Var2, mneVarH18, ((g45) zkiVar.l.b).P(), zkiVar.g, zkiVar.r);
            case 23:
                mki mkiVar = (mki) obj;
                onv onvVar = (onv) mkiVar.y;
                wsf0 wsf0Var = (wsf0) mkiVar.g;
                if (b3 == 0) {
                    return new bli(this);
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        return new cli(this);
                    }
                    c99.h(b3);
                    return null;
                }
                m0k0 m0k0Var = (m0k0) mkiVar.c;
                phf0 phf0VarX = ((g45) wsf0Var.b).x();
                g320 g320VarJ = ((o3c) ((bzu) mkiVar.m).b).j();
                nhf0 nhf0VarS = mkiVar.s();
                zlt0 zlt0Var = (zlt0) mkiVar.k;
                nw20 nw20VarD = ((iip) mkiVar.o).d();
                mne mneVarH19 = ((psc) ((cad) mkiVar.e).b).h();
                x1x.x(mneVarH19);
                return new g7c0(m0k0Var, phf0VarX, g320VarJ, nhf0VarS, zlt0Var, nw20VarD, mneVarH19, (ctf0) mkiVar.l, ((g45) wsf0Var.b).f(), (duj) mkiVar.d, ((daf) onvVar.f25567a).k(), ((daf) onvVar.f25567a).e(), (ouu) mkiVar.z, (mii0) mkiVar.E, new f3c(new h03((nb7) mkiVar.x)), ((g45) wsf0Var.b).E(), (ms2) mkiVar.C, (m1e) mkiVar.s, ((d1p) mkiVar.F).Z(), new yo4((kt2) mkiVar.G, (byte) 8), (vqc) mkiVar.H, (pru) mkiVar.n, new x1u((gst0) mkiVar.p, (byte) 1), (edo) mkiVar.K);
            case 24:
                return c();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return d();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return e();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return f();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return g();
            default:
                fmi fmiVar = (fmi) obj;
                if (b3 == 0) {
                    return new y560(fmiVar.f9783a, (bmu) fmiVar.n.get(), fmiVar.e, fmiVar.f, fmiVar.g, fmiVar.h, fmiVar.i, fmiVar.j, fmiVar.k);
                }
                if (b3 == 1) {
                    k560 k560Var = (k560) fmiVar.m.get();
                    k560Var.getClass();
                    return new bmu(k560Var);
                }
                if (b3 != 2) {
                    c99.h(b3);
                    return null;
                }
                btt0 btt0Var2 = fmiVar.b;
                knf0 knf0Var3 = fmiVar.c;
                kuy kuyVar = fmiVar.d;
                btt0Var2.getClass();
                knf0Var3.getClass();
                kuyVar.getClass();
                return new k560(btt0Var2, knf0Var3, kuyVar);
        }
    }
}
