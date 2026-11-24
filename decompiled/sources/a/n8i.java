package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import org.xplatform.sportgame.bets_on_players.api.navigation.BetsOnPlayersScreenParams;
import org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.params.BonusAccountScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class n8i implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23089a;
    public final Object b;

    public /* synthetic */ n8i(Object obj, byte b) {
        this.f23089a = b;
        this.b = obj;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f23089a;
        byte b2 = 1;
        byte b3 = 3;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new m8i(this);
            case 1:
                gr00 gr00Var = (gr00) obj;
                return new m64(((Boolean) gr00Var.f11760a).booleanValue(), new pek(), new tqt(), (pru) gr00Var.b, ((uii) ((yox) gr00Var.c).f43005a).j(), (ctf0) gr00Var.d);
            case 2:
                daf dafVar = (daf) obj;
                mq4 mq4Var = (mq4) dafVar.b;
                sp4 sp4Var = (sp4) dafVar.c;
                ts4 ts4VarX = sp4Var.f32574a.x();
                rou rouVar = (rou) dafVar.d;
                return new kp4(mq4Var, new fnk(ts4VarX, rouVar), sp4Var.f32574a.q(), new jnk(sp4Var.f32574a.x(), rouVar), new rek0((byte) 28), new dkj(sp4Var.f32574a.x()), (ctf0) dafVar.e, (pmi0) dafVar.f, (i1w0) dafVar.g, new yo4((kt2) dafVar.h, (byte) 0), ((d1p) dafVar.i).w(), (duj) dafVar.j, (mne) dafVar.k, (g2v) dafVar.l);
            case 3:
                qv2 qv2Var = (qv2) obj;
                h03 h03Var = new h03((gii0) qv2Var.b, (byte) 12);
                knf0 knf0Var = (knf0) qv2Var.c;
                btt0 btt0Var = (btt0) qv2Var.d;
                cad cadVar = (cad) qv2Var.e;
                mne mneVarH = ((psc) cadVar.b).h();
                x1x.x(mneVarH);
                ocl oclVar = new ocl(new nhf0(h03Var, knf0Var, btt0Var, mneVarH));
                lef0 lef0Var = (lef0) qv2Var.f;
                jof0 jof0Var = new jof0(((gbi) lef0Var.f19899a).K());
                tsu tsuVar = new tsu(((gbi) lef0Var.f19899a).K());
                m1e m1eVar = (m1e) qv2Var.g;
                s31 s31Var = new s31((kt2) qv2Var.h, (byte) 3);
                g2v g2vVar = (g2v) qv2Var.i;
                ctf0 ctf0Var = (ctf0) qv2Var.j;
                mne mneVarH2 = ((psc) cadVar.b).h();
                x1x.x(mneVarH2);
                return new l94(oclVar, jof0Var, tsuVar, m1eVar, s31Var, g2vVar, ctf0Var, mneVarH2, ((d1p) qv2Var.k).q0(), (i1w0) qv2Var.l, (duj) qv2Var.m);
            case 4:
                return new t8i(this);
            case 5:
                gr00 gr00Var2 = (gr00) obj;
                mne mneVarH3 = ((psc) ((cad) gr00Var2.f11760a).b).h();
                x1x.x(mneVarH3);
                return new mg4(mneVarH3, (i1w0) gr00Var2.b, (kf4) gr00Var2.c, (jqt) gr00Var2.d);
            case 6:
                g45 g45Var = (g45) obj;
                wyu wyuVar = (wyu) g45Var.f10647a;
                uyu uyuVar = (uyu) g45Var.b;
                kt2 kt2Var = (kt2) g45Var.c;
                i1w0 i1w0Var = (i1w0) g45Var.d;
                duj dujVar = (duj) g45Var.e;
                mne mneVarH4 = ((psc) ((cad) g45Var.f).b).h();
                x1x.x(mneVarH4);
                return new hl4(wyuVar, uyuVar, kt2Var, i1w0Var, dujVar, mneVarH4, ((d1p) g45Var.g).u(), (pru) g45Var.h);
            case 7:
                ru ruVar = (ru) obj;
                iqi iqiVar = new iqi((v6j0) ruVar.f31100a, (yk50) ruVar.c);
                kt2 kt2Var2 = (kt2) ruVar.d;
                i1w0 i1w0Var2 = (i1w0) ruVar.e;
                duj dujVar2 = (duj) ruVar.b;
                mne mneVarH5 = ((psc) ((cad) ruVar.f).b).h();
                x1x.x(mneVarH5);
                return new il4(iqiVar, kt2Var2, i1w0Var2, dujVar2, mneVarH5, ((d1p) ruVar.g).u(), new kc60((gst0) ruVar.h), (pru) ruVar.i);
            case 8:
                return new x8i(this);
            case 9:
                return new y8i(this);
            case 10:
                return new a9i(this);
            case 11:
                return new c9i(this);
            case 12:
                return new e9i(this);
            case 13:
                g9i g9iVar = (g9i) obj;
                return new gr4(g9iVar.f10914a, g9iVar.b, g9iVar.c.w(), g9iVar.d);
            case 14:
                return new h9i(this);
            case 15:
                return new q9i(this);
            case 16:
                return new r9i(this);
            case 17:
                return new t9i(this);
            case 18:
                w9i w9iVar = (w9i) obj;
                drm0 drm0Var = w9iVar.f38781a;
                reu reuVarJ = ((ali) drm0Var.f6568a).j();
                pru pruVar = (pru) w9iVar.d;
                wsf0 wsf0Var = w9iVar.c;
                b8u b8uVarY = ((g45) wsf0Var.b).Y();
                f6k f6kVarL = ((g45) wsf0Var.b).l();
                u4a u4aVarF = ((g45) wsf0Var.b).f();
                m0u m0uVarT = ((g45) wsf0Var.b).t();
                lbu lbuVar = (lbu) w9iVar.e;
                q4u q4uVar = (q4u) w9iVar.f;
                iqt iqtVar = (iqt) w9iVar.g;
                usu usuVar = new usu(w9iVar.a());
                yfu yfuVar = new yfu(w9iVar.a());
                rxu rxuVarI = ((ali) drm0Var.f6568a).i();
                pyu pyuVarS = ((ali) drm0Var.f6568a).s();
                hru hruVarK = ((ali) drm0Var.f6568a).k();
                x0u x0uVar = (x0u) w9iVar.n;
                rou rouVar2 = (rou) w9iVar.o;
                wyu wyuVar2 = (wyu) w9iVar.p;
                khf0 khf0VarG = ((g45) wsf0Var.b).G();
                nvu nvuVarM0 = ((g45) wsf0Var.b).m0();
                trm0 trm0VarS = wsf0Var.s();
                drt drtVarC = w9iVar.c();
                lk5 lk5VarI = ((o3c) ((bzu) w9iVar.q).b).i();
                dq00 dq00Var = new dq00((gii0) w9iVar.h, (byte) 3);
                knf0 knf0Var2 = (knf0) w9iVar.j;
                btt0 btt0Var2 = (btt0) w9iVar.m;
                cad cadVar2 = (cad) w9iVar.l;
                mne mneVarH6 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH6);
                dgu dguVar = new dgu(dq00Var, knf0Var2, btt0Var2, mneVarH6);
                fvt0 fvt0Var = (fvt0) w9iVar.r;
                ieu ieuVar = new ieu((Object) dguVar, (Object) ((o3c) fvt0Var.f10231a).f(), (byte) 3);
                x1u x1uVar = (x1u) w9iVar.s;
                o2j0 o2j0Var = w9iVar.b;
                f7u f7uVar = new f7u((Object) ieuVar, (Object) x1uVar, (Object) o2j0Var.a(), (Object) w9iVar.c(), (byte) 8);
                so6 so6VarA = w9iVar.a();
                vyt vytVarA = o2j0Var.a();
                ort ortVar = (ort) w9iVar.t;
                zlt0 zlt0Var = (zlt0) w9iVar.u;
                nw20 nw20VarD = ((iip) w9iVar.v).d();
                g45 g45Var2 = (g45) wsf0Var.b;
                pwi pwiVar = new pwi(so6VarA, vytVarA, ortVar, zlt0Var, nw20VarD, g45Var2.y(), wsf0Var.a(), g45Var2.q(), g45Var2.G(), wsf0Var.b(), ((o3c) fvt0Var.f10231a).f());
                v88 v88Var = (v88) w9iVar.w;
                au0 au0Var = (au0) w9iVar.x;
                buo0 buo0Var = (buo0) w9iVar.y;
                bn6 bn6Var = (bn6) w9iVar.z;
                pyu pyuVar = (pyu) w9iVar.A;
                rqt rqtVar = (rqt) w9iVar.B;
                zri zriVar = (zri) w9iVar.C;
                ih5 ih5Var = (ih5) w9iVar.D;
                ih5 ih5Var2 = (ih5) w9iVar.E;
                gg5 gg5Var = (gg5) w9iVar.F;
                l7k l7kVar = (l7k) w9iVar.G;
                m1e m1eVar2 = (m1e) w9iVar.H;
                ctf0 ctf0Var2 = (ctf0) w9iVar.I;
                duj dujVar3 = (duj) w9iVar.J;
                mne mneVarH7 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH7);
                return new dt6(reuVarJ, pruVar, b8uVarY, f6kVarL, u4aVarF, m0uVarT, lbuVar, q4uVar, iqtVar, usuVar, yfuVar, rxuVarI, pyuVarS, hruVarK, x0uVar, rouVar2, wyuVar2, khf0VarG, nvuVarM0, trm0VarS, drtVarC, lk5VarI, f7uVar, pwiVar, zlt0Var, v88Var, au0Var, buo0Var, bn6Var, pyuVar, rqtVar, zriVar, ih5Var, ih5Var2, gg5Var, l7kVar, m1eVar2, ctf0Var2, dujVar3, mneVarH7, (i1w0) w9iVar.K, (r9u) w9iVar.L, (cmt) w9iVar.M);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new x9i(this);
            case 20:
                return new z9i(this);
            case 21:
                o3c o3cVar = (o3c) obj;
                String str = (String) o3cVar.f24576a;
                String str2 = (String) o3cVar.b;
                double dDoubleValue = ((Double) o3cVar.c).doubleValue();
                z7u z7uVar = new z7u((edo) o3cVar.d, (byte) 1);
                mne mneVarH8 = ((psc) ((cad) o3cVar.e).b).h();
                x1x.x(mneVarH8);
                vjp vjpVar = (vjp) o3cVar.f;
                b8u b8uVar = (b8u) o3cVar.g;
                ryu ryuVar = new ryu(new owp0((fme) o3cVar.h));
                luu luuVarW = ((daf) ((ugf0) o3cVar.i).f35622a).w();
                x1x.x(luuVarW);
                return new zj7(str, str2, dDoubleValue, z7uVar, mneVarH8, vjpVar, b8uVar, ryuVar, luuVarW, (ctf0) o3cVar.j);
            case 22:
                dai daiVar = (dai) obj;
                BetsOnPlayersScreenParams betsOnPlayersScreenParams = daiVar.b;
                i1w0 i1w0Var3 = daiVar.c;
                mne mneVarH9 = ((psc) daiVar.d.b).h();
                x1x.x(mneVarH9);
                ctf0 ctf0Var3 = daiVar.e;
                m1e m1eVar3 = daiVar.f;
                eai eaiVar = daiVar.g;
                eu7 eu7Var = (eu7) eaiVar.h.get();
                x1x.x(eu7Var);
                wti wtiVar = new wti(eu7Var, daiVar.h);
                pmi pmiVar = daiVar.i;
                ntu ntuVar = daiVar.j;
                cai caiVar = daiVar.k;
                zsu zsuVar = (zsu) caiVar.j.get();
                x1x.x(zsuVar);
                ntt nttVarJ = daiVar.l.j();
                x1x.x(nttVarJ);
                b8h0 b8h0VarA = eaiVar.a();
                x1x.x(b8h0VarA);
                hru hruVar = new hru(b8h0VarA);
                b8h0 b8h0VarA2 = eaiVar.a();
                x1x.x(b8h0VarA2);
                oif0 oif0Var = new oif0(nttVarJ, hruVar, new eyg0((Object) b8h0VarA2, (byte) 16), (byte) 29);
                uga0 uga0Var = (uga0) caiVar.d.get();
                x1x.x(uga0Var);
                hqp0 hqp0Var = (hqp0) eaiVar.i.get();
                x1x.x(hqp0Var);
                ehf0 ehf0Var = new ehf0(uga0Var, hqp0Var, (byte) 19);
                hqp0 hqp0Var2 = (hqp0) eaiVar.i.get();
                x1x.x(hqp0Var2);
                zas0 zas0Var = new zas0(hqp0Var2, (byte) 4);
                pru pruVar2 = daiVar.m;
                hqp0 hqp0Var3 = (hqp0) eaiVar.i.get();
                x1x.x(hqp0Var3);
                b8h0 b8h0VarA3 = eaiVar.a();
                x1x.x(b8h0VarA3);
                abu abuVar = new abu(hqp0Var3, b8h0VarA3, (byte) 10);
                b8h0 b8h0VarA4 = eaiVar.a();
                x1x.x(b8h0VarA4);
                jru jruVar = new jru((Object) b8h0VarA4, (byte) 3);
                b8h0 b8h0VarA5 = eaiVar.a();
                x1x.x(b8h0VarA5);
                return new tu7(betsOnPlayersScreenParams, i1w0Var3, mneVarH9, ctf0Var3, m1eVar3, wtiVar, pmiVar, ntuVar, zsuVar, oif0Var, ehf0Var, zas0Var, pruVar2, abuVar, jruVar, new ugf0(b8h0VarA5), daiVar.n, new qu(daiVar.o, (byte) 2), daiVar.p);
            case 23:
                return new fai(this);
            case 24:
                return new hai(this);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                nhf0 nhf0Var = (nhf0) obj;
                y58 y58Var = (y58) nhf0Var.f23530a;
                dbu dbuVarE = y58Var.e();
                x1x.x(dbuVarE);
                krc krcVarM = y58Var.m();
                x1x.x(krcVarM);
                gu00 gu00VarL = y58Var.l();
                x1x.x(gu00VarL);
                myg0 myg0VarD = y58Var.d();
                x1x.x(myg0VarD);
                pmi0 pmi0VarA = y58Var.a();
                x1x.x(pmi0VarA);
                zpu zpuVarF = y58Var.f();
                x1x.x(zpuVarF);
                i1w0 i1w0Var4 = (i1w0) nhf0Var.b;
                bh3 bh3VarI = ((eg3) nhf0Var.c).i();
                x1x.x(bh3VarI);
                return new j68(dbuVarE, krcVarM, gu00VarL, myg0VarD, pmi0VarA, zpuVarF, i1w0Var4, bh3VarI);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                mii0 mii0Var = (mii0) obj;
                BonusAccountScreenParams bonusAccountScreenParams = (BonusAccountScreenParams) mii0Var.b;
                ctf0 ctf0Var4 = (ctf0) mii0Var.c;
                mne mneVarH10 = ((psc) ((cad) mii0Var.d).b).h();
                x1x.x(mneVarH10);
                ctf0Var4.getClass();
                vb8 vb8Var = new vb8(bonusAccountScreenParams, b2);
                ep4 ep4Var = new ep4(ctf0Var4, b3);
                rwj rwjVar = mneVarH10.f22085a;
                return new ec8(null, vb8Var, ep4Var, cvm0.p(rwjVar, rwjVar), null);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new kai(this);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new lai(this);
            default:
                rrd rrdVar = (rrd) obj;
                duj dujVar4 = (duj) rrdVar.b;
                oeg0 oeg0Var = (oeg0) rrdVar.c;
                ctf0 ctf0Var5 = (ctf0) rrdVar.d;
                mne mneVarH11 = ((psc) ((cad) rrdVar.e).b).h();
                x1x.x(mneVarH11);
                bzt bztVar = (bzt) rrdVar.f;
                gw8 gw8Var = (gw8) rrdVar.g;
                hut hutVar = new hut(new do20(gw8Var));
                ehf0 ehf0Var2 = (ehf0) rrdVar.h;
                jr0 jr0VarH = ((i7i) ehf0Var2.b).h();
                x1x.x(jr0VarH);
                xoc xocVar = new xoc(jr0VarH, false);
                jr0 jr0VarH2 = ((i7i) ehf0Var2.b).h();
                x1x.x(jr0VarH2);
                return new pw8(dujVar4, oeg0Var, ctf0Var5, mneVarH11, bztVar, hutVar, xocVar, new fuu(jr0VarH2), new hut(new do20(gw8Var)), new gut(new do20(gw8Var)));
        }
    }
}
