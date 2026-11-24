package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class l07 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19184a;
    public final String b;
    public final int c;
    public final ArrayList d;
    public final List e;
    public final ro7 f;

    public l07(long j, String str, int i, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        ro7 ro7Var = (j == 1316 || j == 1315) ? ro7.b : ro7.f30823a;
        this.f19184a = j;
        this.b = str;
        this.c = i;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = ro7Var;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List<iq7> list = (List) it.next();
            List list2 = this.e;
            if (k07.f17450a[this.f.ordinal()] == 1) {
                for (iq7 iq7Var : list) {
                    if (list.isEmpty()) {
                        break;
                    }
                    if (list2.isEmpty()) {
                        list2.add(new cac());
                    }
                    cac cacVar = (cac) CollectionsKt.firstOrNull(list2);
                    if (cacVar != null) {
                        iq7Var.getClass();
                        cacVar.f4003a.add(iq7Var);
                    }
                }
            } else {
                cac cacVar2 = new cac();
                for (iq7 iq7Var2 : list) {
                    iq7Var2.getClass();
                    cacVar2.f4003a.add(iq7Var2);
                }
                list2.add(cacVar2);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!l07.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f19184a == ((l07) obj).f19184a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19184a);
    }
}
