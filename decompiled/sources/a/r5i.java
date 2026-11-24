package a;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import kotlin.Pair;
import org.platform.app.ApplicationLoader;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingVideoLandscapeParams;
import org.xplatform.game_broadcasting.api.presentation.models.BroadcastingZoneLandscapeParams;

/* JADX INFO: loaded from: classes3.dex */
public final class r5i implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29886a;
    public final byte b;
    public final Object c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ r5i(Object obj, int i, byte b) {
        this.f29886a = b;
        this.c = obj;
        this.b = i;
    }

    private final Object a() {
        l8i l8iVar = (l8i) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new j8i(this);
            case 1:
                o8f o8fVar = l8iVar.u;
                d1p d1pVar = l8iVar.B;
                ot10 ot10Var = l8iVar.v;
                msh0 msh0Var = new msh0(l8iVar.p, (byte) 1);
                yu00 yu00Var = l8iVar.w;
                wgu wguVar = l8iVar.x;
                pru pruVar = l8iVar.j;
                sqx sqxVar = l8iVar.y;
                c1d0 c1d0Var = l8iVar.z;
                mne mneVarH = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH);
                return new psf0(o8fVar, ot10Var, msh0Var, yu00Var, wguVar, pruVar, sqxVar, c1d0Var, mneVarH, l8iVar.A, d1pVar.J(), l8iVar.C, d1pVar.D0(), l8iVar.D);
            case 2:
                o8f o8fVar2 = l8iVar.u;
                sqt sqtVar = new sqt(l8iVar.F);
                mne mneVarH2 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH2);
                return new tti0(o8fVar2, sqtVar, mneVarH2, l8iVar.D);
            case 3:
                o8f o8fVar3 = l8iVar.u;
                nkt nktVar = (nkt) l8iVar.P0.get();
                ApplicationLoader applicationLoader = l8iVar.I;
                mne mneVarH3 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH3);
                return new i9c(o8fVar3, nktVar, applicationLoader, mneVarH3, l8iVar.J, l8iVar.j, new gst(), l8iVar.K, new gst(l8iVar.l), new tqt(), l8iVar.D);
            case 4:
                o8f o8fVar4 = l8iVar.u;
                ieu ieuVar = l8iVar.G;
                jw20 jw20Var = l8iVar.H;
                mne mneVarH4 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH4);
                return new nkt(o8fVar4, ieuVar, jw20Var, mneVarH4, l8iVar.D);
            case 5:
                o8f o8fVar5 = l8iVar.u;
                nkt nktVar2 = (nkt) l8iVar.P0.get();
                ro00 ro00Var = l8iVar.L;
                lpi0 lpi0Var = l8iVar.M;
                mne mneVarH5 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH5);
                return new nff0(o8fVar5, nktVar2, ro00Var, lpi0Var, mneVarH5, l8iVar.N.f36881a.a(), new sqt(), l8iVar.j, l8iVar.O, l8iVar.P, l8iVar.Q, l8iVar.R, l8iVar.D);
            case 6:
                o8f o8fVar6 = l8iVar.u;
                nff0 nff0Var = (nff0) l8iVar.R0.get();
                pru pruVar2 = l8iVar.j;
                mne mneVarH6 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH6);
                return new kyb(o8fVar6, nff0Var, pruVar2, mneVarH6, l8iVar.D);
            case 7:
                o8f o8fVar7 = l8iVar.u;
                cad cadVar = l8iVar.k;
                pru pruVar3 = l8iVar.j;
                iqi iqiVarE = l8iVar.f.e();
                x1x.x(iqiVarE);
                sqt sqtVar2 = new sqt();
                lbu lbuVar = l8iVar.S;
                iqt iqtVar = l8iVar.C;
                dgk dgkVar = l8iVar.T;
                ieu ieuVar2 = l8iVar.G;
                q7d0 q7d0Var = l8iVar.q;
                knf0 knf0Var = l8iVar.r;
                fvt0 fvt0Var = new fvt0(l8iVar.p, (byte) 23);
                mne mneVarH7 = ((psc) cadVar.b).h();
                x1x.x(mneVarH7);
                g2v g2vVar = new g2v(new nhf0(q7d0Var, knf0Var, fvt0Var, mneVarH7));
                sqx sqxVar2 = l8iVar.y;
                sv3 sv3Var = l8iVar.U;
                mne mneVarH8 = ((psc) cadVar.b).h();
                x1x.x(mneVarH8);
                return new azb(o8fVar7, pruVar3, iqiVarE, sqtVar2, lbuVar, iqtVar, dgkVar, ieuVar2, g2vVar, sqxVar2, sv3Var, mneVarH8, l8iVar.D);
            case 8:
                o8f o8fVar8 = l8iVar.u;
                qvu qvuVar = new qvu(l8iVar.b(), l8iVar.W);
                mne mneVarH9 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH9);
                return new zql0(o8fVar8, qvuVar, mneVarH9, l8iVar.D);
            case 9:
                o8f o8fVar9 = l8iVar.u;
                mne mneVarH10 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH10);
                return new rnf0(o8fVar9, mneVarH10, new htz(), l8iVar.D);
            case 10:
                o8f o8fVar10 = l8iVar.u;
                h8u h8uVar = new h8u(l8iVar.b(), l8iVar.Y);
                mne mneVarH11 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH11);
                return new who(o8fVar10, h8uVar, mneVarH11, l8iVar.D);
            case 11:
                o8f o8fVar11 = l8iVar.u;
                u7u u7uVar = new u7u(l8iVar.b(), l8iVar.Z);
                mne mneVarH12 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH12);
                return new udo(o8fVar11, u7uVar, mneVarH12, l8iVar.D);
            case 12:
                o8f o8fVar12 = l8iVar.u;
                vl00 vl00VarC = l8iVar.f.c();
                x1x.x(vl00VarC);
                pru pruVar4 = l8iVar.j;
                mne mneVarH13 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH13);
                return new vpe(o8fVar12, vl00VarC, pruVar4, mneVarH13, l8iVar.D);
            case 13:
                o8f o8fVar13 = l8iVar.u;
                wsf0 wsf0Var = l8iVar.a0;
                lsn lsnVarG = l8iVar.f.g();
                x1x.x(lsnVarG);
                q0u q0uVar = new q0u(((g45) wsf0Var.b).k());
                o470 o470Var = new o470(((g45) wsf0Var.b).k());
                mne mneVarH14 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH14);
                return new ouf(o8fVar13, lsnVarG, q0uVar, o470Var, mneVarH14, l8iVar.D);
            case 14:
                pru pruVar5 = l8iVar.j;
                o8f o8fVar14 = l8iVar.u;
                iqt iqtVar2 = l8iVar.C;
                hse0 hse0Var = l8iVar.b0;
                reu reuVar = new reu(l8iVar.c0);
                rqt rqtVar = new rqt();
                bst bstVar = new bst();
                kt2 kt2Var = l8iVar.d0;
                rqj0 rqj0Var = l8iVar.e0;
                nr nrVar = new nr(kt2Var, l8iVar.r, l8iVar.l);
                s64 s64VarB = l8iVar.B.b();
                yox yoxVar = l8iVar.f0;
                g860 g860VarD = l8iVar.g0.d();
                mne mneVarH15 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH15);
                return new xqt0(pruVar5, o8fVar14, iqtVar2, hse0Var, reuVar, rqtVar, bstVar, kt2Var, rqj0Var, nrVar, s64VarB, yoxVar, g860VarD, mneVarH15, l8iVar.h0, l8iVar.D);
            case 15:
                o8f o8fVar15 = l8iVar.u;
                xqt0 xqt0Var = (xqt0) l8iVar.a1.get();
                hcp0 hcp0VarO0 = ((g45) l8iVar.a0.b).o0();
                iqt iqtVar3 = l8iVar.C;
                mne mneVarH16 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH16);
                return new cg5(o8fVar15, xqt0Var, hcp0VarO0, iqtVar3, mneVarH16, l8iVar.D);
            case 16:
                o8f o8fVar16 = l8iVar.u;
                nr nrVarK = l8iVar.f.k();
                x1x.x(nrVarK);
                mne mneVarH17 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH17);
                return new ltm0(o8fVar16, nrVarK, mneVarH17, l8iVar.D);
            case 17:
                o8f o8fVar17 = l8iVar.u;
                emt0 emt0Var = l8iVar.i0;
                jru jruVar = l8iVar.j0;
                pru pruVar6 = l8iVar.j;
                xte0 xte0Var = l8iVar.k0;
                mne mneVarH18 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH18);
                return new k1f0(o8fVar17, emt0Var, jruVar, pruVar6, xte0Var, mneVarH18, l8iVar.D);
            case 18:
                o8f o8fVar18 = l8iVar.u;
                jdu jduVar = l8iVar.l0;
                pru pruVar7 = l8iVar.j;
                mne mneVarH19 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH19);
                return new g5t(o8fVar18, jduVar, pruVar7, mneVarH19, l8iVar.D);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                o8f o8fVar19 = l8iVar.u;
                g5t g5tVar = (g5t) l8iVar.e1.get();
                mkt0 mkt0Var = l8iVar.m0;
                kqc kqcVar = l8iVar.n0;
                mne mneVarH20 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH20);
                return new jat(o8fVar19, g5tVar, mkt0Var, kqcVar, mneVarH20, l8iVar.o0, l8iVar.p0, l8iVar.j, l8iVar.D);
            case 20:
                o8f o8fVar20 = l8iVar.u;
                oo00 oo00VarB = l8iVar.q0.b();
                x1x.x(oo00VarB);
                mne mneVarH21 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH21);
                return new sgb0(o8fVar20, oo00VarB, mneVarH21, l8iVar.D);
            case 21:
                o8f o8fVar21 = l8iVar.u;
                drm0 drm0Var = l8iVar.r0;
                dpi0 dpi0Var = l8iVar.s0;
                ls00 ls00Var = l8iVar.t0;
                mne mneVarH22 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH22);
                return new ugq0(o8fVar21, drm0Var, dpi0Var, ls00Var, mneVarH22, l8iVar.D);
            case 22:
                o8f o8fVar22 = l8iVar.u;
                ttb0 ttb0Var = (ttb0) ((n5d0) ((daf) l8iVar.u0.f35622a).h).get();
                x1x.x(ttb0Var);
                mne mneVarH23 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH23);
                return new czq0(o8fVar22, ttb0Var, mneVarH23, l8iVar.D);
            case 23:
                o8f o8fVar23 = l8iVar.u;
                urc urcVar = l8iVar.v0;
                vrc vrcVar = l8iVar.w0;
                mne mneVarH24 = ((psc) l8iVar.k.b).h();
                x1x.x(mneVarH24);
                return new trc(o8fVar23, urcVar, vrcVar, mneVarH24, l8iVar.D);
            case 24:
                return new k8i(this);
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object b() {
        q8i q8iVar = (q8i) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new i6i(this, (byte) 1);
            case 1:
                sek sekVar = q8iVar.b;
                s7t0 s7t0Var = (s7t0) q8iVar.D.get();
                pbt pbtVarL2 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL2);
                return i5t.r(sekVar, s7t0Var, pbtVarL2);
            case 2:
                sek sekVar2 = q8iVar.b;
                g8i g8iVar = q8iVar.f28301a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                d3c d3cVar = (d3c) q8iVar.e.get();
                fq fqVar = (fq) q8iVar.x.get();
                qpt qptVar = (qpt) q8iVar.y.get();
                gmt gmtVar = (gmt) q8iVar.j.get();
                rgs rgsVar = (rgs) q8iVar.C.get();
                r9u r9uVarH4 = g8iVar.h4();
                x1x.x(r9uVarH4);
                return i5t.C(sekVar2, pbtVarL3, d3cVar, fqVar, qptVar, gmtVar, rgsVar, r9uVarH4);
            case 3:
                sek sekVar3 = q8iVar.b;
                pbt pbtVarL4 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL4);
                return new d3c(pbtVarL4);
            case 4:
                sek sekVar4 = q8iVar.b;
                lzt lztVar = (lzt) q8iVar.f.get();
                zmi0 zmi0Var = (zmi0) q8iVar.g.get();
                pbt pbtVarL5 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL5);
                return mkg.g(sekVar4, lztVar, zmi0Var, pbtVarL5, (xyb) q8iVar.h.get(), (yyb) q8iVar.l.get(), (fpi0) q8iVar.m.get(), (nqt) q8iVar.n.get(), (spx) q8iVar.o.get(), (oqt) q8iVar.p.get(), (hni0) q8iVar.q.get(), (vcu) q8iVar.r.get(), (d3c) q8iVar.e.get(), (wni0) q8iVar.s.get(), (ztt) q8iVar.k.get(), (pqt) q8iVar.t.get(), (itt) q8iVar.u.get(), (q78) q8iVar.v.get(), (gmt) q8iVar.j.get(), (ecs) q8iVar.w.get());
            case 5:
                sek sekVar5 = q8iVar.b;
                g8i g8iVar2 = q8iVar.f28301a;
                pbt pbtVarL6 = g8iVar2.L2();
                x1x.x(pbtVarL6);
                m1e m1eVarQ1 = g8iVar2.q1();
                x1x.x(m1eVarQ1);
                return new lzt(pbtVarL6, m1eVarQ1);
            case 6:
                sek sekVar6 = q8iVar.b;
                pbt pbtVarL7 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL7);
                return new zmi0(pbtVarL7);
            case 7:
                sek sekVar7 = q8iVar.b;
                pbt pbtVarL8 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL8);
                return new xyb(pbtVarL8);
            case 8:
                sek sekVar8 = q8iVar.b;
                k1u k1uVar = (k1u) q8iVar.i.get();
                gmt gmtVar2 = (gmt) q8iVar.j.get();
                ztt zttVar = (ztt) q8iVar.k.get();
                pbt pbtVarL9 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL9);
                return i5t.a(sekVar8, k1uVar, gmtVar2, zttVar, pbtVarL9);
            case 9:
                sek sekVar9 = q8iVar.b;
                return new k1u(q8iVar.b());
            case 10:
                sek sekVar10 = q8iVar.b;
                pbt pbtVarL10 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL10);
                return new gmt(pbtVarL10);
            case 11:
                sek sekVar11 = q8iVar.b;
                pbt pbtVarL11 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL11);
                return new ztt(pbtVarL11);
            case 12:
                sek sekVar12 = q8iVar.b;
                pbt pbtVarL12 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL12);
                return new fpi0(pbtVarL12);
            case 13:
                sek sekVar13 = q8iVar.b;
                pbt pbtVarL13 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL13);
                return new nqt(pbtVarL13);
            case 14:
                sek sekVar14 = q8iVar.b;
                pbt pbtVarL14 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL14);
                return new spx(pbtVarL14);
            case 15:
                sek sekVar15 = q8iVar.b;
                pbt pbtVarL15 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL15);
                return new oqt(pbtVarL15);
            case 16:
                sek sekVar16 = q8iVar.b;
                pbt pbtVarL16 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL16);
                return new hni0(pbtVarL16);
            case 17:
                sek sekVar17 = q8iVar.b;
                pbt pbtVarL17 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL17);
                return new vcu(pbtVarL17);
            case 18:
                sek sekVar18 = q8iVar.b;
                pbt pbtVarL18 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL18);
                return new wni0(pbtVarL18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar19 = q8iVar.b;
                pbt pbtVarL19 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL19);
                return new pqt(pbtVarL19);
            case 20:
                sek sekVar20 = q8iVar.b;
                pbt pbtVarL20 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL20);
                return new itt(pbtVarL20);
            case 21:
                sek sekVar21 = q8iVar.b;
                pbt pbtVarL21 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL21);
                return new q78(pbtVarL21);
            case 22:
                sek sekVar22 = q8iVar.b;
                pbt pbtVarL22 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL22);
                return new ecs(pbtVarL22);
            case 23:
                sek sekVar23 = q8iVar.b;
                pbt pbtVarL23 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL23);
                return new qpt(pbtVarL23);
            case 24:
                sek sekVar24 = q8iVar.b;
                fq fqVar2 = (fq) q8iVar.x.get();
                fqx fqxVar = (fqx) q8iVar.z.get();
                wox woxVar = (wox) q8iVar.A.get();
                return i5t.g(fqVar2, sekVar24, (qpt) q8iVar.y.get(), (r8u) q8iVar.B.get(), woxVar, fqxVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar25 = q8iVar.b;
                pbt pbtVarL24 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL24);
                return new fqx(pbtVarL24);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar26 = q8iVar.b;
                pbt pbtVarL25 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL25);
                return new wox(pbtVarL25);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar27 = q8iVar.b;
                pbt pbtVarL26 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL26);
                return new r8u(pbtVarL26);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                sek sekVar28 = q8iVar.b;
                pbt pbtVarL27 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL27);
                return new qa60(pbtVarL27);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar29 = q8iVar.b;
                pbt pbtVarL28 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL28);
                return new ipi0(pbtVarL28);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                sek sekVar30 = q8iVar.b;
                pbt pbtVarL29 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL29);
                return new xsi0(pbtVarL29);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                sek sekVar31 = q8iVar.b;
                pbt pbtVarL30 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL30);
                return new gpx(pbtVarL30);
            case 32:
                sek sekVar32 = q8iVar.b;
                pbt pbtVarL31 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL31);
                return new vni0(pbtVarL31);
            case 33:
                sek sekVar33 = q8iVar.b;
                pbt pbtVarL32 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL32);
                return new hs(pbtVarL32);
            case 34:
                sek sekVar34 = q8iVar.b;
                pbt pbtVarL33 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL33);
                return new eni0(pbtVarL33);
            case 35:
                return i5t.z(q8iVar.b, (aws) q8iVar.M.get());
            case 36:
                sek sekVar35 = q8iVar.b;
                yvs yvsVarG2 = q8iVar.f28301a.G2();
                x1x.x(yvsVarG2);
                return new aws(yvsVarG2);
            case 37:
                sek sekVar36 = q8iVar.b;
                pbt pbtVarL34 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL34);
                return new hj50(pbtVarL34);
            case 38:
                sek sekVar37 = q8iVar.b;
                pbt pbtVarL35 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL35);
                return new qhf0(pbtVarL35);
            case 39:
                return i5t.d(q8iVar.b, (foi0) q8iVar.Q.get(), (fq) q8iVar.x.get());
            case 40:
                sek sekVar38 = q8iVar.b;
                pbt pbtVarL36 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL36);
                return new foi0(pbtVarL36);
            case 41:
                sek sekVar39 = q8iVar.b;
                fq fqVar3 = (fq) q8iVar.x.get();
                r8u r8uVar = (r8u) q8iVar.B.get();
                return i5t.B(fqVar3, sekVar39, (qpt) q8iVar.y.get(), r8uVar, (wox) q8iVar.A.get(), (fqx) q8iVar.z.get());
            case 42:
                jdk0 jdk0Var = q8iVar.c;
                return new y5s(s470.APPLE_FORTUNE, false, true, false, false, false, 448);
            case 43:
                return i5t.b(q8iVar.b, (fq) q8iVar.x.get(), (fqx) q8iVar.z.get());
            case 44:
                return i5t.c(q8iVar.b, (aws) q8iVar.M.get());
            case 45:
                sek sekVar40 = q8iVar.b;
                pbt pbtVarL37 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL37);
                return new hsj0(pbtVarL37);
            case 46:
                sek sekVar41 = q8iVar.b;
                g8i g8iVar3 = q8iVar.f28301a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL38 = g8iVar3.L2();
                x1x.x(pbtVarL38);
                return new t0u(pbtVarL38, wsf0VarF0);
            case 47:
                sek sekVar42 = q8iVar.b;
                pbt pbtVarL39 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL39);
                return new tbu(pbtVarL39);
            case 48:
                return i5t.f(q8iVar.b, (a6s) q8iVar.Z.get());
            case 49:
                return i5t.e(q8iVar.b);
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                xcc xccVar = (xcc) q8iVar.U.get();
                qa60 qa60Var = (qa60) q8iVar.F.get();
                d3c d3cVar2 = (d3c) q8iVar.e.get();
                lzt lztVar2 = (lzt) q8iVar.f.get();
                fpi0 fpi0Var = (fpi0) q8iVar.m.get();
                mne mneVarV1 = q8iVar.f28301a.v1();
                i5m0 i5m0Var = (i5m0) q8iVar.f0.get();
                fq fqVar4 = (fq) q8iVar.x.get();
                mp3 mp3Var = new mp3((qq3) q8iVar.h0.get(), (byte) 0);
                itt ittVar = (itt) q8iVar.u.get();
                gmt gmtVar3 = (gmt) q8iVar.j.get();
                ztt zttVar2 = (ztt) q8iVar.k.get();
                jcu jcuVar = (jcu) q8iVar.i0.get();
                ittVar.getClass();
                gmtVar3.getClass();
                zttVar2.getClass();
                jcuVar.getClass();
                gr00 gr00Var = new gr00();
                gr00Var.f11760a = mp3Var;
                gr00Var.b = ittVar;
                gr00Var.c = gmtVar3;
                gr00Var.d = zttVar2;
                gr00Var.e = jcuVar;
                s7t0 s7t0Var2 = (s7t0) q8iVar.D.get();
                iqi iqiVar = new iqi((qq3) q8iVar.h0.get(), (y5s) q8iVar.T.get());
                qni0 qni0Var = (qni0) q8iVar.d0.get();
                ecs ecsVar = (ecs) q8iVar.w.get();
                qq3 qq3Var = (qq3) q8iVar.h0.get();
                y5s y5sVar = (y5s) q8iVar.T.get();
                qq3Var.getClass();
                y5sVar.getClass();
                xex xexVar = new xex();
                xexVar.f40764a = qq3Var;
                xexVar.b = y5sVar;
                gmt gmtVar4 = (gmt) q8iVar.j.get();
                gmtVar4.getClass();
                c5k c5kVar = new c5k();
                c5kVar.f3775a = xexVar;
                c5kVar.b = gmtVar4;
                qq3 qq3Var2 = (qq3) q8iVar.h0.get();
                y5s y5sVar2 = (y5s) q8iVar.T.get();
                qq3Var2.getClass();
                y5sVar2.getClass();
                hsj hsjVar = new hsj();
                hsjVar.f13586a = qq3Var2;
                hsjVar.b = y5sVar2;
                return new kq3(xccVar, qa60Var, d3cVar2, lztVar2, fpi0Var, mneVarV1, i5m0Var, fqVar4, gr00Var, s7t0Var2, iqiVar, qni0Var, ecsVar, c5kVar, new wti(hsjVar, (gmt) q8iVar.j.get()), (ztt) q8iVar.k.get(), new mp3((qq3) q8iVar.h0.get(), (byte) 1), new yk50((qq3) q8iVar.h0.get()), (t0u) q8iVar.X.get());
            case 51:
                return i5t.A(q8iVar.b, (fq) q8iVar.x.get(), q8iVar.f28301a.f0(), (g9c) q8iVar.c0.get(), (itt) q8iVar.u.get(), (yyb) q8iVar.l.get(), (lg60) q8iVar.e0.get());
            case 52:
                sek sekVar43 = q8iVar.b;
                pbt pbtVarL40 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL40);
                return new g9c(pbtVarL40);
            case 53:
                sek sekVar44 = q8iVar.b;
                qni0 qni0Var2 = (qni0) q8iVar.d0.get();
                pbt pbtVarL41 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL41);
                return i5t.v(sekVar44, qni0Var2, pbtVarL41);
            case 54:
                sek sekVar45 = q8iVar.b;
                pbt pbtVarL42 = q8iVar.f28301a.L2();
                x1x.x(pbtVarL42);
                return new qni0(pbtVarL42);
            case 55:
                g8i g8iVar4 = q8iVar.f28301a;
                g8i g8iVar5 = q8iVar.f28301a;
                gii0 gii0VarJ9 = g8iVar4.j9();
                x1x.x(gii0VarJ9);
                chf0 chf0Var = new chf0(gii0VarJ9, (byte) 9);
                lq3 lq3Var = (lq3) q8iVar.g0.get();
                knf0 knf0VarJ8 = g8iVar5.J8();
                x1x.x(knf0VarJ8);
                btt0 btt0VarO8 = g8iVar5.o8();
                x1x.x(btt0VarO8);
                return new qq3(chf0Var, lq3Var, knf0VarJ8, btt0VarO8);
            case 56:
                jdk0 jdk0Var2 = q8iVar.c;
                lq3 lq3Var2 = new lq3();
                lnm0 lnm0Var = lnm0.b;
                iun iunVar = iun.f15405a;
                lq3Var2.f20467a = new dr3(0L, 0, 0.0d, 0.0d, lnm0Var, 0.0d, iunVar, iunVar, iunVar, csr.e, iunVar);
                return lq3Var2;
            case 57:
                sek sekVar46 = q8iVar.b;
                aws awsVar = (aws) q8iVar.M.get();
                awsVar.getClass();
                return new jcu(awsVar);
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object c() {
        s8i s8iVar = (s8i) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new fiu0(wcf0.g(zu3.class, s8iVar.K0, dlx.class, s8iVar.L0));
            case 1:
                r5i r5iVar = s8iVar.z;
                bbw0 bbw0Var = s8iVar.x;
                epi0 epi0Var = s8iVar.w;
                return new zu3(mbl.a(r5iVar), mbl.a(s8iVar.A), s8iVar.i, mbl.a(s8iVar.B), mbl.a(s8iVar.C), mbl.a(s8iVar.D), s8iVar.j, mbl.a(s8iVar.E), mbl.a(s8iVar.F), mbl.a(s8iVar.G), mbl.a(s8iVar.H), mbl.a(s8iVar.I), mbl.a(s8iVar.J), mbl.a(s8iVar.K), mbl.a(s8iVar.L), mbl.a(s8iVar.M), mbl.a(s8iVar.N), mbl.a(s8iVar.O), mbl.a(s8iVar.P), mbl.a(s8iVar.Q), mbl.a(s8iVar.R), mbl.a(s8iVar.S), mbl.a(s8iVar.T), mbl.a(s8iVar.U), mbl.a(s8iVar.V), mbl.a(s8iVar.W), mbl.a(s8iVar.X), mbl.a(s8iVar.Y), mbl.a(s8iVar.Z), mbl.a(s8iVar.a0), mbl.a(s8iVar.b0), mbl.a(s8iVar.c0), mbl.a(s8iVar.d0), mbl.a(s8iVar.e0), mbl.a(s8iVar.f0), mbl.a(s8iVar.g0), mbl.a(s8iVar.h0), mbl.a(s8iVar.i0), mbl.a(s8iVar.j0), mbl.a(s8iVar.k0), mbl.a(s8iVar.l0), mbl.a(s8iVar.m0), mbl.a(s8iVar.n0), mbl.a(s8iVar.o0), mbl.a(s8iVar.p0), mbl.a(s8iVar.q0), mbl.a(s8iVar.r0), mbl.a(s8iVar.s0), mbl.a(s8iVar.t0), mbl.a(s8iVar.u0), mbl.a(s8iVar.v0), mbl.a(s8iVar.w0), mbl.a(s8iVar.x0), mbl.a(s8iVar.y0), mbl.a(s8iVar.z0), mbl.a(s8iVar.A0), mbl.a(s8iVar.B0), mbl.a(s8iVar.C0), mbl.a(s8iVar.D0), ((xzp) epi0Var.b).B(), new wti((Object) ((xzp) epi0Var.b).B(), (Object) new nmo(bbw0Var), (byte) 26), ((xzp) epi0Var.b).H(), new peg0((Object) bbw0Var, (byte) 27), new p4u(bbw0Var), mbl.a(s8iVar.E0), mbl.a(s8iVar.F0), mbl.a(s8iVar.G0), ((ru) s8iVar.y.f23980a).i(), mbl.a(s8iVar.H0), mbl.a(s8iVar.I0), mbl.a(s8iVar.J0));
            case 2:
                dpx dpxVarC = s8iVar.g.c();
                x1x.x(dpxVarC);
                return dpxVarC;
            case 3:
                cg40 cg40VarS = s8iVar.h.s();
                x1x.x(cg40VarS);
                return cg40VarS;
            case 4:
                return s8iVar.k.d();
            case 5:
                anv anvVarM0 = s8iVar.l.m0();
                x1x.x(anvVarM0);
                return anvVarM0;
            case 6:
                ehu ehuVarV = s8iVar.l.v();
                x1x.x(ehuVarV);
                return ehuVarV;
            case 7:
                w4v w4vVarI0 = s8iVar.l.i0();
                x1x.x(w4vVarI0);
                return w4vVarI0;
            case 8:
                mnt0 mnt0VarG0 = s8iVar.l.G0();
                x1x.x(mnt0VarG0);
                return mnt0VarG0;
            case 9:
                return s8iVar.l.E0();
            case 10:
                knt0 knt0VarM = s8iVar.l.M();
                x1x.x(knt0VarM);
                return knt0VarM;
            case 11:
                koi0 koi0VarT0 = s8iVar.l.t0();
                x1x.x(koi0VarT0);
                return koi0VarT0;
            case 12:
                return s8iVar.l.J0();
            case 13:
                return new xrc(s8iVar.m);
            case 14:
                return new imt0(s8iVar.m);
            case 15:
                return new g390(s8iVar.m);
            case 16:
                bh3 bh3VarI = s8iVar.n.i();
                x1x.x(bh3VarI);
                return bh3VarI;
            case 17:
                nr00 nr00Var = s8iVar.o;
                return new q840();
            case 18:
                return new gkt0(new ocl((crq) ((phf0) s8iVar.p.f20589a).f26994a));
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                v6k v6kVar = s8iVar.q;
                return new rqt();
            case 20:
                v6k v6kVar2 = s8iVar.q;
                return new eke0();
            case 21:
                iyg0 iyg0VarJ = s8iVar.r.j();
                x1x.x(iyg0VarJ);
                return iyg0VarJ;
            case 22:
                wpx wpxVarW = s8iVar.r.w();
                x1x.x(wpxVarW);
                return wpxVarW;
            case 23:
                return new aei0(s8iVar.s);
            case 24:
                return new tpu(new nr00((vdd0) ((lrc) s8iVar.t.f24171a).b));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new rmt(s8iVar.s);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new igu(s8iVar.s);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new stu(((kki) s8iVar.o.f23980a).r());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new xri0(((kki) s8iVar.o.f23980a).r());
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                kki kkiVar = (kki) s8iVar.o.f23980a;
                return new zzb(new erc(kkiVar.r()), new bbw0((Object) kkiVar.r(), (byte) 19));
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return new kc60(s8iVar.u);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                xox xoxVarD = s8iVar.n.d();
                x1x.x(xoxVarD);
                return xoxVarD;
            case 32:
                return new rgu(s8iVar.v);
            case 33:
                return new nnk((j1q0) ((xzp) s8iVar.w.b).f41764a);
            case 34:
                return new wiu(s8iVar.v);
            case 35:
                phf0 phf0Var = (phf0) s8iVar.p.f20589a;
                return new cgk(new vgk((us00) phf0Var.b), new a1d((tgk) phf0Var.c));
            case 36:
                return new b5u(new a1d((tgk) ((phf0) s8iVar.p.f20589a).c));
            case 37:
                return ((xzp) s8iVar.w.b).w();
            case 38:
                return new dlx(new gle0(), new rqt(), s8iVar.q.f36881a.a(), (jlx) s8iVar.C.f44459a);
            case 39:
                return new ldj();
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object d() {
        o9i o9iVar = (o9i) this.c;
        bzt bztVar = (bzt) o9iVar.j;
        duj dujVar = o9iVar.f24881a;
        cad cadVar = (cad) o9iVar.d;
        pru pruVar = (pru) o9iVar.k;
        wsf0 wsf0Var = (wsf0) o9iVar.i;
        byte b = this.b;
        if (b != 0) {
            if (b == 1) {
                return new oo();
            }
            if (b == 2) {
                return new hw3();
            }
            if (b == 3) {
                return new hk5();
            }
            c99.h(b);
            return null;
        }
        String str = (String) o9iVar.o;
        mne mneVarH = ((psc) cadVar.b).h();
        x1x.x(mneVarH);
        mne mneVarH2 = ((psc) cadVar.b).h();
        x1x.x(mneVarH2);
        cpc cpcVar = new cpc(o9iVar.d());
        g45 g45Var = (g45) wsf0Var.b;
        vgs0 vgs0Var = new vgs0(mneVarH2, new w5z(cpcVar, g45Var.o(), g45Var.y(), pruVar, (lbu) o9iVar.s), new lsn(o9iVar.d()));
        ivn ivnVar = new ivn(o9iVar.d());
        yox yoxVar = new yox(o9iVar.d());
        do20 do20Var = new do20(o9iVar.d());
        cpc cpcVar2 = new cpc(o9iVar.d());
        a7q a7qVar = new a7q(new yk50((hk5) ((n5d0) o9iVar.C).get()));
        ocl oclVar = (ocl) o9iVar.t;
        m1e m1eVar = (m1e) o9iVar.c;
        ctf0 ctf0Var = (ctf0) o9iVar.b;
        phf0 phf0VarX = ((g45) wsf0Var.b).x();
        byte b2 = 25;
        pzu pzuVar = new pzu(new epi0(new yk50((hk5) ((n5d0) o9iVar.C).get()), b2), new h03(new yk50((hk5) ((n5d0) o9iVar.C).get()), b2), pruVar, (rou) o9iVar.u, ((g45) wsf0Var.b).y(), bztVar);
        i1w0 i1w0Var = (i1w0) o9iVar.v;
        zg zgVar = (zg) o9iVar.w;
        ih5 ih5Var = (ih5) o9iVar.e;
        ih5 ih5Var2 = (ih5) o9iVar.h;
        l7k l7kVar = (l7k) o9iVar.f;
        qgd qgdVar = (qgd) o9iVar.x;
        v88 v88Var = (v88) o9iVar.g;
        db9 db9Var = (db9) o9iVar.y;
        lme0 lme0Var = new lme0((byte) 7);
        g45 g45Var2 = (g45) wsf0Var.b;
        xru xruVarF = g45Var2.F();
        sp spVarW = g45Var2.w();
        nou nouVarE = g45Var2.E();
        yqc yqcVarC = ((rmd0) o9iVar.z).c();
        x1x.x(yqcVarC);
        return new l2k0(str, mneVarH, dujVar, vgs0Var, ivnVar, yoxVar, do20Var, cpcVar2, a7qVar, oclVar, m1eVar, ctf0Var, phf0VarX, pruVar, bztVar, pzuVar, new kb0(i1w0Var, zgVar, ih5Var, ih5Var2, l7kVar, qgdVar, v88Var, db9Var, lme0Var, xruVarF, spVarW, nouVarE, new mnb(yqcVarC, ((qgd) ((roi0) o9iVar.A).f30839a).x(), wsf0Var.b(), wsf0Var.q(), g45Var2.b(), wsf0Var.s(), (byte) 0), (hse0) o9iVar.B, (btt0) o9iVar.q, dujVar), (cmt) o9iVar.l);
    }

    private final Object e() {
        p9i p9iVar = (p9i) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                jmu jmuVar = new jmu((cu5) p9iVar.y.get(), p9iVar.j, p9iVar.k);
                pmi pmiVar = p9iVar.l;
                pru pruVar = p9iVar.g;
                cdu cduVar = p9iVar.m;
                ntu ntuVar = p9iVar.n;
                kqc kqcVar = p9iVar.o;
                epc epcVarL = p9iVar.p.l();
                x1x.x(epcVarL);
                return new fmt(jmuVar, pmiVar, pruVar, cduVar, ntuVar, kqcVar, epcVarL);
            case 1:
                return new cu5(new peg0(p9iVar.f26606a, (byte) 13), new jr5(p9iVar.b), p9iVar.c, p9iVar.d, p9iVar.e, p9iVar.f, p9iVar.g, p9iVar.h, p9iVar.i);
            case 2:
                ant antVarR = p9iVar.R();
                pmi pmiVar2 = p9iVar.l;
                kqc kqcVar2 = p9iVar.o;
                epc epcVarL2 = p9iVar.p.l();
                x1x.x(epcVarL2);
                return new zmt(epcVarL2, kqcVar2, pmiVar2, antVarR, p9iVar.g);
            case 3:
                ant antVarR2 = p9iVar.R();
                pmi pmiVar3 = p9iVar.l;
                epc epcVarL3 = p9iVar.p.l();
                x1x.x(epcVarL3);
                return new xmt(antVarR2, pmiVar3, epcVarL3, p9iVar.q, p9iVar.o, p9iVar.g);
            case 4:
                ynt yntVar = new ynt((cu5) p9iVar.y.get(), p9iVar.j, p9iVar.k, (byte) 0);
                pmi pmiVar4 = p9iVar.l;
                kqc kqcVar3 = p9iVar.o;
                epc epcVarL4 = p9iVar.p.l();
                x1x.x(epcVarL4);
                return new xnt(epcVarL4, kqcVar3, pmiVar4, yntVar, p9iVar.g);
            case 5:
                ynt yntVar2 = new ynt((cu5) p9iVar.y.get(), p9iVar.j, p9iVar.k, (byte) 0);
                pru pruVar2 = p9iVar.g;
                pmi pmiVar5 = p9iVar.l;
                kqc kqcVar4 = p9iVar.o;
                epc epcVarL5 = p9iVar.p.l();
                x1x.x(epcVarL5);
                return new fst(epcVarL5, kqcVar4, pmiVar5, yntVar2, pruVar2);
            case 6:
                fst fstVar = (fst) p9iVar.D.get();
                nmo nmoVar = new nmo((cu5) p9iVar.y.get());
                cu5 cu5Var = (cu5) p9iVar.y.get();
                cu5Var.getClass();
                onv onvVar = new onv();
                onvVar.f25567a = cu5Var;
                return new dst(fstVar, nmoVar, onvVar, (pyg0) p9iVar.E.get());
            case 7:
                return new pyg0((cu5) p9iVar.y.get());
            case 8:
                return new nyt((syt) p9iVar.J.get(), new uyn((rwc) p9iVar.H.get()), (qyg0) p9iVar.K.get(), new bzu((rwc) p9iVar.H.get()));
            case 9:
                n5d0 n5d0Var = p9iVar.I;
                wsf0 wsf0Var = p9iVar.u;
                return new syt((iyt) n5d0Var.get(), p9iVar.r, p9iVar.s, p9iVar.t, ((g45) wsf0Var.b).y(), p9iVar.n, p9iVar.v, ((g45) wsf0Var.b).t(), p9iVar.w, p9iVar.x);
            case 10:
                return new iyt((rwc) p9iVar.H.get());
            case 11:
                return new rwc(p9iVar.q, new do20(p9iVar.f26606a, (byte) 29), new nhf0(p9iVar.b), (up70) p9iVar.G.get(), p9iVar.c, p9iVar.d, p9iVar.f);
            case 12:
                up70 up70Var = new up70();
                up70Var.f36049a = new LinkedHashMap();
                return up70Var;
            case 13:
                return new qyg0((rwc) p9iVar.H.get());
            case 14:
                n5d0 n5d0Var2 = p9iVar.M;
                wsf0 wsf0Var2 = p9iVar.u;
                return new pyt((tyt) n5d0Var2.get(), p9iVar.r, p9iVar.s, p9iVar.t, ((g45) wsf0Var2.b).y(), p9iVar.n, p9iVar.v, ((g45) wsf0Var2.b).t(), p9iVar.w, p9iVar.x, p9iVar.q);
            case 15:
                return new tyt((rwc) p9iVar.H.get());
            case 16:
                cu5 cu5Var2 = (cu5) p9iVar.y.get();
                cu5Var2.getClass();
                bwl bwlVar = new bwl();
                bwlVar.f3330a = cu5Var2;
                return new wrt(bwlVar, p9iVar.l);
            case 17:
                ant antVar = new ant((cu5) p9iVar.y.get(), p9iVar.j, p9iVar.k, (byte) 1);
                pmi pmiVar6 = p9iVar.l;
                epc epcVarL6 = p9iVar.p.l();
                x1x.x(epcVarL6);
                return new l2u(epcVarL6, p9iVar.o, pmiVar6, antVar, p9iVar.g);
            case 18:
                jmu jmuVar2 = new jmu((cu5) p9iVar.y.get(), p9iVar.j, p9iVar.k);
                pmi pmiVar7 = p9iVar.l;
                pru pruVar3 = p9iVar.g;
                epc epcVarL7 = p9iVar.p.l();
                x1x.x(epcVarL7);
                return new imu(jmuVar2, pmiVar7, pruVar3, epcVarL7, p9iVar.o);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ant antVar2 = new ant((cu5) p9iVar.y.get(), p9iVar.j, p9iVar.k, (byte) 2);
                pmi pmiVar8 = p9iVar.l;
                epc epcVarL8 = p9iVar.p.l();
                x1x.x(epcVarL8);
                return new pnu(epcVarL8, p9iVar.o, pmiVar8, antVar2, p9iVar.g);
            case 20:
                ynt yntVar3 = new ynt((cu5) p9iVar.y.get(), p9iVar.j, p9iVar.k, (byte) 1);
                pmi pmiVar9 = p9iVar.l;
                epc epcVarL9 = p9iVar.p.l();
                x1x.x(epcVarL9);
                return new iuu(epcVarL9, p9iVar.o, pmiVar9, yntVar3, p9iVar.g);
            case 21:
                lbu lbuVar = new lbu((cu5) p9iVar.y.get(), p9iVar.j, p9iVar.k);
                pmi pmiVar10 = p9iVar.l;
                epc epcVarL10 = p9iVar.p.l();
                x1x.x(epcVarL10);
                return new hzu(lbuVar, pmiVar10, epcVarL10, p9iVar.o, p9iVar.g);
            case 22:
                return new rpc((cu5) p9iVar.y.get());
            case 23:
                cu5 cu5Var3 = (cu5) p9iVar.y.get();
                j1q0 j1q0Var = p9iVar.j;
                wsz wszVar = p9iVar.k;
                cu5Var3.getClass();
                j1q0Var.getClass();
                fhj fhjVar = new fhj();
                fhjVar.f9543a = cu5Var3;
                fhjVar.b = j1q0Var;
                pmi pmiVar11 = p9iVar.l;
                kqc kqcVar5 = p9iVar.o;
                epc epcVarL11 = p9iVar.p.l();
                x1x.x(epcVarL11);
                return new zrt(fhjVar, pmiVar11, kqcVar5, epcVarL11, p9iVar.g);
            case 24:
                j2u j2uVar = (j2u) p9iVar.W.get();
                o8u o8uVar = new o8u((b2g) p9iVar.X.get(), (byte) 1);
                pmi pmiVar12 = p9iVar.l;
                epc epcVarL12 = p9iVar.p.l();
                x1x.x(epcVarL12);
                return new n2u(j2uVar, o8uVar, pmiVar12, epcVarL12, p9iVar.o, p9iVar.g);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return new j2u((cu5) p9iVar.y.get(), p9iVar.j, p9iVar.k);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new b2g(new ehf0((byte) 26));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                j2u j2uVar2 = (j2u) p9iVar.W.get();
                pmi pmiVar13 = p9iVar.l;
                o8u o8uVar2 = new o8u((b2g) p9iVar.X.get(), (byte) 1);
                o8u o8uVar3 = new o8u((b2g) p9iVar.X.get(), (byte) 0);
                epc epcVarL13 = p9iVar.p.l();
                x1x.x(epcVarL13);
                return new q8u(j2uVar2, pmiVar13, o8uVar2, o8uVar3, epcVarL13, p9iVar.o, p9iVar.g);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                j2u j2uVar3 = (j2u) p9iVar.W.get();
                pmi pmiVar14 = p9iVar.l;
                pv00 pv00Var = new pv00((ux80) p9iVar.a0.get());
                yfu yfuVar = new yfu((ux80) p9iVar.a0.get());
                epc epcVarL14 = p9iVar.p.l();
                x1x.x(epcVarL14);
                return new bnu(j2uVar3, pmiVar14, pv00Var, yfuVar, epcVarL14, p9iVar.o, p9iVar.g);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                return new ux80(new yox((byte) 21));
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                j2u j2uVar4 = (j2u) p9iVar.W.get();
                pmi pmiVar15 = p9iVar.l;
                epc epcVarL15 = p9iVar.p.l();
                x1x.x(epcVarL15);
                return new dnu(j2uVar4, pmiVar15, epcVarL15, p9iVar.o, p9iVar.g);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                ((cu5) p9iVar.y.get()).getClass();
                return new bst();
            case 32:
                return new o0u((zuf) p9iVar.d0.get());
            case 33:
                return new zuf(new jr5(p9iVar.b), new clc(p9iVar.f26606a, (byte) 15));
            case 34:
                n5d0 n5d0Var3 = p9iVar.M;
                wsf0 wsf0Var3 = p9iVar.u;
                return new lyt((tyt) n5d0Var3.get(), p9iVar.r, p9iVar.s, p9iVar.t, ((g45) wsf0Var3.b).y(), p9iVar.n, p9iVar.v, ((g45) wsf0Var3.b).t(), p9iVar.w, p9iVar.x);
            case 35:
                n5d0 n5d0Var4 = p9iVar.g0;
                wsf0 wsf0Var4 = p9iVar.u;
                return new gyt((hyt) n5d0Var4.get(), p9iVar.s, ((g45) wsf0Var4.b).y(), p9iVar.n, p9iVar.v, ((g45) wsf0Var4.b).t(), p9iVar.w, p9iVar.x, p9iVar.r);
            case 36:
                return new hyt((rwc) p9iVar.H.get());
            case 37:
                return new gvt((b2g) p9iVar.X.get());
            case 38:
                p9iVar.R();
                x1x.x(p9iVar.p.l());
                return new pnt();
            case 39:
                return new hvt((b2g) p9iVar.X.get());
            case 40:
                return new bnt((cu5) p9iVar.y.get());
            case 41:
                return new cyg0((b2g) p9iVar.X.get());
            case 42:
                return new gpc((cu5) p9iVar.y.get());
            case 43:
                return new tpc((rwc) p9iVar.H.get());
            case 44:
                return new urc((cu5) p9iVar.y.get());
            case 45:
                return new vrc((rwc) p9iVar.H.get());
            case 46:
                return new asi0((cu5) p9iVar.y.get());
            case 47:
                return new coi0((rwc) p9iVar.H.get());
            case 48:
                return new siu((rwc) p9iVar.H.get());
            case 49:
                return new riu((cu5) p9iVar.y.get(), p9iVar.j);
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object f() {
        h6i h6iVar = (h6i) this.c;
        byte b = this.b;
        if (b == 0) {
            return new aai(this);
        }
        if (b == 1) {
            twz twzVar = (twz) ((n5d0) h6iVar.m).get();
            twzVar.getClass();
            return new jni0(twzVar);
        }
        if (b == 2) {
            return euw.k((htz) h6iVar.e, (lwz) ((n5d0) h6iVar.c).get(), (kwz) h6iVar.g, (njo) h6iVar.h, (btt0) h6iVar.i, (ctf0) h6iVar.f12530a);
        }
        if (b == 3) {
            gii0 gii0Var = (gii0) h6iVar.f;
            gii0Var.getClass();
            return new lwz(gii0Var);
        }
        if (b != 4) {
            c99.h(b);
            return null;
        }
        twz twzVar2 = (twz) ((n5d0) h6iVar.m).get();
        twzVar2.getClass();
        return new jvt(twzVar2);
    }

    private final Object g() {
        cai caiVar = (cai) this.c;
        b8h0 b8h0Var = caiVar.b;
        byte b = this.b;
        switch (b) {
            case 0:
                return new uga0(caiVar.f4012a);
            case 1:
                return new n8u((noo) caiVar.f.get());
            case 2:
                return new noo((moo) caiVar.e.get());
            case 3:
                return new moo();
            case 4:
                return new omo((noo) caiVar.f.get());
            case 5:
                return new rmo((noo) caiVar.f.get());
            case 6:
                return new zsu(b8h0Var);
            case 7:
                return new rku(b8h0Var, caiVar.c);
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object h() {
        eai eaiVar = (eai) this.c;
        byte b = this.b;
        if (b == 0) {
            return new eu7(new bbw0(eaiVar.f7465a, (byte) 13), (zpp0) eaiVar.f.get(), (tga0) eaiVar.g.get(), eaiVar.b, eaiVar.c, eaiVar.d, eaiVar.e);
        }
        if (b == 1) {
            return new zpp0();
        }
        if (b == 2) {
            return new tga0();
        }
        if (b == 3) {
            return new hqp0((zpp0) eaiVar.f.get());
        }
        if (b == 4) {
            return new b8h0((w7h0) eaiVar.j.get());
        }
        if (b == 5) {
            return new w7h0();
        }
        c99.h(b);
        return null;
    }

    private final Object i() {
        daf dafVar = (daf) this.c;
        duj dujVar = (duj) dafVar.g;
        cad cadVar = (cad) dafVar.b;
        pru pruVar = (pru) dafVar.e;
        gst0 gst0Var = (gst0) dafVar.d;
        pbt pbtVar = (pbt) dafVar.c;
        byte b = this.b;
        if (b == 0) {
            mne mneVarH = ((psc) cadVar.b).h();
            x1x.x(mneVarH);
            return new gj8(mneVarH, new jtj(pbtVar, gst0Var), pruVar, (ctf0) dafVar.f);
        }
        if (b == 1) {
            jtj jtjVar = new jtj(pbtVar, gst0Var);
            mne mneVarH2 = ((psc) cadVar.b).h();
            x1x.x(mneVarH2);
            return new tj8(jtjVar, pruVar, mneVarH2, dujVar, (i1w0) dafVar.h, (ocl) dafVar.i, (ctf0) dafVar.f);
        }
        if (b != 2) {
            c99.h(b);
            return null;
        }
        jtj jtjVar2 = new jtj(pbtVar, gst0Var);
        mne mneVarH3 = ((psc) cadVar.b).h();
        x1x.x(mneVarH3);
        return new yj8(jtjVar2, pruVar, mneVarH3, dujVar, (i1w0) dafVar.h, (sa10) dafVar.j);
    }

    private final Object j() {
        v5i v5iVar = (v5i) this.c;
        byte b = this.b;
        if (b == 0) {
            return new btr((m49) v5iVar.f, (ysr) v5iVar.g, (nhv0) v5iVar.c, (n49) v5iVar.h, (atr) v5iVar.i, (rsr) v5iVar.j);
        }
        if (b != 1) {
            if (b == 2) {
                return new neu0((meu0) v5iVar.r);
            }
            if (b == 3) {
                return new d49((c49) v5iVar.s);
            }
            c99.h(b);
            return null;
        }
        tgk tgkVar = (tgk) v5iVar.k;
        bwl bwlVar = new bwl((gii0) v5iVar.l, (byte) 12);
        ivn ivnVar = new ivn((azj0) v5iVar.m);
        us3 us3Var = (us3) v5iVar.n;
        mne mneVarH = ((psc) ((cad) v5iVar.o).b).h();
        x1x.x(mneVarH);
        return new yxs(tgkVar, bwlVar, ivnVar, us3Var, mneVarH, (knf0) v5iVar.b, (btt0) v5iVar.p);
    }

    private final Object k() {
        tai taiVar = (tai) this.c;
        gst0 gst0Var = taiVar.e;
        cad cadVar = taiVar.d;
        viu viuVar = (viu) taiVar.A;
        byte b = 12;
        byte b2 = this.b;
        if (b2 == 0) {
            BroadcastingVideoLandscapeParams broadcastingVideoLandscapeParams = (BroadcastingVideoLandscapeParams) taiVar.k;
            m1e m1eVar = taiVar.f;
            lbu lbuVar = new lbu((yxs) taiVar.i.get(), gst0Var);
            ali aliVar = new ali((oeg0) taiVar.o, new yk5(), new kj5(), new gl5(b), new zsr((us00) taiVar.p, new lut((btr) taiVar.j.get(), (byte) 1), new mpx((btr) taiVar.j.get(), (byte) 0), new mpx((btr) taiVar.j.get(), (byte) 2), new sdi0((btr) taiVar.j.get(), (byte) 1), new xsc((btr) taiVar.j.get(), (byte) 0), new yqc((btr) taiVar.j.get())), (mi70) taiVar.w, taiVar.h);
            a5v a5vVar = new a5v((btr) taiVar.j.get(), (byte) 3);
            lut lutVar = new lut((btr) taiVar.j.get(), (byte) 2);
            sdi0 sdi0Var = new sdi0((btr) taiVar.j.get(), (byte) 0);
            yox yoxVar = new yox((neu0) ((n5d0) taiVar.E).get());
            ljf0 ljf0Var = new ljf0((neu0) ((n5d0) taiVar.E).get());
            hrx hrxVar = new hrx((neu0) ((n5d0) taiVar.E).get(), (byte) 1);
            reu reuVar = new reu((b3c0) taiVar.y);
            iqt iqtVar = new iqt(gst0Var);
            mne mneVarH = ((psc) cadVar.b).h();
            x1x.x(mneVarH);
            return new k69(broadcastingVideoLandscapeParams, m1eVar, lbuVar, aliVar, a5vVar, lutVar, sdi0Var, yoxVar, ljf0Var, hrxVar, reuVar, iqtVar, mneVarH, new fuj0(new eyg0((d49) ((n5d0) taiVar.F).get()), viuVar), new nw20(new iw20((d49) ((n5d0) taiVar.F).get()), viuVar), new chf0(new yqc((d49) ((n5d0) taiVar.F).get()), viuVar), new xex((vd1) taiVar.B, (ik4) taiVar.C), (g2v) taiVar.D, new lut((btr) taiVar.j.get(), (byte) 0), new hrx((neu0) ((n5d0) taiVar.E).get(), (byte) 0), taiVar.g);
        }
        if (b2 == 1) {
            tgk tgkVar = (tgk) taiVar.l;
            bwl bwlVar = new bwl(taiVar.b, (byte) 12);
            ivn ivnVar = new ivn((azj0) taiVar.m);
            us3 us3Var = (us3) taiVar.n;
            mne mneVarH2 = ((psc) cadVar.b).h();
            x1x.x(mneVarH2);
            return new yxs(tgkVar, bwlVar, ivnVar, us3Var, mneVarH2, taiVar.c, taiVar.f33612a);
        }
        if (b2 == 2) {
            return new btr((m49) taiVar.q, (ysr) taiVar.r, (nhv0) taiVar.s, (n49) taiVar.t, (atr) taiVar.u, (rsr) taiVar.v);
        }
        if (b2 == 3) {
            return new neu0((meu0) taiVar.x);
        }
        if (b2 == 4) {
            return new d49((c49) taiVar.z);
        }
        c99.h(b2);
        return null;
    }

    private final Object l() {
        uai uaiVar = (uai) this.c;
        viu viuVar = uaiVar.q;
        byte b = this.b;
        if (b == 0) {
            return new wzs(new ali(uaiVar.f35329a, new yk5(), new kj5(), new gl5((byte) 12), new zsr(uaiVar.b, new lut((btr) uaiVar.u.get(), (byte) 1), new mpx((btr) uaiVar.u.get(), (byte) 0), new mpx((btr) uaiVar.u.get(), (byte) 2), new sdi0((btr) uaiVar.u.get(), (byte) 1), new xsc((btr) uaiVar.u.get(), (byte) 0), new yqc((btr) uaiVar.u.get())), uaiVar.i, uaiVar.j), new xsc((btr) uaiVar.u.get(), (byte) 0), new mpx((btr) uaiVar.u.get(), (byte) 1), new mpx((btr) uaiVar.u.get(), (byte) 2), new a5v((btr) uaiVar.u.get(), (byte) 1), new lut((btr) uaiVar.u.get(), (byte) 2), new yox((neu0) uaiVar.v.get()), new ljf0((neu0) uaiVar.v.get()), new hrx((neu0) uaiVar.v.get(), (byte) 1), new iqt(uaiVar.l), uaiVar.m, uaiVar.n, new hrx((neu0) uaiVar.v.get(), (byte) 0), new g2v(uaiVar.o), new psc((neu0) uaiVar.v.get()), new fuj0(new eyg0((d49) uaiVar.w.get()), viuVar), new nw20(new iw20((d49) uaiVar.w.get()), viuVar), new chf0(new yqc((d49) uaiVar.w.get()), viuVar), new xex(uaiVar.r, uaiVar.s), new lut((btr) uaiVar.u.get(), (byte) 0), uaiVar.t);
        }
        if (b == 1) {
            return new btr(uaiVar.c, uaiVar.d, uaiVar.e, uaiVar.f, uaiVar.g, uaiVar.h);
        }
        if (b == 2) {
            return new neu0(uaiVar.k);
        }
        if (b == 3) {
            return new d49(uaiVar.p);
        }
        c99.h(b);
        return null;
    }

    private final Object m() {
        v9i v9iVar = (v9i) this.c;
        ntu ntuVar = (ntu) v9iVar.u;
        yox yoxVar = (yox) v9iVar.p;
        ik4 ik4Var = (ik4) v9iVar.t;
        vd1 vd1Var = (vd1) v9iVar.s;
        cad cadVar = (cad) v9iVar.c;
        BroadcastingZoneLandscapeParams broadcastingZoneLandscapeParams = (BroadcastingZoneLandscapeParams) v9iVar.f;
        viu viuVar = (viu) v9iVar.r;
        byte b = this.b;
        if (b == 0) {
            m1e m1eVar = v9iVar.b;
            mne mneVarH = ((psc) cadVar.b).h();
            x1x.x(mneVarH);
            return new p89(broadcastingZoneLandscapeParams, m1eVar, mneVarH, v9iVar.d(), new a5v((btr) ((n5d0) v9iVar.v).get(), (byte) 3), new sdi0((btr) ((n5d0) v9iVar.v).get(), (byte) 0), new wgu(yoxVar), new fuj0(new eyg0((d49) ((n5d0) v9iVar.w).get()), viuVar), new nw20(new iw20((d49) ((n5d0) v9iVar.w).get()), viuVar), new chf0(new yqc((d49) ((n5d0) v9iVar.w).get()), viuVar), new xex(vd1Var, ik4Var), new bdu(ntuVar));
        }
        if (b == 1) {
            return new btr((m49) v9iVar.i, (ysr) v9iVar.j, (nhv0) v9iVar.k, (n49) v9iVar.l, (atr) v9iVar.m, (rsr) v9iVar.n);
        }
        if (b == 2) {
            return new d49((c49) v9iVar.q);
        }
        if (b != 3) {
            c99.h(b);
            return null;
        }
        m1e m1eVar2 = v9iVar.b;
        mne mneVarH2 = ((psc) cadVar.b).h();
        x1x.x(mneVarH2);
        return new s79(broadcastingZoneLandscapeParams, m1eVar2, mneVarH2, v9iVar.d(), new a5v((btr) ((n5d0) v9iVar.v).get(), (byte) 3), new sdi0((btr) ((n5d0) v9iVar.v).get(), (byte) 0), new fuj0(new eyg0((d49) ((n5d0) v9iVar.w).get()), viuVar), new nw20(new iw20((d49) ((n5d0) v9iVar.w).get()), viuVar), new chf0(new yqc((d49) ((n5d0) v9iVar.w).get()), viuVar), new xex(vd1Var, ik4Var), new wgu(yoxVar), new bdu(ntuVar), v9iVar.e);
    }

    private final Object n() {
        vai vaiVar = (vai) this.c;
        viu viuVar = vaiVar.n;
        byte b = this.b;
        if (b == 0) {
            return new x1t(new ali(vaiVar.f37088a, new yk5(), new kj5(), new gl5((byte) 12), new zsr(vaiVar.b, new lut((btr) vaiVar.r.get(), (byte) 1), new mpx((btr) vaiVar.r.get(), (byte) 0), new mpx((btr) vaiVar.r.get(), (byte) 2), new sdi0((btr) vaiVar.r.get(), (byte) 1), new xsc((btr) vaiVar.r.get(), (byte) 0), new yqc((btr) vaiVar.r.get())), vaiVar.i, vaiVar.j), new yqc((btr) vaiVar.r.get()), new mpx((btr) vaiVar.r.get(), (byte) 1), new kut((btr) vaiVar.r.get(), (byte) 1), vaiVar.k, vaiVar.l, new sdi0((btr) vaiVar.r.get(), (byte) 1), new fuj0(new eyg0((d49) vaiVar.s.get()), viuVar), new nw20(new iw20((d49) vaiVar.s.get()), viuVar), new chf0(new yqc((d49) vaiVar.s.get()), viuVar), new xex(vaiVar.o, vaiVar.p), new wgu(vaiVar.q));
        }
        if (b == 1) {
            return new btr(vaiVar.c, vaiVar.d, vaiVar.e, vaiVar.f, vaiVar.g, vaiVar.h);
        }
        if (b == 2) {
            return new d49(vaiVar.m);
        }
        c99.h(b);
        return null;
    }

    private final Object o() {
        wai waiVar = (wai) this.c;
        byte b = this.b;
        switch (b) {
            case 0:
                return new wut((oh9) waiVar.e.get());
            case 1:
                nh9 nh9Var = (nh9) waiVar.d.get();
                peg0 peg0Var = new peg0(waiVar.f38827a, (byte) 17);
                knf0 knf0Var = waiVar.b;
                mne mneVarH = ((psc) waiVar.c.b).h();
                x1x.x(mneVarH);
                return new oh9(nh9Var, peg0Var, knf0Var, mneVarH);
            case 2:
                return new nh9();
            case 3:
                return new out((oh9) waiVar.e.get());
            case 4:
                return new tut((oh9) waiVar.e.get());
            case 5:
                return new cvt((oh9) waiVar.e.get());
            case 6:
                return new zut((oh9) waiVar.e.get());
            case 7:
                return new ntb0((oh9) waiVar.e.get());
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object p() {
        bbi bbiVar = (bbi) this.c;
        cad cadVar = bbiVar.b;
        byte b = this.b;
        if (b == 0) {
            a7q a7qVar = new a7q((or9) bbiVar.n.get());
            a1d a1dVar = new a1d((or9) bbiVar.n.get());
            ctf0 ctf0Var = bbiVar.d;
            mne mneVarH = ((psc) cadVar.b).h();
            x1x.x(mneVarH);
            return new mr9(a7qVar, a1dVar, ctf0Var, mneVarH, bbiVar.e, bbiVar.f, bbiVar.g, new ehf0(new ag3(bbiVar.h, (byte) 1), bbiVar.i, (byte) 14));
        }
        if (b != 1) {
            if (b == 2) {
                return new abi(this);
            }
            c99.h(b);
            return null;
        }
        ok50 ok50Var = new ok50(bbiVar.f2309a, (byte) 22);
        mne mneVarH2 = ((psc) cadVar.b).h();
        x1x.x(mneVarH2);
        return new or9(ok50Var, mneVarH2, bbiVar.c);
    }

    private final Object q() {
        String string;
        hbi hbiVar = (hbi) this.c;
        jw9 jw9Var = null;
        byte b = this.b;
        switch (b) {
            case 0:
                return new r1a((bby) ((n5d0) hbiVar.f12771a).get());
            case 1:
                return zvw.g();
            case 2:
                return new zy9((nx9) ((n5d0) hbiVar.v).get());
            case 3:
                i1a i1aVar = (i1a) ((ok50) hbiVar.b).f25390a;
                r5i r5iVar = (r5i) hbiVar.A;
                Context contextA = hbiVar.a();
                qcq0 qcq0Var = (qcq0) ((n5d0) hbiVar.f).get();
                r1a r1aVar = (r1a) ((n5d0) hbiVar.e).get();
                r5iVar.getClass();
                qcq0Var.getClass();
                r1aVar.getClass();
                Map map = i1aVar.d.f10502a;
                try {
                    Trace.beginSection("Initialize defaultCameraBackend");
                    wv9 wv9Var = (wv9) r5iVar.get();
                    Trace.endSection();
                    String str = "CXCP-Camera2";
                    if (map.containsKey(new mx9(str))) {
                        c99.t(mx9.a("CXCP-Camera2"), ". Use CameraBackendConfig#internalBackend field instead.", "CameraBackendConfig#cameraBackends should not contain a backend with ");
                        return null;
                    }
                    Map mapK = xp20.k(map, new Pair(new mx9(str), new s1a(wv9Var)));
                    if (mapK.containsKey(new mx9(str))) {
                        return new nx9("CXCP-Camera2", mapK, contextA, qcq0Var, r1aVar);
                    }
                    StringBuilder sb = new StringBuilder("Failed to find ");
                    sb.append((Object) mx9.a("CXCP-Camera2"));
                    c99.r(sb, " in the list of available CameraPipe backends! Available values are ", mapK.keySet());
                    return null;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 4:
                return new wv9((qcq0) ((n5d0) hbiVar.f).get(), (cx9) ((n5d0) hbiVar.k).get(), (ix9) ((n5d0) hbiVar.n).get(), (k7d0) ((n5d0) hbiVar.u).get(), new cad((Object) hbiVar, (byte) 7), hbiVar.a());
            case 5:
                y78 y78Var = (y78) hbiVar.c;
                r1a r1aVar2 = (r1a) ((n5d0) hbiVar.e).get();
                bby bbyVar = (bby) ((n5d0) hbiVar.f12771a).get();
                r1aVar2.getClass();
                bbyVar.getClass();
                ArrayList arrayList = new ArrayList();
                ThreadFactory threadFactory = o23.b;
                int i = -1;
                ScheduledExecutorService scheduledExecutorServiceA = o23.a(new l23(i, o23.b("CXCP-IO-", threadFactory)), 8);
                arrayList.add(scheduledExecutorServiceA);
                lne lneVarY = obb.Y(scheduledExecutorServiceA);
                ScheduledExecutorService scheduledExecutorServiceA2 = o23.a(new l23(i, o23.b("CXCP-BG-", threadFactory)), 4);
                arrayList.add(scheduledExecutorServiceA2);
                lne lneVarY2 = obb.Y(scheduledExecutorServiceA2);
                ScheduledExecutorService scheduledExecutorServiceA3 = o23.a(new l23(-3, o23.b("CXCP-", threadFactory)), y78Var.b);
                arrayList.add(scheduledExecutorServiceA3);
                lne lneVarY3 = obb.Y(scheduledExecutorServiceA3);
                r1aVar2.a(p1a.c, new apj0((Object) arrayList, (byte) 15));
                h3q0 h3q0Var = new h3q0(y78Var, r1aVar2);
                yip0 yip0Var = new yip0((Object) y78Var, (Object) r1aVar2, (byte) 12);
                mie0 mie0Var = new mie0();
                mie0 mie0Var2 = new mie0();
                mie0Var.f21842a = d5c.a(kotlin.coroutines.e.c(new kin0(bbyVar), lneVarY3).plus(new rne("CXCP")));
                mie0Var2.f21842a = d5c.a(kotlin.coroutines.e.c(new kin0(bbyVar), new rne("CXCP-Dispatch")));
                r1aVar2.a(p1a.b, new qaq0(mie0Var, mie0Var2, (byte) 1));
                return new qcq0((vne) mie0Var.f21842a, (vne) mie0Var2.f21842a, scheduledExecutorServiceA, lneVarY, scheduledExecutorServiceA2, lneVarY2, scheduledExecutorServiceA3, lneVarY3, h3q0Var, yip0Var);
            case 6:
                return new cx9((n5d0) hbiVar.g, (qcq0) ((n5d0) hbiVar.f).get(), hbiVar.a(), (PackageManager) ((n5d0) hbiVar.h).get(), (gx9) ((n5d0) hbiVar.i).get(), (n5d0) hbiVar.j, (r1a) ((n5d0) hbiVar.e).get(), (bby) ((n5d0) hbiVar.f12771a).get());
            case 7:
                Object systemService = hbiVar.a().getSystemService("camera");
                systemService.getClass();
                return (CameraManager) systemService;
            case 8:
                PackageManager packageManager = hbiVar.a().getPackageManager();
                packageManager.getClass();
                return packageManager;
            case 9:
                return new gx9();
            case 10:
                Context contextA2 = hbiVar.a();
                xy9 xy9Var = new xy9();
                if (Build.VERSION.SDK_INT >= 35) {
                    xy9Var.b = new jw9(contextA2);
                }
                try {
                    ServiceInfo[] serviceInfoArr = contextA2.getPackageManager().getPackageInfo(contextA2.getPackageName(), 132).services;
                    if (serviceInfoArr != null) {
                        String str2 = null;
                        for (ServiceInfo serviceInfo : serviceInfoArr) {
                            Bundle bundle = serviceInfo.metaData;
                            if (bundle != null && (string = bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY")) != null) {
                                if (str2 != null) {
                                    jf4.n("Multiple Play Services CameraDeviceSetupCompat implementations found in the manifest.");
                                    return null;
                                }
                                str2 = string;
                            }
                        }
                        if (str2 != null) {
                            try {
                                jw9Var = (jw9) Class.forName(str2).getConstructor(Context.class).newInstance(contextA2);
                            } catch (Exception e) {
                                hny.q("Failed to instantiate Play Services CameraDeviceSetupCompat implementation", e);
                                return null;
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                xy9Var.f41696a = jw9Var;
                return xy9Var;
            case 11:
                return new ix9(hbiVar.a(), (qcq0) ((n5d0) hbiVar.f).get(), (yg90) ((n5d0) hbiVar.l).get(), ((i1a) ((ok50) hbiVar.b).f25390a).c, (cao0) ((n5d0) hbiVar.m).get());
            case 12:
                return new yg90(hbiVar.a());
            case 13:
                return new cao0();
            case 14:
                return new k7d0((yg90) ((n5d0) hbiVar.l).get(), (iag0) ((n5d0) hbiVar.s).get(), (ex9) ((n5d0) hbiVar.t).get(), (gx9) ((n5d0) hbiVar.i).get(), (qcq0) ((n5d0) hbiVar.f).get());
            case 15:
                n5d0 n5d0Var = (n5d0) hbiVar.g;
                ok50 ok50Var = (ok50) hbiVar.b;
                qcq0 qcq0Var2 = (qcq0) ((n5d0) hbiVar.f).get();
                n5d0Var.getClass();
                qcq0Var2.getClass();
                c5k c5kVar = new c5k();
                c5kVar.f3775a = n5d0Var;
                c5kVar.b = qcq0Var2;
                return new iag0(new rrd(c5kVar, (ix9) ((n5d0) hbiVar.n).get(), (gx9) ((n5d0) hbiVar.i).get(), (jx9) ((n5d0) hbiVar.p).get(), (cao0) ((n5d0) hbiVar.m).get(), ((i1a) ok50Var.f25390a).e, (qcq0) ((n5d0) hbiVar.f).get()), (gx9) ((n5d0) hbiVar.i).get(), new mii0((n5d0) hbiVar.g, (qcq0) ((n5d0) hbiVar.f).get(), (bby) ((n5d0) hbiVar.f12771a).get()), (cao0) ((n5d0) hbiVar.m).get(), (py2) ((n5d0) hbiVar.q).get(), (x34) ((n5d0) hbiVar.r).get(), ((i1a) ok50Var.f25390a).e, (qcq0) ((n5d0) hbiVar.f).get());
            case 16:
                return new jx9((ix9) ((n5d0) hbiVar.n).get(), (bsm0) ((n5d0) hbiVar.o).get());
            case 17:
                Object obj = hbiVar.b;
                return new bsm0();
            case 18:
                Object systemService2 = hbiVar.a().getSystemService("device_policy");
                systemService2.getClass();
                return new py2((DevicePolicyManager) systemService2);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new x34((qcq0) ((n5d0) hbiVar.f).get(), (r1a) ((n5d0) hbiVar.e).get(), (bby) ((n5d0) hbiVar.f12771a).get());
            case 20:
                return new ex9((qcq0) ((n5d0) hbiVar.f).get(), (jx9) ((n5d0) hbiVar.p).get(), (iag0) ((n5d0) hbiVar.s).get());
            case 21:
                hbiVar.a();
                qcq0 qcq0Var3 = (qcq0) ((n5d0) hbiVar.f).get();
                nx9 nx9Var = (nx9) ((n5d0) hbiVar.v).get();
                qcq0Var3.getClass();
                nx9Var.getClass();
                return new t1a();
            case 22:
                return new j3a();
            case 23:
                return new uqd();
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object r() {
        byte b = this.b;
        if (b == 0) {
            return new jbi(this);
        }
        if (b == 1) {
            return new kbi(this);
        }
        if (b == 2) {
            return new lbi(this);
        }
        if (b == 3) {
            return new mbi(this);
        }
        if (b == 4) {
            return new nbi(this);
        }
        if (b == 5) {
            return new obi(this);
        }
        c99.h(b);
        return null;
    }

    private final Object s() {
        rbi rbiVar = (rbi) this.c;
        wsf0 wsf0Var = rbiVar.f;
        gii0 gii0Var = rbiVar.g;
        ocl oclVar = rbiVar.G;
        duj dujVar = rbiVar.D;
        rjo rjoVar = rbiVar.E;
        ix0 ix0Var = rbiVar.N;
        u58 u58Var = rbiVar.H;
        ntu ntuVar = rbiVar.Q;
        mne mneVar = rbiVar.e;
        gst0 gst0Var = rbiVar.m;
        byte b = this.b;
        if (b == 0) {
            return new hv60(rbiVar.f30188a, rbiVar.b, rbiVar.c, rbiVar.d, mneVar, wsf0Var, new kwt((d0b) rbiVar.U.get(), (byte) 0), new o470((d0b) rbiVar.U.get()), new zri(((g45) wsf0Var.b).E(), new k9c(new ort(gst0Var, (byte) 3)), (byte) 23), rbiVar.n, rbiVar.o, rbiVar.p, rbiVar.q, rbiVar.r, rbiVar.s, rbiVar.t, rbiVar.u, rbiVar.v, rbiVar.w, rbiVar.x, rbiVar.y, rbiVar.z, rbiVar.A, rbiVar.B, rbiVar.C, dujVar, rjoVar, rbiVar.F, oclVar, u58Var, rbiVar.I, rbiVar.J, rbiVar.K, rbiVar.L, rbiVar.M, ix0Var, rbiVar.O, rbiVar.P);
        }
        if (b == 1) {
            return new d0b(new yk50(gii0Var, (byte) 18), rbiVar.h, rbiVar.i, new gxu(gii0Var), rbiVar.j, rbiVar.k, rbiVar.l);
        }
        if (b == 2) {
            return new uya(rbiVar.f30188a, rbiVar.d, mneVar, new lef0((d0b) rbiVar.U.get()), new cu(ntuVar, new kwt((d0b) rbiVar.U.get(), (byte) 1), new k9c(new ort(gst0Var, (byte) 3)), (byte) 26), new es(new kwt((d0b) rbiVar.U.get(), (byte) 1), ntuVar, new k9c(new ort(gst0Var, (byte) 3))), u58Var, ix0Var, rjoVar, dujVar, rbiVar.F, oclVar);
        }
        c99.h(b);
        return null;
    }

    private final Object t() {
        g8i g8iVar = (g8i) ((nhf0) this.c).f23530a;
        byte b = this.b;
        if (b == 0) {
            return new sbi(this);
        }
        if (b != 1) {
            if (b == 2) {
                return new tbi(this);
            }
            c99.h(b);
            return null;
        }
        gii0 gii0VarJ9 = g8iVar.j9();
        x1x.x(gii0VarJ9);
        yk50 yk50Var = new yk50(gii0VarJ9, (byte) 18);
        knf0 knf0VarJ8 = g8iVar.J8();
        x1x.x(knf0VarJ8);
        g7d g7dVar = (g7d) g8iVar.L1.get();
        x1x.x(g7dVar);
        gii0 gii0VarJ10 = g8iVar.j9();
        x1x.x(gii0VarJ10);
        gxu gxuVar = new gxu(gii0VarJ10);
        btt0 btt0VarO8 = g8iVar.o8();
        x1x.x(btt0VarO8);
        pru pruVarC5 = g8iVar.c5();
        kuy kuyVar = (kuy) g8iVar.B.get();
        x1x.x(kuyVar);
        return new d0b(yk50Var, knf0VarJ8, g7dVar, gxuVar, btt0VarO8, pruVarC5, kuyVar);
    }

    @Override // a.o5d0
    public final Object get() {
        Object p80Var;
        Object dn0Var;
        Object qo0Var;
        Object ut50Var;
        Object xp50Var;
        byte b = this.f29886a;
        Object obj = this.c;
        byte b2 = this.b;
        switch (b) {
            case 0:
                gr70 gr70Var = ((s5i) obj).f;
                if (b2 == 0) {
                    return new p5i(this);
                }
                if (b2 == 1) {
                    smu smuVarV = gr70Var.v();
                    x1x.x(smuVarV);
                    return smuVarV;
                }
                if (b2 == 2) {
                    rmu rmuVarP = gr70Var.p();
                    x1x.x(rmuVarP);
                    return rmuVarP;
                }
                if (b2 == 3) {
                    return new q5i(this);
                }
                c99.h(b2);
                return null;
            case 1:
                k6i k6iVar = (k6i) obj;
                switch (b2) {
                    case 0:
                        return new i6i(this, (byte) 0);
                    case 1:
                        sek sekVar = k6iVar.b;
                        s7t0 s7t0Var = (s7t0) k6iVar.D.get();
                        pbt pbtVarL2 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL2);
                        return i5t.r(sekVar, s7t0Var, pbtVarL2);
                    case 2:
                        sek sekVar2 = k6iVar.b;
                        g8i g8iVar = k6iVar.f17771a;
                        pbt pbtVarL3 = g8iVar.L2();
                        x1x.x(pbtVarL3);
                        d3c d3cVar = (d3c) k6iVar.e.get();
                        fq fqVar = (fq) k6iVar.x.get();
                        qpt qptVar = (qpt) k6iVar.y.get();
                        gmt gmtVar = (gmt) k6iVar.j.get();
                        rgs rgsVar = (rgs) k6iVar.C.get();
                        r9u r9uVarH4 = g8iVar.h4();
                        x1x.x(r9uVarH4);
                        return i5t.C(sekVar2, pbtVarL3, d3cVar, fqVar, qptVar, gmtVar, rgsVar, r9uVarH4);
                    case 3:
                        sek sekVar3 = k6iVar.b;
                        pbt pbtVarL4 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL4);
                        return new d3c(pbtVarL4);
                    case 4:
                        sek sekVar4 = k6iVar.b;
                        lzt lztVar = (lzt) k6iVar.f.get();
                        zmi0 zmi0Var = (zmi0) k6iVar.g.get();
                        pbt pbtVarL5 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL5);
                        return mkg.g(sekVar4, lztVar, zmi0Var, pbtVarL5, (xyb) k6iVar.h.get(), (yyb) k6iVar.l.get(), (fpi0) k6iVar.m.get(), (nqt) k6iVar.n.get(), (spx) k6iVar.o.get(), (oqt) k6iVar.p.get(), (hni0) k6iVar.q.get(), (vcu) k6iVar.r.get(), (d3c) k6iVar.e.get(), (wni0) k6iVar.s.get(), (ztt) k6iVar.k.get(), (pqt) k6iVar.t.get(), (itt) k6iVar.u.get(), (q78) k6iVar.v.get(), (gmt) k6iVar.j.get(), (ecs) k6iVar.w.get());
                    case 5:
                        sek sekVar5 = k6iVar.b;
                        g8i g8iVar2 = k6iVar.f17771a;
                        pbt pbtVarL6 = g8iVar2.L2();
                        x1x.x(pbtVarL6);
                        m1e m1eVarQ1 = g8iVar2.q1();
                        x1x.x(m1eVarQ1);
                        return new lzt(pbtVarL6, m1eVarQ1);
                    case 6:
                        sek sekVar6 = k6iVar.b;
                        pbt pbtVarL7 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL7);
                        return new zmi0(pbtVarL7);
                    case 7:
                        sek sekVar7 = k6iVar.b;
                        pbt pbtVarL8 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL8);
                        return new xyb(pbtVarL8);
                    case 8:
                        sek sekVar8 = k6iVar.b;
                        k1u k1uVar = (k1u) k6iVar.i.get();
                        gmt gmtVar2 = (gmt) k6iVar.j.get();
                        ztt zttVar = (ztt) k6iVar.k.get();
                        pbt pbtVarL9 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL9);
                        return i5t.a(sekVar8, k1uVar, gmtVar2, zttVar, pbtVarL9);
                    case 9:
                        sek sekVar9 = k6iVar.b;
                        return new k1u(k6iVar.b());
                    case 10:
                        sek sekVar10 = k6iVar.b;
                        pbt pbtVarL10 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL10);
                        return new gmt(pbtVarL10);
                    case 11:
                        sek sekVar11 = k6iVar.b;
                        pbt pbtVarL11 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL11);
                        return new ztt(pbtVarL11);
                    case 12:
                        sek sekVar12 = k6iVar.b;
                        pbt pbtVarL12 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL12);
                        return new fpi0(pbtVarL12);
                    case 13:
                        sek sekVar13 = k6iVar.b;
                        pbt pbtVarL13 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL13);
                        return new nqt(pbtVarL13);
                    case 14:
                        sek sekVar14 = k6iVar.b;
                        pbt pbtVarL14 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL14);
                        return new spx(pbtVarL14);
                    case 15:
                        sek sekVar15 = k6iVar.b;
                        pbt pbtVarL15 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL15);
                        return new oqt(pbtVarL15);
                    case 16:
                        sek sekVar16 = k6iVar.b;
                        pbt pbtVarL16 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL16);
                        return new hni0(pbtVarL16);
                    case 17:
                        sek sekVar17 = k6iVar.b;
                        pbt pbtVarL17 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL17);
                        return new vcu(pbtVarL17);
                    case 18:
                        sek sekVar18 = k6iVar.b;
                        pbt pbtVarL18 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL18);
                        return new wni0(pbtVarL18);
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        sek sekVar19 = k6iVar.b;
                        pbt pbtVarL19 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL19);
                        return new pqt(pbtVarL19);
                    case 20:
                        sek sekVar20 = k6iVar.b;
                        pbt pbtVarL20 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL20);
                        return new itt(pbtVarL20);
                    case 21:
                        sek sekVar21 = k6iVar.b;
                        pbt pbtVarL21 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL21);
                        return new q78(pbtVarL21);
                    case 22:
                        sek sekVar22 = k6iVar.b;
                        pbt pbtVarL22 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL22);
                        return new ecs(pbtVarL22);
                    case 23:
                        sek sekVar23 = k6iVar.b;
                        pbt pbtVarL23 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL23);
                        return new qpt(pbtVarL23);
                    case 24:
                        sek sekVar24 = k6iVar.b;
                        fq fqVar2 = (fq) k6iVar.x.get();
                        fqx fqxVar = (fqx) k6iVar.z.get();
                        wox woxVar = (wox) k6iVar.A.get();
                        return i5t.g(fqVar2, sekVar24, (qpt) k6iVar.y.get(), (r8u) k6iVar.B.get(), woxVar, fqxVar);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        sek sekVar25 = k6iVar.b;
                        pbt pbtVarL24 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL24);
                        return new fqx(pbtVarL24);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        sek sekVar26 = k6iVar.b;
                        pbt pbtVarL25 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL25);
                        return new wox(pbtVarL25);
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        sek sekVar27 = k6iVar.b;
                        pbt pbtVarL26 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL26);
                        return new r8u(pbtVarL26);
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        sek sekVar28 = k6iVar.b;
                        pbt pbtVarL27 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL27);
                        return new qa60(pbtVarL27);
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        sek sekVar29 = k6iVar.b;
                        pbt pbtVarL28 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL28);
                        return new ipi0(pbtVarL28);
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        sek sekVar30 = k6iVar.b;
                        pbt pbtVarL29 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL29);
                        return new xsi0(pbtVarL29);
                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        sek sekVar31 = k6iVar.b;
                        pbt pbtVarL30 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL30);
                        return new gpx(pbtVarL30);
                    case 32:
                        sek sekVar32 = k6iVar.b;
                        pbt pbtVarL31 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL31);
                        return new vni0(pbtVarL31);
                    case 33:
                        sek sekVar33 = k6iVar.b;
                        pbt pbtVarL32 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL32);
                        return new hs(pbtVarL32);
                    case 34:
                        sek sekVar34 = k6iVar.b;
                        pbt pbtVarL33 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL33);
                        return new eni0(pbtVarL33);
                    case 35:
                        return i5t.z(k6iVar.b, (aws) k6iVar.M.get());
                    case 36:
                        sek sekVar35 = k6iVar.b;
                        yvs yvsVarG2 = k6iVar.f17771a.G2();
                        x1x.x(yvsVarG2);
                        return new aws(yvsVarG2);
                    case 37:
                        sek sekVar36 = k6iVar.b;
                        pbt pbtVarL34 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL34);
                        return new hj50(pbtVarL34);
                    case 38:
                        sek sekVar37 = k6iVar.b;
                        pbt pbtVarL35 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL35);
                        return new qhf0(pbtVarL35);
                    case 39:
                        return i5t.d(k6iVar.b, (foi0) k6iVar.Q.get(), (fq) k6iVar.x.get());
                    case 40:
                        sek sekVar38 = k6iVar.b;
                        pbt pbtVarL36 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL36);
                        return new foi0(pbtVarL36);
                    case 41:
                        sek sekVar39 = k6iVar.b;
                        fq fqVar3 = (fq) k6iVar.x.get();
                        r8u r8uVar = (r8u) k6iVar.B.get();
                        return i5t.B(fqVar3, sekVar39, (qpt) k6iVar.y.get(), r8uVar, (wox) k6iVar.A.get(), (fqx) k6iVar.z.get());
                    case 42:
                        qek0 qek0Var = k6iVar.c;
                        return new y5s(s470.AFRICAN_ROULETTE, false, false, true, false, false, 192);
                    case 43:
                        return i5t.b(k6iVar.b, (fq) k6iVar.x.get(), (fqx) k6iVar.z.get());
                    case 44:
                        return i5t.c(k6iVar.b, (aws) k6iVar.M.get());
                    case 45:
                        sek sekVar40 = k6iVar.b;
                        pbt pbtVarL37 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL37);
                        return new hsj0(pbtVarL37);
                    case 46:
                        sek sekVar41 = k6iVar.b;
                        g8i g8iVar3 = k6iVar.f17771a;
                        wsf0 wsf0VarF0 = g8iVar3.f0();
                        pbt pbtVarL38 = g8iVar3.L2();
                        x1x.x(pbtVarL38);
                        return new t0u(pbtVarL38, wsf0VarF0);
                    case 47:
                        sek sekVar42 = k6iVar.b;
                        pbt pbtVarL39 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL39);
                        return new tbu(pbtVarL39);
                    case 48:
                        return i5t.f(k6iVar.b, (a6s) k6iVar.Z.get());
                    case 49:
                        return i5t.e(k6iVar.b);
                    case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                        return new j6i(this);
                    case 51:
                        qek0 qek0Var2 = k6iVar.c;
                        gmt gmtVar3 = (gmt) k6iVar.j.get();
                        ztt zttVar2 = (ztt) k6iVar.k.get();
                        wkt0 wkt0Var = (wkt0) k6iVar.d0.get();
                        r80 r80Var = (r80) k6iVar.f0.get();
                        mne mneVarV1 = k6iVar.f17771a.v1();
                        gmtVar3.getClass();
                        zttVar2.getClass();
                        wkt0Var.getClass();
                        r80Var.getClass();
                        p80Var = new p80(gmtVar3, zttVar2, wkt0Var, r80Var, mneVarV1);
                        break;
                    case 52:
                        sek sekVar43 = k6iVar.b;
                        l1u l1uVar = (l1u) k6iVar.c0.get();
                        pbt pbtVarL40 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL40);
                        l1uVar.getClass();
                        return new wkt0(l1uVar, pbtVarL40);
                    case 53:
                        sek sekVar44 = k6iVar.b;
                        return new l1u(k6iVar.b());
                    case 54:
                        qek0 qek0Var3 = k6iVar.c;
                        g8i g8iVar4 = k6iVar.f17771a;
                        gii0 gii0VarJ9 = g8iVar4.j9();
                        x1x.x(gii0VarJ9);
                        pek0 pek0Var = new pek0();
                        gfk0 gfk0Var = new gfk0((byte) 12);
                        d80 d80Var = (d80) k6iVar.e0.get();
                        knf0 knf0VarJ8 = g8iVar4.J8();
                        x1x.x(knf0VarJ8);
                        btt0 btt0VarO8 = g8iVar4.o8();
                        x1x.x(btt0VarO8);
                        d80Var.getClass();
                        p80Var = new r80(gii0VarJ9, pek0Var, gfk0Var, d80Var, btt0VarO8, knf0VarJ8);
                        break;
                    case 55:
                        qek0 qek0Var4 = k6iVar.c;
                        return new d80();
                    case 56:
                        return i5t.A(k6iVar.b, (fq) k6iVar.x.get(), k6iVar.f17771a.f0(), (g9c) k6iVar.h0.get(), (itt) k6iVar.u.get(), (yyb) k6iVar.l.get(), (lg60) k6iVar.j0.get());
                    case 57:
                        sek sekVar45 = k6iVar.b;
                        pbt pbtVarL41 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL41);
                        return new g9c(pbtVarL41);
                    case 58:
                        sek sekVar46 = k6iVar.b;
                        qni0 qni0Var = (qni0) k6iVar.i0.get();
                        pbt pbtVarL42 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL42);
                        return i5t.v(sekVar46, qni0Var, pbtVarL42);
                    case 59:
                        sek sekVar47 = k6iVar.b;
                        pbt pbtVarL43 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL43);
                        return new qni0(pbtVarL43);
                    case 60:
                        sek sekVar48 = k6iVar.b;
                        pbt pbtVarL44 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL44);
                        return new egu(pbtVarL44);
                    default:
                        c99.h(b2);
                        return null;
                }
                return p80Var;
            case 2:
                h7i h7iVar = (h7i) obj;
                x2c0 x2c0Var = (x2c0) h7iVar.i;
                gii0 gii0Var = (gii0) h7iVar.h;
                if (b2 == 0) {
                    return new dn0(new xzp(gii0Var, x2c0Var), (j51) h7iVar.k, (xk0) h7iVar.n, (knf0) h7iVar.j, (x2c0) h7iVar.i, (btt0) h7iVar.l);
                }
                if (b2 == 1) {
                    mne mneVarH = ((psc) h7iVar.b.b).h();
                    x1x.x(mneVarH);
                    return new j9s0(mneVarH, (btt0) h7iVar.l, new zas0(gii0Var, (byte) 0), (r9s0) h7iVar.v, (knf0) h7iVar.j);
                }
                if (b2 == 2) {
                    return new k41(new xzp(gii0Var, x2c0Var), (knf0) h7iVar.j, new f41((q7d0) h7iVar.q), (btt0) h7iVar.l);
                }
                c99.h(b2);
                return null;
            case 3:
                i7i i7iVar = (i7i) obj;
                mne mneVar = (mne) i7iVar.l;
                xzp xzpVar = (xzp) i7iVar.f;
                if (b2 == 0) {
                    dn0Var = new dn0(xzpVar, (j51) i7iVar.g, (xk0) i7iVar.h, (knf0) i7iVar.i, (x2c0) i7iVar.j, (btt0) i7iVar.k);
                } else if (b2 == 1) {
                    dn0Var = new j9s0(mneVar, (btt0) i7iVar.k, new zas0((gii0) i7iVar.m, (byte) 0), (r9s0) i7iVar.n, (knf0) i7iVar.i);
                } else {
                    if (b2 == 2) {
                        return new jr0(xzpVar, (ap0) i7iVar.o, (knf0) i7iVar.i, mneVar);
                    }
                    if (b2 != 3) {
                        if (b2 == 4) {
                            return new xx0(xzpVar, (btt0) i7iVar.k);
                        }
                        c99.h(b2);
                        return null;
                    }
                    dn0Var = new n31(xzpVar, (knf0) i7iVar.i, (j51) i7iVar.g, (x2c0) i7iVar.j, (btt0) i7iVar.k);
                }
                return dn0Var;
            case 4:
                n7i n7iVar = (n7i) obj;
                poq0 poq0Var = n7iVar.B;
                duj dujVar = n7iVar.b;
                iqt iqtVar = n7iVar.y;
                cad cadVar = n7iVar.f;
                j1q0 j1q0Var = n7iVar.n;
                pru pruVar = n7iVar.l;
                ehf0 ehf0Var = n7iVar.j;
                if (b2 == 0) {
                    return new l7i(this);
                }
                if (b2 == 1) {
                    return new m7i(this);
                }
                if (b2 != 2) {
                    if (b2 == 3) {
                        return new pw70(n7iVar.c, new jdk0(), n7iVar.s);
                    }
                    c99.h(b2);
                    return null;
                }
                long jLongValue = n7iVar.f23042a.longValue();
                oeg0 oeg0Var = n7iVar.c;
                soc socVarW = ((i7i) ehf0Var.b).w();
                i7i i7iVar2 = (i7i) ehf0Var.b;
                jr0 jr0VarH = i7iVar2.h();
                x1x.x(jr0VarH);
                ali aliVar = new ali(new iqi(jr0VarH, j1q0Var), i7iVar2.l(), pruVar, n7iVar.i);
                jr0 jr0VarH2 = ((i7i) ehf0Var.b).h();
                x1x.x(jr0VarH2);
                n4u n4uVar = new n4u(jr0VarH2, (byte) 8);
                jr0 jr0VarH3 = ((i7i) ehf0Var.b).h();
                x1x.x(jr0VarH3);
                qgd qgdVar = new qgd(aliVar, n4uVar, new xoc(jr0VarH3, false), pruVar.a().b.u, pruVar, i7iVar2.l(), n7iVar.i);
                jr0 jr0VarH4 = i7iVar2.h();
                x1x.x(jr0VarH4);
                jut jutVar = new jut(jr0VarH4, j1q0Var, (byte) 1);
                jr0 jr0VarH5 = ((i7i) ehf0Var.b).h();
                x1x.x(jr0VarH5);
                ieu ieuVar = new ieu((Object) jutVar, (Object) new xoc(jr0VarH5, false), (byte) 6);
                jr0 jr0VarH6 = i7iVar2.h();
                x1x.x(jr0VarH6);
                cu cuVar = new cu(qgdVar, ieuVar, new b5c(jr0VarH6), (byte) 23);
                jr0 jr0VarH7 = ((i7i) ehf0Var.b).h();
                x1x.x(jr0VarH7);
                xoc xocVar = new xoc(jr0VarH7, false);
                jdk0 jdk0Var = new jdk0();
                jr0 jr0VarH8 = ((i7i) ehf0Var.b).h();
                x1x.x(jr0VarH8);
                irc ircVar = new irc(jr0VarH8);
                xmt xmtVar = n7iVar.q;
                oeg0 oeg0Var2 = n7iVar.c;
                h03 h03Var = n7iVar.r;
                pw70 pw70Var = (pw70) n7iVar.Y.get();
                uzc0 uzc0Var = n7iVar.t;
                mne mneVarH2 = ((psc) cadVar.b).h();
                x1x.x(mneVarH2);
                nc0 nc0Var = new nc0(oeg0Var2, h03Var, pw70Var, uzc0Var, mneVarH2, n7iVar.u, n7iVar.v, pruVar, n7iVar.w, n7iVar.x, n7iVar.d);
                jr0 jr0VarH9 = ((i7i) ehf0Var.b).h();
                x1x.x(jr0VarH9);
                xoc xocVar2 = new xoc(jr0VarH9, false);
                jr0 jr0VarH10 = ((i7i) ehf0Var.b).h();
                x1x.x(jr0VarH10);
                irc ircVar2 = new irc(jr0VarH10);
                pw70 pw70Var2 = (pw70) n7iVar.Y.get();
                kc60 kc60Var = new kc60(n7iVar.z);
                u58 u58Var = n7iVar.g;
                gg5 gg5Var = n7iVar.A;
                jr0 jr0VarH11 = ((i7i) ehf0Var.b).h();
                x1x.x(jr0VarH11);
                h03 h03Var2 = new h03((Object) new n4u(jr0VarH11, (byte) 8), (byte) 22);
                jr0 jr0VarH12 = ((i7i) ehf0Var.b).h();
                x1x.x(jr0VarH12);
                fuu fuuVar = new fuu(jr0VarH12);
                ali aliVarF = ((i7i) ehf0Var.b).f();
                jr0 jr0VarH13 = ((i7i) ehf0Var.b).h();
                x1x.x(jr0VarH13);
                bbw0 bbw0Var = new bbw0((Object) jr0VarH13, (byte) 23);
                mne mneVarH3 = ((psc) cadVar.b).h();
                x1x.x(mneVarH3);
                ctf0 ctf0Var = n7iVar.d;
                ix0 ix0Var = n7iVar.h;
                o470 o470VarE = poq0Var.f27342a.e();
                pwi pwiVarC = poq0Var.f27342a.c();
                roq0 roq0Var = new roq0();
                pyt pytVar = n7iVar.C;
                bnt bntVar = n7iVar.D;
                pmi pmiVar = n7iVar.E;
                dnt dntVar = n7iVar.F;
                oeg0 oeg0Var3 = n7iVar.c;
                ctf0 ctf0Var2 = n7iVar.d;
                kt2 kt2Var = n7iVar.G;
                ih5 ih5Var = new ih5(kt2Var, (byte) 2);
                l7k l7kVar = n7iVar.H;
                gg5 gg5Var2 = n7iVar.I;
                v88 v88Var = n7iVar.J;
                ih5 ih5Var2 = new ih5(kt2Var, (byte) 0);
                wsf0 wsf0Var = n7iVar.K;
                g45 g45Var = (g45) wsf0Var.b;
                kb0 kb0Var = new kb0(dujVar, oeg0Var3, ctf0Var2, ih5Var, l7kVar, gg5Var2, v88Var, ih5Var2, g45Var.y(), g45Var.Q(), g45Var.Y(), iqtVar, g45Var.G(), wsf0Var.s(), ((i7i) ehf0Var.b).e());
                bzt bztVar = n7iVar.m;
                i7i i7iVar3 = (i7i) ehf0Var.b;
                n31 n31VarJ = i7iVar3.j();
                x1x.x(n31VarJ);
                abu abuVar = new abu(j1q0Var, n31VarJ);
                jr0 jr0VarH14 = i7iVar3.h();
                x1x.x(jr0VarH14);
                return new jt80(jLongValue, oeg0Var, socVarW, cuVar, xocVar, jdk0Var, ircVar, xmtVar, nc0Var, xocVar2, ircVar2, pw70Var2, iqtVar, kc60Var, u58Var, gg5Var, h03Var2, fuuVar, aliVarF, bbw0Var, pruVar, mneVarH3, dujVar, ctf0Var, ix0Var, o470VarE, pwiVarC, roq0Var, pytVar, bntVar, pmiVar, dntVar, kb0Var, bztVar, new f7u((Object) abuVar, (Object) new xoc(jr0VarH14), (Object) n7iVar.L, (Object) pruVar, (byte) 5), ((i7i) ehf0Var.b).m(), n7iVar.M, n7iVar.e, n7iVar.N, n7iVar.O, n7iVar.P, ((mci) n7iVar.Q.b).l(), ((rrc) n7iVar.R.b).I(), n7iVar.S);
            case 5:
                q7i q7iVar = (q7i) obj;
                nr00 nr00Var = q7iVar.i;
                ytt yttVar = q7iVar.y;
                poq0 poq0Var2 = q7iVar.M;
                wsf0 wsf0Var2 = q7iVar.E;
                lrc lrcVar = q7iVar.n;
                fsd fsdVar = q7iVar.H;
                ix0 ix0Var2 = q7iVar.g;
                j1q0 j1q0Var2 = q7iVar.z;
                cmt cmtVar = q7iVar.J;
                dmt dmtVar = q7iVar.I;
                cyu cyuVar = q7iVar.G;
                s31 s31Var = q7iVar.F;
                kt2 kt2Var2 = q7iVar.e;
                duj dujVar2 = q7iVar.m;
                ntu ntuVar = q7iVar.w;
                kc60 kc60Var2 = q7iVar.j;
                cad cadVar2 = q7iVar.k;
                pru pruVar2 = q7iVar.r;
                ehf0 ehf0Var2 = q7iVar.v;
                switch (b2) {
                    case 0:
                        return new o7i(this);
                    case 1:
                        String str = q7iVar.t;
                        mdp mdpVar = q7iVar.u;
                        soc socVarW2 = ((i7i) ehf0Var2.b).w();
                        wdu wduVarO = ((i7i) ehf0Var2.b).o();
                        a6u a6uVar = new a6u((Object) ehf0Var2.h(), (Object) ((i7i) ehf0Var2.b).n(), (Object) ntuVar, (Object) q7iVar.b(), (Object) pruVar2, (byte) 6);
                        pw70 pw70Var3 = (pw70) q7iVar.f0.get();
                        i7i i7iVar4 = (i7i) ehf0Var2.b;
                        dn0 dn0VarG = i7iVar4.g();
                        x1x.x(dn0VarG);
                        soc socVar = new soc(dn0VarG, (char) 0);
                        xx0 xx0VarI = i7iVar4.i();
                        x1x.x(xx0VarI);
                        abu abuVar2 = new abu(xx0VarI, j1q0Var2);
                        dn0 dn0VarG2 = i7iVar4.g();
                        x1x.x(dn0VarG2);
                        svu svuVar = q7iVar.A;
                        mne mneVarH4 = ((psc) cadVar2.b).h();
                        x1x.x(mneVarH4);
                        a6u a6uVar2 = new a6u((Object) socVar, (Object) abuVar2, (Object) new j5v(dn0VarG2, j1q0Var2, svuVar, mneVarH4), (Object) ntuVar, (Object) pruVar2, (byte) 22);
                        m1e m1eVar = q7iVar.o;
                        mne mneVarH5 = ((psc) cadVar2.b).h();
                        x1x.x(mneVarH5);
                        u58 u58Var2 = new u58(kt2Var2, (byte) 3);
                        ctf0 ctf0Var3 = q7iVar.q;
                        iqt iqtVarB = q7iVar.b();
                        kb0 kb0VarA = q7iVar.a();
                        erc ercVarW = ((kki) nr00Var.f23980a).w();
                        eyg0 eyg0VarI = ((rrc) wsf0Var2.b).I();
                        s91 s91Var = q7iVar.c;
                        xr xrVarM = ((i7i) ehf0Var2.b).m();
                        bzt bztVar2 = new bzt(fsdVar);
                        kd30 kd30VarL = ((mci) lrcVar.b).l();
                        i7i i7iVar5 = (i7i) ehf0Var2.b;
                        xzp xzpVar2 = (xzp) i7iVar5.f;
                        btt0 btt0Var = (btt0) i7iVar5.k;
                        j1q0 j1q0Var3 = (j1q0) i7iVar5.s;
                        btt0Var.getClass();
                        j1q0Var3.getClass();
                        es esVar = new es();
                        esVar.f8305a = xzpVar2;
                        esVar.b = btt0Var;
                        esVar.c = j1q0Var3;
                        qo0Var = new qo0(str, mdpVar, kc60Var2, socVarW2, wduVarO, a6uVar, pw70Var3, a6uVar2, m1eVar, dujVar2, mneVarH5, u58Var2, ctf0Var3, iqtVarB, kb0VarA, ix0Var2, ercVarW, eyg0VarI, pruVar2, s31Var, cyuVar, s91Var, xrVarM, bztVar2, dmtVar, kd30VarL, new phf0(new nmo(esVar), ntuVar, pruVar2), cmtVar);
                        break;
                    case 2:
                        return new pw70(q7iVar.d, new jdk0(), yttVar);
                    case 3:
                        mne mneVarH6 = ((psc) cadVar2.b).h();
                        x1x.x(mneVarH6);
                        return new yb0(kc60Var2, dujVar2, mneVarH6, ((i7i) ehf0Var2.b).e(), q7iVar.l.s(), ((kki) nr00Var.f23980a).v());
                    case 4:
                        kb0 kb0VarA2 = q7iVar.a();
                        s91 s91Var2 = q7iVar.c;
                        m1e m1eVar2 = q7iVar.o;
                        qu quVar = new qu(kt2Var2, (byte) 1);
                        i7i i7iVar6 = (i7i) ehf0Var2.b;
                        dgu dguVar = new dgu(i7iVar6.k(), new u8u((j9s0) i7iVar6.C.get(), (gst0) i7iVar6.t), (x0u) i7iVar6.z, ((g45) ((wsf0) i7iVar6.v).b).E());
                        g2v g2vVar = q7iVar.K;
                        oeg0 oeg0Var4 = q7iVar.d;
                        ctf0 ctf0Var4 = q7iVar.q;
                        a6u a6uVarT = ((i7i) ehf0Var2.b).t();
                        gto0 gto0VarS = ((i7i) ehf0Var2.b).s();
                        mne mneVarH7 = ((psc) cadVar2.b).h();
                        x1x.x(mneVarH7);
                        return new wz1(kb0VarA2, dujVar2, s91Var2, m1eVar2, quVar, dguVar, g2vVar, dmtVar, oeg0Var4, ctf0Var4, s31Var, a6uVarT, gto0VarS, mneVarH7, q7iVar.b(), q7iVar.L, poq0Var2.f27342a.e(), poq0Var2.f27342a.c(), new roq0(), q7iVar.N, cmtVar, kc60Var2, yttVar, q7iVar.O, cyuVar, pruVar2);
                    case 5:
                        soc socVarW3 = ((i7i) ehf0Var2.b).w();
                        i7i i7iVar7 = (i7i) ehf0Var2.b;
                        n31 n31VarJ2 = i7iVar7.j();
                        x1x.x(n31VarJ2);
                        abu abuVar3 = new abu(j1q0Var2, n31VarJ2);
                        jr0 jr0VarH15 = i7iVar7.h();
                        x1x.x(jr0VarH15);
                        f7u f7uVar = new f7u((Object) abuVar3, (Object) new xoc(jr0VarH15), (Object) ntuVar, (Object) pruVar2, (byte) 5);
                        pw70 pw70Var4 = (pw70) q7iVar.f0.get();
                        zn00 zn00VarV = ((i7i) ehf0Var2.b).v();
                        xex xexVarB = ((i7i) ehf0Var2.b).b();
                        u58 u58Var3 = new u58(kt2Var2, (byte) 3);
                        xmt xmtVar2 = q7iVar.P;
                        pyt pytVar2 = q7iVar.Q;
                        AggregatorScreenModel aggregatorScreenModel = q7iVar.b;
                        ctf0 ctf0Var5 = q7iVar.q;
                        iqt iqtVarB2 = q7iVar.b();
                        oeg0 oeg0Var5 = q7iVar.d;
                        h03 h03Var3 = q7iVar.R;
                        pw70 pw70Var5 = (pw70) q7iVar.f0.get();
                        uzc0 uzc0Var2 = q7iVar.S;
                        mne mneVarH8 = ((psc) cadVar2.b).h();
                        x1x.x(mneVarH8);
                        nc0 nc0Var2 = new nc0(oeg0Var5, h03Var3, pw70Var5, uzc0Var2, mneVarH8, q7iVar.T, q7iVar.U, pruVar2, q7iVar.V, q7iVar.W, q7iVar.q);
                        ali aliVarF2 = ((i7i) ehf0Var2.b).f();
                        mne mneVarH9 = ((psc) cadVar2.b).h();
                        x1x.x(mneVarH9);
                        qo0Var = new rv80(kc60Var2, socVarW3, f7uVar, pw70Var4, zn00VarV, xexVarB, u58Var3, xmtVar2, pytVar2, aggregatorScreenModel, ctf0Var5, iqtVarB2, nc0Var2, aliVarF2, pruVar2, ix0Var2, dujVar2, mneVarH9, new bzt(fsdVar), q7iVar.a(), s31Var, q7iVar.c, q7iVar.o, cyuVar, dmtVar, ((mci) lrcVar.b).l(), ((rrc) wsf0Var2.b).I(), q7iVar.X.booleanValue(), cmtVar);
                        break;
                    case 6:
                        return new p7i(this);
                    default:
                        c99.h(b2);
                        return null;
                }
                return qo0Var;
            case 6:
                t7i t7iVar = (t7i) obj;
                pru pruVar3 = (pru) t7iVar.b;
                cad cadVar3 = (cad) t7iVar.i;
                duj dujVar3 = t7iVar.h;
                gst0 gst0Var = (gst0) t7iVar.d;
                ehf0 ehf0Var3 = (ehf0) t7iVar.f33467a;
                if (b2 != 0) {
                    if (b2 == 1) {
                        return new pw70((oeg0) t7iVar.f, new jdk0(), (ytt) t7iVar.g);
                    }
                    if (b2 != 2) {
                        c99.h(b2);
                        return null;
                    }
                    kc60 kc60Var3 = new kc60(gst0Var);
                    mne mneVarH10 = ((psc) cadVar3.b).h();
                    x1x.x(mneVarH10);
                    return new yb0(kc60Var3, dujVar3, mneVarH10, ((i7i) ehf0Var3.b).e(), ((wsf0) t7iVar.j).s(), ((kki) ((nr00) t7iVar.w).f23980a).v());
                }
                i7i i7iVar8 = (i7i) ehf0Var3.b;
                n31 n31VarJ3 = i7iVar8.j();
                x1x.x(n31VarJ3);
                sqt sqtVar = new sqt(n31VarJ3);
                jr0 jr0VarH16 = i7iVar8.h();
                x1x.x(jr0VarH16);
                dgu dguVar2 = new dgu(sqtVar, new xoc(jr0VarH16), (ntu) t7iVar.l, i7iVar8.p(), pruVar3);
                ctf0 ctf0Var6 = t7iVar.c;
                iqt iqtVar2 = new iqt(gst0Var);
                soc socVarW4 = ((i7i) ehf0Var3.b).w();
                m1e m1eVar3 = t7iVar.e;
                long jLongValue2 = ((Long) t7iVar.m).longValue();
                long jLongValue3 = ((Long) t7iVar.n).longValue();
                rj1 rj1Var = (rj1) t7iVar.o;
                int iIntValue = ((Integer) t7iVar.p).intValue();
                pw70 pw70Var6 = (pw70) ((n5d0) t7iVar.k).get();
                xex xexVarB2 = ((i7i) ehf0Var3.b).b();
                zn00 zn00VarV2 = ((i7i) ehf0Var3.b).v();
                ali aliVarF3 = ((i7i) ehf0Var3.b).f();
                oeg0 oeg0Var6 = (oeg0) t7iVar.f;
                mne mneVarH11 = ((psc) cadVar3.b).h();
                x1x.x(mneVarH11);
                return new bk1(dguVar2, ctf0Var6, iqtVar2, socVarW4, m1eVar3, jLongValue2, jLongValue3, rj1Var, iIntValue, pw70Var6, xexVarB2, zn00VarV2, aliVarF3, oeg0Var6, dujVar3, mneVarH11, new kc60(gst0Var), (u58) t7iVar.q, (ix0) t7iVar.r, (b4j) t7iVar.s, ((mci) ((lrc) t7iVar.t).b).e(), (je) t7iVar.u, (cyu) t7iVar.v, pruVar3);
            case 7:
                return a();
            case 8:
                return b();
            case 9:
                return c();
            case 10:
                if (b2 == 0) {
                    return new l9i(this);
                }
                if (b2 != 1) {
                    if (b2 == 2) {
                        return new m9i();
                    }
                    c99.h(b2);
                    return null;
                }
                vi5 vi5Var = new vi5();
                vi5Var.f37460a = new uuf("", "");
                vi5Var.b = iun.f15405a;
                return vi5Var;
            case 11:
                return d();
            case 12:
                i7i i7iVar9 = (i7i) obj;
                sa10 sa10Var = (sa10) i7iVar9.q;
                uzc0 uzc0Var3 = (uzc0) i7iVar9.m;
                coi0 coi0Var = (coi0) i7iVar9.z;
                asi0 asi0Var = (asi0) i7iVar9.y;
                bzt bztVar3 = (bzt) i7iVar9.x;
                nyt nytVar = (nyt) i7iVar9.w;
                dst dstVar = (dst) i7iVar9.v;
                wv70 wv70Var = (wv70) i7iVar9.s;
                pru pruVar4 = i7iVar9.b;
                zr1 zr1Var = (zr1) i7iVar9.l;
                qu quVar2 = (qu) i7iVar9.j;
                x20 x20Var = (x20) i7iVar9.i;
                yo4 yo4Var = (yo4) i7iVar9.h;
                duj dujVar4 = (duj) i7iVar9.p;
                cad cadVar4 = (cad) i7iVar9.k;
                kko kkoVar = (kko) i7iVar9.g;
                if (b2 == 0) {
                    int i = kkoVar.f18450a;
                    boolean z = kkoVar.b;
                    mne mneVarH12 = ((psc) cadVar4.b).h();
                    x1x.x(mneVarH12);
                    ut50Var = new ut50(i, z, yo4Var, x20Var, quVar2, mneVarH12, zr1Var, uzc0Var3, (fst) i7iVar9.n, pruVar4, (i1w0) i7iVar9.o, dujVar4, sa10Var, (syt) i7iVar9.r, (m1e) i7iVar9.c, wv70Var);
                } else {
                    if (b2 != 1) {
                        if (b2 == 2) {
                            int i2 = kkoVar.f18450a;
                            boolean z2 = kkoVar.b;
                            mne mneVarH13 = ((psc) cadVar4.b).h();
                            x1x.x(mneVarH13);
                            xp50Var = new xp50(i2, z2, yo4Var, x20Var, quVar2, mneVarH13, zr1Var, uzc0Var3, dstVar, pruVar4, (i1w0) i7iVar9.o, dujVar4, nytVar, (m1e) i7iVar9.c, bztVar3, i7iVar9.e, wv70Var, asi0Var, coi0Var);
                        } else if (b2 == 3) {
                            int i3 = kkoVar.f18450a;
                            boolean z3 = kkoVar.b;
                            mne mneVarH14 = ((psc) cadVar4.b).h();
                            x1x.x(mneVarH14);
                            xp50Var = new ip50(i3, z3, yo4Var, x20Var, quVar2, mneVarH14, zr1Var, uzc0Var3, dstVar, pruVar4, (i1w0) i7iVar9.o, dujVar4, nytVar, (m1e) i7iVar9.c, bztVar3, i7iVar9.e, wv70Var, asi0Var, coi0Var);
                        } else {
                            if (b2 != 4) {
                                if (b2 != 5) {
                                    c99.h(b2);
                                    return null;
                                }
                                int i4 = kkoVar.f18450a;
                                boolean z4 = kkoVar.b;
                                mne mneVarH15 = ((psc) cadVar4.b).h();
                                x1x.x(mneVarH15);
                                return new qr50(i4, z4, yo4Var, x20Var, quVar2, mneVarH15, zr1Var, dstVar, pruVar4, (i1w0) i7iVar9.o, dujVar4, nytVar, (m1e) i7iVar9.c, bztVar3, i7iVar9.e, wv70Var, asi0Var, coi0Var);
                            }
                            int i5 = kkoVar.f18450a;
                            boolean z5 = kkoVar.b;
                            mne mneVarH16 = ((psc) cadVar4.b).h();
                            x1x.x(mneVarH16);
                            xp50Var = new gt50(i5, z5, yo4Var, x20Var, quVar2, mneVarH16, zr1Var, uzc0Var3, dstVar, pruVar4, (i1w0) i7iVar9.o, dujVar4, nytVar, (m1e) i7iVar9.c, bztVar3, i7iVar9.e, wv70Var, asi0Var, coi0Var);
                        }
                        return xp50Var;
                    }
                    int i6 = kkoVar.f18450a;
                    boolean z6 = kkoVar.b;
                    mne mneVarH17 = ((psc) cadVar4.b).h();
                    x1x.x(mneVarH17);
                    ut50Var = new iwc(i6, z6, mneVarH17, (i1w0) i7iVar9.o, (m1e) i7iVar9.c, (gyt) i7iVar9.t, dujVar4, (ntu) i7iVar9.d, i7iVar9.e, (grj) i7iVar9.u, sa10Var);
                }
                return ut50Var;
            case 13:
                return e();
            case 14:
                return f();
            case 15:
                return g();
            case 16:
                return h();
            case 17:
                return i();
            case 18:
                return j();
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return k();
            case 20:
                return l();
            case 21:
                return m();
            case 22:
                return n();
            case 23:
                return o();
            case 24:
                return p();
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return q();
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return r();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return s();
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return t();
            default:
                if (b2 == 0) {
                    return new ubi(this);
                }
                if (b2 == 1) {
                    return new vbi(this);
                }
                if (b2 == 2) {
                    return new wbi(this);
                }
                if (b2 == 3) {
                    return new xbi(this);
                }
                if (b2 == 4) {
                    return new ybi(this);
                }
                if (b2 == 5) {
                    return new zbi(this);
                }
                c99.h(b2);
                return null;
        }
    }
}
