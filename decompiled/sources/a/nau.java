package a;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class nau {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f4u f23208a;
    public final pru b;
    public final iqt c;
    public final rou d;
    public final lbu e;
    public final bzt f;
    public final nou g;
    public final gxu h;
    public final epc i;
    public final yfu j;
    public final ahu k;
    public final r9u l;
    public final iqi m;

    public nau(f4u f4uVar, pru pruVar, iqt iqtVar, rou rouVar, lbu lbuVar, bzt bztVar, nou nouVar, gxu gxuVar, epc epcVar, yfu yfuVar, ahu ahuVar, r9u r9uVar, iqi iqiVar) {
        pruVar.getClass();
        rouVar.getClass();
        lbuVar.getClass();
        bztVar.getClass();
        yfuVar.getClass();
        r9uVar.getClass();
        this.f23208a = f4uVar;
        this.b = pruVar;
        this.c = iqtVar;
        this.d = rouVar;
        this.e = lbuVar;
        this.f = bztVar;
        this.g = nouVar;
        this.h = gxuVar;
        this.i = epcVar;
        this.j = yfuVar;
        this.k = ahuVar;
        this.l = r9uVar;
        this.m = iqiVar;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:57:0x010f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0125  */
    /* JADX WARN: Code duplicated, block: B:62:0x013a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0154  */
    /* JADX WARN: Code duplicated, block: B:69:0x0161 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x0165  */
    /* JADX WARN: Code duplicated, block: B:75:0x0197  */
    /* JADX WARN: Code duplicated, block: B:78:0x0209  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0211  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [int] */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v9, types: [int] */
    public final Object a(int i, zje zjeVar) {
        mau mauVar;
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
        int i3;
        boolean z2;
        Object objN;
        int i4;
        boolean z3;
        long j;
        ?? r5;
        int i5;
        sff0 sff0VarA;
        boolean zJ;
        v8d v8dVarA;
        Object objG;
        long j2;
        boolean z4;
        v8d v8dVar;
        int i6;
        int i7;
        sff0 sff0Var;
        boolean z5;
        if (zjeVar instanceof mau) {
            mauVar = (mau) zjeVar;
            int i8 = mauVar.t;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                mauVar.t = i8 - Integer.MIN_VALUE;
            } else {
                mauVar = new mau(this, zjeVar);
            }
        } else {
            mauVar = new mau(this, zjeVar);
        }
        Object objA2 = mauVar.r;
        wne wneVar = wne.f39444a;
        int i9 = mauVar.t;
        byte b = 1;
        try {
            try {
                if (i9 == 0) {
                    z1x.P(objA2);
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        ahu ahuVar = this.k;
                        mauVar.m = null;
                        i9 = i;
                        mauVar.i = i9;
                        mauVar.t = 1;
                        objA2 = ahuVar.b(bm5.f2822a, mauVar);
                        if (objA2 == wneVar) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        i9 = i;
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var2 = new g0g0(th);
                    }
                    return wneVar;
                }
                if (i9 == 1) {
                    i9 = mauVar.i;
                    z1x.P(objA2);
                } else {
                    if (i9 == 2) {
                        jLongValue = mauVar.o;
                        i9 = mauVar.i;
                        z1x.P(objA2);
                        g0g0Var = new Integer(((ql5) objA2).h);
                        e0g0 e0g0Var3 = j0g0.b;
                        num = new Integer(0);
                        if (g0g0Var instanceof g0g0) {
                            g0g0Var = num;
                        }
                        iIntValue = ((Number) g0g0Var).intValue();
                        zA = this.c.f15225a.a();
                        if (zA) {
                            mauVar.m = null;
                            mauVar.i = i9;
                            mauVar.o = jLongValue;
                            mauVar.j = iIntValue;
                            mauVar.p = zA;
                            mauVar.t = 3;
                            objA = this.d.a(false, mauVar);
                            if (objA != wneVar) {
                                i3 = iIntValue;
                                objA2 = objA;
                                i2 = i9;
                                z2 = zA;
                                boolean z6 = z2;
                                r4 = ((m2c0) objA2).n0;
                                iIntValue = i3;
                                z = z6;
                                mauVar.m = null;
                                mauVar.i = i2;
                                mauVar.o = jLongValue;
                                mauVar.j = iIntValue;
                                mauVar.p = z;
                                mauVar.k = r4;
                                mauVar.t = 4;
                                objN = this.h.n(mauVar);
                                if (objN != wneVar) {
                                    boolean z7 = z;
                                    i4 = iIntValue;
                                    objA2 = objN;
                                    z3 = z7;
                                    j = jLongValue;
                                    r5 = r4;
                                    if (((Boolean) objA2).booleanValue()) {
                                        i5 = 0;
                                    } else {
                                        i5 = 0;
                                    }
                                    sff0VarA = this.b.a();
                                    zJ = this.e.j();
                                    v8dVarA = this.f.f3488a.a();
                                    mauVar.m = sff0VarA;
                                    mauVar.n = v8dVarA;
                                    mauVar.i = i2;
                                    mauVar.o = j;
                                    mauVar.j = i4;
                                    mauVar.p = z3;
                                    mauVar.k = r5;
                                    mauVar.l = i5;
                                    mauVar.q = zJ;
                                    mauVar.t = 5;
                                    objG = this.m.g(mauVar);
                                    if (objG != wneVar) {
                                        j2 = j;
                                        z4 = zJ;
                                        v8dVar = v8dVarA;
                                        i6 = i5;
                                        objA2 = objG;
                                        i7 = i4;
                                        sff0Var = sff0VarA;
                                    }
                                }
                            }
                        } else {
                            z = zA;
                            i2 = i9;
                            r4 = 0;
                            mauVar.m = null;
                            mauVar.i = i2;
                            mauVar.o = jLongValue;
                            mauVar.j = iIntValue;
                            mauVar.p = z;
                            mauVar.k = r4;
                            mauVar.t = 4;
                            objN = this.h.n(mauVar);
                            if (objN != wneVar) {
                                boolean z8 = z;
                                i4 = iIntValue;
                                objA2 = objN;
                                z3 = z8;
                                j = jLongValue;
                                r5 = r4;
                                if (((Boolean) objA2).booleanValue()) {
                                    i5 = 0;
                                } else {
                                    i5 = 0;
                                }
                                sff0VarA = this.b.a();
                                zJ = this.e.j();
                                v8dVarA = this.f.f3488a.a();
                                mauVar.m = sff0VarA;
                                mauVar.n = v8dVarA;
                                mauVar.i = i2;
                                mauVar.o = j;
                                mauVar.j = i4;
                                mauVar.p = z3;
                                mauVar.k = r5;
                                mauVar.l = i5;
                                mauVar.q = zJ;
                                mauVar.t = 5;
                                objG = this.m.g(mauVar);
                                if (objG != wneVar) {
                                    j2 = j;
                                    z4 = zJ;
                                    v8dVar = v8dVarA;
                                    i6 = i5;
                                    objA2 = objG;
                                    i7 = i4;
                                    sff0Var = sff0VarA;
                                }
                            }
                        }
                        return wneVar;
                    }
                    if (i9 == 3) {
                        z2 = mauVar.p;
                        i3 = mauVar.j;
                        jLongValue = mauVar.o;
                        i2 = mauVar.i;
                        z1x.P(objA2);
                        boolean z9 = z2;
                        r4 = ((m2c0) objA2).n0;
                        iIntValue = i3;
                        z = z9;
                        mauVar.m = null;
                        mauVar.i = i2;
                        mauVar.o = jLongValue;
                        mauVar.j = iIntValue;
                        mauVar.p = z;
                        mauVar.k = r4;
                        mauVar.t = 4;
                        objN = this.h.n(mauVar);
                        if (objN != wneVar) {
                            boolean z10 = z;
                            i4 = iIntValue;
                            objA2 = objN;
                            z3 = z10;
                            j = jLongValue;
                            r5 = r4;
                            if (((Boolean) objA2).booleanValue()) {
                                i5 = 0;
                            } else {
                                i5 = 0;
                            }
                            sff0VarA = this.b.a();
                            zJ = this.e.j();
                            v8dVarA = this.f.f3488a.a();
                            mauVar.m = sff0VarA;
                            mauVar.n = v8dVarA;
                            mauVar.i = i2;
                            mauVar.o = j;
                            mauVar.j = i4;
                            mauVar.p = z3;
                            mauVar.k = r5;
                            mauVar.l = i5;
                            mauVar.q = zJ;
                            mauVar.t = 5;
                            objG = this.m.g(mauVar);
                            if (objG != wneVar) {
                                j2 = j;
                                z4 = zJ;
                                v8dVar = v8dVarA;
                                i6 = i5;
                                objA2 = objG;
                                i7 = i4;
                                sff0Var = sff0VarA;
                            }
                        }
                        return wneVar;
                    }
                    if (i9 == 4) {
                        int i10 = mauVar.k;
                        z3 = mauVar.p;
                        i4 = mauVar.j;
                        j = mauVar.o;
                        i2 = mauVar.i;
                        z1x.P(objA2);
                        r5 = i10;
                        if (((Boolean) objA2).booleanValue() || r5 == 0) {
                            i5 = 0;
                        } else {
                            i5 = 1;
                        }
                        sff0VarA = this.b.a();
                        zJ = this.e.j();
                        v8dVarA = this.f.f3488a.a();
                        mauVar.m = sff0VarA;
                        mauVar.n = v8dVarA;
                        mauVar.i = i2;
                        mauVar.o = j;
                        mauVar.j = i4;
                        mauVar.p = z3;
                        mauVar.k = r5;
                        mauVar.l = i5;
                        mauVar.q = zJ;
                        mauVar.t = 5;
                        objG = this.m.g(mauVar);
                        if (objG != wneVar) {
                            j2 = j;
                            z4 = zJ;
                            v8dVar = v8dVarA;
                            i6 = i5;
                            objA2 = objG;
                            i7 = i4;
                            sff0Var = sff0VarA;
                        }
                        return wneVar;
                    }
                    if (i9 != 5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z11 = mauVar.q;
                    int i11 = mauVar.l;
                    int i12 = mauVar.j;
                    long j3 = mauVar.o;
                    i2 = mauVar.i;
                    v8d v8dVar2 = mauVar.n;
                    sff0Var = mauVar.m;
                    z1x.P(objA2);
                    z4 = z11;
                    i7 = i12;
                    i6 = i11;
                    j2 = j3;
                    v8dVar = v8dVar2;
                }
                int i13 = i2;
                vh0 vh0Var = (vh0) objA2;
                this.j.j();
                sff0 sff0Var2 = sff0Var;
                boolean z12 = z4;
                long j4 = j2;
                c5q c5qVarH = pgi0.h(pgi0.h(CollectionsKt.I(this.f23208a.b().b), new q71((byte) 4, j2, v8dVar, sff0Var2, z12)), new jno(b, z12));
                ygp ygpVar = ygp.E1;
                r9u r9uVar = this.l;
                r9uVar.getClass();
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                c5q c5qVarN = qbc.N(c5qVarH, sff0Var2, this.i.a().f13512a, j1q0Var.f15748a.d(ygpVar), z12, false, false, 48);
                iun iunVar = iun.f15405a;
                Map mapB = wp20.b(new Pair(iz30.k, sff0Var2.f32117a.f));
                if (i6 != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                return new eu4(hhm0.D(c5qVarN, j4, i7, mapB, z12, z5, sff0Var2, iunVar, vh0Var, i13), (byte) 12);
                g0g0Var2 = new Long(((ql5) objA2).e);
                e0g0 e0g0Var4 = j0g0.b;
            } catch (Throwable th2) {
                e0g0 e0g0Var5 = j0g0.b;
                g0g0Var = new g0g0(th2);
            }
        } catch (Throwable th3) {
            th = th3;
        }
        Object l = new Long(0L);
        if (g0g0Var2 instanceof g0g0) {
            g0g0Var2 = l;
        }
        jLongValue = ((Number) g0g0Var2).longValue();
        nou nouVar = this.g;
        mauVar.m = null;
        mauVar.i = i9;
        mauVar.o = jLongValue;
        mauVar.t = 2;
        objA2 = nouVar.a(tl5.c, mauVar);
        if (objA2 != wneVar) {
            g0g0Var = new Integer(((ql5) objA2).h);
            e0g0 e0g0Var6 = j0g0.b;
            num = new Integer(0);
            if (g0g0Var instanceof g0g0) {
                g0g0Var = num;
            }
            iIntValue = ((Number) g0g0Var).intValue();
            zA = this.c.f15225a.a();
            if (zA) {
                mauVar.m = null;
                mauVar.i = i9;
                mauVar.o = jLongValue;
                mauVar.j = iIntValue;
                mauVar.p = zA;
                mauVar.t = 3;
                objA = this.d.a(false, mauVar);
                if (objA != wneVar) {
                    i3 = iIntValue;
                    objA2 = objA;
                    i2 = i9;
                    z2 = zA;
                    boolean z13 = z2;
                    r4 = ((m2c0) objA2).n0;
                    iIntValue = i3;
                    z = z13;
                    mauVar.m = null;
                    mauVar.i = i2;
                    mauVar.o = jLongValue;
                    mauVar.j = iIntValue;
                    mauVar.p = z;
                    mauVar.k = r4;
                    mauVar.t = 4;
                    objN = this.h.n(mauVar);
                    if (objN != wneVar) {
                        boolean z14 = z;
                        i4 = iIntValue;
                        objA2 = objN;
                        z3 = z14;
                        j = jLongValue;
                        r5 = r4;
                        if (((Boolean) objA2).booleanValue()) {
                            i5 = 0;
                        } else {
                            i5 = 0;
                        }
                        sff0VarA = this.b.a();
                        zJ = this.e.j();
                        v8dVarA = this.f.f3488a.a();
                        mauVar.m = sff0VarA;
                        mauVar.n = v8dVarA;
                        mauVar.i = i2;
                        mauVar.o = j;
                        mauVar.j = i4;
                        mauVar.p = z3;
                        mauVar.k = r5;
                        mauVar.l = i5;
                        mauVar.q = zJ;
                        mauVar.t = 5;
                        objG = this.m.g(mauVar);
                        if (objG != wneVar) {
                            j2 = j;
                            z4 = zJ;
                            v8dVar = v8dVarA;
                            i6 = i5;
                            objA2 = objG;
                            i7 = i4;
                            sff0Var = sff0VarA;
                            int i14 = i2;
                            vh0 vh0Var2 = (vh0) objA2;
                            this.j.j();
                            sff0 sff0Var3 = sff0Var;
                            boolean z15 = z4;
                            long j5 = j2;
                            c5q c5qVarH2 = pgi0.h(pgi0.h(CollectionsKt.I(this.f23208a.b().b), new q71((byte) 4, j2, v8dVar, sff0Var3, z15)), new jno(b, z15));
                            ygp ygpVar2 = ygp.E1;
                            r9u r9uVar2 = this.l;
                            r9uVar2.getClass();
                            j1q0 j1q0Var2 = r9uVar2.f30104a;
                            j1q0Var2.getClass();
                            c5q c5qVarN2 = qbc.N(c5qVarH2, sff0Var3, this.i.a().f13512a, j1q0Var2.f15748a.d(ygpVar2), z15, false, false, 48);
                            iun iunVar2 = iun.f15405a;
                            Map mapB2 = wp20.b(new Pair(iz30.k, sff0Var3.f32117a.f));
                            if (i6 != 0) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            return new eu4(hhm0.D(c5qVarN2, j5, i7, mapB2, z15, z5, sff0Var3, iunVar2, vh0Var2, i14), (byte) 12);
                        }
                    }
                }
            } else {
                z = zA;
                i2 = i9;
                r4 = 0;
                mauVar.m = null;
                mauVar.i = i2;
                mauVar.o = jLongValue;
                mauVar.j = iIntValue;
                mauVar.p = z;
                mauVar.k = r4;
                mauVar.t = 4;
                objN = this.h.n(mauVar);
                if (objN != wneVar) {
                    boolean z16 = z;
                    i4 = iIntValue;
                    objA2 = objN;
                    z3 = z16;
                    j = jLongValue;
                    r5 = r4;
                    if (((Boolean) objA2).booleanValue()) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                    }
                    sff0VarA = this.b.a();
                    zJ = this.e.j();
                    v8dVarA = this.f.f3488a.a();
                    mauVar.m = sff0VarA;
                    mauVar.n = v8dVarA;
                    mauVar.i = i2;
                    mauVar.o = j;
                    mauVar.j = i4;
                    mauVar.p = z3;
                    mauVar.k = r5;
                    mauVar.l = i5;
                    mauVar.q = zJ;
                    mauVar.t = 5;
                    objG = this.m.g(mauVar);
                    if (objG != wneVar) {
                        j2 = j;
                        z4 = zJ;
                        v8dVar = v8dVarA;
                        i6 = i5;
                        objA2 = objG;
                        i7 = i4;
                        sff0Var = sff0VarA;
                        int i15 = i2;
                        vh0 vh0Var3 = (vh0) objA2;
                        this.j.j();
                        sff0 sff0Var4 = sff0Var;
                        boolean z17 = z4;
                        long j6 = j2;
                        c5q c5qVarH3 = pgi0.h(pgi0.h(CollectionsKt.I(this.f23208a.b().b), new q71((byte) 4, j2, v8dVar, sff0Var4, z17)), new jno(b, z17));
                        ygp ygpVar3 = ygp.E1;
                        r9u r9uVar3 = this.l;
                        r9uVar3.getClass();
                        j1q0 j1q0Var3 = r9uVar3.f30104a;
                        j1q0Var3.getClass();
                        c5q c5qVarN3 = qbc.N(c5qVarH3, sff0Var4, this.i.a().f13512a, j1q0Var3.f15748a.d(ygpVar3), z17, false, false, 48);
                        iun iunVar3 = iun.f15405a;
                        Map mapB3 = wp20.b(new Pair(iz30.k, sff0Var4.f32117a.f));
                        if (i6 != 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        return new eu4(hhm0.D(c5qVarN3, j6, i7, mapB3, z17, z5, sff0Var4, iunVar3, vh0Var3, i15), (byte) 12);
                    }
                }
            }
        }
        return wneVar;
    }
}
