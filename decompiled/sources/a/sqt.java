package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class sqt {
    public /* synthetic */ sqt(Object obj) {
    }

    public static ArrayList a(List list, dxk0 dxk0Var) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            d0t d0tVar = (d0t) obj;
            String str = d0tVar.o;
            String str2 = dxk0Var.f6850a;
            if (StringsKt.O(str, str2, true) || StringsKt.O(qzb.c0(d0tVar), str2, true) || StringsKt.O(qzb.r0(d0tVar), str2, true)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static mrz b(String str) {
        str.getClass();
        mrz mrzVar = mrz.b;
        if (str.equals("ACTIVE")) {
            return mrzVar;
        }
        mrz mrzVar2 = mrz.c;
        if (str.equals("PENDING")) {
            return mrzVar2;
        }
        mrz mrzVar3 = mrz.d;
        str.equals("INACTIVE");
        return mrzVar3;
    }

    public static vrz c(int i) {
        zrz zrzVar = zrz.b;
        if (i != -1) {
            fe7 fe7Var = fe7.BET_LIMIT_1_DAY;
            if (i == 1) {
                return fe7Var;
            }
            fe7 fe7Var2 = fe7.BET_LIMIT_7_DAY;
            if (i == 2) {
                return fe7Var2;
            }
            fe7 fe7Var3 = fe7.BET_LIMIT_30_DAY;
            if (i == 3) {
                return fe7Var3;
            }
            n7k n7kVar = n7k.DEPOSIT_LIMIT_1_DAY;
            if (i == 20) {
                return n7kVar;
            }
            n7k n7kVar2 = n7k.DEPOSIT_LIMIT_7_DAY;
            if (i == 21) {
                return n7kVar2;
            }
            n7k n7kVar3 = n7k.DEPOSIT_LIMIT_30_DAY;
            if (i == 22) {
                return n7kVar3;
            }
            liq0 liq0Var = liq0.f20118a;
            if (i == 30) {
                return liq0Var;
            }
        }
        return zrzVar;
    }

    public static i16 d(Throwable th) {
        th.getClass();
        boolean z = th instanceof qct;
        qct qctVar = z ? (qct) th : null;
        String str = qctVar != null ? qctVar.f28499a : null;
        if (str == null) {
            str = "";
        }
        if (saj.Y(th)) {
            return d16.f5295a;
        }
        if (z && ((qct) th).b == l5t.i) {
            return h16.f12267a;
        }
        return str.length() > 0 ? new y06(str) : new x06(false);
    }

    public static mx20 e(List list) {
        ArrayList arrayListU = twn.u(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            w3d.u(arrayListU, ((kx20) it.next()).c);
        }
        ArrayList arrayList = new ArrayList(r3d.q(arrayListU, 10));
        Iterator it2 = arrayListU.iterator();
        while (it2.hasNext()) {
            arrayList.add(Float.valueOf(((jx20) it2.next()).f17281a));
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayListU, 10));
        Iterator it3 = arrayListU.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Long.valueOf(((jx20) it3.next()).b));
        }
        Float fK0 = CollectionsKt.k0(arrayList);
        float fFloatValue = fK0 != null ? fK0.floatValue() : 0.0f;
        Float fH0 = CollectionsKt.h0(arrayList);
        float fFloatValue2 = fH0 != null ? fH0.floatValue() : 0.0f;
        Long l = (Long) CollectionsKt.j0(arrayList2);
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = (Long) CollectionsKt.g0(arrayList2);
        return new mx20(jLongValue, fFloatValue, fFloatValue2, l2 != null ? l2.longValue() : 0L);
    }

    public static List f(jhq0 jhq0Var) {
        jhq0Var.getClass();
        int iOrdinal = jhq0Var.ordinal();
        if (iOrdinal == 0) {
            ygq0.b.getClass();
            return j6m0.c(false);
        }
        if (iOrdinal == 1) {
            ygq0.b.getClass();
            return j6m0.d();
        }
        if (iOrdinal == 2) {
            ygq0.b.getClass();
            return j6m0.c(true);
        }
        if (iOrdinal == 3) {
            ygq0.b.getClass();
            return q3d.j(ygq0.NOT, ygq0.M_30, ygq0.H_1, ygq0.H_2, ygq0.H_6, ygq0.H_12, ygq0.H_24, ygq0.H_48, ygq0.CUSTOM_DATE);
        }
        t9f.b();
        return null;
    }

    public static void g(sqt sqtVar, androidx.fragment.app.e eVar, n3w n3wVar, boolean z, sys0 sys0Var) {
        sqtVar.getClass();
        if (eVar.J("MenuBottomSheetDialog") == null) {
            y3w y3wVar = new y3w();
            iiy[] iiyVarArr = y3w.o2;
            y3wVar.f2.u(y3wVar, iiyVarArr[1], n3wVar);
            y3wVar.g2.v(y3wVar, iiyVarArr[2], z);
            y3wVar.h2.v(y3wVar, iiyVarArr[3], false);
            y3wVar.e2.x(y3wVar, iiyVarArr[0], "REQUEST_BET_INFO_DIALOG");
            y3wVar.i2.u(y3wVar, iiyVarArr[4], sys0Var);
            y3wVar.H0(eVar, "MenuBottomSheetDialog");
        }
    }

    public static toy h(int i) {
        Object next;
        c0o c0oVar = toy.e;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((toy) next).f34306a != i);
        toy toyVar = (toy) next;
        return toyVar == null ? toy.UNKNOWN : toyVar;
    }
}
