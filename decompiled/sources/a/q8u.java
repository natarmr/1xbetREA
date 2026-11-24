package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class q8u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2u f28316a;
    public final pmi b;
    public final o8u c;
    public final o8u d;
    public final epc e;
    public final kqc f;
    public final pru g;

    public q8u(j2u j2uVar, pmi pmiVar, o8u o8uVar, o8u o8uVar2, epc epcVar, kqc kqcVar, pru pruVar) {
        j2uVar.getClass();
        this.f28316a = j2uVar;
        this.b = pmiVar;
        this.c = o8uVar;
        this.d = o8uVar2;
        this.e = epcVar;
        this.f = kqcVar;
        this.g = pruVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd A[Catch: all -> 0x00d3, PHI: r0 r2 r13
  0x00cd: PHI (r0v21 java.lang.Object) = (r0v14 java.lang.Object), (r0v1 java.lang.Object) binds: [B:38:0x00ca, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r2v12 boolean) = (r2v1 boolean), (r2v15 boolean) binds: [B:38:0x00ca, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE]
  0x00cd: PHI (r13v6 long) = (r13v2 long), (r13v12 long) binds: [B:38:0x00ca, B:19:0x004c] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {all -> 0x00d3, blocks: (B:40:0x00cd, B:37:0x0091), top: B:71:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:54:0x010d  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object a(List list, boolean z, long j, zje zjeVar) {
        p8u p8uVar;
        long j2;
        long j3;
        j2u j2uVar;
        List list2;
        q8u q8uVar;
        Object g0g0Var;
        Unit unit;
        long j4;
        Object g0g0Var2;
        boolean z2 = z;
        if (zjeVar instanceof p8u) {
            p8uVar = (p8u) zjeVar;
            int i = p8uVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                p8uVar.p = i - Integer.MIN_VALUE;
            } else {
                p8uVar = new p8u(this, zjeVar);
            }
        } else {
            p8uVar = new p8u(this, zjeVar);
        }
        p8u p8uVar2 = p8uVar;
        Object objX = p8uVar2.n;
        wne wneVar = wne.f39444a;
        int i2 = p8uVar2.p;
        if (i2 == 0) {
            z1x.P(objX);
            if (!z2) {
                return iun.f15405a;
            }
            try {
                e0g0 e0g0Var = j0g0.b;
                j2uVar = this.f28316a;
                pmi pmiVar = this.b;
                p8uVar2.i = this;
                list2 = list;
                p8uVar2.j = list2;
                p8uVar2.k = j2uVar;
                p8uVar2.l = z2;
                j2 = j;
                try {
                    p8uVar2.m = j2;
                    p8uVar2.p = 1;
                    objX = pmiVar.x(p8uVar2);
                    if (objX != wneVar) {
                        j3 = j2;
                        q8uVar = this;
                        int iIntValue = ((Number) objX).intValue();
                        boolean z3 = q8uVar.e.a().f13512a;
                        nh70 nh70Var = sub0.b;
                        sub0 sub0VarA = q8uVar.f.a();
                        nh70Var.getClass();
                        boolean zJ = nh70.j(sub0VarA);
                        boolean z4 = q8uVar.g.a().d.b;
                        p8uVar2.i = null;
                        p8uVar2.j = null;
                        p8uVar2.k = null;
                        p8uVar2.l = z2;
                        p8uVar2.m = j3;
                        p8uVar2.p = 2;
                        objX = j2uVar.a(list2, iIntValue, z3, zJ, z4, p8uVar2);
                        if (objX == wneVar) {
                            List list3 = (List) objX;
                            e0g0 e0g0Var2 = j0g0.b;
                            g0g0Var = list3;
                            if (!(g0g0Var instanceof g0g0)) {
                                List list4 = (List) g0g0Var;
                                p8uVar2.i = g0g0Var;
                                p8uVar2.j = null;
                                p8uVar2.k = null;
                                p8uVar2.l = z2;
                                p8uVar2.m = j3;
                                p8uVar2.p = 3;
                                ehf0 ehf0Var = this.c.f24850a.f1850a;
                                list4.getClass();
                                ((or30) ehf0Var.b).d(list4);
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
            long j5 = p8uVar2.m;
            z2 = p8uVar2.l;
            j2uVar = p8uVar2.k;
            List list5 = p8uVar2.j;
            q8uVar = (q8u) p8uVar2.i;
            try {
                z1x.P(objX);
                j3 = j5;
                list2 = list5;
                try {
                    int iIntValue2 = ((Number) objX).intValue();
                    boolean z5 = q8uVar.e.a().f13512a;
                    nh70 nh70Var2 = sub0.b;
                    sub0 sub0VarA2 = q8uVar.f.a();
                    nh70Var2.getClass();
                    boolean zJ2 = nh70.j(sub0VarA2);
                    boolean z6 = q8uVar.g.a().d.b;
                    p8uVar2.i = null;
                    p8uVar2.j = null;
                    p8uVar2.k = null;
                    p8uVar2.l = z2;
                    p8uVar2.m = j3;
                    p8uVar2.p = 2;
                    objX = j2uVar.a(list2, iIntValue2, z5, zJ2, z6, p8uVar2);
                    if (objX == wneVar) {
                        List list6 = (List) objX;
                        e0g0 e0g0Var4 = j0g0.b;
                        g0g0Var = list6;
                        if (!(g0g0Var instanceof g0g0)) {
                            List list7 = (List) g0g0Var;
                            p8uVar2.i = g0g0Var;
                            p8uVar2.j = null;
                            p8uVar2.k = null;
                            p8uVar2.l = z2;
                            p8uVar2.m = j3;
                            p8uVar2.p = 3;
                            ehf0 ehf0Var2 = this.c.f24850a.f1850a;
                            list7.getClass();
                            ((or30) ehf0Var2.b).d(list7);
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
            long j6 = p8uVar2.m;
            z2 = p8uVar2.l;
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
                p8uVar2.i = g0g0Var;
                p8uVar2.j = null;
                p8uVar2.k = null;
                p8uVar2.l = z2;
                p8uVar2.m = j3;
                p8uVar2.p = 3;
                ehf0 ehf0Var3 = this.c.f24850a.f1850a;
                list9.getClass();
                ((or30) ehf0Var3.b).d(list9);
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
            j4 = p8uVar2.m;
            g0g0Var = p8uVar2.i;
            z1x.P(objX);
        }
        j3 = j4;
        e0g0 e0g0Var9 = j0g0.b;
        g0g0Var = new g0g0(th);
        if (!(g0g0Var instanceof g0g0)) {
            List list10 = (List) g0g0Var;
            p8uVar2.i = g0g0Var;
            p8uVar2.j = null;
            p8uVar2.k = null;
            p8uVar2.l = z2;
            p8uVar2.m = j3;
            p8uVar2.p = 3;
            ehf0 ehf0Var4 = this.c.f24850a.f1850a;
            list10.getClass();
            ((or30) ehf0Var4.b).d(list10);
            unit = Unit.f46060a;
            wne wneVar5 = wne.f39444a;
            if (unit != wneVar) {
                j4 = j3;
                j3 = j4;
            }
            return wneVar;
        }
        if (j0g0.a(g0g0Var) != null) {
            try {
                g0g0Var2 = (List) ((or30) this.d.f24850a.f1850a.b).c(j3);
            } catch (Throwable th6) {
                e0g0 e0g0Var10 = j0g0.b;
                g0g0Var2 = new g0g0(th6);
            }
            if (j0g0.a(g0g0Var2) != null) {
                g0g0Var2 = iun.f15405a;
            }
            g0g0Var = (List) g0g0Var2;
        }
        return (List) g0g0Var;
    }
}
