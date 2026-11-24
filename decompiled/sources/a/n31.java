package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class n31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xzp f22826a;
    public final knf0 b;
    public final j51 c;
    public final x2c0 d;
    public final btt0 e;

    public n31(xzp xzpVar, knf0 knf0Var, j51 j51Var, x2c0 x2c0Var, btt0 btt0Var) {
        knf0Var.getClass();
        j51Var.getClass();
        x2c0Var.getClass();
        btt0Var.getClass();
        this.f22826a = xzpVar;
        this.b = knf0Var;
        this.c = j51Var;
        this.d = x2c0Var;
        this.e = btt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:56:0x0108 A[LOOP:1: B:54:0x0102->B:56:0x0108, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x011a  */
    /* JADX WARN: Code duplicated, block: B:71:0x016c  */
    /* JADX WARN: Code duplicated, block: B:74:0x017f A[LOOP:0: B:72:0x0179->B:74:0x017f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0191  */
    /* JADX WARN: Code duplicated, block: B:79:0x0194 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    public final Serializable a(long j, List list, List list2, String str, String str2, boolean z, String str3, String str4, String str5, int i, int i2, boolean z2, boolean z3, zje zjeVar) {
        m31 m31Var;
        String str6;
        ArrayList arrayList;
        Object g0g0Var;
        String str7;
        List list3;
        ArrayList arrayList2;
        Iterator it;
        List list4;
        ArrayList arrayList3;
        Iterator it2;
        if (zjeVar instanceof m31) {
            m31Var = (m31) zjeVar;
            int i3 = m31Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m31Var.l = i3 - Integer.MIN_VALUE;
            } else {
                m31Var = new m31(this, zjeVar);
            }
        } else {
            m31Var = new m31(this, zjeVar);
        }
        Object objZ = m31Var.j;
        wne wneVar = wne.f39444a;
        int i4 = m31Var.l;
        ArrayList arrayList4 = null;
        if (i4 != 0) {
            if (i4 == 1) {
                str7 = m31Var.i;
                z1x.P(objZ);
                list3 = ((ty0) ((dx5) objZ).a()).f34728a;
                if (list3 != null) {
                    arrayList2 = new ArrayList(r3d.q(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(saj.h0((bw0) it.next(), str7));
                    }
                    arrayList4 = arrayList2;
                }
                if (arrayList4 == null) {
                    return iun.f15405a;
                }
                return arrayList4;
            }
            if (i4 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str6 = m31Var.i;
            z1x.P(objZ);
            list4 = ((bt0) ((dx5) objZ).a()).f3158a;
            if (list4 != null) {
                arrayList3 = new ArrayList(r3d.q(list4, 10));
                it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(saj.g0((ys0) it2.next(), str6));
                }
                arrayList4 = arrayList3;
            }
            if (arrayList4 == null) {
                return iun.f15405a;
            }
            return arrayList4;
        }
        z1x.P(objZ);
        xzp xzpVar = this.f22826a;
        if (!z3) {
            knf0 knf0Var = this.b;
            int iB = knf0Var.b();
            m2c0 m2c0VarA = this.d.a();
            Integer intOrNull = m2c0VarA != null ? StringsKt.toIntOrNull(m2c0VarA.c) : null;
            String strC = knf0Var.c();
            m31Var.i = str5;
            m31Var.l = 2;
            Object objA = xzpVar.A(j, intOrNull, str4, list, list2, str3, iB, z2, i2, i, z, strC, m31Var);
            if (objA == wneVar) {
                return wneVar;
            }
            objZ = objA;
            str6 = str5;
            list4 = ((bt0) ((dx5) objZ).a()).f3158a;
            if (list4 != null) {
                arrayList3 = new ArrayList(r3d.q(list4, 10));
                it2 = list4.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(saj.g0((ys0) it2.next(), str6));
                }
                arrayList4 = arrayList3;
            }
            if (arrayList4 == null) {
                return iun.f15405a;
            }
            return arrayList4;
        }
        Long l = new Long(j);
        if (l.longValue() == nw80.t.getId()) {
            l = null;
        }
        List listK = q3d.k(l);
        List list5 = z2 ? null : list2;
        if (z2) {
            ArrayList arrayList5 = new ArrayList(r3d.q(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                axq.t(Long.parseLong((String) it3.next()), arrayList5);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        jo20 jo20VarK = cwr0.K(i2, i, list, null, listK, list5, arrayList, null, str3, null, Boolean.valueOf(z), str, str2, 5768);
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = this.e.a();
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        String str8 = (String) g0g0Var;
        if (str8 == null || str8.length() <= 0) {
            str8 = null;
        }
        m31Var.i = str5;
        m31Var.l = 1;
        objZ = xzp.z(xzpVar, jo20VarK, str8, m31Var);
        if (objZ == wneVar) {
            return wneVar;
        }
        str7 = str5;
        list3 = ((ty0) ((dx5) objZ).a()).f34728a;
        if (list3 != null) {
            arrayList2 = new ArrayList(r3d.q(list3, 10));
            it = list3.iterator();
            while (it.hasNext()) {
                arrayList2.add(saj.h0((bw0) it.next(), str7));
            }
            arrayList4 = arrayList2;
        }
        if (arrayList4 == null) {
            return iun.f15405a;
        }
        return arrayList4;
    }
}
