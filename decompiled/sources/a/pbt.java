package a;

import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class pbt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j5t f26724a;
    public final lsn b;
    public final g7d c;
    public final p2t d;
    public final uub0 e;
    public final r2t f;
    public final gxu g;
    public final knf0 h;
    public final btt0 i;
    public final lsn j;
    public final lhf0 k;
    public final pru l;
    public final mne m;
    public final kuy n;

    public pbt(j5t j5tVar, lsn lsnVar, g7d g7dVar, p2t p2tVar, uub0 uub0Var, r2t r2tVar, gxu gxuVar, knf0 knf0Var, btt0 btt0Var, lsn lsnVar2, lhf0 lhf0Var, pru pruVar, mne mneVar, kuy kuyVar, gii0 gii0Var) {
        j5tVar.getClass();
        g7dVar.getClass();
        p2tVar.getClass();
        uub0Var.getClass();
        r2tVar.getClass();
        knf0Var.getClass();
        btt0Var.getClass();
        kuyVar.getClass();
        gii0Var.getClass();
        this.f26724a = j5tVar;
        this.b = lsnVar;
        this.c = g7dVar;
        this.d = p2tVar;
        this.e = uub0Var;
        this.f = r2tVar;
        this.g = gxuVar;
        this.h = knf0Var;
        this.i = btt0Var;
        this.j = lsnVar2;
        this.k = lhf0Var;
        this.l = pruVar;
        this.m = mneVar;
        this.n = kuyVar;
        String string = ((SharedPreferences) lsnVar.f20589a).getString("autoSpinAmount", "AUTOSPIN_5");
        w(w05.valueOf(string != null ? string : "AUTOSPIN_5"));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zje zjeVar) {
        rat ratVar;
        if (zjeVar instanceof rat) {
            ratVar = (rat) zjeVar;
            int i = ratVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ratVar.k = i - Integer.MIN_VALUE;
            } else {
                ratVar = new rat(this, zjeVar);
            }
        } else {
            ratVar = new rat(this, zjeVar);
        }
        Object objB = ratVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ratVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            String strA = this.i.a();
            ratVar.k = 1;
            objB = ((fep) ((wgn) this.j.f20589a).invoke()).b(strA, new mv60(new Long(j)), ratVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        List list = ((jx60) ((dx5) objB).a()).f17289a;
        if (list == null) {
            list = iun.f15405a;
        }
        this.k.Q(list);
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar) {
        sat satVar;
        if (zjeVar instanceof sat) {
            satVar = (sat) zjeVar;
            int i = satVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                satVar.k = i - Integer.MIN_VALUE;
            } else {
                satVar = new sat(this, zjeVar);
            }
        } else {
            satVar = new sat(this, zjeVar);
        }
        Object obj = satVar.i;
        wne wneVar = wne.f39444a;
        int i2 = satVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            String strA = this.i.a();
            satVar.k = 1;
            if (this.j.b(strA, satVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        this.k.Q(iun.f15405a);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Serializable c(List list, String str, boolean z, zje zjeVar) {
        tat tatVar;
        Object next;
        hds hdsVar;
        if (zjeVar instanceof tat) {
            tatVar = (tat) zjeVar;
            int i = tatVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                tatVar.l = i - Integer.MIN_VALUE;
            } else {
                tatVar = new tat(this, zjeVar);
            }
        } else {
            tatVar = new tat(this, zjeVar);
        }
        tat tatVar2 = tatVar;
        Object objF = tatVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = tatVar2.l;
        if (i2 == 0) {
            z1x.P(objF);
            int iB = this.h.b();
            tatVar2.i = list;
            tatVar2.l = 1;
            objF = f(iB, tatVar2, str, z, true);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = tatVar2.i;
            z1x.P(objF);
        }
        d7d d7dVar = (d7d) objF;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (pbv pbvVar : list) {
            Iterator it = d7dVar.f5589a.f26136a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((pbv) next).f26728a != pbvVar.f26728a);
            pbv pbvVar2 = (pbv) next;
            if (pbvVar2 == null || (hdsVar = pbvVar2.n) == null) {
                hdsVar = pbvVar.n;
            }
            arrayList.add(pbv.a(pbvVar, hdsVar, false, false, 253951));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Serializable d(Set set, String str, boolean z, long j, zje zjeVar) {
        uat uatVar;
        if (zjeVar instanceof uat) {
            uatVar = (uat) zjeVar;
            int i = uatVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                uatVar.k = i - Integer.MIN_VALUE;
            } else {
                uatVar = new uat(this, zjeVar);
            }
        } else {
            uatVar = new uat(this, zjeVar);
        }
        uat uatVar2 = uatVar;
        Object objD0 = uatVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = uatVar2.k;
        if (i2 == 0) {
            z1x.P(objD0);
            if (set.isEmpty()) {
                return iun.f15405a;
            }
            uatVar2.k = 1;
            objD0 = qjj.d0(this.m.b, new up6(this, z, set, j, str, null), uatVar2);
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
        Iterable<pbv> iterable = (Iterable) objD0;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (pbv pbvVar : iterable) {
            pbvVar.getClass();
            long j2 = pbvVar.f26728a;
            String str2 = pbvVar.c;
            a570 a570Var = pbvVar.e;
            hds hdsVar = pbvVar.n;
            boolean z2 = pbvVar.p;
            str2.getClass();
            a570Var.getClass();
            hdsVar.getClass();
            arrayList.add(new nxy(j2, str2, a570Var, hdsVar, z2, !((Set) this.c.g.getValue()).contains(Long.valueOf(j2))));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object e(zje zjeVar, String str, boolean z) {
        vat vatVar;
        if (zjeVar instanceof vat) {
            vatVar = (vat) zjeVar;
            int i = vatVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                vatVar.k = i - Integer.MIN_VALUE;
            } else {
                vatVar = new vat(this, zjeVar);
            }
        } else {
            vatVar = new vat(this, zjeVar);
        }
        vat vatVar2 = vatVar;
        Object objF = vatVar2.i;
        Object obj = wne.f39444a;
        int i2 = vatVar2.k;
        if (i2 == 0) {
            z1x.P(objF);
            if (!this.l.a().l.f34278a) {
                return iun.f15405a;
            }
            int iB = this.h.b();
            vatVar2.k = 1;
            objF = f(iB, vatVar2, str, z, false);
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objF);
        }
        return ((d7d) objF).b;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(int i, zje zjeVar, String str, boolean z, boolean z2) {
        wat watVar;
        if (zjeVar instanceof wat) {
            watVar = (wat) zjeVar;
            int i2 = watVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                watVar.o = i2 - Integer.MIN_VALUE;
            } else {
                watVar = new wat(this, zjeVar);
            }
        } else {
            watVar = new wat(this, zjeVar);
        }
        wat watVar2 = watVar;
        Object objD = watVar2.m;
        Object obj = wne.f39444a;
        int i3 = watVar2.o;
        if (i3 == 0) {
            z1x.P(objD);
            watVar2.j = str;
            watVar2.i = i;
            watVar2.k = z;
            watVar2.l = z2;
            watVar2.o = 1;
            objD = this.c.d(watVar2);
            if (objD != obj) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                z1x.P(objD);
                return objD;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z2 = watVar2.l;
        z = watVar2.k;
        i = watVar2.i;
        str = watVar2.j;
        z1x.P(objD);
        d7d d7dVar = (d7d) objD;
        if (d7dVar != null) {
            return d7dVar;
        }
        watVar2.j = null;
        watVar2.i = i;
        watVar2.k = z;
        watVar2.l = z2;
        watVar2.o = 2;
        Object objG = g(i, watVar2, str, z, z2);
        return objG == obj ? obj : objG;
    }

    public final Object g(int i, zje zjeVar, String str, boolean z, boolean z2) {
        pru pruVar = this.l;
        if (z2 && !pruVar.a().d.b) {
            iun iunVar = iun.f15405a;
            return new d7d(new p070(iunVar, iunVar), iunVar);
        }
        boolean z3 = pruVar.a().V1;
        dvj dvjVar = this.m.b;
        if (z3) {
            return qjj.d0(dvjVar, new zat((byte) 0, i, null, this, str, z), zjeVar);
        }
        return qjj.d0(dvjVar, new zat((byte) 1, i, null, this, str, z), zjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object h(long j, zje zjeVar, String str, boolean z) {
        abt abtVar;
        long j2;
        if (zjeVar instanceof abt) {
            abtVar = (abt) zjeVar;
            int i = abtVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                abtVar.l = i - Integer.MIN_VALUE;
            } else {
                abtVar = new abt(this, zjeVar);
            }
        } else {
            abtVar = new abt(this, zjeVar);
        }
        Object objF = abtVar.j;
        Object obj = wne.f39444a;
        int i2 = abtVar.l;
        Object obj2 = null;
        if (i2 == 0) {
            z1x.P(objF);
            int iB = this.h.b();
            abtVar.i = j;
            abtVar.l = 1;
            objF = f(iB, abtVar, str, z, true);
            if (objF == obj) {
                return obj;
            }
            j2 = j;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = abtVar.i;
            z1x.P(objF);
        }
        for (Object obj3 : ((d7d) objF).f5589a.f26136a) {
            if (((pbv) obj3).f26728a == j2) {
                obj2 = obj3;
                break;
            }
        }
        pbv pbvVar = (pbv) obj2;
        if (pbvVar != null) {
            return pbvVar;
        }
        iun iunVar = iun.f15405a;
        hcs hcsVar = hcs.NONE;
        w470 w470Var = new w470(s470.GAME_UNAVAILABLE);
        hds.Companion.getClass();
        return new pbv(0L, iunVar, "", hcsVar, w470Var, "", false, false, false, false, false, false, dds.a(), false, false, false, 196608);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object i(long j, zje zjeVar, String str, boolean z) {
        bbt bbtVar;
        t470 t470Var;
        long j2;
        if (zjeVar instanceof bbt) {
            bbtVar = (bbt) zjeVar;
            int i = bbtVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                bbtVar.n = i - Integer.MIN_VALUE;
            } else {
                bbtVar = new bbt(this, zjeVar);
            }
        } else {
            bbtVar = new bbt(this, zjeVar);
        }
        bbt bbtVar2 = bbtVar;
        Object obj = bbtVar2.l;
        Object obj2 = wne.f39444a;
        int i2 = bbtVar2.n;
        Object obj3 = null;
        if (i2 == 0) {
            z1x.P(obj);
            t470 t470Var2 = a570.Companion;
            int iB = this.h.b();
            bbtVar2.k = t470Var2;
            bbtVar2.i = j;
            bbtVar2.j = j;
            bbtVar2.n = 1;
            Object objF = f(iB, bbtVar2, str, z, true);
            if (objF == obj2) {
                return obj2;
            }
            obj = objF;
            t470Var = t470Var2;
            j2 = j;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = bbtVar2.j;
            j2 = bbtVar2.i;
            t470Var = bbtVar2.k;
            z1x.P(obj);
        }
        for (Object obj4 : ((d7d) obj).f5589a.f26136a) {
            if (((pbv) obj4).f26728a == j2) {
                obj3 = obj4;
                break;
            }
        }
        pbv pbvVar = (pbv) obj3;
        boolean z2 = pbvVar != null ? pbvVar.k : false;
        t470Var.getClass();
        return t470.a(z2, j);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    public final Serializable j(String str, zje zjeVar) {
        cbt cbtVar;
        rq60 rq60Var;
        ?? arrayList;
        puo puoVar;
        if (zjeVar instanceof cbt) {
            cbtVar = (cbt) zjeVar;
            int i = cbtVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cbtVar.k = i - Integer.MIN_VALUE;
            } else {
                cbtVar = new cbt(this, zjeVar);
            }
        } else {
            cbtVar = new cbt(this, zjeVar);
        }
        cbt cbtVar2 = cbtVar;
        Object objG = cbtVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = cbtVar2.k;
        ArrayList arrayList2 = null;
        if (i2 == 0) {
            z1x.P(objG);
            this.h.getClass();
            String strA = this.n.a();
            cbtVar2.k = 1;
            objG = ((is60) ((o270) this.g.c).invoke()).g(str, 22, 1, new Integer(1357), strA, null, null, cbtVar2);
            if (objG == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objG);
        }
        List<dq60> list = ((eq60) ((dx5) objG).a()).f8222a;
        if (list != null) {
            ArrayList arrayList3 = new ArrayList();
            for (dq60 dq60Var : list) {
                Integer num = dq60Var.f6499a;
                if (num != null) {
                    int iIntValue = num.intValue();
                    String str2 = dq60Var.b;
                    String str3 = str2 == null ? "" : str2;
                    String str4 = dq60Var.c;
                    String str5 = str4 == null ? "" : str4;
                    Boolean bool = dq60Var.d;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    List<cq60> list2 = dq60Var.e;
                    if (list2 != null) {
                        arrayList = new ArrayList();
                        for (cq60 cq60Var : list2) {
                            Integer num2 = cq60Var.f4777a;
                            if (num2 != null) {
                                String str6 = cq60Var.b;
                                if (str6 == null) {
                                    str6 = "";
                                }
                                puoVar = new puo(num2, str6);
                            } else {
                                puoVar = null;
                            }
                            if (puoVar != null) {
                                arrayList.add(puoVar);
                            }
                        }
                    } else {
                        arrayList = 0;
                    }
                    if (arrayList == 0) {
                        arrayList = iun.f15405a;
                    }
                    rq60Var = new rq60(iIntValue, str3, str5, arrayList, zBooleanValue);
                } else {
                    rq60Var = null;
                }
                if (rq60Var != null) {
                    arrayList3.add(rq60Var);
                }
            }
            arrayList2 = arrayList3;
        }
        return arrayList2 == null ? iun.f15405a : arrayList2;
    }

    public final Object k(boolean z, zje zjeVar) {
        List listA = this.d.a();
        return listA == null ? qjj.d0(this.m.b, new ebt(true, this, z, null), zjeVar) : listA;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [a.iun] */
    public final Serializable l(String str, zje zjeVar) {
        dbt dbtVar;
        ?? arrayList;
        if (zjeVar instanceof dbt) {
            dbtVar = (dbt) zjeVar;
            int i = dbtVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dbtVar.k = i - Integer.MIN_VALUE;
            } else {
                dbtVar = new dbt(this, zjeVar);
            }
        } else {
            dbtVar = new dbt(this, zjeVar);
        }
        dbt dbtVar2 = dbtVar;
        Object objA = dbtVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = dbtVar2.k;
        ArrayList arrayList2 = null;
        if (i2 == 0) {
            z1x.P(objA);
            this.h.getClass();
            String strA = this.n.a();
            dbtVar2.k = 1;
            objA = ((nz60) ((o270) this.g.b).invoke()).a(str, 22, strA, 1, 1357, dbtVar2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List list = ((oq60) ((u2t) objA).a()).f25673a;
        if (list != null) {
            ArrayList<nq60> arrayListS = CollectionsKt.S(list);
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayListS, 10));
            for (nq60 nq60Var : arrayListS) {
                nq60Var.getClass();
                Integer num = nq60Var.f23945a;
                int iIntValue = num != null ? num.intValue() : 0;
                String str2 = nq60Var.b;
                String str3 = str2 == null ? "" : str2;
                String str4 = nq60Var.c;
                String str5 = str4 == null ? "" : str4;
                Boolean bool = nq60Var.d;
                boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                List list2 = nq60Var.e;
                if (list2 != null) {
                    ArrayList<mq60> arrayListS2 = CollectionsKt.S(list2);
                    arrayList = new ArrayList(r3d.q(arrayListS2, 10));
                    for (mq60 mq60Var : arrayListS2) {
                        Integer num2 = mq60Var.f22208a;
                        Integer numValueOf = Integer.valueOf(num2 != null ? num2.intValue() : 0);
                        String str6 = mq60Var.b;
                        if (str6 == null) {
                            str6 = "";
                        }
                        arrayList.add(new puo(numValueOf, str6));
                    }
                } else {
                    arrayList = 0;
                }
                if (arrayList == 0) {
                    arrayList = iun.f15405a;
                }
                arrayList3.add(new rq60(iIntValue, str3, str5, arrayList, zBooleanValue));
            }
            arrayList2 = arrayList3;
        }
        return arrayList2 == null ? iun.f15405a : arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Serializable m(List list, zje zjeVar) {
        gbt gbtVar;
        if (zjeVar instanceof gbt) {
            gbtVar = (gbt) zjeVar;
            int i = gbtVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gbtVar.k = i - Integer.MIN_VALUE;
            } else {
                gbtVar = new gbt(this, zjeVar);
            }
        } else {
            gbtVar = new gbt(this, zjeVar);
        }
        gbt gbtVar2 = gbtVar;
        Object objC = gbtVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = gbtVar2.k;
        if (i2 == 0) {
            z1x.P(objC);
            this.h.getClass();
            String strA = this.n.a();
            gbtVar2.k = 1;
            objC = ((is60) ((o270) this.g.c).invoke()).c(list, 22, 1, null, strA, null, null, gbtVar2);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        List<xq60> list2 = (List) ((dx5) objC).b;
        if (list2 == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        for (xq60 xq60Var : list2) {
            xq60Var.getClass();
            Integer num = xq60Var.f41302a;
            int iIntValue = num != null ? num.intValue() : 0;
            be70 be70Var = xq60Var.b;
            if (be70Var == null) {
                jf4.k(null);
                return null;
            }
            arrayList.add(new uq60(iIntValue, wpm0.r(be70Var)));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Serializable n(List list, zje zjeVar) {
        hbt hbtVar;
        if (zjeVar instanceof hbt) {
            hbtVar = (hbt) zjeVar;
            int i = hbtVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hbtVar.k = i - Integer.MIN_VALUE;
            } else {
                hbtVar = new hbt(this, zjeVar);
            }
        } else {
            hbtVar = new hbt(this, zjeVar);
        }
        hbt hbtVar2 = hbtVar;
        Object objC = hbtVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = hbtVar2.k;
        if (i2 == 0) {
            z1x.P(objC);
            this.h.getClass();
            String strA = this.n.a();
            hbtVar2.k = 1;
            objC = ((nz60) ((o270) this.g.b).invoke()).c(list, 22, strA, 1, hbtVar2);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        Iterable<ar60> iterable = (Iterable) ((dx5) objC).a();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (ar60 ar60Var : iterable) {
            ar60Var.getClass();
            Integer num = ar60Var.f1331a;
            int iIntValue = num != null ? num.intValue() : 0;
            be70 be70Var = ar60Var.b;
            if (be70Var == null) {
                jf4.k(null);
                return null;
            }
            arrayList.add(new uq60(iIntValue, wpm0.r(be70Var)));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r10 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(boolean r6, java.lang.String r7, boolean r8, boolean r9, a.zje r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof a.ibt
            if (r0 == 0) goto L13
            r0 = r10
            a.ibt r0 = (a.ibt) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.ibt r0 = new a.ibt
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r10)
            goto L62
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L31:
            a.z1x.P(r10)
            goto L4d
        L35:
            a.z1x.P(r10)
            a.knf0 r10 = r5.h
            if (r6 == 0) goto L50
            int r6 = r10.b()
            r0.k = r4
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r0
            java.lang.Object r10 = r5.g(r6, r7, r8, r9, r10)
            if (r10 != r1) goto L4d
            goto L61
        L4d:
            a.d7d r10 = (a.d7d) r10
            goto L64
        L50:
            r6 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r0
            int r6 = r6.b()
            r7.k = r3
            java.lang.Object r10 = r5.f(r6, r7, r8, r9, r10)
            if (r10 != r1) goto L62
        L61:
            return r1
        L62:
            a.d7d r10 = (a.d7d) r10
        L64:
            a.p070 r5 = r10.f5589a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pbt.o(boolean, java.lang.String, boolean, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
    
        if (r0 == r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e4, code lost:
    
        if (r0 == r2) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(boolean r14, java.util.Set r15, long r16, a.zje r18) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pbt.p(boolean, java.util.Set, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (r0 == r3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0091, code lost:
    
        if (r0 == r3) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(boolean r14, java.util.Set r15, long r16, a.zje r18) {
        /*
            r13 = this;
            r0 = r18
            a.gxu r1 = r13.g
            java.lang.Object r1 = r1.b
            a.o270 r1 = (a.o270) r1
            boolean r2 = r0 instanceof a.kbt
            if (r2 == 0) goto L1b
            r2 = r0
            a.kbt r2 = (a.kbt) r2
            int r3 = r2.k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.k = r3
            goto L20
        L1b:
            a.kbt r2 = new a.kbt
            r2.<init>(r13, r0)
        L20:
            java.lang.Object r0 = r2.i
            a.wne r3 = a.wne.f39444a
            int r4 = r2.k
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3d
            if (r4 == r6) goto L39
            if (r4 != r5) goto L32
            a.z1x.P(r0)
            goto L94
        L32:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r13)
            r13 = 0
            return r13
        L39:
            a.z1x.P(r0)
            goto L6e
        L3d:
            a.z1x.P(r0)
            a.kuy r0 = r13.n
            a.knf0 r4 = r13.h
            if (r14 == 0) goto L75
            a.btt0 r13 = r13.i
            java.lang.String r13 = r13.a()
            a.vs60 r7 = new a.vs60
            r4.getClass()
            java.lang.String r10 = r0.a()
            int r11 = r4.b()
            r12 = r15
            r8 = r16
            r7.<init>(r8, r10, r11, r12)
            r2.k = r6
            java.lang.Object r14 = r1.invoke()
            a.nz60 r14 = (a.nz60) r14
            java.lang.Object r0 = r14.b(r13, r7, r2)
            if (r0 != r3) goto L6e
            goto L93
        L6e:
            a.u2t r0 = (a.u2t) r0
            java.lang.Object r13 = r0.a()
            return r13
        L75:
            a.ps60 r13 = new a.ps60
            r4.getClass()
            java.lang.String r14 = r0.a()
            int r0 = r4.b()
            r13.<init>(r14, r0, r15)
            r2.k = r5
            java.lang.Object r14 = r1.invoke()
            a.nz60 r14 = (a.nz60) r14
            java.lang.Object r0 = r14.g(r13, r2)
            if (r0 != r3) goto L94
        L93:
            return r3
        L94:
            a.u2t r0 = (a.u2t) r0
            java.lang.Object r13 = r0.a()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: a.pbt.q(boolean, java.util.Set, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable r(zje zjeVar) {
        lbt lbtVar;
        Serializable g0g0Var;
        if (zjeVar instanceof lbt) {
            lbtVar = (lbt) zjeVar;
            int i = lbtVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lbtVar.k = i - Integer.MIN_VALUE;
            } else {
                lbtVar = new lbt(this, zjeVar);
            }
        } else {
            lbtVar = new lbt(this, zjeVar);
        }
        Object objD = lbtVar.i;
        wne wneVar = wne.f39444a;
        int i2 = lbtVar.k;
        boolean z = true;
        try {
            if (i2 == 0) {
                z1x.P(objD);
                e0g0 e0g0Var = j0g0.b;
                g7d g7dVar = this.c;
                lbtVar.k = 1;
                objD = g7dVar.d(lbtVar);
                if (objD == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objD);
            }
            if (objD == null) {
                z = false;
            }
            g0g0Var = Boolean.valueOf(z);
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return g0g0Var instanceof g0g0 ? Boolean.FALSE : g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Serializable s(List list, zje zjeVar) {
        mbt mbtVar;
        if (zjeVar instanceof mbt) {
            mbtVar = (mbt) zjeVar;
            int i = mbtVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mbtVar.k = i - Integer.MIN_VALUE;
            } else {
                mbtVar = new mbt(this, zjeVar);
            }
        } else {
            mbtVar = new mbt(this, zjeVar);
        }
        mbt mbtVar2 = mbtVar;
        Object objE = mbtVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = mbtVar2.k;
        if (i2 == 0) {
            z1x.P(objE);
            this.h.getClass();
            String strA = this.n.a();
            mbtVar2.k = 1;
            objE = ((is60) ((o270) this.g.c).invoke()).e(list, 22, 1, new Integer(1357), strA, null, null, mbtVar2);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objE);
        }
        List<qo60> list2 = (List) ((dx5) objE).b;
        if (list2 == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        for (qo60 qo60Var : list2) {
            qo60Var.getClass();
            Integer num = qo60Var.f29058a;
            if (num == null) {
                jf4.k(null);
                return null;
            }
            long jIntValue = num.intValue();
            be70 be70Var = qo60Var.b;
            if (be70Var == null) {
                jf4.k(null);
                return null;
            }
            arrayList.add(new no60(jIntValue, wpm0.r(be70Var)));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Serializable t(List list, zje zjeVar) {
        nbt nbtVar;
        vpv0 vpv0Var;
        if (zjeVar instanceof nbt) {
            nbtVar = (nbt) zjeVar;
            int i = nbtVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbtVar.k = i - Integer.MIN_VALUE;
            } else {
                nbtVar = new nbt(this, zjeVar);
            }
        } else {
            nbtVar = new nbt(this, zjeVar);
        }
        nbt nbtVar2 = nbtVar;
        Object objF = nbtVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = nbtVar2.k;
        if (i2 == 0) {
            z1x.P(objF);
            this.h.getClass();
            String strA = this.n.a();
            nbtVar2.k = 1;
            objF = ((nz60) ((o270) this.g.b).invoke()).f(list, 22, 1, strA, 1357, nbtVar2);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objF);
        }
        Iterable<vo60> iterable = (Iterable) objF;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (vo60 vo60Var : iterable) {
            vo60Var.getClass();
            Long l = vo60Var.f37751a;
            if (l == null) {
                jf4.k(null);
                return null;
            }
            long jLongValue = l.longValue();
            uo60 uo60Var = vo60Var.b;
            if (uo60Var == null) {
                jf4.k(null);
                return null;
            }
            int i3 = wpv0.f39562a[uo60Var.ordinal()];
            if (i3 == 1) {
                vpv0Var = vpv0.f37827a;
            } else if (i3 == 2) {
                vpv0Var = vpv0.b;
            } else {
                if (i3 != 3) {
                    t9f.b();
                    return null;
                }
                vpv0Var = vpv0.c;
            }
            arrayList.add(new no60(jLongValue, vpv0Var));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(long j, zje zjeVar) {
        obt obtVar;
        if (zjeVar instanceof obt) {
            obtVar = (obt) zjeVar;
            int i = obtVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                obtVar.k = i - Integer.MIN_VALUE;
            } else {
                obtVar = new obt(this, zjeVar);
            }
        } else {
            obtVar = new obt(this, zjeVar);
        }
        Object objC = obtVar.i;
        wne wneVar = wne.f39444a;
        int i2 = obtVar.k;
        if (i2 == 0) {
            z1x.P(objC);
            String strA = this.i.a();
            obtVar.k = 1;
            objC = ((fep) ((wgn) this.j.f20589a).invoke()).c(strA, new mv60(new Long(j)), obtVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        List list = ((jx60) ((dx5) objC).a()).f17289a;
        if (list == null) {
            list = iun.f15405a;
        }
        this.k.Q(list);
        return list;
    }

    public final void v(w05 w05Var) {
        w05Var.getClass();
        ((SharedPreferences) this.b.f20589a).edit().putString("autoSpinAmount", w05Var.toString()).apply();
        w(w05Var);
    }

    public final void w(w05 w05Var) {
        int i;
        w05Var.getClass();
        int iOrdinal = w05Var.ordinal();
        if (iOrdinal == 0) {
            i = -1;
        } else if (iOrdinal == 1) {
            i = 5;
        } else if (iOrdinal == 2) {
            i = 10;
        } else if (iOrdinal == 3) {
            i = 25;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return;
            }
            i = 50;
        }
        this.f26724a.e = i;
        j5t.a(Integer.valueOf(i), "autoSpinsLeft");
    }
}
