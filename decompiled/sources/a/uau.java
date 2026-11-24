package a;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class uau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4u f35349a;
    public final pru b;
    public final lbu c;
    public final bzt d;
    public final nou e;
    public final gxu f;
    public final iqt g;
    public final rou h;
    public final yfu i;
    public final ahu j;
    public final epc k;
    public final luu l;
    public final iqi m;
    public final r9u n;
    public final hqx o;
    public final pzt p;

    public uau(f4u f4uVar, pru pruVar, lbu lbuVar, bzt bztVar, nou nouVar, gxu gxuVar, iqt iqtVar, rou rouVar, yfu yfuVar, ahu ahuVar, epc epcVar, luu luuVar, iqi iqiVar, r9u r9uVar, hqx hqxVar, pzt pztVar) {
        pruVar.getClass();
        lbuVar.getClass();
        bztVar.getClass();
        rouVar.getClass();
        yfuVar.getClass();
        r9uVar.getClass();
        this.f35349a = f4uVar;
        this.b = pruVar;
        this.c = lbuVar;
        this.d = bztVar;
        this.e = nouVar;
        this.f = gxuVar;
        this.g = iqtVar;
        this.h = rouVar;
        this.i = yfuVar;
        this.j = ahuVar;
        this.k = epcVar;
        this.l = luuVar;
        this.m = iqiVar;
        this.n = r9uVar;
        this.o = hqxVar;
        this.p = pztVar;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:59:0x0126  */
    /* JADX WARN: Code duplicated, block: B:61:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x0157  */
    /* JADX WARN: Code duplicated, block: B:68:0x016a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0170  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01db  */
    /* JADX WARN: Code duplicated, block: B:91:0x0253  */
    /* JADX WARN: Code duplicated, block: B:93:0x0260  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [int] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    public final Object a(int i, zje zjeVar) {
        sau sauVar;
        Object g0g0Var;
        Object g0g0Var2;
        long jLongValue;
        Object num;
        int iIntValue;
        boolean zA;
        boolean z;
        int i2;
        ?? r4;
        Object objA;
        boolean z2;
        long j;
        n0o0 n0o0VarB;
        Object objN;
        a8z a8zVar;
        int i3;
        int i4;
        long j2;
        ?? r5;
        int i5;
        sff0 sff0VarA;
        boolean zJ;
        v8d v8dVarA;
        Object objG;
        int i6;
        boolean z3;
        a8z a8zVar2;
        int i7;
        long j3;
        int i8;
        sff0 sff0Var;
        v8d v8dVar;
        Collection collectionC;
        toc0 toc0Var;
        lc00 lc00VarB;
        boolean z4;
        if (zjeVar instanceof sau) {
            sauVar = (sau) zjeVar;
            int i9 = sauVar.u;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                sauVar.u = i9 - Integer.MIN_VALUE;
            } else {
                sauVar = new sau(this, zjeVar);
            }
        } else {
            sauVar = new sau(this, zjeVar);
        }
        Object objA2 = sauVar.s;
        wne wneVar = wne.f39444a;
        int i10 = sauVar.u;
        byte b = 4;
        byte b2 = 1;
        try {
            try {
                if (i10 == 0) {
                    z1x.P(objA2);
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        ahu ahuVar = this.j;
                        sauVar.m = null;
                        i10 = i;
                        sauVar.i = i10;
                        sauVar.u = 1;
                        objA2 = ahuVar.b(bm5.f2822a, sauVar);
                        if (objA2 == wneVar) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        i10 = i;
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var2 = new g0g0(th);
                    }
                    return wneVar;
                }
                if (i10 == 1) {
                    i10 = sauVar.i;
                    z1x.P(objA2);
                } else {
                    if (i10 == 2) {
                        jLongValue = sauVar.p;
                        i10 = sauVar.i;
                        z1x.P(objA2);
                        g0g0Var = new Integer(((ql5) objA2).h);
                        e0g0 e0g0Var3 = j0g0.b;
                        num = new Integer(0);
                        if (g0g0Var instanceof g0g0) {
                            g0g0Var = num;
                        }
                        iIntValue = ((Number) g0g0Var).intValue();
                        zA = this.g.f15225a.a();
                        if (zA) {
                            sauVar.m = null;
                            sauVar.i = i10;
                            sauVar.p = jLongValue;
                            sauVar.j = iIntValue;
                            sauVar.q = zA;
                            sauVar.u = 3;
                            objA = this.h.a(false, sauVar);
                            if (objA != wneVar) {
                                i2 = i10;
                                z2 = zA;
                                objA2 = objA;
                                j = jLongValue;
                                jLongValue = j;
                                z = z2;
                                r4 = ((m2c0) objA2).n0;
                                n0o0VarB = maz.b(new tet((byte) 23));
                                sauVar.m = n0o0VarB;
                                sauVar.i = i2;
                                sauVar.p = jLongValue;
                                sauVar.j = iIntValue;
                                sauVar.q = z;
                                sauVar.k = r4;
                                sauVar.u = 4;
                                objN = this.f.n(sauVar);
                                if (objN != wneVar) {
                                    int i11 = iIntValue;
                                    a8zVar = n0o0VarB;
                                    objA2 = objN;
                                    i3 = i11;
                                    i4 = i2;
                                    j2 = jLongValue;
                                    r5 = r4;
                                    if (((Boolean) objA2).booleanValue()) {
                                        i5 = 0;
                                    } else {
                                        i5 = 0;
                                    }
                                    sff0VarA = this.b.a();
                                    zJ = this.c.j();
                                    v8dVarA = this.d.f3488a.a();
                                    sauVar.m = a8zVar;
                                    sauVar.n = sff0VarA;
                                    sauVar.o = v8dVarA;
                                    sauVar.i = i4;
                                    sauVar.p = j2;
                                    sauVar.j = i3;
                                    sauVar.q = z;
                                    sauVar.k = r5;
                                    sauVar.l = i5;
                                    sauVar.r = zJ;
                                    sauVar.u = 5;
                                    objG = this.m.g(sauVar);
                                    if (objG != wneVar) {
                                        i6 = i5;
                                        objA2 = objG;
                                        z3 = zJ;
                                        a8zVar2 = a8zVar;
                                        i7 = i3;
                                        j3 = j2;
                                        i8 = i4;
                                        sff0Var = sff0VarA;
                                        v8dVar = v8dVarA;
                                    }
                                }
                            }
                        } else {
                            z = zA;
                            i2 = i10;
                            r4 = 0;
                            n0o0VarB = maz.b(new tet((byte) 23));
                            sauVar.m = n0o0VarB;
                            sauVar.i = i2;
                            sauVar.p = jLongValue;
                            sauVar.j = iIntValue;
                            sauVar.q = z;
                            sauVar.k = r4;
                            sauVar.u = 4;
                            objN = this.f.n(sauVar);
                            if (objN != wneVar) {
                                int i12 = iIntValue;
                                a8zVar = n0o0VarB;
                                objA2 = objN;
                                i3 = i12;
                                i4 = i2;
                                j2 = jLongValue;
                                r5 = r4;
                                if (((Boolean) objA2).booleanValue()) {
                                    i5 = 0;
                                } else {
                                    i5 = 0;
                                }
                                sff0VarA = this.b.a();
                                zJ = this.c.j();
                                v8dVarA = this.d.f3488a.a();
                                sauVar.m = a8zVar;
                                sauVar.n = sff0VarA;
                                sauVar.o = v8dVarA;
                                sauVar.i = i4;
                                sauVar.p = j2;
                                sauVar.j = i3;
                                sauVar.q = z;
                                sauVar.k = r5;
                                sauVar.l = i5;
                                sauVar.r = zJ;
                                sauVar.u = 5;
                                objG = this.m.g(sauVar);
                                if (objG != wneVar) {
                                    i6 = i5;
                                    objA2 = objG;
                                    z3 = zJ;
                                    a8zVar2 = a8zVar;
                                    i7 = i3;
                                    j3 = j2;
                                    i8 = i4;
                                    sff0Var = sff0VarA;
                                    v8dVar = v8dVarA;
                                }
                            }
                        }
                        return wneVar;
                    }
                    if (i10 == 3) {
                        z2 = sauVar.q;
                        iIntValue = sauVar.j;
                        j = sauVar.p;
                        i2 = sauVar.i;
                        z1x.P(objA2);
                        jLongValue = j;
                        z = z2;
                        r4 = ((m2c0) objA2).n0;
                        n0o0VarB = maz.b(new tet((byte) 23));
                        sauVar.m = n0o0VarB;
                        sauVar.i = i2;
                        sauVar.p = jLongValue;
                        sauVar.j = iIntValue;
                        sauVar.q = z;
                        sauVar.k = r4;
                        sauVar.u = 4;
                        objN = this.f.n(sauVar);
                        if (objN != wneVar) {
                            int i13 = iIntValue;
                            a8zVar = n0o0VarB;
                            objA2 = objN;
                            i3 = i13;
                            i4 = i2;
                            j2 = jLongValue;
                            r5 = r4;
                            if (((Boolean) objA2).booleanValue()) {
                                i5 = 0;
                            } else {
                                i5 = 0;
                            }
                            sff0VarA = this.b.a();
                            zJ = this.c.j();
                            v8dVarA = this.d.f3488a.a();
                            sauVar.m = a8zVar;
                            sauVar.n = sff0VarA;
                            sauVar.o = v8dVarA;
                            sauVar.i = i4;
                            sauVar.p = j2;
                            sauVar.j = i3;
                            sauVar.q = z;
                            sauVar.k = r5;
                            sauVar.l = i5;
                            sauVar.r = zJ;
                            sauVar.u = 5;
                            objG = this.m.g(sauVar);
                            if (objG != wneVar) {
                                i6 = i5;
                                objA2 = objG;
                                z3 = zJ;
                                a8zVar2 = a8zVar;
                                i7 = i3;
                                j3 = j2;
                                i8 = i4;
                                sff0Var = sff0VarA;
                                v8dVar = v8dVarA;
                            }
                        }
                        return wneVar;
                    }
                    if (i10 == 4) {
                        int i14 = sauVar.k;
                        z = sauVar.q;
                        i3 = sauVar.j;
                        j2 = sauVar.p;
                        i4 = sauVar.i;
                        a8zVar = sauVar.m;
                        z1x.P(objA2);
                        r5 = i14;
                        if (((Boolean) objA2).booleanValue() || r5 == 0) {
                            i5 = 0;
                        } else {
                            i5 = 1;
                        }
                        sff0VarA = this.b.a();
                        zJ = this.c.j();
                        v8dVarA = this.d.f3488a.a();
                        sauVar.m = a8zVar;
                        sauVar.n = sff0VarA;
                        sauVar.o = v8dVarA;
                        sauVar.i = i4;
                        sauVar.p = j2;
                        sauVar.j = i3;
                        sauVar.q = z;
                        sauVar.k = r5;
                        sauVar.l = i5;
                        sauVar.r = zJ;
                        sauVar.u = 5;
                        objG = this.m.g(sauVar);
                        if (objG != wneVar) {
                            i6 = i5;
                            objA2 = objG;
                            z3 = zJ;
                            a8zVar2 = a8zVar;
                            i7 = i3;
                            j3 = j2;
                            i8 = i4;
                            sff0Var = sff0VarA;
                            v8dVar = v8dVarA;
                        }
                        return wneVar;
                    }
                    if (i10 != 5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = sauVar.r;
                    int i15 = sauVar.l;
                    i7 = sauVar.j;
                    j3 = sauVar.p;
                    int i16 = sauVar.i;
                    v8dVar = sauVar.o;
                    sff0Var = sauVar.n;
                    a8z a8zVar3 = sauVar.m;
                    z1x.P(objA2);
                    a8zVar2 = a8zVar3;
                    i6 = i15;
                    i8 = i16;
                }
                vh0 vh0Var = (vh0) objA2;
                if (v8dVar.F || z3 || j3 == 0) {
                    collectionC = iun.f15405a;
                } else {
                    collectionC = kotlin.collections.a.c(iz30.s);
                }
                toc0Var = sff0Var.l;
                lc00VarB = kotlin.collections.a.b();
                if (toc0Var.s) {
                    lc00VarB.add(iz30.j);
                }
                if (toc0Var.t) {
                    lc00VarB.add(iz30.r);
                }
                c5q c5qVarH = pgi0.h(pgi0.h(new sx3(CollectionsKt.q0(CollectionsKt.q0(collectionC, kotlin.collections.a.a(lc00VarB)), this.f35349a.b().f41535a), (byte) 1), new t3t(v8dVar, b)), new jno(b2, z3));
                ygp ygpVar = ygp.E1;
                r9u r9uVar = this.n;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                boolean z5 = z3;
                c5q c5qVarN = qbc.N(c5qVarH, sff0Var, this.k.a().f13512a, j1q0Var.f15748a.d(ygpVar), z5, false, false, 48);
                List listA = this.l.f20692a.a();
                Map mapB = wp20.b(new Pair(iz30.k, sff0Var.f32117a.f));
                this.i.j();
                if (i6 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                sff0 sff0Var2 = sff0Var;
                return new p6d(this.o.a(), this.p.a(), new tau(this, sff0Var2, hhm0.D(c5qVarN, j3, i7, mapB, z5, z4, sff0Var2, listA, vh0Var, i8), a8zVar2, null), b2);
                g0g0Var2 = new Long(((ql5) objA2).e);
                e0g0 e0g0Var4 = j0g0.b;
            } catch (Throwable th2) {
                th = th2;
            }
            Object l = new Long(0L);
            if (g0g0Var2 instanceof g0g0) {
                g0g0Var2 = l;
            }
            jLongValue = ((Number) g0g0Var2).longValue();
            nou nouVar = this.e;
            sauVar.m = null;
            sauVar.i = i10;
            sauVar.p = jLongValue;
            sauVar.u = 2;
            objA2 = nouVar.a(tl5.c, sauVar);
            if (objA2 != wneVar) {
                g0g0Var = new Integer(((ql5) objA2).h);
                e0g0 e0g0Var5 = j0g0.b;
                num = new Integer(0);
                if (g0g0Var instanceof g0g0) {
                    g0g0Var = num;
                }
                iIntValue = ((Number) g0g0Var).intValue();
                zA = this.g.f15225a.a();
                if (zA) {
                    sauVar.m = null;
                    sauVar.i = i10;
                    sauVar.p = jLongValue;
                    sauVar.j = iIntValue;
                    sauVar.q = zA;
                    sauVar.u = 3;
                    objA = this.h.a(false, sauVar);
                    if (objA != wneVar) {
                        i2 = i10;
                        z2 = zA;
                        objA2 = objA;
                        j = jLongValue;
                        jLongValue = j;
                        z = z2;
                        r4 = ((m2c0) objA2).n0;
                        n0o0VarB = maz.b(new tet((byte) 23));
                        sauVar.m = n0o0VarB;
                        sauVar.i = i2;
                        sauVar.p = jLongValue;
                        sauVar.j = iIntValue;
                        sauVar.q = z;
                        sauVar.k = r4;
                        sauVar.u = 4;
                        objN = this.f.n(sauVar);
                        if (objN != wneVar) {
                            int i17 = iIntValue;
                            a8zVar = n0o0VarB;
                            objA2 = objN;
                            i3 = i17;
                            i4 = i2;
                            j2 = jLongValue;
                            r5 = r4;
                            if (((Boolean) objA2).booleanValue()) {
                                i5 = 0;
                            } else {
                                i5 = 0;
                            }
                            sff0VarA = this.b.a();
                            zJ = this.c.j();
                            v8dVarA = this.d.f3488a.a();
                            sauVar.m = a8zVar;
                            sauVar.n = sff0VarA;
                            sauVar.o = v8dVarA;
                            sauVar.i = i4;
                            sauVar.p = j2;
                            sauVar.j = i3;
                            sauVar.q = z;
                            sauVar.k = r5;
                            sauVar.l = i5;
                            sauVar.r = zJ;
                            sauVar.u = 5;
                            objG = this.m.g(sauVar);
                            if (objG != wneVar) {
                                i6 = i5;
                                objA2 = objG;
                                z3 = zJ;
                                a8zVar2 = a8zVar;
                                i7 = i3;
                                j3 = j2;
                                i8 = i4;
                                sff0Var = sff0VarA;
                                v8dVar = v8dVarA;
                                vh0 vh0Var2 = (vh0) objA2;
                                if (v8dVar.F) {
                                    collectionC = iun.f15405a;
                                } else {
                                    collectionC = iun.f15405a;
                                }
                                toc0Var = sff0Var.l;
                                lc00VarB = kotlin.collections.a.b();
                                if (toc0Var.s) {
                                    lc00VarB.add(iz30.j);
                                }
                                if (toc0Var.t) {
                                    lc00VarB.add(iz30.r);
                                }
                                c5q c5qVarH2 = pgi0.h(pgi0.h(new sx3(CollectionsKt.q0(CollectionsKt.q0(collectionC, kotlin.collections.a.a(lc00VarB)), this.f35349a.b().f41535a), (byte) 1), new t3t(v8dVar, b)), new jno(b2, z3));
                                ygp ygpVar2 = ygp.E1;
                                r9u r9uVar2 = this.n;
                                r9uVar2.getClass();
                                j1q0 j1q0Var2 = r9uVar2.f30104a;
                                j1q0Var2.getClass();
                                boolean z6 = z3;
                                c5q c5qVarN2 = qbc.N(c5qVarH2, sff0Var, this.k.a().f13512a, j1q0Var2.f15748a.d(ygpVar2), z6, false, false, 48);
                                List listA2 = this.l.f20692a.a();
                                Map mapB2 = wp20.b(new Pair(iz30.k, sff0Var.f32117a.f));
                                this.i.j();
                                if (i6 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                sff0 sff0Var3 = sff0Var;
                                return new p6d(this.o.a(), this.p.a(), new tau(this, sff0Var3, hhm0.D(c5qVarN2, j3, i7, mapB2, z6, z4, sff0Var3, listA2, vh0Var2, i8), a8zVar2, null), b2);
                            }
                        }
                    }
                } else {
                    z = zA;
                    i2 = i10;
                    r4 = 0;
                    n0o0VarB = maz.b(new tet((byte) 23));
                    sauVar.m = n0o0VarB;
                    sauVar.i = i2;
                    sauVar.p = jLongValue;
                    sauVar.j = iIntValue;
                    sauVar.q = z;
                    sauVar.k = r4;
                    sauVar.u = 4;
                    objN = this.f.n(sauVar);
                    if (objN != wneVar) {
                        int i18 = iIntValue;
                        a8zVar = n0o0VarB;
                        objA2 = objN;
                        i3 = i18;
                        i4 = i2;
                        j2 = jLongValue;
                        r5 = r4;
                        if (((Boolean) objA2).booleanValue()) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                        }
                        sff0VarA = this.b.a();
                        zJ = this.c.j();
                        v8dVarA = this.d.f3488a.a();
                        sauVar.m = a8zVar;
                        sauVar.n = sff0VarA;
                        sauVar.o = v8dVarA;
                        sauVar.i = i4;
                        sauVar.p = j2;
                        sauVar.j = i3;
                        sauVar.q = z;
                        sauVar.k = r5;
                        sauVar.l = i5;
                        sauVar.r = zJ;
                        sauVar.u = 5;
                        objG = this.m.g(sauVar);
                        if (objG != wneVar) {
                            i6 = i5;
                            objA2 = objG;
                            z3 = zJ;
                            a8zVar2 = a8zVar;
                            i7 = i3;
                            j3 = j2;
                            i8 = i4;
                            sff0Var = sff0VarA;
                            v8dVar = v8dVarA;
                            vh0 vh0Var3 = (vh0) objA2;
                            if (v8dVar.F) {
                                collectionC = iun.f15405a;
                            } else {
                                collectionC = iun.f15405a;
                            }
                            toc0Var = sff0Var.l;
                            lc00VarB = kotlin.collections.a.b();
                            if (toc0Var.s) {
                                lc00VarB.add(iz30.j);
                            }
                            if (toc0Var.t) {
                                lc00VarB.add(iz30.r);
                            }
                            c5q c5qVarH3 = pgi0.h(pgi0.h(new sx3(CollectionsKt.q0(CollectionsKt.q0(collectionC, kotlin.collections.a.a(lc00VarB)), this.f35349a.b().f41535a), (byte) 1), new t3t(v8dVar, b)), new jno(b2, z3));
                            ygp ygpVar3 = ygp.E1;
                            r9u r9uVar3 = this.n;
                            r9uVar3.getClass();
                            j1q0 j1q0Var3 = r9uVar3.f30104a;
                            j1q0Var3.getClass();
                            boolean z7 = z3;
                            c5q c5qVarN3 = qbc.N(c5qVarH3, sff0Var, this.k.a().f13512a, j1q0Var3.f15748a.d(ygpVar3), z7, false, false, 48);
                            List listA3 = this.l.f20692a.a();
                            Map mapB3 = wp20.b(new Pair(iz30.k, sff0Var.f32117a.f));
                            this.i.j();
                            if (i6 != 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            sff0 sff0Var4 = sff0Var;
                            return new p6d(this.o.a(), this.p.a(), new tau(this, sff0Var4, hhm0.D(c5qVarN3, j3, i7, mapB3, z7, z4, sff0Var4, listA3, vh0Var3, i8), a8zVar2, null), b2);
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            e0g0 e0g0Var6 = j0g0.b;
            g0g0Var = new g0g0(th3);
        }
        return wneVar;
    }
}
