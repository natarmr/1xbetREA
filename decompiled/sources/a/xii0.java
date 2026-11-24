package a;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xii0 {
    public static final List j = Arrays.asList(1, 5, 3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40947a;
    public final a55 b;
    public final List c;
    public final List d;
    public final List e;
    public final vii0 f;
    public final t7a g;
    public final int h;
    public final InputConfiguration i;

    public xii0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, t7a t7aVar, vii0 vii0Var, InputConfiguration inputConfiguration, int i, a55 a55Var) {
        this.f40947a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = vii0Var;
        this.g = t7aVar;
        this.i = inputConfiguration;
        this.h = i;
        this.b = a55Var;
    }

    public static xii0 a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        wy40 wy40VarL = wy40.l();
        ArrayList arrayList5 = new ArrayList();
        tz40 tz40VarA = tz40.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        b780 b780VarJ = b780.j(wy40VarL);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        eoo0 eoo0Var = eoo0.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = tz40VarA.f8147a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new xii0(arrayList, arrayList2, arrayList3, arrayList4, new t7a(arrayList6, b780VarJ, -1, arrayList7, new eoo0(arrayMap)), null, null, 0, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (a55 a55Var : this.f40947a) {
            arrayList.add(a55Var.f252a);
            Iterator it = a55Var.b.iterator();
            while (it.hasNext()) {
                arrayList.add((hzj) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
