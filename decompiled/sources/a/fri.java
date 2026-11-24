package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import org.xplatform.bethistory.sale.presentation.SaleDataModel;
import org.xplatform.registration.bonus.api.BonusSelectionScreenParams;
import org.xplatform.registration.success.api.RegistrationSuccessParams;

/* JADX INFO: loaded from: classes5.dex */
public final class fri implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10019a;
    public final Object b;

    public /* synthetic */ fri(Object obj, byte b) {
        this.f10019a = b;
        this.b = obj;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f10019a;
        Object obj = this.b;
        switch (b) {
            case 0:
                uii uiiVar = (uii) obj;
                BonusSelectionScreenParams bonusSelectionScreenParams = (BonusSelectionScreenParams) uiiVar.f35730a;
                ctf0 ctf0Var = (ctf0) uiiVar.b;
                ytt yttVarA = ((vqc) ((nr00) uiiVar.c).f23980a).a();
                mne mneVarH = ((psc) ((cad) uiiVar.d).b).h();
                x1x.x(mneVarH);
                return new lue0(bonusSelectionScreenParams, ctf0Var, yttVarA, mneVarH, (duj) uiiVar.e);
            case 1:
                return new hri(this);
            case 2:
                return new jri(this);
            case 3:
                lri lriVar = (lri) obj;
                RegistrationSuccessParams registrationSuccessParams = (RegistrationSuccessParams) lriVar.f20533a;
                xte0 xte0Var = (xte0) lriVar.b;
                nr nrVar = (nr) lriVar.c;
                je jeVar = (je) lriVar.d;
                ctf0 ctf0Var2 = (ctf0) lriVar.e;
                rrc rrcVar = (rrc) lriVar.f;
                eru eruVar = (eru) lriVar.g;
                mne mneVarH2 = ((psc) ((cad) lriVar.h).b).h();
                x1x.x(mneVarH2);
                return new d7f0(registrationSuccessParams, xte0Var, nrVar, jeVar, ctf0Var2, rrcVar, eruVar, mneVarH2, (i1w0) lriVar.i, (bk3) lriVar.j, (f4u) lriVar.k, (lrc) lriVar.l, ((v8i) ((ok50) lriVar.m).f25390a).a(), (pru) lriVar.n, ((hn4) lriVar.o).c(), (cmt) lriVar.p, ((es) ((ilp0) lriVar.q).f14992a).k(), ((g45) ((wsf0) lriVar.r).b).E(), (rou) lriVar.s, (cyh) lriVar.t, (z4w0) lriVar.u, ((xzp) ((epi0) lriVar.v).b).F(), (kwd) lriVar.w, (mi70) lriVar.x, (sqx) lriVar.y);
            case 4:
                return new mri(this);
            case 5:
                return new ori(this);
            case 6:
                return new qri(this);
            case 7:
                return new sri(this);
            case 8:
                return new yef0((i1w0) ((xr) obj).f41344a);
            case 9:
                uii uiiVar2 = (uii) obj;
                mne mneVarH3 = ((psc) ((cad) uiiVar2.b).b).h();
                x1x.x(mneVarH3);
                return new rgf0(mneVarH3, (ctf0) uiiVar2.c, ((uii) ((iw20) uiiVar2.f35730a).f15470a).w(), (i1w0) uiiVar2.d, new dot((j1q0) ((xzp) ((epi0) uiiVar2.e).b).f41764a, (byte) 2));
            case 10:
                return new uri(this);
            case 11:
                return new yri(this);
            case 12:
                return new cvf0((i1w0) ((zri) obj).b);
            case 13:
                return new asi(this);
            case 14:
                return new csi(this);
            case 15:
                return new gsi(this);
            case 16:
                g45 g45Var = (g45) obj;
                knf0 knf0Var = (knf0) g45Var.f10647a;
                jw20 jw20Var = new jw20((gii0) g45Var.b, (byte) 27);
                btt0 btt0Var = (btt0) g45Var.c;
                knf0Var.getClass();
                btt0Var.getClass();
                gxu gxuVar = new gxu();
                gxuVar.f12096a = knf0Var;
                gxuVar.b = jw20Var;
                gxuVar.c = btt0Var;
                yfu yfuVar = new yfu(gxuVar);
                mne mneVarH4 = ((psc) ((cad) g45Var.d).b).h();
                x1x.x(mneVarH4);
                return new pbg0(yfuVar, mneVarH4, (i1w0) g45Var.e, (j1q0) g45Var.f, (duj) g45Var.g, (sa10) g45Var.h);
            case 17:
                return new osi(this);
            case 18:
                xzp xzpVar = (xzp) obj;
                return new rug0((ctf0) xzpVar.f41764a, (n3w) xzpVar.b, ((Boolean) xzpVar.c).booleanValue(), (SaleDataModel) xzpVar.d, ((Double) xzpVar.e).doubleValue(), (m1e) xzpVar.f);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                v5i v5iVar = (v5i) obj;
                pru pruVarR = ((uii) ((iw20) v5iVar.e).f15470a).r();
                cad cadVar = (cad) v5iVar.o;
                mne mneVarH5 = ((psc) cadVar.b).h();
                x1x.x(mneVarH5);
                mne mneVarH6 = ((psc) cadVar.b).h();
                x1x.x(mneVarH6);
                gii0 gii0Var = (gii0) v5iVar.g;
                ok50 ok50Var = new ok50(gii0Var, (byte) 15);
                knf0 knf0Var2 = (knf0) v5iVar.h;
                btt0 btt0Var2 = (btt0) v5iVar.i;
                mii0 mii0Var = new mii0(mneVarH6, ok50Var, knf0Var2, btt0Var2);
                gst0 gst0Var = (gst0) v5iVar.j;
                cu cuVar = new cu(mneVarH5, mii0Var, gst0Var);
                mne mneVarH7 = ((psc) cadVar.b).h();
                x1x.x(mneVarH7);
                kd30 kd30Var = new kd30(new mii0(mneVarH7, new ok50(gii0Var, (byte) 15), knf0Var2, btt0Var2), gst0Var);
                wsf0 wsf0Var = (wsf0) v5iVar.k;
                z220 z220Var = new z220((Object) kd30Var, (Object) ((g45) wsf0Var.b).q(), (Object) wsf0Var.a(), (Object) wsf0Var.b(), (byte) 19);
                mne mneVarH8 = ((psc) cadVar.b).h();
                x1x.x(mneVarH8);
                wwv wwvVar = new wwv(new rrd(mneVarH8, new pyu(gii0Var, (byte) 12), new g2v(gii0Var), new dpi0(gii0Var, (byte) 22), (tnm0) v5iVar.l, (m0w) v5iVar.m, new y2m0((byte) 20), (knf0) v5iVar.h, (btt0) v5iVar.i));
                m1e m1eVar = (m1e) v5iVar.n;
                kt2 kt2Var = (kt2) v5iVar.p;
                b4j b4jVar = new b4j(kt2Var, (byte) 1);
                sa10 sa10Var = (sa10) v5iVar.q;
                mne mneVarH9 = ((psc) cadVar.b).h();
                x1x.x(mneVarH9);
                return new cxg0(pruVarR, cuVar, z220Var, wwvVar, m1eVar, b4jVar, sa10Var, mneVarH9, (i1w0) v5iVar.f, (duj) v5iVar.c, (ctf0) v5iVar.b, new nj7(new b4j(kt2Var, (byte) 1), (au0) v5iVar.r, (String) v5iVar.s), (n3w) v5iVar.t, ((Boolean) v5iVar.u).booleanValue(), ((Long) v5iVar.d).longValue());
            case 20:
                tsi tsiVar = (tsi) obj;
                return new hlh0(tsiVar.f34462a, tsiVar.b, tsiVar.c, new rsu(((gbi) tsiVar.d.f19899a).J()));
            case 21:
                return new usi(this);
            case 22:
                uii uiiVar3 = (uii) obj;
                i1w0 i1w0Var = (i1w0) uiiVar3.b;
                nqh0 nqh0Var = (nqh0) uiiVar3.c;
                ctf0 ctf0Var3 = (ctf0) uiiVar3.d;
                pru pruVarR2 = ((uii) ((iw20) uiiVar3.f35730a).f15470a).r();
                mne mneVarH10 = ((psc) ((cad) uiiVar3.e).b).h();
                x1x.x(mneVarH10);
                return new goh0(i1w0Var, nqh0Var, ctf0Var3, pruVarR2, mneVarH10);
            case 23:
                return new ati(this);
            case 24:
                return new eti(this);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new iti(this);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new kti(this);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new lti(this);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new nti(this);
            default:
                return new pti(this);
        }
    }
}
