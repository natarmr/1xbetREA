package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import org.xplatform.playersduel.api.presentation.PlayerDuelParams;
import org.xplatform.sportgame.bets_on_players.impl.presentation.model.ChooseSubGameParams;

/* JADX INFO: loaded from: classes3.dex */
public final class pai implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26655a;
    public final Object b;

    public /* synthetic */ pai(Object obj, byte b) {
        this.f26655a = b;
        this.b = obj;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f26655a;
        byte b2 = 21;
        Object obj = this.b;
        switch (b) {
            case 0:
                gr00 gr00Var = (gr00) obj;
                String str = (String) gr00Var.f11760a;
                String str2 = (String) gr00Var.b;
                ctf0 ctf0Var = (ctf0) gr00Var.c;
                mne mneVarH = ((psc) ((cad) gr00Var.d).b).h();
                x1x.x(mneVarH);
                ctf0Var.getClass();
                return new fz8(new gj4(str, str2, b2), cvm0.p(mneVarH.c, mneVarH.f22085a), new ep4(ctf0Var, (byte) 8), null);
            case 1:
                return new sai(this);
            case 2:
                g45 g45Var = (g45) obj;
                mne mneVarH2 = ((psc) ((cad) g45Var.f10647a).b).h();
                x1x.x(mneVarH2);
                PlayerDuelParams playerDuelParams = (PlayerDuelParams) g45Var.b;
                ctf0 ctf0Var2 = (ctf0) g45Var.c;
                ocl oclVar = (ocl) g45Var.d;
                i1w0 i1w0Var = (i1w0) g45Var.e;
                pcl0 pcl0Var = (pcl0) g45Var.f;
                x4u x4uVarP = pcl0Var.P();
                x1x.x(x4uVarP);
                kym0 kym0VarP = pcl0Var.p();
                x1x.x(kym0VarP);
                yfu yfuVar = new yfu(kym0VarP);
                ioi ioiVar = (ioi) g45Var.g;
                fga0 fga0Var = (fga0) ioiVar.e.get();
                x1x.x(fga0Var);
                reu reuVar = new reu(fga0Var, (byte) 9);
                vdn vdnVarA = ioiVar.a();
                x1x.x(vdnVarA);
                d1u d1uVar = new d1u(vdnVarA);
                vdn vdnVarA2 = ioiVar.a();
                x1x.x(vdnVarA2);
                d1u d1uVar2 = new d1u(vdnVarA2);
                ien ienVarB = ioiVar.b();
                x1x.x(ienVarB);
                roi0 roi0Var = new roi0(ienVarB);
                ien ienVarB2 = ioiVar.b();
                x1x.x(ienVarB2);
                hbu hbuVar = new hbu(ienVarB2);
                ien ienVarB3 = ioiVar.b();
                x1x.x(ienVarB3);
                reu reuVar2 = new reu(ienVarB3, (byte) 15);
                ien ienVarB4 = ioiVar.b();
                x1x.x(ienVarB4);
                ibu ibuVar = new ibu(ienVarB4);
                ien ienVarB5 = ioiVar.b();
                x1x.x(ienVarB5);
                return new ab9(mneVarH2, playerDuelParams, ctf0Var2, oclVar, i1w0Var, x4uVarP, yfuVar, reuVar, d1uVar, d1uVar2, roi0Var, hbuVar, reuVar2, ibuVar, new r7v(ienVarB5), (rl70) g45Var.h);
            case 3:
                return new xai(this);
            case 4:
                esg0 esg0Var = (esg0) obj;
                ctf0 ctf0Var3 = (ctf0) esg0Var.f8326a;
                r7v r7vVar = new r7v((gii0) esg0Var.b, (byte) 18);
                btt0 btt0Var = (btt0) esg0Var.c;
                btt0Var.getClass();
                yzn0 yzn0Var = new yzn0();
                yzn0Var.f43523a = r7vVar;
                yzn0Var.b = btt0Var;
                return new gu9(ctf0Var3, new lef0(yzn0Var), ((Long) esg0Var.d).longValue(), (mne) esg0Var.e);
            case 5:
                return new fbi(this);
            case 6:
                q7d0 q7d0Var = (q7d0) ((gr00) obj).f11760a;
                q7d0Var.getClass();
                return new mta(q7d0Var);
            case 7:
                return new qbi(this);
            case 8:
                cr crVar = (cr) obj;
                oeg0 oeg0Var = (oeg0) crVar.c;
                duj dujVar = (duj) crVar.d;
                gle0 gle0Var = (gle0) crVar.e;
                mne mneVarH3 = ((psc) ((cad) crVar.f).b).h();
                x1x.x(mneVarH3);
                return new g1i0(oeg0Var, dujVar, gle0Var, mneVarH3, (ctf0) crVar.g, (m1e) crVar.h, (ort) crVar.i, (cyh) crVar.j, (z4w0) crVar.k, (rou) crVar.l, (pru) crVar.b, new ftb(((pmi) ((onv) crVar.m).f25567a).i()), new rou((b3c0) crVar.n, (byte) 2), (b4j) crVar.o, (x20) crVar.p, (bzt) crVar.q);
            case 9:
                return new bci(this);
            case 10:
                gbi gbiVar = (gbi) obj;
                i1w0 i1w0Var2 = (i1w0) gbiVar.f11016a;
                cad cadVar = (cad) gbiVar.b;
                mne mneVarH4 = ((psc) cadVar.b).h();
                x1x.x(mneVarH4);
                bwl bwlVar = new bwl(new lhf0(mneVarH4, new chf0((gii0) gbiVar.c, (byte) 17), (knf0) gbiVar.d));
                String str3 = (String) gbiVar.e;
                long jLongValue = ((Long) gbiVar.f).longValue();
                duj dujVar2 = (duj) gbiVar.g;
                u58 u58Var = (u58) gbiVar.h;
                ocl oclVar2 = (ocl) gbiVar.i;
                nai naiVar = (nai) gbiVar.j;
                svs0 svs0Var = (svs0) gbiVar.k;
                kl5 kl5Var = (kl5) gbiVar.l;
                pmi0 pmi0Var = (pmi0) gbiVar.m;
                fhj fhjVarR = ((daf) pmi0Var.f27236a).r();
                uyu uyuVar = (uyu) gbiVar.n;
                wyu wyuVar = (wyu) gbiVar.o;
                m1e m1eVar = (m1e) gbiVar.p;
                mne mneVarH5 = ((psc) cadVar.b).h();
                x1x.x(mneVarH5);
                return new ybm0(i1w0Var2, bwlVar, str3, jLongValue, dujVar2, u58Var, oclVar2, naiVar, svs0Var, kl5Var, fhjVarR, uyuVar, wyuVar, m1eVar, mneVarH5, new qzt((pru) gbiVar.q, (byte) 0), ((daf) pmi0Var.f27236a).x(), (r9u) gbiVar.r);
            case 11:
                h6i h6iVar = (h6i) obj;
                i1w0 i1w0Var3 = (i1w0) h6iVar.d;
                g2v g2vVar = (g2v) h6iVar.f;
                m1e m1eVar2 = (m1e) h6iVar.e;
                mne mneVar = (mne) h6iVar.b;
                duj dujVar3 = (duj) h6iVar.g;
                j1q0 j1q0Var = (j1q0) h6iVar.h;
                ntu ntuVar = (ntu) h6iVar.i;
                n4u n4uVar = (n4u) h6iVar.j;
                ctf0 ctf0Var4 = (ctf0) h6iVar.f12530a;
                wgu wguVar = (wgu) h6iVar.k;
                hru hruVar = (hru) h6iVar.l;
                iqt iqtVar = (iqt) h6iVar.m;
                jqt jqtVar = (jqt) h6iVar.n;
                wsf0 wsf0Var = (wsf0) h6iVar.o;
                return new ajb(i1w0Var3, g2vVar, m1eVar2, mneVar, dujVar3, j1q0Var, ntuVar, n4uVar, ctf0Var4, wguVar, hruVar, iqtVar, jqtVar, ((g45) wsf0Var.b).y(), ((g45) wsf0Var.b).x(), (pru) h6iVar.p);
            case 12:
                h6i h6iVar2 = (h6i) obj;
                bm5 bm5Var = (bm5) h6iVar2.d;
                boolean zBooleanValue = ((Boolean) h6iVar2.f12530a).booleanValue();
                boolean zBooleanValue2 = ((Boolean) h6iVar2.e).booleanValue();
                boolean zBooleanValue3 = ((Boolean) h6iVar2.f).booleanValue();
                wsf0 wsf0Var2 = (wsf0) h6iVar2.g;
                return new gob(bm5Var, zBooleanValue, zBooleanValue2, zBooleanValue3, ((g45) wsf0Var2.b).G(), wsf0Var2.s(), new bsu(), ((g45) wsf0Var2.b).y(), wsf0Var2.g(), (v88) h6iVar2.h, (ih5) h6iVar2.i, (zg) h6iVar2.j, (eqx) h6iVar2.k, (mne) h6iVar2.b, (g2v) h6iVar2.l, (wxs0) h6iVar2.m, (i1w0) h6iVar2.n, (l7k) h6iVar2.o, (cmt) h6iVar2.p);
            case 13:
                return new ynb((ii) ((yzn0) obj).f43523a);
            case 14:
                qv2 qv2Var = (qv2) obj;
                int iIntValue = ((Integer) qv2Var.b).intValue();
                long jLongValue2 = ((Long) qv2Var.c).longValue();
                hst hstVar = new hst(new oif0((lye) qv2Var.d, (m0f) qv2Var.e, (ave) qv2Var.f));
                lye lyeVar = (lye) qv2Var.d;
                m0f m0fVar = (m0f) qv2Var.e;
                ave aveVar = (ave) qv2Var.f;
                ehf0 ehf0Var = new ehf0((gii0) qv2Var.g, (byte) 23);
                vwb0 vwb0Var = (vwb0) qv2Var.h;
                q7d0 q7d0Var2 = (q7d0) qv2Var.i;
                us3 us3Var = (us3) qv2Var.j;
                knf0 knf0Var = (knf0) qv2Var.k;
                mne mneVar2 = (mne) qv2Var.l;
                return new nob(iIntValue, jLongValue2, hstVar, new o4a(new g45(lyeVar, m0fVar, aveVar, ehf0Var, vwb0Var, q7d0Var2, us3Var, knf0Var, mneVar2)), mneVar2, (ctf0) qv2Var.m);
            case 15:
                return new fci(this);
            case 16:
                return new gci(this);
            case 17:
                esg0 esg0Var2 = (esg0) obj;
                mne mneVarH6 = ((psc) ((cad) esg0Var2.f8326a).b).h();
                x1x.x(mneVarH6);
                ctf0 ctf0Var5 = (ctf0) esg0Var2.b;
                iw20 iw20Var = (iw20) esg0Var2.c;
                return new etb(mneVarH6, ctf0Var5, new vgu((vff0) ((uii) iw20Var.f15470a).f35730a, (byte) 1), ((uii) iw20Var.f15470a).w(), (String) esg0Var2.d, (vby) esg0Var2.e);
            case 18:
                return new ici(this);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new kci(this);
            case 20:
                return new nci(this);
            case 21:
                pci pciVar = (pci) obj;
                mne mneVar3 = pciVar.f26760a;
                m1e m1eVar3 = pciVar.b;
                tgu tguVarA = pciVar.c.a();
                x1x.x(tguVarA);
                return new xgc(mneVar3, m1eVar3, tguVarA);
            case 22:
                rrd rrdVar = (rrd) obj;
                ctf0 ctf0Var6 = (ctf0) rrdVar.b;
                mne mneVarH7 = ((psc) ((cad) rrdVar.c).b).h();
                x1x.x(mneVarH7);
                pcl0 pcl0Var2 = (pcl0) rrdVar.d;
                ntt nttVarJ = pcl0Var2.j();
                x1x.x(nttVarJ);
                eai eaiVar = (eai) rrdVar.e;
                b8h0 b8h0VarA = eaiVar.a();
                x1x.x(b8h0VarA);
                eyg0 eyg0Var = new eyg0(b8h0VarA, (byte) 16);
                ntt nttVarJ2 = pcl0Var2.j();
                x1x.x(nttVarJ2);
                b8h0 b8h0VarA2 = eaiVar.a();
                x1x.x(b8h0VarA2);
                hru hruVar2 = new hru(b8h0VarA2);
                b8h0 b8h0VarA3 = eaiVar.a();
                x1x.x(b8h0VarA3);
                return new lic(ctf0Var6, mneVarH7, nttVarJ, eyg0Var, new oif0(nttVarJ2, hruVar2, new eyg0(b8h0VarA3, (byte) 16), (byte) 29), (s64) rrdVar.f, new qu((kt2) rrdVar.g, (byte) 2), (ChooseSubGameParams) rrdVar.h);
            case 23:
                qci qciVar = (qci) obj;
                return new h7p(qciVar.f28483a, qciVar.b, new a7q(new rrc(qciVar.c)), qciVar.d);
            case 24:
                mii0 mii0Var = (mii0) obj;
                mne mneVarH8 = ((psc) ((cad) mii0Var.b).b).h();
                x1x.x(mneVarH8);
                ctf0 ctf0Var7 = (ctf0) mii0Var.c;
                ioi ioiVar2 = (ioi) mii0Var.d;
                ien ienVarB6 = ioiVar2.b();
                x1x.x(ienVarB6);
                hbu hbuVar2 = new hbu(ienVarB6);
                ien ienVarB7 = ioiVar2.b();
                x1x.x(ienVarB7);
                reu reuVar3 = new reu(ienVarB7, (byte) 15);
                ien ienVarB8 = ioiVar2.b();
                x1x.x(ienVarB8);
                return new ksc(mneVarH8, ctf0Var7, hbuVar2, reuVar3, new yk50(ienVarB8, (byte) 28));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                nhf0 nhf0Var = (nhf0) obj;
                return new wtc((fhj) nhf0Var.f23530a, (ctf0) nhf0Var.b, (i1w0) nhf0Var.c);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new qj9((oj9) ((xzp) obj).f41764a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new rci(this);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                nc0 nc0Var = (nc0) obj;
                duj dujVar4 = (duj) nc0Var.d;
                cad cadVar2 = (cad) nc0Var.e;
                mne mneVarH9 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH9);
                bwl bwlVar2 = new bwl(new lhf0(mneVarH9, new ehf0((gii0) nc0Var.f, (byte) 21), (knf0) nc0Var.g));
                m1e m1eVar4 = (m1e) nc0Var.f23267a;
                i1w0 i1w0Var4 = (i1w0) nc0Var.h;
                ctf0 ctf0Var8 = (ctf0) nc0Var.c;
                kki kkiVar = (kki) nc0Var.i;
                ocl oclVar3 = (ocl) nc0Var.b;
                vjp vjpVar = (vjp) nc0Var.j;
                String str4 = (String) nc0Var.k;
                long jLongValue3 = ((Long) nc0Var.l).longValue();
                r9u r9uVar = (r9u) nc0Var.m;
                mne mneVarH10 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH10);
                return new kfd(dujVar4, bwlVar2, m1eVar4, i1w0Var4, ctf0Var8, kkiVar, oclVar3, vjpVar, str4, jLongValue3, r9uVar, mneVarH10);
            default:
                nc0 nc0Var2 = (nc0) obj;
                duj dujVar5 = (duj) nc0Var2.d;
                cad cadVar3 = (cad) nc0Var2.e;
                mne mneVarH11 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH11);
                lsn lsnVar = new lsn(new y3v(mneVarH11, new fck0((gii0) nc0Var2.f, (byte) 6), (knf0) nc0Var2.g));
                m1e m1eVar5 = (m1e) nc0Var2.f23267a;
                i1w0 i1w0Var5 = (i1w0) nc0Var2.h;
                kki kkiVar2 = (kki) nc0Var2.i;
                ocl oclVar4 = (ocl) nc0Var2.b;
                ctf0 ctf0Var9 = (ctf0) nc0Var2.c;
                boolean zBooleanValue4 = ((Boolean) nc0Var2.j).booleanValue();
                vjp vjpVar2 = (vjp) nc0Var2.k;
                String str5 = (String) nc0Var2.l;
                r9u r9uVar2 = (r9u) nc0Var2.m;
                mne mneVarH12 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH12);
                return new gfd(dujVar5, lsnVar, m1eVar5, i1w0Var5, kkiVar2, oclVar4, ctf0Var9, zBooleanValue4, vjpVar2, str5, r9uVar2, mneVarH12);
        }
    }
}
