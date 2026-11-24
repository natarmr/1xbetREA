package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class zi80 {
    public static final zi80 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f44430a;
    public int b;
    public int c;
    public int d;

    static {
        List listC = kotlin.collections.a.c(new kls0(0, iun.f15405a));
        bp00 bp00Var = bp00.c;
        bp00 bp00Var2 = bp00.b;
        dp00 dp00Var = new dp00(bp00Var, bp00Var2, bp00Var2);
        listC.getClass();
        e = new zi80(new rh80(gp00.f11660a, listC, 0, 0, dp00Var, null));
    }

    public zi80(int i, int i2, List list) {
        list.getClass();
        this.f44430a = new ArrayList(list);
        Iterator it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((kls0) it.next()).b.size();
        }
        this.b = size;
        this.c = i;
        this.d = i2;
    }

    public final tmu0 a(int i) {
        ArrayList arrayList;
        int iIntValue = i - this.c;
        int i2 = 0;
        while (true) {
            arrayList = this.f44430a;
            if (iIntValue < ((kls0) arrayList.get(i2)).b.size() || i2 >= q3d.i(arrayList)) {
                break;
            }
            iIntValue -= ((kls0) arrayList.get(i2)).b.size();
            i2++;
        }
        kls0 kls0Var = (kls0) arrayList.get(i2);
        int i3 = i - this.c;
        int iF = ((f() - i) - this.d) - 1;
        int iD = d();
        int iE = e();
        int i4 = kls0Var.c;
        List list = kls0Var.d;
        if (list != null && q3d.h(list).b(iIntValue)) {
            iIntValue = ((Number) list.get(iIntValue)).intValue();
        }
        return new tmu0(i4, iIntValue, i3, iF, iD, iE);
    }

    public final Object b(int i) {
        if (i < 0 || i >= f()) {
            hny.k(f(), b1j.m(i, "Index: ", ", Size: "));
            return null;
        }
        int i2 = i - this.c;
        if (i2 < 0 || i2 >= this.b) {
            return null;
        }
        return c(i2);
    }

    public final Object c(int i) {
        ArrayList arrayList = this.f44430a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((kls0) arrayList.get(i2)).b.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((kls0) arrayList.get(i2)).b.get(i);
    }

    public final int d() {
        Integer numT = tx3.T(((kls0) CollectionsKt.U(this.f44430a)).f18507a);
        numT.getClass();
        return numT.intValue();
    }

    public final int e() {
        Integer numR = tx3.R(((kls0) CollectionsKt.d0(this.f44430a)).f18507a);
        numR.getClass();
        return numR.intValue();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zi80)) {
            return false;
        }
        zi80 zi80Var = (zi80) obj;
        return d() == zi80Var.d() && e() == zi80Var.e() && this.c == zi80Var.c && this.d == zi80Var.d && Intrinsics.d(this.f44430a, zi80Var.f44430a);
    }

    public final int f() {
        return this.c + this.b + this.d;
    }

    public final n7x g(wh80 wh80Var) {
        wh80Var.getClass();
        boolean z = wh80Var instanceof rh80;
        ArrayList arrayList = this.f44430a;
        if (!z) {
            if (!(wh80Var instanceof oh80)) {
                jf4.n("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
                return null;
            }
            IntRange intRange = new IntRange(0, 0, 1);
            Iterator it = arrayList.iterator();
            int size = 0;
            while (it.hasNext()) {
                kls0 kls0Var = (kls0) it.next();
                for (int i : kls0Var.f18507a) {
                    if (intRange.b(i)) {
                        size += kls0Var.b.size();
                        it.remove();
                        break;
                    }
                }
            }
            int i2 = this.b - size;
            this.b = i2;
            gp00 gp00Var = gp00.b;
            int i3 = this.d;
            this.d = 0;
            return new il80(this.c + i2, size, 0, i3);
        }
        rh80 rh80Var = (rh80) wh80Var;
        List list = rh80Var.b;
        Iterator it2 = list.iterator();
        int size2 = 0;
        while (it2.hasNext()) {
            size2 += ((kls0) it2.next()).b.size();
        }
        int iOrdinal = rh80Var.f30479a.ordinal();
        if (iOrdinal == 0) {
            jf4.n("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
            return null;
        }
        if (iOrdinal == 1) {
            int i4 = this.c;
            arrayList.addAll(0, list);
            this.b += size2;
            this.c = rh80Var.c;
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                w3d.u(arrayList2, ((kls0) it3.next()).b);
            }
            return new kl80(arrayList2, this.c, i4);
        }
        if (iOrdinal != 2) {
            t9f.b();
            return null;
        }
        int i5 = this.d;
        int i6 = this.b;
        arrayList.addAll(arrayList.size(), list);
        this.b += size2;
        this.d = rh80Var.d;
        int i7 = this.c + i6;
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            w3d.u(arrayList3, ((kls0) it4.next()).b);
        }
        return new hl80(i7, this.d, i5, arrayList3);
    }

    public final int hashCode() {
        return (this.f44430a.hashCode() * 31) + (this.d * 31) + (this.c * 31) + (e() * 31) + (d() * 31);
    }

    public final String toString() {
        int i = this.b;
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(c(i2));
        }
        String strB0 = CollectionsKt.b0(arrayList, null, null, null, null, 63);
        StringBuilder sb = new StringBuilder("[(");
        kng0.w(this.c, " placeholders), ", strB0, ", (", sb);
        return rz4.j(this.d, " placeholders)]", sb);
    }

    public zi80(rh80 rh80Var) {
        this(rh80Var.c, rh80Var.d, rh80Var.b);
    }
}
