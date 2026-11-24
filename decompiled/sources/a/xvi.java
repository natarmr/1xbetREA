package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsAchievementParams;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsParams;
import org.xplatform.cyber.section.api.team_details.presentation.TeamDetailsResultsParams;

/* JADX INFO: loaded from: classes4.dex */
public final class xvi implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41560a;
    public final Object b;

    public /* synthetic */ xvi(Object obj, byte b) {
        this.f41560a = b;
        this.b = obj;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f41560a;
        byte b2 = 16;
        byte b3 = 2;
        byte b4 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new wvi(this);
            case 1:
                return new zvi(this);
            case 2:
                pmi pmiVar = (pmi) obj;
                sxo0 sxo0Var = (sxo0) pmiVar.b;
                ctf0 ctf0Var = (ctf0) pmiVar.c;
                mne mneVarH = ((psc) ((cad) pmiVar.d).b).h();
                x1x.x(mneVarH);
                return new wxo0(sxo0Var, ctf0Var, mneVarH);
            case 3:
                return new hwi(this);
            case 4:
                jwi jwiVar = (jwi) obj;
                TeamDetailsAchievementParams teamDetailsAchievementParams = jwiVar.f17252a;
                reu reuVar = new reu(new epi0(new pmi0(jwiVar.b, (byte) 25), b2), (byte) 20);
                hzg hzgVarA = jwiVar.c.a();
                x1x.x(hzgVarA);
                ctf0 ctf0Var2 = jwiVar.d;
                mne mneVarH2 = ((psc) jwiVar.e.b).h();
                x1x.x(mneVarH2);
                return new t7p0(teamDetailsAchievementParams, reuVar, hzgVarA, ctf0Var2, mneVarH2, jwiVar.f, jwiVar.g);
            case 5:
                kwi kwiVar = (kwi) obj;
                cad cadVar = kwiVar.f19003a;
                mne mneVarH3 = ((psc) cadVar.b).h();
                x1x.x(mneVarH3);
                TeamDetailsParams teamDetailsParams = kwiVar.b;
                ctf0 ctf0Var3 = kwiVar.c;
                gii0 gii0Var = kwiVar.d;
                reu reuVar2 = new reu(new epi0(new pmi0(gii0Var, (byte) 25), b2), (byte) 20);
                mne mneVarH4 = ((psc) cadVar.b).h();
                x1x.x(mneVarH4);
                uzc uzcVarA = ((cih) kwiVar.e.b).a();
                dpi0 dpi0Var = new dpi0(gii0Var, (byte) 19);
                cyu cyuVar = new cyu((byte) 24);
                knf0 knf0Var = kwiVar.f;
                u8u u8uVar = new u8u((Object) uzcVarA, (Object) new ouu(dpi0Var, cyuVar, knf0Var), (byte) 14);
                rtu rtuVar = kwiVar.g;
                ugf0 ugf0Var = kwiVar.h;
                luu luuVarW = ((daf) ugf0Var.f35622a).w();
                x1x.x(luuVarW);
                v7i v7iVarK = ((gbi) kwiVar.i.f20589a).k();
                xfu xfuVar = new xfu(new ouu(new dpi0(gii0Var, (byte) 19), new cyu((byte) 24), knf0Var));
                pru pruVar = kwiVar.j;
                xzp xzpVar = new xzp(mneVarH4, u8uVar, rtuVar, luuVarW, v7iVarK, xfuVar, pruVar);
                gvu gvuVarT = kwiVar.k.t();
                x1x.x(gvuVarT);
                svu svuVarA = kwiVar.l.a();
                x1x.x(svuVarA);
                bzt bztVar = kwiVar.m;
                pyg pygVar = kwiVar.n;
                vqc vqcVarI = pygVar.i();
                hjd hjdVarA = kwiVar.o.a();
                x1x.x(hjdVarA);
                luu luuVarW2 = ((daf) ugf0Var.f35622a).w();
                x1x.x(luuVarW2);
                lbu lbuVar = kwiVar.p;
                g2v g2vVar = kwiVar.q;
                y78 y78Var = kwiVar.r;
                wiu wiuVar = kwiVar.s;
                roi0 roi0Var = kwiVar.t;
                pv00 pv00VarT = ((daf) roi0Var.f30839a).t();
                i1w0 i1w0Var = kwiVar.u;
                gr00 gr00VarS = ((gr00) kwiVar.v.b).s();
                zfm0 zfm0VarZ = ((daf) roi0Var.f30839a).Z();
                r9u r9uVarC = ((xzp) kwiVar.w.b).C();
                m1e m1eVar = kwiVar.x;
                hzg hzgVarA2 = pygVar.a();
                x1x.x(hzgVarA2);
                poq0 poq0Var = kwiVar.y;
                qah qahVarG = ((v7i) kwiVar.z.b).g();
                x1x.x(qahVarG);
                fzt fztVar = new fzt(qahVarG);
                ucb0 ucb0VarF = pygVar.f();
                x1x.x(ucb0VarF);
                return new wbp0(mneVarH3, teamDetailsParams, ctf0Var3, reuVar2, xzpVar, gvuVarT, svuVarA, pruVar, bztVar, vqcVarI, hjdVarA, luuVarW2, lbuVar, g2vVar, y78Var, wiuVar, pv00VarT, i1w0Var, gr00VarS, zfm0VarZ, r9uVarC, m1eVar, hzgVarA2, poq0Var, new ieu((Object) fztVar, (Object) new reu(ucb0VarF, (byte) 10), (byte) 11));
            case 6:
                lwi lwiVar = (lwi) obj;
                TeamDetailsResultsParams teamDetailsResultsParams = lwiVar.f20765a;
                mne mneVarH5 = ((psc) lwiVar.b.b).h();
                x1x.x(mneVarH5);
                g2v g2vVar2 = lwiVar.c;
                ctf0 ctf0Var4 = lwiVar.d;
                i1w0 i1w0Var2 = lwiVar.e;
                m1e m1eVar2 = lwiVar.f;
                xfu xfuVar2 = new xfu(new ouu(new dpi0(lwiVar.g, (byte) 19), new cyu((byte) 24), lwiVar.h));
                roi0 roi0Var2 = lwiVar.i;
                return new zap0(teamDetailsResultsParams, mneVarH5, g2vVar2, ctf0Var4, i1w0Var2, m1eVar2, xfuVar2, ((daf) roi0Var2.f30839a).t(), ((gr00) lwiVar.j.b).s(), ((daf) roi0Var2.f30839a).Z(), lwiVar.k, lwiVar.l, ((xzp) lwiVar.m.b).C());
            case 7:
                ru ruVar = (ru) obj;
                m1e m1eVar3 = (m1e) ruVar.h;
                cad cadVar2 = (cad) ruVar.f31100a;
                mne mneVarH6 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH6);
                ocl oclVar = (ocl) ruVar.c;
                duj dujVar = (duj) ruVar.b;
                trm0 trm0Var = new trm0((gii0) ruVar.d, (byte) 3);
                mne mneVarH7 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH7);
                return new rhp0(m1eVar3, mneVarH6, oclVar, dujVar, new hnu(new z220(trm0Var, mneVarH7, (knf0) ruVar.e, (kuy) ruVar.f)), (String) ruVar.g, (i1w0) ruVar.i);
            case 8:
                return new nwi(this);
            case 9:
                return new owi(this);
            case 10:
                h6i h6iVar = (h6i) obj;
                String str = (String) h6iVar.d;
                long jLongValue = ((Long) h6iVar.b).longValue();
                cad cadVar3 = (cad) h6iVar.f;
                mne mneVarH8 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH8);
                afm0 afm0Var = new afm0((gii0) h6iVar.g, (byte) 4);
                knf0 knf0Var2 = (knf0) h6iVar.h;
                knf0Var2.getClass();
                gxu gxuVar = new gxu();
                gxuVar.f12096a = mneVarH8;
                gxuVar.b = afm0Var;
                gxuVar.c = knf0Var2;
                yfu yfuVar = new yfu(gxuVar);
                m1e m1eVar4 = (m1e) h6iVar.e;
                ocl oclVar2 = (ocl) h6iVar.i;
                duj dujVar2 = (duj) h6iVar.j;
                mne mneVarH9 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH9);
                uyu uyuVar = (uyu) h6iVar.k;
                wyu wyuVar = (wyu) h6iVar.l;
                i1w0 i1w0Var3 = (i1w0) h6iVar.m;
                pmi0 pmi0Var = (pmi0) h6iVar.n;
                nfm0 nfm0VarA = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA);
                weu weuVar = new weu(nfm0VarA, (byte) 0);
                nfm0 nfm0VarA2 = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA2);
                return new zop0(str, jLongValue, yfuVar, m1eVar4, oclVar2, dujVar2, mneVarH9, uyuVar, wyuVar, i1w0Var3, weuVar, new jwu(nfm0VarA2, (byte) 2), new qzt((pru) h6iVar.o, (byte) 0), (ctf0) h6iVar.f12530a, ((daf) pmi0Var.f27236a).r(), ((daf) pmi0Var.f27236a).s(), (r9u) h6iVar.p);
            case 11:
                h6i h6iVar2 = (h6i) obj;
                fck0 fck0Var = new fck0((gii0) h6iVar2.d, (byte) 7);
                cad cadVar4 = (cad) h6iVar2.b;
                mne mneVarH10 = ((psc) cadVar4.b).h();
                x1x.x(mneVarH10);
                knf0 knf0Var3 = (knf0) h6iVar2.f;
                knf0Var3.getClass();
                gxu gxuVar2 = new gxu();
                gxuVar2.f12096a = fck0Var;
                gxuVar2.b = mneVarH10;
                gxuVar2.c = knf0Var3;
                xsu xsuVar = new xsu(gxuVar2);
                m1e m1eVar5 = (m1e) h6iVar2.e;
                ocl oclVar3 = (ocl) h6iVar2.g;
                String str2 = (String) h6iVar2.h;
                long jLongValue2 = ((Long) h6iVar2.i).longValue();
                duj dujVar3 = (duj) h6iVar2.j;
                uyu uyuVar2 = (uyu) h6iVar2.k;
                mne mneVarH11 = ((psc) cadVar4.b).h();
                x1x.x(mneVarH11);
                pmi0 pmi0Var2 = (pmi0) h6iVar2.l;
                f7u f7uVarS = ((daf) pmi0Var2.f27236a).s();
                nfm0 nfm0VarA3 = ((daf) pmi0Var2.f27236a).A();
                x1x.x(nfm0VarA3);
                jwu jwuVar = new jwu(nfm0VarA3, (byte) 2);
                nfm0 nfm0VarA4 = ((daf) pmi0Var2.f27236a).A();
                x1x.x(nfm0VarA4);
                return new o6p0(xsuVar, m1eVar5, oclVar3, str2, jLongValue2, dujVar3, uyuVar2, mneVarH11, f7uVarS, jwuVar, new weu(nfm0VarA4, (byte) 0), (qzt) h6iVar2.m, (ctf0) h6iVar2.f12530a, ((daf) pmi0Var2.f27236a).r(), (wyu) h6iVar2.n, (i1w0) h6iVar2.o, (r9u) h6iVar2.p);
            case 12:
                return new rwi(this);
            case 13:
                return new twi(this);
            case 14:
                return new ywi(this);
            case 15:
                return new axi(this);
            case 16:
                return new cxi(this);
            case 17:
                return new nbq0((List) ((chf0) obj).b);
            case 18:
                rrd rrdVar = (rrd) obj;
                return new fiq0((String) rrdVar.b, (nr) rrdVar.c, (zsr) rrdVar.d, (duj) rrdVar.e, (rqj0) rrdVar.f, (mne) rrdVar.g, ((w9i) ((pv00) rrdVar.h).f27640a).b());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                kki kkiVar = (kki) obj;
                dnt0 dnt0VarJ = ((oif0) ((drm0) kkiVar.e).f6568a).J();
                v6j0 v6j0Var = (v6j0) kkiVar.b;
                xyu xyuVar = new xyu(v6j0Var, (byte) 0);
                pyu pyuVar = new pyu();
                pyuVar.f27815a = xyuVar;
                return new nlq0(dnt0VarJ, pyuVar, new usd(), (wyu) kkiVar.c, new xyu(v6j0Var, (byte) 0), new yyu(v6j0Var, (byte) 2), new xyu(v6j0Var, (byte) 2), ((Boolean) kkiVar.d).booleanValue());
            case 20:
                return new ixi(this);
            case 21:
                jxi jxiVar = (jxi) obj;
                return new khb0(jxiVar.c, jxiVar.e, jxiVar.d);
            case 22:
                daf dafVar = (daf) obj;
                String str3 = (String) dafVar.b;
                String str4 = (String) dafVar.c;
                duj dujVar4 = (duj) dafVar.d;
                mne mneVarH12 = ((psc) ((cad) dafVar.e).b).h();
                x1x.x(mneVarH12);
                return new tpq0(str3, str4, dujVar4, mneVarH12, ((g45) ((wsf0) dafVar.f).b).G(), new xfu(new afm0(new pmi0((gii0) dafVar.g, (byte) 27), (knf0) dafVar.h, (byte) 0)), (m1e) dafVar.i, (g2v) dafVar.j, (i1w0) dafVar.k, (ctf0) dafVar.l);
            case 23:
                pwi pwiVar = (pwi) obj;
                i1w0 i1w0Var4 = (i1w0) pwiVar.f27712a;
                int iIntValue = ((Integer) pwiVar.h).intValue();
                ulr0 ulr0Var = (ulr0) pwiVar.i;
                bzu bzuVar = new bzu(new fck0(new epi0((gii0) pwiVar.b, (byte) 18), (knf0) pwiVar.c), b4);
                g2v g2vVar3 = (g2v) pwiVar.j;
                duj dujVar5 = (duj) pwiVar.d;
                ctf0 ctf0Var5 = (ctf0) pwiVar.e;
                mne mneVarH13 = ((psc) ((cad) pwiVar.f).b).h();
                x1x.x(mneVarH13);
                return new yqq0(i1w0Var4, iIntValue, ulr0Var, bzuVar, g2vVar3, dujVar5, ctf0Var5, mneVarH13, (m1e) pwiVar.g);
            case 24:
                return new mxi(this);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new pxi(this);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                nr nrVar = (nr) obj;
                mne mneVarH14 = ((psc) ((cad) nrVar.b).b).h();
                x1x.x(mneVarH14);
                return new lar0(mneVarH14, new svu(new ani0((k3r0) nrVar.c)));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                h6i h6iVar3 = (h6i) obj;
                String str5 = (String) h6iVar3.d;
                long jLongValue3 = ((Long) h6iVar3.b).longValue();
                cad cadVar5 = (cad) h6iVar3.f;
                mne mneVarH15 = ((psc) cadVar5.b).h();
                x1x.x(mneVarH15);
                hnu hnuVar = new hnu(new ouu(mneVarH15, new eyg0((gii0) h6iVar3.g, (byte) 24), (knf0) h6iVar3.h));
                m1e m1eVar6 = (m1e) h6iVar3.e;
                ocl oclVar4 = (ocl) h6iVar3.i;
                duj dujVar6 = (duj) h6iVar3.j;
                mne mneVarH16 = ((psc) cadVar5.b).h();
                x1x.x(mneVarH16);
                uyu uyuVar3 = (uyu) h6iVar3.k;
                wyu wyuVar2 = (wyu) h6iVar3.l;
                i1w0 i1w0Var5 = (i1w0) h6iVar3.m;
                pmi0 pmi0Var3 = (pmi0) h6iVar3.n;
                nfm0 nfm0VarA5 = ((daf) pmi0Var3.f27236a).A();
                x1x.x(nfm0VarA5);
                weu weuVar2 = new weu(nfm0VarA5, (byte) 0);
                nfm0 nfm0VarA6 = ((daf) pmi0Var3.f27236a).A();
                x1x.x(nfm0VarA6);
                return new scr0(str5, jLongValue3, hnuVar, m1eVar6, oclVar4, dujVar6, mneVarH16, uyuVar3, wyuVar2, i1w0Var5, weuVar2, new jwu(nfm0VarA6, (byte) 2), (qzt) h6iVar3.o, (ctf0) h6iVar3.f12530a, ((daf) pmi0Var3.f27236a).r(), ((daf) pmi0Var3.f27236a).s(), (r9u) h6iVar3.p);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                h6i h6iVar4 = (h6i) obj;
                String str6 = (String) h6iVar4.d;
                long jLongValue4 = ((Long) h6iVar4.b).longValue();
                cad cadVar6 = (cad) h6iVar4.f;
                mne mneVarH17 = ((psc) cadVar6.b).h();
                x1x.x(mneVarH17);
                yfu yfuVar2 = new yfu(new y3v(mneVarH17, new ljf0((gii0) h6iVar4.g, (byte) 29), (knf0) h6iVar4.h));
                m1e m1eVar7 = (m1e) h6iVar4.e;
                ocl oclVar5 = (ocl) h6iVar4.i;
                duj dujVar7 = (duj) h6iVar4.j;
                mne mneVarH18 = ((psc) cadVar6.b).h();
                x1x.x(mneVarH18);
                uyu uyuVar4 = (uyu) h6iVar4.k;
                wyu wyuVar3 = (wyu) h6iVar4.l;
                i1w0 i1w0Var6 = (i1w0) h6iVar4.m;
                pmi0 pmi0Var4 = (pmi0) h6iVar4.n;
                nfm0 nfm0VarA7 = ((daf) pmi0Var4.f27236a).A();
                x1x.x(nfm0VarA7);
                weu weuVar3 = new weu(nfm0VarA7, (byte) 0);
                nfm0 nfm0VarA8 = ((daf) pmi0Var4.f27236a).A();
                x1x.x(nfm0VarA8);
                return new ecr0(str6, jLongValue4, yfuVar2, m1eVar7, oclVar5, dujVar7, mneVarH18, uyuVar4, wyuVar3, i1w0Var6, weuVar3, new jwu(nfm0VarA8, (byte) 2), new qzt((pru) h6iVar4.o, (byte) 0), (ctf0) h6iVar4.f12530a, ((daf) pmi0Var4.f27236a).r(), ((daf) pmi0Var4.f27236a).s(), (r9u) h6iVar4.p);
            default:
                v5i v5iVar = (v5i) obj;
                m1e m1eVar8 = (m1e) v5iVar.e;
                mne mneVarH19 = ((psc) ((cad) v5iVar.o).b).h();
                x1x.x(mneVarH19);
                i1w0 i1w0Var7 = (i1w0) v5iVar.f;
                ocl oclVar6 = (ocl) v5iVar.g;
                yk00 yk00Var = new yk00(v5iVar.m());
                wsf0 wsf0Var = (wsf0) v5iVar.m;
                khf0 khf0VarG = ((g45) wsf0Var.b).G();
                f6k f6kVarL = ((g45) wsf0Var.b).l();
                yk00 yk00Var2 = new yk00(v5iVar.m());
                ctu ctuVar = new ctu(v5iVar.m());
                ctu ctuVar2 = new ctu(v5iVar.m());
                g2v g2vVar4 = new g2v(v5iVar.m());
                gkr0 gkr0Var = (gkr0) v5iVar.j;
                sd80 sd80Var = (sd80) v5iVar.k;
                bzu bzuVar2 = new bzu(new g090(gkr0Var, sd80Var), b3);
                iw20 iw20Var = (iw20) v5iVar.n;
                pru pruVarR = ((uii) iw20Var.f15470a).r();
                xsu xsuVar2 = new xsu(new g090(gkr0Var, sd80Var));
                reu reuVar3 = new reu(new g090(gkr0Var, sd80Var), (byte) 21);
                btu btuVar = new btu(new g090(gkr0Var, sd80Var));
                btu btuVar2 = new btu(new g090(gkr0Var, sd80Var));
                w4p0 w4p0Var = new w4p0((Object) v5iVar.m(), (byte) 12);
                usc uscVar = new usc(v5iVar.m());
                zqc zqcVar = new zqc(v5iVar.m());
                nhf0 nhf0Var = new nhf0(new usc(v5iVar.m()), new tqt(new bst(), new tqt(), new art()), new ctu(v5iVar.m()), new ctu(v5iVar.m()));
                hru hruVar = new hru(v5iVar.m());
                pyu pyuVar2 = new pyu(v5iVar.m());
                cyu cyuVar2 = new cyu(new usc(v5iVar.m()), new yfu(v5iVar.m()), new hru(v5iVar.m()));
                g2v g2vVar5 = new g2v(((g45) wsf0Var.b).y());
                nou nouVarE = ((g45) wsf0Var.b).E();
                ctf0 ctf0Var6 = (ctf0) v5iVar.b;
                duj dujVar8 = (duj) v5iVar.c;
                ouu ouuVar = (ouu) v5iVar.p;
                r8i r8iVarD = ((poq0) v5iVar.q).f27342a.d();
                xex xexVarG = ((g45) wsf0Var.b).g();
                zpu zpuVar = new zpu((rou) v5iVar.r, new bzu(new yuu(new w4p0((gii0) v5iVar.i, (byte) 3), (dlr0) v5iVar.s, (knf0) v5iVar.l), (byte) 25), (byte) 18);
                zqc zqcVar2 = new zqc(v5iVar.m());
                wyu wyuVar4 = (wyu) v5iVar.t;
                lk5 lk5Var = new lk5(((uii) iw20Var.f15470a).r(), (r9u) v5iVar.u, (byte) 3);
                fvt0 fvt0Var = (fvt0) v5iVar.d;
                return new fir0(m1eVar8, mneVarH19, i1w0Var7, oclVar6, yk00Var, khf0VarG, f6kVarL, yk00Var2, ctuVar, ctuVar2, g2vVar4, bzuVar2, pruVarR, xsuVar2, reuVar3, btuVar, btuVar2, w4p0Var, uscVar, zqcVar, nhf0Var, hruVar, pyuVar2, cyuVar2, g2vVar5, nouVarE, ctf0Var6, dujVar8, ouuVar, r8iVarD, xexVarG, zpuVar, zqcVar2, wyuVar4, lk5Var, ((o3c) fvt0Var.f10231a).w(), ((o3c) fvt0Var.f10231a).a());
        }
    }
}
