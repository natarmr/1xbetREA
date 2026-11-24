package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class ajc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f967a;

    public ajc(byte b) {
        switch (b) {
            case 1:
                this.f967a = new LinkedHashMap();
                break;
            case 2:
                this.f967a = new LinkedHashMap();
                break;
            default:
                this.f967a = new LinkedHashMap();
                break;
        }
    }

    public void a(zic zicVar) {
        long[] jArr = zicVar.e;
        if (jArr.length > 0) {
            Long lValueOf = Long.valueOf(jArr[0]);
            LinkedHashMap linkedHashMap = this.f967a;
            if (linkedHashMap.containsKey(lValueOf)) {
                return;
            }
            linkedHashMap.put(Long.valueOf(zicVar.e[0]), zicVar);
        }
    }

    public void b(dg40 dg40Var) {
        dg40Var.getClass();
        byte b = dg40Var.f6030a;
        byte b2 = dg40Var.b;
        Integer numValueOf = Integer.valueOf(b);
        LinkedHashMap linkedHashMap = this.f967a;
        Object treeMap = linkedHashMap.get(numValueOf);
        if (treeMap == null) {
            treeMap = new TreeMap();
            linkedHashMap.put(numValueOf, treeMap);
        }
        TreeMap treeMap2 = (TreeMap) treeMap;
        if (treeMap2.containsKey(Integer.valueOf(b2))) {
            Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(b2)) + " with " + dg40Var);
        }
        treeMap2.put(Integer.valueOf(b2), dg40Var);
    }

    public zic c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (zic zicVar : this.f967a.values()) {
            arrayList.add(zicVar.b);
            arrayList2.add(zicVar.c);
            arrayList3.add(zicVar.d);
            arrayList4.add(zicVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long length = 0;
        for (int[] iArr2 : iArr) {
            length += (long) iArr2.length;
        }
        int i = (int) length;
        x0x.x("the total number of elements (%s) in the arrays must fit in an int", length, length == ((long) i));
        int[] iArr3 = new int[i];
        int length2 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, length2, iArr4.length);
            length2 += iArr4.length;
        }
        return new zic(iArr3, zvw.M((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), zvw.M((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), zvw.M((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }
}
