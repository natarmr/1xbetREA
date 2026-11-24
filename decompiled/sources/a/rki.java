package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigDecimal;
import kotlin.Pair;
import org.xplatform.market_statistic.api.presentation.MarketStatisticParams;

/* JADX INFO: loaded from: classes3.dex */
public final class rki implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30650a;
    public final Object b;

    public /* synthetic */ rki(Object obj, byte b) {
        this.f30650a = b;
        this.b = obj;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f30650a;
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new qki(this);
            case 1:
                return new ski(this);
            case 2:
                return new uki(this);
            case 3:
                mci mciVar = (mci) obj;
                MarketStatisticParams marketStatisticParams = (MarketStatisticParams) mciVar.c;
                vqc vqcVar = (vqc) mciVar.d;
                k7u k7uVarC = ((cih) vqcVar.b).c();
                pru pruVar = (pru) mciVar.f;
                cad cadVar = (cad) mciVar.b;
                mne mneVarH = ((psc) cadVar.b).h();
                x1x.x(mneVarH);
                i1w0 i1w0Var = (i1w0) mciVar.e;
                g2v g2vVar = (g2v) mciVar.h;
                m1e m1eVar = (m1e) mciVar.j;
                ctf0 ctf0Var = (ctf0) mciVar.f21553a;
                sqt sqtVar = new sqt();
                y3v y3vVarJ = mciVar.j();
                x0u x0uVar = (x0u) mciVar.l;
                u8u u8uVar = new u8u((Object) y3vVarJ, (Object) x0uVar, (byte) 13);
                qvt qvtVar = new qvt(mciVar.j());
                qvt qvtVar2 = new qvt(mciVar.j());
                gst0 gst0Var = (gst0) mciVar.m;
                x4v x4vVar = new x4v(gst0Var, (byte) 1);
                xyt xytVar = new xyt(((cih) vqcVar.b).a());
                ieu ieuVar = (ieu) mciVar.n;
                rou rouVar = (rou) mciVar.o;
                rrd rrdVar = new rrd((Object) u8uVar, (Object) qvtVar, (Object) qvtVar2, (Object) x4vVar, (Object) xytVar, (Object) ieuVar, (Object) rouVar, (Object) new x4v(gst0Var, (byte) 0), (byte) 29);
                rrd rrdVar2 = new rrd((Object) new edu((Object) mciVar.j(), (Object) x0uVar, (byte) 11), (Object) new pvt(mciVar.j()), (Object) new pvt(mciVar.j()), (Object) new r4v(gst0Var, (byte) 3), (Object) new xyt(((cih) vqcVar.b).a()), (Object) ieuVar, (Object) rouVar, (Object) new x4v(gst0Var, (byte) 0), (byte) 28);
                j1q0 j1q0Var = (j1q0) mciVar.p;
                ou9 ou9Var = new ou9(j1q0Var, (byte) 1);
                yiu yiuVar = new yiu(j1q0Var, (byte) 0);
                zfo zfoVar = (zfo) mciVar.q;
                mne mneVarH2 = ((psc) cadVar.b).h();
                x1x.x(mneVarH2);
                return new dy20(marketStatisticParams, k7uVarC, pruVar, mneVarH, i1w0Var, g2vVar, m1eVar, ctf0Var, sqtVar, rrdVar, rrdVar2, ou9Var, yiuVar, new wti(zfoVar, mneVarH2));
            case 4:
                dli dliVar = (dli) obj;
                i1w0 i1w0Var2 = dliVar.b;
                mne mneVarH3 = ((psc) dliVar.c.b).h();
                x1x.x(mneVarH3);
                ctf0 ctf0Var2 = dliVar.d;
                v230 v230Var = dliVar.e;
                zru zruVar = new zru(new pyu(v230Var));
                art artVar = new art();
                zru zruVar2 = new zru(new pyu(v230Var));
                h03 h03Var = new h03((Object) new pyu(v230Var), (byte) 29);
                zfo zfoVar2 = dliVar.f;
                edo edoVar = dliVar.g;
                zfoVar2.getClass();
                edoVar.getClass();
                g45 g45Var = new g45();
                g45Var.f10647a = zfoVar2;
                g45Var.b = edoVar;
                g45Var.c = cui0.b(11L);
                g45Var.d = cui0.b(1315L);
                g45Var.e = xp20.f(new Pair(1L, q3d.j(1L, 2L, 3L)), new Pair(1007L, q3d.j(9L, 10L, 11L, 12L)), new Pair(2L, q3d.j(4L, 5L, 6L)), new Pair(11L, q3d.j(388L, 389L, 390L)), new Pair(3815L, q3d.j(14677L, 12098L, 12055L)), new Pair(1315L, q3d.j(4553L, 4554L, 4555L, 4556L)));
                g45Var.f = xp20.f(new Pair(1L, xp20.f(new Pair(1L, Double.valueOf(15.6d)), new Pair(2L, Double.valueOf(9.58d)), new Pair(3L, Double.valueOf(1.11d)))), new Pair(1007L, xp20.f(new Pair(9L, Double.valueOf(3.43d)), new Pair(10L, Double.valueOf(1.288d)), new Pair(11L, Double.valueOf(8.79d)), new Pair(12L, Double.valueOf(1.064d)))), new Pair(2L, xp20.f(new Pair(4L, Double.valueOf(11.1d)), new Pair(5L, Double.valueOf(1.001d)), new Pair(6L, Double.valueOf(1.001d)))), new Pair(11L, xp20.f(new Pair(388L, Double.valueOf(3.74d)), new Pair(389L, Double.valueOf(8.25d)), new Pair(390L, Double.valueOf(1.445d)))), new Pair(3815L, xp20.f(new Pair(14677L, Double.valueOf(2.2d)), new Pair(12098L, Double.valueOf(3.6d)), new Pair(12055L, Double.valueOf(2.275d)))), new Pair(1315L, xp20.f(new Pair(4553L, Double.valueOf(2.625d)), new Pair(4554L, Double.valueOf(3.25d)), new Pair(4555L, Double.valueOf(4.0d)), new Pair(4556L, Double.valueOf(2.625d)))));
                g45Var.g = wp20.b(new Pair(2L, tx3.l0(new Long[]{5L, 6L})));
                fao faoVar = fao.b;
                Pair pair = new Pair(9L, faoVar);
                fao faoVar2 = fao.c;
                g45Var.h = xp20.f(new Pair(1007L, xp20.f(pair, new Pair(10L, faoVar2))), new Pair(11L, xp20.f(new Pair(388L, faoVar), new Pair(389L, faoVar), new Pair(390L, faoVar2))));
                g45Var.i = xp20.f(new Pair(1007L, xp20.f(new Pair(9L, new BigDecimal("3.75")), new Pair(10L, new BigDecimal("3.75")), new Pair(11L, new BigDecimal("4.25")), new Pair(12L, new BigDecimal("4.25")))), new Pair(11L, xp20.f(new Pair(388L, new BigDecimal("4")), new Pair(389L, new BigDecimal("4")), new Pair(390L, new BigDecimal("4")))), new Pair(3815L, xp20.f(new Pair(14677L, new BigDecimal("6")), new Pair(12098L, new BigDecimal("600.03")), new Pair(12055L, new BigDecimal("5450.06")))), new Pair(1315L, xp20.f(new Pair(4553L, new BigDecimal("0")), new Pair(4554L, new BigDecimal("1")), new Pair(4555L, new BigDecimal("2")), new Pair(4556L, new BigDecimal("3")))));
                return new d430(i1w0Var2, mneVarH3, ctf0Var2, zruVar, artVar, zruVar2, h03Var, new lhf0(g45Var, dliVar.h, dliVar.i), dliVar.j, dliVar.k);
            case 5:
                return new eli(this);
            case 6:
                return new gli(this);
            case 7:
                g45 g45Var2 = (g45) obj;
                pcl0 pcl0Var = (pcl0) g45Var2.f10647a;
                r1u r1uVarN = pcl0Var.n();
                x1x.x(r1uVarN);
                oku okuVarB = pcl0Var.b();
                x1x.x(okuVarB);
                jtj jtjVar = new jtj((Object) r1uVarN, (Object) okuVarB, (byte) 22);
                jw20 jw20Var = (jw20) g45Var2.b;
                p430 p430VarQ = ((kki) jw20Var.b).q();
                x1x.x(p430VarQ);
                nku nkuVar = new nku(p430VarQ);
                p430 p430VarQ2 = ((kki) jw20Var.b).q();
                x1x.x(p430VarQ2);
                mqc mqcVar = new mqc(p430VarQ2);
                p430 p430VarQ3 = ((kki) jw20Var.b).q();
                x1x.x(p430VarQ3);
                zas0 zas0Var = new zas0((Object) p430VarQ3, (byte) 8);
                p430 p430VarQ4 = ((kki) jw20Var.b).q();
                x1x.x(p430VarQ4);
                ani0 ani0Var = new ani0(p430VarQ4);
                p430 p430VarQ5 = ((kki) jw20Var.b).q();
                x1x.x(p430VarQ5);
                eu90 eu90Var = new eu90(p430VarQ5);
                p430 p430VarQ6 = ((kki) jw20Var.b).q();
                x1x.x(p430VarQ6);
                mqc mqcVar2 = new mqc(p430VarQ6);
                sa10 sa10Var = (sa10) g45Var2.c;
                duj dujVar = (duj) g45Var2.d;
                s31 s31Var = (s31) g45Var2.e;
                s31 s31Var2 = new s31((kt2) g45Var2.f, (byte) 6);
                d1p d1pVar = (d1p) g45Var2.g;
                return new e730(jtjVar, nkuVar, mqcVar, zas0Var, ani0Var, eu90Var, mqcVar2, sa10Var, dujVar, s31Var, s31Var2, d1pVar.Y(), d1pVar.v0(), (mne) g45Var2.h);
            case 8:
                ywq0 ywq0Var = (ywq0) obj;
                xhi xhiVar = (xhi) ywq0Var.f43384a;
                q530 q530Var = (q530) xhiVar.T.get();
                x1x.x(q530Var);
                xvf xvfVar = new xvf(q530Var, xhiVar.d());
                q430 q430VarF = xhiVar.f();
                x1x.x(q430VarF);
                mku mkuVar = new mku(q430VarF, (byte) 0);
                q430 q430VarF2 = xhiVar.f();
                x1x.x(q430VarF2);
                nqc nqcVar = new nqc(q430VarF2);
                q430 q430VarF3 = xhiVar.f();
                x1x.x(q430VarF3);
                rkt0 rkt0Var = new rkt0(q430VarF3, b2);
                q430 q430VarF4 = xhiVar.f();
                x1x.x(q430VarF4);
                mku mkuVar2 = new mku(q430VarF4, (byte) 1);
                q430 q430VarF5 = xhiVar.f();
                x1x.x(q430VarF5);
                o470 o470Var = new o470(q430VarF5);
                q430 q430VarF6 = xhiVar.f();
                x1x.x(q430VarF6);
                return new f730(xvfVar, mkuVar, nqcVar, rkt0Var, mkuVar2, o470Var, new nqc(q430VarF6), (g2v) ywq0Var.b, (duj) ywq0Var.c, new s31((kt2) ywq0Var.d, (byte) 6), ((d1p) ywq0Var.e).Y(), (mne) ywq0Var.f);
            case 9:
                return new ili(this);
            case 10:
                return new jli(this);
            case 11:
                return new kli(this);
            case 12:
                return new lli(this);
            case 13:
                return new mli(this);
            case 14:
                return new qli(this);
            case 15:
                return new tli(this);
            case 16:
                return new vli(this);
            case 17:
                kki kkiVar = (kki) obj;
                ctf0 ctf0Var3 = (ctf0) kkiVar.e;
                mne mneVarH4 = ((psc) ((cad) kkiVar.b).b).h();
                x1x.x(mneVarH4);
                return new kn40(ctf0Var3, mneVarH4, (e1u) kkiVar.c, (i1w0) kkiVar.d);
            case 18:
                v7i v7iVar = (v7i) obj;
                String str = (String) v7iVar.i;
                long jLongValue = ((Long) v7iVar.g).longValue();
                mne mneVarH5 = ((psc) ((cad) v7iVar.h).b).h();
                x1x.x(mneVarH5);
                i1w0 i1w0Var3 = (i1w0) v7iVar.e;
                ctf0 ctf0Var4 = (ctf0) v7iVar.c;
                xfu xfuVar = new xfu(new j910(new zpu((gii0) v7iVar.f, (byte) 26), (knf0) v7iVar.k));
                ocl oclVar = (ocl) v7iVar.f36925a;
                m1e m1eVar2 = (m1e) v7iVar.d;
                pmi0 pmi0Var = (pmi0) v7iVar.m;
                nfm0 nfm0VarA = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA);
                jwu jwuVar = new jwu(nfm0VarA, (byte) 2);
                f7u f7uVarS = ((daf) pmi0Var.f27236a).s();
                nfm0 nfm0VarA2 = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA2);
                return new gx50(str, jLongValue, mneVarH5, i1w0Var3, ctf0Var4, xfuVar, oclVar, m1eVar2, jwuVar, f7uVarS, new weu(nfm0VarA2, (byte) 0), new qzt((pru) v7iVar.b, (byte) 0), ((daf) pmi0Var.f27236a).r(), (uyu) v7iVar.j, (wyu) v7iVar.n, (r9u) v7iVar.l);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new bmi(this);
            case 20:
                return new dmi(this);
            case 21:
                daf dafVar = (daf) obj;
                return new jj60(((d1p) dafVar.b).a0(), (zg) dafVar.c, (mne) dafVar.d, (ctf0) dafVar.e, new pmi0(new t91(((poq0) dafVar.f).f27342a.d, (byte) 1)), (i1w0) dafVar.g, new f7u((czt) dafVar.h, new bst(), (pru) dafVar.i, new iqt((gst0) dafVar.j), ((xzp) ((epi0) dafVar.k).b).C(), (byte) 10), (lbu) dafVar.l);
            case 22:
                return new hmi(this);
            case 23:
                return new jmi(this);
            case 24:
                return new lmi(this);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                mmi mmiVar = (mmi) obj;
                i1w0 i1w0Var4 = mmiVar.f22039a;
                duj dujVar2 = mmiVar.b;
                b4j b4jVar = mmiVar.c;
                x20 x20Var = mmiVar.d;
                ctf0 ctf0Var5 = mmiVar.e;
                g2v g2vVar2 = mmiVar.f;
                m1e m1eVar3 = mmiVar.g;
                nn60 nn60VarA = mmiVar.h.a();
                x1x.x(nn60VarA);
                mne mneVar = mmiVar.i;
                l570 l570Var = mmiVar.j;
                fvt0 fvt0Var = mmiVar.k;
                return new lf8(i1w0Var4, dujVar2, b4jVar, x20Var, ctf0Var5, g2vVar2, m1eVar3, nn60VarA, mneVar, l570Var, fvt0Var.o(), mmiVar.l, new tpx(mmiVar.m, (byte) 2), mmiVar.n, mmiVar.o, mmiVar.p, mmiVar.q, new ln4(mmiVar.r), ((esg0) fvt0Var.f10231a).S());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                h6i h6iVar = (h6i) obj;
                return new l470((uf3) h6iVar.d, new hs60((kt2) h6iVar.f12530a), (gw60) h6iVar.e, (ix0) h6iVar.f, (ls) h6iVar.g, (xcc) h6iVar.h, (p4u) h6iVar.i, (oeg0) h6iVar.j, (z4u) h6iVar.k, (iqt) h6iVar.l, (lbu) h6iVar.p, new dcu(new scu((pbt) h6iVar.m, (gst0) h6iVar.n), (ntu) h6iVar.o), new uxs0((byte) 12));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new rmi(this);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new xmi(this);
            default:
                return new zmi(this);
        }
    }
}
