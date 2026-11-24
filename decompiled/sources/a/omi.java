package a;

import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.LinkedHashMap;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes4.dex */
public final class omi implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25505a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ omi(Object obj, int i, byte b) {
        this.f25505a = b;
        this.c = obj;
        this.b = i;
    }

    private final Object a() {
        aqi aqiVar = (aqi) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new wpi(this);
            case 1:
                fl70 fl70Var = aqiVar.o;
                return new kpu(aqiVar.k, aqiVar.e.o(), aqiVar.p);
            case 2:
                fl70 fl70Var2 = aqiVar.o;
                return new wou(((g45) aqiVar.q.b).E(), aqiVar.k);
            case 3:
                fl70 fl70Var3 = aqiVar.o;
                return new epu(aqiVar.k, aqiVar.r);
            case 4:
                fl70 fl70Var4 = aqiVar.o;
                return new cpu(aqiVar.k, aqiVar.s);
            case 5:
                return new xpi(this);
            case 6:
                fl70 fl70Var5 = aqiVar.o;
                return new sou(aqiVar.k);
            case 7:
                return new ypi(this);
            case 8:
                fl70 fl70Var6 = aqiVar.o;
                pru pruVar = aqiVar.k;
                xyt xytVar = aqiVar.E;
                gst0 gst0Var = aqiVar.F;
                return new uou(((g45) aqiVar.q.b).E(), pruVar, new qgd(xytVar, new x1u(gst0Var, (byte) 1), new qf9(aqiVar.b()), new a6u((Object) aqiVar.C, (Object) pruVar, (Object) aqiVar.K, (Object) aqiVar.B, (Object) new k9c(new ort(gst0Var, (byte) 3)), (byte) 10), new rf9(aqiVar.b()), pruVar, aqiVar.r));
            case 9:
                std stdVar = aqiVar.G;
                return new agc0();
            case 10:
                std stdVar2 = aqiVar.G;
                bqc0 bqc0Var = new bqc0();
                bqc0Var.f3022a = iun.f15405a;
                return bqc0Var;
            case 11:
                std stdVar3 = aqiVar.G;
                cqc0 cqc0Var = new cqc0();
                cqc0Var.f4787a = iun.f15405a;
                return cqc0Var;
            case 12:
                return new zpi(this);
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object b() {
        byte b = this.b;
        if (b == 0) {
            return new fqi(this);
        }
        if (b == 1) {
            return new agc0();
        }
        if (b == 2) {
            bqc0 bqc0Var = new bqc0();
            bqc0Var.f3022a = iun.f15405a;
            return bqc0Var;
        }
        if (b != 3) {
            c99.h(b);
            return null;
        }
        cqc0 cqc0Var = new cqc0();
        cqc0Var.f4787a = iun.f15405a;
        return cqc0Var;
    }

    private final Object c() {
        yhi yhiVar = (yhi) this.c;
        gii0 gii0Var = (gii0) yhiVar.d;
        pmi0 pmi0Var = (pmi0) yhiVar.o;
        cad cadVar = (cad) yhiVar.f42638a;
        byte b = this.b;
        if (b == 0) {
            mne mneVarH = ((psc) cadVar.b).h();
            x1x.x(mneVarH);
            return new ghv(mneVarH, new zrc((q2m0) ((n5d0) yhiVar.u).get(), (byte) 1), new e1u((q2m0) ((n5d0) yhiVar.u).get()));
        }
        if (b == 1) {
            trm0 trm0Var = new trm0(gii0Var, (byte) 5);
            n7e0 n7e0Var = (n7e0) ((n5d0) yhiVar.c).get();
            l2m0 l2m0Var = (l2m0) yhiVar.e;
            knf0 knf0Var = (knf0) yhiVar.f;
            mne mneVarH2 = ((psc) cadVar.b).h();
            x1x.x(mneVarH2);
            return new q2m0(trm0Var, n7e0Var, l2m0Var, knf0Var, mneVarH2);
        }
        if (b == 2) {
            return new n7e0(gii0Var, (byte) 0);
        }
        if (b != 3) {
            c99.h(b);
            return null;
        }
        TypeStageId.Game game = (TypeStageId.Game) yhiVar.g;
        long jLongValue = ((Long) yhiVar.h).longValue();
        long jLongValue2 = ((Long) yhiVar.i).longValue();
        String str = (String) yhiVar.j;
        ctf0 ctf0Var = (ctf0) yhiVar.k;
        mne mneVarH3 = ((psc) cadVar.b).h();
        x1x.x(mneVarH3);
        i1w0 i1w0Var = (i1w0) yhiVar.l;
        ocl oclVar = (ocl) yhiVar.m;
        m1e m1eVar = (m1e) yhiVar.b;
        nfm0 nfm0VarA = ((daf) pmi0Var.f27236a).A();
        x1x.x(nfm0VarA);
        weu weuVar = new weu(nfm0VarA, (byte) 0);
        qzt qztVar = new qzt((pru) yhiVar.p, (byte) 0);
        fhj fhjVarR = ((daf) pmi0Var.f27236a).r();
        uyu uyuVar = (uyu) yhiVar.q;
        wyu wyuVar = (wyu) yhiVar.r;
        ivn ivnVar = new ivn((q2m0) ((n5d0) yhiVar.u).get());
        zrc zrcVar = new zrc((q2m0) ((n5d0) yhiVar.u).get(), (byte) 0);
        y2m0 y2m0Var = new y2m0((byte) 15);
        luu luuVarW = ((daf) ((ugf0) yhiVar.s).f35622a).w();
        x1x.x(luuVarW);
        return new umo0(game, jLongValue, jLongValue2, str, ctf0Var, mneVarH3, i1w0Var, oclVar, m1eVar, weuVar, qztVar, fhjVarR, uyuVar, wyuVar, ivnVar, zrcVar, y2m0Var, luuVarW, new zrc((q2m0) ((n5d0) yhiVar.u).get(), (byte) 1), new e1u((q2m0) ((n5d0) yhiVar.u).get()), ((daf) pmi0Var.f27236a).q(), (r9u) yhiVar.n);
    }

    private final Object d() {
        nc0 nc0Var = (nc0) this.c;
        byte b = this.b;
        if (b == 0) {
            jfi0 jfi0Var = (jfi0) ((n5d0) nc0Var.m).get();
            e5a e5aVar = new e5a((twz) ((n5d0) nc0Var.l).get(), (byte) 0);
            wqc wqcVar = new wqc((twz) ((n5d0) nc0Var.l).get(), (byte) 1);
            fqu fquVar = new fqu((twz) ((n5d0) nc0Var.l).get(), (byte) 2);
            woc wocVarB = ((w9i) ((pv00) nc0Var.h).f27640a).b();
            i1w0 i1w0Var = (i1w0) nc0Var.i;
            ctf0 ctf0Var = (ctf0) nc0Var.c;
            mne mneVarH = ((psc) ((cad) nc0Var.b).b).h();
            x1x.x(mneVarH);
            return new dde0(jfi0Var, e5aVar, wqcVar, fquVar, wocVarB, i1w0Var, ctf0Var, mneVarH, (duj) nc0Var.j);
        }
        if (b == 1) {
            twz twzVar = (twz) ((n5d0) nc0Var.l).get();
            twzVar.getClass();
            return new jfi0(twzVar);
        }
        if (b == 2) {
            return euw.k((htz) nc0Var.d, (lwz) ((n5d0) nc0Var.k).get(), (kwz) nc0Var.f, (njo) nc0Var.g, (btt0) nc0Var.f23267a, (ctf0) nc0Var.c);
        }
        if (b != 3) {
            c99.h(b);
            return null;
        }
        gii0 gii0Var = (gii0) nc0Var.e;
        gii0Var.getClass();
        return new lwz(gii0Var);
    }

    private final Object e() {
        gri griVar = (gri) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                wsf0 wsf0Var = new wsf0(griVar.f11778a, (byte) 15);
                zj8 zj8Var = (zj8) griVar.n.get();
                knf0 knf0Var = griVar.b;
                mne mneVarH = ((psc) griVar.c.b).h();
                x1x.x(mneVarH);
                return new oue0(wsf0Var, zj8Var, knf0Var, mneVarH, griVar.d, (no) griVar.o.get());
            case 1:
                return new zj8();
            case 2:
                return new no();
            case 3:
                e1f0 e1f0Var = (e1f0) griVar.q.get();
                iw20 iw20Var = new iw20(griVar.f11778a, (byte) 19);
                knf0 knf0Var2 = griVar.b;
                mne mneVarH2 = ((psc) griVar.c.b).h();
                x1x.x(mneVarH2);
                return new g8f0(e1f0Var, iw20Var, knf0Var2, mneVarH2);
            case 4:
                return new e1f0(griVar.e);
            case 5:
                wsf0 wsf0Var2 = new wsf0(griVar.f11778a, (byte) 23);
                fkc fkcVar = (fkc) griVar.s.get();
                knf0 knf0Var3 = griVar.b;
                mne mneVarH3 = ((psc) griVar.c.b).h();
                x1x.x(mneVarH3);
                return new gkc(wsf0Var2, fkcVar, knf0Var3, mneVarH3);
            case 6:
                fkc fkcVar2 = new fkc();
                fkcVar2.f9684a = new LinkedHashMap();
                return fkcVar2;
            case 7:
                onv onvVar = new onv(griVar.f11778a, (byte) 29);
                xse0 xse0Var = (xse0) griVar.u.get();
                knf0 knf0Var4 = griVar.b;
                mne mneVarH4 = ((psc) griVar.c.b).h();
                x1x.x(mneVarH4);
                return new yse0(onvVar, xse0Var, knf0Var4, mneVarH4);
            case 8:
                xse0 xse0Var2 = new xse0();
                xse0Var2.f41413a = new LinkedHashMap();
                return xse0Var2;
            case 9:
                return new tv3(griVar.f);
            case 10:
                r7v r7vVar = new r7v(griVar.f11778a, (byte) 24);
                ikc ikcVar = (ikc) griVar.x.get();
                knf0 knf0Var5 = griVar.b;
                mne mneVarH5 = ((psc) griVar.c.b).h();
                x1x.x(mneVarH5);
                return new kkc(r7vVar, ikcVar, knf0Var5, mneVarH5);
            case 11:
                ikc ikcVar2 = new ikc();
                ikcVar2.f14919a = iun.f15405a;
                return ikcVar2;
            case 12:
                yqc yqcVar = new yqc(griVar.f11778a);
                gyk gykVar = (gyk) griVar.z.get();
                knf0 knf0Var6 = griVar.b;
                mne mneVarH6 = ((psc) griVar.c.b).h();
                x1x.x(mneVarH6);
                return new jyk(yqcVar, gykVar, knf0Var6, mneVarH6);
            case 13:
                gyk gykVar2 = new gyk();
                gykVar2.f12133a = new LinkedHashMap();
                return gykVar2;
            case 14:
                nr00 nr00Var = new nr00(griVar.f11778a, (byte) 15);
                knf0 knf0Var7 = griVar.b;
                mne mneVarH7 = ((psc) griVar.c.b).h();
                x1x.x(mneVarH7);
                return new t090(nr00Var, knf0Var7, mneVarH7);
            case 15:
                return new d4c(new r7v(griVar.f11778a, (byte) 22));
            case 16:
                return new l1f0((hsn) griVar.D.get());
            case 17:
                return new hsn();
            case 18:
                jw20 jw20Var = new jw20(griVar.f11778a, (byte) 21);
                mne mneVarH8 = ((psc) griVar.c.b).h();
                x1x.x(mneVarH8);
                return new y1f0(jw20Var, mneVarH8);
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object f() {
        wri wriVar = (wri) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new i6i(this, (byte) 9);
            case 1:
                sek sekVar = wriVar.b;
                s7t0 s7t0Var = (s7t0) wriVar.D.get();
                pbt pbtVarL2 = wriVar.f39644a.L2();
                x1x.x(pbtVarL2);
                return i5t.r(sekVar, s7t0Var, pbtVarL2);
            case 2:
                sek sekVar2 = wriVar.b;
                g8i g8iVar = wriVar.f39644a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                d3c d3cVar = (d3c) wriVar.e.get();
                fq fqVar = (fq) wriVar.x.get();
                qpt qptVar = (qpt) wriVar.y.get();
                gmt gmtVar = (gmt) wriVar.j.get();
                rgs rgsVar = (rgs) wriVar.C.get();
                r9u r9uVarH4 = g8iVar.h4();
                x1x.x(r9uVarH4);
                return i5t.C(sekVar2, pbtVarL3, d3cVar, fqVar, qptVar, gmtVar, rgsVar, r9uVarH4);
            case 3:
                sek sekVar3 = wriVar.b;
                pbt pbtVarL4 = wriVar.f39644a.L2();
                x1x.x(pbtVarL4);
                return new d3c(pbtVarL4);
            case 4:
                sek sekVar4 = wriVar.b;
                lzt lztVar = (lzt) wriVar.f.get();
                zmi0 zmi0Var = (zmi0) wriVar.g.get();
                pbt pbtVarL5 = wriVar.f39644a.L2();
                x1x.x(pbtVarL5);
                return mkg.g(sekVar4, lztVar, zmi0Var, pbtVarL5, (xyb) wriVar.h.get(), (yyb) wriVar.l.get(), (fpi0) wriVar.m.get(), (nqt) wriVar.n.get(), (spx) wriVar.o.get(), (oqt) wriVar.p.get(), (hni0) wriVar.q.get(), (vcu) wriVar.r.get(), (d3c) wriVar.e.get(), (wni0) wriVar.s.get(), (ztt) wriVar.k.get(), (pqt) wriVar.t.get(), (itt) wriVar.u.get(), (q78) wriVar.v.get(), (gmt) wriVar.j.get(), (ecs) wriVar.w.get());
            case 5:
                sek sekVar5 = wriVar.b;
                g8i g8iVar2 = wriVar.f39644a;
                pbt pbtVarL6 = g8iVar2.L2();
                x1x.x(pbtVarL6);
                m1e m1eVarQ1 = g8iVar2.q1();
                x1x.x(m1eVarQ1);
                return new lzt(pbtVarL6, m1eVarQ1);
            case 6:
                sek sekVar6 = wriVar.b;
                pbt pbtVarL7 = wriVar.f39644a.L2();
                x1x.x(pbtVarL7);
                return new zmi0(pbtVarL7);
            case 7:
                sek sekVar7 = wriVar.b;
                pbt pbtVarL8 = wriVar.f39644a.L2();
                x1x.x(pbtVarL8);
                return new xyb(pbtVarL8);
            case 8:
                sek sekVar8 = wriVar.b;
                k1u k1uVar = (k1u) wriVar.i.get();
                gmt gmtVar2 = (gmt) wriVar.j.get();
                ztt zttVar = (ztt) wriVar.k.get();
                pbt pbtVarL9 = wriVar.f39644a.L2();
                x1x.x(pbtVarL9);
                return i5t.a(sekVar8, k1uVar, gmtVar2, zttVar, pbtVarL9);
            case 9:
                sek sekVar9 = wriVar.b;
                return new k1u(wriVar.b());
            case 10:
                sek sekVar10 = wriVar.b;
                pbt pbtVarL10 = wriVar.f39644a.L2();
                x1x.x(pbtVarL10);
                return new gmt(pbtVarL10);
            case 11:
                sek sekVar11 = wriVar.b;
                pbt pbtVarL11 = wriVar.f39644a.L2();
                x1x.x(pbtVarL11);
                return new ztt(pbtVarL11);
            case 12:
                sek sekVar12 = wriVar.b;
                pbt pbtVarL12 = wriVar.f39644a.L2();
                x1x.x(pbtVarL12);
                return new fpi0(pbtVarL12);
            case 13:
                sek sekVar13 = wriVar.b;
                pbt pbtVarL13 = wriVar.f39644a.L2();
                x1x.x(pbtVarL13);
                return new nqt(pbtVarL13);
            case 14:
                sek sekVar14 = wriVar.b;
                pbt pbtVarL14 = wriVar.f39644a.L2();
                x1x.x(pbtVarL14);
                return new spx(pbtVarL14);
            case 15:
                sek sekVar15 = wriVar.b;
                pbt pbtVarL15 = wriVar.f39644a.L2();
                x1x.x(pbtVarL15);
                return new oqt(pbtVarL15);
            case 16:
                sek sekVar16 = wriVar.b;
                pbt pbtVarL16 = wriVar.f39644a.L2();
                x1x.x(pbtVarL16);
                return new hni0(pbtVarL16);
            case 17:
                sek sekVar17 = wriVar.b;
                pbt pbtVarL17 = wriVar.f39644a.L2();
                x1x.x(pbtVarL17);
                return new vcu(pbtVarL17);
            case 18:
                sek sekVar18 = wriVar.b;
                pbt pbtVarL18 = wriVar.f39644a.L2();
                x1x.x(pbtVarL18);
                return new wni0(pbtVarL18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar19 = wriVar.b;
                pbt pbtVarL19 = wriVar.f39644a.L2();
                x1x.x(pbtVarL19);
                return new pqt(pbtVarL19);
            case 20:
                sek sekVar20 = wriVar.b;
                pbt pbtVarL20 = wriVar.f39644a.L2();
                x1x.x(pbtVarL20);
                return new itt(pbtVarL20);
            case 21:
                sek sekVar21 = wriVar.b;
                pbt pbtVarL21 = wriVar.f39644a.L2();
                x1x.x(pbtVarL21);
                return new q78(pbtVarL21);
            case 22:
                sek sekVar22 = wriVar.b;
                pbt pbtVarL22 = wriVar.f39644a.L2();
                x1x.x(pbtVarL22);
                return new ecs(pbtVarL22);
            case 23:
                sek sekVar23 = wriVar.b;
                pbt pbtVarL23 = wriVar.f39644a.L2();
                x1x.x(pbtVarL23);
                return new qpt(pbtVarL23);
            case 24:
                sek sekVar24 = wriVar.b;
                fq fqVar2 = (fq) wriVar.x.get();
                fqx fqxVar = (fqx) wriVar.z.get();
                wox woxVar = (wox) wriVar.A.get();
                return i5t.g(fqVar2, sekVar24, (qpt) wriVar.y.get(), (r8u) wriVar.B.get(), woxVar, fqxVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar25 = wriVar.b;
                pbt pbtVarL24 = wriVar.f39644a.L2();
                x1x.x(pbtVarL24);
                return new fqx(pbtVarL24);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar26 = wriVar.b;
                pbt pbtVarL25 = wriVar.f39644a.L2();
                x1x.x(pbtVarL25);
                return new wox(pbtVarL25);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar27 = wriVar.b;
                pbt pbtVarL26 = wriVar.f39644a.L2();
                x1x.x(pbtVarL26);
                return new r8u(pbtVarL26);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                sek sekVar28 = wriVar.b;
                pbt pbtVarL27 = wriVar.f39644a.L2();
                x1x.x(pbtVarL27);
                return new qa60(pbtVarL27);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar29 = wriVar.b;
                pbt pbtVarL28 = wriVar.f39644a.L2();
                x1x.x(pbtVarL28);
                return new ipi0(pbtVarL28);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                sek sekVar30 = wriVar.b;
                pbt pbtVarL29 = wriVar.f39644a.L2();
                x1x.x(pbtVarL29);
                return new xsi0(pbtVarL29);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                sek sekVar31 = wriVar.b;
                pbt pbtVarL30 = wriVar.f39644a.L2();
                x1x.x(pbtVarL30);
                return new gpx(pbtVarL30);
            case 32:
                sek sekVar32 = wriVar.b;
                pbt pbtVarL31 = wriVar.f39644a.L2();
                x1x.x(pbtVarL31);
                return new vni0(pbtVarL31);
            case 33:
                sek sekVar33 = wriVar.b;
                pbt pbtVarL32 = wriVar.f39644a.L2();
                x1x.x(pbtVarL32);
                return new hs(pbtVarL32);
            case 34:
                sek sekVar34 = wriVar.b;
                pbt pbtVarL33 = wriVar.f39644a.L2();
                x1x.x(pbtVarL33);
                return new eni0(pbtVarL33);
            case 35:
                return i5t.z(wriVar.b, (aws) wriVar.M.get());
            case 36:
                sek sekVar35 = wriVar.b;
                yvs yvsVarG2 = wriVar.f39644a.G2();
                x1x.x(yvsVarG2);
                return new aws(yvsVarG2);
            case 37:
                sek sekVar36 = wriVar.b;
                pbt pbtVarL34 = wriVar.f39644a.L2();
                x1x.x(pbtVarL34);
                return new hj50(pbtVarL34);
            case 38:
                sek sekVar37 = wriVar.b;
                pbt pbtVarL35 = wriVar.f39644a.L2();
                x1x.x(pbtVarL35);
                return new qhf0(pbtVarL35);
            case 39:
                return i5t.d(wriVar.b, (foi0) wriVar.Q.get(), (fq) wriVar.x.get());
            case 40:
                sek sekVar38 = wriVar.b;
                pbt pbtVarL36 = wriVar.f39644a.L2();
                x1x.x(pbtVarL36);
                return new foi0(pbtVarL36);
            case 41:
                sek sekVar39 = wriVar.b;
                fq fqVar3 = (fq) wriVar.x.get();
                r8u r8uVar = (r8u) wriVar.B.get();
                return i5t.B(fqVar3, sekVar39, (qpt) wriVar.y.get(), r8uVar, (wox) wriVar.A.get(), (fqx) wriVar.z.get());
            case 42:
                zie0 zie0Var = wriVar.c;
                return new y5s(s470.RESIDENT, false, true, false, true, false, 448);
            case 43:
                return i5t.b(wriVar.b, (fq) wriVar.x.get(), (fqx) wriVar.z.get());
            case 44:
                return i5t.c(wriVar.b, (aws) wriVar.M.get());
            case 45:
                sek sekVar40 = wriVar.b;
                pbt pbtVarL37 = wriVar.f39644a.L2();
                x1x.x(pbtVarL37);
                return new hsj0(pbtVarL37);
            case 46:
                sek sekVar41 = wriVar.b;
                g8i g8iVar3 = wriVar.f39644a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL38 = g8iVar3.L2();
                x1x.x(pbtVarL38);
                return new t0u(pbtVarL38, wsf0VarF0);
            case 47:
                sek sekVar42 = wriVar.b;
                pbt pbtVarL39 = wriVar.f39644a.L2();
                x1x.x(pbtVarL39);
                return new tbu(pbtVarL39);
            case 48:
                return i5t.f(wriVar.b, (a6s) wriVar.Z.get());
            case 49:
                return i5t.e(wriVar.b);
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                return new aqf0((fqf0) wriVar.e0.get(), (uqf0) wriVar.g0.get(), (bsf0) wriVar.h0.get(), (fsf0) wriVar.i0.get(), (pqf0) wriVar.j0.get(), (i5m0) wriVar.n0.get(), (ecs) wriVar.w.get(), (s7t0) wriVar.D.get(), (fq) wriVar.x.get(), (qa60) wriVar.F.get(), (xcc) wriVar.U.get(), (vcu) wriVar.r.get(), (vrs0) wriVar.S.get(), (qni0) wriVar.l0.get(), (itt) wriVar.u.get(), (cpi0) wriVar.o0.get(), (t0u) wriVar.X.get(), wriVar.f39644a.v1());
            case 51:
                zie0 zie0Var2 = wriVar.c;
                drf0 drf0Var = (drf0) wriVar.d0.get();
                qpt qptVar2 = (qpt) wriVar.y.get();
                wsf0 wsf0VarF1 = wriVar.f39644a.f0();
                drf0Var.getClass();
                qptVar2.getClass();
                return new fqf0(drf0Var, qptVar2, wsf0VarF1);
            case 52:
                knf0 knf0VarJ8 = wriVar.f39644a.J8();
                x1x.x(knf0VarJ8);
                xqf0 xqf0Var = (xqf0) wriVar.c0.get();
                btt0 btt0VarO8 = wriVar.f39644a.o8();
                x1x.x(btt0VarO8);
                return new drf0(knf0VarJ8, xqf0Var, btt0VarO8);
            case 53:
                zie0 zie0Var3 = wriVar.c;
                gii0 gii0VarJ9 = wriVar.f39644a.j9();
                x1x.x(gii0VarJ9);
                return new xqf0(gii0VarJ9);
            case 54:
                zie0 zie0Var4 = wriVar.c;
                drf0 drf0Var2 = (drf0) wriVar.d0.get();
                do00 do00Var = (do00) wriVar.f0.get();
                drf0Var2.getClass();
                do00Var.getClass();
                return new uqf0(drf0Var2, do00Var);
            case 55:
                zie0 zie0Var5 = wriVar.c;
                g8i g8iVar4 = wriVar.f39644a;
                pbt pbtVarL40 = g8iVar4.L2();
                x1x.x(pbtVarL40);
                return new do00(pbtVarL40, g8iVar4.f0());
            case 56:
                zie0 zie0Var6 = wriVar.c;
                drf0 drf0Var3 = (drf0) wriVar.d0.get();
                gmt gmtVar3 = (gmt) wriVar.j.get();
                ztt zttVar2 = (ztt) wriVar.k.get();
                itt ittVar = (itt) wriVar.u.get();
                drf0Var3.getClass();
                gmtVar3.getClass();
                zttVar2.getClass();
                ittVar.getClass();
                return new bsf0(drf0Var3, gmtVar3, zttVar2, ittVar);
            case 57:
                zie0 zie0Var7 = wriVar.c;
                drf0 drf0Var4 = (drf0) wriVar.d0.get();
                gmt gmtVar4 = (gmt) wriVar.j.get();
                drf0Var4.getClass();
                gmtVar4.getClass();
                return new fsf0(drf0Var4, gmtVar4);
            case 58:
                zie0 zie0Var8 = wriVar.c;
                drf0 drf0Var5 = (drf0) wriVar.d0.get();
                ztt zttVar3 = (ztt) wriVar.k.get();
                do00 do00Var2 = (do00) wriVar.f0.get();
                drf0Var5.getClass();
                zttVar3.getClass();
                do00Var2.getClass();
                return new pqf0(drf0Var5, zttVar3, do00Var2);
            case 59:
                return i5t.A(wriVar.b, (fq) wriVar.x.get(), wriVar.f39644a.f0(), (g9c) wriVar.k0.get(), (itt) wriVar.u.get(), (yyb) wriVar.l.get(), (lg60) wriVar.m0.get());
            case 60:
                sek sekVar43 = wriVar.b;
                pbt pbtVarL41 = wriVar.f39644a.L2();
                x1x.x(pbtVarL41);
                return new g9c(pbtVarL41);
            case 61:
                sek sekVar44 = wriVar.b;
                qni0 qni0Var = (qni0) wriVar.l0.get();
                pbt pbtVarL42 = wriVar.f39644a.L2();
                x1x.x(pbtVarL42);
                return i5t.v(sekVar44, qni0Var, pbtVarL42);
            case 62:
                sek sekVar45 = wriVar.b;
                pbt pbtVarL43 = wriVar.f39644a.L2();
                x1x.x(pbtVarL43);
                return new qni0(pbtVarL43);
            case 63:
                zie0 zie0Var9 = wriVar.c;
                pbt pbtVarL44 = wriVar.f39644a.L2();
                x1x.x(pbtVarL44);
                return new cpi0(pbtVarL44);
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object g() {
        byte b = this.b;
        if (b == 0) {
            return new fsi(this);
        }
        if (b == 1) {
            return new t5g0();
        }
        if (b == 2) {
            return new o5g0();
        }
        c99.h(b);
        return null;
    }

    @Override // a.o5d0
    public final Object get() {
        byte b = this.f25505a;
        Object obj = this.c;
        byte b2 = 1;
        byte b3 = this.b;
        switch (b) {
            case 0:
                g8i g8iVar = (g8i) ((pmi) obj).b;
                if (b3 == 0) {
                    return new nmi(this);
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        return new psc((Object) this, (byte) 15);
                    }
                    c99.h(b3);
                    return null;
                }
                pbt pbtVarL2 = g8iVar.L2();
                x1x.x(pbtVarL2);
                return new k370(new cyu(new dhu(pbtVarL2, (byte) 1), g8iVar.f5(), g8iVar.X0()), g8iVar.Ha(), g8iVar.v1(), g8iVar.r3(), g8iVar.n4(), g8iVar.p4(), g8iVar.o4(), g8iVar.u4(), g8iVar.t4(), g8iVar.z4(), new nw20(g8iVar.p4(), g8iVar.o4()), new nvu(g8iVar.u4(), g8iVar.t4(), g8iVar.p4(), (byte) 11), g8iVar.d1(), g8iVar.B7());
            case 1:
                tmi tmiVar = (tmi) obj;
                switch (b3) {
                    case 0:
                        return new smi(this);
                    case 1:
                        oct octVarC = tmiVar.d.c();
                        x1x.x(octVarC);
                        return octVarC;
                    case 2:
                        return ((pmi) tmiVar.e.f23980a).u();
                    case 3:
                        return new jqt(tmiVar.f);
                    case 4:
                        return new hkt0(tmiVar.g);
                    case 5:
                        return new ysi0((h3v0) tmiVar.D.get());
                    case 6:
                        btt0 btt0Var = tmiVar.h;
                        s2v0 s2v0Var = (s2v0) tmiVar.C.get();
                        mne mneVarH = ((psc) tmiVar.i.b).h();
                        x1x.x(mneVarH);
                        return new h3v0(btt0Var, s2v0Var, mneVarH, new lsn(tmiVar.j), tmiVar.k, tmiVar.l, tmiVar.m);
                    case 7:
                        return new s2v0();
                    case 8:
                        return new jj50((h3v0) tmiVar.D.get());
                    case 9:
                        return new dcu(new scu(tmiVar.g, tmiVar.f), tmiVar.n);
                    case 10:
                        return new ycu(new zcu(tmiVar.g, tmiVar.f), tmiVar.n);
                    case 11:
                        return new ucu(new scu(tmiVar.g, tmiVar.f), tmiVar.n);
                    case 12:
                        return tmiVar.o.a();
                    case 13:
                        return ((g45) tmiVar.o.b).q();
                    case 14:
                        return ((g45) tmiVar.o.b).y();
                    case 15:
                        return ((g45) tmiVar.o.b).F();
                    case 16:
                        return ((g45) tmiVar.o.b).E();
                    case 17:
                        return tmiVar.o.q();
                    case 18:
                        return tmiVar.o.b();
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        return new zmi0(tmiVar.g);
                    case 20:
                        return tmiVar.o.g();
                    case 21:
                        wsf0 wsf0Var = tmiVar.o;
                        return new bsu();
                    case 22:
                        return new vti0((h3v0) tmiVar.D.get(), tmiVar.g);
                    case 23:
                        return new m6v(new bzu((h3v0) tmiVar.D.get()), tmiVar.n, (k9c) tmiVar.V.f44459a);
                    case 24:
                        return new n6v((h3v0) tmiVar.D.get());
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return new h6v((h3v0) tmiVar.D.get(), new scu(tmiVar.g, tmiVar.f), tmiVar.n);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return new l6v((h3v0) tmiVar.D.get(), new scu(tmiVar.g, tmiVar.f), tmiVar.n, ((uii) tmiVar.p.f15470a).r());
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        return new e5c(new dhu(tmiVar.g, (byte) 0), tmiVar.o);
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        n5d0 n5d0Var = tmiVar.D;
                        gst0 gst0Var = tmiVar.f;
                        pbt pbtVar = tmiVar.g;
                        return new j6v((h3v0) n5d0Var.get(), new scu(pbtVar, gst0Var), tmiVar.n, new ipu(pbtVar, gst0Var));
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        return new kyg0(tmiVar.g);
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        return new leu(tmiVar.q);
                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        return tmiVar.r.P0();
                    case 32:
                        return new hs60(tmiVar.s);
                    case 33:
                        return tmiVar.r.C();
                    case 34:
                        ynb ynbVarI = ((yzn0) tmiVar.u.b).i();
                        x1x.x(ynbVarI);
                        return ynbVarI;
                    default:
                        c99.h(b3);
                        return null;
                }
            case 2:
                wmi wmiVar = (wmi) obj;
                switch (b3) {
                    case 0:
                        return new ukt0((uuy) wmiVar.l.get());
                    case 1:
                        return new uuy(wmiVar.f39408a);
                    case 2:
                        return new uqc((uuy) wmiVar.l.get());
                    case 3:
                        return new grc((nr70) wmiVar.q.get());
                    case 4:
                        yuy yuyVar = (yuy) wmiVar.o.get();
                        huy huyVar = (huy) wmiVar.p.get();
                        lbu lbuVar = new lbu(wmiVar.c, (byte) 26);
                        knf0 knf0Var = wmiVar.d;
                        mne mneVarH2 = ((psc) wmiVar.e.b).h();
                        x1x.x(mneVarH2);
                        return new nr70(yuyVar, huyVar, lbuVar, knf0Var, mneVarH2);
                    case 5:
                        return new yuy();
                    case 6:
                        vwb0 vwb0Var = wmiVar.b;
                        vwb0Var.getClass();
                        return new huy(vwb0Var);
                    case 7:
                        return new pzt((pke) wmiVar.t.get());
                    case 8:
                        return new pke((qke) wmiVar.s.get());
                    case 9:
                        return new qke();
                    case 10:
                        return new lyg0((tq70) wmiVar.w.get());
                    case 11:
                        return new tq70((sq70) wmiVar.v.get());
                    case 12:
                        vwb0 vwb0Var2 = wmiVar.b;
                        vby vbyVar = wmiVar.f;
                        vwb0Var2.getClass();
                        vbyVar.getClass();
                        return new sq70(vwb0Var2, vbyVar);
                    case 13:
                        return new iqx((ep9) wmiVar.z.get());
                    case 14:
                        return new ep9((dp9) wmiVar.y.get());
                    case 15:
                        return new dp9();
                    case 16:
                        return new wri0((ep9) wmiVar.z.get());
                    case 17:
                        return new hqx((ep9) wmiVar.z.get());
                    case 18:
                        return new pht0((pke) wmiVar.t.get());
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        return new vuy((uuy) wmiVar.l.get());
                    case 20:
                        return new vkt0((uuy) wmiVar.l.get());
                    case 21:
                        return new iyg0((uuy) wmiVar.l.get());
                    case 22:
                        return new wpx((uuy) wmiVar.l.get());
                    case 23:
                        return new xpx((uuy) wmiVar.l.get());
                    case 24:
                        return new qmu((tq70) wmiVar.w.get());
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        return new pmu((tq70) wmiVar.w.get());
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return new mo00((nr70) wmiVar.q.get(), wmiVar.g);
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        return new tgu((nr70) wmiVar.q.get());
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return new vri0((nr70) wmiVar.q.get());
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        return new omu((tq70) wmiVar.w.get(), (nr70) wmiVar.q.get());
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        return new cqx((onk0) wmiVar.Q.get());
                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        return new onk0((mnk0) wmiVar.P.get());
                    case 32:
                        return new mnk0();
                    case 33:
                        return new irx((onk0) wmiVar.Q.get());
                    case 34:
                        return new aqi0((onk0) wmiVar.Q.get());
                    case 35:
                        return new uti0((onk0) wmiVar.Q.get());
                    case 36:
                        return new a6k0(wmiVar.h, new bzt(wmiVar.i), wmiVar.j);
                    case 37:
                        return new rlt0((gt70) wmiVar.W.get());
                    case 38:
                        return new gt70(wmiVar.k);
                    case 39:
                        return new qlt0((gt70) wmiVar.W.get());
                    case 40:
                        return new rmu((gt70) wmiVar.W.get());
                    case 41:
                        return new smu((gt70) wmiVar.W.get());
                    default:
                        c99.h(b3);
                        return null;
                }
            case 3:
                h6i h6iVar = (h6i) obj;
                gst0 gst0Var2 = (gst0) h6iVar.h;
                yfu yfuVar = (yfu) h6iVar.k;
                gr70 gr70Var = (gr70) h6iVar.f;
                if (b3 != 0) {
                    if (b3 == 1) {
                        return new xs70((js70) h6iVar.m);
                    }
                    if (b3 == 2) {
                        return new ql((ol) h6iVar.n);
                    }
                    c99.h(b3);
                    return null;
                }
                i1w0 i1w0Var = (i1w0) h6iVar.d;
                mne mneVarH3 = ((psc) ((cad) h6iVar.f12530a).b).h();
                x1x.x(mneVarH3);
                uq70 uq70Var = (uq70) h6iVar.b;
                m1e m1eVar = (m1e) h6iVar.e;
                pzt pztVarQ = gr70Var.q();
                x1x.x(pztVarQ);
                hqx hqxVarN = gr70Var.n();
                x1x.x(hqxVarN);
                irx irxVarG = gr70Var.g();
                x1x.x(irxVarG);
                cqx cqxVarB = gr70Var.B();
                x1x.x(cqxVarB);
                wri0 wri0VarY = gr70Var.y();
                x1x.x(wri0VarY);
                uti0 uti0VarA = gr70Var.A();
                x1x.x(uti0VarA);
                aqi0 aqi0VarC = gr70Var.c();
                x1x.x(aqi0VarC);
                tgu tguVarA = gr70Var.a();
                x1x.x(tguVarA);
                mo00 mo00VarI = gr70Var.i();
                x1x.x(mo00VarI);
                a6u a6uVar = new a6u(new rou((b3c0) h6iVar.g, (byte) 0), (gst0) h6iVar.h, (j1q0) h6iVar.i, (ieu) h6iVar.j, yfuVar);
                qmu qmuVarB = gr70Var.b();
                x1x.x(qmuVarB);
                omu omuVarF = gr70Var.f();
                x1x.x(omuVarF);
                pmu pmuVarT = gr70Var.t();
                x1x.x(pmuVarT);
                vuy vuyVarK = gr70Var.k();
                x1x.x(vuyVarK);
                vkt0 vkt0VarX = gr70Var.x();
                x1x.x(vkt0VarX);
                t4v t4vVar = new t4v(gst0Var2, (byte) 0);
                wyu wyuVar = (wyu) h6iVar.l;
                vri0 vri0VarE = gr70Var.e();
                x1x.x(vri0VarE);
                uqc uqcVarL = gr70Var.l();
                x1x.x(uqcVarL);
                ukt0 ukt0VarD = gr70Var.d();
                x1x.x(ukt0VarD);
                xpx xpxVarS = gr70Var.s();
                x1x.x(xpxVarS);
                iyg0 iyg0VarJ = gr70Var.j();
                x1x.x(iyg0VarJ);
                pv00 pv00Var = new pv00((xs70) ((n5d0) h6iVar.c).get());
                xfu xfuVar = new xfu((xs70) ((n5d0) h6iVar.c).get());
                xs70 xs70Var = (xs70) ((n5d0) h6iVar.c).get();
                xs70Var.getClass();
                do20 do20Var = new do20();
                do20Var.f6397a = xs70Var;
                return new bv70(i1w0Var, mneVarH3, uq70Var, m1eVar, pztVarQ, hqxVarN, irxVarG, cqxVarB, wri0VarY, uti0VarA, aqi0VarC, tguVarA, mo00VarI, a6uVar, qmuVarB, omuVarF, pmuVarT, vuyVarK, vkt0VarX, t4vVar, wyuVar, vri0VarE, uqcVarL, ukt0VarD, xpxVarS, iyg0VarJ, pv00Var, xfuVar, do20Var, new iqi((Object) yfuVar, (Object) new x1u(gst0Var2, (byte) 1), (byte) 16), new nv20((ql) ((n5d0) h6iVar.o).get()), new p4u((xs70) ((n5d0) h6iVar.c).get()));
            case 4:
                rrd rrdVar = (rrd) obj;
                if (b3 == 0) {
                    return new ws70((ctf0) rrdVar.b, new zpu((ps70) ((n5d0) rrdVar.g).get(), (ql) ((n5d0) rrdVar.h).get()), (String) rrdVar.e, (mne) rrdVar.f);
                }
                if (b3 == 1) {
                    return new ps70(new nv20((gii0) rrdVar.c, (byte) 7));
                }
                if (b3 == 2) {
                    return new ql((ol) rrdVar.d);
                }
                c99.h(b3);
                return null;
            case 5:
                daf dafVar = (daf) obj;
                gr70 gr70Var2 = (gr70) dafVar.d;
                if (b3 != 0) {
                    if (b3 == 1) {
                        return new ps70(new nv20((gii0) dafVar.g, (byte) 7));
                    }
                    if (b3 == 2) {
                        return new ql((ol) dafVar.h);
                    }
                    if (b3 == 3) {
                        return new xs70((js70) dafVar.i);
                    }
                    c99.h(b3);
                    return null;
                }
                String str = (String) dafVar.b;
                mne mneVarH4 = ((psc) ((cad) dafVar.c).b).h();
                x1x.x(mneVarH4);
                pht0 pht0VarU = gr70Var2.u();
                x1x.x(pht0VarU);
                hqx hqxVarN2 = gr70Var2.n();
                x1x.x(hqxVarN2);
                uq70 uq70Var2 = (uq70) dafVar.e;
                m1e m1eVar2 = (m1e) dafVar.f;
                wri0 wri0VarY2 = gr70Var2.y();
                x1x.x(wri0VarY2);
                rlt0 rlt0VarZ = gr70Var2.z();
                x1x.x(rlt0VarZ);
                qlt0 qlt0VarR = gr70Var2.r();
                x1x.x(qlt0VarR);
                ps70 ps70Var = (ps70) ((n5d0) dafVar.j).get();
                ql qlVar = (ql) ((n5d0) dafVar.k).get();
                ps70Var.getClass();
                qlVar.getClass();
                xr xrVar = new xr();
                xrVar.f41344a = ps70Var;
                xrVar.b = qlVar;
                xfu xfuVar2 = new xfu((xs70) ((n5d0) dafVar.l).get());
                xs70 xs70Var2 = (xs70) ((n5d0) dafVar.l).get();
                xs70Var2.getClass();
                ani0 ani0Var = new ani0();
                ani0Var.f1155a = xs70Var2;
                return new rt70(str, mneVarH4, pht0VarU, hqxVarN2, uq70Var2, m1eVar2, wri0VarY2, rlt0VarZ, qlt0VarR, xrVar, xfuVar2, ani0Var);
            case 6:
                cni cniVar = (cni) obj;
                cad cadVar = cniVar.f;
                pp90 pp90Var = cniVar.e;
                if (b3 != 0) {
                    if (b3 != 1) {
                        if (b3 == 2) {
                            return new bni(this);
                        }
                        c99.h(b3);
                        return null;
                    }
                    ok50 ok50Var = new ok50(cniVar.i, (byte) 22);
                    knf0 knf0Var2 = cniVar.j;
                    mne mneVarH5 = ((psc) cadVar.b).h();
                    x1x.x(mneVarH5);
                    return new ju9(mneVarH5, ok50Var, knf0Var2, cniVar.k);
                }
                pru pruVar = cniVar.f4657a;
                vqb vqbVarA = ((gbi) cniVar.b.f19899a).A();
                m1e m1eVar3 = cniVar.c;
                x1u x1uVar = cniVar.d;
                gnu gnuVarA = pp90Var.a();
                x1x.x(gnuVarA);
                ali aliVarE = pp90Var.e();
                x1x.x(aliVarE);
                mne mneVarH6 = ((psc) cadVar.b).h();
                x1x.x(mneVarH6);
                z4w0 z4w0Var = cniVar.g;
                cyh cyhVar = cniVar.h;
                nv20 nv20Var = new nv20((ju9) cniVar.w.get());
                es esVar = cniVar.l;
                rpt rptVar = cniVar.m;
                cmt cmtVar = new cmt((ju9) cniVar.w.get());
                ivn ivnVar = new ivn((ju9) cniVar.w.get());
                p4u p4uVar = new p4u((ju9) cniVar.w.get());
                duj dujVar = cniVar.n;
                ctf0 ctf0Var = cniVar.o;
                tkt0 tkt0VarD = pp90Var.d();
                x1x.x(tkt0VarD);
                return new aa80(pruVar, vqbVarA, m1eVar3, x1uVar, gnuVarA, aliVarE, mneVarH6, z4w0Var, cyhVar, nv20Var, esVar, rptVar, cmtVar, ivnVar, p4uVar, dujVar, ctf0Var, tkt0VarD, cniVar.p, new chf0((Object) new zg(cniVar.q, (byte) 5), (Object) cniVar.r, (byte) 14), cniVar.s);
            case 7:
                mni mniVar = (mni) obj;
                d1p d1pVar = mniVar.k;
                if (b3 == 0) {
                    return new kni(this);
                }
                if (b3 == 1) {
                    return d1pVar.R();
                }
                if (b3 == 2) {
                    return ((psc) mniVar.m.b).j();
                }
                if (b3 == 3) {
                    return d1pVar.d0();
                }
                if (b3 == 4) {
                    return new lni(this);
                }
                c99.h(b3);
                return null;
            case 8:
                o9i o9iVar = (o9i) obj;
                d1p d1pVar2 = (d1p) o9iVar.s;
                switch (b3) {
                    case 0:
                        return new nni(this);
                    case 1:
                        return d1pVar2.R();
                    case 2:
                        return ((psc) ((zas0) o9iVar.t).b).j();
                    case 3:
                        return d1pVar2.d0();
                    case 4:
                        return new oni(this);
                    case 5:
                        return new ux00();
                    case 6:
                        return new std();
                    default:
                        c99.h(b3);
                        return null;
                }
            case 9:
                if (b3 == 0) {
                    return new pni(this);
                }
                if (b3 == 1) {
                    return new qni(this);
                }
                if (b3 == 2) {
                    return new rni(this);
                }
                c99.h(b3);
                return null;
            case 10:
                if (b3 == 0) {
                    return new wni(this);
                }
                if (b3 == 1) {
                    return new xni(this);
                }
                if (b3 == 2) {
                    return new yni(this);
                }
                c99.h(b3);
                return null;
            case 11:
                ioi ioiVar = (ioi) obj;
                switch (b3) {
                    case 0:
                        return new fga0(new jw20(ioiVar.f15118a, (byte) 12), ioiVar.b, ioiVar.c, (rfa0) ioiVar.d.get());
                    case 1:
                        return new rfa0();
                    case 2:
                        return new ien((gen) ioiVar.f.get());
                    case 3:
                        return new gen();
                    case 4:
                        return new vdn((udn) ioiVar.h.get());
                    case 5:
                        return new udn();
                    case 6:
                        ben benVar = (ben) ioiVar.j.get();
                        benVar.getClass();
                        return new h7u(benVar);
                    case 7:
                        return new ben((gen) ioiVar.f.get());
                    default:
                        c99.h(b3);
                        return null;
                }
            case 12:
                f6i f6iVar = (f6i) obj;
                ocl oclVar = (ocl) f6iVar.r;
                pmi0 pmi0Var = (pmi0) f6iVar.k;
                cad cadVar2 = (cad) f6iVar.o;
                if (b3 != 0) {
                    if (b3 == 1) {
                        i1w0 i1w0Var2 = (i1w0) f6iVar.f;
                        f7u f7uVarE = f6iVar.e();
                        mne mneVarH7 = ((psc) cadVar2.b).h();
                        x1x.x(mneVarH7);
                        return new fla0(i1w0Var2, f7uVarE, oclVar, mneVarH7);
                    }
                    if (b3 == 2) {
                        gxu gxuVar = new gxu(f6iVar.d(), f6iVar.c(), new t1u(f6iVar.g()));
                        cu cuVar = new cu(f6iVar.d(), f6iVar.c(), new t1u(f6iVar.g()), (byte) 24);
                        gxu gxuVar2 = new gxu(f6iVar.d(), f6iVar.c(), new t1u(f6iVar.g()));
                        mne mneVarH8 = ((psc) cadVar2.b).h();
                        x1x.x(mneVarH8);
                        return new pia0(gxuVar, cuVar, gxuVar2, mneVarH8);
                    }
                    if (b3 != 3) {
                        c99.h(b3);
                        return null;
                    }
                    f7u f7uVarE2 = f6iVar.e();
                    mne mneVarH9 = ((psc) cadVar2.b).h();
                    x1x.x(mneVarH9);
                    return new yha0(f7uVarE2, mneVarH9);
                }
                String str2 = (String) f6iVar.e;
                long jLongValue = ((Long) f6iVar.b).longValue();
                bwl bwlVar = new bwl(f6iVar.g());
                t1u t1uVar = new t1u(f6iVar.g());
                mrc mrcVarD = f6iVar.d();
                v1u v1uVar = new v1u(f6iVar.g());
                mrc mrcVar = new mrc(f6iVar.g());
                fhj fhjVar = new fhj(f6iVar.c(), f6iVar.d());
                afm0 afm0Var = new afm0((Object) new roi0(f6iVar.g()), (Object) f6iVar.d(), (byte) 11);
                f7u f7uVarE3 = f6iVar.e();
                v1u v1uVar2 = new v1u(f6iVar.g());
                ouu ouuVar = new ouu((Object) f6iVar.d(), (Object) f6iVar.c(), (Object) new t1u(f6iVar.g()), (byte) 3);
                mrc mrcVar2 = new mrc(f6iVar.g());
                nfm0 nfm0VarA = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA);
                jwu jwuVar = new jwu(nfm0VarA, (byte) 2);
                qzt qztVar = (qzt) f6iVar.l;
                wyu wyuVar2 = (wyu) f6iVar.m;
                f7u f7uVarS = ((daf) pmi0Var.f27236a).s();
                nfm0 nfm0VarA2 = ((daf) pmi0Var.f27236a).A();
                x1x.x(nfm0VarA2);
                weu weuVar = new weu(nfm0VarA2, (byte) 0);
                fhj fhjVarR = ((daf) pmi0Var.f27236a).r();
                m1e m1eVar4 = (m1e) f6iVar.g;
                uyu uyuVar = (uyu) f6iVar.n;
                mne mneVarH10 = ((psc) cadVar2.b).h();
                x1x.x(mneVarH10);
                return new cma0(str2, jLongValue, bwlVar, t1uVar, mrcVarD, v1uVar, mrcVar, fhjVar, afm0Var, f7uVarE3, v1uVar2, ouuVar, mrcVar2, jwuVar, qztVar, wyuVar2, f7uVarS, weuVar, fhjVarR, m1eVar4, uyuVar, mneVarH10, (duj) f6iVar.p, (i1w0) f6iVar.f, (r9u) f6iVar.q, (ctf0) f6iVar.c, oclVar);
            case 13:
                f6i f6iVar2 = (f6i) obj;
                cad cadVar3 = (cad) f6iVar2.h;
                if (b3 == 0) {
                    return new joi(this);
                }
                if (b3 == 1) {
                    ocl oclVar2 = new ocl(f6iVar2.h());
                    nmo nmoVar = new nmo(f6iVar2.h());
                    String str3 = (String) f6iVar2.s;
                    mne mneVarH11 = ((psc) cadVar3.b).h();
                    x1x.x(mneVarH11);
                    return new zia0(oclVar2, nmoVar, str3, mneVarH11);
                }
                if (b3 != 2) {
                    c99.h(b3);
                    return null;
                }
                yfu yfuVar2 = new yfu(f6iVar2.h());
                nmo nmoVar2 = new nmo(f6iVar2.h());
                zlt0 zlt0Var = new zlt0(f6iVar2.h(), b2);
                String str4 = (String) f6iVar2.s;
                mne mneVarH12 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH12);
                return new qja0(yfuVar2, nmoVar2, zlt0Var, str4, mneVarH12);
            case 14:
                itr itrVar = ((xoi) obj).f41221a;
                if (b3 == 0) {
                    return new woi(this);
                }
                if (b3 == 1) {
                    hjd hjdVarA = itrVar.a();
                    x1x.x(hjdVarA);
                    return hjdVarA;
                }
                if (b3 != 2) {
                    c99.h(b3);
                    return null;
                }
                ujd ujdVarD = itrVar.d();
                x1x.x(ujdVarD);
                return ujdVarD;
            case 15:
                g8i g8iVar2 = (g8i) ((pmi) obj).b;
                if (b3 == 0) {
                    return new api(this);
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        return ((g45) g8iVar2.f0().b).t();
                    }
                    c99.h(b3);
                    return null;
                }
                gii0 gii0VarJ9 = g8iVar2.j9();
                x1x.x(gii0VarJ9);
                ieu ieuVar = new ieu(gii0VarJ9, (byte) 21);
                btt0 btt0VarO8 = g8iVar2.o8();
                x1x.x(btt0VarO8);
                mne mneVarV1 = g8iVar2.v1();
                knf0 knf0VarJ8 = g8iVar2.J8();
                x1x.x(knf0VarJ8);
                return new e7y(ieuVar, btt0VarO8, mneVarV1, knf0VarJ8);
            case 16:
                fpi fpiVar = (fpi) obj;
                if (b3 == 0) {
                    return new epi(this);
                }
                if (b3 == 1) {
                    ieu ieuVar2 = new ieu(fpiVar.r, (byte) 21);
                    btt0 btt0Var2 = fpiVar.s;
                    mne mneVarH13 = ((psc) fpiVar.c.b).h();
                    x1x.x(mneVarH13);
                    return new e7y(ieuVar2, btt0Var2, mneVarH13, fpiVar.t);
                }
                if (b3 == 2) {
                    return new qfb0((afb0) fpiVar.R.get());
                }
                if (b3 == 3) {
                    return new afb0();
                }
                c99.h(b3);
                return null;
            case 17:
                gpi gpiVar = (gpi) obj;
                q7d0 q7d0Var = gpiVar.b;
                switch (b3) {
                    case 0:
                        return new po00((ihb0) gpiVar.l.get());
                    case 1:
                        return new ihb0(new zx10(gpiVar.f11685a, (byte) 8), (wgb0) gpiVar.j.get(), gpiVar.d, gpiVar.e, gpiVar.f, (qgb0) gpiVar.k.get(), new j910(q7d0Var));
                    case 2:
                        vby vbyVar2 = gpiVar.c;
                        q7d0Var.getClass();
                        vbyVar2.getClass();
                        return new wgb0(vbyVar2, q7d0Var);
                    case 3:
                        mne mneVarH14 = ((psc) gpiVar.g.b).h();
                        x1x.x(mneVarH14);
                        return new qgb0(mneVarH14);
                    case 4:
                        return new oo00((ihb0) gpiVar.l.get());
                    case 5:
                        return new gou((ihb0) gpiVar.l.get());
                    case 6:
                        return new oqx(gpiVar.h, new iqt(gpiVar.i), (pqx) gpiVar.p.get(), (yri0) gpiVar.q.get());
                    case 7:
                        return new pqx((ihb0) gpiVar.l.get());
                    case 8:
                        return new yri0((ihb0) gpiVar.l.get());
                    default:
                        c99.h(b3);
                        return null;
                }
            case 18:
                ipi ipiVar = (ipi) obj;
                switch (b3) {
                    case 0:
                        return new xrt(ipiVar.h());
                    case 1:
                        return new gmu(ipiVar.h());
                    case 2:
                        return new puu(ipiVar.h());
                    case 3:
                        return new jbx(ipiVar.h(), ipiVar.b);
                    case 4:
                        return new hou((xrt) ipiVar.c.get(), (gmu) ipiVar.d.get(), (puu) ipiVar.e.get(), (qqx) ipiVar.g.get());
                    case 5:
                        return new qqx(ipiVar.h());
                    case 6:
                        return new nrc(ipiVar.h());
                    default:
                        c99.h(b3);
                        return null;
                }
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (b3 == 0) {
                    return new rpi(this);
                }
                if (b3 == 1) {
                    return new agc0();
                }
                if (b3 == 2) {
                    bqc0 bqc0Var = new bqc0();
                    bqc0Var.f3022a = iun.f15405a;
                    return bqc0Var;
                }
                if (b3 != 3) {
                    c99.h(b3);
                    return null;
                }
                cqc0 cqc0Var = new cqc0();
                cqc0Var.f4787a = iun.f15405a;
                return cqc0Var;
            case 20:
                return a();
            case 21:
                if (b3 == 0) {
                    return new bqi(this);
                }
                if (b3 == 1) {
                    return new agc0();
                }
                if (b3 == 2) {
                    bqc0 bqc0Var2 = new bqc0();
                    bqc0Var2.f3022a = iun.f15405a;
                    return bqc0Var2;
                }
                if (b3 != 3) {
                    c99.h(b3);
                    return null;
                }
                cqc0 cqc0Var2 = new cqc0();
                cqc0Var2.f4787a = iun.f15405a;
                return cqc0Var2;
            case 22:
                if (b3 == 0) {
                    return new dqi(this);
                }
                if (b3 == 1) {
                    return new agc0();
                }
                if (b3 == 2) {
                    bqc0 bqc0Var3 = new bqc0();
                    bqc0Var3.f3022a = iun.f15405a;
                    return bqc0Var3;
                }
                if (b3 != 3) {
                    c99.h(b3);
                    return null;
                }
                cqc0 cqc0Var3 = new cqc0();
                cqc0Var3.f4787a = iun.f15405a;
                return cqc0Var3;
            case 23:
                return b();
            case 24:
                return c();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return d();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return e();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return f();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return g();
            default:
                v5i v5iVar = (v5i) obj;
                Long l = (Long) v5iVar.l;
                pmi0 pmi0Var2 = (pmi0) v5iVar.q;
                cad cadVar4 = (cad) v5iVar.o;
                if (b3 == 0) {
                    kki kkiVar = (kki) v5iVar.e;
                    String str5 = (String) v5iVar.g;
                    x4u x4uVar = new x4u(v5iVar.k());
                    mne mneVarH15 = ((psc) cadVar4.b).h();
                    x1x.x(mneVarH15);
                    return new o7g0(kkiVar, str5, x4uVar, mneVarH15, (ctf0) v5iVar.b, (vjp) v5iVar.k, l.longValue(), (String) v5iVar.m, (r9u) v5iVar.n);
                }
                if (b3 != 1) {
                    if (b3 != 2) {
                        c99.h(b3);
                        return null;
                    }
                    String str6 = (String) v5iVar.g;
                    i1w0 i1w0Var3 = (i1w0) v5iVar.f;
                    r9u r9uVar = (r9u) v5iVar.n;
                    mne mneVarH16 = ((psc) cadVar4.b).h();
                    x1x.x(mneVarH16);
                    return new j7g0(str6, i1w0Var3, r9uVar, mneVarH16, new hnu(v5iVar.k()));
                }
                String str7 = (String) v5iVar.g;
                long jLongValue2 = l.longValue();
                ctf0 ctf0Var2 = (ctf0) v5iVar.b;
                mne mneVarH17 = ((psc) cadVar4.b).h();
                x1x.x(mneVarH17);
                i1w0 i1w0Var4 = (i1w0) v5iVar.f;
                p4u p4uVar2 = new p4u(v5iVar.k());
                duj dujVar2 = (duj) v5iVar.c;
                m1e m1eVar5 = (m1e) v5iVar.p;
                nfm0 nfm0VarA3 = ((daf) pmi0Var2.f27236a).A();
                x1x.x(nfm0VarA3);
                return new m8g0(str7, jLongValue2, ctf0Var2, mneVarH17, i1w0Var4, p4uVar2, dujVar2, m1eVar5, new weu(nfm0VarA3, (byte) 0), new qzt((pru) v5iVar.d, (byte) 0), ((daf) pmi0Var2.f27236a).r(), ((daf) pmi0Var2.f27236a).s(), (uyu) v5iVar.r, (r9u) v5iVar.n, (ocl) v5iVar.s);
        }
    }
}
