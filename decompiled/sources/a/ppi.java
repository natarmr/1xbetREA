package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import org.xplatform.referral.api.presentation.ReferralNetworkParams;
import org.xplatform.registration_default.impl.presentation.registration_bonus.models.RegistrationBonusDefaultScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class ppi implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27377a;
    public final Object b;

    public /* synthetic */ ppi(Object obj, byte b) {
        this.f27377a = b;
        this.b = obj;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f27377a;
        byte b2 = 29;
        byte b3 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new opi(this);
            case 1:
                return new tpi(this);
            case 2:
                g45 g45Var = (g45) obj;
                lgc0 lgc0Var = (lgc0) g45Var.f10647a;
                p4u p4uVar = new p4u(new onv(lgc0Var));
                ctf0 ctf0Var = (ctf0) g45Var.b;
                mne mneVarH = ((psc) ((cad) g45Var.c).b).h();
                x1x.x(mneVarH);
                sue sueVar = (sue) g45Var.d;
                return new jhc0(p4uVar, ctf0Var, mneVarH, sueVar.e(), ((g45) ((wsf0) g45Var.e).b).E(), sueVar.b(), new x4u(new onv(lgc0Var)), new epi0(new onv(lgc0Var), (byte) 2), new peg0(new onv(lgc0Var), (byte) 29), new ort((gst0) g45Var.f, (byte) 3), (m1e) g45Var.g, ((uii) ((iw20) g45Var.h).f15470a).r());
            case 3:
                ali aliVar = (ali) obj;
                return new g2d0((m1e) aliVar.f1068a, ((c1d0) aliVar.b).f(), (mne) aliVar.c);
            case 4:
                kki kkiVar = (kki) obj;
                return new m6d0(new l6d0((euc) kkiVar.e, (azj0) kkiVar.c, (mne) kkiVar.d, ohs0.n(((ntu) kkiVar.f).a(), "/status.json")));
            case 5:
                return new hqi(this);
            case 6:
                return new kqi(this);
            case 7:
                return new lqi(this);
            case 8:
                return new nqi(this);
            case 9:
                return new pqi(this);
            case 10:
                return new sid0((i1w0) ((yzn0) obj).f43523a);
            case 11:
                return new qqi(this);
            case 12:
                return new sqi(this);
            case 13:
                return new uqi(this);
            case 14:
                rrd rrdVar = (rrd) obj;
                mne mneVarH2 = ((psc) ((cad) rrdVar.b).b).h();
                x1x.x(mneVarH2);
                duj dujVar = (duj) rrdVar.c;
                fnd0 fnd0Var = (fnd0) rrdVar.d;
                yk50 yk50Var = new yk50(new o470(fnd0Var), (byte) 21);
                vpu vpuVar = new vpu(new o470(fnd0Var));
                wpu wpuVar = new wpu(new o470(fnd0Var));
                wsf0 wsf0Var = (wsf0) rrdVar.e;
                g45 g45Var2 = (g45) wsf0Var.b;
                cmt0 cmt0Var = new cmt0(wpuVar, g45Var2.y(), g45Var2.t());
                s64 s64VarO = ((d1p) rrdVar.f).o();
                ahu ahuVarY = ((g45) wsf0Var.b).y();
                m0u m0uVarT = ((g45) wsf0Var.b).t();
                wpu wpuVar2 = new wpu(new o470(fnd0Var));
                g45 g45Var3 = (g45) wsf0Var.b;
                return new tod0(mneVarH2, dujVar, yk50Var, vpuVar, cmt0Var, s64VarO, ahuVarY, m0uVarT, new oif0(wpuVar2, g45Var3.y(), g45Var3.t(), (byte) 28), (ctf0) rrdVar.g, (s31) rrdVar.h);
            case 15:
                return new wqi(this);
            case 16:
                mci mciVar = (mci) obj;
                String str = (String) mciVar.c;
                long jLongValue = ((Long) mciVar.d).longValue();
                cad cadVar = (cad) mciVar.b;
                mne mneVarH3 = ((psc) cadVar.b).h();
                x1x.x(mneVarH3);
                gii0 gii0Var = (gii0) mciVar.g;
                kd30 kd30Var = new kd30(gii0Var, (byte) 14);
                tgk tgkVar = (tgk) mciVar.f;
                knf0 knf0Var = (knf0) mciVar.i;
                f4u f4uVar = new f4u(new n660(mneVarH3, kd30Var, tgkVar, knf0Var), (byte) 28);
                mne mneVarH4 = ((psc) cadVar.b).h();
                x1x.x(mneVarH4);
                mne mneVarH5 = ((psc) cadVar.b).h();
                x1x.x(mneVarH5);
                peg0 peg0Var = new peg0(new n660(mneVarH5, new kd30(gii0Var, (byte) 14), tgkVar, knf0Var), (byte) 23);
                m1e m1eVar = (m1e) mciVar.h;
                i1w0 i1w0Var = (i1w0) mciVar.e;
                ocl oclVar = (ocl) mciVar.j;
                ctf0 ctf0Var2 = (ctf0) mciVar.f21553a;
                cge0 cge0Var = new cge0(b2);
                s9m0 s9m0Var = (s9m0) mciVar.k;
                tqt tqtVar = (tqt) mciVar.l;
                pmi0 pmi0Var = (pmi0) mciVar.m;
                nfm0 nfm0VarA = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA);
                jwu jwuVar = new jwu(nfm0VarA, (byte) 2);
                f7u f7uVarS = ((daf) pmi0Var.f27236a).s();
                nfm0 nfm0VarA2 = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA2);
                return new lrd0(str, jLongValue, f4uVar, mneVarH4, peg0Var, m1eVar, i1w0Var, oclVar, ctf0Var2, cge0Var, s9m0Var, tqtVar, jwuVar, f7uVarS, new weu(nfm0VarA2, (byte) 0), new qzt((pru) mciVar.n, (byte) 0), ((daf) pmi0Var.f27236a).r(), (uyu) mciVar.o, (wyu) mciVar.p, (r9u) mciVar.q);
            case 17:
                rrd rrdVar2 = (rrd) obj;
                i1w0 i1w0Var2 = (i1w0) rrdVar2.b;
                ctf0 ctf0Var3 = (ctf0) rrdVar2.c;
                pru pruVarR = ((uii) ((iw20) rrdVar2.d).f15470a).r();
                s9m0 s9m0Var2 = new s9m0();
                vwb0 vwb0Var = (vwb0) rrdVar2.e;
                q7d0 q7d0Var = (q7d0) rrdVar2.f;
                us00 us00Var = (us00) rrdVar2.g;
                return new q2e0(i1w0Var2, ctf0Var3, pruVarR, s9m0Var2, new dpi0(new iw20(new gxu(vwb0Var, q7d0Var, us00Var))), new jgu(new iw20(new gxu(vwb0Var, q7d0Var, us00Var))), (mne) rrdVar2.h);
            case 18:
                bri briVar = (bri) obj;
                i1w0 i1w0Var3 = briVar.f3082a;
                m1e m1eVar2 = briVar.b;
                x4u x4uVar = new x4u(new zpu(new lbu(briVar.c, (byte) 28), new lgz()));
                pru pruVar = briVar.d;
                g2v g2vVar = briVar.e;
                ctf0 ctf0Var4 = briVar.f;
                uxs0 uxs0Var = briVar.g;
                mne mneVarH6 = ((psc) briVar.h.b).h();
                x1x.x(mneVarH6);
                return new u9e0(i1w0Var3, m1eVar2, x4uVar, pruVar, g2vVar, ctf0Var4, uxs0Var, mneVarH6);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ru ruVar = (ru) obj;
                ctf0 ctf0Var5 = (ctf0) ruVar.e;
                mne mneVarH7 = ((psc) ((cad) ruVar.f31100a).b).h();
                x1x.x(mneVarH7);
                return new a6e0(ctf0Var5, mneVarH7, (i1w0) ruVar.c, (String) ruVar.d, new p4u(new j910(new g090((gii0) ruVar.f, (byte) 8), (knf0) ruVar.g)), (ocl) ruVar.i, (m1e) ruVar.h, (duj) ruVar.b);
            case 20:
                return new cri(this);
            case 21:
                return new eri(this);
            case 22:
                ru ruVar2 = (ru) obj;
                duj dujVar2 = (duj) ruVar2.b;
                cad cadVar2 = (cad) ruVar2.f31100a;
                mne mneVarH8 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH8);
                reu reuVar = new reu(new yuu(mneVarH8, new nw20((gii0) ruVar2.c, (byte) 18), (knf0) ruVar2.d), (byte) 12);
                m1e m1eVar3 = (m1e) ruVar2.h;
                i1w0 i1w0Var4 = (i1w0) ruVar2.e;
                ocl oclVar2 = (ocl) ruVar2.f;
                String str2 = (String) ruVar2.g;
                mne mneVarH9 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH9);
                return new kje0(dujVar2, reuVar, m1eVar3, i1w0Var4, oclVar2, str2, mneVarH9, (r9u) ruVar2.i);
            case 23:
                ru ruVar3 = (ru) obj;
                cad cadVar3 = (cad) ruVar3.f31100a;
                mne mneVarH10 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH10);
                b8u b8uVar = new b8u(new nvu(mneVarH10, new nv20((gii0) ruVar3.c, (byte) 19), (knf0) ruVar3.d));
                m1e m1eVar4 = (m1e) ruVar3.h;
                mne mneVarH11 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH11);
                return new qke0(b8uVar, m1eVar4, mneVarH11, (i1w0) ruVar3.f, (duj) ruVar3.b, (String) ruVar3.g, (ocl) ruVar3.i, (ctf0) ruVar3.e);
            case 24:
                g45 g45Var4 = (g45) obj;
                ctf0 ctf0Var6 = (ctf0) g45Var4.b;
                nfm0 nfm0VarA3 = ((daf) ((pmi0) g45Var4.c).f27236a).A();
                x1x.x(nfm0VarA3);
                zqu zquVar = new zqu(nfm0VarA3, (byte) 0);
                String str3 = (String) g45Var4.g;
                long jLongValue2 = ((Long) g45Var4.f10647a).longValue();
                i1w0 i1w0Var5 = (i1w0) g45Var4.d;
                duj dujVar3 = (duj) g45Var4.e;
                ocl oclVar3 = (ocl) g45Var4.f;
                mne mneVarH12 = ((psc) ((cad) g45Var4.h).b).h();
                x1x.x(mneVarH12);
                return new ume0(ctf0Var6, zquVar, str3, jLongValue2, i1w0Var5, dujVar3, oclVar3, mneVarH12);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ru ruVar4 = (ru) obj;
                ReferralNetworkParams referralNetworkParams = (ReferralNetworkParams) ruVar4.f31100a;
                ioe0 ioe0Var = (ioe0) ruVar4.c;
                gii0 gii0Var2 = (gii0) ruVar4.d;
                jw20 jw20Var = new jw20(gii0Var2, (byte) 20);
                cge0 cge0Var2 = new cge0(b3);
                btt0 btt0Var = (btt0) ruVar4.e;
                return new xne0(referralNetworkParams, new hnu(new z220(ioe0Var, jw20Var, cge0Var2, btt0Var)), new s5k(new z220(ioe0Var, new jw20(gii0Var2, (byte) 20), new cge0(b3), btt0Var)), new abu((gst0) ruVar4.f, ((g45) ((wsf0) ruVar4.g).b).q()), new rne0(), (pzu) ruVar4.h, (duj) ruVar4.b, (zpu) ruVar4.i);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                rrd rrdVar3 = (rrd) obj;
                return new hoe0(new hnu(new z220((ioe0) rrdVar3.b, new jw20((gii0) rrdVar3.c, (byte) 20), new cge0(b3), (btt0) rrdVar3.d)), (pzu) rrdVar3.e, (m1e) rrdVar3.f, (duj) rrdVar3.g, (sa10) rrdVar3.h);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                o3c o3cVar = (o3c) obj;
                ioe0 ioe0Var2 = (ioe0) o3cVar.f24576a;
                gii0 gii0Var3 = (gii0) o3cVar.b;
                jw20 jw20Var2 = new jw20(gii0Var3, (byte) 20);
                cge0 cge0Var3 = new cge0(b3);
                btt0 btt0Var2 = (btt0) o3cVar.c;
                p4u p4uVar2 = new p4u(new z220(ioe0Var2, jw20Var2, cge0Var3, btt0Var2));
                epi0 epi0Var = new epi0(new z220(ioe0Var2, new jw20(gii0Var3, (byte) 20), new cge0(b3), btt0Var2), (byte) 15);
                ort ortVar = new ort((gst0) o3cVar.d, (byte) 0);
                pzu pzuVar = (pzu) o3cVar.e;
                d1p d1pVar = (d1p) o3cVar.f;
                return new zoe0(p4uVar2, epi0Var, ortVar, pzuVar, d1pVar.l0(), new j6m0((byte) 12), new y2m0((byte) 12), (ih5) o3cVar.g, (yo4) o3cVar.h, (m1e) o3cVar.i, (duj) o3cVar.j, d1pVar.C(), d1pVar.D0(), d1pVar.A());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                g45 g45Var5 = (g45) obj;
                ioe0 ioe0Var3 = (ioe0) g45Var5.f10647a;
                gii0 gii0Var4 = (gii0) g45Var5.b;
                jw20 jw20Var3 = new jw20(gii0Var4, (byte) 20);
                cge0 cge0Var4 = new cge0(b3);
                btt0 btt0Var3 = (btt0) g45Var5.c;
                return new tpe0(new hnu(new z220(ioe0Var3, jw20Var3, cge0Var4, btt0Var3)), new abu((gst0) g45Var5.d, ((g45) ((wsf0) g45Var5.e).b).q()), new s5k(new z220(ioe0Var3, new jw20(gii0Var4, (byte) 20), new cge0(b3), btt0Var3)), new rne0(), (pzu) g45Var5.f, (duj) g45Var5.g, (sa10) g45Var5.h);
            default:
                uii uiiVar = (uii) obj;
                RegistrationBonusDefaultScreenParams registrationBonusDefaultScreenParams = (RegistrationBonusDefaultScreenParams) uiiVar.f35730a;
                ctf0 ctf0Var7 = (ctf0) uiiVar.b;
                ytt yttVarA = ((vqc) ((nr00) uiiVar.c).f23980a).a();
                mne mneVarH13 = ((psc) ((cad) uiiVar.d).b).h();
                x1x.x(mneVarH13);
                return new gue0(registrationBonusDefaultScreenParams, ctf0Var7, yttVarA, mneVarH13, (duj) uiiVar.e);
        }
    }
}
