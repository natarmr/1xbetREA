package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes4.dex */
public final class ugi implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35625a;
    public final Object b;

    public /* synthetic */ ugi(Object obj, byte b) {
        this.f35625a = b;
        this.b = obj;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f35625a;
        Object obj = this.b;
        switch (b) {
            case 0:
                esg0 esg0Var = (esg0) obj;
                ctf0 ctf0Var = (ctf0) esg0Var.f8326a;
                mne mneVarH = ((psc) ((cad) esg0Var.b).b).h();
                x1x.x(mneVarH);
                return new khp(ctf0Var, mneVarH, (dot) esg0Var.c, (dot) esg0Var.d, (i1w0) esg0Var.e);
            case 1:
                return new wgi(this);
            case 2:
                return new ygi(this);
            case 3:
                return new ahi(this);
            case 4:
                return new chi(this);
            case 5:
                h6i h6iVar = (h6i) obj;
                String str = (String) h6iVar.d;
                long jLongValue = ((Long) h6iVar.b).longValue();
                i1w0 i1w0Var = (i1w0) h6iVar.f;
                mne mneVarH2 = ((psc) ((cad) h6iVar.g).b).h();
                x1x.x(mneVarH2);
                ctf0 ctf0Var2 = (ctf0) h6iVar.f12530a;
                m1e m1eVar = (m1e) h6iVar.e;
                pmi0 pmi0Var = (pmi0) h6iVar.h;
                nfm0 nfm0VarA = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA);
                jwu jwuVar = new jwu(nfm0VarA, (byte) 2);
                f7u f7uVarS = ((daf) pmi0Var.f27236a).s();
                qzt qztVar = new qzt((pru) h6iVar.i, (byte) 0);
                fhj fhjVarR = ((daf) pmi0Var.f27236a).r();
                nfm0 nfm0VarA2 = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA2);
                return new pup(str, jLongValue, i1w0Var, mneVarH2, ctf0Var2, m1eVar, jwuVar, f7uVarS, qztVar, fhjVarR, new weu(nfm0VarA2, (byte) 0), (uyu) h6iVar.j, (wyu) h6iVar.k, (duj) h6iVar.l, new a7q(new wti(new zri((gii0) h6iVar.m, (byte) 12), (knf0) h6iVar.n)), (r9u) h6iVar.o, (ocl) h6iVar.p);
            case 6:
                ehi ehiVar = (ehi) obj;
                jtj jtjVar = ehiVar.f7811a;
                b8u b8uVar = ehiVar.b;
                uyn uynVar = ehiVar.c;
                x4u x4uVar = new x4u(uynVar);
                lqc lqcVar = new lqc(uynVar);
                qxg0 qxg0Var = new qxg0(uynVar);
                lbu lbuVar = ehiVar.d;
                hnu hnuVar = ehiVar.e;
                mne mneVarH3 = ((psc) ehiVar.f.b).h();
                x1x.x(mneVarH3);
                return new vy60(jtjVar, b8uVar, x4uVar, lqcVar, qxg0Var, lbuVar, hnuVar, mneVarH3, ehiVar.g, ehiVar.h, ehiVar.i, ehiVar.j, ((uii) ehiVar.k.f15470a).r());
            case 7:
                esg0 esg0Var2 = (esg0) obj;
                mne mneVarH4 = ((psc) ((cad) esg0Var2.f8326a).b).h();
                x1x.x(mneVarH4);
                return new q5q(mneVarH4, (ctf0) esg0Var2.b, (nmy) esg0Var2.c, (cny) esg0Var2.d, new noc((vff0) ((uii) ((iw20) esg0Var2.e).f15470a).f35730a, (byte) 2));
            case 8:
                v7i v7iVar = (v7i) obj;
                x4u x4uVarG = ((chf0) ((nmo) v7iVar.i).f23782a).G();
                String str2 = (String) v7iVar.e;
                long jLongValue2 = ((Long) v7iVar.f).longValue();
                duj dujVar = (duj) v7iVar.g;
                ocl oclVar = (ocl) v7iVar.k;
                mne mneVarH5 = ((psc) ((cad) v7iVar.h).b).h();
                x1x.x(mneVarH5);
                pmi0 pmi0Var2 = (pmi0) v7iVar.f36925a;
                nfm0 nfm0VarA3 = ((daf) pmi0Var2.f27236a).A();
                x1x.x(nfm0VarA3);
                weu weuVar = new weu(nfm0VarA3, (byte) 0);
                fhj fhjVarR2 = ((daf) pmi0Var2.f27236a).r();
                qzt qztVar2 = new qzt((pru) v7iVar.m, (byte) 0);
                wyu wyuVar = (wyu) v7iVar.n;
                f7u f7uVarS2 = ((daf) pmi0Var2.f27236a).s();
                nfm0 nfm0VarA4 = ((daf) pmi0Var2.f27236a).A();
                x1x.x(nfm0VarA4);
                return new ivq(x4uVarG, str2, jLongValue2, dujVar, oclVar, mneVarH5, weuVar, fhjVarR2, qztVar2, wyuVar, f7uVarS2, new jwu(nfm0VarA4, (byte) 2), (ctf0) v7iVar.c, (uyu) v7iVar.j, (m1e) v7iVar.d, (i1w0) v7iVar.b, (r9u) v7iVar.l);
            case 9:
                g45 g45Var = (g45) obj;
                String str3 = (String) g45Var.g;
                cad cadVar = (cad) g45Var.f10647a;
                mne mneVarH6 = ((psc) cadVar.b).h();
                x1x.x(mneVarH6);
                rpt rptVar = new rpt(new khf0(mneVarH6, new nmo((gii0) g45Var.b, (byte) 5), (knf0) g45Var.c));
                duj dujVar2 = (duj) g45Var.d;
                ocl oclVar2 = (ocl) g45Var.e;
                m1e m1eVar2 = (m1e) g45Var.f;
                mne mneVarH7 = ((psc) cadVar.b).h();
                x1x.x(mneVarH7);
                return new abr(str3, rptVar, dujVar2, oclVar2, m1eVar2, mneVarH7, (i1w0) g45Var.h);
            case 10:
                ru ruVar = (ru) obj;
                String str4 = (String) ruVar.f31100a;
                int iIntValue = ((Integer) ruVar.b).intValue();
                i1w0 i1w0Var2 = (i1w0) ruVar.c;
                yiu yiuVar = new yiu((j1q0) ruVar.d, (byte) 1);
                ocl oclVar3 = (ocl) ruVar.f;
                m1e m1eVar3 = (m1e) ruVar.h;
                mne mneVarH8 = ((psc) ((cad) ruVar.g).b).h();
                x1x.x(mneVarH8);
                return new wcr(str4, iIntValue, i1w0Var2, yiuVar, oclVar3, m1eVar3, mneVarH8, ((daf) ((roi0) ruVar.i).f30839a).B(), (ctf0) ruVar.e);
            case 11:
                return new khi(this);
            case 12:
                return new mhi(this);
            case 13:
                return new phi(this);
            case 14:
                return new thi(this);
            case 15:
                return new vhi(this);
            case 16:
                return new zhi(this);
            case 17:
                bii biiVar = (bii) obj;
                i1w0 i1w0Var3 = biiVar.f2661a;
                ouu ouuVar = biiVar.b;
                wsf0 wsf0Var = biiVar.c;
                ali aliVar = biiVar.d;
                yoc yocVar = biiVar.e;
                yoc yocVar2 = biiVar.f;
                m1e m1eVar4 = biiVar.g;
                ih5 ih5Var = biiVar.h;
                l7k l7kVar = biiVar.i;
                v88 v88Var = biiVar.j;
                iw20 iw20Var = biiVar.k;
                pru pruVarR = ((uii) iw20Var.f15470a).r();
                dmt dmtVarI = ((uii) iw20Var.f15470a).i();
                duj dujVar3 = biiVar.l;
                g2v g2vVar = biiVar.m;
                ctf0 ctf0Var3 = biiVar.n;
                foi0 foi0Var = biiVar.o;
                mne mneVarH9 = ((psc) biiVar.p.b).h();
                x1x.x(mneVarH9);
                nn60 nn60VarA = biiVar.q.a();
                x1x.x(nn60VarA);
                return new dy60(i1w0Var3, ouuVar, wsf0Var, aliVar, yocVar, yocVar2, m1eVar4, ih5Var, l7kVar, v88Var, pruVarR, dmtVarI, dujVar3, g2vVar, ctf0Var3, foi0Var, mneVarH9, nn60VarA, biiVar.r, biiVar.s, biiVar.t, biiVar.u, biiVar.v, biiVar.w, biiVar.x, biiVar.y);
            case 18:
                return new eii(this);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new gii(this);
            case 20:
                qv2 qv2Var = (qv2) obj;
                return new mkt((wyu) qv2Var.b, (xak) qv2Var.c, (a6u) qv2Var.d, (y3v) qv2Var.e, (evz) qv2Var.f, (i1w0) qv2Var.g, (mne) qv2Var.h, (s64) qv2Var.i, (wgu) qv2Var.j, (dpc) qv2Var.k, (ani0) qv2Var.l, (duj) qv2Var.m);
            case 21:
                return new hii(this);
            case 22:
                o3c o3cVar = (o3c) obj;
                ctf0 ctf0Var4 = (ctf0) o3cVar.f24576a;
                String str5 = (String) o3cVar.b;
                mne mneVarH10 = ((psc) ((cad) o3cVar.c).b).h();
                x1x.x(mneVarH10);
                return new ndv(ctf0Var4, str5, mneVarH10, (i1w0) o3cVar.d, new pyu(o3cVar.l()), new n1u(o3cVar.l()), new n1u(o3cVar.l()), new fvt0(o3cVar.l()), new n1u(o3cVar.l()), new yfu(o3cVar.l()), (ocl) o3cVar.h, (m1e) o3cVar.i, (duj) o3cVar.j);
            case 23:
                return new lgv((wyu) ((ehf0) obj).b);
            case 24:
                return new mgv((wyu) ((yzn0) obj).f43523a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new kii(this);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new mii(this);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                gr00 gr00Var = (gr00) obj;
                knf0 knf0Var = (knf0) gr00Var.f11760a;
                gii0 gii0Var = (gii0) gr00Var.b;
                xsu xsuVar = new xsu(gii0Var);
                q7d0 q7d0Var = (q7d0) gr00Var.c;
                return new uwv(new svu(new y3v(knf0Var, xsuVar, q7d0Var)), new hnu(new y3v(knf0Var, new xsu(gii0Var), q7d0Var)), (i1w0) gr00Var.d);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new nii(this);
            default:
                ywq0 ywq0Var = (ywq0) obj;
                HistoryTypeModel historyTypeModel = (HistoryTypeModel) ywq0Var.f43384a;
                f8w f8wVar = (f8w) ywq0Var.b;
                mne mneVarH11 = ((psc) ((cad) ywq0Var.c).b).h();
                x1x.x(mneVarH11);
                pru pruVar = (pru) ywq0Var.d;
                ctf0 ctf0Var5 = (ctf0) ywq0Var.e;
                j77 j77Var = (j77) ywq0Var.f;
                return new l0w(historyTypeModel, f8wVar, mneVarH11, pruVar, ctf0Var5, new hnu(new dpi0(j77Var)), new ugf0(new dpi0(j77Var)));
        }
    }
}
