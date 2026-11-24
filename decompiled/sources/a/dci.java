package a;

import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.ufc.api.championship.UfcChampionshipParams;

/* JADX INFO: loaded from: classes5.dex */
public final class dci implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5848a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ dci(Object obj, int i, byte b) {
        this.f5848a = b;
        this.c = obj;
        this.b = i;
    }

    private final Object a() {
        qdi qdiVar = (qdi) this.c;
        byte b = 2;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new i6i(this, b);
            case 1:
                sek sekVar = qdiVar.b;
                s7t0 s7t0Var = (s7t0) qdiVar.C.get();
                pbt pbtVarL2 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL2);
                return i5t.r(sekVar, s7t0Var, pbtVarL2);
            case 2:
                sek sekVar2 = qdiVar.b;
                g8i g8iVar = qdiVar.f28534a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                d3c d3cVar = (d3c) qdiVar.d.get();
                fq fqVar = (fq) qdiVar.w.get();
                qpt qptVar = (qpt) qdiVar.x.get();
                gmt gmtVar = (gmt) qdiVar.i.get();
                rgs rgsVar = (rgs) qdiVar.B.get();
                r9u r9uVarH4 = g8iVar.h4();
                x1x.x(r9uVarH4);
                return i5t.C(sekVar2, pbtVarL3, d3cVar, fqVar, qptVar, gmtVar, rgsVar, r9uVarH4);
            case 3:
                sek sekVar3 = qdiVar.b;
                pbt pbtVarL4 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL4);
                return new d3c(pbtVarL4);
            case 4:
                sek sekVar4 = qdiVar.b;
                lzt lztVar = (lzt) qdiVar.e.get();
                zmi0 zmi0Var = (zmi0) qdiVar.f.get();
                pbt pbtVarL5 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL5);
                return mkg.g(sekVar4, lztVar, zmi0Var, pbtVarL5, (xyb) qdiVar.g.get(), (yyb) qdiVar.k.get(), (fpi0) qdiVar.l.get(), (nqt) qdiVar.m.get(), (spx) qdiVar.n.get(), (oqt) qdiVar.o.get(), (hni0) qdiVar.p.get(), (vcu) qdiVar.q.get(), (d3c) qdiVar.d.get(), (wni0) qdiVar.r.get(), (ztt) qdiVar.j.get(), (pqt) qdiVar.s.get(), (itt) qdiVar.t.get(), (q78) qdiVar.u.get(), (gmt) qdiVar.i.get(), (ecs) qdiVar.v.get());
            case 5:
                sek sekVar5 = qdiVar.b;
                g8i g8iVar2 = qdiVar.f28534a;
                pbt pbtVarL6 = g8iVar2.L2();
                x1x.x(pbtVarL6);
                m1e m1eVarQ1 = g8iVar2.q1();
                x1x.x(m1eVarQ1);
                return new lzt(pbtVarL6, m1eVarQ1);
            case 6:
                sek sekVar6 = qdiVar.b;
                pbt pbtVarL7 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL7);
                return new zmi0(pbtVarL7);
            case 7:
                sek sekVar7 = qdiVar.b;
                pbt pbtVarL8 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL8);
                return new xyb(pbtVarL8);
            case 8:
                sek sekVar8 = qdiVar.b;
                k1u k1uVar = (k1u) qdiVar.h.get();
                gmt gmtVar2 = (gmt) qdiVar.i.get();
                ztt zttVar = (ztt) qdiVar.j.get();
                pbt pbtVarL9 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL9);
                return i5t.a(sekVar8, k1uVar, gmtVar2, zttVar, pbtVarL9);
            case 9:
                sek sekVar9 = qdiVar.b;
                return new k1u(qdiVar.b());
            case 10:
                sek sekVar10 = qdiVar.b;
                pbt pbtVarL10 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL10);
                return new gmt(pbtVarL10);
            case 11:
                sek sekVar11 = qdiVar.b;
                pbt pbtVarL11 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL11);
                return new ztt(pbtVarL11);
            case 12:
                sek sekVar12 = qdiVar.b;
                pbt pbtVarL12 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL12);
                return new fpi0(pbtVarL12);
            case 13:
                sek sekVar13 = qdiVar.b;
                pbt pbtVarL13 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL13);
                return new nqt(pbtVarL13);
            case 14:
                sek sekVar14 = qdiVar.b;
                pbt pbtVarL14 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL14);
                return new spx(pbtVarL14);
            case 15:
                sek sekVar15 = qdiVar.b;
                pbt pbtVarL15 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL15);
                return new oqt(pbtVarL15);
            case 16:
                sek sekVar16 = qdiVar.b;
                pbt pbtVarL16 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL16);
                return new hni0(pbtVarL16);
            case 17:
                sek sekVar17 = qdiVar.b;
                pbt pbtVarL17 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL17);
                return new vcu(pbtVarL17);
            case 18:
                sek sekVar18 = qdiVar.b;
                pbt pbtVarL18 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL18);
                return new wni0(pbtVarL18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar19 = qdiVar.b;
                pbt pbtVarL19 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL19);
                return new pqt(pbtVarL19);
            case 20:
                sek sekVar20 = qdiVar.b;
                pbt pbtVarL20 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL20);
                return new itt(pbtVarL20);
            case 21:
                sek sekVar21 = qdiVar.b;
                pbt pbtVarL21 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL21);
                return new q78(pbtVarL21);
            case 22:
                sek sekVar22 = qdiVar.b;
                pbt pbtVarL22 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL22);
                return new ecs(pbtVarL22);
            case 23:
                sek sekVar23 = qdiVar.b;
                pbt pbtVarL23 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL23);
                return new qpt(pbtVarL23);
            case 24:
                sek sekVar24 = qdiVar.b;
                fq fqVar2 = (fq) qdiVar.w.get();
                fqx fqxVar = (fqx) qdiVar.y.get();
                wox woxVar = (wox) qdiVar.z.get();
                return i5t.g(fqVar2, sekVar24, (qpt) qdiVar.x.get(), (r8u) qdiVar.A.get(), woxVar, fqxVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar25 = qdiVar.b;
                pbt pbtVarL24 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL24);
                return new fqx(pbtVarL24);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar26 = qdiVar.b;
                pbt pbtVarL25 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL25);
                return new wox(pbtVarL25);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar27 = qdiVar.b;
                pbt pbtVarL26 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL26);
                return new r8u(pbtVarL26);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                sek sekVar28 = qdiVar.b;
                pbt pbtVarL27 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL27);
                return new qa60(pbtVarL27);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar29 = qdiVar.b;
                pbt pbtVarL28 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL28);
                return new ipi0(pbtVarL28);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                sek sekVar30 = qdiVar.b;
                pbt pbtVarL29 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL29);
                return new xsi0(pbtVarL29);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                sek sekVar31 = qdiVar.b;
                pbt pbtVarL30 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL30);
                return new gpx(pbtVarL30);
            case 32:
                sek sekVar32 = qdiVar.b;
                pbt pbtVarL31 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL31);
                return new vni0(pbtVarL31);
            case 33:
                sek sekVar33 = qdiVar.b;
                pbt pbtVarL32 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL32);
                return new hs(pbtVarL32);
            case 34:
                sek sekVar34 = qdiVar.b;
                pbt pbtVarL33 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL33);
                return new eni0(pbtVarL33);
            case 35:
                return i5t.z(qdiVar.b, (aws) qdiVar.L.get());
            case 36:
                sek sekVar35 = qdiVar.b;
                yvs yvsVarG2 = qdiVar.f28534a.G2();
                x1x.x(yvsVarG2);
                return new aws(yvsVarG2);
            case 37:
                sek sekVar36 = qdiVar.b;
                pbt pbtVarL34 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL34);
                return new hj50(pbtVarL34);
            case 38:
                sek sekVar37 = qdiVar.b;
                pbt pbtVarL35 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL35);
                return new qhf0(pbtVarL35);
            case 39:
                return i5t.d(qdiVar.b, (foi0) qdiVar.P.get(), (fq) qdiVar.w.get());
            case 40:
                sek sekVar38 = qdiVar.b;
                pbt pbtVarL36 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL36);
                return new foi0(pbtVarL36);
            case 41:
                sek sekVar39 = qdiVar.b;
                fq fqVar3 = (fq) qdiVar.w.get();
                r8u r8uVar = (r8u) qdiVar.A.get();
                return i5t.B(fqVar3, sekVar39, (qpt) qdiVar.x.get(), r8uVar, (wox) qdiVar.z.get(), (fqx) qdiVar.y.get());
            case 42:
                return new y5s(s470.CRYSTAL, true, false, false, false, true, 448);
            case 43:
                return i5t.b(qdiVar.b, (fq) qdiVar.w.get(), (fqx) qdiVar.y.get());
            case 44:
                return i5t.c(qdiVar.b, (aws) qdiVar.L.get());
            case 45:
                sek sekVar40 = qdiVar.b;
                pbt pbtVarL37 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL37);
                return new hsj0(pbtVarL37);
            case 46:
                sek sekVar41 = qdiVar.b;
                g8i g8iVar3 = qdiVar.f28534a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL38 = g8iVar3.L2();
                x1x.x(pbtVarL38);
                return new t0u(pbtVarL38, wsf0VarF0);
            case 47:
                sek sekVar42 = qdiVar.b;
                pbt pbtVarL39 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL39);
                return new tbu(pbtVarL39);
            case 48:
                return i5t.f(qdiVar.b, (a6s) qdiVar.Y.get());
            case 49:
                return i5t.e(qdiVar.b);
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                return new pdi(this);
            case 51:
                vgf vgfVar = (vgf) qdiVar.d0.get();
                pbt pbtVarL40 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL40);
                vgfVar.getClass();
                return new d920(vgfVar, pbtVarL40);
            case 52:
                btt0 btt0VarO8 = qdiVar.f28534a.o8();
                x1x.x(btt0VarO8);
                tgf tgfVar = (tgf) qdiVar.b0.get();
                fgf fgfVar = (fgf) qdiVar.c0.get();
                new j6m0((byte) 2);
                new usd(new nwd(new kys0((byte) 15)));
                kwd kwdVar = new kwd();
                kud kudVar = new kud();
                tgfVar.getClass();
                fgfVar.getClass();
                return new vgf(btt0VarO8, tgfVar, fgfVar, kwdVar, kudVar);
            case 53:
                gii0 gii0VarJ9 = qdiVar.f28534a.j9();
                x1x.x(gii0VarJ9);
                return new tgf(gii0VarJ9);
            case 54:
                fgf fgfVar2 = new fgf();
                fgfVar2.f9489a = new lgf();
                return fgfVar2;
            case 55:
                vgf vgfVar2 = (vgf) qdiVar.d0.get();
                vgfVar2.getClass();
                return new zwf0(vgfVar2);
            case 56:
                return i5t.A(qdiVar.b, (fq) qdiVar.w.get(), qdiVar.f28534a.f0(), (g9c) qdiVar.g0.get(), (itt) qdiVar.t.get(), (yyb) qdiVar.k.get(), (lg60) qdiVar.i0.get());
            case 57:
                sek sekVar43 = qdiVar.b;
                pbt pbtVarL41 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL41);
                return new g9c(pbtVarL41);
            case 58:
                sek sekVar44 = qdiVar.b;
                qni0 qni0Var = (qni0) qdiVar.h0.get();
                pbt pbtVarL42 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL42);
                return i5t.v(sekVar44, qni0Var, pbtVarL42);
            case 59:
                sek sekVar45 = qdiVar.b;
                pbt pbtVarL43 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL43);
                return new qni0(pbtVarL43);
            default:
                c99.h(b2);
                return null;
        }
    }

    private final Object b() {
        v7i v7iVar = (v7i) this.c;
        byte b = this.b;
        if (b == 0) {
            return new qah(new nw20((gii0) v7iVar.i, (byte) 12), new sd60((byte) 2));
        }
        if (b == 1) {
            return new wrh(new h03((q7d0) v7iVar.g));
        }
        if (b == 2) {
            return new njg((qjg) v7iVar.c, new ojg((byte) 0), (knf0) v7iVar.d);
        }
        c99.h(b);
        return null;
    }

    private final Object c() {
        pei peiVar = (pei) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new dzg(new clc(peiVar.f26854a, (byte) 18), new nhf0());
            case 1:
                return new uzg(peiVar.b, new vqc((Object) new kud(), (byte) 14), new ih5(peiVar.c, (byte) 1), peiVar.d, peiVar.e, new gle0(), ((daf) peiVar.f.f30839a).Z(), peiVar.g, peiVar.h, peiVar.i, peiVar.j, peiVar.k, peiVar.l);
            case 2:
                return new tcg();
            case 3:
                return new dih(new cih(peiVar.n, (byte) 0));
            case 4:
                return new dhg((chg) peiVar.t.get());
            case 5:
                return new chg();
            case 6:
                return new ucb0((rcb0) peiVar.v.get(), new pv00(peiVar.f26854a));
            case 7:
                return new rcb0();
            case 8:
                ((lmb) peiVar.x.get()).getClass();
                return new cl5((byte) 21);
            case 9:
                lmb lmbVar = new lmb();
                q7m0.a(Boolean.FALSE);
                return lmbVar;
            case 10:
                return new dqu(peiVar.q());
            case 11:
                ((ykh) peiVar.z.get()).getClass();
                return new gst();
            case 12:
                yzn0 yzn0Var = new yzn0(peiVar.f26854a, (byte) 26);
                sjh sjhVar = new sjh();
                sjhVar.f32303a = new or30();
                return new ykh(yzn0Var, sjhVar, peiVar.o);
            case 13:
                return new ryb((ykh) peiVar.z.get());
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object d() {
        wei weiVar = (wei) this.c;
        byte b = this.b;
        if (b == 0) {
            return new dwu((ram0) weiVar.d.get());
        }
        if (b == 1) {
            qam0 qam0Var = (qam0) weiVar.c.get();
            qam0Var.getClass();
            return new ram0(qam0Var);
        }
        if (b == 2) {
            q7d0 q7d0Var = weiVar.f39020a;
            vby vbyVar = weiVar.b;
            q7d0Var.getClass();
            vbyVar.getClass();
            return new qam0(vbyVar, q7d0Var);
        }
        if (b == 3) {
            return new ewu((ram0) weiVar.d.get());
        }
        if (b == 4) {
            return new zsi0((ram0) weiVar.d.get());
        }
        if (b == 5) {
            return new qgh();
        }
        c99.h(b);
        return null;
    }

    private final Object e() {
        gbi gbiVar = (gbi) this.c;
        gii0 gii0Var = (gii0) gbiVar.k;
        byte b = this.b;
        switch (b) {
            case 0:
                return new ffi(this);
            case 1:
                twz twzVar = (twz) ((n5d0) gbiVar.c).get();
                twzVar.getClass();
                return new toi0(twzVar);
            case 2:
                return euw.k((htz) gbiVar.j, (lwz) ((n5d0) gbiVar.b).get(), (kwz) gbiVar.l, (njo) gbiVar.m, (btt0) gbiVar.n, (ctf0) gbiVar.o);
            case 3:
                gii0Var.getClass();
                return new lwz(gii0Var);
            case 4:
                yjr yjrVar = (yjr) ((n5d0) gbiVar.f).get();
                yjrVar.getClass();
                return new yoi0(yjrVar);
            case 5:
                ojo ojoVar = (ojo) ((n5d0) gbiVar.e).get();
                njo njoVar = (njo) gbiVar.m;
                btt0 btt0Var = (btt0) gbiVar.n;
                ojoVar.getClass();
                njoVar.getClass();
                btt0Var.getClass();
                return new yjr(ojoVar, njoVar, btt0Var);
            case 6:
                gii0Var.getClass();
                return new ojo(gii0Var);
            case 7:
                twz twzVar2 = (twz) ((n5d0) gbiVar.c).get();
                twzVar2.getClass();
                return new jvt(twzVar2);
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object f() {
        qv2 qv2Var = (qv2) this.c;
        byte b = this.b;
        if (b == 0) {
            cei0 cei0Var = (cei0) ((n5d0) qv2Var.m).get();
            i1w0 i1w0Var = (i1w0) qv2Var.h;
            ctf0 ctf0Var = (ctf0) qv2Var.g;
            mne mneVarH = ((psc) ((cad) qv2Var.i).b).h();
            x1x.x(mneVarH);
            return new kbk(cei0Var, i1w0Var, ctf0Var, mneVarH, (duj) qv2Var.j);
        }
        if (b == 1) {
            twz twzVar = (twz) ((n5d0) qv2Var.l).get();
            twzVar.getClass();
            return new cei0(twzVar);
        }
        if (b == 2) {
            return euw.k((htz) qv2Var.b, (lwz) ((n5d0) qv2Var.k).get(), (kwz) qv2Var.d, (njo) qv2Var.e, (btt0) qv2Var.f, (ctf0) qv2Var.g);
        }
        if (b != 3) {
            c99.h(b);
            return null;
        }
        gii0 gii0Var = (gii0) qv2Var.c;
        gii0Var.getClass();
        return new lwz(gii0Var);
    }

    private final Object g() {
        pfi pfiVar = (pfi) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new i6i(this, (byte) 3);
            case 1:
                sek sekVar = pfiVar.b;
                s7t0 s7t0Var = (s7t0) pfiVar.D.get();
                pbt pbtVarL2 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL2);
                return i5t.r(sekVar, s7t0Var, pbtVarL2);
            case 2:
                sek sekVar2 = pfiVar.b;
                g8i g8iVar = pfiVar.f26907a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                d3c d3cVar = (d3c) pfiVar.e.get();
                fq fqVar = (fq) pfiVar.x.get();
                qpt qptVar = (qpt) pfiVar.y.get();
                gmt gmtVar = (gmt) pfiVar.j.get();
                rgs rgsVar = (rgs) pfiVar.C.get();
                r9u r9uVarH4 = g8iVar.h4();
                x1x.x(r9uVarH4);
                return i5t.C(sekVar2, pbtVarL3, d3cVar, fqVar, qptVar, gmtVar, rgsVar, r9uVarH4);
            case 3:
                sek sekVar3 = pfiVar.b;
                pbt pbtVarL4 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL4);
                return new d3c(pbtVarL4);
            case 4:
                sek sekVar4 = pfiVar.b;
                lzt lztVar = (lzt) pfiVar.f.get();
                zmi0 zmi0Var = (zmi0) pfiVar.g.get();
                pbt pbtVarL5 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL5);
                return mkg.g(sekVar4, lztVar, zmi0Var, pbtVarL5, (xyb) pfiVar.h.get(), (yyb) pfiVar.l.get(), (fpi0) pfiVar.m.get(), (nqt) pfiVar.n.get(), (spx) pfiVar.o.get(), (oqt) pfiVar.p.get(), (hni0) pfiVar.q.get(), (vcu) pfiVar.r.get(), (d3c) pfiVar.e.get(), (wni0) pfiVar.s.get(), (ztt) pfiVar.k.get(), (pqt) pfiVar.t.get(), (itt) pfiVar.u.get(), (q78) pfiVar.v.get(), (gmt) pfiVar.j.get(), (ecs) pfiVar.w.get());
            case 5:
                sek sekVar5 = pfiVar.b;
                g8i g8iVar2 = pfiVar.f26907a;
                pbt pbtVarL6 = g8iVar2.L2();
                x1x.x(pbtVarL6);
                m1e m1eVarQ1 = g8iVar2.q1();
                x1x.x(m1eVarQ1);
                return new lzt(pbtVarL6, m1eVarQ1);
            case 6:
                sek sekVar6 = pfiVar.b;
                pbt pbtVarL7 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL7);
                return new zmi0(pbtVarL7);
            case 7:
                sek sekVar7 = pfiVar.b;
                pbt pbtVarL8 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL8);
                return new xyb(pbtVarL8);
            case 8:
                sek sekVar8 = pfiVar.b;
                k1u k1uVar = (k1u) pfiVar.i.get();
                gmt gmtVar2 = (gmt) pfiVar.j.get();
                ztt zttVar = (ztt) pfiVar.k.get();
                pbt pbtVarL9 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL9);
                return i5t.a(sekVar8, k1uVar, gmtVar2, zttVar, pbtVarL9);
            case 9:
                sek sekVar9 = pfiVar.b;
                return new k1u(pfiVar.b());
            case 10:
                sek sekVar10 = pfiVar.b;
                pbt pbtVarL10 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL10);
                return new gmt(pbtVarL10);
            case 11:
                sek sekVar11 = pfiVar.b;
                pbt pbtVarL11 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL11);
                return new ztt(pbtVarL11);
            case 12:
                sek sekVar12 = pfiVar.b;
                pbt pbtVarL12 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL12);
                return new fpi0(pbtVarL12);
            case 13:
                sek sekVar13 = pfiVar.b;
                pbt pbtVarL13 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL13);
                return new nqt(pbtVarL13);
            case 14:
                sek sekVar14 = pfiVar.b;
                pbt pbtVarL14 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL14);
                return new spx(pbtVarL14);
            case 15:
                sek sekVar15 = pfiVar.b;
                pbt pbtVarL15 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL15);
                return new oqt(pbtVarL15);
            case 16:
                sek sekVar16 = pfiVar.b;
                pbt pbtVarL16 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL16);
                return new hni0(pbtVarL16);
            case 17:
                sek sekVar17 = pfiVar.b;
                pbt pbtVarL17 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL17);
                return new vcu(pbtVarL17);
            case 18:
                sek sekVar18 = pfiVar.b;
                pbt pbtVarL18 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL18);
                return new wni0(pbtVarL18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar19 = pfiVar.b;
                pbt pbtVarL19 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL19);
                return new pqt(pbtVarL19);
            case 20:
                sek sekVar20 = pfiVar.b;
                pbt pbtVarL20 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL20);
                return new itt(pbtVarL20);
            case 21:
                sek sekVar21 = pfiVar.b;
                pbt pbtVarL21 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL21);
                return new q78(pbtVarL21);
            case 22:
                sek sekVar22 = pfiVar.b;
                pbt pbtVarL22 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL22);
                return new ecs(pbtVarL22);
            case 23:
                sek sekVar23 = pfiVar.b;
                pbt pbtVarL23 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL23);
                return new qpt(pbtVarL23);
            case 24:
                sek sekVar24 = pfiVar.b;
                fq fqVar2 = (fq) pfiVar.x.get();
                fqx fqxVar = (fqx) pfiVar.z.get();
                wox woxVar = (wox) pfiVar.A.get();
                return i5t.g(fqVar2, sekVar24, (qpt) pfiVar.y.get(), (r8u) pfiVar.B.get(), woxVar, fqxVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar25 = pfiVar.b;
                pbt pbtVarL24 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL24);
                return new fqx(pbtVarL24);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar26 = pfiVar.b;
                pbt pbtVarL25 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL25);
                return new wox(pbtVarL25);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar27 = pfiVar.b;
                pbt pbtVarL26 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL26);
                return new r8u(pbtVarL26);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                sek sekVar28 = pfiVar.b;
                pbt pbtVarL27 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL27);
                return new qa60(pbtVarL27);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar29 = pfiVar.b;
                pbt pbtVarL28 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL28);
                return new ipi0(pbtVarL28);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                sek sekVar30 = pfiVar.b;
                pbt pbtVarL29 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL29);
                return new xsi0(pbtVarL29);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                sek sekVar31 = pfiVar.b;
                pbt pbtVarL30 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL30);
                return new gpx(pbtVarL30);
            case 32:
                sek sekVar32 = pfiVar.b;
                pbt pbtVarL31 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL31);
                return new vni0(pbtVarL31);
            case 33:
                sek sekVar33 = pfiVar.b;
                pbt pbtVarL32 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL32);
                return new hs(pbtVarL32);
            case 34:
                sek sekVar34 = pfiVar.b;
                pbt pbtVarL33 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL33);
                return new eni0(pbtVarL33);
            case 35:
                return i5t.z(pfiVar.b, (aws) pfiVar.M.get());
            case 36:
                sek sekVar35 = pfiVar.b;
                yvs yvsVarG2 = pfiVar.f26907a.G2();
                x1x.x(yvsVarG2);
                return new aws(yvsVarG2);
            case 37:
                sek sekVar36 = pfiVar.b;
                pbt pbtVarL34 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL34);
                return new hj50(pbtVarL34);
            case 38:
                sek sekVar37 = pfiVar.b;
                pbt pbtVarL35 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL35);
                return new qhf0(pbtVarL35);
            case 39:
                return i5t.d(pfiVar.b, (foi0) pfiVar.Q.get(), (fq) pfiVar.x.get());
            case 40:
                sek sekVar38 = pfiVar.b;
                pbt pbtVarL36 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL36);
                return new foi0(pbtVarL36);
            case 41:
                sek sekVar39 = pfiVar.b;
                fq fqVar3 = (fq) pfiVar.x.get();
                r8u r8uVar = (r8u) pfiVar.B.get();
                return i5t.B(fqVar3, sekVar39, (qpt) pfiVar.y.get(), r8uVar, (wox) pfiVar.A.get(), (fqx) pfiVar.z.get());
            case 42:
                bek bekVar = pfiVar.c;
                return new y5s(s470.DOMINO, false, true, false, false, false, 448);
            case 43:
                return i5t.b(pfiVar.b, (fq) pfiVar.x.get(), (fqx) pfiVar.z.get());
            case 44:
                return i5t.c(pfiVar.b, (aws) pfiVar.M.get());
            case 45:
                sek sekVar40 = pfiVar.b;
                pbt pbtVarL37 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL37);
                return new hsj0(pbtVarL37);
            case 46:
                sek sekVar41 = pfiVar.b;
                g8i g8iVar3 = pfiVar.f26907a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL38 = g8iVar3.L2();
                x1x.x(pbtVarL38);
                return new t0u(pbtVarL38, wsf0VarF0);
            case 47:
                sek sekVar42 = pfiVar.b;
                pbt pbtVarL39 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL39);
                return new tbu(pbtVarL39);
            case 48:
                return i5t.f(pfiVar.b, (a6s) pfiVar.Z.get());
            case 49:
                return i5t.e(pfiVar.b);
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                return new l0l((qa60) pfiVar.F.get(), (xcc) pfiVar.U.get(), pfiVar.f26907a.v1(), (i5m0) pfiVar.f0.get(), (fq) pfiVar.x.get(), (s7t0) pfiVar.D.get(), (chu) pfiVar.j0.get(), (y7k0) pfiVar.k0.get(), (haf) pfiVar.l0.get(), (xuc) pfiVar.m0.get(), (ztt) pfiVar.k.get(), (e320) pfiVar.n0.get(), (bto0) pfiVar.o0.get(), (g1u) pfiVar.p0.get(), (ooi0) pfiVar.q0.get(), (qni0) pfiVar.d0.get(), (y5s) pfiVar.T.get());
            case 51:
                return i5t.A(pfiVar.b, (fq) pfiVar.x.get(), pfiVar.f26907a.f0(), (g9c) pfiVar.c0.get(), (itt) pfiVar.u.get(), (yyb) pfiVar.l.get(), (lg60) pfiVar.e0.get());
            case 52:
                sek sekVar43 = pfiVar.b;
                pbt pbtVarL40 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL40);
                return new g9c(pbtVarL40);
            case 53:
                sek sekVar44 = pfiVar.b;
                qni0 qni0Var = (qni0) pfiVar.d0.get();
                pbt pbtVarL41 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL41);
                return i5t.v(sekVar44, qni0Var, pbtVarL41);
            case 54:
                sek sekVar45 = pfiVar.b;
                pbt pbtVarL42 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL42);
                return new qni0(pbtVarL42);
            case 55:
                bek bekVar2 = pfiVar.c;
                v0l v0lVar = (v0l) pfiVar.i0.get();
                v0lVar.getClass();
                return new chu(v0lVar);
            case 56:
                bek bekVar3 = pfiVar.c;
                g8i g8iVar4 = pfiVar.f26907a;
                knf0 knf0VarJ8 = g8iVar4.J8();
                x1x.x(knf0VarJ8);
                o0l o0lVar = (o0l) pfiVar.g0.get();
                m0l m0lVar = (m0l) pfiVar.h0.get();
                btt0 btt0VarO8 = g8iVar4.o8();
                x1x.x(btt0VarO8);
                return new v0l(knf0VarJ8, o0lVar, m0lVar, btt0VarO8);
            case 57:
                bek bekVar4 = pfiVar.c;
                gii0 gii0VarJ9 = pfiVar.f26907a.j9();
                x1x.x(gii0VarJ9);
                return new o0l(gii0VarJ9);
            case 58:
                m0l m0lVar2 = new m0l();
                iun iunVar = iun.f15405a;
                m0lVar2.f20960a = new n0l(0, "", 0, iunVar, lnm0.b, 0, 0.0d, false, 0.0d, iunVar, iunVar, iunVar, 0, iunVar, csr.e, 0L, 0.0d, 0, 0.0d, false);
                return m0lVar2;
            case 59:
                bek bekVar5 = pfiVar.c;
                v0l v0lVar2 = (v0l) pfiVar.i0.get();
                v0lVar2.getClass();
                return new y7k0(v0lVar2);
            case 60:
                bek bekVar6 = pfiVar.c;
                v0l v0lVar3 = (v0l) pfiVar.i0.get();
                ztt zttVar2 = (ztt) pfiVar.k.get();
                itt ittVar = (itt) pfiVar.u.get();
                gmt gmtVar3 = (gmt) pfiVar.j.get();
                v0lVar3.getClass();
                zttVar2.getClass();
                ittVar.getClass();
                gmtVar3.getClass();
                return new haf(v0lVar3, zttVar2, ittVar, gmtVar3);
            case 61:
                bek bekVar7 = pfiVar.c;
                v0l v0lVar4 = (v0l) pfiVar.i0.get();
                v0lVar4.getClass();
                return new xuc(v0lVar4);
            case 62:
                bek bekVar8 = pfiVar.c;
                v0l v0lVar5 = (v0l) pfiVar.i0.get();
                v0lVar5.getClass();
                return new e320(v0lVar5);
            case 63:
                bek bekVar9 = pfiVar.c;
                v0l v0lVar6 = (v0l) pfiVar.i0.get();
                v0lVar6.getClass();
                return new bto0(v0lVar6);
            case 64:
                bek bekVar10 = pfiVar.c;
                v0l v0lVar7 = (v0l) pfiVar.i0.get();
                v0lVar7.getClass();
                return new g1u(v0lVar7);
            case 65:
                bek bekVar11 = pfiVar.c;
                v0l v0lVar8 = (v0l) pfiVar.i0.get();
                v0lVar8.getClass();
                return new ooi0(v0lVar8);
            case 66:
                return new ofi(this);
            case 67:
                sek sekVar46 = pfiVar.b;
                pbt pbtVarL43 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL43);
                return new dqx(pbtVarL43);
            case 68:
                sek sekVar47 = pfiVar.b;
                return new l1u(pfiVar.b());
            case 69:
                sek sekVar48 = pfiVar.b;
                l1u l1uVar = (l1u) pfiVar.t0.get();
                qni0 qni0Var2 = (qni0) pfiVar.d0.get();
                itt ittVar2 = (itt) pfiVar.u.get();
                pbt pbtVarL44 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL44);
                return mkg.i(sekVar48, l1uVar, qni0Var2, ittVar2, pbtVarL44);
            case 70:
                sek sekVar49 = pfiVar.b;
                return new slu(pfiVar.b(), pfiVar.f26907a.Qa());
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object h() {
        rfi rfiVar = (rfi) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                l6l l6lVar = (l6l) rfiVar.e.get();
                l6lVar.getClass();
                return new o6u(l6lVar);
            case 1:
                n5l n5lVar = (n5l) rfiVar.d.get();
                rrc rrcVar = new rrc(rfiVar.f30389a);
                knf0 knf0Var = rfiVar.b;
                mne mneVarH = ((psc) rfiVar.c.b).h();
                x1x.x(mneVarH);
                return new l6l(n5lVar, rrcVar, knf0Var, mneVarH);
            case 2:
                return new n5l();
            case 3:
                return new r6u((l6l) rfiVar.e.get());
            case 4:
                return new g6u((l6l) rfiVar.e.get());
            case 5:
                l6l l6lVar2 = (l6l) rfiVar.e.get();
                l6lVar2.getClass();
                return new z6u(l6lVar2);
            case 6:
                return new v6u((l6l) rfiVar.e.get());
            case 7:
                return new otb0((l6l) rfiVar.e.get());
            case 8:
                return new j6u((l6l) rfiVar.e.get());
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object i() {
        ufi ufiVar = (ufi) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new i6i(this, (byte) 4);
            case 1:
                sek sekVar = ufiVar.b;
                s7t0 s7t0Var = (s7t0) ufiVar.D.get();
                pbt pbtVarL2 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL2);
                return i5t.r(sekVar, s7t0Var, pbtVarL2);
            case 2:
                sek sekVar2 = ufiVar.b;
                g8i g8iVar = ufiVar.f35578a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                d3c d3cVar = (d3c) ufiVar.e.get();
                fq fqVar = (fq) ufiVar.x.get();
                qpt qptVar = (qpt) ufiVar.y.get();
                gmt gmtVar = (gmt) ufiVar.j.get();
                rgs rgsVar = (rgs) ufiVar.C.get();
                r9u r9uVarH4 = g8iVar.h4();
                x1x.x(r9uVarH4);
                return i5t.C(sekVar2, pbtVarL3, d3cVar, fqVar, qptVar, gmtVar, rgsVar, r9uVarH4);
            case 3:
                sek sekVar3 = ufiVar.b;
                pbt pbtVarL4 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL4);
                return new d3c(pbtVarL4);
            case 4:
                sek sekVar4 = ufiVar.b;
                lzt lztVar = (lzt) ufiVar.f.get();
                zmi0 zmi0Var = (zmi0) ufiVar.g.get();
                pbt pbtVarL5 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL5);
                return mkg.g(sekVar4, lztVar, zmi0Var, pbtVarL5, (xyb) ufiVar.h.get(), (yyb) ufiVar.l.get(), (fpi0) ufiVar.m.get(), (nqt) ufiVar.n.get(), (spx) ufiVar.o.get(), (oqt) ufiVar.p.get(), (hni0) ufiVar.q.get(), (vcu) ufiVar.r.get(), (d3c) ufiVar.e.get(), (wni0) ufiVar.s.get(), (ztt) ufiVar.k.get(), (pqt) ufiVar.t.get(), (itt) ufiVar.u.get(), (q78) ufiVar.v.get(), (gmt) ufiVar.j.get(), (ecs) ufiVar.w.get());
            case 5:
                sek sekVar5 = ufiVar.b;
                g8i g8iVar2 = ufiVar.f35578a;
                pbt pbtVarL6 = g8iVar2.L2();
                x1x.x(pbtVarL6);
                m1e m1eVarQ1 = g8iVar2.q1();
                x1x.x(m1eVarQ1);
                return new lzt(pbtVarL6, m1eVarQ1);
            case 6:
                sek sekVar6 = ufiVar.b;
                pbt pbtVarL7 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL7);
                return new zmi0(pbtVarL7);
            case 7:
                sek sekVar7 = ufiVar.b;
                pbt pbtVarL8 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL8);
                return new xyb(pbtVarL8);
            case 8:
                sek sekVar8 = ufiVar.b;
                k1u k1uVar = (k1u) ufiVar.i.get();
                gmt gmtVar2 = (gmt) ufiVar.j.get();
                ztt zttVar = (ztt) ufiVar.k.get();
                pbt pbtVarL9 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL9);
                return i5t.a(sekVar8, k1uVar, gmtVar2, zttVar, pbtVarL9);
            case 9:
                sek sekVar9 = ufiVar.b;
                return new k1u(ufiVar.b());
            case 10:
                sek sekVar10 = ufiVar.b;
                pbt pbtVarL10 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL10);
                return new gmt(pbtVarL10);
            case 11:
                sek sekVar11 = ufiVar.b;
                pbt pbtVarL11 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL11);
                return new ztt(pbtVarL11);
            case 12:
                sek sekVar12 = ufiVar.b;
                pbt pbtVarL12 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL12);
                return new fpi0(pbtVarL12);
            case 13:
                sek sekVar13 = ufiVar.b;
                pbt pbtVarL13 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL13);
                return new nqt(pbtVarL13);
            case 14:
                sek sekVar14 = ufiVar.b;
                pbt pbtVarL14 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL14);
                return new spx(pbtVarL14);
            case 15:
                sek sekVar15 = ufiVar.b;
                pbt pbtVarL15 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL15);
                return new oqt(pbtVarL15);
            case 16:
                sek sekVar16 = ufiVar.b;
                pbt pbtVarL16 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL16);
                return new hni0(pbtVarL16);
            case 17:
                sek sekVar17 = ufiVar.b;
                pbt pbtVarL17 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL17);
                return new vcu(pbtVarL17);
            case 18:
                sek sekVar18 = ufiVar.b;
                pbt pbtVarL18 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL18);
                return new wni0(pbtVarL18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar19 = ufiVar.b;
                pbt pbtVarL19 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL19);
                return new pqt(pbtVarL19);
            case 20:
                sek sekVar20 = ufiVar.b;
                pbt pbtVarL20 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL20);
                return new itt(pbtVarL20);
            case 21:
                sek sekVar21 = ufiVar.b;
                pbt pbtVarL21 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL21);
                return new q78(pbtVarL21);
            case 22:
                sek sekVar22 = ufiVar.b;
                pbt pbtVarL22 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL22);
                return new ecs(pbtVarL22);
            case 23:
                sek sekVar23 = ufiVar.b;
                pbt pbtVarL23 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL23);
                return new qpt(pbtVarL23);
            case 24:
                sek sekVar24 = ufiVar.b;
                fq fqVar2 = (fq) ufiVar.x.get();
                fqx fqxVar = (fqx) ufiVar.z.get();
                wox woxVar = (wox) ufiVar.A.get();
                return i5t.g(fqVar2, sekVar24, (qpt) ufiVar.y.get(), (r8u) ufiVar.B.get(), woxVar, fqxVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar25 = ufiVar.b;
                pbt pbtVarL24 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL24);
                return new fqx(pbtVarL24);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar26 = ufiVar.b;
                pbt pbtVarL25 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL25);
                return new wox(pbtVarL25);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar27 = ufiVar.b;
                pbt pbtVarL26 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL26);
                return new r8u(pbtVarL26);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                sek sekVar28 = ufiVar.b;
                pbt pbtVarL27 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL27);
                return new qa60(pbtVarL27);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar29 = ufiVar.b;
                pbt pbtVarL28 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL28);
                return new ipi0(pbtVarL28);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                sek sekVar30 = ufiVar.b;
                pbt pbtVarL29 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL29);
                return new xsi0(pbtVarL29);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                sek sekVar31 = ufiVar.b;
                pbt pbtVarL30 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL30);
                return new gpx(pbtVarL30);
            case 32:
                sek sekVar32 = ufiVar.b;
                pbt pbtVarL31 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL31);
                return new vni0(pbtVarL31);
            case 33:
                sek sekVar33 = ufiVar.b;
                pbt pbtVarL32 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL32);
                return new hs(pbtVarL32);
            case 34:
                sek sekVar34 = ufiVar.b;
                pbt pbtVarL33 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL33);
                return new eni0(pbtVarL33);
            case 35:
                return i5t.z(ufiVar.b, (aws) ufiVar.M.get());
            case 36:
                sek sekVar35 = ufiVar.b;
                yvs yvsVarG2 = ufiVar.f35578a.G2();
                x1x.x(yvsVarG2);
                return new aws(yvsVarG2);
            case 37:
                sek sekVar36 = ufiVar.b;
                pbt pbtVarL34 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL34);
                return new hj50(pbtVarL34);
            case 38:
                sek sekVar37 = ufiVar.b;
                pbt pbtVarL35 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL35);
                return new qhf0(pbtVarL35);
            case 39:
                return i5t.d(ufiVar.b, (foi0) ufiVar.Q.get(), (fq) ufiVar.x.get());
            case 40:
                sek sekVar38 = ufiVar.b;
                pbt pbtVarL36 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL36);
                return new foi0(pbtVarL36);
            case 41:
                sek sekVar39 = ufiVar.b;
                fq fqVar3 = (fq) ufiVar.x.get();
                r8u r8uVar = (r8u) ufiVar.B.get();
                return i5t.B(fqVar3, sekVar39, (qpt) ufiVar.y.get(), r8uVar, (wox) ufiVar.A.get(), (fqx) ufiVar.z.get());
            case 42:
                sek sekVar40 = ufiVar.c;
                return new y5s(s470.DRAGON_GOLD, false, true, false, false, false, 448);
            case 43:
                return i5t.b(ufiVar.b, (fq) ufiVar.x.get(), (fqx) ufiVar.z.get());
            case 44:
                return i5t.c(ufiVar.b, (aws) ufiVar.M.get());
            case 45:
                sek sekVar41 = ufiVar.b;
                pbt pbtVarL37 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL37);
                return new hsj0(pbtVarL37);
            case 46:
                sek sekVar42 = ufiVar.b;
                g8i g8iVar3 = ufiVar.f35578a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL38 = g8iVar3.L2();
                x1x.x(pbtVarL38);
                return new t0u(pbtVarL38, wsf0VarF0);
            case 47:
                sek sekVar43 = ufiVar.b;
                pbt pbtVarL39 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL39);
                return new tbu(pbtVarL39);
            case 48:
                return i5t.f(ufiVar.b, (a6s) ufiVar.Z.get());
            case 49:
                return i5t.e(ufiVar.b);
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                xcc xccVar = (xcc) ufiVar.U.get();
                qa60 qa60Var = (qa60) ufiVar.F.get();
                d3c d3cVar2 = (d3c) ufiVar.e.get();
                lzt lztVar2 = (lzt) ufiVar.f.get();
                fpi0 fpi0Var = (fpi0) ufiVar.m.get();
                mne mneVarV1 = ufiVar.f35578a.v1();
                i5m0 i5m0Var = (i5m0) ufiVar.f0.get();
                fq fqVar4 = (fq) ufiVar.x.get();
                rrc rrcVar = new rrc((igl) ufiVar.h0.get());
                itt ittVar = (itt) ufiVar.u.get();
                gmt gmtVar3 = (gmt) ufiVar.j.get();
                ztt zttVar2 = (ztt) ufiVar.k.get();
                jcu jcuVar = (jcu) ufiVar.i0.get();
                ittVar.getClass();
                gmtVar3.getClass();
                zttVar2.getClass();
                jcuVar.getClass();
                gr00 gr00Var = new gr00();
                gr00Var.f11760a = rrcVar;
                gr00Var.b = ittVar;
                gr00Var.c = gmtVar3;
                gr00Var.d = zttVar2;
                gr00Var.e = jcuVar;
                s7t0 s7t0Var2 = (s7t0) ufiVar.D.get();
                igl iglVar = (igl) ufiVar.h0.get();
                y5s y5sVar = (y5s) ufiVar.T.get();
                iglVar.getClass();
                y5sVar.getClass();
                fhj fhjVar = new fhj();
                fhjVar.f9543a = iglVar;
                fhjVar.b = y5sVar;
                qni0 qni0Var = (qni0) ufiVar.d0.get();
                ecs ecsVar = (ecs) ufiVar.w.get();
                jtj jtjVar = new jtj((igl) ufiVar.h0.get(), (y5s) ufiVar.T.get());
                gmt gmtVar4 = (gmt) ufiVar.j.get();
                gmtVar4.getClass();
                fhj fhjVar2 = new fhj();
                fhjVar2.f9543a = jtjVar;
                fhjVar2.b = gmtVar4;
                iqi iqiVar = new iqi((igl) ufiVar.h0.get(), (y5s) ufiVar.T.get());
                gmt gmtVar5 = (gmt) ufiVar.j.get();
                gmtVar5.getClass();
                hsj hsjVar = new hsj();
                hsjVar.f13586a = iqiVar;
                hsjVar.b = gmtVar5;
                return new cgl(xccVar, qa60Var, d3cVar2, lztVar2, fpi0Var, mneVarV1, i5m0Var, fqVar4, gr00Var, s7t0Var2, fhjVar, qni0Var, ecsVar, fhjVar2, hsjVar, (ztt) ufiVar.k.get(), (t0u) ufiVar.X.get(), new uyn((igl) ufiVar.h0.get()), new r7v((igl) ufiVar.h0.get()), (vcu) ufiVar.r.get());
            case 51:
                return i5t.A(ufiVar.b, (fq) ufiVar.x.get(), ufiVar.f35578a.f0(), (g9c) ufiVar.c0.get(), (itt) ufiVar.u.get(), (yyb) ufiVar.l.get(), (lg60) ufiVar.e0.get());
            case 52:
                sek sekVar44 = ufiVar.b;
                pbt pbtVarL40 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL40);
                return new g9c(pbtVarL40);
            case 53:
                sek sekVar45 = ufiVar.b;
                qni0 qni0Var2 = (qni0) ufiVar.d0.get();
                pbt pbtVarL41 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL41);
                return i5t.v(sekVar45, qni0Var2, pbtVarL41);
            case 54:
                sek sekVar46 = ufiVar.b;
                pbt pbtVarL42 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL42);
                return new qni0(pbtVarL42);
            case 55:
                g8i g8iVar4 = ufiVar.f35578a;
                g8i g8iVar5 = ufiVar.f35578a;
                knf0 knf0VarJ8 = g8iVar4.J8();
                x1x.x(knf0VarJ8);
                dgl dglVar = (dgl) ufiVar.g0.get();
                gii0 gii0VarJ9 = g8iVar5.j9();
                x1x.x(gii0VarJ9);
                zri zriVar = new zri(gii0VarJ9, (byte) 7);
                btt0 btt0VarO8 = g8iVar5.o8();
                x1x.x(btt0VarO8);
                return new igl(knf0VarJ8, dglVar, zriVar, btt0VarO8);
            case 56:
                sek sekVar47 = ufiVar.c;
                dgl dglVar2 = new dgl();
                lnm0 lnm0Var = lnm0.b;
                iun iunVar = iun.f15405a;
                dglVar2.f6048a = new vgl(0L, 0, 0.0d, 0.0d, lnm0Var, 0.0d, iunVar, iunVar, iunVar, csr.e, iunVar);
                return dglVar2;
            case 57:
                sek sekVar48 = ufiVar.b;
                aws awsVar = (aws) ufiVar.M.get();
                awsVar.getClass();
                return new jcu(awsVar);
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object j() {
        xfi xfiVar = (xfi) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new i6i(this, (byte) 5);
            case 1:
                sek sekVar = xfiVar.b;
                s7t0 s7t0Var = (s7t0) xfiVar.D.get();
                pbt pbtVarL2 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL2);
                return i5t.r(sekVar, s7t0Var, pbtVarL2);
            case 2:
                sek sekVar2 = xfiVar.b;
                g8i g8iVar = xfiVar.f40791a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                d3c d3cVar = (d3c) xfiVar.e.get();
                fq fqVar = (fq) xfiVar.x.get();
                qpt qptVar = (qpt) xfiVar.y.get();
                gmt gmtVar = (gmt) xfiVar.j.get();
                rgs rgsVar = (rgs) xfiVar.C.get();
                r9u r9uVarH4 = g8iVar.h4();
                x1x.x(r9uVarH4);
                return i5t.C(sekVar2, pbtVarL3, d3cVar, fqVar, qptVar, gmtVar, rgsVar, r9uVarH4);
            case 3:
                sek sekVar3 = xfiVar.b;
                pbt pbtVarL4 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL4);
                return new d3c(pbtVarL4);
            case 4:
                sek sekVar4 = xfiVar.b;
                lzt lztVar = (lzt) xfiVar.f.get();
                zmi0 zmi0Var = (zmi0) xfiVar.g.get();
                pbt pbtVarL5 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL5);
                return mkg.g(sekVar4, lztVar, zmi0Var, pbtVarL5, (xyb) xfiVar.h.get(), (yyb) xfiVar.l.get(), (fpi0) xfiVar.m.get(), (nqt) xfiVar.n.get(), (spx) xfiVar.o.get(), (oqt) xfiVar.p.get(), (hni0) xfiVar.q.get(), (vcu) xfiVar.r.get(), (d3c) xfiVar.e.get(), (wni0) xfiVar.s.get(), (ztt) xfiVar.k.get(), (pqt) xfiVar.t.get(), (itt) xfiVar.u.get(), (q78) xfiVar.v.get(), (gmt) xfiVar.j.get(), (ecs) xfiVar.w.get());
            case 5:
                sek sekVar5 = xfiVar.b;
                g8i g8iVar2 = xfiVar.f40791a;
                pbt pbtVarL6 = g8iVar2.L2();
                x1x.x(pbtVarL6);
                m1e m1eVarQ1 = g8iVar2.q1();
                x1x.x(m1eVarQ1);
                return new lzt(pbtVarL6, m1eVarQ1);
            case 6:
                sek sekVar6 = xfiVar.b;
                pbt pbtVarL7 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL7);
                return new zmi0(pbtVarL7);
            case 7:
                sek sekVar7 = xfiVar.b;
                pbt pbtVarL8 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL8);
                return new xyb(pbtVarL8);
            case 8:
                sek sekVar8 = xfiVar.b;
                k1u k1uVar = (k1u) xfiVar.i.get();
                gmt gmtVar2 = (gmt) xfiVar.j.get();
                ztt zttVar = (ztt) xfiVar.k.get();
                pbt pbtVarL9 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL9);
                return i5t.a(sekVar8, k1uVar, gmtVar2, zttVar, pbtVarL9);
            case 9:
                sek sekVar9 = xfiVar.b;
                return new k1u(xfiVar.c());
            case 10:
                sek sekVar10 = xfiVar.b;
                pbt pbtVarL10 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL10);
                return new gmt(pbtVarL10);
            case 11:
                sek sekVar11 = xfiVar.b;
                pbt pbtVarL11 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL11);
                return new ztt(pbtVarL11);
            case 12:
                sek sekVar12 = xfiVar.b;
                pbt pbtVarL12 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL12);
                return new fpi0(pbtVarL12);
            case 13:
                sek sekVar13 = xfiVar.b;
                pbt pbtVarL13 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL13);
                return new nqt(pbtVarL13);
            case 14:
                sek sekVar14 = xfiVar.b;
                pbt pbtVarL14 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL14);
                return new spx(pbtVarL14);
            case 15:
                sek sekVar15 = xfiVar.b;
                pbt pbtVarL15 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL15);
                return new oqt(pbtVarL15);
            case 16:
                sek sekVar16 = xfiVar.b;
                pbt pbtVarL16 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL16);
                return new hni0(pbtVarL16);
            case 17:
                sek sekVar17 = xfiVar.b;
                pbt pbtVarL17 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL17);
                return new vcu(pbtVarL17);
            case 18:
                sek sekVar18 = xfiVar.b;
                pbt pbtVarL18 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL18);
                return new wni0(pbtVarL18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar19 = xfiVar.b;
                pbt pbtVarL19 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL19);
                return new pqt(pbtVarL19);
            case 20:
                sek sekVar20 = xfiVar.b;
                pbt pbtVarL20 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL20);
                return new itt(pbtVarL20);
            case 21:
                sek sekVar21 = xfiVar.b;
                pbt pbtVarL21 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL21);
                return new q78(pbtVarL21);
            case 22:
                sek sekVar22 = xfiVar.b;
                pbt pbtVarL22 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL22);
                return new ecs(pbtVarL22);
            case 23:
                sek sekVar23 = xfiVar.b;
                pbt pbtVarL23 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL23);
                return new qpt(pbtVarL23);
            case 24:
                sek sekVar24 = xfiVar.b;
                fq fqVar2 = (fq) xfiVar.x.get();
                fqx fqxVar = (fqx) xfiVar.z.get();
                wox woxVar = (wox) xfiVar.A.get();
                return i5t.g(fqVar2, sekVar24, (qpt) xfiVar.y.get(), (r8u) xfiVar.B.get(), woxVar, fqxVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar25 = xfiVar.b;
                pbt pbtVarL24 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL24);
                return new fqx(pbtVarL24);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar26 = xfiVar.b;
                pbt pbtVarL25 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL25);
                return new wox(pbtVarL25);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar27 = xfiVar.b;
                pbt pbtVarL26 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL26);
                return new r8u(pbtVarL26);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                sek sekVar28 = xfiVar.b;
                pbt pbtVarL27 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL27);
                return new qa60(pbtVarL27);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar29 = xfiVar.b;
                pbt pbtVarL28 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL28);
                return new ipi0(pbtVarL28);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                sek sekVar30 = xfiVar.b;
                pbt pbtVarL29 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL29);
                return new xsi0(pbtVarL29);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                sek sekVar31 = xfiVar.b;
                pbt pbtVarL30 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL30);
                return new gpx(pbtVarL30);
            case 32:
                sek sekVar32 = xfiVar.b;
                pbt pbtVarL31 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL31);
                return new vni0(pbtVarL31);
            case 33:
                sek sekVar33 = xfiVar.b;
                pbt pbtVarL32 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL32);
                return new hs(pbtVarL32);
            case 34:
                sek sekVar34 = xfiVar.b;
                pbt pbtVarL33 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL33);
                return new eni0(pbtVarL33);
            case 35:
                return i5t.z(xfiVar.b, (aws) xfiVar.M.get());
            case 36:
                sek sekVar35 = xfiVar.b;
                yvs yvsVarG2 = xfiVar.f40791a.G2();
                x1x.x(yvsVarG2);
                return new aws(yvsVarG2);
            case 37:
                sek sekVar36 = xfiVar.b;
                pbt pbtVarL34 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL34);
                return new hj50(pbtVarL34);
            case 38:
                sek sekVar37 = xfiVar.b;
                pbt pbtVarL35 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL35);
                return new qhf0(pbtVarL35);
            case 39:
                return i5t.d(xfiVar.b, (foi0) xfiVar.Q.get(), (fq) xfiVar.x.get());
            case 40:
                sek sekVar38 = xfiVar.b;
                pbt pbtVarL36 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL36);
                return new foi0(pbtVarL36);
            case 41:
                sek sekVar39 = xfiVar.b;
                fq fqVar3 = (fq) xfiVar.x.get();
                r8u r8uVar = (r8u) xfiVar.B.get();
                return i5t.B(fqVar3, sekVar39, (qpt) xfiVar.y.get(), r8uVar, (wox) xfiVar.A.get(), (fqx) xfiVar.z.get());
            case 42:
                sek sekVar40 = xfiVar.c;
                return new y5s(s470.EASTEN_NIGHT, false, true, false, false, false, 448);
            case 43:
                return i5t.b(xfiVar.b, (fq) xfiVar.x.get(), (fqx) xfiVar.z.get());
            case 44:
                return i5t.c(xfiVar.b, (aws) xfiVar.M.get());
            case 45:
                sek sekVar41 = xfiVar.b;
                pbt pbtVarL37 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL37);
                return new hsj0(pbtVarL37);
            case 46:
                sek sekVar42 = xfiVar.b;
                g8i g8iVar3 = xfiVar.f40791a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL38 = g8iVar3.L2();
                x1x.x(pbtVarL38);
                return new t0u(pbtVarL38, wsf0VarF0);
            case 47:
                sek sekVar43 = xfiVar.b;
                pbt pbtVarL39 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL39);
                return new tbu(pbtVarL39);
            case 48:
                return i5t.f(xfiVar.b, (a6s) xfiVar.Z.get());
            case 49:
                return i5t.e(xfiVar.b);
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                xcc xccVar = (xcc) xfiVar.U.get();
                qa60 qa60Var = (qa60) xfiVar.F.get();
                d3c d3cVar2 = (d3c) xfiVar.e.get();
                lzt lztVar2 = (lzt) xfiVar.f.get();
                fpi0 fpi0Var = (fpi0) xfiVar.m.get();
                mne mneVarV1 = xfiVar.f40791a.v1();
                i5m0 i5m0Var = (i5m0) xfiVar.f0.get();
                fq fqVar4 = (fq) xfiVar.x.get();
                mii0 mii0Var = new mii0(new clc((Object) xfiVar.b(), (byte) 14), (itt) xfiVar.u.get(), (gmt) xfiVar.j.get(), (ztt) xfiVar.k.get());
                s7t0 s7t0Var2 = (s7t0) xfiVar.D.get();
                ivn ivnVar = new ivn(xfiVar.b());
                qni0 qni0Var = (qni0) xfiVar.d0.get();
                ecs ecsVar = (ecs) xfiVar.w.get();
                zri zriVar = new zri(new a1d((Object) xfiVar.b(), (byte) 20), (gmt) xfiVar.j.get());
                f4u f4uVar = new f4u(xfiVar.b(), (byte) 4);
                gmt gmtVar3 = (gmt) xfiVar.j.get();
                gmtVar3.getClass();
                fhj fhjVar = new fhj();
                fhjVar.f9543a = f4uVar;
                fhjVar.b = gmtVar3;
                return new kin(xccVar, qa60Var, d3cVar2, lztVar2, fpi0Var, mneVarV1, i5m0Var, fqVar4, mii0Var, s7t0Var2, ivnVar, qni0Var, ecsVar, zriVar, fhjVar, new rpt(xfiVar.b()), new fvt0(xfiVar.b()), (ztt) xfiVar.k.get(), (t0u) xfiVar.X.get());
            case 51:
                return i5t.A(xfiVar.b, (fq) xfiVar.x.get(), xfiVar.f40791a.f0(), (g9c) xfiVar.c0.get(), (itt) xfiVar.u.get(), (yyb) xfiVar.l.get(), (lg60) xfiVar.e0.get());
            case 52:
                sek sekVar44 = xfiVar.b;
                pbt pbtVarL40 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL40);
                return new g9c(pbtVarL40);
            case 53:
                sek sekVar45 = xfiVar.b;
                qni0 qni0Var2 = (qni0) xfiVar.d0.get();
                pbt pbtVarL41 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL41);
                return i5t.v(sekVar45, qni0Var2, pbtVarL41);
            case 54:
                sek sekVar46 = xfiVar.b;
                pbt pbtVarL42 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL42);
                return new qni0(pbtVarL42);
            case 55:
                sek sekVar47 = xfiVar.c;
                return new nin();
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object k() {
        byte b = this.b;
        if (b == 0) {
            return new zfi(this);
        }
        if (b == 1) {
            return new cog(new dog());
        }
        if (b == 2) {
            return new t2g(new s2g());
        }
        c99.h(b);
        return null;
    }

    private final Object l() {
        byte b = this.b;
        if (b == 0) {
            return new bgi(this);
        }
        if (b == 1) {
            return new irh((hrh) ((cgi) this.c).B.get());
        }
        if (b == 2) {
            return new hrh();
        }
        c99.h(b);
        return null;
    }

    private final Object m() {
        fgi fgiVar = (fgi) this.c;
        cad cadVar = fgiVar.n;
        byte b = this.b;
        switch (b) {
            case 0:
                nmo nmoVar = new nmo(new xzp(fgiVar.f9494a, fgiVar.b, new uyn(fgiVar.c, (byte) 2), fgiVar.d, fgiVar.e, fgiVar.f, fgiVar.g));
                ort ortVar = fgiVar.h;
                iqt iqtVar = fgiVar.i;
                cmt cmtVar = new cmt((Object) new peg0(fgiVar.j), (byte) 15);
                reu reuVar = fgiVar.k;
                ctf0 ctf0Var = fgiVar.l;
                viu viuVar = fgiVar.m;
                tqt tqtVar = new tqt();
                mne mneVarH = ((psc) cadVar.b).h();
                x1x.x(mneVarH);
                ht2 ht2Var = fgiVar.f;
                fjj fjjVar = fgiVar.g;
                ctf0Var.getClass();
                ht2Var.getClass();
                fjjVar.getClass();
                return new s1p(nmoVar, ortVar, iqtVar, cmtVar, reuVar, ctf0Var, viuVar, tqtVar, mneVarH);
            case 1:
                return new anv((nst0) fgiVar.s.get());
            case 2:
                lst0 lst0Var = fgiVar.o;
                wf3 wf3Var = fgiVar.p;
                mne mneVarH2 = ((psc) cadVar.b).h();
                x1x.x(mneVarH2);
                return new nst0(lst0Var, wf3Var, mneVarH2);
            case 3:
                return new knt0((nst0) fgiVar.s.get());
            case 4:
                return new ehu((nst0) fgiVar.s.get());
            case 5:
                return new w4v((nst0) fgiVar.s.get());
            case 6:
                return new mnt0((nst0) fgiVar.s.get());
            case 7:
                return new koi0((nst0) fgiVar.s.get());
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object n() {
        hhi hhiVar = (hhi) this.c;
        FinBetInfoModel finBetInfoModel = hhiVar.b;
        iw20 iw20Var = hhiVar.c;
        cad cadVar = hhiVar.f;
        wsf0 wsf0Var = hhiVar.n;
        byte b = this.b;
        if (b == 0) {
            lbu lbuVarD = ((uii) iw20Var.f15470a).D();
            jqt jqtVar = new jqt(hhiVar.d);
            i1w0 i1w0Var = hhiVar.e;
            mne mneVarH = ((psc) cadVar.b).h();
            x1x.x(mneVarH);
            return new kn20(finBetInfoModel, lbuVarD, jqtVar, i1w0Var, mneVarH, hhiVar.a(), ((cih) hhiVar.l.b).c(), ((uii) iw20Var.f15470a).r());
        }
        if (b == 1) {
            btt0 btt0Var = hhiVar.g;
            a7q a7qVar = new a7q(hhiVar.h, (byte) 0);
            q6q q6qVar = hhiVar.i;
            dev devVar = hhiVar.j;
            knf0 knf0Var = hhiVar.k;
            mne mneVarH2 = ((psc) cadVar.b).h();
            x1x.x(mneVarH2);
            return new h7q(btt0Var, a7qVar, q6qVar, devVar, knf0Var, mneVarH2);
        }
        if (b == 2) {
            w5z w5zVarB = hhiVar.b();
            mne mneVarH3 = ((psc) cadVar.b).h();
            x1x.x(mneVarH3);
            return new kvc0(w5zVarB, mneVarH3, hhiVar.a(), hhiVar.o, hhiVar.p.a(), ((g45) wsf0Var.b).E(), ((g45) wsf0Var.b).P(), hhiVar.q, hhiVar.r, hhiVar.s.D(), ((uii) iw20Var.f15470a).r(), hhiVar.t, new m1u((h7q) hhiVar.P.get(), (byte) 2), new v6q((h7q) hhiVar.P.get(), (byte) 0), ((g45) wsf0Var.b).y(), finBetInfoModel, hhiVar.u, hhiVar.v.d(), hhiVar.w, wsf0Var.a(), wsf0Var.s());
        }
        if (b == 3) {
            return new fhi(this);
        }
        if (b == 4) {
            return new ghi(this);
        }
        c99.h(b);
        return null;
    }

    private final Object o() {
        tai taiVar = (tai) this.c;
        cad cadVar = taiVar.d;
        byte b = this.b;
        if (b == 0) {
            return new ihi(this);
        }
        if (b == 1) {
            btt0 btt0Var = taiVar.f33612a;
            a7q a7qVar = new a7q(taiVar.b, (byte) 0);
            q6q q6qVar = (q6q) taiVar.l;
            dev devVar = (dev) taiVar.m;
            knf0 knf0Var = taiVar.c;
            mne mneVarH = ((psc) cadVar.b).h();
            x1x.x(mneVarH);
            return new h7q(btt0Var, a7qVar, q6qVar, devVar, knf0Var, mneVarH);
        }
        if (b != 2) {
            c99.h(b);
            return null;
        }
        i1u i1uVar = new i1u((h7q) taiVar.i.get(), (byte) 1);
        i1u i1uVar2 = new i1u((h7q) taiVar.i.get(), (byte) 0);
        v6q v6qVar = new v6q((h7q) taiVar.i.get(), (byte) 2);
        zr1 zr1VarD = ((d1p) taiVar.A).D();
        mii0 mii0Var = (mii0) taiVar.r;
        mne mneVarH2 = ((psc) cadVar.b).h();
        x1x.x(mneVarH2);
        return new x9q(i1uVar, i1uVar2, v6qVar, zr1VarD, mii0Var, mneVarH2);
    }

    private final Object p() {
        nc0 nc0Var = (nc0) this.c;
        byte b = this.b;
        if (b == 0) {
            return new lhi(this);
        }
        if (b == 1) {
            yjr yjrVar = (yjr) ((n5d0) nc0Var.j).get();
            yjrVar.getClass();
            return new yoi0(yjrVar);
        }
        if (b == 2) {
            ojo ojoVar = (ojo) ((n5d0) nc0Var.b).get();
            njo njoVar = (njo) nc0Var.e;
            btt0 btt0Var = (btt0) nc0Var.f;
            ojoVar.getClass();
            njoVar.getClass();
            btt0Var.getClass();
            return new yjr(ojoVar, njoVar, btt0Var);
        }
        if (b == 3) {
            gii0 gii0Var = (gii0) nc0Var.d;
            gii0Var.getClass();
            return new ojo(gii0Var);
        }
        if (b == 4) {
            yjr yjrVar2 = (yjr) ((n5d0) nc0Var.j).get();
            yjrVar2.getClass();
            return new j8u(yjrVar2);
        }
        if (b != 5) {
            c99.h(b);
            return null;
        }
        yjr yjrVar3 = (yjr) ((n5d0) nc0Var.j).get();
        yjrVar3.getClass();
        return new qdi0(yjrVar3);
    }

    private final Object q() {
        gbi gbiVar = (gbi) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new x9s((las) ((n5d0) gbiVar.b).get());
            case 1:
                return new las();
            case 2:
                return new x7u((x9s) ((n5d0) gbiVar.c).get());
            case 3:
                return new upc((x9s) ((n5d0) gbiVar.c).get());
            case 4:
                return new kou((x9s) ((n5d0) gbiVar.c).get());
            case 5:
                return new gyg0((x9s) ((n5d0) gbiVar.c).get());
            case 6:
                return new nyg0((x9s) ((n5d0) gbiVar.c).get());
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object r() {
        shi shiVar = (shi) this.c;
        gii0 gii0Var = shiVar.f;
        byte b = this.b;
        if (b == 0) {
            return new rhi(this);
        }
        if (b == 1) {
            return new d4t0(new iqi(gii0Var, (byte) 12), new jtj(gii0Var));
        }
        if (b == 2) {
            return new nov(shiVar.g, new u8u(gii0Var, (byte) 20), new pyu());
        }
        c99.h(b);
        return null;
    }

    private final Object s() {
        xhi xhiVar = (xhi) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                gii0 gii0Var = xhiVar.f40893a;
                rrc rrcVar = xhiVar.d;
                return new ros(new nmo(gii0Var, (byte) 6), (zks) xhiVar.O.get(), xhiVar.b, (n530) xhiVar.P.get(), xhiVar.c, new eio(rrcVar, (byte) 0), new he1(rrcVar, (byte) 1), (bs20) xhiVar.R.get(), xhiVar.e);
            case 1:
                return new zks();
            case 2:
                return new n530();
            case 3:
                return new bs20((zr20) xhiVar.Q.get());
            case 4:
                return new zr20();
            case 5:
                return new q530((n530) xhiVar.P.get());
            case 6:
                return new x5s((i5s) xhiVar.U.get());
            case 7:
                return new i5s();
            case 8:
                return new hoo((vno) xhiVar.W.get(), (n530) xhiVar.P.get(), (zr20) xhiVar.Q.get());
            case 9:
                return new vno();
            case 10:
                return new oa30((ja30) xhiVar.Y.get());
            case 11:
                return new ja30();
            case 12:
                eio eioVar = new eio(xhiVar.d, (byte) 1);
                he1 he1Var = new he1(xhiVar.d, (byte) 1);
                mne mneVarH = ((psc) xhiVar.n.b).h();
                x1x.x(mneVarH);
                return new q430(eioVar, he1Var, mneVarH);
            case 13:
                return new fx7(xhiVar.b, new nv20(xhiVar.f40893a, (byte) 21), (ief0) xhiVar.b0.get());
            case 14:
                return new ief0();
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object t() {
        z8i z8iVar = (z8i) this.c;
        cad cadVar = (cad) z8iVar.d;
        viu viuVar = (viu) z8iVar.A;
        gst0 gst0Var = (gst0) z8iVar.p;
        byte b = 12;
        byte b2 = this.b;
        if (b2 != 0) {
            if (b2 == 1) {
                return new btr((m49) z8iVar.e, (ysr) z8iVar.I, (nhv0) z8iVar.f, (n49) z8iVar.g, (atr) z8iVar.i, (rsr) z8iVar.j);
            }
            if (b2 != 2) {
                if (b2 == 3) {
                    return new neu0((meu0) z8iVar.q);
                }
                if (b2 == 4) {
                    return new d49((c49) z8iVar.z);
                }
                c99.h(b2);
                return null;
            }
            tgk tgkVar = (tgk) z8iVar.l;
            bwl bwlVar = new bwl((gii0) z8iVar.m, (byte) 12);
            ivn ivnVar = new ivn((azj0) z8iVar.n);
            us3 us3Var = (us3) z8iVar.x;
            mne mneVarH = ((psc) cadVar.b).h();
            x1x.x(mneVarH);
            return new yxs(tgkVar, bwlVar, ivnVar, us3Var, mneVarH, (knf0) z8iVar.D, (btt0) z8iVar.J);
        }
        GameBroadcastingParams gameBroadcastingParams = (GameBroadcastingParams) z8iVar.f43967a;
        ali aliVar = new ali((oeg0) z8iVar.b, new yk5(), new kj5(), new gl5(b), new zsr((us00) z8iVar.c, new lut((btr) ((n5d0) z8iVar.H).get(), (byte) 1), new mpx((btr) ((n5d0) z8iVar.H).get(), (byte) 0), new mpx((btr) ((n5d0) z8iVar.H).get(), (byte) 2), new sdi0((btr) ((n5d0) z8iVar.H).get(), (byte) 1), new xsc((btr) ((n5d0) z8iVar.H).get(), (byte) 0), new yqc((btr) ((n5d0) z8iVar.H).get())), (mi70) z8iVar.G, (r9u) z8iVar.k);
        a5v a5vVar = new a5v((btr) ((n5d0) z8iVar.H).get(), (byte) 3);
        lut lutVar = new lut((btr) ((n5d0) z8iVar.H).get(), (byte) 2);
        xsc xscVar = new xsc((btr) ((n5d0) z8iVar.H).get(), (byte) 0);
        yqc yqcVar = new yqc((btr) ((n5d0) z8iVar.H).get());
        xsc xscVar2 = new xsc((btr) ((n5d0) z8iVar.H).get(), (byte) 1);
        lbu lbuVar = new lbu((yxs) ((n5d0) z8iVar.w).get(), gst0Var);
        reu reuVar = new reu(z8iVar.u);
        yox yoxVar = new yox((neu0) ((n5d0) z8iVar.v).get());
        ljf0 ljf0Var = new ljf0((neu0) ((n5d0) z8iVar.v).get());
        hrx hrxVar = new hrx((neu0) ((n5d0) z8iVar.v).get(), (byte) 1);
        psc pscVar = new psc((neu0) ((n5d0) z8iVar.v).get());
        m1e m1eVar = (m1e) z8iVar.y;
        mne mneVarH2 = ((psc) cadVar.b).h();
        x1x.x(mneVarH2);
        return new yys(gameBroadcastingParams, aliVar, a5vVar, lutVar, xscVar, yqcVar, xscVar2, lbuVar, reuVar, yoxVar, ljf0Var, hrxVar, pscVar, m1eVar, mneVarH2, z8iVar.h, new jqt(gst0Var), (s64) z8iVar.r, (cmt) z8iVar.s, (bn6) z8iVar.t, new iqt(gst0Var), new hrx((neu0) ((n5d0) z8iVar.v).get(), (byte) 0), new fuj0(new eyg0((d49) ((n5d0) z8iVar.C).get()), viuVar), new nw20(new iw20((d49) ((n5d0) z8iVar.C).get()), viuVar), new chf0(new yqc((d49) ((n5d0) z8iVar.C).get()), viuVar), new xex((vd1) z8iVar.B, (ik4) z8iVar.F), new lut((btr) ((n5d0) z8iVar.H).get(), (byte) 0), z8iVar.o);
    }

    private final Object u() {
        yhi yhiVar = (yhi) this.c;
        viu viuVar = (viu) yhiVar.r;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                return new btr((m49) yhiVar.g, (ysr) yhiVar.h, (nhv0) yhiVar.i, (n49) yhiVar.j, (atr) yhiVar.k, (rsr) yhiVar.l);
            }
            if (b == 2) {
                return new d49((c49) yhiVar.q);
            }
            c99.h(b);
            return null;
        }
        GameBroadcastingParams gameBroadcastingParams = (GameBroadcastingParams) yhiVar.d;
        ali aliVar = new ali((oeg0) yhiVar.e, new yk5(), new kj5(), new gl5((byte) 12), new zsr((us00) yhiVar.f, new lut((btr) ((n5d0) yhiVar.c).get(), (byte) 1), new mpx((btr) ((n5d0) yhiVar.c).get(), (byte) 0), new mpx((btr) ((n5d0) yhiVar.c).get(), (byte) 2), new sdi0((btr) ((n5d0) yhiVar.c).get(), (byte) 1), new xsc((btr) ((n5d0) yhiVar.c).get(), (byte) 0), new yqc((btr) ((n5d0) yhiVar.c).get())), (mi70) yhiVar.m, (r9u) yhiVar.n);
        a5v a5vVar = new a5v((btr) ((n5d0) yhiVar.c).get(), (byte) 3);
        yqc yqcVar = new yqc((btr) ((n5d0) yhiVar.c).get());
        xsc xscVar = new xsc((btr) ((n5d0) yhiVar.c).get(), (byte) 0);
        xsc xscVar2 = new xsc((btr) ((n5d0) yhiVar.c).get(), (byte) 1);
        bdu bduVar = new bdu((ntu) yhiVar.o);
        m1e m1eVar = (m1e) yhiVar.b;
        mne mneVarH = ((psc) ((cad) yhiVar.f42638a).b).h();
        x1x.x(mneVarH);
        return new e1t(gameBroadcastingParams, aliVar, a5vVar, yqcVar, xscVar, xscVar2, bduVar, m1eVar, mneVarH, new wgu((yox) yhiVar.p), new fuj0(new eyg0((d49) ((n5d0) yhiVar.u).get()), viuVar), new nw20(new iw20((d49) ((n5d0) yhiVar.u).get()), viuVar), new chf0(new yqc((d49) ((n5d0) yhiVar.u).get()), viuVar), new xex((vd1) yhiVar.s, (ik4) yhiVar.t));
    }

    @Override // a.o5d0
    public final Object get() {
        Object wzeVar;
        byte b = this.f5848a;
        Object obj = this.c;
        byte b2 = this.b;
        switch (b) {
            case 0:
                eci eciVar = (eci) obj;
                iip iipVar = eciVar.d;
                pru pruVar = eciVar.c;
                gii0 gii0Var = eciVar.i;
                knf0 knf0Var = eciVar.h;
                if (b2 != 0) {
                    if (b2 == 1) {
                        return new wip();
                    }
                    if (b2 == 2) {
                        return new lgz();
                    }
                    if (b2 == 3) {
                        return new q8g0();
                    }
                    if (b2 == 4) {
                        return new vwl0();
                    }
                    c99.h(b2);
                    return null;
                }
                UfcChampionshipParams ufcChampionshipParams = eciVar.f7567a;
                i1w0 i1w0Var = eciVar.b;
                j3c j3cVarV = iipVar.V();
                x1x.x(j3cVarV);
                xzp xzpVar = new xzp(pruVar, j3cVarV, new rtu(new rou(eciVar.e, (byte) 0), new x4v(eciVar.f, (byte) 0)), ((gbi) eciVar.g.f20589a).k(), new edu(new nr(knf0Var, new iqi(gii0Var, (byte) 10), (wip) eciVar.z.get()), eciVar.j), new x4u(new zpu(new lbu(gii0Var, (byte) 28), (lgz) eciVar.A.get())), new g2v(new afm0((Object) new g090(gii0Var, (byte) 26), (Object) new roi0(), (byte) 8)));
                xfu xfuVar = new xfu(new nvu(knf0Var, new dq00(gii0Var, (byte) 25), (q8g0) eciVar.B.get()));
                hnu hnuVar = new hnu(new ouu(knf0Var, new fck0(gii0Var, (byte) 1), (vwl0) eciVar.C.get()));
                g2v g2vVar = eciVar.k;
                ctf0 ctf0Var = eciVar.l;
                x0u x0uVar = eciVar.m;
                m1e m1eVar = eciVar.n;
                hjd hjdVarA = eciVar.o.a();
                x1x.x(hjdVarA);
                rus rusVarJ = ((g45) eciVar.p.f45137a).J();
                mne mneVarH = ((psc) eciVar.q.b).h();
                x1x.x(mneVarH);
                luu luuVarW = ((daf) eciVar.r.f35622a).w();
                x1x.x(luuVarW);
                y78 y78Var = eciVar.s;
                svu svuVarA = eciVar.t.a();
                x1x.x(svuVarA);
                r9u r9uVar = eciVar.u;
                lbu lbuVar = eciVar.v;
                wiu wiuVar = eciVar.w;
                vjp vjpVarS = iipVar.S();
                x1x.x(vjpVarS);
                return new plb(ufcChampionshipParams, i1w0Var, xzpVar, xfuVar, hnuVar, g2vVar, ctf0Var, x0uVar, m1eVar, hjdVarA, rusVarJ, mneVarH, luuVarW, y78Var, svuVarA, r9uVar, lbuVar, pruVar, wiuVar, vjpVarS, eciVar.x, eciVar.y, new gle0());
            case 1:
                mci mciVar = (mci) obj;
                switch (b2) {
                    case 0:
                        wrz wrzVar = (wrz) mciVar.c;
                        mne mneVarH2 = ((psc) ((cad) mciVar.b).b).h();
                        x1x.x(mneVarH2);
                        return new wdc(wrzVar, mneVarH2, (ctf0) mciVar.f21553a, (duj) mciVar.d, (i1w0) mciVar.e, (biu) ((n5d0) mciVar.m).get(), (m8c) ((n5d0) mciVar.o).get(), (tyg0) ((n5d0) mciVar.p).get(), (usi0) ((n5d0) mciVar.q).get());
                    case 1:
                        r200 r200Var = (r200) ((n5d0) mciVar.l).get();
                        r200Var.getClass();
                        return new biu(r200Var);
                    case 2:
                        w000 w000Var = (w000) mciVar.f;
                        d200 d200Var = (d200) ((n5d0) mciVar.k).get();
                        ieu ieuVar = w000.f38324a;
                        x1x.y(ieuVar);
                        return euw.n(w000Var, d200Var, ieuVar, (btt0) mciVar.h, (knf0) mciVar.i, (us00) mciVar.j);
                    case 3:
                        gii0 gii0Var2 = (gii0) mciVar.g;
                        gii0Var2.getClass();
                        return new d200(gii0Var2);
                    case 4:
                        biu biuVar = (biu) ((n5d0) mciVar.m).get();
                        syu syuVar = (syu) ((n5d0) mciVar.n).get();
                        biuVar.getClass();
                        syuVar.getClass();
                        return new m8c(biuVar, syuVar);
                    case 5:
                        r200 r200Var2 = (r200) ((n5d0) mciVar.l).get();
                        r200Var2.getClass();
                        return new syu(r200Var2);
                    case 6:
                        r200 r200Var3 = (r200) ((n5d0) mciVar.l).get();
                        r200Var3.getClass();
                        return new tyg0(r200Var3);
                    case 7:
                        r200 r200Var4 = (r200) ((n5d0) mciVar.l).get();
                        r200Var4.getClass();
                        return new usi0(r200Var4);
                    default:
                        c99.h(b2);
                        return null;
                }
            case 2:
                nc0 nc0Var = (nc0) obj;
                if (b2 == 0) {
                    mne mneVarH3 = ((psc) ((cad) nc0Var.d).b).h();
                    x1x.x(mneVarH3);
                    return new yhc(mneVarH3, (tju) ((n5d0) nc0Var.l).get(), (rqi0) ((n5d0) nc0Var.m).get(), (i1w0) nc0Var.h, (duj) nc0Var.i, (l810) ((peg0) nc0Var.b).b);
                }
                if (b2 == 1) {
                    ((p200) ((n5d0) nc0Var.k).get()).getClass();
                    return new tju();
                }
                if (b2 == 2) {
                    return euw.l((dvz) nc0Var.e, (b200) ((n5d0) nc0Var.j).get(), (btt0) nc0Var.g, (knf0) nc0Var.f23267a, (ctf0) nc0Var.c);
                }
                if (b2 == 3) {
                    gii0 gii0Var3 = (gii0) nc0Var.f;
                    gii0Var3.getClass();
                    return new b200(gii0Var3);
                }
                if (b2 != 4) {
                    c99.h(b2);
                    return null;
                }
                p200 p200Var = (p200) ((n5d0) nc0Var.k).get();
                p200Var.getClass();
                return new rqi0(p200Var);
            case 3:
                if (b2 == 0) {
                    return new ddi(this);
                }
                if (b2 == 1) {
                    return new edi();
                }
                if (b2 == 2) {
                    return new fdi(this);
                }
                c99.h(b2);
                return null;
            case 4:
                mdi mdiVar = (mdi) obj;
                ave aveVar = (ave) mdiVar.v;
                lbu lbuVar2 = (lbu) mdiVar.C;
                sv3 sv3Var = (sv3) mdiVar.R;
                v6j0 v6j0Var = (v6j0) mdiVar.r;
                zlt0 zlt0Var = (zlt0) mdiVar.H;
                drm0 drm0Var = (drm0) mdiVar.K;
                duj dujVar = mdiVar.m;
                pru pruVar2 = mdiVar.e;
                cad cadVar = mdiVar.b;
                d1p d1pVar = (d1p) mdiVar.E;
                gst0 gst0Var = mdiVar.f;
                o2j0 o2j0Var = (o2j0) mdiVar.A;
                bzu bzuVar = (bzu) mdiVar.F;
                wsf0 wsf0Var = mdiVar.d;
                if (b2 == 0) {
                    lsn lsnVar = new lsn(mdiVar.h());
                    k52 k52Var = new k52(mdiVar.d());
                    tqc tqcVar = new tqc(mdiVar.i());
                    jtj jtjVar = new jtj((Object) mdiVar.m(), (Object) new tqc(mdiVar.i()), (byte) 21);
                    iqi iqiVar = new iqi((Object) mdiVar.h(), (Object) new j9c(mdiVar.i()), (byte) 23);
                    hsj hsjVarM = mdiVar.m();
                    vyt vytVarA = o2j0Var.a();
                    ert ertVar = new ert(mdiVar.i());
                    hst hstVar = new hst(mdiVar.c());
                    ctf0 ctf0Var2 = mdiVar.c;
                    aot aotVar = new aot(mdiVar.d());
                    iqt iqtVar = (iqt) mdiVar.B;
                    wsc wscVar = new wsc(gst0Var, (byte) 2);
                    j9c j9cVarO = mdiVar.o();
                    mne mneVarH4 = ((psc) cadVar.b).h();
                    x1x.x(mneVarH4);
                    lhf0 lhf0Var = new lhf0((Object) mdiVar.n(), (Object) mdiVar.o(), (Object) new hst(mdiVar.c()), (byte) 21);
                    bhu bhuVar = new bhu(mdiVar.i());
                    ag3 ag3Var = (ag3) mdiVar.D;
                    y3j0 y3j0VarB = o2j0Var.b();
                    x1x.x(y3j0VarB);
                    wzeVar = new wze(lsnVar, k52Var, tqcVar, jtjVar, iqiVar, hsjVarM, vytVarA, ertVar, hstVar, ctf0Var2, aotVar, iqtVar, wscVar, lbuVar2, pruVar2, j9cVarO, mneVarH4, lhf0Var, bhuVar, ag3Var, y3j0VarB, (i1w0) mdiVar.k, dujVar, new gs(mdiVar.i()), new ni9(mdiVar.i()), new ppt(mdiVar.h()), d1pVar.Z(), ((o3c) bzuVar.b).q(), mdiVar.l(), new xre(aveVar, (byte) 1), new reu(mdiVar.h(), (byte) 7));
                } else {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            mne mneVarH5 = ((psc) cadVar.b).h();
                            x1x.x(mneVarH5);
                            return new x920(mneVarH5, dujVar, ((o3c) bzuVar.b).j(), mdiVar.j(), mdiVar.c, new o4a(mdiVar.i()), new mpc(mdiVar.i()), mdiVar.o(), new ni9(mdiVar.i()), mdiVar.q(), ((g45) wsf0Var.b).f(), new sp(((g45) wsf0Var.b).e()), ((g45) wsf0Var.b).E(), new k52(mdiVar.d()), mdiVar.s(), new uqx(v6j0Var, (byte) 1), o2j0Var.j(), mdiVar.g(), mdiVar.l(), new fqc(mdiVar.i(), mdiVar.c(), mdiVar.d()), new svu(new r7v(sv3Var)), new r4v(gst0Var, (byte) 2), mdiVar.q, new gs(mdiVar.i()), pruVar2, new x1u(gst0Var, (byte) 1));
                        }
                        if (b2 == 3) {
                            return new kdi(this);
                        }
                        if (b2 == 4) {
                            return new ldi(this);
                        }
                        c99.h(b2);
                        return null;
                    }
                    g320 g320VarJ = ((o3c) bzuVar.b).j();
                    ieu ieuVarH = ((o3c) bzuVar.b).h();
                    daf dafVarJ = mdiVar.j();
                    khf0 khf0VarG = ((g45) wsf0Var.b).G();
                    lbu lbuVar3 = (lbu) mdiVar.I;
                    dzu dzuVar = (dzu) mdiVar.J;
                    reu reuVarJ = ((ali) drm0Var.f6568a).j();
                    r4v r4vVar = new r4v(gst0Var, (byte) 2);
                    nvu nvuVarM0 = ((g45) wsf0Var.b).m0();
                    mii0 mii0Var = (mii0) mdiVar.L;
                    x20 x20VarZ = d1pVar.Z();
                    m1e m1eVar2 = mdiVar.q;
                    ctf0 ctf0Var3 = mdiVar.c;
                    mne mneVarH6 = ((psc) cadVar.b).h();
                    x1x.x(mneVarH6);
                    b8u b8uVarY = ((g45) wsf0Var.b).Y();
                    ot otVarB = wsf0Var.b();
                    f6k f6kVarL = ((g45) wsf0Var.b).l();
                    u4a u4aVarF = ((g45) wsf0Var.b).f();
                    i1w0 i1w0Var2 = (i1w0) mdiVar.k;
                    v88 v88Var = mdiVar.l;
                    tmt tmtVarC = ((o3c) bzuVar.b).c();
                    nou nouVarE = ((g45) wsf0Var.b).E();
                    m0u m0uVarT = ((g45) wsf0Var.b).t();
                    vyt vytVarA2 = o2j0Var.a();
                    pyu pyuVar = (pyu) mdiVar.M;
                    q4u q4uVar = (q4u) mdiVar.N;
                    b8u b8uVarR = ((yqc) ((onv) mdiVar.O).f25567a).r();
                    yk5 yk5Var = new yk5();
                    kxu kxuVarP = mdiVar.p();
                    lsn lsnVar2 = new lsn(mdiVar.h());
                    k52 k52Var2 = new k52(mdiVar.d());
                    ivn ivnVar = new ivn(new tqc(mdiVar.i()));
                    iqi iqiVar2 = new iqi((Object) mdiVar.h(), (Object) new j9c(mdiVar.i()), (byte) 23);
                    hsj hsjVarM2 = mdiVar.m();
                    ert ertVar2 = new ert(mdiVar.i());
                    hst hstVar2 = new hst(mdiVar.c());
                    aot aotVar2 = new aot(mdiVar.d());
                    wsc wscVar2 = new wsc(gst0Var, (byte) 2);
                    j9c j9cVarO2 = mdiVar.o();
                    mne mneVarH7 = ((psc) cadVar.b).h();
                    x1x.x(mneVarH7);
                    lhf0 lhf0Var2 = new lhf0((Object) mdiVar.n(), (Object) mdiVar.o(), (Object) new hst(mdiVar.c()), (byte) 21);
                    bhu bhuVar2 = new bhu(mdiVar.i());
                    y3j0 y3j0VarB2 = o2j0Var.b();
                    x1x.x(y3j0VarB2);
                    wzeVar = new on20(g320VarJ, ieuVarH, dafVarJ, khf0VarG, lbuVar3, dzuVar, reuVarJ, pruVar2, r4vVar, nvuVarM0, zlt0Var, mii0Var, x20VarZ, m1eVar2, dujVar, ctf0Var3, mneVarH6, b8uVarY, otVarB, f6kVarL, u4aVarF, i1w0Var2, v88Var, tmtVarC, nouVarE, m0uVarT, vytVarA2, lbuVar2, pyuVar, q4uVar, b8uVarR, yk5Var, kxuVarP, lsnVar2, k52Var2, ivnVar, iqiVar2, hsjVarM2, ertVar2, hstVar2, aotVar2, wscVar2, j9cVarO2, mneVarH7, lhf0Var2, bhuVar2, y3j0VarB2, new gs(mdiVar.i()), new ni9(mdiVar.i()), new g2v(new hst(mdiVar.c())), new onv(mdiVar.c()), mdiVar.r(), mdiVar.k(), mdiVar.s(), new ni9(mdiVar.i()), mdiVar.l(), mdiVar.n(), new gs(mdiVar.i()), new pv00(mdiVar.c()), new ymv(mdiVar.c()), mdiVar.b(), new hst(mdiVar.c()), new rq(mdiVar.i(), mdiVar.d()), new tqc(mdiVar.i()), new mpc(mdiVar.i()), new phf0(new edu((Object) mdiVar.c(), (Object) mdiVar.d(), (byte) 22), pruVar2, zlt0Var), new hst(mdiVar.c()), new tqc(mdiVar.i()), new o4a(mdiVar.i()), new mpc(mdiVar.i()), mdiVar.q(), new svu(new r7v(sv3Var)), new mpc(mdiVar.i()), new uqx(v6j0Var, (byte) 1), new tqc(mdiVar.i()), new u0u(mdiVar.h()), o2j0Var.j(), mdiVar.g(), new bsu(), wsf0Var.g(), wsf0Var.q(), new es(new x4u(new ni9(mdiVar.i())), mdiVar.o(), new hst(mdiVar.c())), new gs(mdiVar.i()), new gs(mdiVar.i()), new ipc(mdiVar.c()), ((o3c) bzuVar.b).g(), new uii(new j9c(mdiVar.i()), mdiVar.n(), ((g45) wsf0Var.b).G(), zlt0Var, mdiVar.o(), new ni9(mdiVar.i())), new cl5((byte) 15), new bst(), d1pVar.L(), (ih5) mdiVar.T, ((ali) drm0Var.f6568a).s(), ((ali) drm0Var.f6568a).i(), new xre(aveVar, (byte) 1), new j9c(mdiVar.i()), new j9c(mdiVar.i()), ((o3c) bzuVar.b).q(), ((o3c) bzuVar.b).i(), new reu(mdiVar.h(), (byte) 7), new x1u(gst0Var, (byte) 1), (wyu) mdiVar.U, (ih5) mdiVar.V, d1pVar.C(), ((xzp) ((epi0) mdiVar.W).b).C(), d1pVar.D0());
                }
                return wzeVar;
            case 5:
                return a();
            case 6:
                vdi vdiVar = (vdi) obj;
                gii0 gii0Var4 = vdiVar.f37234a;
                if (b2 == 0) {
                    return new y9g();
                }
                if (b2 == 1) {
                    r7v r7vVar = new r7v(gii0Var4, (byte) 17);
                    hl9 hl9Var = (hl9) vdiVar.c.get();
                    hl9Var.getClass();
                    return new ul9(r7vVar, hl9Var);
                }
                if (b2 == 2) {
                    return new hl9();
                }
                if (b2 != 3) {
                    if (b2 == 4) {
                        return new s3t0();
                    }
                    c99.h(b2);
                    return null;
                }
                zas0 zas0Var = new zas0(gii0Var4, (byte) 2);
                s3t0 s3t0Var = (s3t0) vdiVar.e.get();
                s3t0Var.getClass();
                return new ul9(zas0Var, s3t0Var);
            case 7:
                fei feiVar = (fei) obj;
                pyg pygVar = feiVar.c;
                if (b2 == 0) {
                    return new eei(this);
                }
                if (b2 == 1) {
                    udg udgVarE = pygVar.e();
                    x1x.x(udgVarE);
                    fvt fvtVar = new fvt(udgVarE);
                    mne mneVarH8 = ((psc) feiVar.n.b).h();
                    x1x.x(mneVarH8);
                    return new ecg(fvtVar, mneVarH8, feiVar.o, feiVar.p);
                }
                if (b2 != 2) {
                    c99.h(b2);
                    return null;
                }
                udg udgVarE2 = pygVar.e();
                x1x.x(udgVarE2);
                ocl oclVar = new ocl(udgVarE2);
                udg udgVarE3 = pygVar.e();
                x1x.x(udgVarE3);
                hru hruVar = new hru(udgVarE3);
                m1e m1eVar3 = feiVar.m;
                g2v g2vVar2 = feiVar.t;
                ctf0 ctf0Var4 = feiVar.p;
                n2u n2uVar = feiVar.u;
                hzg hzgVarA = pygVar.a();
                x1x.x(hzgVarA);
                return new rsh(oclVar, hruVar, m1eVar3, g2vVar2, ctf0Var4, n2uVar, hzgVarA, feiVar.f9408a, feiVar.v, new b8u(new z220(new nw20(feiVar.w, (byte) 27), new ugf0(), feiVar.x, feiVar.y)), new ih5(feiVar.q, (byte) 1));
            case 8:
                if (b2 == 0) {
                    dog dogVar = (dog) ((iei) obj).f.get();
                    dogVar.getClass();
                    return new cog(dogVar);
                }
                if (b2 == 1) {
                    return new dog();
                }
                if (b2 == 2) {
                    return new hei(this);
                }
                c99.h(b2);
                return null;
            case 9:
                return b();
            case 10:
                return c();
            case 11:
                return d();
            case 12:
                return e();
            case 13:
                return f();
            case 14:
                return g();
            case 15:
                return h();
            case 16:
                return i();
            case 17:
                return j();
            case 18:
                return k();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return l();
            case 20:
                return m();
            case 21:
                return n();
            case 22:
                return o();
            case 23:
                return p();
            case 24:
                return q();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return r();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return s();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return t();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return u();
            default:
                cii ciiVar = (cii) obj;
                switch (b2) {
                    case 0:
                        return new i6i(this, (byte) 6);
                    case 1:
                        sek sekVar = ciiVar.b;
                        s7t0 s7t0Var = (s7t0) ciiVar.D.get();
                        pbt pbtVarL2 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL2);
                        return i5t.r(sekVar, s7t0Var, pbtVarL2);
                    case 2:
                        sek sekVar2 = ciiVar.b;
                        g8i g8iVar = ciiVar.f4416a;
                        pbt pbtVarL3 = g8iVar.L2();
                        x1x.x(pbtVarL3);
                        d3c d3cVar = (d3c) ciiVar.e.get();
                        fq fqVar = (fq) ciiVar.x.get();
                        qpt qptVar = (qpt) ciiVar.y.get();
                        gmt gmtVar = (gmt) ciiVar.j.get();
                        rgs rgsVar = (rgs) ciiVar.C.get();
                        r9u r9uVarH4 = g8iVar.h4();
                        x1x.x(r9uVarH4);
                        return i5t.C(sekVar2, pbtVarL3, d3cVar, fqVar, qptVar, gmtVar, rgsVar, r9uVarH4);
                    case 3:
                        sek sekVar3 = ciiVar.b;
                        pbt pbtVarL4 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL4);
                        return new d3c(pbtVarL4);
                    case 4:
                        sek sekVar4 = ciiVar.b;
                        lzt lztVar = (lzt) ciiVar.f.get();
                        zmi0 zmi0Var = (zmi0) ciiVar.g.get();
                        pbt pbtVarL5 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL5);
                        return mkg.g(sekVar4, lztVar, zmi0Var, pbtVarL5, (xyb) ciiVar.h.get(), (yyb) ciiVar.l.get(), (fpi0) ciiVar.m.get(), (nqt) ciiVar.n.get(), (spx) ciiVar.o.get(), (oqt) ciiVar.p.get(), (hni0) ciiVar.q.get(), (vcu) ciiVar.r.get(), (d3c) ciiVar.e.get(), (wni0) ciiVar.s.get(), (ztt) ciiVar.k.get(), (pqt) ciiVar.t.get(), (itt) ciiVar.u.get(), (q78) ciiVar.v.get(), (gmt) ciiVar.j.get(), (ecs) ciiVar.w.get());
                    case 5:
                        sek sekVar5 = ciiVar.b;
                        g8i g8iVar2 = ciiVar.f4416a;
                        pbt pbtVarL6 = g8iVar2.L2();
                        x1x.x(pbtVarL6);
                        m1e m1eVarQ1 = g8iVar2.q1();
                        x1x.x(m1eVarQ1);
                        return new lzt(pbtVarL6, m1eVarQ1);
                    case 6:
                        sek sekVar6 = ciiVar.b;
                        pbt pbtVarL7 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL7);
                        return new zmi0(pbtVarL7);
                    case 7:
                        sek sekVar7 = ciiVar.b;
                        pbt pbtVarL8 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL8);
                        return new xyb(pbtVarL8);
                    case 8:
                        sek sekVar8 = ciiVar.b;
                        k1u k1uVar = (k1u) ciiVar.i.get();
                        gmt gmtVar2 = (gmt) ciiVar.j.get();
                        ztt zttVar = (ztt) ciiVar.k.get();
                        pbt pbtVarL9 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL9);
                        return i5t.a(sekVar8, k1uVar, gmtVar2, zttVar, pbtVarL9);
                    case 9:
                        sek sekVar9 = ciiVar.b;
                        return new k1u(ciiVar.b());
                    case 10:
                        sek sekVar10 = ciiVar.b;
                        pbt pbtVarL10 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL10);
                        return new gmt(pbtVarL10);
                    case 11:
                        sek sekVar11 = ciiVar.b;
                        pbt pbtVarL11 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL11);
                        return new ztt(pbtVarL11);
                    case 12:
                        sek sekVar12 = ciiVar.b;
                        pbt pbtVarL12 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL12);
                        return new fpi0(pbtVarL12);
                    case 13:
                        sek sekVar13 = ciiVar.b;
                        pbt pbtVarL13 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL13);
                        return new nqt(pbtVarL13);
                    case 14:
                        sek sekVar14 = ciiVar.b;
                        pbt pbtVarL14 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL14);
                        return new spx(pbtVarL14);
                    case 15:
                        sek sekVar15 = ciiVar.b;
                        pbt pbtVarL15 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL15);
                        return new oqt(pbtVarL15);
                    case 16:
                        sek sekVar16 = ciiVar.b;
                        pbt pbtVarL16 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL16);
                        return new hni0(pbtVarL16);
                    case 17:
                        sek sekVar17 = ciiVar.b;
                        pbt pbtVarL17 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL17);
                        return new vcu(pbtVarL17);
                    case 18:
                        sek sekVar18 = ciiVar.b;
                        pbt pbtVarL18 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL18);
                        return new wni0(pbtVarL18);
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        sek sekVar19 = ciiVar.b;
                        pbt pbtVarL19 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL19);
                        return new pqt(pbtVarL19);
                    case 20:
                        sek sekVar20 = ciiVar.b;
                        pbt pbtVarL20 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL20);
                        return new itt(pbtVarL20);
                    case 21:
                        sek sekVar21 = ciiVar.b;
                        pbt pbtVarL21 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL21);
                        return new q78(pbtVarL21);
                    case 22:
                        sek sekVar22 = ciiVar.b;
                        pbt pbtVarL22 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL22);
                        return new ecs(pbtVarL22);
                    case 23:
                        sek sekVar23 = ciiVar.b;
                        pbt pbtVarL23 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL23);
                        return new qpt(pbtVarL23);
                    case 24:
                        sek sekVar24 = ciiVar.b;
                        fq fqVar2 = (fq) ciiVar.x.get();
                        fqx fqxVar = (fqx) ciiVar.z.get();
                        wox woxVar = (wox) ciiVar.A.get();
                        return i5t.g(fqVar2, sekVar24, (qpt) ciiVar.y.get(), (r8u) ciiVar.B.get(), woxVar, fqxVar);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        sek sekVar25 = ciiVar.b;
                        pbt pbtVarL24 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL24);
                        return new fqx(pbtVarL24);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        sek sekVar26 = ciiVar.b;
                        pbt pbtVarL25 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL25);
                        return new wox(pbtVarL25);
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        sek sekVar27 = ciiVar.b;
                        pbt pbtVarL26 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL26);
                        return new r8u(pbtVarL26);
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        sek sekVar28 = ciiVar.b;
                        pbt pbtVarL27 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL27);
                        return new qa60(pbtVarL27);
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        sek sekVar29 = ciiVar.b;
                        pbt pbtVarL28 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL28);
                        return new ipi0(pbtVarL28);
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        sek sekVar30 = ciiVar.b;
                        pbt pbtVarL29 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL29);
                        return new xsi0(pbtVarL29);
                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        sek sekVar31 = ciiVar.b;
                        pbt pbtVarL30 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL30);
                        return new gpx(pbtVarL30);
                    case 32:
                        sek sekVar32 = ciiVar.b;
                        pbt pbtVarL31 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL31);
                        return new vni0(pbtVarL31);
                    case 33:
                        sek sekVar33 = ciiVar.b;
                        pbt pbtVarL32 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL32);
                        return new hs(pbtVarL32);
                    case 34:
                        sek sekVar34 = ciiVar.b;
                        pbt pbtVarL33 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL33);
                        return new eni0(pbtVarL33);
                    case 35:
                        return i5t.z(ciiVar.b, (aws) ciiVar.M.get());
                    case 36:
                        sek sekVar35 = ciiVar.b;
                        yvs yvsVarG2 = ciiVar.f4416a.G2();
                        x1x.x(yvsVarG2);
                        return new aws(yvsVarG2);
                    case 37:
                        sek sekVar36 = ciiVar.b;
                        pbt pbtVarL34 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL34);
                        return new hj50(pbtVarL34);
                    case 38:
                        sek sekVar37 = ciiVar.b;
                        pbt pbtVarL35 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL35);
                        return new qhf0(pbtVarL35);
                    case 39:
                        return i5t.d(ciiVar.b, (foi0) ciiVar.Q.get(), (fq) ciiVar.x.get());
                    case 40:
                        sek sekVar38 = ciiVar.b;
                        pbt pbtVarL36 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL36);
                        return new foi0(pbtVarL36);
                    case 41:
                        sek sekVar39 = ciiVar.b;
                        fq fqVar3 = (fq) ciiVar.x.get();
                        r8u r8uVar = (r8u) ciiVar.B.get();
                        return i5t.B(fqVar3, sekVar39, (qpt) ciiVar.y.get(), r8uVar, (wox) ciiVar.A.get(), (fqx) ciiVar.z.get());
                    case 42:
                        o9t o9tVar = ciiVar.c;
                        return new y5s(s470.GAMES_MANIA, false, true, false, false, false, 448);
                    case 43:
                        return i5t.b(ciiVar.b, (fq) ciiVar.x.get(), (fqx) ciiVar.z.get());
                    case 44:
                        return i5t.c(ciiVar.b, (aws) ciiVar.M.get());
                    case 45:
                        sek sekVar40 = ciiVar.b;
                        pbt pbtVarL37 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL37);
                        return new hsj0(pbtVarL37);
                    case 46:
                        sek sekVar41 = ciiVar.b;
                        g8i g8iVar3 = ciiVar.f4416a;
                        wsf0 wsf0VarF0 = g8iVar3.f0();
                        pbt pbtVarL38 = g8iVar3.L2();
                        x1x.x(pbtVarL38);
                        return new t0u(pbtVarL38, wsf0VarF0);
                    case 47:
                        sek sekVar42 = ciiVar.b;
                        pbt pbtVarL39 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL39);
                        return new tbu(pbtVarL39);
                    case 48:
                        return i5t.f(ciiVar.b, (a6s) ciiVar.Z.get());
                    case 49:
                        return i5t.e(ciiVar.b);
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        n5d0 n5d0Var = ciiVar.x;
                        g8i g8iVar4 = ciiVar.f4416a;
                        fq fqVar4 = (fq) n5d0Var.get();
                        i5m0 i5m0Var = (i5m0) ciiVar.f0.get();
                        xcc xccVar = (xcc) ciiVar.U.get();
                        gwt gwtVar = (gwt) ciiVar.i0.get();
                        zw90 zw90Var = (zw90) ciiVar.k0.get();
                        ntu ntuVarF5 = g8iVar4.f5();
                        zw90Var.getClass();
                        zn00 zn00Var = new zn00();
                        zn00Var.f44650a = zw90Var;
                        zn00Var.b = ntuVarF5;
                        return new a9t(fqVar4, i5m0Var, xccVar, gwtVar, zn00Var, (qa60) ciiVar.F.get(), (lzt) ciiVar.f.get(), (hyg0) ciiVar.l0.get(), (vcu) ciiVar.r.get(), (fpi0) ciiVar.m.get(), g8iVar4.v1(), (s7t0) ciiVar.D.get(), (ztt) ciiVar.k.get(), (t0u) ciiVar.X.get());
                    case 51:
                        return i5t.A(ciiVar.b, (fq) ciiVar.x.get(), ciiVar.f4416a.f0(), (g9c) ciiVar.c0.get(), (itt) ciiVar.u.get(), (yyb) ciiVar.l.get(), (lg60) ciiVar.e0.get());
                    case 52:
                        sek sekVar43 = ciiVar.b;
                        pbt pbtVarL40 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL40);
                        return new g9c(pbtVarL40);
                    case 53:
                        sek sekVar44 = ciiVar.b;
                        qni0 qni0Var = (qni0) ciiVar.d0.get();
                        pbt pbtVarL41 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL41);
                        return i5t.v(sekVar44, qni0Var, pbtVarL41);
                    case 54:
                        sek sekVar45 = ciiVar.b;
                        pbt pbtVarL42 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL42);
                        return new qni0(pbtVarL42);
                    case 55:
                        o9t o9tVar2 = ciiVar.c;
                        w9t w9tVar = (w9t) ciiVar.h0.get();
                        pbt pbtVarL43 = ciiVar.f4416a.L2();
                        x1x.x(pbtVarL43);
                        w9tVar.getClass();
                        return new gwt(w9tVar, pbtVarL43);
                    case 56:
                        t9t t9tVar = (t9t) ciiVar.g0.get();
                        btt0 btt0VarO8 = ciiVar.f4416a.o8();
                        x1x.x(btt0VarO8);
                        return new w9t(t9tVar, btt0VarO8);
                    case 57:
                        o9t o9tVar3 = ciiVar.c;
                        gii0 gii0VarJ9 = ciiVar.f4416a.j9();
                        x1x.x(gii0VarJ9);
                        return new t9t(gii0VarJ9);
                    case 58:
                        o9t o9tVar4 = ciiVar.c;
                        g8i g8iVar5 = ciiVar.f4416a;
                        w9t w9tVar2 = (w9t) ciiVar.h0.get();
                        pbt pbtVarL44 = g8iVar5.L2();
                        x1x.x(pbtVarL44);
                        eqs eqsVar = (eqs) ciiVar.j0.get();
                        gst0 gst0VarQa = g8iVar5.Qa();
                        w9tVar2.getClass();
                        eqsVar.getClass();
                        return new zw90(w9tVar2, pbtVarL44, eqsVar, gst0VarQa);
                    case 59:
                        x1x.y(o9t.f24897a);
                        return new eqs();
                    case 60:
                        o9t o9tVar5 = ciiVar.c;
                        ((eqs) ciiVar.j0.get()).getClass();
                        return new hyg0();
                    default:
                        c99.h(b2);
                        return null;
                }
        }
    }
}
