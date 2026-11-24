package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class cek {
    public static final bek c = new bek();
    public static int d = 1;
    public static final int e;
    public static final int f;
    public static final int g;
    public static final int h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final cek m;
    public static final cek n;
    public static final cek o;
    public static final cek p;
    public static final cek q;
    public static final n0o0 r;
    public static final n0o0 s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4217a;
    public final int b;

    static {
        int iQ = bek.q();
        e = iQ;
        int iQ2 = bek.q();
        f = iQ2;
        int iQ3 = bek.q();
        g = iQ3;
        int iQ4 = bek.q();
        h = iQ4;
        int iQ5 = bek.q();
        i = iQ5;
        int iQ6 = bek.q();
        j = iQ6;
        int iQ7 = bek.q() - 1;
        k = iQ7;
        int i2 = iQ | iQ2 | iQ3;
        l = i2;
        m = new cek(iQ7);
        n = new cek(iQ5 | iQ6);
        new cek(iQ);
        new cek(iQ2);
        new cek(iQ3);
        o = new cek(i2);
        new cek(iQ4);
        p = new cek(iQ5);
        q = new cek(iQ6);
        new cek(iQ2 | iQ5 | iQ6);
        r = maz.b(t55.g);
        s = maz.b(t55.h);
    }

    public cek(int i2, List list) {
        list.getClass();
        this.f4217a = list;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i2 &= ~((zdk) it.next()).a();
        }
        this.b = i2;
    }

    public final boolean a(int i2) {
        return (this.b & i2) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!cek.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        cek cekVar = (cek) obj;
        return Intrinsics.d(this.f4217a, cekVar.f4217a) && this.b == cekVar.b;
    }

    public final int hashCode() {
        return (this.f4217a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        Object next;
        Iterator it = ((List) r.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((aek) next).f734a != this.b);
        aek aekVar = (aek) next;
        String strB0 = aekVar != null ? aekVar.b : null;
        if (strB0 == null) {
            List<aek> list = (List) s.getValue();
            ArrayList arrayList = new ArrayList();
            for (aek aekVar2 : list) {
                String str = a(aekVar2.f734a) ? aekVar2.b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strB0 = CollectionsKt.b0(arrayList, " | ", null, null, null, 62);
        }
        StringBuilder sbT = kng0.t("DescriptorKindFilter(", strB0, ", ");
        sbT.append(this.f4217a);
        sbT.append(')');
        return sbT.toString();
    }

    public cek(int i2) {
        this(i2, iun.f15405a);
    }
}
