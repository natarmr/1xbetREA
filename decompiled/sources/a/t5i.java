package a;

import android.os.Bundle;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorJackpotBottomSheetParams;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.cyber.section.api.activeteams.CyberActiveTeamsParams;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;
import org.xplatform.wallet.impl.presentation.dialogs.accountactions.params.AccountActionsScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class t5i implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33370a;
    public final Object b;

    public /* synthetic */ t5i(Object obj, byte b) {
        this.f33370a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.o5d0
    public final Object get() {
        byte b = this.f33370a;
        boolean z = false;
        Object[] objArr = 0;
        byte b2 = 5;
        byte b3 = 14;
        byte b4 = 28;
        yje yjeVar = null;
        byte b5 = 10;
        byte b6 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                nhf0 nhf0Var = (nhf0) obj;
                AccountActionsScreenParams accountActionsScreenParams = (AccountActionsScreenParams) nhf0Var.f23530a;
                ctf0 ctf0Var = (ctf0) nhf0Var.b;
                mne mneVarH = ((psc) ((cad) nhf0Var.c).b).h();
                x1x.x(mneVarH);
                ctf0Var.getClass();
                nc ncVar = new nc(accountActionsScreenParams, b6);
                uc ucVar = new uc(ctf0Var, objArr == true ? 1 : 0);
                rwj rwjVar = mneVarH.f22085a;
                return new vc(null, ncVar, ucVar, cvm0.p(rwjVar, rwjVar), null);
            case 1:
                return new u5i(this);
            case 2:
                v5i v5iVar = (v5i) obj;
                ActionMenuDialogParams actionMenuDialogParams = (ActionMenuDialogParams) v5iVar.e;
                i1w0 i1w0Var = (i1w0) v5iVar.f;
                zfm0 zfm0VarZ = ((daf) ((roi0) v5iVar.g).f30839a).Z();
                duj dujVar = (duj) v5iVar.c;
                iip iipVar = (iip) v5iVar.h;
                atz atzVarO = iipVar.O();
                pcl0 pcl0Var = (pcl0) v5iVar.i;
                oif0 oif0VarG = pcl0Var.g();
                x1x.x(oif0VarG);
                nku nkuVarI = ((kki) ((jw20) v5iVar.j).b).i();
                x1x.x(nkuVarI);
                es esVarO = pcl0Var.O();
                x1x.x(esVarO);
                atz atzVar = (atz) v5iVar.k;
                gl5 gl5Var = (gl5) v5iVar.l;
                a1d a1dVar = (a1d) v5iVar.m;
                njt0 njt0VarA = ((qv2) a1dVar.b).A();
                z8u z8uVarE = a1dVar.e();
                lbu lbuVar = (lbu) v5iVar.n;
                ivn ivnVarG = ((qv2) a1dVar.b).g();
                b3c b3cVarS = iipVar.s();
                x1x.x(b3cVarS);
                ctf0 ctf0Var2 = (ctf0) v5iVar.b;
                mne mneVarH2 = ((psc) ((cad) v5iVar.o).b).h();
                x1x.x(mneVarH2);
                xr xrVar = new xr((bn6) v5iVar.p, (je) v5iVar.q);
                reu reuVarC = pcl0Var.c();
                x1x.x(reuVarC);
                n1d n1dVarT = pcl0Var.T();
                x1x.x(n1dVarT);
                cad cadVarY = pcl0Var.Y();
                x1x.x(cadVarY);
                return new wj(actionMenuDialogParams, i1w0Var, zfm0VarZ, dujVar, atzVarO, oif0VarG, nkuVarI, esVarO, atzVar, gl5Var, njt0VarA, z8uVarE, lbuVar, ivnVarG, b3cVarS, ctf0Var2, mneVarH2, xrVar, reuVarC, n1dVarT, cadVarY, (cl5) v5iVar.r, (evz) v5iVar.s, (gua) v5iVar.t, new hwt(((gr00) ((wsf0) v5iVar.u).b).h()), (pru) v5iVar.d);
            case 3:
                w5i w5iVar = (w5i) obj;
                CyberActiveTeamsParams cyberActiveTeamsParams = w5iVar.f38586a;
                hzg hzgVarA = w5iVar.b.a();
                x1x.x(hzgVarA);
                cad cadVar = new cad(new c5k(new wsf0(w5iVar.c, (byte) 1), new h03((byte) 3, z)), b4);
                ctf0 ctf0Var3 = w5iVar.d;
                mne mneVarH3 = ((psc) w5iVar.e.b).h();
                x1x.x(mneVarH3);
                return new qn(cyberActiveTeamsParams, hzgVarA, cadVar, ctf0Var3, mneVarH3, w5iVar.f, w5iVar.g, new ih5(w5iVar.h, (byte) 1), w5iVar.i);
            case 4:
                return new y5i(this);
            case 5:
                return new a6i(this);
            case 6:
                ru ruVar = (ru) obj;
                zg zgVar = (zg) ruVar.f31100a;
                mne mneVarH4 = ((psc) ((cad) ruVar.b).b).h();
                x1x.x(mneVarH4);
                rou rouVar = (rou) ruVar.g;
                nr nrVar = (nr) ruVar.c;
                wsf0 wsf0Var = (wsf0) ruVar.d;
                m0u m0uVarT = ((g45) wsf0Var.b).t();
                ctf0 ctf0Var4 = (ctf0) ruVar.e;
                h0q0 h0q0VarB = ((pp90) ruVar.f).b();
                x1x.x(h0q0VarB);
                return new ww(zgVar, mneVarH4, rouVar, nrVar, m0uVarT, ctf0Var4, h0q0VarB, ((g45) wsf0Var.b).o(), ((d1p) ruVar.h).g0(), (i1w0) ruVar.i);
            case 7:
                daf dafVar = (daf) obj;
                long jLongValue = ((Long) dafVar.b).longValue();
                h03 h03Var = new h03((gii0) dafVar.c, (byte) 5);
                cad cadVar2 = (cad) dafVar.d;
                mne mneVarH5 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH5);
                ivn ivnVar = new ivn(new nhf0(h03Var, mneVarH5, (knf0) dafVar.e, (btt0) dafVar.f));
                m1e m1eVar = (m1e) dafVar.g;
                mne mneVarH6 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH6);
                return new ez(jLongValue, ivnVar, m1eVar, mneVarH6, (duj) dafVar.h, (ctf0) dafVar.i, (ocl) dafVar.j, (i1w0) dafVar.k, (r9u) dafVar.l);
            case 8:
                return new c6i(this);
            case 9:
                return new e6i(this);
            case 10:
                return new g6i(this);
            case 11:
                return new d7i(this);
            case 12:
                nc0 nc0Var = (nc0) obj;
                return new dn0(new xzp((gii0) nc0Var.d, (x2c0) nc0Var.e), (j51) nc0Var.h, (xk0) nc0Var.i, (knf0) nc0Var.f, (x2c0) nc0Var.e, (btt0) nc0Var.j);
            case 13:
                return new j7i(this);
            case 14:
                ru ruVar2 = (ru) obj;
                us00 us00Var = (us00) ruVar2.f31100a;
                bv0 bv0Var = (bv0) ruVar2.c;
                ctf0 ctf0Var5 = (ctf0) ruVar2.e;
                duj dujVar2 = (duj) ruVar2.b;
                mne mneVarH7 = ((psc) ((cad) ruVar2.d).b).h();
                x1x.x(mneVarH7);
                return new tw0(us00Var, bv0Var, ctf0Var5, dujVar2, mneVarH7, (oeg0) ruVar2.f, (j1q0) ruVar2.g, ((g45) ((wsf0) ruVar2.h).b).o0(), (bzt) ruVar2.i);
            case 15:
                esg0 esg0Var = (esg0) obj;
                String str = (String) esg0Var.f8326a;
                ctf0 ctf0Var6 = (ctf0) esg0Var.b;
                iqt iqtVar = (iqt) esg0Var.c;
                mne mneVarH8 = ((psc) ((cad) esg0Var.d).b).h();
                x1x.x(mneVarH8);
                kc60 kc60Var = (kc60) esg0Var.e;
                ctf0Var6.getClass();
                zu0 zu0Var = new zu0(null, new mc((Object) str, (Object) iqtVar, (byte) 9), new uc(ctf0Var6, b2), cvm0.p(mneVarH8.c, mneVarH8.f22085a), null);
                sac.T(new fnq(kc60Var.a(), new qa(zu0Var, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(zu0Var), mneVarH8.b), yu0.h);
                return zu0Var;
            case 16:
                nr nrVar2 = (nr) obj;
                ctf0 ctf0Var7 = (ctf0) nrVar2.b;
                mne mneVarH9 = ((psc) ((cad) nrVar2.c).b).h();
                x1x.x(mneVarH9);
                ctf0Var7.getClass();
                return new pv0(new mg0((byte) 14), cvm0.p(mneVarH9.c, mneVarH9.f22085a), new uc(ctf0Var7, (byte) 6), null);
            case 17:
                return new r7i(this);
            case 18:
                ywq0 ywq0Var = (ywq0) obj;
                AggregatorJackpotBottomSheetParams aggregatorJackpotBottomSheetParams = (AggregatorJackpotBottomSheetParams) ywq0Var.f43384a;
                grj grjVar = (grj) ywq0Var.b;
                e41 e41Var = (e41) ywq0Var.c;
                s31 s31Var = (s31) ywq0Var.d;
                mne mneVarH10 = ((psc) ((cad) ywq0Var.e).b).h();
                x1x.x(mneVarH10);
                return new c41(aggregatorJackpotBottomSheetParams, grjVar, e41Var, s31Var, mneVarH10, (ctf0) ywq0Var.f);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                h7i h7iVar = (h7i) obj;
                us00 us00Var2 = (us00) h7iVar.h;
                n71 n71Var = (n71) h7iVar.i;
                ctf0 ctf0Var8 = h7iVar.f12574a;
                duj dujVar3 = (duj) h7iVar.j;
                mne mneVarH11 = ((psc) h7iVar.b.b).h();
                x1x.x(mneVarH11);
                i1w0 i1w0Var2 = (i1w0) h7iVar.k;
                j1q0 j1q0Var = h7iVar.c;
                wsf0 wsf0Var2 = h7iVar.d;
                hcp0 hcp0VarO0 = ((g45) wsf0Var2.b).o0();
                iqt iqtVar2 = (iqt) h7iVar.l;
                kc60 kc60Var2 = new kc60(h7iVar.e);
                khf0 khf0VarG = ((g45) wsf0Var2.b).G();
                fvt0 fvt0Var = (fvt0) h7iVar.m;
                xex xexVarB = ((h7i) fvt0Var.f10231a).b();
                zn00 zn00VarN = ((h7i) fvt0Var.f10231a).n();
                pl1 pl1Var = (pl1) h7iVar.n;
                iw20 iw20Var = new iw20(pl1Var);
                wsf0 wsf0Var3 = h7iVar.f;
                fv70 fv70Var = new fv70(iw20Var, ((rrc) wsf0Var3.b).x());
                gv70 gv70Var = new gv70(new jw20((Object) pl1Var, (byte) 10), ((rrc) wsf0Var3.b).x());
                ntu ntuVar = h7iVar.g;
                a6u a6uVar = (a6u) h7iVar.o;
                es esVarF = ((h7i) fvt0Var.f10231a).f();
                kki kkiVarC = ((h7i) fvt0Var.f10231a).c();
                trm0 trm0VarS = wsf0Var2.s();
                wyb wybVarP = fvt0Var.p();
                qoc qocVarO = ((h7i) fvt0Var.f10231a).o();
                yzn0 yzn0Var = (yzn0) h7iVar.p;
                ubu ubuVar = (ubu) h7iVar.q;
                tqx tqxVar = (tqx) h7iVar.r;
                do20 do20Var = (do20) h7iVar.s;
                nrt nrtVarQ = ((g45) wsf0Var2.b).q();
                urt urtVarG = wsf0Var2.g();
                h7i h7iVar2 = (h7i) fvt0Var.f10231a;
                dn0 dn0Var = (dn0) ((n5d0) h7iVar2.A).get();
                mne mneVarH12 = ((psc) h7iVar2.b.b).h();
                x1x.x(mneVarH12);
                mii0 mii0Var = new mii0((Object) new ehf0(dn0Var, mneVarH12), (Object) h7iVar2.g, (Object) new iqt(h7iVar2.e), h7iVar2.m, (byte) 15);
                pru pruVarR = ((uii) ((iw20) h7iVar.t).f15470a).r();
                v88 v88Var = (v88) h7iVar.u;
                mrt mrtVarP = ((g45) wsf0Var2.b).p();
                nou nouVarE = ((g45) wsf0Var2.b).E();
                lrc lrcVar = (lrc) h7iVar.v;
                ih5 ih5Var = (ih5) h7iVar.w;
                d1p d1pVar = (d1p) h7iVar.x;
                return new n91(us00Var2, n71Var, ctf0Var8, dujVar3, mneVarH11, i1w0Var2, j1q0Var, hcp0VarO0, iqtVar2, kc60Var2, khf0VarG, xexVarB, zn00VarN, fv70Var, gv70Var, ntuVar, a6uVar, esVarF, kkiVarC, trm0VarS, wybVarP, qocVarO, yzn0Var, ubuVar, tqxVar, do20Var, nrtVarQ, urtVarG, mii0Var, pruVarR, v88Var, mrtVarP, nouVarE, lrcVar, ih5Var, d1pVar.C(), d1pVar.b(), d1pVar.D0(), (zg) h7iVar.y, d1pVar.n(), (bzt) h7iVar.z, ((vqc) ((nr00) h7iVar.A).f23980a).o());
            case 20:
                gr00 gr00Var = (gr00) obj;
                ctf0 ctf0Var9 = (ctf0) gr00Var.f11760a;
                iqt iqtVar3 = (iqt) gr00Var.b;
                mne mneVarH13 = ((psc) ((cad) gr00Var.c).b).h();
                x1x.x(mneVarH13);
                kc60 kc60Var3 = (kc60) gr00Var.d;
                ctf0Var9.getClass();
                ja1 ja1Var = new ja1(null, new nc((Object) iqtVar3, (byte) 17), new uc(ctf0Var9, b5), cvm0.p(mneVarH13.c, mneVarH13.f22085a), null);
                sac.T(new fnq(kc60Var3.a(), new qa(ja1Var, yjeVar, (byte) 18), (byte) 4), d5c.S(jiu0.a(ja1Var), mneVarH13.b), ia1.h);
                return ja1Var;
            case 21:
                gud gudVar = (gud) obj;
                mne mneVarH14 = ((psc) ((cad) gudVar.f11923a).b).h();
                x1x.x(mneVarH14);
                oeg0 oeg0Var = (oeg0) gudVar.b;
                iqt iqtVar4 = new iqt((gst0) gudVar.c);
                wsf0 wsf0Var4 = (wsf0) gudVar.d;
                khf0 khf0VarG2 = ((g45) wsf0Var4.b).G();
                pl1 pl1Var2 = (pl1) gudVar.e;
                iw20 iw20Var2 = new iw20(pl1Var2);
                wsf0 wsf0Var5 = (wsf0) gudVar.f;
                fv70 fv70Var2 = new fv70(iw20Var2, ((rrc) wsf0Var5.b).x());
                gv70 gv70Var2 = new gv70(new jw20(pl1Var2, b5), ((rrc) wsf0Var5.b).x());
                ntu ntuVar2 = (ntu) gudVar.g;
                a6u a6uVar2 = (a6u) gudVar.h;
                u58 u58Var = (u58) gudVar.i;
                d1p d1pVar2 = (d1p) gudVar.j;
                au0 au0VarE = d1pVar2.E();
                bzu bzuVar = (bzu) gudVar.k;
                duj dujVar4 = (duj) gudVar.l;
                fvt0 fvt0Var2 = (fvt0) gudVar.m;
                return new kc1(mneVarH14, oeg0Var, iqtVar4, khf0VarG2, fv70Var2, gv70Var2, ntuVar2, a6uVar2, u58Var, au0VarE, bzuVar, dujVar4, ((h7i) fvt0Var2.f10231a).f(), ((h7i) fvt0Var2.f10231a).c(), (do20) gudVar.n, ((g45) wsf0Var4.b).o0(), ((h7i) fvt0Var2.f10231a).o(), wsf0Var4.s(), ((g45) wsf0Var4.b).E(), (lrc) gudVar.o, ((g45) wsf0Var4.b).q(), (yzn0) gudVar.p, (ubu) gudVar.q, (tqx) gudVar.r, ((h7i) fvt0Var2.f10231a).l(), (s31) gudVar.s, d1pVar2.r0(), (ctf0) gudVar.t, (db1) gudVar.u, ((Boolean) gudVar.v).booleanValue());
            case 22:
                rrd rrdVar = (rrd) obj;
                i1w0 i1w0Var3 = (i1w0) rrdVar.b;
                ctf0 ctf0Var10 = (ctf0) rrdVar.c;
                peg0 peg0Var = (peg0) rrdVar.d;
                b4j b4jVar = (b4j) rrdVar.e;
                je jeVarS0 = ((d1p) rrdVar.f).S0();
                List list = (List) rrdVar.g;
                mne mneVarH15 = ((psc) ((cad) rrdVar.h).b).h();
                x1x.x(mneVarH15);
                return new ce1(i1w0Var3, ctf0Var10, peg0Var, b4jVar, jeVarS0, list, mneVarH15);
            case 23:
                v7i v7iVar = (v7i) obj;
                rl1 rl1Var = (rl1) v7iVar.i;
                duj dujVar5 = (duj) v7iVar.g;
                vw3 vw3Var = (vw3) v7iVar.e;
                oeg0 oeg0Var2 = (oeg0) v7iVar.f;
                ctf0 ctf0Var11 = (ctf0) v7iVar.c;
                m1e m1eVar2 = (m1e) v7iVar.d;
                mne mneVarH16 = ((psc) ((cad) v7iVar.h).b).h();
                x1x.x(mneVarH16);
                return new wk1(rl1Var, dujVar5, vw3Var, oeg0Var2, ctf0Var11, m1eVar2, mneVarH16, (uyu) v7iVar.j, (bzt) v7iVar.k, (r9u) v7iVar.l, new dgu(new pou(((i7i) ((ehf0) v7iVar.f36925a).b).c()), (ieu) v7iVar.m, (ntu) v7iVar.b, (wyu) v7iVar.n));
            case 24:
                return new x7i(this);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ru ruVar3 = (ru) obj;
                HistoryTypeModel historyTypeModel = (HistoryTypeModel) ruVar3.f31100a;
                f8w f8wVar = (f8w) ruVar3.b;
                t37 t37Var = (t37) ruVar3.c;
                uyn uynVar = new uyn(new ok50(t37Var));
                o470 o470Var = new o470(new ok50(t37Var));
                j77 j77Var = (j77) ruVar3.d;
                ugf0 ugf0Var = new ugf0(new dpi0(j77Var));
                pru pruVar = (pru) ruVar3.f;
                ctf0 ctf0Var12 = (ctf0) ruVar3.e;
                xdj xdjVar = (xdj) ruVar3.g;
                f4u f4uVar = new f4u(new prc(xdjVar), (byte) 1);
                epi0 epi0Var = new epi0(new prc(xdjVar), b4);
                r9u r9uVar = (r9u) ruVar3.h;
                hnu hnuVar = new hnu(new dpi0(j77Var));
                mne mneVarH17 = ((psc) ((cad) ruVar3.i).b).h();
                x1x.x(mneVarH17);
                return new h52(historyTypeModel, f8wVar, uynVar, o470Var, ugf0Var, pruVar, ctf0Var12, f4uVar, epi0Var, r9uVar, hnuVar, mneVarH17);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                z7i z7iVar = (z7i) obj;
                Bundle bundle = z7iVar.f43919a;
                ih5 ih5Var2 = z7iVar.b;
                s31 s31Var2 = z7iVar.c;
                l7k l7kVar = z7iVar.d;
                cmt cmtVar = z7iVar.e;
                cyu cyuVar = z7iVar.f;
                hs60 hs60Var = z7iVar.g;
                gw60 gw60Var = z7iVar.h;
                wsf0 wsf0Var6 = z7iVar.i;
                nn60 nn60VarA = z7iVar.j.a();
                x1x.x(nn60VarA);
                oeg0 oeg0Var3 = z7iVar.k;
                i1w0 i1w0Var4 = z7iVar.l;
                ouu ouuVar = z7iVar.m;
                ctf0 ctf0Var13 = z7iVar.n;
                duj dujVar6 = z7iVar.o;
                mne mneVarH18 = ((psc) z7iVar.p.b).h();
                x1x.x(mneVarH18);
                v88 v88Var2 = z7iVar.q;
                m1e m1eVar3 = z7iVar.r;
                hnu hnuVar2 = z7iVar.s;
                iw20 iw20Var3 = z7iVar.t;
                return new bs60(bundle, ih5Var2, s31Var2, l7kVar, cmtVar, cyuVar, hs60Var, gw60Var, wsf0Var6, nn60VarA, oeg0Var3, i1w0Var4, ouuVar, ctf0Var13, dujVar6, mneVarH18, v88Var2, m1eVar3, hnuVar2, ((uii) iw20Var3.f15470a).r(), z7iVar.u, z7iVar.v, z7iVar.w, z7iVar.x, z7iVar.y, z7iVar.z, z7iVar.A, z7iVar.B, new jqt(z7iVar.C), ((uii) iw20Var3.f15470a).i(), z7iVar.D, z7iVar.E, z7iVar.F, z7iVar.G);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new a8i(this);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                o3c o3cVar = (o3c) obj;
                long jLongValue2 = ((Long) o3cVar.f24576a).longValue();
                cad cadVar3 = (cad) o3cVar.b;
                mne mneVarH19 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH19);
                fvt0 fvt0Var3 = new fvt0(new mii0(mneVarH19, new yk50((gii0) o3cVar.c, (byte) 4), (knf0) o3cVar.d, (btt0) o3cVar.e));
                sa10 sa10Var = (sa10) o3cVar.f;
                m1e m1eVar4 = (m1e) o3cVar.g;
                mne mneVarH20 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH20);
                return new gp2(jLongValue2, fvt0Var3, sa10Var, m1eVar4, mneVarH20, (i1w0) o3cVar.h, (duj) o3cVar.i, (r9u) o3cVar.j);
            default:
                return new bh3(((h8i) obj).f12626a);
        }
    }
}
