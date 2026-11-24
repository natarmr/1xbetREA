package a;

import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes5.dex */
public final class psi implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27515a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ psi(Object obj, int i, byte b) {
        this.f27515a = b;
        this.c = obj;
        this.b = i;
    }

    private final Object a() {
        i7i i7iVar = (i7i) this.c;
        vwb0 vwb0Var = (vwb0) i7iVar.l;
        ani0 ani0Var = (ani0) i7iVar.k;
        lbu lbuVar = (lbu) i7iVar.j;
        bm5 bm5Var = (bm5) i7iVar.c;
        duj dujVar = (duj) i7iVar.d;
        q4u q4uVar = (q4u) i7iVar.t;
        wdd0 wdd0Var = (wdd0) i7iVar.i;
        cad cadVar = (cad) i7iVar.p;
        wsf0 wsf0Var = (wsf0) i7iVar.v;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                return new ovf(new lrc((rrc) i7iVar.g));
            }
            if (b == 2) {
                return new hm7(new h03(vwb0Var));
            }
            if (b == 3) {
                return new ost0(new ulk(vwb0Var, (byte) 2));
            }
            if (b == 4) {
                khf0 khf0VarG = ((g45) wsf0Var.b).G();
                trm0 trm0VarS = wsf0Var.s();
                xfu xfuVar = new xfu((ovf) i7iVar.B.get());
                mne mneVarH = ((psc) cadVar.b).h();
                x1x.x(mneVarH);
                return new qnd0(khf0VarG, trm0VarS, xfuVar, lbuVar, ani0Var, dujVar, bm5Var, mneVarH, i7iVar.e, (mii0) i7iVar.u, (x20) i7iVar.w);
            }
            if (b != 5) {
                c99.h(b);
                return null;
            }
            khf0 khf0VarG2 = ((g45) wsf0Var.b).G();
            trm0 trm0VarS2 = wsf0Var.s();
            xfu xfuVar2 = new xfu((ovf) i7iVar.B.get());
            zx10 zx10Var = (zx10) i7iVar.x;
            mne mneVarH2 = ((psc) cadVar.b).h();
            x1x.x(mneVarH2);
            return new btj(khf0VarG2, trm0VarS2, xfuVar2, q4uVar, zx10Var, dujVar, bm5Var, mneVarH2, i7iVar.e);
        }
        khf0 khf0VarG3 = ((g45) wsf0Var.b).G();
        trm0 trm0VarS3 = wsf0Var.s();
        zpu zpuVar = (zpu) i7iVar.f;
        xfu xfuVar3 = new xfu((ovf) i7iVar.B.get());
        j910 j910Var = (j910) i7iVar.h;
        pru pruVar = i7iVar.b;
        vpt vptVarE = wdd0Var.e();
        x1x.x(vptVarE);
        upt uptVarD = wdd0Var.d();
        x1x.x(uptVarD);
        k9u k9uVarF = wdd0Var.f();
        x1x.x(k9uVarF);
        vyt vytVar = new vyt((hm7) i7iVar.C.get(), (byte) 0);
        pmi0 pmi0Var = new pmi0((hm7) i7iVar.C.get());
        dnv dnvVar = new dnv((hm7) i7iVar.C.get(), (byte) 0);
        czu czuVar = new czu((ost0) i7iVar.D.get(), (byte) 0);
        dzu dzuVar = (dzu) i7iVar.m;
        dzu dzuVar2 = (dzu) i7iVar.n;
        lpc lpcVar = new lpc((hm7) i7iVar.C.get(), (byte) 1);
        i1w0 i1w0Var = (i1w0) i7iVar.o;
        g2v g2vVar = new g2v((ost0) i7iVar.D.get());
        env envVar = new env((ost0) i7iVar.D.get(), (byte) 0);
        czu czuVar2 = new czu((ost0) i7iVar.D.get(), (byte) 1);
        pyu pyuVar = new pyu((ost0) i7iVar.D.get());
        fnv fnvVar = new fnv((ost0) i7iVar.D.get(), (byte) 0);
        ljf0 ljf0Var = new ljf0((ost0) i7iVar.D.get());
        ost0 ost0Var = (ost0) i7iVar.D.get();
        ost0Var.getClass();
        ani0 ani0Var2 = new ani0();
        ani0Var2.f1155a = ost0Var;
        eyg0 eyg0Var = new eyg0((ost0) i7iVar.D.get());
        env envVar2 = new env((ost0) i7iVar.D.get(), (byte) 1);
        fnv fnvVar2 = new fnv((ost0) i7iVar.D.get(), (byte) 1);
        ost0 ost0Var2 = (ost0) i7iVar.D.get();
        ost0Var2.getClass();
        lef0 lef0Var = new lef0();
        lef0Var.f19899a = ost0Var2;
        mne mneVarH3 = ((psc) cadVar.b).h();
        x1x.x(mneVarH3);
        return new w5j0(khf0VarG3, trm0VarS3, zpuVar, xfuVar3, j910Var, pruVar, vptVarE, uptVarD, k9uVarF, lbuVar, ani0Var, vytVar, pmi0Var, dnvVar, czuVar, dzuVar, dzuVar2, lpcVar, i1w0Var, g2vVar, envVar, czuVar2, pyuVar, fnvVar, ljf0Var, ani0Var2, eyg0Var, envVar2, fnvVar2, lef0Var, mneVarH3, i7iVar.e, (c8c) i7iVar.q, (pyu) i7iVar.r, (ugf0) i7iVar.s, q4uVar);
    }

    private final Object b() {
        cui cuiVar = (cui) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new gl9();
            case 1:
                mne mneVarH = ((psc) cuiVar.f4987a.b).h();
                x1x.x(mneVarH);
                return new s6t(mneVarH);
            case 2:
                mne mneVarH2 = ((psc) cuiVar.f4987a.b).h();
                x1x.x(mneVarH2);
                return new v5t(mneVarH2);
            case 3:
                return new t5t();
            case 4:
                mne mneVarH3 = ((psc) cuiVar.f4987a.b).h();
                x1x.x(mneVarH3);
                return new n6t(mneVarH3);
            case 5:
                return new z9g0();
            case 6:
                ivn ivnVar = new ivn(cuiVar.b);
                s6t s6tVar = (s6t) cuiVar.k.get();
                knf0 knf0Var = cuiVar.c;
                mne mneVarH4 = ((psc) cuiVar.f4987a.b).h();
                x1x.x(mneVarH4);
                return new u6t(ivnVar, s6tVar, knf0Var, mneVarH4);
            case 7:
                a1d a1dVar = new a1d(cuiVar.b, (byte) 28);
                n6t n6tVar = (n6t) cuiVar.n.get();
                knf0 knf0Var2 = cuiVar.c;
                mne mneVarH5 = ((psc) cuiVar.f4987a.b).h();
                x1x.x(mneVarH5);
                return new p6t(a1dVar, n6tVar, knf0Var2, mneVarH5);
            case 8:
                uyn uynVar = new uyn(cuiVar.b, (byte) 8);
                v5t v5tVar = (v5t) cuiVar.l.get();
                t5t t5tVar = (t5t) cuiVar.m.get();
                knf0 knf0Var3 = cuiVar.c;
                mne mneVarH6 = ((psc) cuiVar.f4987a.b).h();
                x1x.x(mneVarH6);
                return new b6t(uynVar, v5tVar, t5tVar, knf0Var3, mneVarH6);
            case 9:
                return new aag0((z9g0) cuiVar.o.get());
            case 10:
                u6t u6tVar = (u6t) cuiVar.p.get();
                p6t p6tVar = (p6t) cuiVar.q.get();
                b6t b6tVar = (b6t) cuiVar.r.get();
                u6tVar.getClass();
                p6tVar.getClass();
                b6tVar.getClass();
                return new brc(u6tVar, p6tVar, b6tVar);
            case 11:
                mne mneVarH7 = ((psc) cuiVar.f4987a.b).h();
                x1x.x(mneVarH7);
                return new r2m0(mneVarH7, new ljf0(cuiVar.b, (byte) 27), (m2m0) cuiVar.u.get(), cuiVar.c, (rzf) cuiVar.v.get());
            case 12:
                mne mneVarH8 = ((psc) cuiVar.f4987a.b).h();
                x1x.x(mneVarH8);
                return new m2m0(mneVarH8);
            case 13:
                return new rzf();
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object c() {
        fui fuiVar = (fui) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new vrk0();
            case 1:
                return new dui(this);
            case 2:
                return new iqp0(fuiVar.i, new ani0(fuiVar.j, (byte) 15), fuiVar.k);
            case 3:
                return new gok0(fuiVar.o);
            case 4:
                ggm0 ggm0Var = (ggm0) fuiVar.O.get();
                ggm0Var.getClass();
                return new crc(ggm0Var);
            case 5:
                mne mneVarH = ((psc) fuiVar.f.b).h();
                x1x.x(mneVarH);
                return new ggm0(mneVarH, new fuj0(fuiVar.j, (byte) 3), fuiVar.k, fuiVar.q);
            case 6:
                return new d5m0((c5m0) fuiVar.Q.get());
            case 7:
                return new c5m0();
            case 8:
                aag0 aag0Var = (aag0) fuiVar.T.get();
                aag0Var.getClass();
                return new cnv(aag0Var);
            case 9:
                z9g0 z9g0Var = (z9g0) fuiVar.S.get();
                z9g0Var.getClass();
                return new aag0(z9g0Var);
            case 10:
                return new z9g0();
            case 11:
                aag0 aag0Var2 = (aag0) fuiVar.T.get();
                aag0Var2.getClass();
                return new fmt0(aag0Var2);
            case 12:
                return new eui(this);
            case 13:
                iw20 iw20Var = new iw20(fuiVar.j, (byte) 3);
                jw20 jw20Var = new jw20((byte) 6);
                mne mneVarH2 = ((psc) fuiVar.f.b).h();
                x1x.x(mneVarH2);
                return new nh50(iw20Var, jw20Var, mneVarH2, fuiVar.k, fuiVar.F);
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object d() {
        iui iuiVar = (iui) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new hui(this);
            case 1:
                return new iqp0(iuiVar.f, new ani0(iuiVar.g, (byte) 15), iuiVar.h);
            case 2:
                return new pjp0();
            case 3:
                return new h32();
            case 4:
                dhm0 dhm0Var = (dhm0) iuiVar.U.get();
                dhm0Var.getClass();
                return new fzu(dhm0Var);
            case 5:
                mne mneVarH = ((psc) iuiVar.e.b).h();
                x1x.x(mneVarH);
                return new dhm0(mneVarH, new afm0(iuiVar.g, (byte) 1), iuiVar.h, iuiVar.r);
            case 6:
                mne mneVarH2 = ((psc) iuiVar.e.b).h();
                x1x.x(mneVarH2);
                return new ggm0(mneVarH2, new fuj0(iuiVar.g, (byte) 3), iuiVar.h, iuiVar.t);
            case 7:
                return new z6u0();
            case 8:
                return new mk30();
            case 9:
                uvu uvuVar = (uvu) iuiVar.a0.get();
                ozi oziVar = iuiVar.y;
                uvuVar.getClass();
                bzu bzuVarE = ((xzp) oziVar.h.b).E();
                h9c h9cVarF = oziVar.i.f();
                x1x.x(h9cVarF);
                return new awu(uvuVar, bzuVarE, h9cVarF);
            case 10:
                r2m0 r2m0Var = (r2m0) iuiVar.Z.get();
                r2m0Var.getClass();
                return new uvu(r2m0Var);
            case 11:
                r2m0 r2m0Var2 = (r2m0) iuiVar.p.w.get();
                x1x.y(r2m0Var2);
                return r2m0Var2;
            case 12:
                return new jtk0();
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object e() {
        kui kuiVar = (kui) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new i6i(this, (byte) 11);
            case 1:
                sek sekVar = kuiVar.b;
                s7t0 s7t0Var = (s7t0) kuiVar.D.get();
                pbt pbtVarL2 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL2);
                return i5t.r(sekVar, s7t0Var, pbtVarL2);
            case 2:
                sek sekVar2 = kuiVar.b;
                g8i g8iVar = kuiVar.f18911a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                d3c d3cVar = (d3c) kuiVar.e.get();
                fq fqVar = (fq) kuiVar.x.get();
                qpt qptVar = (qpt) kuiVar.y.get();
                gmt gmtVar = (gmt) kuiVar.j.get();
                rgs rgsVar = (rgs) kuiVar.C.get();
                r9u r9uVarH4 = g8iVar.h4();
                x1x.x(r9uVarH4);
                return i5t.C(sekVar2, pbtVarL3, d3cVar, fqVar, qptVar, gmtVar, rgsVar, r9uVarH4);
            case 3:
                sek sekVar3 = kuiVar.b;
                pbt pbtVarL4 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL4);
                return new d3c(pbtVarL4);
            case 4:
                sek sekVar4 = kuiVar.b;
                lzt lztVar = (lzt) kuiVar.f.get();
                zmi0 zmi0Var = (zmi0) kuiVar.g.get();
                pbt pbtVarL5 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL5);
                return mkg.g(sekVar4, lztVar, zmi0Var, pbtVarL5, (xyb) kuiVar.h.get(), (yyb) kuiVar.l.get(), (fpi0) kuiVar.m.get(), (nqt) kuiVar.n.get(), (spx) kuiVar.o.get(), (oqt) kuiVar.p.get(), (hni0) kuiVar.q.get(), (vcu) kuiVar.r.get(), (d3c) kuiVar.e.get(), (wni0) kuiVar.s.get(), (ztt) kuiVar.k.get(), (pqt) kuiVar.t.get(), (itt) kuiVar.u.get(), (q78) kuiVar.v.get(), (gmt) kuiVar.j.get(), (ecs) kuiVar.w.get());
            case 5:
                sek sekVar5 = kuiVar.b;
                g8i g8iVar2 = kuiVar.f18911a;
                pbt pbtVarL6 = g8iVar2.L2();
                x1x.x(pbtVarL6);
                m1e m1eVarQ1 = g8iVar2.q1();
                x1x.x(m1eVarQ1);
                return new lzt(pbtVarL6, m1eVarQ1);
            case 6:
                sek sekVar6 = kuiVar.b;
                pbt pbtVarL7 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL7);
                return new zmi0(pbtVarL7);
            case 7:
                sek sekVar7 = kuiVar.b;
                pbt pbtVarL8 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL8);
                return new xyb(pbtVarL8);
            case 8:
                sek sekVar8 = kuiVar.b;
                k1u k1uVar = (k1u) kuiVar.i.get();
                gmt gmtVar2 = (gmt) kuiVar.j.get();
                ztt zttVar = (ztt) kuiVar.k.get();
                pbt pbtVarL9 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL9);
                return i5t.a(sekVar8, k1uVar, gmtVar2, zttVar, pbtVarL9);
            case 9:
                sek sekVar9 = kuiVar.b;
                return new k1u(kuiVar.b());
            case 10:
                sek sekVar10 = kuiVar.b;
                pbt pbtVarL10 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL10);
                return new gmt(pbtVarL10);
            case 11:
                sek sekVar11 = kuiVar.b;
                pbt pbtVarL11 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL11);
                return new ztt(pbtVarL11);
            case 12:
                sek sekVar12 = kuiVar.b;
                pbt pbtVarL12 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL12);
                return new fpi0(pbtVarL12);
            case 13:
                sek sekVar13 = kuiVar.b;
                pbt pbtVarL13 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL13);
                return new nqt(pbtVarL13);
            case 14:
                sek sekVar14 = kuiVar.b;
                pbt pbtVarL14 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL14);
                return new spx(pbtVarL14);
            case 15:
                sek sekVar15 = kuiVar.b;
                pbt pbtVarL15 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL15);
                return new oqt(pbtVarL15);
            case 16:
                sek sekVar16 = kuiVar.b;
                pbt pbtVarL16 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL16);
                return new hni0(pbtVarL16);
            case 17:
                sek sekVar17 = kuiVar.b;
                pbt pbtVarL17 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL17);
                return new vcu(pbtVarL17);
            case 18:
                sek sekVar18 = kuiVar.b;
                pbt pbtVarL18 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL18);
                return new wni0(pbtVarL18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar19 = kuiVar.b;
                pbt pbtVarL19 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL19);
                return new pqt(pbtVarL19);
            case 20:
                sek sekVar20 = kuiVar.b;
                pbt pbtVarL20 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL20);
                return new itt(pbtVarL20);
            case 21:
                sek sekVar21 = kuiVar.b;
                pbt pbtVarL21 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL21);
                return new q78(pbtVarL21);
            case 22:
                sek sekVar22 = kuiVar.b;
                pbt pbtVarL22 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL22);
                return new ecs(pbtVarL22);
            case 23:
                sek sekVar23 = kuiVar.b;
                pbt pbtVarL23 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL23);
                return new qpt(pbtVarL23);
            case 24:
                sek sekVar24 = kuiVar.b;
                fq fqVar2 = (fq) kuiVar.x.get();
                fqx fqxVar = (fqx) kuiVar.z.get();
                wox woxVar = (wox) kuiVar.A.get();
                return i5t.g(fqVar2, sekVar24, (qpt) kuiVar.y.get(), (r8u) kuiVar.B.get(), woxVar, fqxVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar25 = kuiVar.b;
                pbt pbtVarL24 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL24);
                return new fqx(pbtVarL24);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar26 = kuiVar.b;
                pbt pbtVarL25 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL25);
                return new wox(pbtVarL25);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar27 = kuiVar.b;
                pbt pbtVarL26 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL26);
                return new r8u(pbtVarL26);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                sek sekVar28 = kuiVar.b;
                pbt pbtVarL27 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL27);
                return new qa60(pbtVarL27);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar29 = kuiVar.b;
                pbt pbtVarL28 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL28);
                return new ipi0(pbtVarL28);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                sek sekVar30 = kuiVar.b;
                pbt pbtVarL29 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL29);
                return new xsi0(pbtVarL29);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                sek sekVar31 = kuiVar.b;
                pbt pbtVarL30 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL30);
                return new gpx(pbtVarL30);
            case 32:
                sek sekVar32 = kuiVar.b;
                pbt pbtVarL31 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL31);
                return new vni0(pbtVarL31);
            case 33:
                sek sekVar33 = kuiVar.b;
                pbt pbtVarL32 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL32);
                return new hs(pbtVarL32);
            case 34:
                sek sekVar34 = kuiVar.b;
                pbt pbtVarL33 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL33);
                return new eni0(pbtVarL33);
            case 35:
                return i5t.z(kuiVar.b, (aws) kuiVar.M.get());
            case 36:
                sek sekVar35 = kuiVar.b;
                yvs yvsVarG2 = kuiVar.f18911a.G2();
                x1x.x(yvsVarG2);
                return new aws(yvsVarG2);
            case 37:
                sek sekVar36 = kuiVar.b;
                pbt pbtVarL34 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL34);
                return new hj50(pbtVarL34);
            case 38:
                sek sekVar37 = kuiVar.b;
                pbt pbtVarL35 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL35);
                return new qhf0(pbtVarL35);
            case 39:
                return i5t.d(kuiVar.b, (foi0) kuiVar.Q.get(), (fq) kuiVar.x.get());
            case 40:
                sek sekVar38 = kuiVar.b;
                pbt pbtVarL36 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL36);
                return new foi0(pbtVarL36);
            case 41:
                sek sekVar39 = kuiVar.b;
                fq fqVar3 = (fq) kuiVar.x.get();
                r8u r8uVar = (r8u) kuiVar.B.get();
                return i5t.B(fqVar3, sekVar39, (qpt) kuiVar.y.get(), r8uVar, (wox) kuiVar.A.get(), (fqx) kuiVar.z.get());
            case 42:
                gne0 gne0Var = kuiVar.c;
                return new y5s(s470.SPIN_AND_WIN, false, false, true, false, false, 192);
            case 43:
                return i5t.b(kuiVar.b, (fq) kuiVar.x.get(), (fqx) kuiVar.z.get());
            case 44:
                return i5t.c(kuiVar.b, (aws) kuiVar.M.get());
            case 45:
                sek sekVar40 = kuiVar.b;
                pbt pbtVarL37 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL37);
                return new hsj0(pbtVarL37);
            case 46:
                sek sekVar41 = kuiVar.b;
                g8i g8iVar3 = kuiVar.f18911a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL38 = g8iVar3.L2();
                x1x.x(pbtVarL38);
                return new t0u(pbtVarL38, wsf0VarF0);
            case 47:
                sek sekVar42 = kuiVar.b;
                pbt pbtVarL39 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL39);
                return new tbu(pbtVarL39);
            case 48:
                return i5t.f(kuiVar.b, (a6s) kuiVar.Z.get());
            case 49:
                return i5t.e(kuiVar.b);
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                return new jui(this);
            case 51:
                sek sekVar43 = kuiVar.b;
                l1u l1uVar = (l1u) kuiVar.c0.get();
                pbt pbtVarL40 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL40);
                l1uVar.getClass();
                return new wkt0(l1uVar, pbtVarL40);
            case 52:
                sek sekVar44 = kuiVar.b;
                return new l1u(kuiVar.b());
            case 53:
                return i5t.A(kuiVar.b, (fq) kuiVar.x.get(), kuiVar.f18911a.f0(), (g9c) kuiVar.e0.get(), (itt) kuiVar.u.get(), (yyb) kuiVar.l.get(), (lg60) kuiVar.g0.get());
            case 54:
                sek sekVar45 = kuiVar.b;
                pbt pbtVarL41 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL41);
                return new g9c(pbtVarL41);
            case 55:
                sek sekVar46 = kuiVar.b;
                qni0 qni0Var = (qni0) kuiVar.f0.get();
                pbt pbtVarL42 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL42);
                return i5t.v(sekVar46, qni0Var, pbtVarL42);
            case 56:
                sek sekVar47 = kuiVar.b;
                pbt pbtVarL43 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL43);
                return new qni0(pbtVarL43);
            case 57:
                gne0 gne0Var2 = kuiVar.c;
                bzk0 bzk0Var = (bzk0) kuiVar.k0.get();
                bzk0Var.getClass();
                return new js(bzk0Var);
            case 58:
                gne0 gne0Var3 = kuiVar.c;
                g8i g8iVar4 = kuiVar.f18911a;
                knf0 knf0VarJ8 = g8iVar4.J8();
                x1x.x(knf0VarJ8);
                lme0 lme0Var = new lme0(new gl5((byte) 27), new gle0());
                zyk0 zyk0Var = (zyk0) kuiVar.i0.get();
                uyk0 uyk0Var = (uyk0) kuiVar.j0.get();
                btt0 btt0VarO8 = g8iVar4.o8();
                x1x.x(btt0VarO8);
                zyk0Var.getClass();
                uyk0Var.getClass();
                return new bzk0(knf0VarJ8, lme0Var, zyk0Var, uyk0Var, btt0VarO8);
            case 59:
                gne0 gne0Var4 = kuiVar.c;
                gii0 gii0VarJ9 = kuiVar.f18911a.j9();
                x1x.x(gii0VarJ9);
                return new zyk0(gii0VarJ9);
            case 60:
                return new uyk0();
            case 61:
                gne0 gne0Var5 = kuiVar.c;
                bzk0 bzk0Var2 = (bzk0) kuiVar.k0.get();
                bzk0Var2.getClass();
                return new yrc(bzk0Var2);
            case 62:
                gne0 gne0Var6 = kuiVar.c;
                return new hot();
            case 63:
                gne0 gne0Var7 = kuiVar.c;
                bzk0 bzk0Var3 = (bzk0) kuiVar.k0.get();
                bzk0Var3.getClass();
                return new o1u(bzk0Var3);
            case 64:
                gne0 gne0Var8 = kuiVar.c;
                bzk0 bzk0Var4 = (bzk0) kuiVar.k0.get();
                bzk0Var4.getClass();
                return new ysu(bzk0Var4);
            case 65:
                gne0 gne0Var9 = kuiVar.c;
                bzk0 bzk0Var5 = (bzk0) kuiVar.k0.get();
                bzk0Var5.getClass();
                return new muu(bzk0Var5);
            case 66:
                gne0 gne0Var10 = kuiVar.c;
                bzk0 bzk0Var6 = (bzk0) kuiVar.k0.get();
                pbt pbtVarL44 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL44);
                bzk0Var6.getClass();
                return new jx90(bzk0Var6, pbtVarL44);
            case 67:
                gne0 gne0Var11 = kuiVar.c;
                bzk0 bzk0Var7 = (bzk0) kuiVar.k0.get();
                bzk0Var7.getClass();
                return new fhf0(bzk0Var7);
            case 68:
                gne0 gne0Var12 = kuiVar.c;
                bzk0 bzk0Var8 = (bzk0) kuiVar.k0.get();
                wkt0 wkt0Var = (wkt0) kuiVar.d0.get();
                bzk0Var8.getClass();
                wkt0Var.getClass();
                return new kif0(bzk0Var8, wkt0Var);
            case 69:
                gne0 gne0Var13 = kuiVar.c;
                bzk0 bzk0Var9 = (bzk0) kuiVar.k0.get();
                bzk0Var9.getClass();
                return new poi0(bzk0Var9);
            case 70:
                gne0 gne0Var14 = kuiVar.c;
                bzk0 bzk0Var10 = (bzk0) kuiVar.k0.get();
                bzk0Var10.getClass();
                return new gmt0(bzk0Var10);
            case 71:
                sek sekVar48 = kuiVar.b;
                pbt pbtVarL45 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL45);
                return new egu(pbtVarL45);
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object f() {
        pui puiVar = (pui) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                he1 he1Var = new he1(puiVar.f27618a, (byte) 4);
                dpi0 dpi0Var = new dpi0(puiVar.b, (byte) 11);
                k3h0 k3h0Var = (k3h0) puiVar.w.get();
                jym0 jym0Var = (jym0) puiVar.x.get();
                i9s i9sVar = (i9s) puiVar.y.get();
                xyt xytVar = puiVar.c;
                knf0 knf0Var = puiVar.d;
                pc90 pc90Var = (pc90) puiVar.z.get();
                mne mneVarH = ((psc) puiVar.e.b).h();
                x1x.x(mneVarH);
                return new tdl0(he1Var, dpi0Var, k3h0Var, jym0Var, i9sVar, xytVar, knf0Var, pc90Var, mneVarH, (m530) puiVar.A.get(), (x2b) puiVar.B.get(), puiVar.f, (yr20) puiVar.Y.get(), (nf6) puiVar.Z.get());
            case 1:
                return new k3h0();
            case 2:
                return new jym0();
            case 3:
                return new i9s();
            case 4:
                return new pc90();
            case 5:
                return new m530();
            case 6:
                return new x2b();
            case 7:
                return new yr20();
            case 8:
                return new nf6();
            case 9:
                return new jx50((ix50) puiVar.g1.get());
            case 10:
                return new ix50();
            case 11:
                epi0 epi0Var = new epi0(puiVar.b, (byte) 22);
                mne mneVarH2 = ((psc) puiVar.e.b).h();
                x1x.x(mneVarH2);
                return new ins0(epi0Var, mneVarH2);
            case 12:
                return new aja((rfs) puiVar.j1.get(), puiVar.j);
            case 13:
                return new rfs();
            case 14:
                return new w5s((h5s) puiVar.l1.get());
            case 15:
                return new h5s();
            case 16:
                fvt0 fvt0Var = new fvt0(puiVar.b, (byte) 12);
                xyt xytVar2 = puiVar.c;
                knf0 knf0Var2 = puiVar.d;
                mne mneVarH3 = ((psc) puiVar.e.b).h();
                x1x.x(mneVarH3);
                return new bl6(fvt0Var, xytVar2, knf0Var2, mneVarH3, new he1(puiVar.f27618a, (byte) 4), (xi6) puiVar.n1.get(), (jym0) puiVar.x.get(), (yvf) puiVar.o1.get(), (i9s) puiVar.y.get(), (k3h0) puiVar.w.get(), (pc90) puiVar.z.get());
            case 17:
                return new xi6();
            case 18:
                return new yvf();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new l3z((mws) puiVar.q1.get(), (gus) puiVar.r1.get());
            case 20:
                return new mws();
            case 21:
                return new gus();
            case 22:
                he1 he1Var2 = new he1(puiVar.f27618a, (byte) 4);
                mne mneVarH4 = ((psc) puiVar.e.b).h();
                x1x.x(mneVarH4);
                return new rjl0(he1Var2, mneVarH4);
            case 23:
                hru hruVar = new hru(puiVar.b, (byte) 15);
                knf0 knf0Var3 = puiVar.d;
                mne mneVarH5 = ((psc) puiVar.e.b).h();
                x1x.x(mneVarH5);
                return new q700(hruVar, knf0Var3, mneVarH5);
            case 24:
                pmi0 pmi0Var = new pmi0(puiVar.b, (byte) 18);
                knf0 knf0Var4 = puiVar.d;
                mne mneVarH6 = ((psc) puiVar.e.b).h();
                x1x.x(mneVarH6);
                return new bwl0(pmi0Var, knf0Var4, mneVarH6);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                knf0 knf0Var5 = puiVar.d;
                uyn uynVar = new uyn(puiVar.b, (byte) 7);
                kuy kuyVar = puiVar.p;
                mne mneVarH7 = ((psc) puiVar.e.b).h();
                x1x.x(mneVarH7);
                return new wf30(knf0Var5, uynVar, kuyVar, mneVarH7);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new n9s((i9s) puiVar.y.get());
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new ik6((hk6) puiVar.y1.get());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new hk6();
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                return new yi6((xi6) puiVar.n1.get());
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return new kym0((jym0) puiVar.x.get(), (yvf) puiVar.o1.get(), (lym0) puiVar.B1.get());
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return new lym0();
            case 32:
                return new p530((m530) puiVar.A.get());
            case 33:
                return new rr20((x2b) puiVar.B.get());
            case 34:
                return new wi9((k3h0) puiVar.w.get(), (pc90) puiVar.z.get());
            case 35:
                return new n730((jx7) puiVar.G1.get());
            case 36:
                return new jx7();
            case 37:
                return new ino((pmo) puiVar.I1.get());
            case 38:
                return new pmo();
            case 39:
                return new goo((uno) puiVar.K1.get(), (yvf) puiVar.o1.get());
            case 40:
                return new uno();
            case 41:
                return new fno((cno) puiVar.M1.get(), (yr20) puiVar.Y.get());
            case 42:
                return new cno();
            case 43:
                w4p0 w4p0Var = new w4p0(puiVar.b, (byte) 18);
                mne mneVarH8 = ((psc) puiVar.e.b).h();
                x1x.x(mneVarH8);
                return new a4w0(w4p0Var, mneVarH8);
            case 44:
                return new as20((yr20) puiVar.Y.get());
            case 45:
                return new tpp((a17) puiVar.R1.get());
            case 46:
                r7v r7vVar = new r7v(puiVar.b, (byte) 12);
                knf0 knf0Var6 = puiVar.d;
                kuy kuyVar2 = puiVar.p;
                mne mneVarH9 = ((psc) puiVar.e.b).h();
                x1x.x(mneVarH9);
                return new a17(r7vVar, knf0Var6, kuyVar2, mneVarH9, (x07) puiVar.Q1.get());
            case 47:
                return new x07();
            case 48:
                return new ecu((a17) puiVar.R1.get());
            case 49:
                return new pqc((a17) puiVar.R1.get());
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                ((ins0) puiVar.i1.get()).getClass();
                return new rqt();
            case 51:
                return new lku((as20) puiVar.P1.get());
            case 52:
                return new f2v((kgr0) puiVar.Y1.get());
            case 53:
                return new kgr0((jgr0) puiVar.X1.get());
            case 54:
                return new jgr0();
            case 55:
                return new hmt0((kgr0) puiVar.Y1.get());
            case 56:
                return new oku((tdl0) puiVar.f1.get());
            case 57:
                return new aqp((fix) puiVar.d2.get(), puiVar.g, new rou(puiVar.t, (byte) 0), puiVar.u, ((cih) puiVar.v.b).a());
            case 58:
                return new fix(new ocl(puiVar.b, (byte) 10), (ugx) puiVar.c2.get(), puiVar.f, puiVar.d);
            case 59:
                return new ugx();
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object g() {
        yhi yhiVar = (yhi) this.c;
        gii0 gii0Var = (gii0) yhiVar.p;
        ocl oclVar = (ocl) yhiVar.j;
        TypeStageId typeStageId = (TypeStageId) yhiVar.d;
        pmi0 pmi0Var = (pmi0) yhiVar.k;
        cad cadVar = (cad) yhiVar.f42638a;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                trm0 trm0Var = new trm0(gii0Var, (byte) 5);
                n7e0 n7e0Var = new n7e0(gii0Var, (byte) 1);
                l2m0 l2m0Var = (l2m0) yhiVar.q;
                knf0 knf0Var = (knf0) yhiVar.r;
                mne mneVarH = ((psc) cadVar.b).h();
                x1x.x(mneVarH);
                return new q2m0(trm0Var, n7e0Var, l2m0Var, knf0Var, mneVarH);
            }
            if (b == 2) {
                mne mneVarH2 = ((psc) cadVar.b).h();
                x1x.x(mneVarH2);
                return new ezl0(typeStageId, mneVarH2, oclVar, new ivn((q2m0) ((n5d0) yhiVar.c).get()), new zrc((q2m0) ((n5d0) yhiVar.c).get(), (byte) 0));
            }
            if (b != 3) {
                c99.h(b);
                return null;
            }
            mne mneVarH3 = ((psc) cadVar.b).h();
            x1x.x(mneVarH3);
            return new ghv(mneVarH3, new zrc((q2m0) ((n5d0) yhiVar.c).get(), (byte) 1), new e1u((q2m0) ((n5d0) yhiVar.c).get()));
        }
        long jLongValue = ((Long) yhiVar.e).longValue();
        long jLongValue2 = ((Long) yhiVar.f).longValue();
        String str = (String) yhiVar.g;
        ctf0 ctf0Var = (ctf0) yhiVar.h;
        mne mneVarH4 = ((psc) cadVar.b).h();
        x1x.x(mneVarH4);
        i1w0 i1w0Var = (i1w0) yhiVar.i;
        m1e m1eVar = (m1e) yhiVar.b;
        nfm0 nfm0VarA = ((daf) pmi0Var.f27236a).A();
        x1x.x(nfm0VarA);
        weu weuVar = new weu(nfm0VarA, (byte) 0);
        qzt qztVar = new qzt((pru) yhiVar.l, (byte) 0);
        fhj fhjVarR = ((daf) pmi0Var.f27236a).r();
        uyu uyuVar = (uyu) yhiVar.m;
        wyu wyuVar = (wyu) yhiVar.o;
        ivn ivnVar = new ivn((q2m0) ((n5d0) yhiVar.c).get());
        zrc zrcVar = new zrc((q2m0) ((n5d0) yhiVar.c).get(), (byte) 0);
        y2m0 y2m0Var = new y2m0((byte) 15);
        luu luuVarW = ((daf) ((ugf0) yhiVar.s).f35622a).w();
        x1x.x(luuVarW);
        return new umo0(typeStageId, jLongValue, jLongValue2, str, ctf0Var, mneVarH4, i1w0Var, oclVar, m1eVar, weuVar, qztVar, fhjVarR, uyuVar, wyuVar, ivnVar, zrcVar, y2m0Var, luuVarW, new zrc((q2m0) ((n5d0) yhiVar.c).get(), (byte) 1), new e1u((q2m0) ((n5d0) yhiVar.c).get()), ((daf) pmi0Var.f27236a).q(), (r9u) yhiVar.n);
    }

    private final Object h() {
        ru ruVar = (ru) this.c;
        byte b = this.b;
        if (b == 0) {
            return new vwi(this);
        }
        if (b != 1) {
            if (b != 2) {
                c99.h(b);
                return null;
            }
            gii0 gii0Var = (gii0) ruVar.c;
            gii0Var.getClass();
            return new vyp0(gii0Var);
        }
        vyp0 vyp0Var = (vyp0) ((n5d0) ruVar.h).get();
        knf0 knf0Var = (knf0) ruVar.d;
        typ0 typ0Var = (typ0) ruVar.f;
        kuy kuyVar = (kuy) ruVar.g;
        vyp0Var.getClass();
        knf0Var.getClass();
        typ0Var.getClass();
        kuyVar.getClass();
        return new xyp0(vyp0Var, knf0Var, typ0Var, kuyVar);
    }

    private final Object i() {
        nc0 nc0Var = (nc0) this.c;
        byte b = this.b;
        if (b == 0) {
            return new wwi(this);
        }
        if (b != 1) {
            if (b != 2) {
                c99.h(b);
                return null;
            }
            gii0 gii0Var = (gii0) nc0Var.i;
            gii0Var.getClass();
            return new vyp0(gii0Var);
        }
        vyp0 vyp0Var = (vyp0) ((n5d0) nc0Var.l).get();
        knf0 knf0Var = (knf0) nc0Var.b;
        typ0 typ0Var = (typ0) nc0Var.j;
        kuy kuyVar = (kuy) nc0Var.k;
        vyp0Var.getClass();
        knf0Var.getClass();
        typ0Var.getClass();
        kuyVar.getClass();
        return new xyp0(vyp0Var, knf0Var, typ0Var, kuyVar);
    }

    private final Object j() {
        xwi xwiVar = (xwi) this.c;
        ocl oclVar = xwiVar.g;
        duj dujVar = xwiVar.i;
        cad cadVar = xwiVar.e;
        byte b = this.b;
        if (b == 0) {
            String str = xwiVar.f41610a;
            String str2 = xwiVar.b;
            k0q0 k0q0Var = (k0q0) xwiVar.l.get();
            k0q0Var.getClass();
            pyu pyuVar = new pyu();
            pyuVar.f27815a = k0q0Var;
            n4u n4uVar = new n4u((k0q0) xwiVar.l.get());
            w1u w1uVar = new w1u((k0q0) xwiVar.l.get(), (byte) 0);
            fck0 fck0Var = new fck0((Object) new zqt((k0q0) xwiVar.l.get(), (byte) 2), (Object) new rdq((k0q0) xwiVar.l.get(), (byte) 1), (byte) 13);
            w4u w4uVar = new w4u((k0q0) xwiVar.l.get(), (byte) 1);
            zqt zqtVar = new zqt((k0q0) xwiVar.l.get(), (byte) 1);
            ctf0 ctf0Var = xwiVar.f;
            mne mneVarH = ((psc) cadVar.b).h();
            x1x.x(mneVarH);
            return new x0q0(str, str2, pyuVar, n4uVar, w1uVar, fck0Var, w4uVar, zqtVar, ctf0Var, oclVar, mneVarH, xwiVar.h, dujVar, xwiVar.j);
        }
        if (b == 1) {
            h0q0 h0q0Var = new h0q0();
            h0q0Var.f12247a = rgv0.g;
            h0q0Var.b = new ArrayList();
            zzp0 zzp0Var = zzp0.c;
            h0q0Var.c = zzp0Var;
            h0q0Var.d = zzp0Var;
            pmi0 pmi0Var = new pmi0(xwiVar.c, (byte) 26);
            knf0 knf0Var = xwiVar.d;
            mne mneVarH2 = ((psc) cadVar.b).h();
            x1x.x(mneVarH2);
            return new k0q0(h0q0Var, pmi0Var, knf0Var, mneVarH2);
        }
        if (b == 2) {
            w1u w1uVar2 = new w1u((k0q0) xwiVar.l.get(), (byte) 0);
            w4u w4uVar2 = new w4u((k0q0) xwiVar.l.get(), (byte) 0);
            yqt yqtVar = new yqt((k0q0) xwiVar.l.get(), (byte) 1);
            rdq rdqVar = new rdq((k0q0) xwiVar.l.get(), (byte) 1);
            rdq rdqVar2 = new rdq((k0q0) xwiVar.l.get(), (byte) 0);
            zqt zqtVar2 = new zqt((k0q0) xwiVar.l.get(), (byte) 2);
            w1u w1uVar3 = new w1u((k0q0) xwiVar.l.get(), (byte) 1);
            ctf0 ctf0Var2 = xwiVar.f;
            i1w0 i1w0Var = xwiVar.h;
            mne mneVarH3 = ((psc) cadVar.b).h();
            x1x.x(mneVarH3);
            return new y4q(w1uVar2, w4uVar2, yqtVar, rdqVar, rdqVar2, zqtVar2, w1uVar3, oclVar, ctf0Var2, i1w0Var, mneVarH3);
        }
        if (b == 3) {
            yqt yqtVar2 = new yqt((k0q0) xwiVar.l.get(), (byte) 0);
            yqt yqtVar3 = new yqt((k0q0) xwiVar.l.get(), (byte) 1);
            mne mneVarH4 = ((psc) cadVar.b).h();
            x1x.x(mneVarH4);
            return new rg30(yqtVar2, yqtVar3, dujVar, mneVarH4);
        }
        if (b != 4) {
            c99.h(b);
            return null;
        }
        zqt zqtVar3 = new zqt((k0q0) xwiVar.l.get(), (byte) 0);
        yqt yqtVar4 = new yqt((k0q0) xwiVar.l.get(), (byte) 1);
        mne mneVarH5 = ((psc) cadVar.b).h();
        x1x.x(mneVarH5);
        return new mjh0(zqtVar3, yqtVar4, dujVar, mneVarH5);
    }

    private final Object k() {
        gxi gxiVar = (gxi) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new i6i(this, (byte) 12);
            case 1:
                sek sekVar = gxiVar.b;
                s7t0 s7t0Var = (s7t0) gxiVar.E.get();
                pbt pbtVarL2 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL2);
                return i5t.r(sekVar, s7t0Var, pbtVarL2);
            case 2:
                sek sekVar2 = gxiVar.b;
                g8i g8iVar = gxiVar.f12079a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                d3c d3cVar = (d3c) gxiVar.f.get();
                fq fqVar = (fq) gxiVar.y.get();
                qpt qptVar = (qpt) gxiVar.z.get();
                gmt gmtVar = (gmt) gxiVar.k.get();
                rgs rgsVar = (rgs) gxiVar.D.get();
                r9u r9uVarH4 = g8iVar.h4();
                x1x.x(r9uVarH4);
                return i5t.C(sekVar2, pbtVarL3, d3cVar, fqVar, qptVar, gmtVar, rgsVar, r9uVarH4);
            case 3:
                sek sekVar3 = gxiVar.b;
                pbt pbtVarL4 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL4);
                return new d3c(pbtVarL4);
            case 4:
                sek sekVar4 = gxiVar.b;
                lzt lztVar = (lzt) gxiVar.g.get();
                zmi0 zmi0Var = (zmi0) gxiVar.h.get();
                pbt pbtVarL5 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL5);
                return mkg.g(sekVar4, lztVar, zmi0Var, pbtVarL5, (xyb) gxiVar.i.get(), (yyb) gxiVar.m.get(), (fpi0) gxiVar.n.get(), (nqt) gxiVar.o.get(), (spx) gxiVar.p.get(), (oqt) gxiVar.q.get(), (hni0) gxiVar.r.get(), (vcu) gxiVar.s.get(), (d3c) gxiVar.f.get(), (wni0) gxiVar.t.get(), (ztt) gxiVar.l.get(), (pqt) gxiVar.u.get(), (itt) gxiVar.v.get(), (q78) gxiVar.w.get(), (gmt) gxiVar.k.get(), (ecs) gxiVar.x.get());
            case 5:
                sek sekVar5 = gxiVar.b;
                g8i g8iVar2 = gxiVar.f12079a;
                pbt pbtVarL6 = g8iVar2.L2();
                x1x.x(pbtVarL6);
                m1e m1eVarQ1 = g8iVar2.q1();
                x1x.x(m1eVarQ1);
                return new lzt(pbtVarL6, m1eVarQ1);
            case 6:
                sek sekVar6 = gxiVar.b;
                pbt pbtVarL7 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL7);
                return new zmi0(pbtVarL7);
            case 7:
                sek sekVar7 = gxiVar.b;
                pbt pbtVarL8 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL8);
                return new xyb(pbtVarL8);
            case 8:
                sek sekVar8 = gxiVar.b;
                k1u k1uVar = (k1u) gxiVar.j.get();
                gmt gmtVar2 = (gmt) gxiVar.k.get();
                ztt zttVar = (ztt) gxiVar.l.get();
                pbt pbtVarL9 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL9);
                return i5t.a(sekVar8, k1uVar, gmtVar2, zttVar, pbtVarL9);
            case 9:
                sek sekVar9 = gxiVar.b;
                return new k1u(gxiVar.b());
            case 10:
                sek sekVar10 = gxiVar.b;
                pbt pbtVarL10 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL10);
                return new gmt(pbtVarL10);
            case 11:
                sek sekVar11 = gxiVar.b;
                pbt pbtVarL11 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL11);
                return new ztt(pbtVarL11);
            case 12:
                sek sekVar12 = gxiVar.b;
                pbt pbtVarL12 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL12);
                return new fpi0(pbtVarL12);
            case 13:
                sek sekVar13 = gxiVar.b;
                pbt pbtVarL13 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL13);
                return new nqt(pbtVarL13);
            case 14:
                sek sekVar14 = gxiVar.b;
                pbt pbtVarL14 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL14);
                return new spx(pbtVarL14);
            case 15:
                sek sekVar15 = gxiVar.b;
                pbt pbtVarL15 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL15);
                return new oqt(pbtVarL15);
            case 16:
                sek sekVar16 = gxiVar.b;
                pbt pbtVarL16 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL16);
                return new hni0(pbtVarL16);
            case 17:
                sek sekVar17 = gxiVar.b;
                pbt pbtVarL17 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL17);
                return new vcu(pbtVarL17);
            case 18:
                sek sekVar18 = gxiVar.b;
                pbt pbtVarL18 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL18);
                return new wni0(pbtVarL18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar19 = gxiVar.b;
                pbt pbtVarL19 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL19);
                return new pqt(pbtVarL19);
            case 20:
                sek sekVar20 = gxiVar.b;
                pbt pbtVarL20 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL20);
                return new itt(pbtVarL20);
            case 21:
                sek sekVar21 = gxiVar.b;
                pbt pbtVarL21 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL21);
                return new q78(pbtVarL21);
            case 22:
                sek sekVar22 = gxiVar.b;
                pbt pbtVarL22 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL22);
                return new ecs(pbtVarL22);
            case 23:
                sek sekVar23 = gxiVar.b;
                pbt pbtVarL23 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL23);
                return new qpt(pbtVarL23);
            case 24:
                sek sekVar24 = gxiVar.b;
                fq fqVar2 = (fq) gxiVar.y.get();
                fqx fqxVar = (fqx) gxiVar.A.get();
                wox woxVar = (wox) gxiVar.B.get();
                return i5t.g(fqVar2, sekVar24, (qpt) gxiVar.z.get(), (r8u) gxiVar.C.get(), woxVar, fqxVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar25 = gxiVar.b;
                pbt pbtVarL24 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL24);
                return new fqx(pbtVarL24);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar26 = gxiVar.b;
                pbt pbtVarL25 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL25);
                return new wox(pbtVarL25);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar27 = gxiVar.b;
                pbt pbtVarL26 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL26);
                return new r8u(pbtVarL26);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                sek sekVar28 = gxiVar.b;
                pbt pbtVarL27 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL27);
                return new qa60(pbtVarL27);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar29 = gxiVar.b;
                pbt pbtVarL28 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL28);
                return new ipi0(pbtVarL28);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                sek sekVar30 = gxiVar.b;
                pbt pbtVarL29 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL29);
                return new xsi0(pbtVarL29);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                sek sekVar31 = gxiVar.b;
                pbt pbtVarL30 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL30);
                return new gpx(pbtVarL30);
            case 32:
                sek sekVar32 = gxiVar.b;
                pbt pbtVarL31 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL31);
                return new vni0(pbtVarL31);
            case 33:
                sek sekVar33 = gxiVar.b;
                pbt pbtVarL32 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL32);
                return new hs(pbtVarL32);
            case 34:
                sek sekVar34 = gxiVar.b;
                pbt pbtVarL33 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL33);
                return new eni0(pbtVarL33);
            case 35:
                return i5t.z(gxiVar.b, (aws) gxiVar.N.get());
            case 36:
                sek sekVar35 = gxiVar.b;
                yvs yvsVarG2 = gxiVar.f12079a.G2();
                x1x.x(yvsVarG2);
                return new aws(yvsVarG2);
            case 37:
                sek sekVar36 = gxiVar.b;
                pbt pbtVarL34 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL34);
                return new hj50(pbtVarL34);
            case 38:
                sek sekVar37 = gxiVar.b;
                pbt pbtVarL35 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL35);
                return new qhf0(pbtVarL35);
            case 39:
                return i5t.d(gxiVar.b, (foi0) gxiVar.R.get(), (fq) gxiVar.y.get());
            case 40:
                sek sekVar38 = gxiVar.b;
                pbt pbtVarL36 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL36);
                return new foi0(pbtVarL36);
            case 41:
                sek sekVar39 = gxiVar.b;
                fq fqVar3 = (fq) gxiVar.y.get();
                r8u r8uVar = (r8u) gxiVar.C.get();
                return i5t.B(fqVar3, sekVar39, (qpt) gxiVar.z.get(), r8uVar, (wox) gxiVar.B.get(), (fqx) gxiVar.A.get());
            case 42:
                s2m0 s2m0Var = gxiVar.c;
                return new y5s(gxiVar.d, false, true, false, false, false, 448);
            case 43:
                return i5t.b(gxiVar.b, (fq) gxiVar.y.get(), (fqx) gxiVar.A.get());
            case 44:
                return i5t.c(gxiVar.b, (aws) gxiVar.N.get());
            case 45:
                sek sekVar40 = gxiVar.b;
                pbt pbtVarL37 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL37);
                return new hsj0(pbtVarL37);
            case 46:
                sek sekVar41 = gxiVar.b;
                g8i g8iVar3 = gxiVar.f12079a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL38 = g8iVar3.L2();
                x1x.x(pbtVarL38);
                return new t0u(pbtVarL38, wsf0VarF0);
            case 47:
                sek sekVar42 = gxiVar.b;
                pbt pbtVarL39 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL39);
                return new tbu(pbtVarL39);
            case 48:
                return i5t.f(gxiVar.b, (a6s) gxiVar.a0.get());
            case 49:
                return i5t.e(gxiVar.b);
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                return new exi(this);
            case 51:
                s2m0 s2m0Var2 = gxiVar.c;
                g8i g8iVar4 = gxiVar.f12079a;
                knf0 knf0VarJ8 = g8iVar4.J8();
                x1x.x(knf0VarJ8);
                gii0 gii0VarJ9 = g8iVar4.j9();
                x1x.x(gii0VarJ9);
                g090 g090Var = new g090(gii0VarJ9, (byte) 24);
                beq0 beq0Var = (beq0) gxiVar.d0.get();
                btt0 btt0VarO8 = g8iVar4.o8();
                x1x.x(btt0VarO8);
                return new kgq0(knf0VarJ8, g090Var, beq0Var, btt0VarO8);
            case 52:
                s2m0 s2m0Var3 = gxiVar.c;
                beq0 beq0Var2 = new beq0();
                iun iunVar = iun.f15405a;
                beq0Var2.f2464a = new xfq0(0, new xeq0(iunVar, iunVar, iunVar, iunVar, iunVar), yeq0.e, csr.e, 0L, 0.0d, 0.0d, 0.0d);
                return beq0Var2;
            case 53:
                sek sekVar43 = gxiVar.b;
                pbt pbtVarL40 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL40);
                return new qni0(pbtVarL40);
            case 54:
                return i5t.A(gxiVar.b, (fq) gxiVar.y.get(), gxiVar.f12079a.f0(), (g9c) gxiVar.g0.get(), (itt) gxiVar.v.get(), (yyb) gxiVar.m.get(), (lg60) gxiVar.h0.get());
            case 55:
                sek sekVar44 = gxiVar.b;
                pbt pbtVarL41 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL41);
                return new g9c(pbtVarL41);
            case 56:
                sek sekVar45 = gxiVar.b;
                qni0 qni0Var = (qni0) gxiVar.f0.get();
                pbt pbtVarL42 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL42);
                return i5t.v(sekVar45, qni0Var, pbtVarL42);
            case 57:
                return new fxi(this);
            case 58:
                sek sekVar46 = gxiVar.b;
                return new l1u(gxiVar.b());
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object l() {
        f6i f6iVar = (f6i) this.c;
        byte b = this.b;
        if (b == 0) {
            return new hxi(this);
        }
        if (b == 1) {
            twz twzVar = (twz) ((n5d0) f6iVar.p).get();
            twzVar.getClass();
            return new uvt(twzVar);
        }
        if (b == 2) {
            return euw.k((htz) f6iVar.h, (lwz) ((n5d0) f6iVar.d).get(), (kwz) f6iVar.j, (njo) f6iVar.k, (btt0) f6iVar.l, (ctf0) f6iVar.c);
        }
        if (b == 3) {
            gii0 gii0Var = (gii0) f6iVar.i;
            gii0Var.getClass();
            return new lwz(gii0Var);
        }
        if (b == 4) {
            twz twzVar2 = (twz) ((n5d0) f6iVar.p).get();
            twzVar2.getClass();
            return new mhu(twzVar2);
        }
        if (b != 5) {
            c99.h(b);
            return null;
        }
        twz twzVar3 = (twz) ((n5d0) f6iVar.p).get();
        twzVar3.getClass();
        return new hti0(twzVar3);
    }

    private final Object m() {
        lxi lxiVar = (lxi) this.c;
        kuy kuyVar = lxiVar.e;
        knf0 knf0Var = lxiVar.c;
        zoq0 zoq0Var = lxiVar.b;
        q7d0 q7d0Var = lxiVar.f20816a;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                return new khb0(q7d0Var, knf0Var, zoq0Var);
            }
            if (b == 2) {
                return new kxi(this);
            }
            c99.h(b);
            return null;
        }
        return new xoq0(new bst(new fck0(q7d0Var, zoq0Var)), new mrs(lxiVar.n()), new sdj0(lxiVar.r()), new j4f(lxiVar.e()), new h03((Object) lxiVar.d(), (byte) 15), lxiVar.d, new bst(new zpu(q7d0Var, zoq0Var)), new gst(new j910(q7d0Var, zoq0Var)), new a1d((Object) lxiVar.h(), (byte) 7), new vqc((Object) lxiVar.g(), (byte) 13), new prc((Object) lxiVar.l(), (byte) 14), new rhh(lxiVar.k()), new vah(lxiVar.j()), new psc((Object) lxiVar.f(), (byte) 8), new prc((Object) lxiVar.i(), (byte) 13), new epi0((Object) lxiVar.r(), (byte) 5), new a1d((Object) lxiVar.n(), (byte) 27), new h4f(lxiVar.e()), new vt6(lxiVar.d()), new cad((Object) lxiVar.h(), (byte) 5), new zng(lxiVar.g()), new psc((Object) lxiVar.l(), (byte) 11), new vqc((Object) lxiVar.k(), (byte) 15), new yqc(lxiVar.j(), (byte) 14), new mag(lxiVar.f()), new psc((Object) lxiVar.i(), (byte) 10), new dpi0(new jix(q7d0Var, knf0Var)), new eyu(lxiVar.s()), new u650(lxiVar.p()), new lp1(lxiVar.b()), new peg0((Object) lxiVar.c(), (byte) 7), new qh00(lxiVar.o()), new wf1(lxiVar.a()), new bzu(new jix(q7d0Var, knf0Var), (byte) 15), new w4p0((Object) lxiVar.s(), (byte) 0), new ocl(new dpi0(zoq0Var)), new lsn(new t91(zoq0Var, (byte) 1)), new epi0((Object) new dpi0(zoq0Var), (byte) 0), new pmi0(new t91(zoq0Var, (byte) 1)), lxiVar.q(), lxiVar.u(), lxiVar.m(), lxiVar.f, lxiVar.g, new ouu(lxiVar.h, lxiVar.i, lxiVar.j), new evz(), lxiVar.k, new xlu(lxiVar.p()), new ok50(lxiVar.b()), new hru(lxiVar.o()), new yf1(lxiVar.a()), new h03((Object) lxiVar.c(), (byte) 9), new zg(lxiVar.l, (byte) 3), new bzu(lxiVar.t(), (byte) 3), new ani0(lxiVar.t()), lxiVar.m, new fou((khb0) lxiVar.s.get(), (byte) 0), new eyg0((khb0) lxiVar.s.get()), new bbw0((Object) new jm6(kuyVar, q7d0Var), (byte) 11), new eyg0((Object) new jm6(kuyVar, q7d0Var), (byte) 8), lxiVar.n.intValue());
    }

    private final Object n() {
        xxi xxiVar = (xxi) this.c;
        pmi pmiVar = xxiVar.m;
        tbb0 tbb0Var = xxiVar.j;
        byte b = this.b;
        if (b == 0) {
            return new wxi(this);
        }
        if (b == 1) {
            hjd hjdVarA = xxiVar.i.a();
            x1x.x(hjdVarA);
            return hjdVarA;
        }
        if (b == 2) {
            g3u g3uVarD = tbb0Var.d();
            x1x.x(g3uVarD);
            return new m2r0(g3uVarD, pmiVar);
        }
        if (b == 3) {
            hsj hsjVarC = tbb0Var.c();
            x1x.x(hsjVarC);
            return new l2r0(hsjVarC, pmiVar, xxiVar.z);
        }
        if (b == 4) {
            ((nc0) xxiVar.n.f25390a).a();
            return new ooc();
        }
        c99.h(b);
        return null;
    }

    private final Object o() {
        o9i o9iVar = (o9i) this.c;
        iw20 iw20Var = (iw20) o9iVar.x;
        ouu ouuVar = (ouu) o9iVar.h;
        dlr0 dlr0Var = (dlr0) o9iVar.e;
        gii0 gii0Var = (gii0) o9iVar.p;
        gst0 gst0Var = (gst0) o9iVar.w;
        peg0 peg0Var = (peg0) o9iVar.u;
        v88 v88Var = (v88) o9iVar.g;
        cad cadVar = (cad) o9iVar.d;
        knf0 knf0Var = (knf0) o9iVar.s;
        fvt0 fvt0Var = (fvt0) o9iVar.t;
        d1p d1pVar = (d1p) o9iVar.f;
        kt2 kt2Var = (kt2) o9iVar.j;
        wsf0 wsf0Var = (wsf0) o9iVar.i;
        byte b = this.b;
        if (b == 0) {
            i1w0 i1w0Var = (i1w0) o9iVar.v;
            ctf0 ctf0Var = (ctf0) o9iVar.b;
            khf0 khf0VarG = ((g45) wsf0Var.b).G();
            eqx eqxVar = (eqx) o9iVar.o;
            zku zkuVar = new zku(o9iVar.b());
            hsj hsjVar = new hsj(o9iVar.b(), new pyu(o9iVar.b()));
            nv20 nv20Var = new nv20(o9iVar.b());
            zku zkuVar2 = new zku(o9iVar.b());
            mne mneVarH = ((psc) cadVar.b).h();
            x1x.x(mneVarH);
            return new wyj0(i1w0Var, v88Var, ctf0Var, khf0VarG, eqxVar, zkuVar, hsjVar, nv20Var, zkuVar2, mneVarH, fvt0Var, wsf0Var.a(), ((o3c) fvt0Var.f10231a).w(), wsf0Var.s(), ((g45) wsf0Var.b).P(), wsf0Var.b(), new mii0(kt2Var, knf0Var, peg0Var, gst0Var), ((g45) wsf0Var.b).t(), new xfu(o9iVar.b()), (m1e) o9iVar.c, ((g45) wsf0Var.b).Y(), new b8u(new yuu(new w4p0(gii0Var, (byte) 3), dlr0Var, knf0Var)), ouuVar, new ih5(kt2Var, (byte) 0), d1pVar.L(), new ih5(kt2Var, (byte) 2), d1pVar.C(), d1pVar.D0());
        }
        if (b == 1) {
            pv00 pv00Var = new pv00(o9iVar.b());
            mne mneVarH2 = ((psc) cadVar.b).h();
            x1x.x(mneVarH2);
            return new qnc0(pv00Var, mneVarH2, (ctf0) o9iVar.b, ((g45) wsf0Var.b).E(), ((g45) wsf0Var.b).P(), new xfu(o9iVar.b()), (m1e) o9iVar.c);
        }
        if (b != 2) {
            c99.h(b);
            return null;
        }
        i1w0 i1w0Var2 = (i1w0) o9iVar.v;
        mne mneVarH3 = ((psc) cadVar.b).h();
        x1x.x(mneVarH3);
        return new ltr0(i1w0Var2, mneVarH3, v88Var, (ctf0) o9iVar.b, ((g45) wsf0Var.b).G(), ((g45) wsf0Var.b).E(), ((o3c) fvt0Var.f10231a).w(), new zku(o9iVar.b()), new hsj(o9iVar.b(), new pyu(o9iVar.b())), new nv20(o9iVar.b()), new zku(o9iVar.b()), new pv00(o9iVar.b()), fvt0Var, wsf0Var.a(), wsf0Var.s(), ((g45) wsf0Var.b).P(), wsf0Var.b(), new mii0(kt2Var, knf0Var, peg0Var, gst0Var), ((g45) wsf0Var.b).t(), new xfu(o9iVar.b()), (m1e) o9iVar.c, ((g45) wsf0Var.b).Y(), new b8u(new yuu(new w4p0(gii0Var, (byte) 3), dlr0Var, knf0Var)), new ctu(o9iVar.c()), new hru(o9iVar.c()), ouuVar, new ih5(kt2Var, (byte) 0), d1pVar.L(), ((uii) iw20Var.f15470a).r(), (wyu) o9iVar.y, new lk5(((uii) iw20Var.f15470a).r(), (r9u) o9iVar.z, (byte) 3), new ih5(kt2Var, (byte) 2), d1pVar.C(), d1pVar.D0(), o9iVar.f24881a);
    }

    private final Object p() {
        byte b = this.b;
        if (b == 0) {
            return new zxi(this);
        }
        if (b == 1) {
            return new yzi();
        }
        if (b == 2) {
            return new ayi(this);
        }
        if (b == 3) {
            return new byi(this);
        }
        if (b == 4) {
            return new cyi(this);
        }
        c99.h(b);
        return null;
    }

    private final Object q() {
        eyi eyiVar = (eyi) this.c;
        ehf0 ehf0Var = eyiVar.l;
        byte b = this.b;
        if (b == 0) {
            long jLongValue = eyiVar.f8630a.longValue();
            String str = eyiVar.b;
            duj dujVar = eyiVar.c;
            oeg0 oeg0Var = eyiVar.d;
            ctf0 ctf0Var = eyiVar.e;
            s91 s91Var = eyiVar.f;
            mne mneVarH = ((psc) eyiVar.g.b).h();
            x1x.x(mneVarH);
            return new yas0(jLongValue, str, dujVar, oeg0Var, ctf0Var, s91Var, mneVarH, new qu(eyiVar.h, (byte) 1), eyiVar.i, eyiVar.j, eyiVar.k, ((i7i) ehf0Var.b).s(), ((i7i) ehf0Var.b).a(), eyiVar.m, (q2v) eyiVar.p.get(), (sti0) eyiVar.q.get());
        }
        if (b == 1) {
            p7s0 p7s0Var = (p7s0) eyiVar.o.get();
            p7s0Var.getClass();
            return new q2v(p7s0Var);
        }
        if (b == 2) {
            return new p7s0();
        }
        if (b != 3) {
            c99.h(b);
            return null;
        }
        p7s0 p7s0Var2 = (p7s0) eyiVar.o.get();
        p7s0Var2.getClass();
        return new sti0(p7s0Var2);
    }

    @Override // a.o5d0
    public final Object get() {
        Object aVar;
        byte b = this.f27515a;
        Object obj = this.c;
        byte b2 = 2;
        byte b3 = this.b;
        switch (b) {
            case 0:
                qsi qsiVar = (qsi) obj;
                switch (b3) {
                    case 0:
                        return new i6i(this, (byte) 10);
                    case 1:
                        sek sekVar = qsiVar.b;
                        s7t0 s7t0Var = (s7t0) qsiVar.D.get();
                        pbt pbtVarL2 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL2);
                        return i5t.r(sekVar, s7t0Var, pbtVarL2);
                    case 2:
                        sek sekVar2 = qsiVar.b;
                        g8i g8iVar = qsiVar.f29259a;
                        pbt pbtVarL3 = g8iVar.L2();
                        x1x.x(pbtVarL3);
                        d3c d3cVar = (d3c) qsiVar.e.get();
                        fq fqVar = (fq) qsiVar.x.get();
                        qpt qptVar = (qpt) qsiVar.y.get();
                        gmt gmtVar = (gmt) qsiVar.j.get();
                        rgs rgsVar = (rgs) qsiVar.C.get();
                        r9u r9uVarH4 = g8iVar.h4();
                        x1x.x(r9uVarH4);
                        return i5t.C(sekVar2, pbtVarL3, d3cVar, fqVar, qptVar, gmtVar, rgsVar, r9uVarH4);
                    case 3:
                        sek sekVar3 = qsiVar.b;
                        pbt pbtVarL4 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL4);
                        return new d3c(pbtVarL4);
                    case 4:
                        sek sekVar4 = qsiVar.b;
                        lzt lztVar = (lzt) qsiVar.f.get();
                        zmi0 zmi0Var = (zmi0) qsiVar.g.get();
                        pbt pbtVarL5 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL5);
                        return mkg.g(sekVar4, lztVar, zmi0Var, pbtVarL5, (xyb) qsiVar.h.get(), (yyb) qsiVar.l.get(), (fpi0) qsiVar.m.get(), (nqt) qsiVar.n.get(), (spx) qsiVar.o.get(), (oqt) qsiVar.p.get(), (hni0) qsiVar.q.get(), (vcu) qsiVar.r.get(), (d3c) qsiVar.e.get(), (wni0) qsiVar.s.get(), (ztt) qsiVar.k.get(), (pqt) qsiVar.t.get(), (itt) qsiVar.u.get(), (q78) qsiVar.v.get(), (gmt) qsiVar.j.get(), (ecs) qsiVar.w.get());
                    case 5:
                        sek sekVar5 = qsiVar.b;
                        g8i g8iVar2 = qsiVar.f29259a;
                        pbt pbtVarL6 = g8iVar2.L2();
                        x1x.x(pbtVarL6);
                        m1e m1eVarQ1 = g8iVar2.q1();
                        x1x.x(m1eVarQ1);
                        return new lzt(pbtVarL6, m1eVarQ1);
                    case 6:
                        sek sekVar6 = qsiVar.b;
                        pbt pbtVarL7 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL7);
                        return new zmi0(pbtVarL7);
                    case 7:
                        sek sekVar7 = qsiVar.b;
                        pbt pbtVarL8 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL8);
                        return new xyb(pbtVarL8);
                    case 8:
                        sek sekVar8 = qsiVar.b;
                        k1u k1uVar = (k1u) qsiVar.i.get();
                        gmt gmtVar2 = (gmt) qsiVar.j.get();
                        ztt zttVar = (ztt) qsiVar.k.get();
                        pbt pbtVarL9 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL9);
                        return i5t.a(sekVar8, k1uVar, gmtVar2, zttVar, pbtVarL9);
                    case 9:
                        sek sekVar9 = qsiVar.b;
                        return new k1u(qsiVar.b());
                    case 10:
                        sek sekVar10 = qsiVar.b;
                        pbt pbtVarL10 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL10);
                        return new gmt(pbtVarL10);
                    case 11:
                        sek sekVar11 = qsiVar.b;
                        pbt pbtVarL11 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL11);
                        return new ztt(pbtVarL11);
                    case 12:
                        sek sekVar12 = qsiVar.b;
                        pbt pbtVarL12 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL12);
                        return new fpi0(pbtVarL12);
                    case 13:
                        sek sekVar13 = qsiVar.b;
                        pbt pbtVarL13 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL13);
                        return new nqt(pbtVarL13);
                    case 14:
                        sek sekVar14 = qsiVar.b;
                        pbt pbtVarL14 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL14);
                        return new spx(pbtVarL14);
                    case 15:
                        sek sekVar15 = qsiVar.b;
                        pbt pbtVarL15 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL15);
                        return new oqt(pbtVarL15);
                    case 16:
                        sek sekVar16 = qsiVar.b;
                        pbt pbtVarL16 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL16);
                        return new hni0(pbtVarL16);
                    case 17:
                        sek sekVar17 = qsiVar.b;
                        pbt pbtVarL17 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL17);
                        return new vcu(pbtVarL17);
                    case 18:
                        sek sekVar18 = qsiVar.b;
                        pbt pbtVarL18 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL18);
                        return new wni0(pbtVarL18);
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        sek sekVar19 = qsiVar.b;
                        pbt pbtVarL19 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL19);
                        return new pqt(pbtVarL19);
                    case 20:
                        sek sekVar20 = qsiVar.b;
                        pbt pbtVarL20 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL20);
                        return new itt(pbtVarL20);
                    case 21:
                        sek sekVar21 = qsiVar.b;
                        pbt pbtVarL21 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL21);
                        return new q78(pbtVarL21);
                    case 22:
                        sek sekVar22 = qsiVar.b;
                        pbt pbtVarL22 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL22);
                        return new ecs(pbtVarL22);
                    case 23:
                        sek sekVar23 = qsiVar.b;
                        pbt pbtVarL23 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL23);
                        return new qpt(pbtVarL23);
                    case 24:
                        sek sekVar24 = qsiVar.b;
                        fq fqVar2 = (fq) qsiVar.x.get();
                        fqx fqxVar = (fqx) qsiVar.z.get();
                        wox woxVar = (wox) qsiVar.A.get();
                        return i5t.g(fqVar2, sekVar24, (qpt) qsiVar.y.get(), (r8u) qsiVar.B.get(), woxVar, fqxVar);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        sek sekVar25 = qsiVar.b;
                        pbt pbtVarL24 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL24);
                        return new fqx(pbtVarL24);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        sek sekVar26 = qsiVar.b;
                        pbt pbtVarL25 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL25);
                        return new wox(pbtVarL25);
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        sek sekVar27 = qsiVar.b;
                        pbt pbtVarL26 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL26);
                        return new r8u(pbtVarL26);
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        sek sekVar28 = qsiVar.b;
                        pbt pbtVarL27 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL27);
                        return new qa60(pbtVarL27);
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        sek sekVar29 = qsiVar.b;
                        pbt pbtVarL28 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL28);
                        return new ipi0(pbtVarL28);
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        sek sekVar30 = qsiVar.b;
                        pbt pbtVarL29 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL29);
                        return new xsi0(pbtVarL29);
                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        sek sekVar31 = qsiVar.b;
                        pbt pbtVarL30 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL30);
                        return new gpx(pbtVarL30);
                    case 32:
                        sek sekVar32 = qsiVar.b;
                        pbt pbtVarL31 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL31);
                        return new vni0(pbtVarL31);
                    case 33:
                        sek sekVar33 = qsiVar.b;
                        pbt pbtVarL32 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL32);
                        return new hs(pbtVarL32);
                    case 34:
                        sek sekVar34 = qsiVar.b;
                        pbt pbtVarL33 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL33);
                        return new eni0(pbtVarL33);
                    case 35:
                        return i5t.z(qsiVar.b, (aws) qsiVar.M.get());
                    case 36:
                        sek sekVar35 = qsiVar.b;
                        yvs yvsVarG2 = qsiVar.f29259a.G2();
                        x1x.x(yvsVarG2);
                        return new aws(yvsVarG2);
                    case 37:
                        sek sekVar36 = qsiVar.b;
                        pbt pbtVarL34 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL34);
                        return new hj50(pbtVarL34);
                    case 38:
                        sek sekVar37 = qsiVar.b;
                        pbt pbtVarL35 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL35);
                        return new qhf0(pbtVarL35);
                    case 39:
                        return i5t.d(qsiVar.b, (foi0) qsiVar.Q.get(), (fq) qsiVar.x.get());
                    case 40:
                        sek sekVar38 = qsiVar.b;
                        pbt pbtVarL36 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL36);
                        return new foi0(pbtVarL36);
                    case 41:
                        sek sekVar39 = qsiVar.b;
                        fq fqVar3 = (fq) qsiVar.x.get();
                        r8u r8uVar = (r8u) qsiVar.B.get();
                        return i5t.B(fqVar3, sekVar39, (qpt) qsiVar.y.get(), r8uVar, (wox) qsiVar.A.get(), (fqx) qsiVar.z.get());
                    case 42:
                        eke0 eke0Var = qsiVar.c;
                        return new y5s(s470.SCRATCH_CARD, true, false, false, false, false, 448);
                    case 43:
                        return i5t.b(qsiVar.b, (fq) qsiVar.x.get(), (fqx) qsiVar.z.get());
                    case 44:
                        return i5t.c(qsiVar.b, (aws) qsiVar.M.get());
                    case 45:
                        sek sekVar40 = qsiVar.b;
                        pbt pbtVarL37 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL37);
                        return new hsj0(pbtVarL37);
                    case 46:
                        sek sekVar41 = qsiVar.b;
                        g8i g8iVar3 = qsiVar.f29259a;
                        wsf0 wsf0VarF0 = g8iVar3.f0();
                        pbt pbtVarL38 = g8iVar3.L2();
                        x1x.x(pbtVarL38);
                        return new t0u(pbtVarL38, wsf0VarF0);
                    case 47:
                        sek sekVar42 = qsiVar.b;
                        pbt pbtVarL39 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL39);
                        return new tbu(pbtVarL39);
                    case 48:
                        return i5t.f(qsiVar.b, (a6s) qsiVar.Z.get());
                    case 49:
                        return i5t.e(qsiVar.b);
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        return new w6h0((qa60) qsiVar.F.get(), (fq) qsiVar.x.get(), qsiVar.f29259a.v1(), (lzt) qsiVar.f.get(), (ix90) qsiVar.f0.get(), (f1u) qsiVar.g0.get(), (oqt) qsiVar.p.get(), (hni0) qsiVar.q.get(), (noi0) qsiVar.h0.get(), (src) qsiVar.i0.get(), (xcc) qsiVar.U.get(), (i5m0) qsiVar.m0.get(), (ztt) qsiVar.k.get());
                    case 51:
                        eke0 eke0Var2 = qsiVar.c;
                        f7h0 f7h0Var = (f7h0) qsiVar.e0.get();
                        ztt zttVar2 = (ztt) qsiVar.k.get();
                        itt ittVar = (itt) qsiVar.u.get();
                        gmt gmtVar3 = (gmt) qsiVar.j.get();
                        f7h0Var.getClass();
                        zttVar2.getClass();
                        ittVar.getClass();
                        gmtVar3.getClass();
                        return new ix90(f7h0Var, zttVar2, ittVar, gmtVar3);
                    case 52:
                        knf0 knf0VarJ8 = qsiVar.f29259a.J8();
                        x1x.x(knf0VarJ8);
                        d7h0 d7h0Var = (d7h0) qsiVar.c0.get();
                        b7h0 b7h0Var = (b7h0) qsiVar.d0.get();
                        btt0 btt0VarO8 = qsiVar.f29259a.o8();
                        x1x.x(btt0VarO8);
                        return new f7h0(knf0VarJ8, d7h0Var, b7h0Var, btt0VarO8);
                    case 53:
                        eke0 eke0Var3 = qsiVar.c;
                        gii0 gii0VarJ9 = qsiVar.f29259a.j9();
                        x1x.x(gii0VarJ9);
                        return new d7h0(gii0VarJ9);
                    case 54:
                        b7h0 b7h0Var2 = new b7h0();
                        j7h0 j7h0Var = j7h0.c;
                        iun iunVar = iun.f15405a;
                        b7h0Var2.f2109a = new c7h0(0L, 0.0d, 0.0d, 0.0d, j7h0Var, iunVar, iunVar);
                        return b7h0Var2;
                    case 55:
                        eke0 eke0Var4 = qsiVar.c;
                        f7h0 f7h0Var2 = (f7h0) qsiVar.e0.get();
                        f7h0Var2.getClass();
                        return new f1u(f7h0Var2);
                    case 56:
                        eke0 eke0Var5 = qsiVar.c;
                        f7h0 f7h0Var3 = (f7h0) qsiVar.e0.get();
                        f7h0Var3.getClass();
                        return new noi0(f7h0Var3);
                    case 57:
                        eke0 eke0Var6 = qsiVar.c;
                        f7h0 f7h0Var4 = (f7h0) qsiVar.e0.get();
                        f7h0Var4.getClass();
                        return new src(f7h0Var4);
                    case 58:
                        return i5t.A(qsiVar.b, (fq) qsiVar.x.get(), qsiVar.f29259a.f0(), (g9c) qsiVar.j0.get(), (itt) qsiVar.u.get(), (yyb) qsiVar.l.get(), (lg60) qsiVar.l0.get());
                    case 59:
                        sek sekVar43 = qsiVar.b;
                        pbt pbtVarL40 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL40);
                        return new g9c(pbtVarL40);
                    case 60:
                        sek sekVar44 = qsiVar.b;
                        qni0 qni0Var = (qni0) qsiVar.k0.get();
                        pbt pbtVarL41 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL41);
                        return i5t.v(sekVar44, qni0Var, pbtVarL41);
                    case 61:
                        sek sekVar45 = qsiVar.b;
                        pbt pbtVarL42 = qsiVar.f29259a.L2();
                        x1x.x(pbtVarL42);
                        return new qni0(pbtVarL42);
                    default:
                        c99.h(b3);
                        return null;
                }
            case 1:
                if (b3 == 0) {
                    return new rsi(this);
                }
                if (b3 == 1) {
                    return new bih0();
                }
                if (b3 == 2) {
                    return new tfh0();
                }
                c99.h(b3);
                return null;
            case 2:
                if (b3 == 0) {
                    return new wsi(this);
                }
                if (b3 == 1) {
                    return new xsi(this);
                }
                if (b3 == 2) {
                    return new ysi(this);
                }
                c99.h(b3);
                return null;
            case 3:
                h6i h6iVar = (h6i) obj;
                if (b3 == 0) {
                    return new gti(this);
                }
                if (b3 == 1) {
                    j400 j400Var = (j400) ((n5d0) h6iVar.m).get();
                    j400Var.getClass();
                    return new csi0(j400Var);
                }
                if (b3 == 2) {
                    return euw.q((wsz) h6iVar.f, (f400) ((n5d0) h6iVar.c).get(), (btt0) h6iVar.h, (e400) h6iVar.i, (mne) h6iVar.b, (kuy) h6iVar.j);
                }
                if (b3 == 3) {
                    gii0 gii0Var = (gii0) h6iVar.g;
                    gii0Var.getClass();
                    return new f400(gii0Var);
                }
                if (b3 != 4) {
                    c99.h(b3);
                    return null;
                }
                j400 j400Var2 = (j400) ((n5d0) h6iVar.m).get();
                j400Var2.getClass();
                return new jtu(j400Var2);
            case 4:
                gbi gbiVar = (gbi) obj;
                if (b3 == 0) {
                    return new hti(this);
                }
                if (b3 == 1) {
                    j400 j400Var3 = (j400) ((n5d0) gbiVar.c).get();
                    j400Var3.getClass();
                    return new ovt(j400Var3);
                }
                if (b3 == 2) {
                    wsz wszVar = (wsz) gbiVar.i;
                    f400 f400Var = (f400) ((n5d0) gbiVar.b).get();
                    btt0 btt0Var = (btt0) gbiVar.k;
                    e400 e400Var = (e400) gbiVar.l;
                    mne mneVarH = ((psc) ((cad) gbiVar.m).b).h();
                    x1x.x(mneVarH);
                    return euw.q(wszVar, f400Var, btt0Var, e400Var, mneVarH, (kuy) gbiVar.n);
                }
                if (b3 == 3) {
                    gii0 gii0Var2 = (gii0) gbiVar.j;
                    gii0Var2.getClass();
                    return new f400(gii0Var2);
                }
                if (b3 != 4) {
                    c99.h(b3);
                    return null;
                }
                j400 j400Var4 = (j400) ((n5d0) gbiVar.c).get();
                j400Var4.getClass();
                return new wsi0(j400Var4);
            case 5:
                f6i f6iVar = (f6i) obj;
                if (b3 == 0) {
                    return new oti(this);
                }
                if (b3 == 1) {
                    j400 j400Var5 = (j400) ((n5d0) f6iVar.p).get();
                    j400Var5.getClass();
                    return new ovt(j400Var5);
                }
                if (b3 == 2) {
                    wsz wszVar2 = (wsz) f6iVar.b;
                    f400 f400Var2 = (f400) ((n5d0) f6iVar.d).get();
                    btt0 btt0Var2 = (btt0) f6iVar.i;
                    e400 e400Var2 = (e400) f6iVar.j;
                    mne mneVarH2 = ((psc) ((cad) f6iVar.k).b).h();
                    x1x.x(mneVarH2);
                    return euw.q(wszVar2, f400Var2, btt0Var2, e400Var2, mneVarH2, (kuy) f6iVar.l);
                }
                if (b3 == 3) {
                    gii0 gii0Var3 = (gii0) f6iVar.h;
                    gii0Var3.getClass();
                    return new f400(gii0Var3);
                }
                if (b3 == 4) {
                    j400 j400Var6 = (j400) ((n5d0) f6iVar.p).get();
                    j400Var6.getClass();
                    return new shu(j400Var6);
                }
                if (b3 != 5) {
                    c99.h(b3);
                    return null;
                }
                j400 j400Var7 = (j400) ((n5d0) f6iVar.p).get();
                j400Var7.getClass();
                return new csi0(j400Var7);
            case 6:
                uti utiVar = (uti) obj;
                cyh cyhVar = utiVar.t;
                pru pruVar = utiVar.r;
                jw20 jw20Var = utiVar.q;
                y3v y3vVar = utiVar.n;
                ih5 ih5Var = utiVar.m;
                v88 v88Var = utiVar.l;
                lbu lbuVar = utiVar.k;
                qgd qgdVar = utiVar.i;
                s31 s31Var = utiVar.g;
                mi70 mi70Var = utiVar.u0;
                ojj ojjVar = utiVar.f;
                rjo rjoVar = utiVar.e;
                v1j0 v1j0Var = utiVar.l0;
                q7d0 q7d0Var = utiVar.k0;
                rmd0 rmd0Var = utiVar.Z;
                zx10 zx10Var = utiVar.K;
                gst0 gst0Var = utiVar.T;
                fsd fsdVar = utiVar.s;
                lef0 lef0Var = utiVar.S;
                wsf0 wsf0Var = utiVar.j;
                lp4 lp4Var = utiVar.I;
                d1p d1pVar = utiVar.F;
                if (b3 == 0) {
                    m1e m1eVar = utiVar.h;
                    ahu ahuVarY = ((g45) wsf0Var.b).y();
                    ouu ouuVar = utiVar.o;
                    i1w0 i1w0Var = utiVar.p;
                    bzt bztVar = new bzt(fsdVar);
                    z4w0 z4w0Var = utiVar.u;
                    uuz uuzVar = utiVar.v;
                    ctf0 ctf0Var = utiVar.w;
                    yox yoxVar = utiVar.x;
                    mne mneVarH3 = ((psc) utiVar.y.b).h();
                    x1x.x(mneVarH3);
                    bzu bzuVar = utiVar.z;
                    ieu ieuVar = utiVar.A;
                    abu abuVar = utiVar.B;
                    rou rouVar = utiVar.C;
                    x4u x4uVar = utiVar.D;
                    svs0 svs0Var = utiVar.E;
                    l7k l7kVarC = d1pVar.C();
                    s64 s64VarR0 = d1pVar.r0();
                    cmt cmtVarD0 = d1pVar.D0();
                    duj dujVar = utiVar.G;
                    ivn ivnVar = new ivn(utiVar.H);
                    gxu gxuVarN = lp4Var.n();
                    x1x.x(gxuVarN);
                    wgu wguVar = utiVar.J;
                    nh70 nh70Var = new nh70();
                    cl5 cl5Var = new cl5((byte) 27);
                    y3j0 y3j0VarB = utiVar.M.b();
                    x1x.x(y3j0VarB);
                    dpi0 dpi0Var = utiVar.N;
                    gle0 gle0Var = new gle0();
                    cmt cmtVarD = ((wti) dpi0Var.f6468a).d();
                    j6m0 j6m0Var = new j6m0((byte) 19);
                    zie0 zie0Var = new zie0();
                    xuz xuzVar = utiVar.O;
                    rl70 rl70VarA = utiVar.P.a();
                    f4u f4uVarJ = ((kki) utiVar.Q.f24619a).j();
                    s64 s64VarB = d1pVar.b();
                    au0 au0VarZ0 = d1pVar.z0();
                    s9m0 s9m0Var = utiVar.R;
                    tsu tsuVarW = ((gbi) lef0Var.f19899a).w();
                    iqt iqtVar = new iqt(gst0Var);
                    epc epcVarL = lp4Var.l();
                    x1x.x(epcVarL);
                    x1u x1uVar = new x1u(gst0Var, (byte) 1);
                    bbw0 bbw0Var = new bbw0((Object) utiVar.U, (byte) 21);
                    sqx sqxVar = utiVar.V;
                    nr00 nr00VarG = ((cu) zx10Var.f45137a).g();
                    nv20 nv20VarF = ((cu) zx10Var.f45137a).f();
                    ubu ubuVar = utiVar.W;
                    zoi0 zoi0Var = utiVar.X;
                    nrt nrtVarQ = ((g45) wsf0Var.b).q();
                    nou nouVarE = ((g45) wsf0Var.b).E();
                    jnk jnkVarH = lp4Var.h();
                    x1x.x(jnkVarH);
                    rkt0 rkt0Var = utiVar.Y;
                    yk50 yk50VarD = rmd0Var.d();
                    x1x.x(yk50VarD);
                    zyt zytVarB = ((cih) utiVar.L.b).b();
                    p4u p4uVarE = rmd0Var.e();
                    x1x.x(p4uVarE);
                    czt cztVar = new czt(fsdVar, (byte) 1);
                    a6u a6uVar = utiVar.a0;
                    bu90 bu90VarP = ((prc) utiVar.b0.f25567a).p();
                    x1x.x(bu90VarP);
                    aVar = new org.xplatform.settings.impl.presentation.a(rjoVar, ojjVar, s31Var, m1eVar, qgdVar, ahuVarY, lbuVar, v88Var, ih5Var, y3vVar, ouuVar, i1w0Var, jw20Var, pruVar, bztVar, cyhVar, z4w0Var, uuzVar, ctf0Var, yoxVar, mneVarH3, bzuVar, ieuVar, abuVar, rouVar, x4uVar, svs0Var, l7kVarC, s64VarR0, cmtVarD0, dujVar, ivnVar, gxuVarN, wguVar, nh70Var, cl5Var, y3j0VarB, gle0Var, cmtVarD, j6m0Var, zie0Var, xuzVar, rl70VarA, f4uVarJ, s64VarB, au0VarZ0, s9m0Var, tsuVarW, iqtVar, epcVarL, x1uVar, bbw0Var, sqxVar, nr00VarG, nv20VarF, ubuVar, zoi0Var, nrtVarQ, nouVarE, jnkVarH, rkt0Var, yk50VarD, zytVarB, p4uVarE, cztVar, a6uVar, bu90VarP, ((v8i) utiVar.c0.f25390a).a(), utiVar.d0, new zx10(utiVar.e0), new gne0((byte) 23), utiVar.f0.f36881a.a(), new usd(), ((gbi) lef0Var.f19899a).x(), utiVar.g0, new rqt(), utiVar.h0, ((gbi) lef0Var.f19899a).c(), utiVar.i0, utiVar.j0, new dyg0(new y6j0(q7d0Var, v1j0Var)), utiVar.m0, utiVar.n0, utiVar.o0, utiVar.p0, utiVar.q0, utiVar.r0, new f4u(((kki) utiVar.s0.f23980a).r(), (byte) 20), new m2c(((kki) utiVar.s0.f23980a).r()), new o470(((kki) utiVar.s0.f23980a).r()), new wsf0((Object) new y6j0(q7d0Var, v1j0Var), (byte) 21), new dyg0(new y6j0(q7d0Var, v1j0Var)), utiVar.t0, mi70Var, new nh70(), new tqt());
                } else if (b3 == 1) {
                    m1e m1eVar2 = utiVar.h;
                    ahu ahuVarY2 = ((g45) wsf0Var.b).y();
                    ieu ieuVar2 = utiVar.w0;
                    dzt dztVar = utiVar.x0;
                    jh70 jh70Var = utiVar.y0;
                    i1w0 i1w0Var2 = utiVar.p;
                    bzt bztVar2 = new bzt(fsdVar);
                    z4w0 z4w0Var2 = utiVar.u;
                    uuz uuzVar2 = utiVar.v;
                    ctf0 ctf0Var2 = utiVar.w;
                    yox yoxVar2 = utiVar.x;
                    mne mneVarH4 = ((psc) utiVar.y.b).h();
                    x1x.x(mneVarH4);
                    bzu bzuVar2 = utiVar.z;
                    ieu ieuVar3 = utiVar.A;
                    abu abuVar2 = utiVar.B;
                    rou rouVar2 = utiVar.C;
                    x4u x4uVar2 = utiVar.D;
                    svs0 svs0Var2 = utiVar.E;
                    l7k l7kVarC2 = d1pVar.C();
                    s64 s64VarR1 = d1pVar.r0();
                    cmt cmtVarD1 = d1pVar.D0();
                    duj dujVar2 = utiVar.G;
                    ivn ivnVar2 = new ivn(utiVar.H);
                    gxu gxuVarN2 = lp4Var.n();
                    x1x.x(gxuVarN2);
                    wgu wguVar2 = utiVar.J;
                    nh70 nh70Var2 = new nh70();
                    cl5 cl5Var2 = new cl5((byte) 27);
                    y3j0 y3j0VarB2 = utiVar.M.b();
                    x1x.x(y3j0VarB2);
                    dpi0 dpi0Var2 = utiVar.N;
                    gle0 gle0Var2 = new gle0();
                    cmt cmtVarD2 = ((wti) dpi0Var2.f6468a).d();
                    j6m0 j6m0Var2 = new j6m0((byte) 19);
                    zie0 zie0Var2 = new zie0();
                    xuz xuzVar2 = utiVar.O;
                    rl70 rl70VarA2 = utiVar.P.a();
                    f4u f4uVarJ2 = ((kki) utiVar.Q.f24619a).j();
                    s64 s64VarB2 = d1pVar.b();
                    au0 au0VarZ1 = d1pVar.z0();
                    s9m0 s9m0Var2 = utiVar.R;
                    phf0 phf0VarT = ((gbi) lef0Var.f19899a).t();
                    iqt iqtVar2 = new iqt(gst0Var);
                    x1u x1uVar2 = new x1u(gst0Var, (byte) 1);
                    bbw0 bbw0Var2 = new bbw0((Object) utiVar.U, (byte) 21);
                    sqx sqxVar2 = utiVar.V;
                    nr00 nr00VarG2 = ((cu) zx10Var.f45137a).g();
                    nv20 nv20VarF2 = ((cu) zx10Var.f45137a).f();
                    ubu ubuVar2 = utiVar.W;
                    zoi0 zoi0Var2 = utiVar.X;
                    nrt nrtVarQ2 = ((g45) wsf0Var.b).q();
                    nou nouVarE2 = ((g45) wsf0Var.b).E();
                    jnk jnkVarH2 = lp4Var.h();
                    x1x.x(jnkVarH2);
                    nyb nybVarD = lp4Var.d();
                    x1x.x(nybVarD);
                    rkt0 rkt0Var2 = utiVar.Y;
                    yk50 yk50VarD2 = rmd0Var.d();
                    x1x.x(yk50VarD2);
                    zyt zytVarB2 = ((cih) utiVar.L.b).b();
                    p4u p4uVarE2 = rmd0Var.e();
                    x1x.x(p4uVarE2);
                    czt cztVar2 = new czt(fsdVar, (byte) 1);
                    a6u a6uVar2 = utiVar.a0;
                    bu90 bu90VarP2 = ((prc) utiVar.b0.f25567a).p();
                    x1x.x(bu90VarP2);
                    sd60 sd60Var = utiVar.d0;
                    zx10 zx10Var2 = new zx10(utiVar.e0);
                    gne0 gne0Var = new gne0((byte) 23);
                    rqt rqtVarA = utiVar.f0.f36881a.a();
                    usd usdVar = new usd();
                    iw20 iw20VarX = ((gbi) lef0Var.f19899a).x();
                    hs00 hs00Var = utiVar.g0;
                    rqt rqtVar = new rqt();
                    String str = utiVar.h0;
                    wpt wptVarC = ((gbi) lef0Var.f19899a).c();
                    nhf0 nhf0Var = utiVar.i0;
                    rek0 rek0Var = utiVar.j0;
                    dyg0 dyg0Var = new dyg0(new y6j0(q7d0Var, v1j0Var));
                    kwd kwdVar = utiVar.m0;
                    tqx tqxVar = utiVar.n0;
                    yzn0 yzn0Var = utiVar.o0;
                    epc epcVarL2 = lp4Var.l();
                    x1x.x(epcVarL2);
                    aVar = new ngj0(rjoVar, ojjVar, mi70Var, s31Var, m1eVar2, qgdVar, ahuVarY2, lbuVar, v88Var, ieuVar2, dztVar, ih5Var, y3vVar, jh70Var, i1w0Var2, jw20Var, pruVar, bztVar2, cyhVar, z4w0Var2, uuzVar2, ctf0Var2, yoxVar2, mneVarH4, bzuVar2, ieuVar3, abuVar2, rouVar2, x4uVar2, svs0Var2, l7kVarC2, s64VarR1, cmtVarD1, dujVar2, ivnVar2, gxuVarN2, wguVar2, nh70Var2, cl5Var2, y3j0VarB2, gle0Var2, cmtVarD2, j6m0Var2, zie0Var2, xuzVar2, rl70VarA2, f4uVarJ2, s64VarB2, au0VarZ1, s9m0Var2, phf0VarT, iqtVar2, x1uVar2, bbw0Var2, sqxVar2, nr00VarG2, nv20VarF2, ubuVar2, zoi0Var2, nrtVarQ2, nouVarE2, jnkVarH2, nybVarD, rkt0Var2, yk50VarD2, zytVarB2, p4uVarE2, cztVar2, a6uVar2, bu90VarP2, sd60Var, zx10Var2, gne0Var, rqtVarA, usdVar, iw20VarX, hs00Var, rqtVar, str, wptVarC, nhf0Var, rek0Var, dyg0Var, kwdVar, tqxVar, yzn0Var, epcVarL2, utiVar.t0, utiVar.p0, utiVar.q0, ((v8i) utiVar.c0.f25390a).a(), new tqt());
                } else {
                    if (b3 != 2) {
                        if (b3 == 3) {
                            return new tti(this);
                        }
                        c99.h(b3);
                        return null;
                    }
                    m1e m1eVar3 = utiVar.h;
                    ahu ahuVarY3 = ((g45) wsf0Var.b).y();
                    dzt dztVar2 = utiVar.x0;
                    jh70 jh70Var2 = utiVar.y0;
                    i1w0 i1w0Var3 = utiVar.p;
                    bzt bztVar3 = new bzt(fsdVar);
                    z4w0 z4w0Var3 = utiVar.u;
                    uuz uuzVar3 = utiVar.v;
                    ctf0 ctf0Var3 = utiVar.w;
                    yox yoxVar3 = utiVar.x;
                    mne mneVarH5 = ((psc) utiVar.y.b).h();
                    x1x.x(mneVarH5);
                    bzu bzuVar3 = utiVar.z;
                    ieu ieuVar4 = utiVar.A;
                    abu abuVar3 = utiVar.B;
                    rou rouVar3 = utiVar.C;
                    x4u x4uVar3 = utiVar.D;
                    svs0 svs0Var3 = utiVar.E;
                    l7k l7kVarC3 = d1pVar.C();
                    s64 s64VarR2 = d1pVar.r0();
                    cmt cmtVarD3 = d1pVar.D0();
                    duj dujVar3 = utiVar.G;
                    ivn ivnVar3 = new ivn(utiVar.H);
                    gxu gxuVarN3 = lp4Var.n();
                    x1x.x(gxuVarN3);
                    wgu wguVar3 = utiVar.J;
                    nh70 nh70Var3 = new nh70();
                    cl5 cl5Var3 = new cl5((byte) 27);
                    y3j0 y3j0VarB3 = utiVar.M.b();
                    x1x.x(y3j0VarB3);
                    dpi0 dpi0Var3 = utiVar.N;
                    gle0 gle0Var3 = new gle0();
                    cmt cmtVarD4 = ((wti) dpi0Var3.f6468a).d();
                    j6m0 j6m0Var3 = new j6m0((byte) 19);
                    zie0 zie0Var3 = new zie0();
                    xuz xuzVar3 = utiVar.O;
                    rl70 rl70VarA3 = utiVar.P.a();
                    f4u f4uVarJ3 = ((kki) utiVar.Q.f24619a).j();
                    s64 s64VarB3 = d1pVar.b();
                    au0 au0VarZ2 = d1pVar.z0();
                    s9m0 s9m0Var3 = utiVar.R;
                    tsu tsuVarW2 = ((gbi) lef0Var.f19899a).w();
                    iqt iqtVar3 = new iqt(gst0Var);
                    x1u x1uVar3 = new x1u(gst0Var, (byte) 1);
                    bbw0 bbw0Var3 = new bbw0((Object) utiVar.U, (byte) 21);
                    sqx sqxVar3 = utiVar.V;
                    nr00 nr00VarG3 = ((cu) zx10Var.f45137a).g();
                    nv20 nv20VarF3 = ((cu) zx10Var.f45137a).f();
                    ubu ubuVar3 = utiVar.W;
                    zoi0 zoi0Var3 = utiVar.X;
                    nrt nrtVarQ3 = ((g45) wsf0Var.b).q();
                    nou nouVarE3 = ((g45) wsf0Var.b).E();
                    ieu ieuVar5 = utiVar.w0;
                    jnk jnkVarH3 = lp4Var.h();
                    x1x.x(jnkVarH3);
                    nyb nybVarD2 = lp4Var.d();
                    x1x.x(nybVarD2);
                    rkt0 rkt0Var3 = utiVar.Y;
                    qho qhoVar = utiVar.z0;
                    yk50 yk50VarD3 = rmd0Var.d();
                    x1x.x(yk50VarD3);
                    zyt zytVarB3 = ((cih) utiVar.L.b).b();
                    p4u p4uVarE3 = rmd0Var.e();
                    x1x.x(p4uVarE3);
                    czt cztVar3 = new czt(fsdVar, (byte) 1);
                    a6u a6uVar3 = utiVar.a0;
                    bu90 bu90VarP3 = ((prc) utiVar.b0.f25567a).p();
                    x1x.x(bu90VarP3);
                    sd60 sd60Var2 = utiVar.d0;
                    zx10 zx10Var3 = new zx10(utiVar.e0);
                    gne0 gne0Var2 = new gne0((byte) 23);
                    rqt rqtVarA2 = utiVar.f0.f36881a.a();
                    usd usdVar2 = new usd();
                    iw20 iw20VarX2 = ((gbi) lef0Var.f19899a).x();
                    hs00 hs00Var2 = utiVar.g0;
                    rqt rqtVar2 = new rqt();
                    String str2 = utiVar.h0;
                    wpt wptVarC2 = ((gbi) lef0Var.f19899a).c();
                    nhf0 nhf0Var2 = utiVar.i0;
                    rek0 rek0Var2 = utiVar.j0;
                    dyg0 dyg0Var2 = new dyg0(new y6j0(q7d0Var, v1j0Var));
                    kwd kwdVar2 = utiVar.m0;
                    im4 im4VarA = ((v8i) utiVar.c0.f25390a).a();
                    tqx tqxVar2 = utiVar.n0;
                    yzn0 yzn0Var2 = utiVar.o0;
                    epc epcVarL3 = lp4Var.l();
                    x1x.x(epcVarL3);
                    aVar = new xxi0(rjoVar, ojjVar, mi70Var, s31Var, m1eVar3, qgdVar, ahuVarY3, lbuVar, dztVar2, v88Var, ih5Var, y3vVar, jh70Var2, i1w0Var3, jw20Var, pruVar, bztVar3, cyhVar, z4w0Var3, uuzVar3, ctf0Var3, yoxVar3, mneVarH5, bzuVar3, ieuVar4, abuVar3, rouVar3, x4uVar3, svs0Var3, l7kVarC3, s64VarR2, cmtVarD3, dujVar3, ivnVar3, gxuVarN3, wguVar3, nh70Var3, cl5Var3, y3j0VarB3, gle0Var3, cmtVarD4, j6m0Var3, zie0Var3, xuzVar3, rl70VarA3, f4uVarJ3, s64VarB3, au0VarZ2, s9m0Var3, tsuVarW2, iqtVar3, x1uVar3, bbw0Var3, sqxVar3, nr00VarG3, nv20VarF3, ubuVar3, zoi0Var3, nrtVarQ3, nouVarE3, ieuVar5, jnkVarH3, nybVarD2, rkt0Var3, qhoVar, yk50VarD3, zytVarB3, p4uVarE3, cztVar3, a6uVar3, bu90VarP3, sd60Var2, zx10Var3, gne0Var2, rqtVarA2, usdVar2, iw20VarX2, hs00Var2, rqtVar2, str2, wptVarC2, nhf0Var2, rek0Var2, dyg0Var2, kwdVar2, im4VarA, tqxVar2, yzn0Var2, epcVarL3, utiVar.t0, utiVar.p0, utiVar.q0, new tqt());
                }
                return aVar;
            case 7:
                vwb0 vwb0Var = ((vti) obj).f38008a;
                if (b3 == 0) {
                    return new y3j0();
                }
                if (b3 == 1) {
                    return new ost0(new ulk(vwb0Var, (byte) 2));
                }
                if (b3 == 2) {
                    return new hm7(new h03(vwb0Var));
                }
                c99.h(b3);
                return null;
            case 8:
                return a();
            case 9:
                return b();
            case 10:
                daf dafVar = (daf) obj;
                switch (b3) {
                    case 0:
                        return new ttb0((nok0) ((n5d0) dafVar.g).get(), (j1q0) dafVar.e);
                    case 1:
                        eyg0 eyg0Var = new eyg0((gii0) dafVar.b, (byte) 21);
                        iok0 iok0Var = (iok0) dafVar.c;
                        mne mneVarH6 = ((psc) ((cad) dafVar.d).b).h();
                        x1x.x(mneVarH6);
                        return new nok0(eyg0Var, iok0Var, mneVarH6);
                    case 2:
                        return new luu((nok0) ((n5d0) dafVar.g).get());
                    case 3:
                        return new juu((gok0) ((n5d0) dafVar.j).get());
                    case 4:
                        return new gok0((fok0) dafVar.f);
                    case 5:
                        return new kuu((nok0) ((n5d0) dafVar.g).get());
                    case 6:
                        return new xtu((nok0) ((n5d0) dafVar.g).get());
                    default:
                        c99.h(b3);
                        return null;
                }
            case 11:
                return c();
            case 12:
                return d();
            case 13:
                return e();
            case 14:
                return f();
            case 15:
                return g();
            case 16:
                if (b3 == 0) {
                    return new dvi(this);
                }
                if (b3 == 1) {
                    return new evi(this);
                }
                if (b3 == 2) {
                    return new fvi(this);
                }
                c99.h(b3);
                return null;
            case 17:
                gr70 gr70Var = ((cwi) obj).f;
                if (b3 == 0) {
                    return new awi(this);
                }
                if (b3 == 1) {
                    smu smuVarV = gr70Var.v();
                    x1x.x(smuVarV);
                    return smuVarV;
                }
                if (b3 == 2) {
                    rmu rmuVarP = gr70Var.p();
                    x1x.x(rmuVarP);
                    return rmuVarP;
                }
                if (b3 == 3) {
                    return new bwi(this);
                }
                c99.h(b3);
                return null;
            case 18:
                if (b3 == 0) {
                    return new dwi(this);
                }
                if (b3 == 1) {
                    return new ewi(this);
                }
                if (b3 == 2) {
                    return new fwi(this);
                }
                if (b3 == 3) {
                    return new s1p0();
                }
                c99.h(b3);
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return h();
            case 20:
                return i();
            case 21:
                return j();
            case 22:
                return k();
            case 23:
                return l();
            case 24:
                return m();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return n();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return o();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return p();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return q();
            default:
                iyi iyiVar = (iyi) obj;
                s470 s470Var = iyiVar.d;
                g8i g8iVar4 = iyiVar.f15590a;
                tnc0 tnc0Var = iyiVar.b;
                if (b3 == 0) {
                    return new dki(this, b2);
                }
                if (b3 != 1) {
                    if (b3 != 2) {
                        c99.h(b3);
                        return null;
                    }
                    qps0 qps0Var = new qps0();
                    qps0Var.f29136a = new qx90(0, 0, 0, 0L);
                    return qps0Var;
                }
                tpx tpxVar = new tpx(tnc0Var, (byte) 1);
                wsf0 wsf0Var2 = new wsf0(tnc0Var);
                mne mneVarV1 = g8iVar4.v1();
                sqt sqtVar = new sqt();
                m1e m1eVarQ2 = g8iVar4.q1();
                x1x.x(m1eVarQ2);
                return new cqs0(tpxVar, s470Var, wsf0Var2, mneVarV1, sqtVar, m1eVarQ2, new kd30(iyiVar.a(), s470Var), new xsu(iyiVar.a()), g8iVar4.d2(), new bbw0((Object) iyiVar.a(), (byte) 29), new ljf0(tnc0Var));
        }
    }
}
