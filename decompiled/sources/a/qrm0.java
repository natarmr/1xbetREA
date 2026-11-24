package a;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class qrm0 extends fot0 {
    public cmn0 A;
    public tii0 B;
    public tii0 C;
    public uii0 D;
    public final rrm0 r;
    public final fnu0 s;
    public final c5k t;
    public final c5k u;
    public cyu v;
    public kki w;
    public cmn0 x;
    public cmn0 y;
    public cmn0 z;

    public qrm0(s0a s0aVar, s0a s0aVar2, c5k c5kVar, c5k c5kVar2, HashSet hashSet, ipt0 ipt0Var) {
        super(K(hashSet));
        this.r = K(hashSet);
        this.t = c5kVar;
        this.u = c5kVar2;
        this.s = new fnu0(s0aVar, s0aVar2, hashSet, ipt0Var, new b0l0(this, (byte) 6));
        HashSet hashSet2 = ((fot0) hashSet.iterator().next()).h;
        this.h = hashSet2 != null ? new HashSet(hashSet2) : null;
    }

    public static rrm0 K(HashSet hashSet) {
        wy40 wy40VarL = wy40.l();
        new eyg0(wy40VarL);
        wy40VarL.y(h0x.h0, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            fot0 fot0Var = (fot0) it.next();
            if (fot0Var.i.f(fpt0.N0)) {
                arrayList.add(fot0Var.i.v());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        wy40VarL.y(rrm0.b, arrayList);
        wy40VarL.y(w0x.n0, 2);
        wy40VarL.y(fpt0.S0, urm0.PREVIEW_VIDEO_STILL);
        return new rrm0(b780.j(wy40VarL));
    }

    @Override // a.fot0
    public final void A() {
        G();
        fnu0 fnu0Var = this.s;
        for (fot0 fot0Var : fnu0Var.f9855a) {
            enu0 enu0Var = (enu0) fnu0Var.c.get(fot0Var);
            Objects.requireNonNull(enu0Var);
            fot0Var.D(enu0Var);
        }
    }

    public final void G() {
        uii0 uii0Var = this.D;
        if (uii0Var != null) {
            uii0Var.b();
            this.D = null;
        }
        cmn0 cmn0Var = this.x;
        if (cmn0Var != null) {
            cmn0Var.b();
            this.x = null;
        }
        cmn0 cmn0Var2 = this.y;
        if (cmn0Var2 != null) {
            cmn0Var2.b();
            this.y = null;
        }
        cmn0 cmn0Var3 = this.z;
        if (cmn0Var3 != null) {
            cmn0Var3.b();
            this.z = null;
        }
        cmn0 cmn0Var4 = this.A;
        if (cmn0Var4 != null) {
            cmn0Var4.b();
            this.A = null;
        }
        cyu cyuVar = this.v;
        if (cyuVar != null) {
            ((txj) cyuVar.f5196a).release();
            ofm0.w(new apj0((Object) cyuVar, (byte) 6));
            this.v = null;
        }
        kki kkiVar = this.w;
        if (kkiVar != null) {
            ((jmn0) kkiVar.e).release();
            ofm0.w(new ccf((Object) kkiVar, (byte) 18));
            this.w = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List H(String str, String str2, fpt0 fpt0Var, h55 h55Var, h55 h55Var2) {
        boolean z;
        agn agnVar = h55Var.c;
        ofm0.m();
        fnu0 fnu0Var = this.s;
        if (h55Var2 == null) {
            cmn0 cmn0VarI = I(str, str2, fpt0Var, h55Var, null);
            s0a s0aVarD = d();
            Objects.requireNonNull(s0aVarD);
            txj txjVar = new txj(agnVar);
            cyu cyuVar = new cyu();
            cyuVar.b = s0aVarD;
            cyuVar.f5196a = txjVar;
            this.v = cyuVar;
            boolean z2 = this.l != null;
            int iM = m();
            fnu0Var.getClass();
            HashMap map = new HashMap();
            for (fot0 fot0Var : fnu0Var.f9855a) {
                ksf0 ksf0Var = fnu0Var.k;
                s0a s0aVar = fnu0Var.f;
                fnu0 fnu0Var2 = fnu0Var;
                boolean z3 = z2;
                l45 l45VarS = fnu0Var2.s(fot0Var, ksf0Var, s0aVar, cmn0VarI, iM, z3);
                int iB = fnu0Var2.f.a().B(((w0x) fot0Var.i).s(0));
                enu0 enu0Var = (enu0) fnu0Var2.c.get(fot0Var);
                Objects.requireNonNull(enu0Var);
                enu0Var.c.c = iB;
                map.put(fot0Var, l45VarS);
                fnu0Var = fnu0Var2;
                z2 = z3;
            }
            fnu0 fnu0Var3 = fnu0Var;
            boolean z4 = z2;
            ArrayList arrayList = new ArrayList(map.values());
            if (cmn0VarI == null) {
                hny.u("Null surfaceEdge");
                return null;
            }
            txj txjVar2 = (txj) cyuVar.f5196a;
            ofm0.m();
            l8x.U("SurfaceProcessorNode", "[StreamSharing] SurfaceProcessorNode Transform (Processor=" + txjVar2 + "\n   inputEdge = " + cmn0VarI);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                l8x.U("SurfaceProcessorNode", "   outputConfig = " + ((l45) it.next()));
            }
            cyuVar.c = new btd();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                l45 l45Var = (l45) it2.next();
                btd btdVar = (btd) cyuVar.c;
                Rect rect = l45Var.d;
                int i = l45Var.f;
                boolean z5 = l45Var.g;
                Matrix matrix = new Matrix(cmn0VarI.b);
                RectF rectF = new RectF(rect);
                Size size = l45Var.e;
                Iterator it3 = it2;
                matrix.postConcat(jls0.a(rectF, jls0.h(size), i, z5));
                z1x.u(jls0.d(jls0.g(i, jls0.f(rect)), false, size));
                HashMap map2 = map;
                Rect rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
                qgd qgdVarB = cmn0VarI.g.b();
                qgdVarB.b = size;
                btdVar.put(l45Var, new cmn0(l45Var.b, l45Var.c, qgdVarB.i(), matrix, false, rect2, cmn0VarI.i - i, -1, cmn0VarI.e != z5));
                it2 = it3;
                map = map2;
            }
            HashMap map3 = map;
            txjVar2.b(cmn0VarI.c((s0a) cyuVar.b, true));
            for (Map.Entry entry : ((btd) cyuVar.c).entrySet()) {
                cyuVar.f(cmn0VarI, entry);
                cmn0 cmn0Var = (cmn0) entry.getValue();
                b1 b1Var = new b1(cyuVar, cmn0VarI, entry, (byte) 26);
                cmn0Var.getClass();
                ofm0.m();
                cmn0Var.a();
                cmn0Var.m.add(b1Var);
            }
            cmn0VarI.o.add(new ad3((btd) cyuVar.c, (byte) 3));
            btd btdVar2 = (btd) cyuVar.c;
            HashMap map4 = new HashMap();
            for (Map.Entry entry2 : map3.entrySet()) {
                map4.put((fot0) entry2.getKey(), (cmn0) btdVar2.get(entry2.getValue()));
            }
            fnu0Var3.y(map4, fnu0Var3.v(cmn0VarI, z4));
            Object[] objArr = {this.B.c()};
            ArrayList arrayList2 = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList2.add(obj);
            return Collections.unmodifiableList(arrayList2);
        }
        cmn0 cmn0VarI2 = I(str, str2, fpt0Var, h55Var, h55Var2);
        Matrix matrix2 = this.m;
        s0a s0aVarJ = j();
        Objects.requireNonNull(s0aVarJ);
        boolean zQ = s0aVarJ.q();
        Size size2 = h55Var2.f12463a;
        Rect rect3 = this.l;
        if (rect3 != null) {
            z = false;
        } else {
            z = false;
            rect3 = new Rect(0, 0, size2.getWidth(), size2.getHeight());
        }
        s0a s0aVarJ2 = j();
        Objects.requireNonNull(s0aVarJ2);
        int i2 = i(s0aVarJ2, z);
        s0a s0aVarJ3 = j();
        Objects.requireNonNull(s0aVarJ3);
        fnu0 fnu0Var4 = fnu0Var;
        cmn0 cmn0Var2 = new cmn0(3, 34, h55Var2, matrix2, zQ, rect3, i2, -1, p(s0aVarJ3));
        this.y = cmn0Var2;
        Objects.requireNonNull(j());
        this.A = cmn0Var2;
        tii0 tii0VarJ = J(this.y, fpt0Var, h55Var2);
        this.C = tii0VarJ;
        uii0 uii0Var = this.D;
        if (uii0Var != null) {
            uii0Var.b();
        }
        uii0 uii0Var2 = new uii0(new prm0(this, str, str2, fpt0Var, h55Var, h55Var2));
        this.D = uii0Var2;
        tii0VarJ.f = uii0Var2;
        cmn0 cmn0Var3 = this.A;
        this.w = new kki(d(), j(), new mbn(agnVar, this.t, this.u));
        boolean z6 = this.l != null;
        int iM2 = m();
        fnu0Var4.getClass();
        HashMap map5 = new HashMap();
        for (fot0 fot0Var2 : fnu0Var4.f9855a) {
            fnu0 fnu0Var5 = fnu0Var4;
            l45 l45VarS2 = fnu0Var5.s(fot0Var2, fnu0Var4.k, fnu0Var4.f, cmn0VarI2, iM2, z6);
            ksf0 ksf0Var2 = fnu0Var5.l;
            Objects.requireNonNull(ksf0Var2);
            s0a s0aVar2 = fnu0Var5.g;
            Objects.requireNonNull(s0aVar2);
            cmn0 cmn0Var4 = cmn0Var3;
            l45 l45VarS3 = fnu0Var5.s(fot0Var2, ksf0Var2, s0aVar2, cmn0Var4, iM2, z6);
            int iB2 = fnu0Var5.f.a().B(((w0x) fot0Var2.i).s(0));
            enu0 enu0Var2 = (enu0) fnu0Var5.c.get(fot0Var2);
            Objects.requireNonNull(enu0Var2);
            enu0Var2.c.c = iB2;
            map5.put(fot0Var2, new k35(l45VarS2, l45VarS3));
            fnu0Var4 = fnu0Var5;
            cmn0Var3 = cmn0Var4;
        }
        cmn0 cmn0Var5 = cmn0Var3;
        fnu0 fnu0Var6 = fnu0Var4;
        kki kkiVar = this.w;
        ArrayList arrayList3 = new ArrayList(map5.values());
        l35 l35Var = new l35(cmn0VarI2, cmn0Var5, arrayList3);
        kkiVar.getClass();
        ofm0.m();
        StringBuilder sb = new StringBuilder("[StreamSharing] DualSurfaceProcessorNode Transform Processor = ");
        jmn0 jmn0Var = (jmn0) kkiVar.e;
        sb.append(jmn0Var);
        sb.append("\n   primary input = ");
        sb.append(cmn0VarI2);
        sb.append("\n   secondary input = ");
        sb.append(cmn0Var5);
        l8x.U("DualSurfaceProcessorNode", sb.toString());
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            l8x.U("SurfaceProcessorNode", "   outputConfig = " + ((k35) it4.next()));
        }
        kkiVar.f = l35Var;
        kkiVar.d = new btd();
        l35 l35Var2 = (l35) kkiVar.f;
        cmn0 cmn0Var6 = l35Var2.f19342a;
        cmn0 cmn0Var7 = l35Var2.b;
        Iterator it5 = l35Var2.c.iterator();
        while (it5.hasNext()) {
            k35 k35Var = (k35) it5.next();
            btd btdVar3 = (btd) kkiVar.d;
            l45 l45Var2 = k35Var.f17602a;
            Rect rect4 = l45Var2.d;
            int i3 = l45Var2.f;
            boolean z7 = l45Var2.g;
            Iterator it6 = it5;
            HashMap map6 = map5;
            Matrix matrix3 = new Matrix(cmn0Var6.b);
            RectF rectF2 = new RectF(rect4);
            Size size3 = l45Var2.e;
            matrix3.postConcat(jls0.a(rectF2, jls0.h(size3), i3, z7));
            z1x.u(jls0.d(jls0.g(i3, jls0.f(rect4)), false, size3));
            Rect rect5 = new Rect(0, 0, size3.getWidth(), size3.getHeight());
            qgd qgdVarB2 = cmn0Var6.g.b();
            qgdVarB2.b = size3;
            btdVar3.put(k35Var, new cmn0(l45Var2.b, l45Var2.c, qgdVarB2.i(), matrix3, false, rect5, cmn0Var6.i - i3, -1, cmn0Var6.e != z7));
            it5 = it6;
            map5 = map6;
        }
        HashMap map7 = map5;
        jmn0Var.b(cmn0Var6.c((s0a) kkiVar.b, true));
        jmn0Var.b(cmn0Var7.c((s0a) kkiVar.c, false));
        s0a s0aVar3 = (s0a) kkiVar.b;
        s0a s0aVar4 = (s0a) kkiVar.c;
        for (Map.Entry entry3 : ((btd) kkiVar.d).entrySet()) {
            kki kkiVar2 = kkiVar;
            cmn0 cmn0Var8 = cmn0Var6;
            cmn0 cmn0Var9 = cmn0Var7;
            kkiVar2.b(s0aVar3, s0aVar4, cmn0Var8, cmn0Var9, entry3);
            cmn0 cmn0Var10 = (cmn0) entry3.getValue();
            s0a s0aVar5 = s0aVar4;
            s0a s0aVar6 = s0aVar3;
            nbn nbnVar = new nbn(kkiVar2, s0aVar6, s0aVar5, cmn0Var8, cmn0Var9, entry3, (byte) 0);
            s0aVar3 = s0aVar6;
            s0aVar4 = s0aVar5;
            cmn0Var10.getClass();
            ofm0.m();
            cmn0Var10.a();
            cmn0Var10.m.add(nbnVar);
            kkiVar = kkiVar2;
            cmn0Var6 = cmn0Var8;
            cmn0Var7 = cmn0Var9;
        }
        btd btdVar4 = (btd) kkiVar.d;
        HashMap map8 = new HashMap();
        for (Map.Entry entry4 : map7.entrySet()) {
            map8.put((fot0) entry4.getKey(), (cmn0) btdVar4.get(entry4.getValue()));
        }
        fnu0Var6.y(map8, fnu0Var6.v(cmn0VarI2, z6));
        Object[] objArr2 = {this.B.c(), this.C.c()};
        ArrayList arrayList4 = new ArrayList(2);
        for (int i4 = 0; i4 < 2; i4++) {
            Object obj2 = objArr2[i4];
            Objects.requireNonNull(obj2);
            arrayList4.add(obj2);
        }
        return Collections.unmodifiableList(arrayList4);
    }

    public final cmn0 I(String str, String str2, fpt0 fpt0Var, h55 h55Var, h55 h55Var2) {
        Matrix matrix = this.m;
        s0a s0aVarD = d();
        Objects.requireNonNull(s0aVarD);
        boolean zQ = s0aVarD.q();
        Size size = h55Var.f12463a;
        Rect rect = this.l;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        s0a s0aVarD2 = d();
        Objects.requireNonNull(s0aVarD2);
        int i = i(s0aVarD2, false);
        s0a s0aVarD3 = d();
        Objects.requireNonNull(s0aVarD3);
        cmn0 cmn0Var = new cmn0(3, 34, h55Var, matrix, zQ, rect, i, -1, p(s0aVarD3));
        this.x = cmn0Var;
        Objects.requireNonNull(d());
        this.z = cmn0Var;
        tii0 tii0VarJ = J(this.x, fpt0Var, h55Var);
        this.B = tii0VarJ;
        uii0 uii0Var = this.D;
        if (uii0Var != null) {
            uii0Var.b();
        }
        uii0 uii0Var2 = new uii0(new prm0(this, str, str2, fpt0Var, h55Var, h55Var2));
        this.D = uii0Var2;
        tii0VarJ.f = uii0Var2;
        return this.z;
    }

    public final tii0 J(cmn0 cmn0Var, fpt0 fpt0Var, h55 h55Var) {
        tii0 tii0VarD = tii0.d(fpt0Var, h55Var.f12463a);
        ucs0 ucs0Var = tii0VarD.b;
        fnu0 fnu0Var = this.s;
        Iterator it = fnu0Var.f9855a.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((xii0) ((fot0) it.next()).i.d(fpt0.C0)).g.c;
            List list = xii0.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            ucs0Var.b = i;
        }
        Size size = h55Var.f12463a;
        Iterator it2 = fnu0Var.f9855a.iterator();
        while (it2.hasNext()) {
            xii0 xii0VarC = tii0.d(((fot0) it2.next()).i, size).c();
            t7a t7aVar = xii0VarC.g;
            ucs0Var.e(t7aVar.d);
            List<vx9> list2 = xii0VarC.e;
            ArrayList arrayList = tii0VarD.e;
            for (vx9 vx9Var : list2) {
                ucs0Var.f(vx9Var);
                if (!arrayList.contains(vx9Var)) {
                    arrayList.add(vx9Var);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : xii0VarC.d) {
                ArrayList arrayList2 = tii0VarD.d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : xii0VarC.c) {
                ArrayList arrayList3 = tii0VarD.c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            ucs0Var.g(t7aVar.b);
        }
        cmn0Var.getClass();
        ofm0.m();
        cmn0Var.a();
        z1x.y("Consumer can only be linked once.", !cmn0Var.j);
        cmn0Var.j = true;
        tii0VarD.b(cmn0Var.l, h55Var.c, -1);
        ucs0Var.f(fnu0Var.h);
        drd drdVar = h55Var.f;
        if (drdVar != null) {
            ucs0Var.g(drdVar);
        }
        tii0VarD.h = h55Var.d;
        a(tii0VarD, h55Var);
        return tii0VarD;
    }

    @Override // a.fot0
    public final fpt0 g(boolean z, ipt0 ipt0Var) {
        rrm0 rrm0Var = this.r;
        drd drdVarA = ipt0Var.a(rrm0Var.v(), 1);
        if (z) {
            drdVarA = drd.r(drdVarA, rrm0Var.f30991a);
        }
        if (drdVarA == null) {
            return null;
        }
        return ((eyg0) n(drdVarA)).e();
    }

    @Override // a.fot0
    public final Set k(n0a n0aVar) {
        HashSet hashSet = this.s.f9855a;
        HashSet hashSet2 = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Set setK = ((fot0) it.next()).k(n0aVar);
            if (setK != null) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(setK);
                } else {
                    hashSet2.retainAll(setK);
                }
            }
        }
        return hashSet2;
    }

    @Override // a.fot0
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // a.fot0
    public final ept0 n(drd drdVar) {
        return new eyg0(wy40.p(drdVar));
    }

    @Override // a.fot0
    public final void t() {
        fnu0 fnu0Var = this.s;
        for (fot0 fot0Var : fnu0Var.f9855a) {
            enu0 enu0Var = (enu0) fnu0Var.c.get(fot0Var);
            Objects.requireNonNull(enu0Var);
            fot0Var.b(enu0Var, null, null, fot0Var.g(true, fnu0Var.e));
        }
    }

    @Override // a.fot0
    public final void u() {
        Iterator it = this.s.f9855a.iterator();
        while (it.hasNext()) {
            ((fot0) it.next()).u();
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x0216  */
    /* JADX WARN: Code duplicated, block: B:94:0x021d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v46 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    @Override // a.fot0
    public final fpt0 v(n0a n0aVar, ept0 ept0Var) {
        fpt0 fpt0Var;
        fpt0 fpt0Var2;
        Object agnVar;
        boolean zEquals;
        ?? r5;
        ?? r4;
        List arrayList;
        isf0 isf0Var;
        wy40 wy40VarB = ept0Var.b();
        fnu0 fnu0Var = this.s;
        HashSet hashSet = fnu0Var.i;
        ksf0 ksf0Var = fnu0Var.k;
        n0a n0aVar2 = ksf0Var.f;
        List listP = n0aVar2.p(34);
        HashSet hashSet2 = ksf0Var.d;
        Iterator it = hashSet2.iterator();
        while (true) {
            fpt0Var = null;
            if (!it.hasNext()) {
                break;
            }
            fpt0 fpt0Var3 = (fpt0) it.next();
            if (!((Boolean) fpt0Var3.e(fpt0.M0, Boolean.FALSE)).booleanValue() && (fpt0Var3 instanceof w0x) && (isf0Var = (isf0) ((w0x) fpt0Var3).e(w0x.s0, null)) != null && isf0Var.c == 1) {
                ArrayList arrayList2 = new ArrayList(listP);
                arrayList2.addAll(n0aVar2.i(34));
                listP = arrayList2;
                break;
            }
        }
        List list = (List) wy40VarB.e(w0x.r0, null);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList = new ArrayList();
                    break;
                }
                Pair pair = (Pair) it2.next();
                if (((Integer) pair.first).equals(34)) {
                    arrayList = Arrays.asList((Size[]) pair.second);
                    break;
                }
            }
            listP = arrayList;
        }
        Rational rational = ksf0Var.c;
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet3 = new HashSet();
        Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            hashSet3.addAll(ksf0Var.c((fpt0) it3.next()));
        }
        Iterator it4 = hashSet3.iterator();
        while (it4.hasNext()) {
            if (!ky3.a(rational, (Size) it4.next())) {
                arrayList3.addAll(ksf0Var.g(ksf0Var.b, listP, false));
                break;
            }
        }
        int size = arrayList3.size();
        if (!hashSet2.isEmpty()) {
            Iterator it5 = hashSet2.iterator();
            loop9: while (true) {
                if (!it5.hasNext()) {
                    fpt0Var2 = fpt0Var;
                    size = 0;
                    break;
                }
                Iterator it6 = ksf0Var.c((fpt0) it5.next()).iterator();
                boolean z = false;
                boolean z2 = false;
                while (it6.hasNext()) {
                    fpt0Var2 = fpt0Var;
                    boolean zA = ky3.a(rational, (Size) it6.next());
                    if (zA) {
                        z = true;
                    }
                    if (z2 && zA) {
                        break loop9;
                    }
                    if (!zA) {
                        z2 = true;
                    }
                    fpt0Var = fpt0Var2;
                }
                fpt0Var2 = fpt0Var;
                if (!z) {
                    break;
                }
                fpt0Var = fpt0Var2;
            }
        } else {
            fpt0Var2 = null;
        }
        arrayList3.addAll(size, ksf0Var.g(rational, listP, false));
        arrayList3.addAll(ksf0Var.f(listP, false));
        if (arrayList3.isEmpty()) {
            l8x.E0("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList3.addAll(ksf0Var.f(listP, true));
        }
        l8x.U("ResolutionsMerger", "Parent resolutions: " + arrayList3);
        wy40VarB.y(w0x.t0, arrayList3);
        u15 u15Var = fpt0.G0;
        Iterator it7 = hashSet.iterator();
        int iMax = 0;
        while (it7.hasNext()) {
            iMax = Math.max(iMax, ((Integer) ((fpt0) it7.next()).e(fpt0.G0, 0)).intValue());
        }
        wy40VarB.y(u15Var, Integer.valueOf(iMax));
        ArrayList arrayList4 = new ArrayList();
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            agn agnVar2 = (agn) ((fpt0) it8.next()).e(h0x.j0, agn.c);
            agnVar2.getClass();
            arrayList4.add(agnVar2);
        }
        if (!arrayList4.isEmpty()) {
            agn agnVar3 = (agn) arrayList4.get(0);
            Integer numValueOf = Integer.valueOf(agnVar3.f832a);
            int i = 1;
            ?? ValueOf = Integer.valueOf(agnVar3.b);
            ?? r6 = numValueOf;
            while (true) {
                if (i >= arrayList4.size()) {
                    agnVar = new agn(r6.intValue(), ValueOf.intValue());
                    break;
                }
                agn agnVar4 = (agn) arrayList4.get(i);
                Integer numValueOf2 = Integer.valueOf(agnVar4.f832a);
                if (r6.equals(0)) {
                    r5 = numValueOf2;
                } else {
                    r5 = r6;
                    if (!numValueOf2.equals(0)) {
                        if (r6.equals(2) && !numValueOf2.equals(1)) {
                            r5 = numValueOf2;
                        } else if (numValueOf2.equals(2)) {
                            boolean zEquals2 = r6.equals(1);
                            r5 = r6;
                            if (zEquals2) {
                                zEquals = r6.equals(numValueOf2);
                                r5 = r6;
                                if (!zEquals) {
                                    r5 = fpt0Var2;
                                }
                            }
                        } else {
                            zEquals = r6.equals(numValueOf2);
                            r5 = r6;
                            if (!zEquals) {
                                r5 = fpt0Var2;
                            }
                        }
                    }
                }
                Integer numValueOf3 = Integer.valueOf(agnVar4.b);
                if (ValueOf.equals(0)) {
                    r4 = numValueOf3;
                } else {
                    r4 = ValueOf;
                    if (!numValueOf3.equals(0)) {
                        boolean zEquals3 = ValueOf.equals(numValueOf3);
                        r4 = ValueOf;
                        if (!zEquals3) {
                            r4 = fpt0Var2;
                        }
                    }
                }
                if (r5 == 0 || r4 == 0) {
                    agnVar = fpt0Var2;
                    break;
                }
                i++;
                ValueOf = r4;
                r6 = r5;
            }
        } else {
            agnVar = fpt0Var2;
            break;
        }
        if (agnVar == null) {
            jf4.o("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
            return fpt0Var2;
        }
        wy40VarB.y(h0x.j0, agnVar);
        u15 u15Var2 = fpt0.I0;
        Range rangeExtend = h55.h;
        Iterator it9 = hashSet.iterator();
        while (it9.hasNext()) {
            Range range = (Range) ((fpt0) it9.next()).e(fpt0.I0, rangeExtend);
            Objects.requireNonNull(range);
            if (h55.h.equals(rangeExtend)) {
                rangeExtend = range;
            } else {
                try {
                    rangeExtend = rangeExtend.intersect(range);
                } catch (IllegalArgumentException unused) {
                    l8x.U("VirtualCameraAdapter", "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + rangeExtend + " <<>> " + range);
                    rangeExtend = rangeExtend.extend(range);
                }
            }
        }
        wy40VarB.y(u15Var2, rangeExtend);
        Iterator it10 = fnu0Var.f9855a.iterator();
        while (it10.hasNext()) {
            fpt0 fpt0Var4 = (fpt0) fnu0Var.j.get((fot0) it10.next());
            Objects.requireNonNull(fpt0Var4);
            if (fpt0Var4.n() != 0) {
                wy40VarB.y(fpt0.P0, Integer.valueOf(fpt0Var4.n()));
            }
            if (fpt0Var4.q() != 0) {
                wy40VarB.y(fpt0.O0, Integer.valueOf(fpt0Var4.q()));
            }
        }
        return ept0Var.e();
    }

    @Override // a.fot0
    public final void w() {
        this.f9899a = true;
        Iterator it = this.s.f9855a.iterator();
        while (it.hasNext()) {
            ((fot0) it.next()).w();
        }
    }

    @Override // a.fot0
    public final void x() {
        this.f9899a = false;
        Iterator it = this.s.f9855a.iterator();
        while (it.hasNext()) {
            ((fot0) it.next()).x();
        }
    }

    @Override // a.fot0
    public final h55 y(drd drdVar) {
        this.B.a(drdVar);
        Object[] objArr = {this.B.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        qgd qgdVarB = this.j.b();
        qgdVarB.g = drdVar;
        return qgdVarB.i();
    }

    @Override // a.fot0
    public final h55 z(h55 h55Var, h55 h55Var2) {
        l8x.U("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + h55Var + ", secondaryStreamSpec " + h55Var2);
        E(H(f(), j() == null ? null : j().h().e(), this.i, h55Var, h55Var2));
        this.e = 1;
        s();
        return h55Var;
    }
}
