package a;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class dbi {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5805a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public dbi(cbi cbiVar, fhn fhnVar, trm0 trm0Var) {
        this.c = cbiVar;
        this.f5805a = fhnVar;
        this.b = trm0Var;
        this.d = i8i.e(cbiVar, this, 4);
        this.e = i8i.e(cbiVar, this, 3);
        this.f = i8i.e(cbiVar, this, 2);
        this.g = i8i.e(cbiVar, this, 9);
        this.h = i8i.e(cbiVar, this, 10);
        this.i = i8i.e(cbiVar, this, 8);
        this.j = i8i.e(cbiVar, this, 7);
        this.k = i8i.e(cbiVar, this, 11);
        this.l = i8i.e(cbiVar, this, 6);
        this.m = i8i.e(cbiVar, this, 12);
        this.n = i8i.e(cbiVar, this, 5);
        this.o = i8i.e(cbiVar, this, 14);
        this.p = i8i.e(cbiVar, this, 13);
        this.q = i8i.e(cbiVar, this, 16);
        this.r = i8i.e(cbiVar, this, 15);
        this.s = i8i.e(cbiVar, this, 17);
        this.t = i8i.e(cbiVar, this, 18);
        this.u = i8i.e(cbiVar, this, 19);
        this.v = i8i.e(cbiVar, this, 20);
        this.w = i8i.e(cbiVar, this, 22);
        this.x = i8i.e(cbiVar, this, 21);
        this.y = i8i.e(cbiVar, this, 23);
        this.I = new w1k();
        this.z = i8i.e(cbiVar, this, 25);
        this.A = i8i.e(cbiVar, this, 26);
        this.B = i8i.e(cbiVar, this, 28);
        this.C = i8i.e(cbiVar, this, 27);
        this.D = i8i.e(cbiVar, this, 29);
        this.E = i8i.e(cbiVar, this, 24);
        this.F = i8i.e(cbiVar, this, 30);
        this.G = i8i.e(cbiVar, this, 1);
        this.H = i8i.e(cbiVar, this, 31);
        w1k.a((w1k) this.I, mbl.b(new c7i(cbiVar, this, 0, (byte) 2)));
    }

    public nwp0 A() {
        i2a i2aVar = (i2a) ((n5d0) this.j).get();
        i2aVar.getClass();
        kpd0 kpd0VarA = i2aVar.a();
        kpd0VarA.getClass();
        Iterator it = kpd0VarA.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                return new soq(kpd0VarA);
            }
        }
        if (!kpd0VarA.a(ImageCaptureFailedForVideoSnapshotQuirk.class)) {
            return m2a.w;
        }
        return new soq(kpd0VarA);
    }

    public hcp0 B() {
        m0o0 m0o0VarZ = ((qv2) ((a1d) this.j).b).z();
        phf0 phf0VarI = i();
        m1e m1eVar = (m1e) this.u;
        m1eVar.getClass();
        es esVar = new es();
        esVar.f8305a = m0o0VarZ;
        esVar.b = phf0VarI;
        esVar.c = m1eVar;
        return new hcp0((Object) esVar, (Object) x(), (byte) 7);
    }

    public b4w0 C() {
        Range range;
        Float f;
        l1a l1aVar = (l1a) ((n5d0) this.e).get();
        l1aVar.getClass();
        c1a c1aVar = l1aVar.b;
        if ("robolectric".equals(Build.FINGERPRINT)) {
            List<CameraCharacteristics.Key> list = wx50.b;
            if (list == null || !list.isEmpty()) {
                for (CameraCharacteristics.Key key : list) {
                    if (l8x.j0()) {
                        Log.w("CXCP", "Failed to read " + key + " for zoom features.");
                    }
                    key.getClass();
                    if (((ow9) c1aVar).c(key) == null) {
                        return new wx50(l1aVar);
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Float fValueOf = Float.valueOf(1.0f);
            c1aVar.getClass();
            try {
                CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
                key2.getClass();
                ow9 ow9Var = (ow9) c1aVar;
                Range range2 = (Range) ow9Var.c(key2);
                if (range2 == null) {
                    if (l8x.j0()) {
                        Log.w("CXCP", "Failed to read CONTROL_ZOOM_RATIO_RANGE for " + ((Object) g0a.b(ow9Var.f25959a)) + '!');
                    }
                    range = new Range(fValueOf, fValueOf);
                } else {
                    Object lower = range2.getLower();
                    lower.getClass();
                    float fFloatValue = ((Number) lower).floatValue();
                    if (Math.abs(fFloatValue) >= ((double) Math.ulp(Math.abs(fFloatValue))) * 2.0d && ((Number) range2.getLower()).floatValue() >= 0.0f) {
                        f = (Float) range2.getLower();
                    } else {
                        if (l8x.j0()) {
                            Log.w("CXCP", "Invalid lower zoom range detected: " + range2.getLower());
                        }
                        f = fValueOf;
                    }
                    Object upper = range2.getUpper();
                    upper.getClass();
                    float fFloatValue2 = ((Number) upper).floatValue();
                    if (Math.abs(fFloatValue2) >= ((double) Math.ulp(Math.abs(fFloatValue2))) * 2.0d && ((Number) range2.getUpper()).floatValue() >= 0.0f) {
                        fValueOf = (Float) range2.getUpper();
                    } else if (l8x.j0()) {
                        Log.w("CXCP", "Invalid upper zoom range detected: " + range2.getUpper());
                    }
                    range = new Range(f, fValueOf);
                }
            } catch (AssertionError e) {
                if (mhk.a().b(ControlZoomRatioRangeAssertionErrorQuirk.class) != null) {
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "Device is known to throw an exception while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE. CONTROL_ZOOM_RATIO_RANGE is not supported. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                    }
                } else if (l8x.g0()) {
                    Log.e("CXCP", "Exception thrown while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE on devices not known to throw exceptions during this operation. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. CONTROL_ZOOM_RATIO_RANGE is not available.", e);
                }
                if (l8x.j0()) {
                    Log.w("CXCP", "AssertionError: failed to get CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE", e);
                }
                range = null;
            }
            if (range != null) {
                return new xex(l1aVar, range);
            }
        }
        return new khf0(l1aVar);
    }

    public do20 a() {
        return new do20(q());
    }

    public ls b() {
        return new ls(q());
    }

    public vqc c() {
        return new vqc((u0f) this.m);
    }

    public cad d() {
        return new cad((Object) q(), (byte) 13);
    }

    public bwl e() {
        return new bwl((aln) this.q);
    }

    public es f() {
        return new es((sln) this.e, new ocl((gii0) this.f, (byte) 2), (btt0) this.g);
    }

    public lrc g() {
        return new lrc((jnn) this.r);
    }

    public khf0 h() {
        return new khf0(new a1d((gii0) this.f5805a, (byte) 23), (abp) this.b, (btt0) this.c);
    }

    public phf0 i() {
        uyn uynVar = new uyn((gii0) this.f5805a, (byte) 3);
        abp abpVar = (abp) this.b;
        btt0 btt0Var = (btt0) this.c;
        abpVar.getClass();
        btt0Var.getClass();
        phf0 phf0Var = new phf0();
        phf0Var.f26994a = uynVar;
        phf0Var.b = abpVar;
        phf0Var.c = btt0Var;
        return phf0Var;
    }

    public fvt0 j() {
        return new fvt0(new nr(((qv2) ((a1d) this.j).b).z(), h(), (m1e) this.u));
    }

    public ali k() {
        return new ali(((cih) ((vqc) this.d).b).a(), new ort((gst0) this.e, (byte) 3), (wdu) this.f, ((gbi) ((lsn) this.g).f20589a).k());
    }

    public f7u l() {
        return new f7u((gst0) this.e, ((cih) ((vqc) this.d).b).a(), (wdu) this.f, ((gbi) ((lsn) this.g).f20589a).k());
    }

    public nv20 m() {
        return new nv20(new khf0(((qv2) ((a1d) this.j).b).z(), h(), (m1e) this.u));
    }

    public g2g0 n() {
        oeg0 oeg0Var = (oeg0) this.B;
        qv2 qv2Var = (qv2) ((a1d) this.j).b;
        ivn ivnVarG = qv2Var.g();
        pru pruVar = (pru) this.n;
        lhf0 lhf0Var = new lhf0(qv2Var.z(), qv2Var.f(), (m1e) qv2Var.i);
        gr00 gr00VarS = ((gr00) ((rrc) this.C).b).s();
        daf dafVar = (daf) ((roi0) this.D).f30839a;
        return new g2g0(oeg0Var, ivnVarG, pruVar, lhf0Var, gr00VarS, dafVar.Z(), (kys0) this.E, (bn6) this.F, (je) this.G, dafVar.t());
    }

    public jw20 o() {
        return new jw20((wdk0) this.H);
    }

    public rtu p() {
        return new rtu(new rou((b3c0) this.h, (byte) 0), new x4v((gst0) this.e, (byte) 0));
    }

    public svu q() {
        return new svu((rrc) this.v);
    }

    public pwi r() {
        rtu rtuVarP = p();
        ieu ieuVar = (ieu) this.i;
        uzc uzcVarA = ((cih) ((vqc) this.d).b).a();
        qv2 qv2Var = (qv2) ((a1d) this.j).b;
        return new pwi(rtuVarP, ieuVar, uzcVarA, qv2Var.o(), (e1u) this.k, ((gbi) ((lsn) this.g).f20589a).k(), new s4v((gst0) this.e, (byte) 1), (viu) this.l, ((xzp) ((epi0) this.m).b).C(), qv2Var.n(), (pru) this.n);
    }

    public tzi s() {
        rtu rtuVarP = p();
        ieu ieuVar = (ieu) this.i;
        uzc uzcVarA = ((cih) ((vqc) this.d).b).a();
        qv2 qv2Var = (qv2) ((a1d) this.j).b;
        return new tzi(rtuVarP, ieuVar, uzcVarA, qv2Var.o(), (w8u) this.r, ((gbi) ((lsn) this.g).f20589a).k(), new wsc((gst0) this.e, (byte) 5), ((xzp) ((epi0) this.m).b).C(), qv2Var.n(), (pru) this.n);
    }

    public w5z t() {
        rtu rtuVarP = p();
        ieu ieuVar = (ieu) this.i;
        cih cihVar = (cih) ((vqc) this.d).b;
        k7u k7uVarC = cihVar.c();
        qv2 qv2Var = (qv2) ((a1d) this.j).b;
        rpt rptVarO = qv2Var.o();
        x4u x4uVar = (x4u) this.s;
        w8u w8uVar = (w8u) this.p;
        rpt rptVar = (rpt) this.q;
        i9u i9uVarP = qv2Var.p();
        gbi gbiVar = (gbi) ((lsn) this.g).f20589a;
        v7i v7iVarK = gbiVar.k();
        gst0 gst0Var = (gst0) this.e;
        wsc wscVar = new wsc(gst0Var, (byte) 5);
        xzp xzpVar = (xzp) ((epi0) this.m).b;
        r9u r9uVarC = xzpVar.C();
        j9u j9uVarN = qv2Var.n();
        pru pruVar = (pru) this.n;
        return new w5z(new qv2(rtuVarP, ieuVar, k7uVarC, rptVarO, x4uVar, w8uVar, rptVar, i9uVarP, v7iVarK, wscVar, r9uVarC, j9uVarN, pruVar), new nc0(p(), ieuVar, cihVar.c(), qv2Var.o(), (n4u) this.o, w8uVar, rptVar, qv2Var.p(), gbiVar.k(), new s4v(gst0Var, (byte) 1), (viu) this.l, xzpVar.C(), qv2Var.n(), pruVar), new pzu(new f4u(qv2Var.f(), (byte) 8), new a7q(qv2Var.f()), qv2Var.p(), qv2Var.o(), rptVar, (pmi) this.t), rptVar, qv2Var.p());
    }

    public kd30 u() {
        return new kd30((rrd) this.z, (xzp) this.A);
    }

    public ehf0 v() {
        return new ehf0(i(), ((qv2) ((a1d) this.j).b).z(), (byte) 0);
    }

    public nhf0 w() {
        qv2 qv2Var = (qv2) ((a1d) this.j).b;
        return new nhf0(new c5k(qv2Var.f(), qv2Var.z()), (pru) this.n, (zoc) this.I, qv2Var.z());
    }

    public phf0 x() {
        phf0 phf0VarI = i();
        m0o0 m0o0VarZ = ((qv2) ((a1d) this.j).b).z();
        m1e m1eVar = (m1e) this.u;
        m1eVar.getClass();
        phf0 phf0Var = new phf0();
        phf0Var.f26994a = phf0VarI;
        phf0Var.b = m0o0VarZ;
        phf0Var.c = m1eVar;
        return phf0Var;
    }

    public ls y() {
        return new ls(q());
    }

    public yzn0 z() {
        return new yzn0(((qv2) ((a1d) this.j).b).z(), new ort((gst0) this.e, (byte) 3));
    }

    public dbi(a1d a1dVar, lsn lsnVar, epi0 epi0Var, wdd0 wdd0Var, rrc rrcVar, roi0 roi0Var, vqc vqcVar, us00 us00Var, w8u w8uVar, x4u x4uVar, e1u e1uVar, n4u n4uVar, w8u w8uVar2, rpt rptVar, m1e m1eVar, hru hruVar, btt0 btt0Var, gii0 gii0Var, b3c0 b3c0Var, gst0 gst0Var, abp abpVar, rrc rrcVar2, wdu wduVar, ieu ieuVar, pmi pmiVar, pru pruVar, rrd rrdVar, xzp xzpVar, wdk0 wdk0Var, oeg0 oeg0Var, zoc zocVar, bn6 bn6Var, je jeVar, viu viuVar, kys0 kys0Var) {
        this.f5805a = gii0Var;
        this.b = abpVar;
        this.c = btt0Var;
        this.d = vqcVar;
        this.e = gst0Var;
        this.f = wduVar;
        this.g = lsnVar;
        this.h = b3c0Var;
        this.i = ieuVar;
        this.j = a1dVar;
        this.k = e1uVar;
        this.l = viuVar;
        this.m = epi0Var;
        this.n = pruVar;
        this.o = n4uVar;
        this.p = w8uVar2;
        this.q = rptVar;
        this.r = w8uVar;
        this.s = x4uVar;
        this.t = pmiVar;
        this.u = m1eVar;
        this.v = rrcVar2;
        this.w = us00Var;
        this.x = wdd0Var;
        this.y = hruVar;
        this.z = rrdVar;
        this.A = xzpVar;
        this.B = oeg0Var;
        this.C = rrcVar;
        this.D = roi0Var;
        this.E = kys0Var;
        this.F = bn6Var;
        this.G = jeVar;
        this.H = wdk0Var;
        this.I = zocVar;
    }

    public dbi(cad cadVar, iw20 iw20Var, drm0 drm0Var, vqc vqcVar, wsf0 wsf0Var, d1p d1pVar, sue sueVar, o2j0 o2j0Var, bzu bzuVar, epi0 epi0Var, ii iiVar, Long l, gii0 gii0Var, m1e m1eVar, i1w0 i1w0Var, btt0 btt0Var, sln slnVar, xkn xknVar, u0f u0fVar, gst0 gst0Var, kt2 kt2Var, ctf0 ctf0Var, ouu ouuVar, edo edoVar, b3c0 b3c0Var, wdk0 wdk0Var, duj dujVar, j1q0 j1q0Var, b8u b8uVar, x0u x0uVar, fsd fsdVar, aln alnVar, rpt rptVar, jnn jnnVar, qp qpVar, mii0 mii0Var) {
        this.f5805a = l;
        this.b = i1w0Var;
        this.c = ouuVar;
        this.d = m1eVar;
        this.e = slnVar;
        this.f = gii0Var;
        this.g = btt0Var;
        this.h = edoVar;
        this.i = j1q0Var;
        this.j = b8uVar;
        this.k = iw20Var;
        this.l = vqcVar;
        this.m = u0fVar;
        this.n = cadVar;
        this.o = kt2Var;
        this.p = d1pVar;
        this.q = alnVar;
        this.r = jnnVar;
        this.s = ctf0Var;
        this.t = dujVar;
        this.u = drm0Var;
        this.v = sueVar;
        this.w = gst0Var;
        this.x = epi0Var;
        this.y = fsdVar;
        this.z = xknVar;
        this.A = o2j0Var;
        this.B = wsf0Var;
        this.C = x0uVar;
        this.D = b3c0Var;
        this.E = bzuVar;
        this.F = rptVar;
        this.G = qpVar;
        this.H = mii0Var;
        this.I = new yei(this, (byte) 17);
    }
}
