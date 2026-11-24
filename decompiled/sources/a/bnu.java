package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class bnu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2u f2902a;
    public final pmi b;
    public final pv00 c;
    public final yfu d;
    public final epc e;
    public final kqc f;
    public final pru g;

    public bnu(j2u j2uVar, pmi pmiVar, pv00 pv00Var, yfu yfuVar, epc epcVar, kqc kqcVar, pru pruVar) {
        j2uVar.getClass();
        this.f2902a = j2uVar;
        this.b = pmiVar;
        this.c = pv00Var;
        this.d = yfuVar;
        this.e = epcVar;
        this.f = kqcVar;
        this.g = pruVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb A[Catch: all -> 0x00c1, PHI: r0 r11
  0x00bb: PHI (r0v20 java.lang.Object) = (r0v13 java.lang.Object), (r0v1 java.lang.Object) binds: [B:35:0x00b8, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x00bb: PHI (r11v6 long) = (r11v2 long), (r11v12 long) binds: [B:35:0x00b8, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x00c1, blocks: (B:37:0x00bb, B:34:0x0081), top: B:58:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(long j, zje zjeVar, List list) {
        anu anuVar;
        long j2;
        long j3;
        j2u j2uVar;
        List list2;
        bnu bnuVar;
        Object g0g0Var;
        Unit unit;
        long j4;
        if (zjeVar instanceof anu) {
            anuVar = (anu) zjeVar;
            int i = anuVar.o;
            if ((i & Integer.MIN_VALUE) != 0) {
                anuVar.o = i - Integer.MIN_VALUE;
            } else {
                anuVar = new anu(this, zjeVar);
            }
        } else {
            anuVar = new anu(this, zjeVar);
        }
        anu anuVar2 = anuVar;
        Object objX = anuVar2.m;
        wne wneVar = wne.f39444a;
        int i2 = anuVar2.o;
        if (i2 == 0) {
            z1x.P(objX);
            try {
                e0g0 e0g0Var = j0g0.b;
                j2uVar = this.f2902a;
                pmi pmiVar = this.b;
                anuVar2.i = this;
                list2 = list;
                anuVar2.j = list2;
                anuVar2.k = j2uVar;
                j2 = j;
                try {
                    anuVar2.l = j2;
                    anuVar2.o = 1;
                    objX = pmiVar.x(anuVar2);
                    if (objX != wneVar) {
                        j3 = j2;
                        bnuVar = this;
                        int iIntValue = ((Number) objX).intValue();
                        boolean z = bnuVar.e.a().f13512a;
                        nh70 nh70Var = sub0.b;
                        sub0 sub0VarA = bnuVar.f.a();
                        nh70Var.getClass();
                        boolean zJ = nh70.j(sub0VarA);
                        boolean z2 = bnuVar.g.a().d.b;
                        anuVar2.i = null;
                        anuVar2.j = null;
                        anuVar2.k = null;
                        anuVar2.l = j3;
                        anuVar2.o = 2;
                        objX = j2uVar.a(list2, iIntValue, z, zJ, z2, anuVar2);
                        if (objX == wneVar) {
                            List list3 = (List) objX;
                            e0g0 e0g0Var2 = j0g0.b;
                            g0g0Var = list3;
                            if (!(g0g0Var instanceof g0g0)) {
                                List list4 = (List) g0g0Var;
                                anuVar2.i = g0g0Var;
                                anuVar2.j = null;
                                anuVar2.k = null;
                                anuVar2.l = j3;
                                anuVar2.o = 3;
                                yox yoxVar = ((ux80) this.c.f27640a).f36428a;
                                list4.getClass();
                                ((or30) yoxVar.f43005a).d(list4);
                                unit = Unit.f46060a;
                                wne wneVar2 = wne.f39444a;
                                if (unit != wneVar) {
                                    j4 = j3;
                                    j3 = j4;
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    j3 = j2;
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
            } catch (Throwable th2) {
                th = th2;
                j2 = j;
            }
            return wneVar;
        }
        if (i2 == 1) {
            long j5 = anuVar2.l;
            j2uVar = anuVar2.k;
            List list5 = anuVar2.j;
            bnuVar = (bnu) anuVar2.i;
            try {
                z1x.P(objX);
                j3 = j5;
                list2 = list5;
                try {
                    int iIntValue2 = ((Number) objX).intValue();
                    boolean z3 = bnuVar.e.a().f13512a;
                    nh70 nh70Var2 = sub0.b;
                    sub0 sub0VarA2 = bnuVar.f.a();
                    nh70Var2.getClass();
                    boolean zJ2 = nh70.j(sub0VarA2);
                    boolean z4 = bnuVar.g.a().d.b;
                    anuVar2.i = null;
                    anuVar2.j = null;
                    anuVar2.k = null;
                    anuVar2.l = j3;
                    anuVar2.o = 2;
                    objX = j2uVar.a(list2, iIntValue2, z3, zJ2, z4, anuVar2);
                    if (objX == wneVar) {
                        List list6 = (List) objX;
                        e0g0 e0g0Var4 = j0g0.b;
                        g0g0Var = list6;
                        if (!(g0g0Var instanceof g0g0)) {
                            List list7 = (List) g0g0Var;
                            anuVar2.i = g0g0Var;
                            anuVar2.j = null;
                            anuVar2.k = null;
                            anuVar2.l = j3;
                            anuVar2.o = 3;
                            yox yoxVar2 = ((ux80) this.c.f27640a).f36428a;
                            list7.getClass();
                            ((or30) yoxVar2.f43005a).d(list7);
                            unit = Unit.f46060a;
                            wne wneVar3 = wne.f39444a;
                            if (unit != wneVar) {
                                j4 = j3;
                                j3 = j4;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    e0g0 e0g0Var5 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
            } catch (Throwable th4) {
                th = th4;
                j3 = j5;
                e0g0 e0g0Var6 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            return wneVar;
        }
        if (i2 == 2) {
            long j6 = anuVar2.l;
            try {
                z1x.P(objX);
                j3 = j6;
                List list8 = (List) objX;
                e0g0 e0g0Var7 = j0g0.b;
                g0g0Var = list8;
            } catch (Throwable th5) {
                th = th5;
                j3 = j6;
                e0g0 e0g0Var8 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
            if (!(g0g0Var instanceof g0g0)) {
                List list9 = (List) g0g0Var;
                anuVar2.i = g0g0Var;
                anuVar2.j = null;
                anuVar2.k = null;
                anuVar2.l = j3;
                anuVar2.o = 3;
                yox yoxVar3 = ((ux80) this.c.f27640a).f36428a;
                list9.getClass();
                ((or30) yoxVar3.f43005a).d(list9);
                unit = Unit.f46060a;
                wne wneVar4 = wne.f39444a;
                if (unit != wneVar) {
                    j4 = j3;
                }
                return wneVar;
            }
        } else {
            if (i2 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j4 = anuVar2.l;
            g0g0Var = anuVar2.i;
            z1x.P(objX);
        }
        j3 = j4;
        e0g0 e0g0Var9 = j0g0.b;
        g0g0Var = new g0g0(th);
        if (!(g0g0Var instanceof g0g0)) {
            List list10 = (List) g0g0Var;
            anuVar2.i = g0g0Var;
            anuVar2.j = null;
            anuVar2.k = null;
            anuVar2.l = j3;
            anuVar2.o = 3;
            yox yoxVar4 = ((ux80) this.c.f27640a).f36428a;
            list10.getClass();
            ((or30) yoxVar4.f43005a).d(list10);
            unit = Unit.f46060a;
            wne wneVar5 = wne.f39444a;
            if (unit != wneVar) {
                j4 = j3;
                j3 = j4;
            }
            return wneVar;
        }
        return j0g0.a(g0g0Var) == null ? g0g0Var : (List) ((or30) ((ux80) this.d.f42558a).f36428a.f43005a).c(j3);
    }
}
