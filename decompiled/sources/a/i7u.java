package a;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class i7u {
    public static final i7u b = new i7u(3);
    public static final i7u c = new i7u(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f14310a;

    /* JADX WARN: Multi-variable type inference failed */
    public i7u(int i) {
        this.f14310a = i;
    }

    public final boolean a(List list, List list2) {
        list.getClass();
        list2.getClass();
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(Integer.valueOf(((z0w) it.next()).v));
        }
        if (list2.isEmpty()) {
            return false;
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ueo ueoVar = (ueo) it2.next();
            if (ueoVar.d == this.f14310a && hashSet.contains(Integer.valueOf((int) ueoVar.f35538a))) {
                return true;
            }
        }
        return false;
    }
}
