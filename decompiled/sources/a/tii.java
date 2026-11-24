package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.cyber.section.api.home.CyberHomeParams;
import org.xplatform.cyber.section.api.presentation.LeaderBoardScreenParams;
import org.xplatform.statistic.horse_menu.domain.model.HorseInfoModel;
import org.xplatform.ufc.api.last_fights.LastFightsParams;

/* JADX INFO: loaded from: classes3.dex */
public final class tii implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34010a;
    public final Object b;

    public /* synthetic */ tii(Object obj, byte b) {
        this.f34010a = b;
        this.b = obj;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f34010a;
        byte b2 = 2;
        byte b3 = 18;
        Object obj = this.b;
        switch (b) {
            case 0:
                uii uiiVar = (uii) obj;
                return new b4w(((uii) ((iw20) uiiVar.f35730a).f15470a).r(), (n3w) uiiVar.b, (sys0) uiiVar.c, ((Boolean) uiiVar.d).booleanValue(), ((Boolean) uiiVar.e).booleanValue());
            case 1:
                qgd qgdVar = (qgd) obj;
                HistoryTypeModel historyTypeModel = (HistoryTypeModel) qgdVar.b;
                ql5 ql5Var = (ql5) qgdVar.c;
                f8w f8wVar = (f8w) qgdVar.d;
                mne mneVarH = ((psc) ((cad) qgdVar.e).b).h();
                x1x.x(mneVarH);
                return new k8w(historyTypeModel, ql5Var, f8wVar, mneVarH, new bst(), (pru) qgdVar.f, (ctf0) qgdVar.g);
            case 2:
                yii yiiVar = (yii) obj;
                CyberHomeParams cyberHomeParams = yiiVar.e;
                pyg pygVar = yiiVar.f;
                hzg hzgVarA = pygVar.a();
                x1x.x(hzgVarA);
                lbu lbuVar = yiiVar.g;
                img imgVarG = pygVar.g();
                sjl0 sjl0Var = yiiVar.h;
                f3u f3uVar = new f3u(imgVarG, sjl0Var);
                u8u u8uVar = new u8u((Object) yiiVar.i, (Object) ((cih) yiiVar.j.b).a(), (byte) 15);
                v7i v7iVarK = ((gbi) yiiVar.k.f20589a).k();
                rtu rtuVar = yiiVar.l;
                pmi pmiVar = yiiVar.m;
                j3c j3cVarV = yiiVar.n.V();
                x1x.x(j3cVarV);
                cyu cyuVarK = pygVar.k();
                x1x.x(cyuVarK);
                yuu yuuVar = new yuu(cyuVarK, sjl0Var, yiiVar.o);
                pru pruVar = yiiVar.b;
                gt5 gt5Var = yiiVar.p;
                q8u q8uVarA = gt5Var.a();
                x1x.x(q8uVarA);
                bnu bnuVarJ = gt5Var.J();
                x1x.x(bnuVarJ);
                cyg0 cyg0VarE = gt5Var.e();
                x1x.x(cyg0VarE);
                lyt lytVarL = gt5Var.L();
                x1x.x(lytVarL);
                xsu xsuVar = new xsu(yiiVar.q);
                cyu cyuVarK2 = pygVar.k();
                x1x.x(cyuVarK2);
                d4u d4uVar = new d4u(lbuVar, f3uVar, u8uVar, v7iVarK, rtuVar, pmiVar, j3cVarV, yuuVar, pruVar, q8uVarA, bnuVarJ, cyg0VarE, lytVarL, xsuVar, new wti(cyuVarK2, sjl0Var), yiiVar.r);
                ctf0 ctf0Var = yiiVar.s;
                mne mneVarH2 = ((psc) yiiVar.t.b).h();
                x1x.x(mneVarH2);
                m1e m1eVar = yiiVar.u;
                luu luuVarW = ((daf) yiiVar.v.f35622a).w();
                x1x.x(luuVarW);
                g2v g2vVar = yiiVar.w;
                y78 y78Var = yiiVar.x;
                hjd hjdVarA = yiiVar.f42692a.a();
                x1x.x(hjdVarA);
                kt2 kt2Var = yiiVar.y;
                ih5 ih5Var = new ih5(kt2Var, (byte) 1);
                yo4 yo4Var = new yo4(kt2Var, (byte) 5);
                zr1 zr1Var = yiiVar.z;
                chf0 chf0Var = new chf0((Object) new ih5(kt2Var, (byte) 1), (Object) zr1Var, (byte) 25);
                grj grjVar = yiiVar.A;
                duj dujVar = yiiVar.B;
                hvt hvtVarF = gt5Var.F();
                x1x.x(hvtVarF);
                dih dihVarM = pygVar.m();
                x1x.x(dihVarM);
                rpt rptVar = new rpt(dihVarM);
                oeg0 oeg0Var = yiiVar.C;
                y3v y3vVar = yiiVar.D;
                vqc vqcVarI = pygVar.i();
                vqc vqcVar = yiiVar.E;
                poq0 poq0Var = yiiVar.d;
                svu svuVarA = yiiVar.F.a();
                x1x.x(svuVarA);
                r9u r9uVar = yiiVar.G;
                pyg0 pyg0VarY = gt5Var.y();
                x1x.x(pyg0VarY);
                qyg0 qyg0VarV = gt5Var.v();
                x1x.x(qyg0VarV);
                r2u r2uVar = yiiVar.H;
                bwl bwlVar = yiiVar.I;
                return new ukw(cyberHomeParams, hzgVarA, d4uVar, pruVar, ctf0Var, mneVarH2, m1eVar, luuVarW, lbuVar, g2vVar, y78Var, hjdVarA, ih5Var, yo4Var, zr1Var, chf0Var, grjVar, dujVar, hvtVarF, rptVar, oeg0Var, y3vVar, vqcVarI, vqcVar, poq0Var, svuVarA, r9uVar, pyg0VarY, qyg0VarV, r2uVar, ((dbi) bwlVar.f3330a).j(), ((dbi) bwlVar.f3330a).m(), yiiVar.J, ((yqc) yiiVar.K.b).z());
            case 3:
                o3c o3cVar = (o3c) obj;
                HorseInfoModel horseInfoModel = (HorseInfoModel) o3cVar.f24576a;
                p4u p4uVar = new p4u(new u8u(new edu((gii0) o3cVar.b), (knf0) o3cVar.c));
                uyu uyuVar = (uyu) o3cVar.d;
                wyu wyuVar = (wyu) o3cVar.e;
                ocl oclVar = (ocl) o3cVar.f;
                ctf0 ctf0Var2 = (ctf0) o3cVar.g;
                m1e m1eVar2 = (m1e) o3cVar.h;
                mne mneVarH3 = ((psc) ((cad) o3cVar.i).b).h();
                x1x.x(mneVarH3);
                return new snw(horseInfoModel, p4uVar, uyuVar, wyuVar, oclVar, ctf0Var2, m1eVar2, mneVarH3, (i1w0) o3cVar.j);
            case 4:
                ru ruVar = (ru) obj;
                String str = (String) ruVar.f31100a;
                xfu xfuVar = new xfu(new abu(new ieu((gii0) ruVar.c, (byte) 17), (knf0) ruVar.d));
                duj dujVar2 = (duj) ruVar.b;
                ocl oclVar2 = (ocl) ruVar.f;
                i1w0 i1w0Var = (i1w0) ruVar.g;
                m1e m1eVar3 = (m1e) ruVar.h;
                ctf0 ctf0Var3 = (ctf0) ruVar.e;
                mne mneVarH4 = ((psc) ((cad) ruVar.i).b).h();
                x1x.x(mneVarH4);
                return new yow(str, xfuVar, dujVar2, oclVar2, i1w0Var, m1eVar3, ctf0Var3, mneVarH4);
            case 5:
                v7i v7iVar = (v7i) obj;
                String str2 = (String) v7iVar.i;
                long jLongValue = ((Long) v7iVar.g).longValue();
                cad cadVar = (cad) v7iVar.h;
                mne mneVarH5 = ((psc) cadVar.b).h();
                x1x.x(mneVarH5);
                lbu lbuVar2 = new lbu((gii0) v7iVar.e, (byte) 21);
                knf0 knf0Var = (knf0) v7iVar.f;
                knf0Var.getClass();
                cyu cyuVar = new cyu();
                cyuVar.f5196a = mneVarH5;
                cyuVar.b = lbuVar2;
                cyuVar.c = knf0Var;
                yfu yfuVar = new yfu(cyuVar);
                pmi0 pmi0Var = (pmi0) v7iVar.k;
                nfm0 nfm0VarA = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA);
                do20 do20Var = new do20(nfm0VarA);
                nfm0 nfm0VarA2 = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA2);
                jwu jwuVar = new jwu(nfm0VarA2, (byte) 2);
                qzt qztVar = new qzt((pru) v7iVar.f36925a, (byte) 0);
                fhj fhjVarR = ((daf) pmi0Var.f27236a).r();
                uyu uyuVar2 = (uyu) v7iVar.j;
                wyu wyuVar2 = (wyu) v7iVar.n;
                ocl oclVar3 = (ocl) v7iVar.m;
                ctf0 ctf0Var4 = (ctf0) v7iVar.c;
                m1e m1eVar4 = (m1e) v7iVar.d;
                mne mneVarH6 = ((psc) cadVar.b).h();
                x1x.x(mneVarH6);
                return new qqw(str2, jLongValue, yfuVar, do20Var, jwuVar, qztVar, fhjVarR, uyuVar2, wyuVar2, oclVar3, ctf0Var4, m1eVar4, mneVarH6, (i1w0) v7iVar.b, (r9u) v7iVar.l);
            case 6:
                o3c o3cVar2 = (o3c) obj;
                String str3 = (String) o3cVar2.f24576a;
                long jLongValue2 = ((Long) o3cVar2.b).longValue();
                cad cadVar2 = (cad) o3cVar2.c;
                mne mneVarH7 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH7);
                reu reuVar = new reu(new ouu(mneVarH7, new zpu((gii0) o3cVar2.d, (byte) 10), (knf0) o3cVar2.e), (byte) 1);
                duj dujVar3 = (duj) o3cVar2.f;
                ocl oclVar4 = (ocl) o3cVar2.g;
                i1w0 i1w0Var2 = (i1w0) o3cVar2.h;
                m1e m1eVar5 = (m1e) o3cVar2.i;
                ctf0 ctf0Var5 = (ctf0) o3cVar2.j;
                mne mneVarH8 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH8);
                return new krw(str3, jLongValue2, reuVar, dujVar3, oclVar4, i1w0Var2, m1eVar5, ctf0Var5, mneVarH8);
            case 7:
                return new aji(this);
            case 8:
                return new cji(this);
            case 9:
                g45 g45Var = (g45) obj;
                abu abuVar = new abu((gii0) g45Var.f10647a, (byte) 18);
                knf0 knf0Var2 = (knf0) g45Var.b;
                cad cadVar3 = (cad) g45Var.c;
                mne mneVarH9 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH9);
                e1u e1uVar = new e1u(new yuu(abuVar, knf0Var2, mneVarH9), (byte) 19);
                m1e m1eVar6 = (m1e) g45Var.d;
                String str4 = (String) g45Var.g;
                i1w0 i1w0Var3 = (i1w0) g45Var.e;
                ctf0 ctf0Var6 = (ctf0) g45Var.f;
                ocl oclVar5 = (ocl) g45Var.h;
                mne mneVarH10 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH10);
                return new hcx(e1uVar, m1eVar6, str4, i1w0Var3, ctf0Var6, oclVar5, mneVarH10);
            case 10:
                return new dji(this);
            case 11:
                cr crVar = (cr) obj;
                i1w0 i1w0Var4 = (i1w0) crVar.c;
                duj dujVar4 = (duj) crVar.d;
                gle0 gle0Var = (gle0) crVar.e;
                ctf0 ctf0Var7 = (ctf0) crVar.f;
                sa10 sa10Var = (sa10) crVar.g;
                m1e m1eVar7 = (m1e) crVar.h;
                mne mneVarH11 = ((psc) ((cad) crVar.i).b).h();
                x1x.x(mneVarH11);
                pru pruVar2 = (pru) crVar.b;
                lsn lsnVar = new lsn(new gxu((csr0) crVar.j, new ilp0((gii0) crVar.k, (byte) 3), (knf0) crVar.l));
                ngu nguVar = new ngu(crVar.h());
                wsf0 wsf0Var = (wsf0) crVar.p;
                return new psr0(i1w0Var4, dujVar4, gle0Var, ctf0Var7, sa10Var, m1eVar7, mneVarH11, pruVar2, lsnVar, new lhf0((Object) nguVar, (Object) ((g45) wsf0Var.b).y(), (Object) wsf0Var.b(), (byte) 25), new cmt((Object) crVar.h(), (byte) 1), new ivn(crVar.h()), new rqt(), new p4u(crVar.h()), new x4u(crVar.h()), new cu(new ngu(crVar.h()), new ivn(crVar.h()), new hrc(crVar.h()), (byte) 10), new i1e0(crVar.h()), new hrc(crVar.h()), new ngu(crVar.h()), new prc((Object) crVar.h(), (byte) 3), ((g45) wsf0Var.b).g(), (r9u) crVar.r);
            case 12:
                return new hji(this);
            case 13:
                return new jji(this);
            case 14:
                return new kji(this);
            case 15:
                return new oty((uyu) ((c5k) obj).f3775a);
            case 16:
                oif0 oif0Var = (oif0) obj;
                return new gj50((i1w0) oif0Var.b, ((es) ((ilp0) oif0Var.c).f14992a).k());
            case 17:
                return new lji(this);
            case 18:
                nc0 nc0Var = (nc0) obj;
                i1w0 i1w0Var5 = (i1w0) nc0Var.d;
                LastFightsParams lastFightsParams = (LastFightsParams) nc0Var.e;
                ctf0 ctf0Var8 = (ctf0) nc0Var.c;
                kys0 kys0Var = (kys0) nc0Var.f;
                m1e m1eVar8 = (m1e) nc0Var.g;
                pru pruVar3 = (pru) nc0Var.b;
                g2v g2vVar2 = (g2v) nc0Var.f23267a;
                r9u r9uVarC = ((xzp) ((epi0) nc0Var.h).b).C();
                j3c j3cVarV2 = ((iip) nc0Var.i).V();
                x1x.x(j3cVarV2);
                luu luuVarW2 = ((daf) ((ugf0) nc0Var.j).f35622a).w();
                x1x.x(luuVarW2);
                f4u f4uVar = new f4u(new edu((knf0) nc0Var.k, new zri((gii0) nc0Var.l, (byte) 13)), (byte) 11);
                mne mneVarH12 = ((psc) ((cad) nc0Var.m).b).h();
                x1x.x(mneVarH12);
                return new ryy(i1w0Var5, lastFightsParams, ctf0Var8, kys0Var, m1eVar8, pruVar3, g2vVar2, r9uVarC, j3cVarV2, luuVarW2, f4uVar, mneVarH12);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                daf dafVar = (daf) obj;
                duj dujVar5 = (duj) dafVar.b;
                g090 g090Var = new g090((gii0) dafVar.c, (byte) 3);
                knf0 knf0Var3 = (knf0) dafVar.d;
                cad cadVar4 = (cad) dafVar.e;
                mne mneVarH13 = ((psc) cadVar4.b).h();
                x1x.x(mneVarH13);
                reu reuVar2 = new reu(new yuu(mneVarH13, g090Var, knf0Var3), (byte) 8);
                m1e m1eVar9 = (m1e) dafVar.f;
                i1w0 i1w0Var6 = (i1w0) dafVar.g;
                kki kkiVar = (kki) dafVar.h;
                ocl oclVar6 = (ocl) dafVar.i;
                String str5 = (String) dafVar.j;
                long jLongValue3 = ((Long) dafVar.k).longValue();
                mne mneVarH14 = ((psc) cadVar4.b).h();
                x1x.x(mneVarH14);
                return new wzy(dujVar5, reuVar2, m1eVar9, i1w0Var6, kkiVar, oclVar6, str5, jLongValue3, mneVarH14, (r9u) dafVar.l);
            case 20:
                nji njiVar = (nji) obj;
                LeaderBoardScreenParams leaderBoardScreenParams = njiVar.f23638a;
                mne mneVarH15 = ((psc) njiVar.b.b).h();
                x1x.x(mneVarH15);
                m1e m1eVar10 = njiVar.c;
                g2v g2vVar3 = njiVar.d;
                ctf0 ctf0Var9 = njiVar.e;
                pyg pygVar2 = njiVar.f;
                hzg hzgVarA2 = pygVar2.a();
                x1x.x(hzgVarA2);
                j3c j3cVarV3 = njiVar.g.V();
                x1x.x(j3cVarV3);
                dzg dzgVarB = pygVar2.b();
                x1x.x(dzgVarB);
                cmt cmtVar = new cmt(dzgVarB, b3);
                dzg dzgVarB2 = pygVar2.b();
                x1x.x(dzgVarB2);
                e1u e1uVar2 = new e1u(dzgVarB2, (byte) 7);
                dzg dzgVarB3 = pygVar2.b();
                x1x.x(dzgVarB3);
                n4u n4uVar = new n4u(dzgVarB3, b2);
                dzg dzgVarB4 = pygVar2.b();
                x1x.x(dzgVarB4);
                return new eiz(leaderBoardScreenParams, mneVarH15, m1eVar10, g2vVar3, ctf0Var9, hzgVarA2, j3cVarV3, cmtVar, e1uVar2, n4uVar, new rpt(dzgVarB4), new ih5(njiVar.h, (byte) 1), njiVar.i);
            case 21:
                return new oji(this);
            case 22:
                return new qji(this);
            case 23:
                v7i v7iVar2 = (v7i) obj;
                String str6 = (String) v7iVar2.i;
                long jLongValue4 = ((Long) v7iVar2.e).longValue();
                int iIntValue = ((Integer) v7iVar2.f).intValue();
                cad cadVar5 = (cad) v7iVar2.h;
                mne mneVarH16 = ((psc) cadVar5.b).h();
                x1x.x(mneVarH16);
                i1w0 i1w0Var7 = (i1w0) v7iVar2.k;
                ocl oclVar7 = (ocl) v7iVar2.f36925a;
                m1e m1eVar11 = (m1e) v7iVar2.d;
                mne mneVarH17 = ((psc) cadVar5.b).h();
                x1x.x(mneVarH17);
                return new gb00(str6, jLongValue4, iIntValue, mneVarH16, i1w0Var7, oclVar7, m1eVar11, new e1u(new ywu(mneVarH17, new afm0((gii0) v7iVar2.m, (byte) 0), (knf0) v7iVar2.b), (byte) 23), (duj) v7iVar2.g, new rl70(), (wyu) v7iVar2.n, (uyu) v7iVar2.j, (r9u) v7iVar2.l, (ctf0) v7iVar2.c);
            case 24:
                return new vji(this);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                gud gudVar = (gud) obj;
                duj dujVar6 = (duj) gudVar.f11923a;
                ctf0 ctf0Var10 = (ctf0) gudVar.b;
                gst0 gst0Var = (gst0) gudVar.c;
                knf0 knf0Var4 = (knf0) gudVar.d;
                svu svuVar = new svu((gii0) gudVar.e, (byte) 24);
                cad cadVar6 = (cad) gudVar.f;
                mne mneVarH18 = ((psc) cadVar6.b).h();
                x1x.x(mneVarH18);
                gxu gxuVar = new gxu(gst0Var, new ywu(knf0Var4, svuVar, mneVarH18), ((cih) ((vqc) gudVar.g).b).a());
                mne mneVarH19 = ((psc) cadVar6.b).h();
                x1x.x(mneVarH19);
                gr00 gr00Var = new gr00(gudVar.c(), (zfo) gudVar.n, (edo) gudVar.o, (ulk) gudVar.p, (j1q0) gudVar.q);
                yiu yiuVar = new yiu((j1q0) gudVar.q, (byte) 0);
                g45 g45VarC = gudVar.c();
                ave aveVar = (ave) gudVar.j;
                xre xreVar = new xre(aveVar, (byte) 0);
                rrc rrcVar = (rrc) gudVar.r;
                vby vbyVar = (vby) gudVar.s;
                chf0 chf0Var2 = new chf0(rrcVar, vbyVar);
                lye lyeVar = (lye) gudVar.h;
                m0f m0fVar = (m0f) gudVar.i;
                vit0 vit0Var = new vit0(g45VarC, xreVar, chf0Var2, new oif0(lyeVar, m0fVar, aveVar), (etj) gudVar.t, (byte) 1);
                mpc mpcVar = new mpc(gudVar.c());
                ni9 ni9Var = new ni9(gudVar.c());
                ert ertVar = new ert(gudVar.c());
                moi0 moi0Var = new moi0(new khf0(lyeVar, aveVar, (q7d0) gudVar.l));
                pru pruVar4 = (pru) gudVar.u;
                return new xm00(dujVar6, ctf0Var10, gxuVar, mneVarH19, new gbi(gr00Var, yiuVar, vit0Var, mpcVar, ni9Var, ertVar, moi0Var, new xzt(pruVar4, (byte) 0), new vit0(gudVar.c(), new xre(aveVar, (byte) 0), new chf0(rrcVar, vbyVar), new oif0(lyeVar, m0fVar, aveVar), (etj) gudVar.t, (byte) 0), new znt(new chf0(rrcVar, vbyVar)), new mpc(gudVar.c()), new jtj((Object) new chf0(rrcVar, vbyVar), (Object) gudVar.c(), (byte) 1), new gs(gudVar.c()), new j9c(gudVar.c()), new jtt(gudVar.c()), new jtt(gudVar.c()), pruVar4, (r9u) gudVar.w));
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new yji(this);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                v5i v5iVar = (v5i) obj;
                boolean zBooleanValue = ((Boolean) v5iVar.e).booleanValue();
                String str7 = (String) v5iVar.f;
                yox yoxVar = new yox(new zpu(new jru((gii0) v5iVar.g), (btt0) v5iVar.h));
                noc nocVarE = ((uii) ((iw20) v5iVar.i).f15470a).e();
                woc wocVarB = ((w9i) ((pv00) v5iVar.j).f27640a).b();
                pek0 pek0Var = new pek0();
                nr nrVar = (nr) v5iVar.k;
                wsf0 wsf0Var2 = new wsf0((sv3) v5iVar.l);
                zsr zsrVar = (zsr) v5iVar.m;
                duj dujVar7 = (duj) v5iVar.c;
                rqj0 rqj0Var = (rqj0) v5iVar.n;
                ctf0 ctf0Var11 = (ctf0) v5iVar.b;
                mne mneVar = (mne) v5iVar.o;
                s64 s64Var = (s64) v5iVar.p;
                nrc nrcVarF = ((kib0) v5iVar.q).f();
                x1x.x(nrcVarF);
                psc pscVar = (psc) v5iVar.r;
                yzn0 yzn0VarG = ((sue) v5iVar.s).g();
                x1x.x(yzn0VarG);
                return new wx00(zBooleanValue, str7, yoxVar, nocVarE, wocVarB, pek0Var, nrVar, wsf0Var2, zsrVar, dujVar7, rqj0Var, ctf0Var11, mneVar, s64Var, nrcVarF, pscVar, yzn0VarG, ((xzp) ((epi0) v5iVar.t).b).F(), ((v8i) ((ok50) v5iVar.u).f25390a).b(), (sqx) v5iVar.d);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                cr crVar2 = (cr) obj;
                m1e m1eVar12 = (m1e) crVar2.c;
                o470 o470Var = new o470(new hd10((btt0) crVar2.d, (knf0) crVar2.e, (vby) crVar2.f, (gii0) crVar2.g));
                mne mneVarH20 = ((psc) ((cad) crVar2.h).b).h();
                x1x.x(mneVarH20);
                a6u a6uVar = (a6u) crVar2.i;
                ntu ntuVar = (ntu) crVar2.j;
                wsf0 wsf0Var3 = (wsf0) crVar2.k;
                return new be10(m1eVar12, o470Var, mneVarH20, a6uVar, ntuVar, ((g45) wsf0Var3.b).F(), ((g45) wsf0Var3.b).o0(), (j1q0) crVar2.l, (v88) crVar2.m, (i1w0) crVar2.n, (ocl) crVar2.o, (ctf0) crVar2.p, (duj) crVar2.b, (fd10) crVar2.q);
            default:
                mii0 mii0Var = (mii0) obj;
                return new qi10(new pyu((gii0) mii0Var.c, (byte) 22), (btt0) mii0Var.d);
        }
    }
}
