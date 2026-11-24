package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ru {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f31100a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public void a(String str, String str2) {
        HashMap map = (HashMap) this.f;
        if (map != null) {
            map.put(str, str2);
        } else {
            jf4.n("Property \"autoMetadata\" has not been set");
        }
    }

    public q35 b() {
        String strConcat = ((String) this.f31100a) == null ? " transportName" : "";
        if (((zvn) this.c) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.e) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new q35((String) this.f31100a, (Integer) this.b, (zvn) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f, (Integer) this.g, (String) this.h, (byte[]) this.i, (byte[]) this.j);
        }
        jf4.n("Missing required properties:".concat(strConcat));
        return null;
    }

    public LinkedHashSet c(List list) throws nbx {
        String strL0;
        n0o0 n0o0Var = (n0o0) this.g;
        cbi cbiVar = (cbi) n0o0Var.getValue();
        n2a n2aVar = (n2a) this.b;
        List<String> listL0 = CollectionsKt.L0(list);
        trm0 trm0Var = (trm0) this.c;
        cbiVar.getClass();
        listL0.getClass();
        try {
            ArrayList arrayList = new ArrayList();
            zy9 zy9VarA = cbiVar.a();
            if (n2aVar != null) {
                try {
                    strL0 = kc5.L0(zy9VarA, n2aVar.b());
                } catch (IllegalStateException e) {
                    if (l8x.f0("CXCP")) {
                        Log.d("CXCP", "Unable to get Metadata for cameraID 0 and/or 1", e);
                    }
                    strL0 = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : listL0) {
                    if (!Intrinsics.d(str, strL0)) {
                        cbi cbiVar2 = cbiVar.b;
                        g0a.a(str);
                        n0a n0aVarH = ((s0a) ((w1k) new dbi(cbiVar2, new fhn(str, (byte) 3), trm0Var).I).get()).h();
                        n0aVarH.getClass();
                        arrayList2.add(n0aVarH);
                    }
                }
                for (j0a j0aVar : n2aVar.a(arrayList2)) {
                    j0aVar.getClass();
                    String strE = ((n0a) j0aVar).e();
                    strE.getClass();
                    arrayList.add(strE);
                }
                listL0 = arrayList;
            }
            zy9 zy9VarA2 = ((cbi) n0o0Var.getValue()).a();
            ArrayList arrayList3 = new ArrayList();
            for (String str2 : listL0) {
                if (Intrinsics.d(str2, "0") || Intrinsics.d(str2, "1")) {
                    arrayList3.add(str2);
                } else if (wb.J(zy9VarA2, str2)) {
                    arrayList3.add(str2);
                } else if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "Camera " + str2 + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
                }
            }
            return new LinkedHashSet(arrayList3);
        } catch (IllegalStateException e2) {
            if (l8x.g0()) {
                Log.e("CXCP", "Error while accessing info about cameras.", e2);
            }
            throw new nbx(e2);
        }
    }

    public Set d() {
        synchronized (this.i) {
            if (((AtomicBoolean) this.j).get()) {
                return xun.f41520a;
            }
            return new LinkedHashSet((Set) this.h);
        }
    }

    public s0a e(String str) throws l3a {
        str.getClass();
        if (((AtomicBoolean) this.j).get()) {
            throw new l3a("CameraFactory has been shut down.");
        }
        cbi cbiVar = ((cbi) ((n0o0) this.g).getValue()).b;
        g0a.a(str);
        return (s0a) ((w1k) new dbi(cbiVar, new fhn(str, (byte) 3), (trm0) this.c).I).get();
    }

    public rdd f() {
        return new rdd(u());
    }

    public pv00 g() {
        return new pv00(u());
    }

    public rdd h() {
        return new rdd(u());
    }

    public ggu i() {
        return new ggu(u());
    }

    public tjb0 j() {
        z8i z8iVar = (z8i) this.f31100a;
        kt2 kt2Var = (kt2) z8iVar.d;
        x1x.y(kt2Var);
        u58 u58Var = new u58(kt2Var, (byte) 5);
        kt2 kt2Var2 = (kt2) z8iVar.d;
        x1x.y(kt2Var2);
        zg zgVar = new zg(kt2Var2, (byte) 11);
        dbi dbiVar = (dbi) ((bwl) this.b).f3330a;
        nv20 nv20VarM = dbiVar.m();
        fvt0 fvt0VarJ = dbiVar.j();
        iip iipVar = (iip) this.c;
        vjp vjpVarS = iipVar.S();
        x1x.x(vjpVarS);
        oeg0 oeg0Var = (oeg0) z8iVar.c;
        x1x.y(oeg0Var);
        ivn ivnVarG = ((qv2) ((a1d) this.d).b).g();
        ctf0 ctf0Var = z8iVar.h;
        x1x.y(ctf0Var);
        qv2 qv2Var = (qv2) z8iVar.k;
        gg5 gg5Var = (gg5) z8iVar.q;
        eke0 eke0VarP = iipVar.p();
        y3v y3vVar = (y3v) z8iVar.F;
        gst0 gst0Var = (gst0) z8iVar.i;
        x1x.y(gst0Var);
        kt2 kt2Var3 = (kt2) z8iVar.d;
        x1x.y(kt2Var3);
        knf0 knf0Var = (knf0) z8iVar.D;
        x1x.y(knf0Var);
        bn6 bn6Var = new bn6(gst0Var, kt2Var3, knf0Var, (peg0) z8iVar.A, (byte) 1);
        je jeVar = (je) z8iVar.z;
        vqc vqcVar = (vqc) z8iVar.t;
        h3c h3cVar = (h3c) z8iVar.y;
        r9u r9uVar = (r9u) z8iVar.I;
        x1x.y(r9uVar);
        rrc rrcVar = new rrc(new r46(r9uVar, (byte) 2), (byte) 29);
        x1x.y(kt2Var3);
        return new tjb0(u58Var, zgVar, nv20VarM, fvt0VarJ, vjpVarS, oeg0Var, ivnVarG, ctf0Var, qv2Var, gg5Var, eke0VarP, y3vVar, bn6Var, jeVar, vqcVar, h3cVar, rrcVar, new yo4(kt2Var3, (byte) 8), (zr1) z8iVar.w);
    }

    public reu k() {
        b3c0 b3c0Var = ((z8i) this.f31100a).u;
        x1x.y(b3c0Var);
        return new reu(b3c0Var);
    }

    public yuu l() {
        sjl0 sjl0Var = (sjl0) ((z8i) this.f31100a).r;
        x1x.y(sjl0Var);
        iip iipVar = (iip) this.c;
        return new yuu(sjl0Var, iipVar.H(), iipVar.M());
    }

    public nvu m() {
        w5z w5zVarW = w();
        a1d a1dVar = (a1d) this.d;
        m0o0 m0o0VarZ = ((qv2) a1dVar.b).z();
        z8i z8iVar = (z8i) this.f31100a;
        b3c0 b3c0Var = z8iVar.u;
        x1x.y(b3c0Var);
        gst0 gst0Var = (gst0) z8iVar.i;
        x1x.y(gst0Var);
        uzc uzcVar = (uzc) z8iVar.g;
        x1x.y(uzcVar);
        a6u a6uVar = new a6u(w5zVarW, m0o0VarZ, b3c0Var, gst0Var, uzcVar);
        pru pruVar = z8iVar.o;
        h9c h9cVarF = ((sue) this.g).f();
        x1x.x(h9cVarF);
        qj9 qj9VarS = ((xzp) ((clc) this.h).b).s();
        x1x.x(qj9VarS);
        pj9 pj9Var = new pj9(qj9VarS);
        z8u z8uVarE = a1dVar.e();
        peg0 peg0Var = (peg0) z8iVar.A;
        dj9 dj9Var = new dj9((nvu) z8iVar.v);
        edo edoVar = (edo) z8iVar.f;
        x1x.y(edoVar);
        e1u e1uVar = new e1u(edoVar);
        bbw0 bbw0Var = new bbw0((ulk) z8iVar.C);
        zfo zfoVar = (zfo) z8iVar.e;
        x1x.y(zfoVar);
        cmt cmtVar = new cmt(zfoVar);
        gbi gbiVar = (gbi) ((lsn) this.f).f20589a;
        x7u x7uVarJ = gbiVar.j();
        x1x.x(x7uVarJ);
        upc upcVarF = gbiVar.f();
        x1x.x(upcVarF);
        nyg0 nyg0VarI = gbiVar.I();
        x1x.x(nyg0VarI);
        kou kouVarP = gbiVar.p();
        x1x.x(kouVarP);
        wsc wscVar = new wsc(gst0Var, (byte) 1);
        gyg0 gyg0VarH = gbiVar.H();
        x1x.x(gyg0VarH);
        j1q0 j1q0Var = (j1q0) z8iVar.E;
        x1x.y(j1q0Var);
        return new nvu(a6uVar, pruVar, new mci(h9cVarF, pj9Var, z8uVarE, peg0Var, dj9Var, e1uVar, bbw0Var, cmtVar, x7uVarJ, upcVarF, nyg0VarI, kouVarP, wscVar, gyg0VarH, j1q0Var, pruVar), (byte) 1);
    }

    public ywq0 n() {
        w5z w5zVarX = x();
        z8i z8iVar = (z8i) this.f31100a;
        uzc uzcVar = (uzc) z8iVar.g;
        x1x.y(uzcVar);
        b3c0 b3c0Var = z8iVar.u;
        x1x.y(b3c0Var);
        gst0 gst0Var = (gst0) z8iVar.i;
        x1x.y(gst0Var);
        v7i v7iVarK = ((gbi) ((lsn) this.f).f20589a).k();
        gst0 gst0Var2 = (gst0) z8iVar.i;
        x1x.y(gst0Var2);
        wsc wscVar = new wsc(gst0Var2, (byte) 4);
        yqc yqcVar = new yqc(x(), (byte) 0);
        uzcVar.getClass();
        b3c0Var.getClass();
        gst0Var.getClass();
        ywq0 ywq0Var = new ywq0();
        ywq0Var.f43384a = w5zVarX;
        ywq0Var.b = uzcVar;
        ywq0Var.c = b3c0Var;
        ywq0Var.d = gst0Var;
        ywq0Var.e = v7iVarK;
        ywq0Var.f = wscVar;
        ywq0Var.g = yqcVar;
        return ywq0Var;
    }

    public qgd o() {
        w5z w5zVarX = x();
        z8i z8iVar = (z8i) this.f31100a;
        uzc uzcVar = (uzc) z8iVar.g;
        x1x.y(uzcVar);
        b3c0 b3c0Var = z8iVar.u;
        x1x.y(b3c0Var);
        gst0 gst0Var = (gst0) z8iVar.i;
        x1x.y(gst0Var);
        v7i v7iVarK = ((gbi) ((lsn) this.f).f20589a).k();
        gst0 gst0Var2 = (gst0) z8iVar.i;
        x1x.y(gst0Var2);
        return new qgd(w5zVarX, uzcVar, b3c0Var, gst0Var, v7iVarK, new t4v(gst0Var2, (byte) 1), new yqc(x(), (byte) 0));
    }

    public wdu p() {
        kvt kvtVar = new kvt(x());
        z8i z8iVar = (z8i) this.f31100a;
        uzc uzcVar = (uzc) z8iVar.g;
        x1x.y(uzcVar);
        azt aztVar = new azt(uzcVar, (byte) 0);
        v7i v7iVarK = ((gbi) ((lsn) this.f).f20589a).k();
        ivn ivnVar = new ivn(x());
        gst0 gst0Var = (gst0) z8iVar.i;
        x1x.y(gst0Var);
        return new wdu(kvtVar, aztVar, v7iVarK, ivnVar, new wsc(gst0Var, (byte) 4), new yqc(x(), (byte) 0), z8iVar.o, (viu) z8iVar.G, k());
    }

    public rrd q() {
        hru hruVar = new hru(x());
        z8i z8iVar = (z8i) this.f31100a;
        uzc uzcVar = (uzc) z8iVar.g;
        x1x.y(uzcVar);
        azt aztVar = new azt(uzcVar, (byte) 0);
        v7i v7iVarK = ((gbi) ((lsn) this.f).f20589a).k();
        ivn ivnVar = new ivn(x());
        gst0 gst0Var = (gst0) z8iVar.i;
        x1x.y(gst0Var);
        return new rrd((Object) hruVar, (Object) aztVar, (Object) v7iVarK, (Object) ivnVar, (Object) new t4v(gst0Var, (byte) 1), (Object) new yqc(x(), (byte) 0), (Object) z8iVar.o, (Object) k(), (byte) 19);
    }

    public f7u r() {
        z8i z8iVar = (z8i) this.f31100a;
        gii0 gii0Var = (gii0) z8iVar.J;
        x1x.y(gii0Var);
        hru hruVar = new hru(gii0Var, (byte) 16);
        lxv lxvVar = (lxv) z8iVar.H;
        x1x.y(lxvVar);
        knf0 knf0Var = (knf0) z8iVar.D;
        x1x.y(knf0Var);
        return new f7u(hruVar, lxvVar, knf0Var, (kuy) this.j);
    }

    public pzu s() {
        return new pzu(new abu((gii0) this.f31100a, (byte) 25), (dzz) this.c, (xio) this.d, (czz) this.f, (btt0) this.g, (knf0) this.h);
    }

    public void t(List list) throws nbx {
        list.getClass();
        if (((AtomicBoolean) this.j).get()) {
            return;
        }
        LinkedHashSet linkedHashSetC = c(list);
        synchronized (this.i) {
            try {
                if (((AtomicBoolean) this.j).get()) {
                    return;
                }
                if (Intrinsics.d((Set) this.h, linkedHashSetC)) {
                    return;
                }
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "Updated available camera list: " + ((Set) this.h) + " -> " + linkedHashSetC);
                }
                this.h = linkedHashSetC;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public nv20 u() {
        tj60 tj60Var = (tj60) ((z8i) this.f31100a).x;
        x1x.y(tj60Var);
        return new nv20(tj60Var);
    }

    public ugf0 v() {
        return new ugf0((tnm0) this.c);
    }

    public w5z w() {
        z8i z8iVar = (z8i) this.f31100a;
        gii0 gii0Var = (gii0) z8iVar.J;
        x1x.y(gii0Var);
        ok50 ok50Var = new ok50(gii0Var, (byte) 24);
        x1x.y(gii0Var);
        yk50 yk50Var = new yk50(gii0Var, (byte) 19);
        gzq0 gzq0Var = (gzq0) z8iVar.n;
        x1x.y(gzq0Var);
        knf0 knf0Var = (knf0) z8iVar.D;
        x1x.y(knf0Var);
        sjl0 sjl0Var = (sjl0) z8iVar.r;
        x1x.y(sjl0Var);
        return new w5z(ok50Var, yk50Var, gzq0Var, knf0Var, sjl0Var);
    }

    public w5z x() {
        z8i z8iVar = (z8i) this.f31100a;
        gii0 gii0Var = (gii0) z8iVar.J;
        x1x.y(gii0Var);
        epi0 epi0Var = new epi0(gii0Var, (byte) 19);
        x1x.y(gii0Var);
        ilp0 ilp0Var = new ilp0(gii0Var, (byte) 2);
        j8r0 j8r0Var = (j8r0) z8iVar.m;
        x1x.y(j8r0Var);
        knf0 knf0Var = (knf0) z8iVar.D;
        x1x.y(knf0Var);
        rrt0 rrt0Var = (rrt0) z8iVar.l;
        x1x.y(rrt0Var);
        return new w5z(epi0Var, ilp0Var, j8r0Var, knf0Var, rrt0Var);
    }

    public fiu0 y() {
        iyk iykVar = new iyk(2);
        iykVar.b(wnm0.class, (msi) this.i);
        iykVar.b(vyv.class, (msi) this.j);
        return new fiu0(iykVar.a());
    }
}
