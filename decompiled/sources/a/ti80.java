package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class ti80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final el80 f33998a;
    public final ArrayList b;
    public final ArrayList c;
    public final LinkedHashMap d;
    public int e;
    public final q99 f;
    public final q99 g;
    public final LinkedHashMap h;
    public final cyu i;

    public ti80(el80 el80Var) {
        this.f33998a = el80Var;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.c = arrayList;
        this.d = new LinkedHashMap();
        this.f = vtb.d(-1, null, null, 6);
        this.g = vtb.d(-1, null, null, 6);
        this.h = new LinkedHashMap();
        cyu cyuVar = new cyu((byte) 10);
        cyuVar.N(gp00.f11660a, ap00.b);
        this.i = cyuVar;
    }

    public final om80 a(tmu0 tmu0Var) {
        Integer numValueOf;
        int iAbs;
        el80 el80Var = this.f33998a;
        short s = el80Var.f7986a;
        ArrayList arrayList = this.c;
        List listL0 = CollectionsKt.L0(arrayList);
        if (tmu0Var != null) {
            int i = tmu0Var.b;
            int i2 = tmu0Var.e;
            int i3 = -this.e;
            int size = (arrayList.size() - 1) - this.e;
            int size2 = 0;
            int i4 = i3;
            while (i4 < i2) {
                size2 += i4 > size ? s : ((mm80) arrayList.get(this.e + i4)).f22025a.size();
                i4++;
            }
            if (i < 0) {
                iAbs = Math.abs(i) + (((mm80) arrayList.get(this.e + i2)).f22025a.size() - 1);
            } else {
                int i5 = tmu0Var.f37689a;
                iAbs = i5 < 0 ? i5 : tmu0Var.f;
            }
            int i6 = size2 + iAbs;
            if (i2 < i3) {
                i6 -= s;
            }
            numValueOf = Integer.valueOf(i6);
        } else {
            numValueOf = null;
        }
        return new om80(listL0, numValueOf, el80Var, 0);
    }

    public final int b() {
        Iterator it = this.c.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((mm80) it.next()).f22025a.size();
        }
        return size;
    }

    public final boolean c(int i, gp00 gp00Var, mm80 mm80Var, Object obj) {
        gp00Var.getClass();
        mm80Var.getClass();
        int i2 = mm80Var.d;
        List list = mm80Var.f22025a;
        int i3 = mm80Var.e;
        int iOrdinal = gp00Var.ordinal();
        LinkedHashMap linkedHashMap = this.d;
        ArrayList arrayList = this.b;
        ArrayList arrayList2 = this.c;
        if (iOrdinal == 0) {
            if (!arrayList2.isEmpty()) {
                jf4.n("cannot receive multiple init calls");
                return false;
            }
            if (i != 0) {
                jf4.n("init loadId must be the initial value, 0");
                return false;
            }
            arrayList.add(mm80Var);
            linkedHashMap.put(Integer.valueOf(mm80Var.hashCode()), obj);
            this.e = 0;
            return true;
        }
        LinkedHashMap linkedHashMap2 = this.h;
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                t9f.b();
                return false;
            }
            if (arrayList2.isEmpty()) {
                jf4.n("should've received an init before append");
                return false;
            }
            if (i == 0) {
                arrayList.add(mm80Var);
                linkedHashMap.put(Integer.valueOf(mm80Var.hashCode()), obj);
                if (i3 == Integer.MIN_VALUE) {
                    list.size();
                }
                linkedHashMap2.remove(gp00.c);
                return true;
            }
        } else {
            if (arrayList2.isEmpty()) {
                jf4.n("should've received an init before prepend");
                return false;
            }
            if (i == 0) {
                arrayList.add(0, mm80Var);
                linkedHashMap.put(Integer.valueOf(mm80Var.hashCode()), obj);
                this.e++;
                if (i2 == Integer.MIN_VALUE) {
                    list.size();
                }
                linkedHashMap2.remove(gp00.b);
                return true;
            }
        }
        return false;
    }

    public final rh80 d(mm80 mm80Var, gp00 gp00Var) {
        mm80Var.getClass();
        int iOrdinal = gp00Var.ordinal();
        int size = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                size = 0 - this.e;
            } else {
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                size = (this.c.size() - this.e) - 1;
            }
        }
        List listC = kotlin.collections.a.c(new kls0(size, mm80Var.f22025a));
        int iOrdinal2 = gp00Var.ordinal();
        cyu cyuVar = this.i;
        if (iOrdinal2 == 0) {
            dp00 dp00VarP = cyuVar.P();
            listC.getClass();
            return new rh80(gp00.f11660a, listC, 0, 0, dp00VarP, null);
        }
        if (iOrdinal2 == 1) {
            dp00 dp00VarP2 = cyuVar.P();
            listC.getClass();
            return new rh80(gp00.b, listC, 0, -1, dp00VarP2, null);
        }
        if (iOrdinal2 != 2) {
            t9f.b();
            return null;
        }
        dp00 dp00VarP3 = cyuVar.P();
        listC.getClass();
        return new rh80(gp00.c, listC, -1, 0, dp00VarP3, null);
    }
}
