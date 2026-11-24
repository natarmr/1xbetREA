package a;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class c7i implements n5d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3863a;
    public final byte b;
    public final Object c;
    public final Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ c7i(Object obj, Object obj2, int i, byte b) {
        this.f3863a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    private final Object a() {
        byte b = this.b;
        switch (b) {
            case 0:
                gbi gbiVar = (gbi) this.d;
                tz9 tz9Var = (tz9) ((xex) gbiVar.f11016a).f40764a;
                c1a c1aVar = (c1a) ((n5d0) gbiVar.c).get();
                iev ievVar = (iev) ((w1k) ((gbi) this.d).q).get();
                iev ievVar2 = (iev) ((w1k) ((gbi) this.d).q).get();
                lrm0 lrm0Var = (lrm0) ((w1k) ((gbi) this.d).r).get();
                dmn0 dmn0Var = (dmn0) ((n5d0) ((gbi) this.d).e).get();
                iw9 iw9Var = (iw9) ((w1k) ((gbi) this.d).s).get();
                z6r z6rVar = (z6r) ((n5d0) ((gbi) this.d).h).get();
                y6r y6rVar = (y6r) ((n5d0) ((gbi) this.d).f).get();
                x34 x34Var = (x34) ((n5d0) ((hbi) this.c).r).get();
                gbi gbiVar2 = (gbi) this.d;
                return new b0a(tz9Var, c1aVar, ievVar, ievVar2, lrm0Var, dmn0Var, iw9Var, z6rVar, y6rVar, x34Var, (zz9) ((xex) gbiVar2.f11016a).b, (c0a) ((n5d0) gbiVar2.l).get(), (d0a) ((n5d0) ((gbi) this.d).m).get(), (lev) ((n5d0) ((gbi) this.d).j).get(), (vne) ((n5d0) ((gbi) this.d).k).get(), (hke) ((n5d0) ((gbi) this.d).o).get());
            case 1:
                gbi gbiVar3 = (gbi) this.d;
                tz9 tz9Var2 = (tz9) ((xex) gbiVar3.f11016a).f40764a;
                wv9 wv9Var = (wv9) ((n5d0) gbiVar3.b).get();
                wv9Var.getClass();
                String str = tz9Var2.f34794a;
                str.getClass();
                return wv9Var.c.a(str);
            case 2:
                nx9 nx9Var = (nx9) ((n5d0) ((hbi) this.c).v).get();
                Object obj = ((gbi) this.d).f11016a;
                t1a t1aVar = (t1a) ((n5d0) ((hbi) this.c).x).get();
                nx9Var.getClass();
                t1aVar.getClass();
                wv9 wv9Var2 = nx9Var.d;
                x1x.y(wv9Var2);
                return wv9Var2;
            case 3:
                qcq0 qcq0Var = (qcq0) ((n5d0) ((hbi) this.c).f).get();
                gbi gbiVar4 = (gbi) this.d;
                xex xexVar = (xex) gbiVar4.f11016a;
                return new iev(qcq0Var, (zz9) xexVar.b, (tz9) xexVar.f40764a, (pg00) ((n5d0) gbiVar4.d).get(), (List) ((n5d0) ((gbi) this.d).i).get(), (jx9) ((n5d0) ((hbi) this.c).p).get());
            case 4:
                return new pg00();
            case 5:
                gbi gbiVar5 = (gbi) this.d;
                tz9 tz9Var3 = (tz9) ((xex) gbiVar5.f11016a).f40764a;
                pg00 pg00Var = (pg00) ((n5d0) gbiVar5.d).get();
                z6r z6rVar2 = (z6r) ((n5d0) ((gbi) this.d).h).get();
                pg00Var.getClass();
                z6rVar2.getClass();
                ArrayList arrayListL = q3d.l(pg00Var);
                arrayListL.add(pg00Var);
                arrayListL.add(z6rVar2);
                arrayListL.addAll(tz9Var3.j);
                return arrayListL;
            case 6:
                lrm0 lrm0Var2 = (lrm0) ((w1k) ((gbi) this.d).r).get();
                y6r y6rVar2 = (y6r) ((n5d0) ((gbi) this.d).f).get();
                c1a c1aVar2 = (c1a) ((n5d0) ((gbi) this.d).c).get();
                m9o0 m9o0Var = (m9o0) ((n5d0) ((gbi) this.d).g).get();
                lrm0Var2.getClass();
                y6rVar2.getClass();
                c1aVar2.getClass();
                m9o0Var.getClass();
                CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE;
                key.getClass();
                Integer num = (Integer) ((ow9) c1aVar2).c(key);
                if (num != null) {
                    num.intValue();
                }
                return new z6r(lrm0Var2, y6rVar2);
            case 7:
                c1a c1aVar3 = (c1a) ((n5d0) ((gbi) this.d).c).get();
                tz9 tz9Var4 = (tz9) ((xex) ((gbi) this.d).f11016a).f40764a;
                ((qcq0) ((n5d0) ((hbi) this.c).f).get()).getClass();
                return new lrm0(c1aVar3, tz9Var4, new rqt(), (w1k) ((gbi) this.d).s);
            case 8:
                gbi gbiVar6 = (gbi) this.d;
                xex xexVar2 = (xex) gbiVar6.f11016a;
                zz9 zz9Var = (zz9) xexVar2.b;
                tz9 tz9Var5 = (tz9) xexVar2.f40764a;
                wv9 wv9Var3 = (wv9) ((n5d0) gbiVar6.b).get();
                t1a t1aVar2 = (t1a) ((n5d0) ((hbi) this.c).x).get();
                iev ievVar3 = (iev) ((w1k) ((gbi) this.d).q).get();
                lrm0 lrm0Var3 = (lrm0) ((w1k) ((gbi) this.d).r).get();
                dmn0 dmn0Var2 = (dmn0) ((n5d0) ((gbi) this.d).e).get();
                wv9Var3.getClass();
                t1aVar2.getClass();
                ievVar3.getClass();
                lrm0Var3.getClass();
                dmn0Var2.getClass();
                cad cadVar = wv9Var3.e;
                esg0 esg0Var = new esg0();
                esg0Var.f8326a = zz9Var;
                esg0Var.b = tz9Var5;
                esg0Var.c = ievVar3;
                esg0Var.d = lrm0Var3;
                esg0Var.e = dmn0Var2;
                esg0Var.f = wv9Var3;
                iw9 iw9Var2 = (iw9) ((n5d0) new o3c((hbi) cadVar.b, esg0Var).k).get();
                synchronized (wv9Var3.f) {
                    wv9Var3.g.add(iw9Var2);
                }
                x1x.y(iw9Var2);
                return iw9Var2;
            case 9:
                lrm0 lrm0Var4 = (lrm0) ((w1k) ((gbi) this.d).r).get();
                w1k w1kVar = (w1k) ((gbi) this.d).s;
                j3a j3aVar = (j3a) ((n5d0) ((hbi) this.c).y).get();
                lrm0Var4.getClass();
                w1kVar.getClass();
                j3aVar.getClass();
                return new dmn0(lrm0Var4, w1kVar, j3aVar, lrm0Var4.e);
            case 10:
                return new y6r();
            case 11:
                long j = Long.MAX_VALUE;
                long j2 = Long.MAX_VALUE;
                for (int i = 0; i < 3; i++) {
                    long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    System.currentTimeMillis();
                    long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos;
                    if (jElapsedRealtimeNanos2 < j2) {
                        j2 = jElapsedRealtimeNanos2;
                    }
                }
                for (int i2 = 0; i2 < 3; i2++) {
                    long jNanoTime = System.nanoTime();
                    SystemClock.elapsedRealtimeNanos();
                    long jNanoTime2 = System.nanoTime() - jNanoTime;
                    if (jNanoTime2 < j) {
                        j = jNanoTime2;
                    }
                }
                return new m9o0();
            case 12:
                return new c0a((lev) ((n5d0) ((gbi) this.d).j).get(), (iev) ((w1k) ((gbi) this.d).q).get(), (vne) ((n5d0) ((gbi) this.d).k).get());
            case 13:
                return new lev();
            case 14:
                qcq0 qcq0Var2 = (qcq0) ((n5d0) ((hbi) this.c).f).get();
                bby bbyVar = (bby) ((n5d0) ((hbi) this.c).f12771a).get();
                qcq0Var2.getClass();
                bbyVar.getClass();
                return d5c.a(kotlin.coroutines.e.c(new kin0(bbyVar), kotlin.coroutines.e.c(qcq0Var2.h, new rne("CXCP-Graph"))));
            case 15:
                return new d0a((lev) ((n5d0) ((gbi) this.d).j).get(), (iev) ((w1k) ((gbi) this.d).q).get(), (vne) ((n5d0) ((gbi) this.d).k).get());
            case 16:
                return new hke((iev) ((w1k) ((gbi) this.d).q).get(), (c1a) ((n5d0) ((gbi) this.d).c).get(), (qev) ((n5d0) ((gbi) this.d).n).get(), (pg00) ((n5d0) ((gbi) this.d).d).get());
            case 17:
                return new qev();
            default:
                c99.h(b);
                return null;
        }
    }

    private final Object b() {
        r8i r8iVar = (r8i) this.d;
        qdi qdiVar = (qdi) this.c;
        byte b = 16;
        byte b2 = 2;
        byte b3 = this.b;
        switch (b3) {
            case 0:
                return new u6i(this, b2);
            case 1:
                return i5t.w(qdiVar.b, (dni0) ((n5d0) r8iVar.b).get(), (rgs) qdiVar.B.get(), (vrs0) qdiVar.R.get());
            case 2:
                sek sekVar = qdiVar.b;
                pbt pbtVarL2 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL2);
                return new dni0(pbtVarL2);
            case 3:
                return i5t.s(qdiVar.b, (scu) ((n5d0) r8iVar.d).get(), qdiVar.f28534a.f5());
            case 4:
                sek sekVar2 = qdiVar.b;
                g8i g8iVar = qdiVar.f28534a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                return new scu(pbtVarL3, g8iVar.Qa());
            case 5:
                sek sekVar3 = qdiVar.b;
                pbt pbtVarL4 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL4);
                return new tni0(pbtVarL4);
            case 6:
                sek sekVar4 = qdiVar.b;
                pbt pbtVarL5 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL5);
                return new dqx(pbtVarL5);
            case 7:
                sek sekVar5 = qdiVar.b;
                pbt pbtVarL6 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL6);
                return new qiu(pbtVarL6);
            case 8:
                return i5t.t(qdiVar.b, (d3c) qdiVar.d.get(), (xyb) qdiVar.g.get());
            case 9:
                return i5t.D(qdiVar.b, (qpt) qdiVar.x.get(), (gmt) qdiVar.i.get(), (dni0) ((n5d0) r8iVar.b).get());
            case 10:
                return new v6i(this, b2);
            case 11:
                sek sekVar6 = qdiVar.b;
                return new l1u(qdiVar.b());
            case 12:
                sek sekVar7 = qdiVar.b;
                l1u l1uVar = (l1u) ((n5d0) r8iVar.l).get();
                qni0 qni0Var = (qni0) qdiVar.h0.get();
                itt ittVar = (itt) qdiVar.t.get();
                pbt pbtVarL7 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL7);
                return mkg.i(sekVar7, l1uVar, qni0Var, ittVar, pbtVarL7);
            case 13:
                sek sekVar8 = qdiVar.b;
                return new slu(qdiVar.b(), qdiVar.f28534a.Qa());
            case 14:
                return new yqc(this, b);
            case 15:
                return new w6i(this, (byte) 2);
            case 16:
                sek sekVar9 = qdiVar.b;
                g8i g8iVar2 = qdiVar.f28534a;
                return i5t.u(sekVar9, (d3c) qdiVar.d.get(), (fq) qdiVar.w.get(), (bpi0) ((n5d0) r8iVar.p).get(), qdiVar.b(), g8iVar2.f0(), g8iVar2.Qa());
            case 17:
                sek sekVar10 = qdiVar.b;
                pbt pbtVarL8 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL8);
                return i5t.y(sekVar10, pbtVarL8, (rgs) qdiVar.B.get(), (vrs0) qdiVar.R.get());
            case 18:
                sek sekVar11 = qdiVar.b;
                return new yku(qdiVar.b(), qdiVar.f28534a.Qa());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar12 = qdiVar.b;
                pbt pbtVarL9 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL9);
                return new k4v(pbtVarL9);
            case 20:
                return new x6i(this, (byte) 2);
            case 21:
                sek sekVar13 = qdiVar.b;
                v4u v4uVar = (v4u) ((n5d0) r8iVar.u).get();
                gmt gmtVar = (gmt) qdiVar.i.get();
                pbt pbtVarL10 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL10);
                return i5t.k(sekVar13, v4uVar, gmtVar, pbtVarL10);
            case 22:
                return i5t.j(qdiVar.b, (l1u) ((n5d0) r8iVar.l).get());
            case 23:
                return new y6i(this, (byte) 2);
            case 24:
                sek sekVar14 = qdiVar.b;
                pbt pbtVarL11 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL11);
                return new hpb(pbtVarL11);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar15 = qdiVar.b;
                pbt pbtVarL12 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL12);
                return new egu(pbtVarL12);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar16 = qdiVar.b;
                pbt pbtVarL13 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL13);
                return new pyb(pbtVarL13);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar17 = qdiVar.b;
                fq fqVar = (fq) qdiVar.w.get();
                pbt pbtVarL14 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL14);
                return i5t.x(sekVar17, fqVar, pbtVarL14);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new z6i(this, b2);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar18 = qdiVar.b;
                g8i g8iVar3 = qdiVar.f28534a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL15 = g8iVar3.L2();
                x1x.x(pbtVarL15);
                return i5t.o(sekVar18, wsf0VarF0, pbtVarL15);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return new a7i(this, b2);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return new b7i(this, (byte) 2);
            case 32:
                return new l6i(this, b2);
            case 33:
                return i5t.n(qdiVar.b, (scu) ((n5d0) r8iVar.d).get(), qdiVar.f28534a.f5());
            case 34:
                return new m6i(this, b2);
            case 35:
                return new n6i(this, b2);
            case 36:
                return new o6i(this, b2);
            case 37:
                return new prc(this, b);
            case 38:
                return new p6i(this, b2);
            case 39:
                return new q6i(this, b2);
            case 40:
                return new r6i(this, b2);
            case 41:
                return new s6i(this, b2);
            case 42:
                return new t6i(this, b2);
            case 43:
                sek sekVar19 = qdiVar.b;
                pbt pbtVarL16 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL16);
                return new uni0(pbtVarL16);
            case 44:
                return i5t.i(qdiVar.b, (scu) ((n5d0) r8iVar.d).get(), (gmt) qdiVar.i.get(), (ipu) ((n5d0) r8iVar.Q).get(), qdiVar.f28534a.f5());
            case 45:
                sek sekVar20 = qdiVar.b;
                g8i g8iVar4 = qdiVar.f28534a;
                pbt pbtVarL17 = g8iVar4.L2();
                x1x.x(pbtVarL17);
                return new ipu(pbtVarL17, g8iVar4.Qa());
            case 46:
                return i5t.l(qdiVar.b, (scu) ((n5d0) r8iVar.d).get(), qdiVar.f28534a.f5());
            case 47:
                sek sekVar21 = qdiVar.b;
                pbt pbtVarL18 = qdiVar.f28534a.L2();
                x1x.x(pbtVarL18);
                return new utt(pbtVarL18);
            case 48:
                sek sekVar22 = qdiVar.b;
                g8i g8iVar5 = qdiVar.f28534a;
                pbt pbtVarL19 = g8iVar5.L2();
                x1x.x(pbtVarL19);
                return new zcu(pbtVarL19, g8iVar5.Qa());
            case 49:
                return i5t.m(qdiVar.b, (scu) ((n5d0) r8iVar.d).get(), qdiVar.f28534a.f5());
            default:
                c99.h(b3);
                return null;
        }
    }

    private final Object c() {
        qfi qfiVar = (qfi) this.d;
        pfi pfiVar = (pfi) this.c;
        byte b = 3;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new u6i(this, b);
            case 1:
                return i5t.w(pfiVar.b, (dni0) qfiVar.f28635a.get(), (rgs) pfiVar.C.get(), (vrs0) pfiVar.S.get());
            case 2:
                sek sekVar = pfiVar.b;
                pbt pbtVarL2 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL2);
                return new dni0(pbtVarL2);
            case 3:
                return i5t.s(pfiVar.b, (scu) ((n5d0) qfiVar.d).get(), pfiVar.f26907a.f5());
            case 4:
                sek sekVar2 = pfiVar.b;
                g8i g8iVar = pfiVar.f26907a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                return new scu(pbtVarL3, g8iVar.Qa());
            case 5:
                sek sekVar3 = pfiVar.b;
                pbt pbtVarL4 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL4);
                return new tni0(pbtVarL4);
            case 6:
                sek sekVar4 = pfiVar.b;
                pbt pbtVarL5 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL5);
                return new qiu(pbtVarL5);
            case 7:
                return i5t.t(pfiVar.b, (d3c) pfiVar.e.get(), (xyb) pfiVar.h.get());
            case 8:
                return i5t.D(pfiVar.b, (qpt) pfiVar.y.get(), (gmt) pfiVar.j.get(), (dni0) qfiVar.f28635a.get());
            case 9:
                return new v6i(this, b);
            case 10:
                return new lrc((Object) this, (byte) 15);
            case 11:
                return new w6i(this, (byte) 3);
            case 12:
                sek sekVar5 = pfiVar.b;
                g8i g8iVar2 = pfiVar.f26907a;
                return i5t.u(sekVar5, (d3c) pfiVar.e.get(), (fq) pfiVar.x.get(), (bpi0) ((n5d0) qfiVar.l).get(), pfiVar.b(), g8iVar2.f0(), g8iVar2.Qa());
            case 13:
                sek sekVar6 = pfiVar.b;
                pbt pbtVarL6 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL6);
                return i5t.y(sekVar6, pbtVarL6, (rgs) pfiVar.C.get(), (vrs0) pfiVar.S.get());
            case 14:
                sek sekVar7 = pfiVar.b;
                return new yku(pfiVar.b(), pfiVar.f26907a.Qa());
            case 15:
                sek sekVar8 = pfiVar.b;
                pbt pbtVarL7 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL7);
                return new k4v(pbtVarL7);
            case 16:
                return new x6i(this, (byte) 3);
            case 17:
                sek sekVar9 = pfiVar.b;
                v4u v4uVar = (v4u) ((n5d0) qfiVar.q).get();
                gmt gmtVar = (gmt) pfiVar.j.get();
                pbt pbtVarL8 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL8);
                return i5t.k(sekVar9, v4uVar, gmtVar, pbtVarL8);
            case 18:
                return i5t.j(pfiVar.b, (l1u) pfiVar.t0.get());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new y6i(this, (byte) 3);
            case 20:
                sek sekVar10 = pfiVar.b;
                pbt pbtVarL9 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL9);
                return new hpb(pbtVarL9);
            case 21:
                sek sekVar11 = pfiVar.b;
                pbt pbtVarL10 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL10);
                return new egu(pbtVarL10);
            case 22:
                sek sekVar12 = pfiVar.b;
                pbt pbtVarL11 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL11);
                return new pyb(pbtVarL11);
            case 23:
                sek sekVar13 = pfiVar.b;
                fq fqVar = (fq) pfiVar.x.get();
                pbt pbtVarL12 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL12);
                return i5t.x(sekVar13, fqVar, pbtVarL12);
            case 24:
                return new z6i(this, b);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar14 = pfiVar.b;
                g8i g8iVar3 = pfiVar.f26907a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL13 = g8iVar3.L2();
                x1x.x(pbtVarL13);
                return i5t.o(sekVar14, wsf0VarF0, pbtVarL13);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new a7i(this, b);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new b7i(this, (byte) 3);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new l6i(this, b);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                return i5t.n(pfiVar.b, (scu) ((n5d0) qfiVar.d).get(), pfiVar.f26907a.f5());
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return new m6i(this, b);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return new n6i(this, b);
            case 32:
                return new o6i(this, b);
            case 33:
                return new clc((Object) this, (byte) 21);
            case 34:
                return new p6i(this, b);
            case 35:
                return new q6i(this, b);
            case 36:
                return new r6i(this, b);
            case 37:
                return new s6i(this, b);
            case 38:
                return new t6i(this, b);
            case 39:
                sek sekVar15 = pfiVar.b;
                pbt pbtVarL14 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL14);
                return new uni0(pbtVarL14);
            case 40:
                return i5t.i(pfiVar.b, (scu) ((n5d0) qfiVar.d).get(), (gmt) pfiVar.j.get(), (ipu) ((n5d0) qfiVar.M).get(), pfiVar.f26907a.f5());
            case 41:
                sek sekVar16 = pfiVar.b;
                g8i g8iVar4 = pfiVar.f26907a;
                pbt pbtVarL15 = g8iVar4.L2();
                x1x.x(pbtVarL15);
                return new ipu(pbtVarL15, g8iVar4.Qa());
            case 42:
                return i5t.l(pfiVar.b, (scu) ((n5d0) qfiVar.d).get(), pfiVar.f26907a.f5());
            case 43:
                sek sekVar17 = pfiVar.b;
                pbt pbtVarL16 = pfiVar.f26907a.L2();
                x1x.x(pbtVarL16);
                return new utt(pbtVarL16);
            case 44:
                sek sekVar18 = pfiVar.b;
                g8i g8iVar5 = pfiVar.f26907a;
                pbt pbtVarL17 = g8iVar5.L2();
                x1x.x(pbtVarL17);
                return new zcu(pbtVarL17, g8iVar5.Qa());
            case 45:
                return i5t.m(pfiVar.b, (scu) ((n5d0) qfiVar.d).get(), pfiVar.f26907a.f5());
            default:
                c99.h(b2);
                return null;
        }
    }

    private final Object d() {
        r8i r8iVar = (r8i) this.d;
        ufi ufiVar = (ufi) this.c;
        byte b = 4;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new u6i(this, b);
            case 1:
                return i5t.w(ufiVar.b, (dni0) ((n5d0) r8iVar.b).get(), (rgs) ufiVar.C.get(), (vrs0) ufiVar.S.get());
            case 2:
                sek sekVar = ufiVar.b;
                pbt pbtVarL2 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL2);
                return new dni0(pbtVarL2);
            case 3:
                return i5t.s(ufiVar.b, (scu) ((n5d0) r8iVar.d).get(), ufiVar.f35578a.f5());
            case 4:
                sek sekVar2 = ufiVar.b;
                g8i g8iVar = ufiVar.f35578a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                return new scu(pbtVarL3, g8iVar.Qa());
            case 5:
                sek sekVar3 = ufiVar.b;
                pbt pbtVarL4 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL4);
                return new tni0(pbtVarL4);
            case 6:
                sek sekVar4 = ufiVar.b;
                pbt pbtVarL5 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL5);
                return new dqx(pbtVarL5);
            case 7:
                sek sekVar5 = ufiVar.b;
                pbt pbtVarL6 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL6);
                return new qiu(pbtVarL6);
            case 8:
                return i5t.t(ufiVar.b, (d3c) ufiVar.e.get(), (xyb) ufiVar.h.get());
            case 9:
                return i5t.D(ufiVar.b, (qpt) ufiVar.y.get(), (gmt) ufiVar.j.get(), (dni0) ((n5d0) r8iVar.b).get());
            case 10:
                return new v6i(this, b);
            case 11:
                sek sekVar6 = ufiVar.b;
                return new l1u(ufiVar.b());
            case 12:
                sek sekVar7 = ufiVar.b;
                l1u l1uVar = (l1u) ((n5d0) r8iVar.l).get();
                qni0 qni0Var = (qni0) ufiVar.d0.get();
                itt ittVar = (itt) ufiVar.u.get();
                pbt pbtVarL7 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL7);
                return mkg.i(sekVar7, l1uVar, qni0Var, ittVar, pbtVarL7);
            case 13:
                sek sekVar8 = ufiVar.b;
                return new slu(ufiVar.b(), ufiVar.f35578a.Qa());
            case 14:
                return new cad((Object) this, (byte) 8);
            case 15:
                return new w6i(this, (byte) 4);
            case 16:
                sek sekVar9 = ufiVar.b;
                g8i g8iVar2 = ufiVar.f35578a;
                return i5t.u(sekVar9, (d3c) ufiVar.e.get(), (fq) ufiVar.x.get(), (bpi0) ((n5d0) r8iVar.p).get(), ufiVar.b(), g8iVar2.f0(), g8iVar2.Qa());
            case 17:
                sek sekVar10 = ufiVar.b;
                pbt pbtVarL8 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL8);
                return i5t.y(sekVar10, pbtVarL8, (rgs) ufiVar.C.get(), (vrs0) ufiVar.S.get());
            case 18:
                sek sekVar11 = ufiVar.b;
                return new yku(ufiVar.b(), ufiVar.f35578a.Qa());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar12 = ufiVar.b;
                pbt pbtVarL9 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL9);
                return new k4v(pbtVarL9);
            case 20:
                return new x6i(this, (byte) 4);
            case 21:
                sek sekVar13 = ufiVar.b;
                v4u v4uVar = (v4u) ((n5d0) r8iVar.u).get();
                gmt gmtVar = (gmt) ufiVar.j.get();
                pbt pbtVarL10 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL10);
                return i5t.k(sekVar13, v4uVar, gmtVar, pbtVarL10);
            case 22:
                return i5t.j(ufiVar.b, (l1u) ((n5d0) r8iVar.l).get());
            case 23:
                return new y6i(this, (byte) 4);
            case 24:
                sek sekVar14 = ufiVar.b;
                pbt pbtVarL11 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL11);
                return new hpb(pbtVarL11);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar15 = ufiVar.b;
                pbt pbtVarL12 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL12);
                return new egu(pbtVarL12);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar16 = ufiVar.b;
                pbt pbtVarL13 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL13);
                return new pyb(pbtVarL13);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar17 = ufiVar.b;
                fq fqVar = (fq) ufiVar.x.get();
                pbt pbtVarL14 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL14);
                return i5t.x(sekVar17, fqVar, pbtVarL14);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new z6i(this, b);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar18 = ufiVar.b;
                g8i g8iVar3 = ufiVar.f35578a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL15 = g8iVar3.L2();
                x1x.x(pbtVarL15);
                return i5t.o(sekVar18, wsf0VarF0, pbtVarL15);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return new a7i(this, b);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return new b7i(this, (byte) 4);
            case 32:
                return new l6i(this, b);
            case 33:
                return i5t.n(ufiVar.b, (scu) ((n5d0) r8iVar.d).get(), ufiVar.f35578a.f5());
            case 34:
                return new m6i(this, b);
            case 35:
                return new n6i(this, b);
            case 36:
                return new o6i(this, b);
            case 37:
                return new vqc((Object) this, (byte) 17);
            case 38:
                return new p6i(this, b);
            case 39:
                return new q6i(this, b);
            case 40:
                return new r6i(this, b);
            case 41:
                return new s6i(this, b);
            case 42:
                return new t6i(this, b);
            case 43:
                sek sekVar19 = ufiVar.b;
                pbt pbtVarL16 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL16);
                return new uni0(pbtVarL16);
            case 44:
                return i5t.i(ufiVar.b, (scu) ((n5d0) r8iVar.d).get(), (gmt) ufiVar.j.get(), (ipu) ((n5d0) r8iVar.Q).get(), ufiVar.f35578a.f5());
            case 45:
                sek sekVar20 = ufiVar.b;
                g8i g8iVar4 = ufiVar.f35578a;
                pbt pbtVarL17 = g8iVar4.L2();
                x1x.x(pbtVarL17);
                return new ipu(pbtVarL17, g8iVar4.Qa());
            case 46:
                return i5t.l(ufiVar.b, (scu) ((n5d0) r8iVar.d).get(), ufiVar.f35578a.f5());
            case 47:
                sek sekVar21 = ufiVar.b;
                pbt pbtVarL18 = ufiVar.f35578a.L2();
                x1x.x(pbtVarL18);
                return new utt(pbtVarL18);
            case 48:
                sek sekVar22 = ufiVar.b;
                g8i g8iVar5 = ufiVar.f35578a;
                pbt pbtVarL19 = g8iVar5.L2();
                x1x.x(pbtVarL19);
                return new zcu(pbtVarL19, g8iVar5.Qa());
            case 49:
                return i5t.m(ufiVar.b, (scu) ((n5d0) r8iVar.d).get(), ufiVar.f35578a.f5());
            default:
                c99.h(b2);
                return null;
        }
    }

    private final Object e() {
        r8i r8iVar = (r8i) this.d;
        xfi xfiVar = (xfi) this.c;
        byte b = 5;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new u6i(this, b);
            case 1:
                return i5t.w(xfiVar.b, (dni0) ((n5d0) r8iVar.b).get(), (rgs) xfiVar.C.get(), (vrs0) xfiVar.S.get());
            case 2:
                sek sekVar = xfiVar.b;
                pbt pbtVarL2 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL2);
                return new dni0(pbtVarL2);
            case 3:
                return i5t.s(xfiVar.b, (scu) ((n5d0) r8iVar.d).get(), xfiVar.f40791a.f5());
            case 4:
                sek sekVar2 = xfiVar.b;
                g8i g8iVar = xfiVar.f40791a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                return new scu(pbtVarL3, g8iVar.Qa());
            case 5:
                sek sekVar3 = xfiVar.b;
                pbt pbtVarL4 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL4);
                return new tni0(pbtVarL4);
            case 6:
                sek sekVar4 = xfiVar.b;
                pbt pbtVarL5 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL5);
                return new dqx(pbtVarL5);
            case 7:
                sek sekVar5 = xfiVar.b;
                pbt pbtVarL6 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL6);
                return new qiu(pbtVarL6);
            case 8:
                return i5t.t(xfiVar.b, (d3c) xfiVar.e.get(), (xyb) xfiVar.h.get());
            case 9:
                return i5t.D(xfiVar.b, (qpt) xfiVar.y.get(), (gmt) xfiVar.j.get(), (dni0) ((n5d0) r8iVar.b).get());
            case 10:
                return new v6i(this, b);
            case 11:
                sek sekVar6 = xfiVar.b;
                return new l1u(xfiVar.c());
            case 12:
                sek sekVar7 = xfiVar.b;
                l1u l1uVar = (l1u) ((n5d0) r8iVar.l).get();
                qni0 qni0Var = (qni0) xfiVar.d0.get();
                itt ittVar = (itt) xfiVar.u.get();
                pbt pbtVarL7 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL7);
                return mkg.i(sekVar7, l1uVar, qni0Var, ittVar, pbtVarL7);
            case 13:
                sek sekVar8 = xfiVar.b;
                return new slu(xfiVar.c(), xfiVar.f40791a.Qa());
            case 14:
                return new rrc(this, (byte) 11);
            case 15:
                return new w6i(this, (byte) 5);
            case 16:
                sek sekVar9 = xfiVar.b;
                g8i g8iVar2 = xfiVar.f40791a;
                return i5t.u(sekVar9, (d3c) xfiVar.e.get(), (fq) xfiVar.x.get(), (bpi0) ((n5d0) r8iVar.p).get(), xfiVar.c(), g8iVar2.f0(), g8iVar2.Qa());
            case 17:
                sek sekVar10 = xfiVar.b;
                pbt pbtVarL8 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL8);
                return i5t.y(sekVar10, pbtVarL8, (rgs) xfiVar.C.get(), (vrs0) xfiVar.S.get());
            case 18:
                sek sekVar11 = xfiVar.b;
                return new yku(xfiVar.c(), xfiVar.f40791a.Qa());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar12 = xfiVar.b;
                pbt pbtVarL9 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL9);
                return new k4v(pbtVarL9);
            case 20:
                return new x6i(this, (byte) 5);
            case 21:
                sek sekVar13 = xfiVar.b;
                v4u v4uVar = (v4u) ((n5d0) r8iVar.u).get();
                gmt gmtVar = (gmt) xfiVar.j.get();
                pbt pbtVarL10 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL10);
                return i5t.k(sekVar13, v4uVar, gmtVar, pbtVarL10);
            case 22:
                return i5t.j(xfiVar.b, (l1u) ((n5d0) r8iVar.l).get());
            case 23:
                return new y6i(this, (byte) 5);
            case 24:
                sek sekVar14 = xfiVar.b;
                pbt pbtVarL11 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL11);
                return new hpb(pbtVarL11);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar15 = xfiVar.b;
                pbt pbtVarL12 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL12);
                return new egu(pbtVarL12);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar16 = xfiVar.b;
                pbt pbtVarL13 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL13);
                return new pyb(pbtVarL13);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar17 = xfiVar.b;
                fq fqVar = (fq) xfiVar.x.get();
                pbt pbtVarL14 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL14);
                return i5t.x(sekVar17, fqVar, pbtVarL14);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new z6i(this, b);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar18 = xfiVar.b;
                g8i g8iVar3 = xfiVar.f40791a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL15 = g8iVar3.L2();
                x1x.x(pbtVarL15);
                return i5t.o(sekVar18, wsf0VarF0, pbtVarL15);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return new a7i(this, b);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return new b7i(this, (byte) 5);
            case 32:
                return new l6i(this, b);
            case 33:
                return i5t.n(xfiVar.b, (scu) ((n5d0) r8iVar.d).get(), xfiVar.f40791a.f5());
            case 34:
                return new m6i(this, b);
            case 35:
                return new n6i(this, b);
            case 36:
                return new o6i(this, b);
            case 37:
                return new a1d((Object) this, (byte) 9);
            case 38:
                return new p6i(this, b);
            case 39:
                return new q6i(this, b);
            case 40:
                return new r6i(this, b);
            case 41:
                return new s6i(this, b);
            case 42:
                return new t6i(this, b);
            case 43:
                sek sekVar19 = xfiVar.b;
                pbt pbtVarL16 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL16);
                return new uni0(pbtVarL16);
            case 44:
                return i5t.i(xfiVar.b, (scu) ((n5d0) r8iVar.d).get(), (gmt) xfiVar.j.get(), (ipu) ((n5d0) r8iVar.Q).get(), xfiVar.f40791a.f5());
            case 45:
                sek sekVar20 = xfiVar.b;
                g8i g8iVar4 = xfiVar.f40791a;
                pbt pbtVarL17 = g8iVar4.L2();
                x1x.x(pbtVarL17);
                return new ipu(pbtVarL17, g8iVar4.Qa());
            case 46:
                return i5t.l(xfiVar.b, (scu) ((n5d0) r8iVar.d).get(), xfiVar.f40791a.f5());
            case 47:
                sek sekVar21 = xfiVar.b;
                pbt pbtVarL18 = xfiVar.f40791a.L2();
                x1x.x(pbtVarL18);
                return new utt(pbtVarL18);
            case 48:
                sek sekVar22 = xfiVar.b;
                g8i g8iVar5 = xfiVar.f40791a;
                pbt pbtVarL19 = g8iVar5.L2();
                x1x.x(pbtVarL19);
                return new zcu(pbtVarL19, g8iVar5.Qa());
            case 49:
                return i5t.m(xfiVar.b, (scu) ((n5d0) r8iVar.d).get(), xfiVar.f40791a.f5());
            default:
                c99.h(b2);
                return null;
        }
    }

    private final Object f() {
        r8i r8iVar = (r8i) this.d;
        cii ciiVar = (cii) this.c;
        byte b = 6;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new u6i(this, b);
            case 1:
                return i5t.w(ciiVar.b, (dni0) ((n5d0) r8iVar.b).get(), (rgs) ciiVar.C.get(), (vrs0) ciiVar.S.get());
            case 2:
                sek sekVar = ciiVar.b;
                pbt pbtVarL2 = ciiVar.f4416a.L2();
                x1x.x(pbtVarL2);
                return new dni0(pbtVarL2);
            case 3:
                return i5t.s(ciiVar.b, (scu) ((n5d0) r8iVar.d).get(), ciiVar.f4416a.f5());
            case 4:
                sek sekVar2 = ciiVar.b;
                g8i g8iVar = ciiVar.f4416a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                return new scu(pbtVarL3, g8iVar.Qa());
            case 5:
                sek sekVar3 = ciiVar.b;
                pbt pbtVarL4 = ciiVar.f4416a.L2();
                x1x.x(pbtVarL4);
                return new tni0(pbtVarL4);
            case 6:
                sek sekVar4 = ciiVar.b;
                pbt pbtVarL5 = ciiVar.f4416a.L2();
                x1x.x(pbtVarL5);
                return new dqx(pbtVarL5);
            case 7:
                sek sekVar5 = ciiVar.b;
                pbt pbtVarL6 = ciiVar.f4416a.L2();
                x1x.x(pbtVarL6);
                return new qiu(pbtVarL6);
            case 8:
                return i5t.t(ciiVar.b, (d3c) ciiVar.e.get(), (xyb) ciiVar.h.get());
            case 9:
                return i5t.D(ciiVar.b, (qpt) ciiVar.y.get(), (gmt) ciiVar.j.get(), (dni0) ((n5d0) r8iVar.b).get());
            case 10:
                return new v6i(this, b);
            case 11:
                sek sekVar6 = ciiVar.b;
                return new l1u(ciiVar.b());
            case 12:
                sek sekVar7 = ciiVar.b;
                l1u l1uVar = (l1u) ((n5d0) r8iVar.l).get();
                qni0 qni0Var = (qni0) ciiVar.d0.get();
                itt ittVar = (itt) ciiVar.u.get();
                pbt pbtVarL7 = ciiVar.f4416a.L2();
                x1x.x(pbtVarL7);
                return mkg.i(sekVar7, l1uVar, qni0Var, ittVar, pbtVarL7);
            case 13:
                sek sekVar8 = ciiVar.b;
                return new slu(ciiVar.b(), ciiVar.f4416a.Qa());
            case 14:
                return new prc((Object) this, (byte) 17);
            case 15:
                return new w6i(this, (byte) 6);
            case 16:
                sek sekVar9 = ciiVar.b;
                g8i g8iVar2 = ciiVar.f4416a;
                return i5t.u(sekVar9, (d3c) ciiVar.e.get(), (fq) ciiVar.x.get(), (bpi0) ((n5d0) r8iVar.p).get(), ciiVar.b(), g8iVar2.f0(), g8iVar2.Qa());
            case 17:
                sek sekVar10 = ciiVar.b;
                pbt pbtVarL8 = ciiVar.f4416a.L2();
                x1x.x(pbtVarL8);
                return i5t.y(sekVar10, pbtVarL8, (rgs) ciiVar.C.get(), (vrs0) ciiVar.S.get());
            case 18:
                sek sekVar11 = ciiVar.b;
                return new yku(ciiVar.b(), ciiVar.f4416a.Qa());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar12 = ciiVar.b;
                pbt pbtVarL9 = ciiVar.f4416a.L2();
                x1x.x(pbtVarL9);
                return new k4v(pbtVarL9);
            case 20:
                return new x6i(this, (byte) 6);
            case 21:
                sek sekVar13 = ciiVar.b;
                v4u v4uVar = (v4u) ((n5d0) r8iVar.u).get();
                gmt gmtVar = (gmt) ciiVar.j.get();
                pbt pbtVarL10 = ciiVar.f4416a.L2();
                x1x.x(pbtVarL10);
                return i5t.k(sekVar13, v4uVar, gmtVar, pbtVarL10);
            case 22:
                return i5t.j(ciiVar.b, (l1u) ((n5d0) r8iVar.l).get());
            case 23:
                return new y6i(this, (byte) 6);
            case 24:
                sek sekVar14 = ciiVar.b;
                pbt pbtVarL11 = ciiVar.f4416a.L2();
                x1x.x(pbtVarL11);
                return new hpb(pbtVarL11);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar15 = ciiVar.b;
                pbt pbtVarL12 = ciiVar.f4416a.L2();
                x1x.x(pbtVarL12);
                return new egu(pbtVarL12);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar16 = ciiVar.b;
                pbt pbtVarL13 = ciiVar.f4416a.L2();
                x1x.x(pbtVarL13);
                return new pyb(pbtVarL13);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar17 = ciiVar.b;
                fq fqVar = (fq) ciiVar.x.get();
                pbt pbtVarL14 = ciiVar.f4416a.L2();
                x1x.x(pbtVarL14);
                return i5t.x(sekVar17, fqVar, pbtVarL14);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new z6i(this, b);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar18 = ciiVar.b;
                g8i g8iVar3 = ciiVar.f4416a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL15 = g8iVar3.L2();
                x1x.x(pbtVarL15);
                return i5t.o(sekVar18, wsf0VarF0, pbtVarL15);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return new a7i(this, b);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return new b7i(this, (byte) 6);
            case 32:
                return new l6i(this, b);
            case 33:
                return i5t.n(ciiVar.b, (scu) ((n5d0) r8iVar.d).get(), ciiVar.f4416a.f5());
            case 34:
                return new m6i(this, b);
            case 35:
                return new n6i(this, b);
            case 36:
                return new o6i(this, b);
            case 37:
                return new psc((Object) this, (byte) 14);
            case 38:
                return new p6i(this, b);
            case 39:
                return new q6i(this, b);
            case 40:
                return new r6i(this, b);
            case 41:
                return new s6i(this, b);
            case 42:
                return new t6i(this, b);
            case 43:
                sek sekVar19 = ciiVar.b;
                pbt pbtVarL16 = ciiVar.f4416a.L2();
                x1x.x(pbtVarL16);
                return new uni0(pbtVarL16);
            case 44:
                return i5t.i(ciiVar.b, (scu) ((n5d0) r8iVar.d).get(), (gmt) ciiVar.j.get(), (ipu) ((n5d0) r8iVar.Q).get(), ciiVar.f4416a.f5());
            case 45:
                sek sekVar20 = ciiVar.b;
                g8i g8iVar4 = ciiVar.f4416a;
                pbt pbtVarL17 = g8iVar4.L2();
                x1x.x(pbtVarL17);
                return new ipu(pbtVarL17, g8iVar4.Qa());
            case 46:
                return i5t.l(ciiVar.b, (scu) ((n5d0) r8iVar.d).get(), ciiVar.f4416a.f5());
            case 47:
                sek sekVar21 = ciiVar.b;
                pbt pbtVarL18 = ciiVar.f4416a.L2();
                x1x.x(pbtVarL18);
                return new utt(pbtVarL18);
            case 48:
                sek sekVar22 = ciiVar.b;
                g8i g8iVar5 = ciiVar.f4416a;
                pbt pbtVarL19 = g8iVar5.L2();
                x1x.x(pbtVarL19);
                return new zcu(pbtVarL19, g8iVar5.Qa());
            case 49:
                return i5t.m(ciiVar.b, (scu) ((n5d0) r8iVar.d).get(), ciiVar.f4416a.f5());
            default:
                c99.h(b2);
                return null;
        }
    }

    private final Object g() {
        byte b = this.b;
        if (b == 0) {
            return new gki(this, (byte) 0);
        }
        if (b == 1) {
            return new hki(this, (byte) 0);
        }
        if (b == 2) {
            return new iki(this, (byte) 0);
        }
        if (b == 3) {
            return new jki(this, (byte) 0);
        }
        c99.h(b);
        return null;
    }

    private final Object h() {
        r8i r8iVar = (r8i) this.d;
        lki lkiVar = (lki) this.c;
        byte b = 7;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new u6i(this, b);
            case 1:
                return i5t.w(lkiVar.b, (dni0) ((n5d0) r8iVar.b).get(), (rgs) lkiVar.C.get(), (vrs0) lkiVar.S.get());
            case 2:
                sek sekVar = lkiVar.b;
                pbt pbtVarL2 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL2);
                return new dni0(pbtVarL2);
            case 3:
                return i5t.s(lkiVar.b, (scu) ((n5d0) r8iVar.d).get(), lkiVar.f20204a.f5());
            case 4:
                sek sekVar2 = lkiVar.b;
                g8i g8iVar = lkiVar.f20204a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                return new scu(pbtVarL3, g8iVar.Qa());
            case 5:
                sek sekVar3 = lkiVar.b;
                pbt pbtVarL4 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL4);
                return new tni0(pbtVarL4);
            case 6:
                sek sekVar4 = lkiVar.b;
                pbt pbtVarL5 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL5);
                return new dqx(pbtVarL5);
            case 7:
                sek sekVar5 = lkiVar.b;
                pbt pbtVarL6 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL6);
                return new qiu(pbtVarL6);
            case 8:
                return i5t.t(lkiVar.b, (d3c) lkiVar.e.get(), (xyb) lkiVar.h.get());
            case 9:
                return i5t.D(lkiVar.b, (qpt) lkiVar.y.get(), (gmt) lkiVar.j.get(), (dni0) ((n5d0) r8iVar.b).get());
            case 10:
                return new v6i(this, b);
            case 11:
                sek sekVar6 = lkiVar.b;
                return new l1u(lkiVar.b());
            case 12:
                sek sekVar7 = lkiVar.b;
                l1u l1uVar = (l1u) ((n5d0) r8iVar.l).get();
                qni0 qni0Var = (qni0) lkiVar.d0.get();
                itt ittVar = (itt) lkiVar.u.get();
                pbt pbtVarL7 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL7);
                return mkg.i(sekVar7, l1uVar, qni0Var, ittVar, pbtVarL7);
            case 13:
                sek sekVar8 = lkiVar.b;
                return new slu(lkiVar.b(), lkiVar.f20204a.Qa());
            case 14:
                return new lrc((Object) this, (byte) 16);
            case 15:
                return new w6i(this, (byte) 7);
            case 16:
                sek sekVar9 = lkiVar.b;
                g8i g8iVar2 = lkiVar.f20204a;
                return i5t.u(sekVar9, (d3c) lkiVar.e.get(), (fq) lkiVar.x.get(), (bpi0) ((n5d0) r8iVar.p).get(), lkiVar.b(), g8iVar2.f0(), g8iVar2.Qa());
            case 17:
                sek sekVar10 = lkiVar.b;
                pbt pbtVarL8 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL8);
                return i5t.y(sekVar10, pbtVarL8, (rgs) lkiVar.C.get(), (vrs0) lkiVar.S.get());
            case 18:
                sek sekVar11 = lkiVar.b;
                return new yku(lkiVar.b(), lkiVar.f20204a.Qa());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar12 = lkiVar.b;
                pbt pbtVarL9 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL9);
                return new k4v(pbtVarL9);
            case 20:
                return new x6i(this, (byte) 7);
            case 21:
                sek sekVar13 = lkiVar.b;
                v4u v4uVar = (v4u) ((n5d0) r8iVar.u).get();
                gmt gmtVar = (gmt) lkiVar.j.get();
                pbt pbtVarL10 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL10);
                return i5t.k(sekVar13, v4uVar, gmtVar, pbtVarL10);
            case 22:
                return i5t.j(lkiVar.b, (l1u) ((n5d0) r8iVar.l).get());
            case 23:
                return new y6i(this, (byte) 7);
            case 24:
                sek sekVar14 = lkiVar.b;
                pbt pbtVarL11 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL11);
                return new hpb(pbtVarL11);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar15 = lkiVar.b;
                pbt pbtVarL12 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL12);
                return new egu(pbtVarL12);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar16 = lkiVar.b;
                pbt pbtVarL13 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL13);
                return new pyb(pbtVarL13);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar17 = lkiVar.b;
                fq fqVar = (fq) lkiVar.x.get();
                pbt pbtVarL14 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL14);
                return i5t.x(sekVar17, fqVar, pbtVarL14);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new z6i(this, b);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar18 = lkiVar.b;
                g8i g8iVar3 = lkiVar.f20204a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL15 = g8iVar3.L2();
                x1x.x(pbtVarL15);
                return i5t.o(sekVar18, wsf0VarF0, pbtVarL15);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return new a7i(this, b);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return new b7i(this, (byte) 7);
            case 32:
                return new l6i(this, b);
            case 33:
                return i5t.n(lkiVar.b, (scu) ((n5d0) r8iVar.d).get(), lkiVar.f20204a.f5());
            case 34:
                return new m6i(this, b);
            case 35:
                return new n6i(this, b);
            case 36:
                return new o6i(this, b);
            case 37:
                return new clc((Object) this, (byte) 22);
            case 38:
                return new p6i(this, b);
            case 39:
                return new q6i(this, b);
            case 40:
                return new r6i(this, b);
            case 41:
                return new s6i(this, b);
            case 42:
                return new t6i(this, b);
            case 43:
                sek sekVar19 = lkiVar.b;
                pbt pbtVarL16 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL16);
                return new uni0(pbtVarL16);
            case 44:
                return i5t.i(lkiVar.b, (scu) ((n5d0) r8iVar.d).get(), (gmt) lkiVar.j.get(), (ipu) ((n5d0) r8iVar.Q).get(), lkiVar.f20204a.f5());
            case 45:
                sek sekVar20 = lkiVar.b;
                g8i g8iVar4 = lkiVar.f20204a;
                pbt pbtVarL17 = g8iVar4.L2();
                x1x.x(pbtVarL17);
                return new ipu(pbtVarL17, g8iVar4.Qa());
            case 46:
                return i5t.l(lkiVar.b, (scu) ((n5d0) r8iVar.d).get(), lkiVar.f20204a.f5());
            case 47:
                sek sekVar21 = lkiVar.b;
                pbt pbtVarL18 = lkiVar.f20204a.L2();
                x1x.x(pbtVarL18);
                return new utt(pbtVarL18);
            case 48:
                sek sekVar22 = lkiVar.b;
                g8i g8iVar5 = lkiVar.f20204a;
                pbt pbtVarL19 = g8iVar5.L2();
                x1x.x(pbtVarL19);
                return new zcu(pbtVarL19, g8iVar5.Qa());
            case 49:
                return i5t.m(lkiVar.b, (scu) ((n5d0) r8iVar.d).get(), lkiVar.f20204a.f5());
            default:
                c99.h(b2);
                return null;
        }
    }

    private final Object i() {
        mki mkiVar = (mki) this.d;
        pki pkiVar = (pki) this.c;
        byte b = 8;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new u6i(this, b);
            case 1:
                return i5t.w(pkiVar.b, (dni0) ((n5d0) mkiVar.f21945a).get(), (rgs) pkiVar.D.get(), (vrs0) pkiVar.T.get());
            case 2:
                sek sekVar = pkiVar.b;
                pbt pbtVarL2 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL2);
                return new dni0(pbtVarL2);
            case 3:
                sek sekVar2 = pkiVar.b;
                pbt pbtVarL3 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL3);
                return new dqx(pbtVarL3);
            case 4:
                sek sekVar3 = pkiVar.b;
                pbt pbtVarL4 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL4);
                return new qiu(pbtVarL4);
            case 5:
                return i5t.t(pkiVar.b, (d3c) pkiVar.f.get(), (xyb) pkiVar.i.get());
            case 6:
                return i5t.D(pkiVar.b, (qpt) pkiVar.z.get(), (gmt) pkiVar.k.get(), (dni0) ((n5d0) mkiVar.f21945a).get());
            case 7:
                return new v6i(this, b);
            case 8:
                sek sekVar4 = pkiVar.b;
                pbt pbtVarL5 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL5);
                return new qni0(pbtVarL5);
            case 9:
                sek sekVar5 = pkiVar.b;
                return new l1u(pkiVar.b());
            case 10:
                sek sekVar6 = pkiVar.b;
                qni0 qni0Var = (qni0) ((n5d0) mkiVar.i).get();
                pbt pbtVarL6 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL6);
                return i5t.v(sekVar6, qni0Var, pbtVarL6);
            case 11:
                sek sekVar7 = pkiVar.b;
                l1u l1uVar = (l1u) ((n5d0) mkiVar.j).get();
                qni0 qni0Var2 = (qni0) ((n5d0) mkiVar.i).get();
                itt ittVar = (itt) pkiVar.v.get();
                pbt pbtVarL7 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL7);
                return mkg.i(sekVar7, l1uVar, qni0Var2, ittVar, pbtVarL7);
            case 12:
                return i5t.A(pkiVar.b, (fq) pkiVar.y.get(), pkiVar.f27135a.f0(), (g9c) pkiVar.n0.get(), (itt) pkiVar.v.get(), (yyb) pkiVar.m.get(), (lg60) ((n5d0) mkiVar.k).get());
            case 13:
                sek sekVar8 = pkiVar.b;
                return new slu(pkiVar.b(), pkiVar.f27135a.Qa());
            case 14:
                return new cad((Object) this, (byte) 9);
            case 15:
                return new w6i(this, (byte) 8);
            case 16:
                sek sekVar9 = pkiVar.b;
                g8i g8iVar = pkiVar.f27135a;
                return i5t.u(sekVar9, (d3c) pkiVar.f.get(), (fq) pkiVar.y.get(), (bpi0) pkiVar.i0.get(), pkiVar.b(), g8iVar.f0(), g8iVar.Qa());
            case 17:
                sek sekVar10 = pkiVar.b;
                return new yku(pkiVar.b(), pkiVar.f27135a.Qa());
            case 18:
                sek sekVar11 = pkiVar.b;
                pbt pbtVarL8 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL8);
                return new k4v(pbtVarL8);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new x6i(this, (byte) 8);
            case 20:
                sek sekVar12 = pkiVar.b;
                v4u v4uVar = (v4u) ((n5d0) mkiVar.t).get();
                gmt gmtVar = (gmt) pkiVar.k.get();
                pbt pbtVarL9 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL9);
                return i5t.k(sekVar12, v4uVar, gmtVar, pbtVarL9);
            case 21:
                return i5t.j(pkiVar.b, (l1u) ((n5d0) mkiVar.j).get());
            case 22:
                return new y6i(this, (byte) 8);
            case 23:
                sek sekVar13 = pkiVar.b;
                pbt pbtVarL10 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL10);
                return new hpb(pbtVarL10);
            case 24:
                sek sekVar14 = pkiVar.b;
                pbt pbtVarL11 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL11);
                return new egu(pbtVarL11);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar15 = pkiVar.b;
                pbt pbtVarL12 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL12);
                return new pyb(pbtVarL12);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar16 = pkiVar.b;
                fq fqVar = (fq) pkiVar.y.get();
                pbt pbtVarL13 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL13);
                return i5t.x(sekVar16, fqVar, pbtVarL13);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new z6i(this, b);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                sek sekVar17 = pkiVar.b;
                g8i g8iVar2 = pkiVar.f27135a;
                wsf0 wsf0VarF0 = g8iVar2.f0();
                pbt pbtVarL14 = g8iVar2.L2();
                x1x.x(pbtVarL14);
                return i5t.o(sekVar17, wsf0VarF0, pbtVarL14);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                return new a7i(this, b);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return new b7i(this, (byte) 8);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return new l6i(this, b);
            case 32:
                return new m6i(this, b);
            case 33:
                return new n6i(this, b);
            case 34:
                return new o6i(this, b);
            case 35:
                return new vqc((Object) this, (byte) 18);
            case 36:
                return new p6i(this, b);
            case 37:
                return new q6i(this, b);
            case 38:
                return new r6i(this, b);
            case 39:
                return new s6i(this, b);
            case 40:
                return new t6i(this, b);
            case 41:
                sek sekVar18 = pkiVar.b;
                pbt pbtVarL15 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL15);
                return new uni0(pbtVarL15);
            case 42:
                return i5t.i(pkiVar.b, (scu) pkiVar.f0.get(), (gmt) pkiVar.k.get(), (ipu) pkiVar.j0.get(), pkiVar.f27135a.f5());
            case 43:
                return i5t.l(pkiVar.b, (scu) pkiVar.f0.get(), pkiVar.f27135a.f5());
            case 44:
                sek sekVar19 = pkiVar.b;
                pbt pbtVarL16 = pkiVar.f27135a.L2();
                x1x.x(pbtVarL16);
                return new utt(pbtVarL16);
            default:
                c99.h(b2);
                return null;
        }
    }

    private final Object j() {
        byte b = this.b;
        if (b == 0) {
            return new gki(this, (byte) 1);
        }
        if (b == 1) {
            return new hki(this, (byte) 1);
        }
        if (b == 2) {
            return new iki(this, (byte) 1);
        }
        if (b == 3) {
            return new jki(this, (byte) 1);
        }
        c99.h(b);
        return null;
    }

    private final Object k() {
        r8i r8iVar = (r8i) this.d;
        wri wriVar = (wri) this.c;
        byte b = 10;
        byte b2 = 9;
        byte b3 = this.b;
        switch (b3) {
            case 0:
                return new u6i(this, b2);
            case 1:
                return i5t.w(wriVar.b, (dni0) ((n5d0) r8iVar.b).get(), (rgs) wriVar.C.get(), (vrs0) wriVar.S.get());
            case 2:
                sek sekVar = wriVar.b;
                pbt pbtVarL2 = wriVar.f39644a.L2();
                x1x.x(pbtVarL2);
                return new dni0(pbtVarL2);
            case 3:
                return i5t.s(wriVar.b, (scu) ((n5d0) r8iVar.d).get(), wriVar.f39644a.f5());
            case 4:
                sek sekVar2 = wriVar.b;
                g8i g8iVar = wriVar.f39644a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                return new scu(pbtVarL3, g8iVar.Qa());
            case 5:
                sek sekVar3 = wriVar.b;
                pbt pbtVarL4 = wriVar.f39644a.L2();
                x1x.x(pbtVarL4);
                return new tni0(pbtVarL4);
            case 6:
                sek sekVar4 = wriVar.b;
                pbt pbtVarL5 = wriVar.f39644a.L2();
                x1x.x(pbtVarL5);
                return new dqx(pbtVarL5);
            case 7:
                sek sekVar5 = wriVar.b;
                pbt pbtVarL6 = wriVar.f39644a.L2();
                x1x.x(pbtVarL6);
                return new qiu(pbtVarL6);
            case 8:
                return i5t.t(wriVar.b, (d3c) wriVar.e.get(), (xyb) wriVar.h.get());
            case 9:
                return i5t.D(wriVar.b, (qpt) wriVar.y.get(), (gmt) wriVar.j.get(), (dni0) ((n5d0) r8iVar.b).get());
            case 10:
                return new v6i(this, b2);
            case 11:
                sek sekVar6 = wriVar.b;
                return new l1u(wriVar.b());
            case 12:
                sek sekVar7 = wriVar.b;
                l1u l1uVar = (l1u) ((n5d0) r8iVar.l).get();
                qni0 qni0Var = (qni0) wriVar.l0.get();
                itt ittVar = (itt) wriVar.u.get();
                pbt pbtVarL7 = wriVar.f39644a.L2();
                x1x.x(pbtVarL7);
                return mkg.i(sekVar7, l1uVar, qni0Var, ittVar, pbtVarL7);
            case 13:
                sek sekVar8 = wriVar.b;
                return new slu(wriVar.b(), wriVar.f39644a.Qa());
            case 14:
                return new a1d(this, b);
            case 15:
                return new w6i(this, (byte) 9);
            case 16:
                sek sekVar9 = wriVar.b;
                g8i g8iVar2 = wriVar.f39644a;
                return i5t.u(sekVar9, (d3c) wriVar.e.get(), (fq) wriVar.x.get(), (bpi0) ((n5d0) r8iVar.p).get(), wriVar.b(), g8iVar2.f0(), g8iVar2.Qa());
            case 17:
                sek sekVar10 = wriVar.b;
                pbt pbtVarL8 = wriVar.f39644a.L2();
                x1x.x(pbtVarL8);
                return i5t.y(sekVar10, pbtVarL8, (rgs) wriVar.C.get(), (vrs0) wriVar.S.get());
            case 18:
                sek sekVar11 = wriVar.b;
                return new yku(wriVar.b(), wriVar.f39644a.Qa());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar12 = wriVar.b;
                pbt pbtVarL9 = wriVar.f39644a.L2();
                x1x.x(pbtVarL9);
                return new k4v(pbtVarL9);
            case 20:
                return new x6i(this, (byte) 9);
            case 21:
                sek sekVar13 = wriVar.b;
                v4u v4uVar = (v4u) ((n5d0) r8iVar.u).get();
                gmt gmtVar = (gmt) wriVar.j.get();
                pbt pbtVarL10 = wriVar.f39644a.L2();
                x1x.x(pbtVarL10);
                return i5t.k(sekVar13, v4uVar, gmtVar, pbtVarL10);
            case 22:
                return i5t.j(wriVar.b, (l1u) ((n5d0) r8iVar.l).get());
            case 23:
                return new y6i(this, (byte) 9);
            case 24:
                sek sekVar14 = wriVar.b;
                pbt pbtVarL11 = wriVar.f39644a.L2();
                x1x.x(pbtVarL11);
                return new hpb(pbtVarL11);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar15 = wriVar.b;
                pbt pbtVarL12 = wriVar.f39644a.L2();
                x1x.x(pbtVarL12);
                return new egu(pbtVarL12);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar16 = wriVar.b;
                pbt pbtVarL13 = wriVar.f39644a.L2();
                x1x.x(pbtVarL13);
                return new pyb(pbtVarL13);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar17 = wriVar.b;
                fq fqVar = (fq) wriVar.x.get();
                pbt pbtVarL14 = wriVar.f39644a.L2();
                x1x.x(pbtVarL14);
                return i5t.x(sekVar17, fqVar, pbtVarL14);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new z6i(this, b2);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar18 = wriVar.b;
                g8i g8iVar3 = wriVar.f39644a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL15 = g8iVar3.L2();
                x1x.x(pbtVarL15);
                return i5t.o(sekVar18, wsf0VarF0, pbtVarL15);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return new a7i(this, b2);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return new b7i(this, (byte) 9);
            case 32:
                return new l6i(this, b2);
            case 33:
                return i5t.n(wriVar.b, (scu) ((n5d0) r8iVar.d).get(), wriVar.f39644a.f5());
            case 34:
                return new m6i(this, b2);
            case 35:
                return new n6i(this, b2);
            case 36:
                return new o6i(this, b2);
            case 37:
                return new cad(this, b);
            case 38:
                return new p6i(this, b2);
            case 39:
                return new q6i(this, b2);
            case 40:
                return new r6i(this, b2);
            case 41:
                return new s6i(this, b2);
            case 42:
                return new t6i(this, b2);
            case 43:
                sek sekVar19 = wriVar.b;
                pbt pbtVarL16 = wriVar.f39644a.L2();
                x1x.x(pbtVarL16);
                return new uni0(pbtVarL16);
            case 44:
                return i5t.i(wriVar.b, (scu) ((n5d0) r8iVar.d).get(), (gmt) wriVar.j.get(), (ipu) ((n5d0) r8iVar.Q).get(), wriVar.f39644a.f5());
            case 45:
                sek sekVar20 = wriVar.b;
                g8i g8iVar4 = wriVar.f39644a;
                pbt pbtVarL17 = g8iVar4.L2();
                x1x.x(pbtVarL17);
                return new ipu(pbtVarL17, g8iVar4.Qa());
            case 46:
                return i5t.l(wriVar.b, (scu) ((n5d0) r8iVar.d).get(), wriVar.f39644a.f5());
            case 47:
                sek sekVar21 = wriVar.b;
                pbt pbtVarL18 = wriVar.f39644a.L2();
                x1x.x(pbtVarL18);
                return new utt(pbtVarL18);
            case 48:
                sek sekVar22 = wriVar.b;
                g8i g8iVar5 = wriVar.f39644a;
                pbt pbtVarL19 = g8iVar5.L2();
                x1x.x(pbtVarL19);
                return new zcu(pbtVarL19, g8iVar5.Qa());
            case 49:
                return i5t.m(wriVar.b, (scu) ((n5d0) r8iVar.d).get(), wriVar.f39644a.f5());
            default:
                c99.h(b3);
                return null;
        }
    }

    private final Object l() {
        r8i r8iVar = (r8i) this.d;
        qsi qsiVar = (qsi) this.c;
        byte b = 10;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new u6i(this, b);
            case 1:
                return i5t.w(qsiVar.b, (dni0) ((n5d0) r8iVar.b).get(), (rgs) qsiVar.C.get(), (vrs0) qsiVar.S.get());
            case 2:
                sek sekVar = qsiVar.b;
                pbt pbtVarL2 = qsiVar.f29259a.L2();
                x1x.x(pbtVarL2);
                return new dni0(pbtVarL2);
            case 3:
                return i5t.s(qsiVar.b, (scu) ((n5d0) r8iVar.d).get(), qsiVar.f29259a.f5());
            case 4:
                sek sekVar2 = qsiVar.b;
                g8i g8iVar = qsiVar.f29259a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                return new scu(pbtVarL3, g8iVar.Qa());
            case 5:
                sek sekVar3 = qsiVar.b;
                pbt pbtVarL4 = qsiVar.f29259a.L2();
                x1x.x(pbtVarL4);
                return new tni0(pbtVarL4);
            case 6:
                sek sekVar4 = qsiVar.b;
                pbt pbtVarL5 = qsiVar.f29259a.L2();
                x1x.x(pbtVarL5);
                return new dqx(pbtVarL5);
            case 7:
                sek sekVar5 = qsiVar.b;
                pbt pbtVarL6 = qsiVar.f29259a.L2();
                x1x.x(pbtVarL6);
                return new qiu(pbtVarL6);
            case 8:
                return i5t.t(qsiVar.b, (d3c) qsiVar.e.get(), (xyb) qsiVar.h.get());
            case 9:
                return i5t.D(qsiVar.b, (qpt) qsiVar.y.get(), (gmt) qsiVar.j.get(), (dni0) ((n5d0) r8iVar.b).get());
            case 10:
                return new v6i(this, b);
            case 11:
                sek sekVar6 = qsiVar.b;
                return new l1u(qsiVar.b());
            case 12:
                sek sekVar7 = qsiVar.b;
                l1u l1uVar = (l1u) ((n5d0) r8iVar.l).get();
                qni0 qni0Var = (qni0) qsiVar.k0.get();
                itt ittVar = (itt) qsiVar.u.get();
                pbt pbtVarL7 = qsiVar.f29259a.L2();
                x1x.x(pbtVarL7);
                return mkg.i(sekVar7, l1uVar, qni0Var, ittVar, pbtVarL7);
            case 13:
                sek sekVar8 = qsiVar.b;
                return new slu(qsiVar.b(), qsiVar.f29259a.Qa());
            case 14:
                return new psc((Object) this, (byte) 16);
            case 15:
                return new w6i(this, (byte) 10);
            case 16:
                sek sekVar9 = qsiVar.b;
                g8i g8iVar2 = qsiVar.f29259a;
                return i5t.u(sekVar9, (d3c) qsiVar.e.get(), (fq) qsiVar.x.get(), (bpi0) ((n5d0) r8iVar.p).get(), qsiVar.b(), g8iVar2.f0(), g8iVar2.Qa());
            case 17:
                sek sekVar10 = qsiVar.b;
                pbt pbtVarL8 = qsiVar.f29259a.L2();
                x1x.x(pbtVarL8);
                return i5t.y(sekVar10, pbtVarL8, (rgs) qsiVar.C.get(), (vrs0) qsiVar.S.get());
            case 18:
                sek sekVar11 = qsiVar.b;
                return new yku(qsiVar.b(), qsiVar.f29259a.Qa());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sek sekVar12 = qsiVar.b;
                pbt pbtVarL9 = qsiVar.f29259a.L2();
                x1x.x(pbtVarL9);
                return new k4v(pbtVarL9);
            case 20:
                return new x6i(this, (byte) 10);
            case 21:
                sek sekVar13 = qsiVar.b;
                v4u v4uVar = (v4u) ((n5d0) r8iVar.u).get();
                gmt gmtVar = (gmt) qsiVar.j.get();
                pbt pbtVarL10 = qsiVar.f29259a.L2();
                x1x.x(pbtVarL10);
                return i5t.k(sekVar13, v4uVar, gmtVar, pbtVarL10);
            case 22:
                return i5t.j(qsiVar.b, (l1u) ((n5d0) r8iVar.l).get());
            case 23:
                return new y6i(this, (byte) 10);
            case 24:
                sek sekVar14 = qsiVar.b;
                pbt pbtVarL11 = qsiVar.f29259a.L2();
                x1x.x(pbtVarL11);
                return new hpb(pbtVarL11);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar15 = qsiVar.b;
                pbt pbtVarL12 = qsiVar.f29259a.L2();
                x1x.x(pbtVarL12);
                return new egu(pbtVarL12);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar16 = qsiVar.b;
                pbt pbtVarL13 = qsiVar.f29259a.L2();
                x1x.x(pbtVarL13);
                return new pyb(pbtVarL13);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar17 = qsiVar.b;
                fq fqVar = (fq) qsiVar.x.get();
                pbt pbtVarL14 = qsiVar.f29259a.L2();
                x1x.x(pbtVarL14);
                return i5t.x(sekVar17, fqVar, pbtVarL14);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new z6i(this, b);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                sek sekVar18 = qsiVar.b;
                g8i g8iVar3 = qsiVar.f29259a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL15 = g8iVar3.L2();
                x1x.x(pbtVarL15);
                return i5t.o(sekVar18, wsf0VarF0, pbtVarL15);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return new a7i(this, b);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return new b7i(this, (byte) 10);
            case 32:
                return new l6i(this, b);
            case 33:
                return i5t.n(qsiVar.b, (scu) ((n5d0) r8iVar.d).get(), qsiVar.f29259a.f5());
            case 34:
                return new m6i(this, b);
            case 35:
                return new n6i(this, b);
            case 36:
                return new o6i(this, b);
            case 37:
                return new rrc(this, (byte) 13);
            case 38:
                return new p6i(this, b);
            case 39:
                return new q6i(this, b);
            case 40:
                return new r6i(this, b);
            case 41:
                return new s6i(this, b);
            case 42:
                return new t6i(this, b);
            case 43:
                sek sekVar19 = qsiVar.b;
                pbt pbtVarL16 = qsiVar.f29259a.L2();
                x1x.x(pbtVarL16);
                return new uni0(pbtVarL16);
            case 44:
                return i5t.i(qsiVar.b, (scu) ((n5d0) r8iVar.d).get(), (gmt) qsiVar.j.get(), (ipu) ((n5d0) r8iVar.Q).get(), qsiVar.f29259a.f5());
            case 45:
                sek sekVar20 = qsiVar.b;
                g8i g8iVar4 = qsiVar.f29259a;
                pbt pbtVarL17 = g8iVar4.L2();
                x1x.x(pbtVarL17);
                return new ipu(pbtVarL17, g8iVar4.Qa());
            case 46:
                return i5t.l(qsiVar.b, (scu) ((n5d0) r8iVar.d).get(), qsiVar.f29259a.f5());
            case 47:
                sek sekVar21 = qsiVar.b;
                pbt pbtVarL18 = qsiVar.f29259a.L2();
                x1x.x(pbtVarL18);
                return new utt(pbtVarL18);
            case 48:
                sek sekVar22 = qsiVar.b;
                g8i g8iVar5 = qsiVar.f29259a;
                pbt pbtVarL19 = g8iVar5.L2();
                x1x.x(pbtVarL19);
                return new zcu(pbtVarL19, g8iVar5.Qa());
            case 49:
                return i5t.m(qsiVar.b, (scu) ((n5d0) r8iVar.d).get(), qsiVar.f29259a.f5());
            default:
                c99.h(b2);
                return null;
        }
    }

    private final Object m() {
        db dbVar = (db) this.d;
        kui kuiVar = (kui) this.c;
        byte b = 11;
        byte b2 = this.b;
        switch (b2) {
            case 0:
                return new u6i(this, b);
            case 1:
                return i5t.w(kuiVar.b, (dni0) ((n5d0) dbVar.c).get(), (rgs) kuiVar.C.get(), (vrs0) kuiVar.S.get());
            case 2:
                sek sekVar = kuiVar.b;
                pbt pbtVarL2 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL2);
                return new dni0(pbtVarL2);
            case 3:
                return i5t.s(kuiVar.b, (scu) ((n5d0) dbVar.e).get(), kuiVar.f18911a.f5());
            case 4:
                sek sekVar2 = kuiVar.b;
                g8i g8iVar = kuiVar.f18911a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                return new scu(pbtVarL3, g8iVar.Qa());
            case 5:
                sek sekVar3 = kuiVar.b;
                pbt pbtVarL4 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL4);
                return new tni0(pbtVarL4);
            case 6:
                sek sekVar4 = kuiVar.b;
                pbt pbtVarL5 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL5);
                return new dqx(pbtVarL5);
            case 7:
                sek sekVar5 = kuiVar.b;
                pbt pbtVarL6 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL6);
                return new qiu(pbtVarL6);
            case 8:
                return i5t.t(kuiVar.b, (d3c) kuiVar.e.get(), (xyb) kuiVar.h.get());
            case 9:
                return i5t.D(kuiVar.b, (qpt) kuiVar.y.get(), (gmt) kuiVar.j.get(), (dni0) ((n5d0) dbVar.c).get());
            case 10:
                return new v6i(this, b);
            case 11:
                sek sekVar6 = kuiVar.b;
                l1u l1uVar = (l1u) kuiVar.c0.get();
                qni0 qni0Var = (qni0) kuiVar.f0.get();
                itt ittVar = (itt) kuiVar.u.get();
                pbt pbtVarL7 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL7);
                return mkg.i(sekVar6, l1uVar, qni0Var, ittVar, pbtVarL7);
            case 12:
                sek sekVar7 = kuiVar.b;
                return new slu(kuiVar.b(), kuiVar.f18911a.Qa());
            case 13:
                return new vqc((Object) this, (byte) 20);
            case 14:
                return new w6i(this, (byte) 11);
            case 15:
                sek sekVar8 = kuiVar.b;
                g8i g8iVar2 = kuiVar.f18911a;
                return i5t.u(sekVar8, (d3c) kuiVar.e.get(), (fq) kuiVar.x.get(), (bpi0) ((n5d0) dbVar.p).get(), kuiVar.b(), g8iVar2.f0(), g8iVar2.Qa());
            case 16:
                sek sekVar9 = kuiVar.b;
                pbt pbtVarL8 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL8);
                return i5t.y(sekVar9, pbtVarL8, (rgs) kuiVar.C.get(), (vrs0) kuiVar.S.get());
            case 17:
                sek sekVar10 = kuiVar.b;
                return new yku(kuiVar.b(), kuiVar.f18911a.Qa());
            case 18:
                sek sekVar11 = kuiVar.b;
                pbt pbtVarL9 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL9);
                return new k4v(pbtVarL9);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new x6i(this, (byte) 11);
            case 20:
                sek sekVar12 = kuiVar.b;
                v4u v4uVar = (v4u) ((n5d0) dbVar.u).get();
                gmt gmtVar = (gmt) kuiVar.j.get();
                pbt pbtVarL10 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL10);
                return i5t.k(sekVar12, v4uVar, gmtVar, pbtVarL10);
            case 21:
                return i5t.j(kuiVar.b, (l1u) kuiVar.c0.get());
            case 22:
                return new y6i(this, (byte) 11);
            case 23:
                sek sekVar13 = kuiVar.b;
                pbt pbtVarL11 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL11);
                return new hpb(pbtVarL11);
            case 24:
                sek sekVar14 = kuiVar.b;
                pbt pbtVarL12 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL12);
                return new pyb(pbtVarL12);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar15 = kuiVar.b;
                fq fqVar = (fq) kuiVar.x.get();
                pbt pbtVarL13 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL13);
                return i5t.x(sekVar15, fqVar, pbtVarL13);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new z6i(this, b);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sek sekVar16 = kuiVar.b;
                g8i g8iVar3 = kuiVar.f18911a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL14 = g8iVar3.L2();
                x1x.x(pbtVarL14);
                return i5t.o(sekVar16, wsf0VarF0, pbtVarL14);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return new a7i(this, b);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                return new b7i(this, (byte) 11);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return new l6i(this, b);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return i5t.n(kuiVar.b, (scu) ((n5d0) dbVar.e).get(), kuiVar.f18911a.f5());
            case 32:
                return new m6i(this, b);
            case 33:
                return new n6i(this, b);
            case 34:
                return new o6i(this, b);
            case 35:
                return new lrc((Object) this, (byte) 18);
            case 36:
                return new p6i(this, b);
            case 37:
                return new q6i(this, b);
            case 38:
                return new r6i(this, b);
            case 39:
                return new s6i(this, b);
            case 40:
                return new t6i(this, b);
            case 41:
                sek sekVar17 = kuiVar.b;
                pbt pbtVarL15 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL15);
                return new uni0(pbtVarL15);
            case 42:
                return i5t.i(kuiVar.b, (scu) ((n5d0) dbVar.e).get(), (gmt) kuiVar.j.get(), (ipu) ((n5d0) dbVar.P).get(), kuiVar.f18911a.f5());
            case 43:
                sek sekVar18 = kuiVar.b;
                g8i g8iVar4 = kuiVar.f18911a;
                pbt pbtVarL16 = g8iVar4.L2();
                x1x.x(pbtVarL16);
                return new ipu(pbtVarL16, g8iVar4.Qa());
            case 44:
                return i5t.l(kuiVar.b, (scu) ((n5d0) dbVar.e).get(), kuiVar.f18911a.f5());
            case 45:
                sek sekVar19 = kuiVar.b;
                pbt pbtVarL17 = kuiVar.f18911a.L2();
                x1x.x(pbtVarL17);
                return new utt(pbtVarL17);
            case 46:
                sek sekVar20 = kuiVar.b;
                g8i g8iVar5 = kuiVar.f18911a;
                pbt pbtVarL18 = g8iVar5.L2();
                x1x.x(pbtVarL18);
                return new zcu(pbtVarL18, g8iVar5.Qa());
            case 47:
                return i5t.m(kuiVar.b, (scu) ((n5d0) dbVar.e).get(), kuiVar.f18911a.f5());
            default:
                c99.h(b2);
                return null;
        }
    }

    private final Object n() {
        dxi dxiVar = (dxi) this.d;
        gxi gxiVar = (gxi) this.c;
        byte b = 11;
        byte b2 = 12;
        byte b3 = this.b;
        switch (b3) {
            case 0:
                return new u6i(this, b2);
            case 1:
                return i5t.w(gxiVar.b, (dni0) dxiVar.b.get(), (rgs) gxiVar.D.get(), (vrs0) gxiVar.T.get());
            case 2:
                sek sekVar = gxiVar.b;
                pbt pbtVarL2 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL2);
                return new dni0(pbtVarL2);
            case 3:
                return i5t.s(gxiVar.b, (scu) dxiVar.d.get(), gxiVar.f12079a.f5());
            case 4:
                sek sekVar2 = gxiVar.b;
                g8i g8iVar = gxiVar.f12079a;
                pbt pbtVarL3 = g8iVar.L2();
                x1x.x(pbtVarL3);
                return new scu(pbtVarL3, g8iVar.Qa());
            case 5:
                sek sekVar3 = gxiVar.b;
                pbt pbtVarL4 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL4);
                return new tni0(pbtVarL4);
            case 6:
                sek sekVar4 = gxiVar.b;
                pbt pbtVarL5 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL5);
                return new dqx(pbtVarL5);
            case 7:
                sek sekVar5 = gxiVar.b;
                pbt pbtVarL6 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL6);
                return new qiu(pbtVarL6);
            case 8:
                return i5t.t(gxiVar.b, (d3c) gxiVar.f.get(), (xyb) gxiVar.i.get());
            case 9:
                return i5t.D(gxiVar.b, (qpt) gxiVar.z.get(), (gmt) gxiVar.k.get(), (dni0) dxiVar.b.get());
            case 10:
                return new v6i(this, b2);
            case 11:
                sek sekVar6 = gxiVar.b;
                l1u l1uVar = (l1u) gxiVar.k0.get();
                qni0 qni0Var = (qni0) gxiVar.f0.get();
                itt ittVar = (itt) gxiVar.v.get();
                pbt pbtVarL7 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL7);
                return mkg.i(sekVar6, l1uVar, qni0Var, ittVar, pbtVarL7);
            case 12:
                sek sekVar7 = gxiVar.b;
                return new slu(gxiVar.b(), gxiVar.f12079a.Qa());
            case 13:
                return new a1d(this, b);
            case 14:
                return new w6i(this, (byte) 12);
            case 15:
                sek sekVar8 = gxiVar.b;
                g8i g8iVar2 = gxiVar.f12079a;
                return i5t.u(sekVar8, (d3c) gxiVar.f.get(), (fq) gxiVar.y.get(), (bpi0) dxiVar.o.get(), gxiVar.b(), g8iVar2.f0(), g8iVar2.Qa());
            case 16:
                sek sekVar9 = gxiVar.b;
                pbt pbtVarL8 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL8);
                return i5t.y(sekVar9, pbtVarL8, (rgs) gxiVar.D.get(), (vrs0) gxiVar.T.get());
            case 17:
                sek sekVar10 = gxiVar.b;
                return new yku(gxiVar.b(), gxiVar.f12079a.Qa());
            case 18:
                sek sekVar11 = gxiVar.b;
                pbt pbtVarL9 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL9);
                return new k4v(pbtVarL9);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new x6i(this, (byte) 12);
            case 20:
                sek sekVar12 = gxiVar.b;
                v4u v4uVar = (v4u) dxiVar.t.get();
                gmt gmtVar = (gmt) gxiVar.k.get();
                pbt pbtVarL10 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL10);
                return i5t.k(sekVar12, v4uVar, gmtVar, pbtVarL10);
            case 21:
                return i5t.j(gxiVar.b, (l1u) gxiVar.k0.get());
            case 22:
                return new y6i(this, (byte) 12);
            case 23:
                sek sekVar13 = gxiVar.b;
                pbt pbtVarL11 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL11);
                return new hpb(pbtVarL11);
            case 24:
                sek sekVar14 = gxiVar.b;
                pbt pbtVarL12 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL12);
                return new egu(pbtVarL12);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sek sekVar15 = gxiVar.b;
                pbt pbtVarL13 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL13);
                return new pyb(pbtVarL13);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sek sekVar16 = gxiVar.b;
                fq fqVar = (fq) gxiVar.y.get();
                pbt pbtVarL14 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL14);
                return i5t.x(sekVar16, fqVar, pbtVarL14);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return new z6i(this, b2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                sek sekVar17 = gxiVar.b;
                g8i g8iVar3 = gxiVar.f12079a;
                wsf0 wsf0VarF0 = g8iVar3.f0();
                pbt pbtVarL15 = g8iVar3.L2();
                x1x.x(pbtVarL15);
                return i5t.o(sekVar17, wsf0VarF0, pbtVarL15);
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                return new a7i(this, b2);
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return new b7i(this, (byte) 12);
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                return new l6i(this, b2);
            case 32:
                return i5t.n(gxiVar.b, (scu) dxiVar.d.get(), gxiVar.f12079a.f5());
            case 33:
                return new m6i(this, b2);
            case 34:
                return new n6i(this, b2);
            case 35:
                return new o6i(this, b2);
            case 36:
                return new cad(this, b);
            case 37:
                return new p6i(this, b2);
            case 38:
                return new q6i(this, b2);
            case 39:
                return new r6i(this, b2);
            case 40:
                return new s6i(this, b2);
            case 41:
                return new t6i(this, b2);
            case 42:
                sek sekVar18 = gxiVar.b;
                pbt pbtVarL16 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL16);
                return new uni0(pbtVarL16);
            case 43:
                return i5t.i(gxiVar.b, (scu) dxiVar.d.get(), (gmt) gxiVar.k.get(), (ipu) dxiVar.P.get(), gxiVar.f12079a.f5());
            case 44:
                sek sekVar19 = gxiVar.b;
                g8i g8iVar4 = gxiVar.f12079a;
                pbt pbtVarL17 = g8iVar4.L2();
                x1x.x(pbtVarL17);
                return new ipu(pbtVarL17, g8iVar4.Qa());
            case 45:
                return i5t.l(gxiVar.b, (scu) dxiVar.d.get(), gxiVar.f12079a.f5());
            case 46:
                sek sekVar20 = gxiVar.b;
                pbt pbtVarL18 = gxiVar.f12079a.L2();
                x1x.x(pbtVarL18);
                return new utt(pbtVarL18);
            case 47:
                sek sekVar21 = gxiVar.b;
                g8i g8iVar5 = gxiVar.f12079a;
                pbt pbtVarL19 = g8iVar5.L2();
                x1x.x(pbtVarL19);
                return new zcu(pbtVarL19, g8iVar5.Qa());
            case 48:
                return i5t.m(gxiVar.b, (scu) dxiVar.d.get(), gxiVar.f12079a.f5());
            default:
                c99.h(b3);
                return null;
        }
    }

    @Override // a.o5d0
    public final Object get() {
        Object u0aVar;
        Set setSingleton;
        Object ppt0Var;
        byte b = this.f3863a;
        byte b2 = 28;
        Object obj = this.d;
        Object obj2 = this.c;
        byte b3 = this.b;
        byte b4 = 2;
        byte b5 = 0;
        byte b6 = 1;
        switch (b) {
            case 0:
                db dbVar = (db) obj;
                k6i k6iVar = (k6i) obj2;
                switch (b3) {
                    case 0:
                        return new u6i(this, b5);
                    case 1:
                        return i5t.w(k6iVar.b, (dni0) ((n5d0) dbVar.c).get(), (rgs) k6iVar.C.get(), (vrs0) k6iVar.S.get());
                    case 2:
                        sek sekVar = k6iVar.b;
                        pbt pbtVarL2 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL2);
                        return new dni0(pbtVarL2);
                    case 3:
                        return i5t.s(k6iVar.b, (scu) ((n5d0) dbVar.e).get(), k6iVar.f17771a.f5());
                    case 4:
                        sek sekVar2 = k6iVar.b;
                        g8i g8iVar = k6iVar.f17771a;
                        pbt pbtVarL3 = g8iVar.L2();
                        x1x.x(pbtVarL3);
                        return new scu(pbtVarL3, g8iVar.Qa());
                    case 5:
                        sek sekVar3 = k6iVar.b;
                        pbt pbtVarL4 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL4);
                        return new tni0(pbtVarL4);
                    case 6:
                        sek sekVar4 = k6iVar.b;
                        pbt pbtVarL5 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL5);
                        return new dqx(pbtVarL5);
                    case 7:
                        sek sekVar5 = k6iVar.b;
                        pbt pbtVarL6 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL6);
                        return new qiu(pbtVarL6);
                    case 8:
                        return i5t.t(k6iVar.b, (d3c) k6iVar.e.get(), (xyb) k6iVar.h.get());
                    case 9:
                        return i5t.D(k6iVar.b, (qpt) k6iVar.y.get(), (gmt) k6iVar.j.get(), (dni0) ((n5d0) dbVar.c).get());
                    case 10:
                        return new v6i(this, b5);
                    case 11:
                        sek sekVar6 = k6iVar.b;
                        l1u l1uVar = (l1u) k6iVar.c0.get();
                        qni0 qni0Var = (qni0) k6iVar.i0.get();
                        itt ittVar = (itt) k6iVar.u.get();
                        pbt pbtVarL7 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL7);
                        return mkg.i(sekVar6, l1uVar, qni0Var, ittVar, pbtVarL7);
                    case 12:
                        sek sekVar7 = k6iVar.b;
                        return new slu(k6iVar.b(), k6iVar.f17771a.Qa());
                    case 13:
                        return new a1d((Object) this, (byte) 8);
                    case 14:
                        return new w6i(this, (byte) 0);
                    case 15:
                        sek sekVar8 = k6iVar.b;
                        g8i g8iVar2 = k6iVar.f17771a;
                        return i5t.u(sekVar8, (d3c) k6iVar.e.get(), (fq) k6iVar.x.get(), (bpi0) ((n5d0) dbVar.p).get(), k6iVar.b(), g8iVar2.f0(), g8iVar2.Qa());
                    case 16:
                        sek sekVar9 = k6iVar.b;
                        pbt pbtVarL8 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL8);
                        return i5t.y(sekVar9, pbtVarL8, (rgs) k6iVar.C.get(), (vrs0) k6iVar.S.get());
                    case 17:
                        sek sekVar10 = k6iVar.b;
                        return new yku(k6iVar.b(), k6iVar.f17771a.Qa());
                    case 18:
                        sek sekVar11 = k6iVar.b;
                        pbt pbtVarL9 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL9);
                        return new k4v(pbtVarL9);
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        return new x6i(this, (byte) 0);
                    case 20:
                        sek sekVar12 = k6iVar.b;
                        v4u v4uVar = (v4u) ((n5d0) dbVar.u).get();
                        gmt gmtVar = (gmt) k6iVar.j.get();
                        pbt pbtVarL10 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL10);
                        return i5t.k(sekVar12, v4uVar, gmtVar, pbtVarL10);
                    case 21:
                        return i5t.j(k6iVar.b, (l1u) k6iVar.c0.get());
                    case 22:
                        return new y6i(this, (byte) 0);
                    case 23:
                        sek sekVar13 = k6iVar.b;
                        pbt pbtVarL11 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL11);
                        return new hpb(pbtVarL11);
                    case 24:
                        sek sekVar14 = k6iVar.b;
                        pbt pbtVarL12 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL12);
                        return new pyb(pbtVarL12);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        sek sekVar15 = k6iVar.b;
                        fq fqVar = (fq) k6iVar.x.get();
                        pbt pbtVarL13 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL13);
                        return i5t.x(sekVar15, fqVar, pbtVarL13);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return new z6i(this, b5);
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        sek sekVar16 = k6iVar.b;
                        g8i g8iVar3 = k6iVar.f17771a;
                        wsf0 wsf0VarF0 = g8iVar3.f0();
                        pbt pbtVarL14 = g8iVar3.L2();
                        x1x.x(pbtVarL14);
                        return i5t.o(sekVar16, wsf0VarF0, pbtVarL14);
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return new a7i(this, b5);
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        return new b7i(this, (byte) 0);
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        return new l6i(this, b5);
                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        return i5t.n(k6iVar.b, (scu) ((n5d0) dbVar.e).get(), k6iVar.f17771a.f5());
                    case 32:
                        return new m6i(this, b5);
                    case 33:
                        return new n6i(this, b5);
                    case 34:
                        return new o6i(this, b5);
                    case 35:
                        return new cad((Object) this, (byte) 6);
                    case 36:
                        return new p6i(this, b5);
                    case 37:
                        return new q6i(this, b5);
                    case 38:
                        return new r6i(this, b5);
                    case 39:
                        return new s6i(this, b5);
                    case 40:
                        return new t6i(this, b5);
                    case 41:
                        sek sekVar17 = k6iVar.b;
                        pbt pbtVarL15 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL15);
                        return new uni0(pbtVarL15);
                    case 42:
                        return i5t.i(k6iVar.b, (scu) ((n5d0) dbVar.e).get(), (gmt) k6iVar.j.get(), (ipu) ((n5d0) dbVar.P).get(), k6iVar.f17771a.f5());
                    case 43:
                        sek sekVar18 = k6iVar.b;
                        g8i g8iVar4 = k6iVar.f17771a;
                        pbt pbtVarL16 = g8iVar4.L2();
                        x1x.x(pbtVarL16);
                        return new ipu(pbtVarL16, g8iVar4.Qa());
                    case 44:
                        return i5t.l(k6iVar.b, (scu) ((n5d0) dbVar.e).get(), k6iVar.f17771a.f5());
                    case 45:
                        sek sekVar19 = k6iVar.b;
                        pbt pbtVarL17 = k6iVar.f17771a.L2();
                        x1x.x(pbtVarL17);
                        return new utt(pbtVarL17);
                    case 46:
                        sek sekVar20 = k6iVar.b;
                        g8i g8iVar5 = k6iVar.f17771a;
                        pbt pbtVarL18 = g8iVar5.L2();
                        x1x.x(pbtVarL18);
                        return new zcu(pbtVarL18, g8iVar5.Qa());
                    case 47:
                        return i5t.m(k6iVar.b, (scu) ((n5d0) dbVar.e).get(), k6iVar.f17771a.f5());
                    default:
                        c99.h(b3);
                        return null;
                }
            case 1:
                r8i r8iVar = (r8i) obj;
                q8i q8iVar = (q8i) obj2;
                switch (b3) {
                    case 0:
                        return new u6i(this, b6);
                    case 1:
                        return i5t.w(q8iVar.b, (dni0) ((n5d0) r8iVar.b).get(), (rgs) q8iVar.C.get(), (vrs0) q8iVar.S.get());
                    case 2:
                        sek sekVar21 = q8iVar.b;
                        pbt pbtVarL19 = q8iVar.f28301a.L2();
                        x1x.x(pbtVarL19);
                        return new dni0(pbtVarL19);
                    case 3:
                        return i5t.s(q8iVar.b, (scu) ((n5d0) r8iVar.d).get(), q8iVar.f28301a.f5());
                    case 4:
                        sek sekVar22 = q8iVar.b;
                        g8i g8iVar6 = q8iVar.f28301a;
                        pbt pbtVarL20 = g8iVar6.L2();
                        x1x.x(pbtVarL20);
                        return new scu(pbtVarL20, g8iVar6.Qa());
                    case 5:
                        sek sekVar23 = q8iVar.b;
                        pbt pbtVarL21 = q8iVar.f28301a.L2();
                        x1x.x(pbtVarL21);
                        return new tni0(pbtVarL21);
                    case 6:
                        sek sekVar24 = q8iVar.b;
                        pbt pbtVarL22 = q8iVar.f28301a.L2();
                        x1x.x(pbtVarL22);
                        return new dqx(pbtVarL22);
                    case 7:
                        sek sekVar25 = q8iVar.b;
                        pbt pbtVarL23 = q8iVar.f28301a.L2();
                        x1x.x(pbtVarL23);
                        return new qiu(pbtVarL23);
                    case 8:
                        return i5t.t(q8iVar.b, (d3c) q8iVar.e.get(), (xyb) q8iVar.h.get());
                    case 9:
                        return i5t.D(q8iVar.b, (qpt) q8iVar.y.get(), (gmt) q8iVar.j.get(), (dni0) ((n5d0) r8iVar.b).get());
                    case 10:
                        return new v6i(this, b6);
                    case 11:
                        sek sekVar26 = q8iVar.b;
                        return new l1u(q8iVar.b());
                    case 12:
                        sek sekVar27 = q8iVar.b;
                        l1u l1uVar2 = (l1u) ((n5d0) r8iVar.l).get();
                        qni0 qni0Var2 = (qni0) q8iVar.d0.get();
                        itt ittVar2 = (itt) q8iVar.u.get();
                        pbt pbtVarL24 = q8iVar.f28301a.L2();
                        x1x.x(pbtVarL24);
                        return mkg.i(sekVar27, l1uVar2, qni0Var2, ittVar2, pbtVarL24);
                    case 13:
                        sek sekVar28 = q8iVar.b;
                        return new slu(q8iVar.b(), q8iVar.f28301a.Qa());
                    case 14:
                        return new prc((Object) this, (byte) 15);
                    case 15:
                        return new w6i(this, (byte) 1);
                    case 16:
                        sek sekVar29 = q8iVar.b;
                        g8i g8iVar7 = q8iVar.f28301a;
                        return i5t.u(sekVar29, (d3c) q8iVar.e.get(), (fq) q8iVar.x.get(), (bpi0) ((n5d0) r8iVar.p).get(), q8iVar.b(), g8iVar7.f0(), g8iVar7.Qa());
                    case 17:
                        sek sekVar30 = q8iVar.b;
                        pbt pbtVarL25 = q8iVar.f28301a.L2();
                        x1x.x(pbtVarL25);
                        return i5t.y(sekVar30, pbtVarL25, (rgs) q8iVar.C.get(), (vrs0) q8iVar.S.get());
                    case 18:
                        sek sekVar31 = q8iVar.b;
                        return new yku(q8iVar.b(), q8iVar.f28301a.Qa());
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        sek sekVar32 = q8iVar.b;
                        pbt pbtVarL26 = q8iVar.f28301a.L2();
                        x1x.x(pbtVarL26);
                        return new k4v(pbtVarL26);
                    case 20:
                        return new x6i(this, (byte) 1);
                    case 21:
                        sek sekVar33 = q8iVar.b;
                        v4u v4uVar2 = (v4u) ((n5d0) r8iVar.u).get();
                        gmt gmtVar2 = (gmt) q8iVar.j.get();
                        pbt pbtVarL27 = q8iVar.f28301a.L2();
                        x1x.x(pbtVarL27);
                        return i5t.k(sekVar33, v4uVar2, gmtVar2, pbtVarL27);
                    case 22:
                        return i5t.j(q8iVar.b, (l1u) ((n5d0) r8iVar.l).get());
                    case 23:
                        return new y6i(this, (byte) 1);
                    case 24:
                        sek sekVar34 = q8iVar.b;
                        pbt pbtVarL28 = q8iVar.f28301a.L2();
                        x1x.x(pbtVarL28);
                        return new hpb(pbtVarL28);
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        sek sekVar35 = q8iVar.b;
                        pbt pbtVarL29 = q8iVar.f28301a.L2();
                        x1x.x(pbtVarL29);
                        return new egu(pbtVarL29);
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        sek sekVar36 = q8iVar.b;
                        pbt pbtVarL30 = q8iVar.f28301a.L2();
                        x1x.x(pbtVarL30);
                        return new pyb(pbtVarL30);
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        sek sekVar37 = q8iVar.b;
                        fq fqVar2 = (fq) q8iVar.x.get();
                        pbt pbtVarL31 = q8iVar.f28301a.L2();
                        x1x.x(pbtVarL31);
                        return i5t.x(sekVar37, fqVar2, pbtVarL31);
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        return new z6i(this, b6);
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        sek sekVar38 = q8iVar.b;
                        g8i g8iVar8 = q8iVar.f28301a;
                        wsf0 wsf0VarF1 = g8iVar8.f0();
                        pbt pbtVarL32 = g8iVar8.L2();
                        x1x.x(pbtVarL32);
                        return i5t.o(sekVar38, wsf0VarF1, pbtVarL32);
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        return new a7i(this, b6);
                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        return new b7i(this, (byte) 1);
                    case 32:
                        return new l6i(this, b6);
                    case 33:
                        return i5t.n(q8iVar.b, (scu) ((n5d0) r8iVar.d).get(), q8iVar.f28301a.f5());
                    case 34:
                        return new m6i(this, b6);
                    case 35:
                        return new n6i(this, b6);
                    case 36:
                        return new o6i(this, b6);
                    case 37:
                        return new psc((Object) this, (byte) 12);
                    case 38:
                        return new p6i(this, b6);
                    case 39:
                        return new q6i(this, b6);
                    case 40:
                        return new r6i(this, b6);
                    case 41:
                        return new s6i(this, b6);
                    case 42:
                        return new t6i(this, b6);
                    case 43:
                        sek sekVar39 = q8iVar.b;
                        pbt pbtVarL33 = q8iVar.f28301a.L2();
                        x1x.x(pbtVarL33);
                        return new uni0(pbtVarL33);
                    case 44:
                        return i5t.i(q8iVar.b, (scu) ((n5d0) r8iVar.d).get(), (gmt) q8iVar.j.get(), (ipu) ((n5d0) r8iVar.Q).get(), q8iVar.f28301a.f5());
                    case 45:
                        sek sekVar40 = q8iVar.b;
                        g8i g8iVar9 = q8iVar.f28301a;
                        pbt pbtVarL34 = g8iVar9.L2();
                        x1x.x(pbtVarL34);
                        return new ipu(pbtVarL34, g8iVar9.Qa());
                    case 46:
                        return i5t.l(q8iVar.b, (scu) ((n5d0) r8iVar.d).get(), q8iVar.f28301a.f5());
                    case 47:
                        sek sekVar41 = q8iVar.b;
                        pbt pbtVarL35 = q8iVar.f28301a.L2();
                        x1x.x(pbtVarL35);
                        return new utt(pbtVarL35);
                    case 48:
                        sek sekVar42 = q8iVar.b;
                        g8i g8iVar10 = q8iVar.f28301a;
                        pbt pbtVarL36 = g8iVar10.L2();
                        x1x.x(pbtVarL36);
                        return new zcu(pbtVarL36, g8iVar10.Qa());
                    case 49:
                        return i5t.m(q8iVar.b, (scu) ((n5d0) r8iVar.d).get(), q8iVar.f28301a.f5());
                    default:
                        c99.h(b3);
                        return null;
                }
            case 2:
                cbi cbiVar = (cbi) obj2;
                dbi dbiVar = (dbi) obj;
                switch (b3) {
                    case 0:
                        fhn fhnVar = (fhn) dbiVar.f5805a;
                        fhnVar.getClass();
                        u0aVar = new u0a(fhnVar, (ppt0) ((n5d0) dbiVar.G).get(), (n0a) ((n5d0) dbiVar.E).get(), (ry9) ((n5d0) dbiVar.H).get(), (tpt0) ((n5d0) dbiVar.k).get(), (r2a) ((n5d0) dbiVar.y).get());
                        return u0aVar;
                    case 1:
                        esg0 esg0Var = cbiVar.f4062a;
                        esg0 esg0Var2 = cbiVar.f4062a;
                        m1a m1aVar = (m1a) esg0Var.c;
                        x1x.y(m1aVar);
                        wy9 wy9Var = (wy9) esg0Var2.e;
                        x1x.y(wy9Var);
                        ehf0 ehf0Var = new ehf0(cbiVar, dbiVar, b2);
                        f4w0 f4w0Var = (f4w0) ((n5d0) dbiVar.f).get();
                        ge10 ge10Var = (ge10) ((n5d0) dbiVar.n).get();
                        jdg0 jdg0Var = new jdg0((byte) 1);
                        jdg0Var.a(((n5d0) dbiVar.p).get());
                        jdg0Var.a(((n5d0) dbiVar.r).get());
                        jdg0Var.a(((n5d0) dbiVar.s).get());
                        jdg0Var.a(((n5d0) dbiVar.l).get());
                        jdg0Var.a(((n5d0) dbiVar.t).get());
                        jdg0Var.a(((n5d0) dbiVar.q).get());
                        jdg0Var.a(((n5d0) dbiVar.n).get());
                        jdg0Var.a(((n5d0) dbiVar.u).get());
                        jdg0Var.a(((n5d0) dbiVar.v).get());
                        ArrayList arrayList = jdg0Var.b;
                        if (arrayList.isEmpty()) {
                            setSingleton = Collections.EMPTY_SET;
                        } else {
                            setSingleton = arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : Collections.unmodifiableSet(new HashSet(arrayList));
                        }
                        Set set = setSingleton;
                        bw9 bw9Var = (bw9) ((n5d0) dbiVar.x).get();
                        r2a r2aVar = (r2a) ((n5d0) dbiVar.y).get();
                        w1k w1kVar = (w1k) dbiVar.I;
                        n5d0 n5d0Var = (n5d0) dbiVar.k;
                        n5d0 n5d0Var2 = (n5d0) dbiVar.E;
                        ewn ewnVar = (ewn) ((n5d0) dbiVar.C).get();
                        l1a l1aVar = (l1a) ((n5d0) dbiVar.e).get();
                        l4a l4aVar = (l4a) esg0Var2.f;
                        yz9 yz9Var = (yz9) ((n5d0) dbiVar.F).get();
                        Context context = (Context) esg0Var2.f8326a;
                        x1x.y(context);
                        Context context2 = (Context) esg0Var2.f8326a;
                        x1x.y(context2);
                        ppt0Var = new ppt0(m1aVar, wy9Var, ehf0Var, f4w0Var, ge10Var, set, bw9Var, r2aVar, w1kVar, n5d0Var, n5d0Var2, ewnVar, l1aVar, l4aVar, yz9Var, context, xvk.g.m(context2));
                        return ppt0Var;
                    case 2:
                        l1a l1aVar2 = (l1a) ((n5d0) dbiVar.e).get();
                        l1aVar2.getClass();
                        return new g4w0(l1aVar2);
                    case 3:
                        fhn fhnVar2 = (fhn) dbiVar.f5805a;
                        fhnVar2.getClass();
                        return new l1a(fhnVar2, (c1a) ((n5d0) dbiVar.d).get());
                    case 4:
                        m1a m1aVar2 = (m1a) cbiVar.f4062a.c;
                        x1x.y(m1aVar2);
                        fhn fhnVar3 = (fhn) dbiVar.f5805a;
                        fhnVar3.getClass();
                        try {
                            return zy9.b(m1aVar2.b(), fhnVar3.b);
                        } catch (cxk unused) {
                            if (!l8x.g0()) {
                                return null;
                            }
                            Log.e("CXCP", "Failed to inject camera metadata: Do Not Disturb mode is on.");
                            return null;
                        }
                    case 5:
                        return new ge10((c1a) ((n5d0) dbiVar.d).get(), (i7m0) ((n5d0) dbiVar.l).get(), (tpt0) ((n5d0) dbiVar.k).get(), (p7d) ((n5d0) dbiVar.m).get());
                    case 6:
                        l1a l1aVar3 = (l1a) ((n5d0) dbiVar.e).get();
                        i2a i2aVar = (i2a) ((n5d0) dbiVar.j).get();
                        i2aVar.getClass();
                        return new i7m0(l1aVar3, (mhk.a().b(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class) == null && !i2aVar.a().a(ImageCaptureFailWithAutoFlashQuirk.class)) ? ujn.w : lwf.c, (tpt0) ((n5d0) dbiVar.k).get());
                    case 7:
                        return new i2a((c1a) ((n5d0) dbiVar.d).get(), (erm0) ((n5d0) dbiVar.i).get());
                    case 8:
                        return new erm0((StreamConfigurationMap) ((n5d0) dbiVar.g).get(), (cf80) ((n5d0) dbiVar.h).get());
                    case 9:
                        c1a c1aVar = (c1a) ((n5d0) dbiVar.d).get();
                        if (c1aVar == null) {
                            return null;
                        }
                        CameraCharacteristics.Key key = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key.getClass();
                        return (StreamConfigurationMap) ((ow9) c1aVar).c(key);
                    case 10:
                        c1a c1aVar2 = (c1a) ((n5d0) dbiVar.d).get();
                        return new cf80(c1aVar2);
                    case 11:
                        fhn fhnVar4 = (fhn) dbiVar.f5805a;
                        fhnVar4.getClass();
                        q15 q15Var = (q15) cbiVar.f4062a.b;
                        x1x.y(q15Var);
                        Executor executor = q15Var.f27934a;
                        executor.getClass();
                        lne lneVarY = obb.Y(executor);
                        return new tpt0(d5c.a(kotlin.coroutines.e.c(qem0.e(), lneVarY).plus(new rne("CXCP-UseCase-" + fhnVar4.b))), executor, lneVarY);
                    case 12:
                        return new p7d();
                    case 13:
                        return new m9o((o9o) ((n5d0) dbiVar.o).get());
                    case 14:
                        return new o9o((l1a) ((n5d0) dbiVar.e).get(), (tpt0) ((n5d0) dbiVar.k).get(), (p7d) ((n5d0) dbiVar.m).get());
                    case 15:
                        l1a l1aVar4 = (l1a) ((n5d0) dbiVar.e).get();
                        i7m0 i7m0Var = (i7m0) ((n5d0) dbiVar.l).get();
                        tpt0 tpt0Var = (tpt0) ((n5d0) dbiVar.k).get();
                        dgr0 dgr0Var = (dgr0) ((n5d0) dbiVar.q).get();
                        i2a i2aVar2 = (i2a) ((n5d0) dbiVar.j).get();
                        i2aVar2.getClass();
                        ppt0Var = new vjq(l1aVar4, i7m0Var, tpt0Var, dgr0Var, i2aVar2.a().a(TorchFlashRequiredFor3aUpdateQuirk.class) ? rek0.g : lwf.w);
                        return ppt0Var;
                    case 16:
                        return new dgr0((l1a) ((n5d0) dbiVar.e).get(), (i7m0) ((n5d0) dbiVar.l).get(), (tpt0) ((n5d0) dbiVar.k).get());
                    case 17:
                        l1a l1aVar5 = (l1a) ((n5d0) dbiVar.e).get();
                        i2a i2aVar3 = (i2a) ((n5d0) dbiVar.j).get();
                        i2aVar3.getClass();
                        ppt0Var = new vpq(l1aVar5, i2aVar3.a().a(AfRegionFlipHorizontallyQuirk.class) ? m2a.t : rv00.w, (i7m0) ((n5d0) dbiVar.l).get(), (tpt0) ((n5d0) dbiVar.k).get(), dbiVar.C());
                        return ppt0Var;
                    case 18:
                        return new aqm0((vjq) ((n5d0) dbiVar.r).get(), (tpt0) ((n5d0) dbiVar.k).get());
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        return new ufu0();
                    case 20:
                        return new d4w0(dbiVar.C());
                    case 21:
                        cw9 cw9Var = (cw9) ((n5d0) dbiVar.w).get();
                        tpt0 tpt0Var2 = (tpt0) ((n5d0) dbiVar.k).get();
                        p7d p7dVar = (p7d) ((n5d0) dbiVar.m).get();
                        cw9Var.getClass();
                        tpt0Var2.getClass();
                        p7dVar.getClass();
                        return new bw9(cw9Var, tpt0Var2, p7dVar);
                    case 22:
                        return new cw9();
                    case 23:
                        return new r2a();
                    case 24:
                        l1a l1aVar6 = (l1a) ((n5d0) dbiVar.e).get();
                        fhn fhnVar5 = (fhn) dbiVar.f5805a;
                        fhnVar5.getClass();
                        ppt0Var = new l0a(l1aVar6, fhnVar5, (r2a) ((n5d0) dbiVar.y).get(), (sy9) ((n5d0) dbiVar.z).get(), (ux9) ((n5d0) dbiVar.A).get(), (vpq) ((n5d0) dbiVar.s).get(), (i2a) ((n5d0) dbiVar.j).get(), (ewn) ((n5d0) dbiVar.C).get(), (erm0) ((n5d0) dbiVar.i).get(), (jnx) ((n5d0) dbiVar.D).get(), (trm0) dbiVar.b);
                        return ppt0Var;
                    case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                        d4w0 d4w0Var = (d4w0) ((n5d0) dbiVar.v).get();
                        m9o m9oVar = (m9o) ((n5d0) dbiVar.p).get();
                        dgr0 dgr0Var2 = (dgr0) ((n5d0) dbiVar.q).get();
                        ge10 ge10Var2 = (ge10) ((n5d0) dbiVar.n).get();
                        d4w0Var.getClass();
                        m9oVar.getClass();
                        dgr0Var2.getClass();
                        ge10Var2.getClass();
                        return new sy9();
                    case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                        return new ux9();
                    case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                        String str = (String) ((n5d0) dbiVar.B).get();
                        i2a i2aVar4 = (i2a) ((n5d0) dbiVar.j).get();
                        str.getClass();
                        i2aVar4.getClass();
                        return new fwn(str, i2aVar4.a());
                    case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                        fhn fhnVar6 = (fhn) dbiVar.f5805a;
                        fhnVar6.getClass();
                        String str2 = fhnVar6.b;
                        x1x.y(str2);
                        return str2;
                    case AvailableCode.HMS_IS_SPOOF /* 29 */:
                        return new jnx(cbiVar.a());
                    case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                        ux9 ux9Var = (ux9) ((n5d0) dbiVar.A).get();
                        p7d p7dVar2 = (p7d) ((n5d0) dbiVar.m).get();
                        fhn fhnVar7 = (fhn) dbiVar.f5805a;
                        fhnVar7.getClass();
                        i2a i2aVar5 = (i2a) ((n5d0) dbiVar.j).get();
                        f4w0 f4w0Var2 = (f4w0) ((n5d0) dbiVar.f).get();
                        nwp0 nwp0VarA = dbiVar.A();
                        c1a c1aVar3 = (c1a) ((n5d0) dbiVar.d).get();
                        esg0 esg0Var3 = cbiVar.f4062a;
                        u0aVar = new yz9(ux9Var, p7dVar2, fhnVar7, i2aVar5, f4w0Var2, nwp0VarA, c1aVar3, (l4a) esg0Var3.f, (ehf0) esg0Var3.d);
                        return u0aVar;
                    case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                        return new oy9((l1a) ((n5d0) dbiVar.e).get(), (m9o) ((n5d0) dbiVar.p).get(), (vjq) ((n5d0) dbiVar.r).get(), (vpq) ((n5d0) dbiVar.s).get(), (aqm0) ((n5d0) dbiVar.t).get(), (dgr0) ((n5d0) dbiVar.q).get(), (ge10) ((n5d0) dbiVar.n).get(), (d4w0) ((n5d0) dbiVar.v).get(), (f4w0) ((n5d0) dbiVar.f).get(), (bw9) ((n5d0) dbiVar.x).get(), (ppt0) ((n5d0) dbiVar.G).get(), (tpt0) ((n5d0) dbiVar.k).get(), (ufu0) ((n5d0) dbiVar.u).get());
                    default:
                        c99.h(b3);
                        return null;
                }
            case 3:
                hbi hbiVar = (hbi) obj2;
                o3c o3cVar = (o3c) obj;
                esg0 esg0Var4 = (esg0) o3cVar.f24576a;
                switch (b3) {
                    case 0:
                        vne vneVar = (vne) ((n5d0) o3cVar.c).get();
                        qcq0 qcq0Var = (qcq0) ((n5d0) hbiVar.f).get();
                        bsm0 bsm0Var = (bsm0) ((n5d0) hbiVar.o).get();
                        tz9 tz9Var = (tz9) esg0Var4.b;
                        iev ievVar = (iev) esg0Var4.c;
                        dmn0 dmn0Var = (dmn0) esg0Var4.e;
                        qw9 qw9Var = (qw9) ((n5d0) o3cVar.d).get();
                        m9a m9aVar = (m9a) ((n5d0) o3cVar.j).get();
                        hbi hbiVar2 = (hbi) o3cVar.b;
                        return new iw9(vneVar, qcq0Var, bsm0Var, tz9Var, ievVar, dmn0Var, qw9Var, m9aVar, new w5z((qcq0) ((n5d0) hbiVar2.f).get(), (tz9) esg0Var4.b, (lrm0) esg0Var4.d, (jx9) ((n5d0) hbiVar2.p).get(), (bsm0) ((n5d0) hbiVar2.o).get()), (k7d0) ((n5d0) hbiVar.u).get(), (j3a) ((n5d0) hbiVar.y).get(), (jx9) ((n5d0) hbiVar.p).get(), (cao0) ((n5d0) hbiVar.m).get(), (zz9) esg0Var4.f8326a, (wv9) esg0Var4.f, (lrm0) esg0Var4.d, (uqd) ((n5d0) hbiVar.z).get());
                    case 1:
                        qcq0 qcq0Var2 = (qcq0) ((n5d0) hbiVar.f).get();
                        bby bbyVar = (bby) ((n5d0) hbiVar.f12771a).get();
                        qcq0Var2.getClass();
                        bbyVar.getClass();
                        return d5c.a(kotlin.coroutines.e.c(new kin0(bbyVar), kotlin.coroutines.e.c(qcq0Var2.h, new rne("CXCP-Camera2Controller"))));
                    case 2:
                        n5d0 n5d0Var3 = (n5d0) hbiVar.g;
                        qcq0 qcq0Var3 = (qcq0) ((n5d0) hbiVar.f).get();
                        tz9 tz9Var2 = (tz9) esg0Var4.b;
                        bby bbyVar2 = (bby) ((n5d0) hbiVar.f12771a).get();
                        n5d0Var3.getClass();
                        qcq0Var3.getClass();
                        bbyVar2.getClass();
                        return new qw9(n5d0Var3, qcq0Var3, tz9Var2.f34794a, bbyVar2);
                    case 3:
                        c7i c7iVar = (c7i) o3cVar.e;
                        c7i c7iVar2 = (c7i) o3cVar.f;
                        c7i c7iVar3 = (c7i) o3cVar.g;
                        c7i c7iVar4 = (c7i) o3cVar.h;
                        c7i c7iVar5 = (c7i) o3cVar.i;
                        tz9 tz9Var3 = (tz9) esg0Var4.b;
                        c7iVar.getClass();
                        c7iVar2.getClass();
                        c7iVar3.getClass();
                        c7iVar4.getClass();
                        c7iVar5.getClass();
                        int i = tz9Var3.h;
                        if (i != 2) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                return (m9a) c7iVar4.get();
                            }
                            return i == 1 ? (m9a) c7iVar2.get() : (m9a) c7iVar3.get();
                        }
                        if (Build.VERSION.SDK_INT >= 31) {
                            return (m9a) c7iVar5.get();
                        }
                        jf4.n("Cannot use Extension sessions below Android S");
                        return null;
                    case 4:
                        return new j03((qcq0) ((n5d0) hbiVar.f).get(), (lrm0) esg0Var4.d, (tz9) esg0Var4.b, (byte) 0);
                    case 5:
                        return new i03((lrm0) esg0Var4.d, (qcq0) ((n5d0) hbiVar.f).get());
                    case 6:
                        return new j03((qcq0) ((n5d0) hbiVar.f).get(), (lrm0) esg0Var4.d, (tz9) esg0Var4.b, (byte) 1);
                    case 7:
                        return new q03((qcq0) ((n5d0) hbiVar.f).get(), (tz9) esg0Var4.b, (lrm0) esg0Var4.d);
                    case 8:
                        return new cz2((qcq0) ((n5d0) hbiVar.f).get(), (tz9) esg0Var4.b, (lrm0) esg0Var4.d, (ix9) ((n5d0) hbiVar.n).get(), (bsm0) ((n5d0) hbiVar.o).get());
                    default:
                        c99.h(b3);
                        return null;
                }
            case 4:
                return a();
            case 5:
                return b();
            case 6:
                return c();
            case 7:
                return d();
            case 8:
                return e();
            case 9:
                return f();
            case 10:
                return g();
            case 11:
                return h();
            case 12:
                return i();
            case 13:
                return j();
            case 14:
                return k();
            case 15:
                return l();
            case 16:
                return m();
            case 17:
                return n();
            default:
                if (b3 == 0) {
                    return new gki(this, b4);
                }
                if (b3 == 1) {
                    return new hki(this, b4);
                }
                if (b3 == 2) {
                    return new iki(this, b4);
                }
                if (b3 == 3) {
                    return new jki(this, b4);
                }
                c99.h(b3);
                return null;
        }
    }
}
