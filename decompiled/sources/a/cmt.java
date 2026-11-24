package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class cmt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4624a;
    public final Object b;

    public cmt(ju9 ju9Var) {
        this.f4624a = (byte) 9;
        ju9Var.getClass();
        this.b = ju9Var;
    }

    public static kdb j(ldb ldbVar, kdb kdbVar) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        String str = ldbVar.f;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<mdb> list = kdbVar.g;
        long j6 = kdbVar.d;
        long j7 = kdbVar.c;
        for (mdb mdbVar : list) {
            linkedHashMap.put(Long.valueOf(mdbVar.f21587a), mdb.c(mdbVar, 0L, 0L, null, false, 127));
        }
        long j8 = ldbVar.f19842a;
        long j9 = ldbVar.d;
        long j10 = ldbVar.c;
        mdb mdbVar2 = (mdb) linkedHashMap.get(Long.valueOf(j8));
        if (mdbVar2 != null) {
            Integer intOrNull = StringsKt.toIntOrNull(mdbVar2.g);
            int iIntValue = intOrNull != null ? intOrNull.intValue() : 0;
            Integer intOrNull2 = StringsKt.toIntOrNull(str);
            linkedHashMap.put(Long.valueOf(j8), mdb.c(mdbVar2, 0L, 0L, String.valueOf(iIntValue + (intOrNull2 != null ? intOrNull2.intValue() : 0)), false, 63));
            j = j10;
            j2 = j7;
            j5 = j9;
        } else {
            j = j10;
            long j11 = ldbVar.f19842a;
            j2 = j7;
            String str2 = ldbVar.b;
            long j12 = j != 0 ? j : j2;
            if (j9 != 0) {
                j4 = j9;
                j3 = j4;
            } else {
                j3 = j9;
                j4 = j6;
            }
            j5 = j3;
            linkedHashMap.put(Long.valueOf(j8), new mdb(j11, str2, j12, j4, kdbVar.b, ldbVar.e, str, false));
        }
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        List listL0 = CollectionsKt.L0(collectionValues);
        ArrayList arrayList = new ArrayList(r3d.q(listL0, 10));
        int i = 0;
        for (Object obj : listL0) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            mdb mdbVar3 = (mdb) obj;
            mdbVar3.getClass();
            arrayList.add(mdb.c(mdbVar3, 0L, 0L, null, i == listL0.size() - 1, 127));
            i = i2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(Long.valueOf(((mdb) it.next()).f21587a));
        }
        String strValueOf = String.valueOf(linkedHashSet.size());
        boolean z = kdbVar.h;
        if (j2 != 0) {
            j = j2;
        }
        return kdb.c(kdbVar, j, j6 != 0 ? j6 : j5, strValueOf, arrayList, z, 19);
    }

    public p7m0 a() {
        return ((bs20) this.b).f3107a.b;
    }

    public Object b(int i, zje zjeVar) {
        gkc gkcVar = (gkc) this.b;
        List list = (List) gkcVar.b.f9684a.get(Integer.valueOf(i));
        return list == null ? qjj.d0(gkcVar.d.b, new u52((Object) gkcVar, i, (yje) null, (byte) 3), zjeVar) : list;
    }

    public Object c(int i, bnn0 bnn0Var) {
        jyk jykVar = (jyk) this.b;
        Object obj = jykVar.b.f12133a.get(Integer.valueOf(i));
        if (obj == null) {
            obj = iun.f15405a;
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            return list;
        }
        Object objD0 = qjj.d0(jykVar.d.b, new u52((Object) jykVar, i, (yje) null, (byte) 6), bnn0Var);
        return objD0 == wne.f39444a ? objD0 : (List) objD0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public Object d(zje zjeVar) {
        yvt yvtVar;
        c1u c1uVar;
        byte b = this.f4624a;
        Object obj = this.b;
        yje yjeVar = null;
        byte b2 = 1;
        switch (b) {
            case 9:
                if (zjeVar instanceof yvt) {
                    yvtVar = (yvt) zjeVar;
                    int i = yvtVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        yvtVar.k = i - Integer.MIN_VALUE;
                    } else {
                        yvtVar = new yvt(this, zjeVar);
                    }
                } else {
                    yvtVar = new yvt(this, zjeVar);
                }
                Object objD0 = yvtVar.i;
                wne wneVar = wne.f39444a;
                int i2 = yvtVar.k;
                if (i2 == 0) {
                    z1x.P(objD0);
                    ju9 ju9Var = (ju9) obj;
                    yvtVar.k = 1;
                    objD0 = qjj.d0(ju9Var.c.b, new hu9(ju9Var, yjeVar, (byte) 0), yvtVar);
                    if (objD0 == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objD0);
                }
                return CollectionsKt.A0((Iterable) objD0, new vvt(b2));
            default:
                if (zjeVar instanceof c1u) {
                    c1uVar = (c1u) zjeVar;
                    int i3 = c1uVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c1uVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        c1uVar = new c1u(this, zjeVar);
                    }
                } else {
                    c1uVar = new c1u(this, zjeVar);
                }
                Object objB = c1uVar.i;
                Object obj2 = wne.f39444a;
                int i4 = c1uVar.k;
                if (i4 == 0) {
                    z1x.P(objB);
                    ahu ahuVarY = ((g45) ((wsf0) obj).b).y();
                    c1uVar.k = 1;
                    objB = ahuVarY.b(bm5.f2822a, c1uVar);
                    if (objB == obj2) {
                        return obj2;
                    }
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objB);
                }
                return new Long(((ql5) objB).e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object e(List list, Date date, long j, int i, boolean z, zje zjeVar) {
        wxt wxtVar;
        long j2;
        if (zjeVar instanceof wxt) {
            wxtVar = (wxt) zjeVar;
            int i2 = wxtVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wxtVar.l = i2 - Integer.MIN_VALUE;
            } else {
                wxtVar = new wxt(this, zjeVar);
            }
        } else {
            wxtVar = new wxt(this, zjeVar);
        }
        Object objJ = wxtVar.j;
        wne wneVar = wne.f39444a;
        int i3 = wxtVar.l;
        Object obj = null;
        if (i3 == 0) {
            z1x.P(objJ);
            zxt zxtVar = new zxt(this, x2x.T(date, z), list, i, (yje) null);
            wxtVar.i = j;
            wxtVar.l = 1;
            objJ = d5c.J(wxtVar, zxtVar);
            if (objJ == wneVar) {
                return wneVar;
            }
            j2 = j;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = wxtVar.i;
            z1x.P(objJ);
        }
        List list2 = (List) objJ;
        if (j2 == 0) {
            return list2;
        }
        for (Object obj2 : list2) {
            odb odbVar = (odb) obj2;
            if (odbVar != null) {
                if (odbVar instanceof kdb) {
                    if (((kdb) odbVar).d == j2) {
                        obj = obj2;
                        break;
                    }
                } else {
                    if ((odbVar instanceof ldb) && ((ldb) odbVar).d == j2) {
                        obj = obj2;
                        break;
                    }
                }
            }
        }
        odb odbVar2 = (odb) obj;
        if (odbVar2 == null) {
            return list2;
        }
        Collections.swap(list2, list2.indexOf(odbVar2), 1);
        return list2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object f(Set set, int i, Date date, boolean z, int i2, zje zjeVar) {
        gcu gcuVar;
        if (zjeVar instanceof gcu) {
            gcuVar = (gcu) zjeVar;
            int i3 = gcuVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gcuVar.k = i3 - Integer.MIN_VALUE;
            } else {
                gcuVar = new gcu(this, zjeVar);
            }
        } else {
            gcuVar = new gcu(this, zjeVar);
        }
        Object objJ = gcuVar.i;
        wne wneVar = wne.f39444a;
        int i4 = gcuVar.k;
        if (i4 == 0) {
            z1x.P(objJ);
            pwc pwcVar = new pwc(x2x.T(date, z), this, set, i, i2, null);
            gcuVar.k = 1;
            objJ = d5c.J(gcuVar, pwcVar);
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        return (List) objJ;
    }

    public String g() {
        sd60 sd60Var = (sd60) this.b;
        ane0 ane0Var = (ane0) sd60Var.c;
        kds0 kds0VarC = ane0Var.e;
        if (kds0VarC == null) {
            kds0VarC = ane0Var.c();
            if (kds0VarC != null) {
                ane0Var.e = kds0VarC;
            } else {
                kds0VarC = null;
            }
        }
        String str = kds0VarC != null ? kds0VarC.b : null;
        if (str == null) {
            str = "";
        }
        return StringsKt.W(str) ? "" : kng0.l(str, Separators.COLON, ((knf0) sd60Var.i).a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
    
        if (r10 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(int r7, long r8, a.zje r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof a.p2u
            if (r0 == 0) goto L13
            r0 = r10
            a.p2u r0 = (a.p2u) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            a.p2u r0 = new a.p2u
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.l
            a.wne r1 = a.wne.f39444a
            int r2 = r0.n
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r10)     // Catch: java.lang.Throwable -> L78
            goto L73
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L31:
            int r7 = r0.j
            long r8 = r0.i
            a.cmt r6 = r0.k
            a.z1x.P(r10)     // Catch: java.lang.Throwable -> L78
            goto L53
        L3b:
            a.z1x.P(r10)
            a.e0g0 r10 = a.j0g0.b     // Catch: java.lang.Throwable -> L78
            java.lang.Object r10 = r6.b     // Catch: java.lang.Throwable -> L78
            a.dzg r10 = (a.dzg) r10     // Catch: java.lang.Throwable -> L78
            r0.k = r6     // Catch: java.lang.Throwable -> L78
            r0.i = r8     // Catch: java.lang.Throwable -> L78
            r0.j = r7     // Catch: java.lang.Throwable -> L78
            r0.n = r5     // Catch: java.lang.Throwable -> L78
            java.lang.Object r10 = r10.a(r7, r8, r0)     // Catch: java.lang.Throwable -> L78
            if (r10 != r1) goto L53
            goto L72
        L53:
            a.yyg r10 = (a.yyg) r10     // Catch: java.lang.Throwable -> L78
            java.util.List r2 = r10.f43464a     // Catch: java.lang.Throwable -> L78
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L78
            if (r2 != 0) goto L5e
            goto L75
        L5e:
            java.lang.Object r6 = r6.b     // Catch: java.lang.Throwable -> L78
            a.dzg r6 = (a.dzg) r6     // Catch: java.lang.Throwable -> L78
            int r10 = r7 + (-1)
            r0.k = r3     // Catch: java.lang.Throwable -> L78
            r0.i = r8     // Catch: java.lang.Throwable -> L78
            r0.j = r7     // Catch: java.lang.Throwable -> L78
            r0.n = r4     // Catch: java.lang.Throwable -> L78
            java.lang.Object r10 = r6.a(r10, r8, r0)     // Catch: java.lang.Throwable -> L78
            if (r10 != r1) goto L73
        L72:
            return r1
        L73:
            a.yyg r10 = (a.yyg) r10     // Catch: java.lang.Throwable -> L78
        L75:
            a.e0g0 r6 = a.j0g0.b     // Catch: java.lang.Throwable -> L78
            return r10
        L78:
            r6 = move-exception
            a.e0g0 r7 = a.j0g0.b
            a.g0g0 r7 = new a.g0g0
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cmt.h(int, long, a.zje):java.lang.Object");
    }

    public Serializable i(long j) {
        j51 j51Var = ((n31) this.b).c;
        j51Var.getClass();
        try {
            e0g0 e0g0Var = j0g0.b;
            return (mlr) xp20.d(j51Var.f15912a, Long.valueOf(j));
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            return new g0g0(th);
        }
    }

    public cmt(sek sekVar, y4u y4uVar) {
        this.f4624a = (byte) 22;
        this.b = y4uVar;
    }

    public /* synthetic */ cmt(Object obj, byte b) {
        this.f4624a = b;
        this.b = obj;
    }

    public cmt(uzc uzcVar) {
        this.f4624a = (byte) 13;
        uzcVar.getClass();
        this.b = uzcVar;
    }

    public cmt(n31 n31Var) {
        this.f4624a = (byte) 2;
        n31Var.getClass();
        this.b = n31Var;
    }

    public cmt(gkc gkcVar) {
        this.f4624a = (byte) 12;
        gkcVar.getClass();
        this.b = gkcVar;
    }

    public cmt(jyk jykVar) {
        this.f4624a = (byte) 23;
        jykVar.getClass();
        this.b = jykVar;
    }

    public cmt(zfo zfoVar) {
        this.f4624a = (byte) 24;
        zfoVar.getClass();
        this.b = zfoVar;
    }

    public cmt(bs20 bs20Var) {
        this.f4624a = (byte) 17;
        bs20Var.getClass();
        this.b = bs20Var;
    }
}
