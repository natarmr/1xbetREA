package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class xq30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g45 f41296a;
    public final ehf0 b;

    public xq30(g45 g45Var) {
        this.f41296a = g45Var;
        f6i f6iVar = (f6i) g45Var.f10647a;
        this.b = new ehf0((ym40) f6iVar.f, (n660) f6iVar.n);
    }

    public final v0 a(vjj vjjVar) {
        if (vjjVar instanceof mg80) {
            swq swqVar = ((ng80) ((mg80) vjjVar)).f;
            g45 g45Var = this.f41296a;
            return new q4d0(swqVar, (h950) g45Var.b, (roi0) g45Var.d, (hfk) g45Var.g);
        }
        if (vjjVar instanceof ffk) {
            return ((ffk) vjjVar).u;
        }
        return null;
    }

    public final ArrayList b(List list, List list2, z3 z3Var, int i) {
        xq30 xq30Var = this;
        g45 g45Var = xq30Var.f41296a;
        vjj vjjVar = (vjj) g45Var.c;
        vjjVar.getClass();
        kp9 kp9Var = (kp9) vjjVar;
        vjj vjjVarJ = kp9Var.j();
        vjjVarJ.getClass();
        v0 v0VarA = xq30Var.a(vjjVarJ);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            a4d0 a4d0Var = (a4d0) obj;
            i4d0 i4d0Var = (i4d0) CollectionsKt.W(i2, list2);
            c8z c8zVarM = obb.M(kp9Var, ((qgd) g45Var.h).d0(a4d0Var), null, (v0VarA == null || !njq.c.e((i4d0Var == null || (i4d0Var.c & 1) != 1) ? 0 : i4d0Var.d).booleanValue()) ? ujn.c : new b660((eu00) ((f6i) g45Var.f10647a).e, new wq30(xq30Var, v0VarA, z3Var, i, i2, i4d0Var, (byte) 1)), i2);
            if (c8zVarM != null) {
                arrayList.add(c8zVarM);
            }
            xq30Var = this;
            i2 = i3;
        }
        return arrayList;
    }

    public final g93 c(z3 z3Var, int i, int i2) {
        return !njq.c.e(i).booleanValue() ? ujn.c : new b660((eu00) ((f6i) this.f41296a.f10647a).e, new uq30(this, z3Var, i2, (byte) 0));
    }

    public final g93 d(p3d0 p3d0Var, boolean z) {
        return !njq.c.e(p3d0Var.d).booleanValue() ? ujn.c : new b660((eu00) ((f6i) this.f41296a.f10647a).e, new vq30(this, z, p3d0Var));
    }

    public final xek e(v2d0 v2d0Var, boolean z) {
        tek tekVar;
        v2d0Var.getClass();
        g45 g45Var = this.f41296a;
        vjj vjjVar = (vjj) g45Var.c;
        vjjVar.getClass();
        wm40 wm40Var = (wm40) vjjVar;
        xek xekVar = new xek(wm40Var, null, c(v2d0Var, v2d0Var.d, 1), z, 1, v2d0Var, (h950) g45Var.b, (roi0) g45Var.d, (xbu0) g45Var.e, (hfk) g45Var.g, null);
        xq30 xq30Var = (xq30) g45Var.h(xekVar, iun.f15405a, (h950) g45Var.b, (roi0) g45Var.d, (xbu0) g45Var.e, (e28) g45Var.f).i;
        List list = v2d0Var.e;
        list.getClass();
        List listH = xq30Var.h(list, v2d0Var, 1);
        o4d0 o4d0Var = (o4d0) njq.d.e(v2d0Var.d);
        switch (o4d0Var == null ? -1 : v4d0.b[o4d0Var.ordinal()]) {
            case 1:
                tekVar = uek.d;
                tekVar.getClass();
                break;
            case 2:
                tekVar = uek.f35533a;
                tekVar.getClass();
                break;
            case 3:
                tekVar = uek.b;
                tekVar.getClass();
                break;
            case 4:
                tekVar = uek.c;
                tekVar.getClass();
                break;
            case 5:
                tekVar = uek.e;
                tekVar.getClass();
                break;
            case 6:
                tekVar = uek.f;
                tekVar.getClass();
                break;
            default:
                tekVar = uek.f35533a;
                tekVar.getClass();
                break;
        }
        xekVar.C1(listH, tekVar);
        xekVar.x1(wm40Var.I());
        xekVar.s = wm40Var.Q();
        xekVar.w = !njq.o.e(v2d0Var.d).booleanValue();
        return xekVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cf  */
    public final sfk f(i3d0 i3d0Var) {
        int i;
        c8z c8zVarS;
        wsy wsyVarD0;
        g45 g45Var = this.f41296a;
        h950 h950Var = (h950) g45Var.b;
        roi0 roi0Var = (roi0) g45Var.d;
        i3d0Var.getClass();
        byte b = 1;
        if ((i3d0Var.c & 1) == 1) {
            i = i3d0Var.d;
        } else {
            int i2 = i3d0Var.e;
            i = ((i2 >> 8) << 6) + (i2 & 63);
        }
        int i3 = i;
        g93 g93VarC = c(i3d0Var, i3, 1);
        int i4 = i3d0Var.c;
        g93 vekVar = ((i4 & 32) == 32 || (i4 & 64) == 64) ? new vek((eu00) ((f6i) g45Var.f10647a).e, new uq30(this, i3d0Var, b, b)) : ujn.c;
        sfk sfkVar = new sfk((vjj) g45Var.c, null, g93VarC, ydx.L(h950Var, i3d0Var.f), l8x.k0((j3d0) njq.q.e(i3)), i3d0Var, (h950) g45Var.b, roi0Var, rek.g((vjj) g45Var.c).a(ydx.L(h950Var, i3d0Var.f)).equals(zmn0.f44634a) ? xbu0.b : (xbu0) g45Var.e, (hfk) g45Var.g, null);
        List list = i3d0Var.i;
        list.getClass();
        g45 g45VarH = g45Var.h(sfkVar, list, (h950) g45Var.b, (roi0) g45Var.d, (xbu0) g45Var.e, (e28) g45Var.f);
        xq30 xq30Var = (xq30) g45VarH.i;
        qgd qgdVar = (qgd) g45VarH.h;
        a4d0 a4d0VarF0 = m8x.f0(i3d0Var, roi0Var);
        if (a4d0VarF0 == null) {
            c8zVarS = null;
        } else {
            if (njq.A.e(i3).booleanValue()) {
                a4d0VarF0 = null;
            }
            if (a4d0VarF0 == null || (wsyVarD0 = qgdVar.d0(a4d0VarF0)) == null) {
                c8zVarS = null;
            } else {
                c8zVarS = obb.S(sfkVar, wsyVarD0, vekVar);
            }
        }
        vjj vjjVar = (vjj) g45Var.c;
        wm40 wm40Var = vjjVar instanceof wm40 ? (wm40) vjjVar : null;
        c8z c8zVarF0 = wm40Var != null ? wm40Var.f0() : null;
        c8z c8zVar = (c8zVarF0 == null || njq.A.e(i3).booleanValue()) ? null : c8zVarF0;
        List listL = m8x.L(i3d0Var, roi0Var);
        List list2 = i3d0Var.o;
        list2.getClass();
        ArrayList arrayListB = xq30Var.b(listL, list2, i3d0Var, 1);
        List listE = qgdVar.E();
        List list3 = i3d0Var.p;
        list3.getClass();
        List listH = xq30Var.h(list3, i3d0Var, 1);
        wsy wsyVarD1 = qgdVar.d0(m8x.i0(i3d0Var, roi0Var));
        gm40 gm40VarA = lwf.a((k3d0) njq.e.e(i3));
        tek tekVarV = l8x.V((o4d0) njq.d.e(i3));
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        sfkVar.C1(c8zVarS, c8zVar, arrayListB, listE, listH, wsyVarD1, gm40VarA, tekVarV, lunVar);
        sfkVar.n = njq.r.e(i3).booleanValue();
        sfkVar.o = njq.s.e(i3).booleanValue();
        sfkVar.p = njq.v.e(i3).booleanValue();
        sfkVar.q = njq.t.e(i3).booleanValue();
        sfkVar.r = njq.u.e(i3).booleanValue();
        sfkVar.v = njq.w.e(i3).booleanValue();
        sfkVar.s = njq.x.e(i3).booleanValue();
        sfkVar.w = !njq.y.e(i3).booleanValue();
        ((std) ((f6i) g45Var.f10647a).o).getClass();
        return sfkVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0159  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [a.wm40] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [a.xq30] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    public final rfk g(p3d0 p3d0Var, boolean z) {
        int i;
        g93 g93VarC;
        byte b;
        ?? r14;
        g93 vekVar;
        c8z c8zVarS;
        rfk rfkVar;
        g0d0 g0d0VarN;
        bu00 bu00Var;
        n0d0 n0d0VarO;
        boolean z2;
        wsy wsyVarD0;
        f93 f93Var = ujn.c;
        g45 g45Var = this.f41296a;
        h950 h950Var = (h950) g45Var.b;
        roi0 roi0Var = (roi0) g45Var.d;
        p3d0Var.getClass();
        if ((p3d0Var.c & 1) == 1) {
            i = p3d0Var.d;
        } else {
            int i2 = p3d0Var.e;
            i = ((i2 >> 8) << 6) + (i2 & 63);
        }
        if (z) {
            List<p2d0> list = p3d0Var.u;
            list.getClass();
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (p2d0 p2d0Var : list) {
                p2d0Var.getClass();
                arrayList.add(this.b.d(p2d0Var, h950Var));
            }
            g93VarC = arrayList.isEmpty() ? f93Var : new i93(arrayList, (byte) 0);
        } else {
            g93VarC = null;
        }
        vjj vjjVar = (vjj) g45Var.c;
        if (g93VarC == null) {
            g93VarC = c(p3d0Var, i, 2);
        }
        ljq ljqVar = njq.e;
        gm40 gm40VarA = lwf.a((k3d0) ljqVar.e(i));
        ljq ljqVar2 = njq.d;
        int i3 = i;
        rfk rfkVar2 = new rfk(vjjVar, null, g93VarC, gm40VarA, l8x.V((o4d0) ljqVar2.e(i)), njq.B.e(i).booleanValue(), ydx.L(h950Var, p3d0Var.f), l8x.k0((j3d0) njq.q.e(i)), njq.F.e(i).booleanValue(), njq.E.e(i).booleanValue(), njq.H.e(i).booleanValue(), njq.I.e(i).booleanValue(), njq.J.e(i).booleanValue(), p3d0Var, (h950) g45Var.b, roi0Var, (xbu0) g45Var.e, (hfk) g45Var.g);
        List list2 = p3d0Var.i;
        list2.getClass();
        g45 g45VarH = g45Var.h(rfkVar2, list2, (h950) g45Var.b, (roi0) g45Var.d, (xbu0) g45Var.e, (e28) g45Var.f);
        qgd qgdVar = (qgd) g45VarH.h;
        boolean zBooleanValue = njq.C.e(i3).booleanValue();
        int i4 = 3;
        if (zBooleanValue) {
            int i5 = p3d0Var.c;
            if ((i5 & 32) == 32 || (i5 & 64) == 64) {
                b = 1;
                xq30 xq30Var = this;
                vekVar = new vek((eu00) ((f6i) g45Var.f10647a).e, new uq30(xq30Var, p3d0Var, i4, b));
                r14 = xq30Var;
            } else {
                b = 1;
                r14 = this;
                vekVar = f93Var;
            }
        } else {
            b = 1;
            r14 = this;
            vekVar = f93Var;
        }
        wsy wsyVarD1 = qgdVar.d0(m8x.j0(p3d0Var, roi0Var));
        List listE = qgdVar.E();
        vjj vjjVar2 = (vjj) g45Var.c;
        wm40 wm40Var = vjjVar2 instanceof wm40 ? (wm40) vjjVar2 : null;
        c8z c8zVarF0 = wm40Var != null ? wm40Var.f0() : null;
        c8z c8zVar = (c8zVarF0 == null || njq.L.e(i3).booleanValue()) ? null : c8zVarF0;
        a4d0 a4d0VarG0 = m8x.g0(p3d0Var, roi0Var);
        if (a4d0VarG0 == null) {
            c8zVarS = null;
        } else {
            if (njq.L.e(i3).booleanValue()) {
                a4d0VarG0 = null;
            }
            if (a4d0VarG0 == null || (wsyVarD0 = qgdVar.d0(a4d0VarG0)) == null) {
                c8zVarS = null;
            } else {
                c8zVarS = obb.S(rfkVar2, wsyVarD0, vekVar);
            }
        }
        xq30 xq30Var2 = (xq30) g45VarH.i;
        List listM = m8x.M(p3d0Var, roi0Var);
        List list3 = p3d0Var.o;
        list3.getClass();
        ?? r1 = b;
        rfkVar2.w1(wsyVarD1, listE, c8zVar, c8zVarS, xq30Var2.b(listM, list3, p3d0Var, 3));
        int iB = njq.b(njq.c.e(i3).booleanValue(), (o4d0) ljqVar2.e(i3), (k3d0) ljqVar.e(i3));
        gne0 gne0Var = gmk0.x0;
        if (zBooleanValue) {
            int i6 = (p3d0Var.c & 256) == 256 ? p3d0Var.q : iB;
            boolean zBooleanValue2 = njq.P.e(i6).booleanValue();
            boolean zBooleanValue3 = njq.Q.e(i6).booleanValue();
            boolean zBooleanValue4 = njq.R.e(i6).booleanValue();
            g93 g93VarC2 = r14.c(p3d0Var, i6, 3);
            if (zBooleanValue2) {
                g0d0 g0d0Var = new g0d0(rfkVar2, g93VarC2, lwf.a((k3d0) ljqVar.e(i6)), l8x.V((o4d0) ljqVar2.e(i6)), !zBooleanValue2, zBooleanValue3, zBooleanValue4, rfkVar2.l(), null, gne0Var);
                rfkVar = rfkVar2;
                g0d0VarN = g0d0Var;
            } else {
                rfkVar = rfkVar2;
                g0d0VarN = obb.N(rfkVar, g93VarC2);
            }
            g0d0VarN.s1(rfkVar.getReturnType());
        } else {
            rfkVar = rfkVar2;
            g0d0VarN = null;
        }
        if (njq.D.e(i3).booleanValue()) {
            if ((p3d0Var.c & 512) == 512) {
                iB = p3d0Var.r;
            }
            boolean zBooleanValue5 = njq.P.e(iB).booleanValue();
            boolean zBooleanValue6 = njq.Q.e(iB).booleanValue();
            boolean zBooleanValue7 = njq.R.e(iB).booleanValue();
            g93 g93VarC3 = r14.c(p3d0Var, iB, 4);
            if (zBooleanValue5) {
                n0d0VarO = new n0d0(rfkVar, g93VarC3, lwf.a((k3d0) ljqVar.e(iB)), l8x.V((o4d0) ljqVar2.e(iB)), !zBooleanValue5, zBooleanValue6, zBooleanValue7, rfkVar.l(), null, gne0Var);
                k3u0 k3u0Var = (k3u0) CollectionsKt.v0(((xq30) g45VarH.h(n0d0VarO, iun.f15405a, (h950) g45VarH.b, (roi0) g45VarH.d, (xbu0) g45VarH.e, (e28) g45VarH.f).i).h(kotlin.collections.a.c(p3d0Var.p), p3d0Var, 4));
                if (k3u0Var == null) {
                    n0d0.k0(6);
                    throw null;
                }
                n0d0VarO.n = k3u0Var;
                bu00Var = null;
            } else {
                bu00Var = null;
                n0d0VarO = obb.O(rfkVar, g93VarC3);
            }
        } else {
            bu00Var = null;
            n0d0VarO = null;
        }
        if (njq.G.e(i3).booleanValue()) {
            z2 = false;
            rfkVar.u1(bu00Var, new tq30(r14, p3d0Var, rfkVar, false ? 1 : 0));
        } else {
            z2 = false;
        }
        vjj vjjVar3 = (vjj) g45Var.c;
        ?? r0 = vjjVar3 instanceof wm40 ? (wm40) vjjVar3 : bu00Var;
        if ((r0 != 0 ? r0.r() : bu00Var) == slc.e) {
            rfkVar.u1(bu00Var, new tq30(r14, p3d0Var, rfkVar, r1 == true ? (byte) 1 : (byte) 0));
        }
        rfkVar.t1(g0d0VarN, n0d0VarO, new tqp(r14.d(p3d0Var, z2)), new tqp(r14.d(p3d0Var, r1)));
        return rfkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [a.wsy] */
    /* JADX WARN: Type inference failed for: r21v2 */
    public final List h(List list, z3 z3Var, int i) {
        int i2;
        a4d0 a4d0Var;
        g93 b660Var;
        xq30 xq30Var = this;
        g45 g45Var = xq30Var.f41296a;
        roi0 roi0Var = (roi0) g45Var.d;
        qgd qgdVar = (qgd) g45Var.h;
        vjj vjjVar = (vjj) g45Var.c;
        vjjVar.getClass();
        kp9 kp9Var = (kp9) vjjVar;
        vjj vjjVarJ = kp9Var.j();
        vjjVarJ.getClass();
        v0 v0VarA = xq30Var.a(vjjVarJ);
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            i4d0 i4d0Var = (i4d0) obj;
            int i5 = (i4d0Var.c & 1) == 1 ? i4d0Var.d : 0;
            if (v0VarA == null || !njq.c.e(i5).booleanValue()) {
                i2 = i3;
                a4d0Var = null;
                b660Var = ujn.c;
            } else {
                i2 = i3;
                a4d0Var = null;
                b660Var = new b660((eu00) ((f6i) g45Var.f10647a).e, new wq30(xq30Var, v0VarA, z3Var, i, i2, i4d0Var, (byte) 0));
            }
            g950 g950VarL = ydx.L((h950) g45Var.b, i4d0Var.e);
            wsy wsyVarD0 = qgdVar.d0(m8x.z0(i4d0Var, roi0Var));
            boolean zBooleanValue = njq.M.e(i5).booleanValue();
            boolean zBooleanValue2 = njq.N.e(i5).booleanValue();
            boolean zBooleanValue3 = njq.O.e(i5).booleanValue();
            int i6 = i4d0Var.c;
            a4d0 a4d0VarC = (i6 & 16) == 16 ? i4d0Var.h : (i6 & 32) == 32 ? roi0Var.c(i4d0Var.i) : a4d0Var;
            ?? D0 = a4d0VarC != null ? qgdVar.d0(a4d0VarC) : a4d0Var;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new k3u0(kp9Var, null, i2, b660Var, g950VarL, wsyVarD0, zBooleanValue, zBooleanValue2, zBooleanValue3, D0, gmk0.x0));
            arrayList = arrayList2;
            i3 = i4;
            xq30Var = this;
        }
        return CollectionsKt.L0(arrayList);
    }
}
