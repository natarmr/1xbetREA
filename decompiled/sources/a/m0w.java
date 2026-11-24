package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class m0w {
    public long d;
    public long e;
    public lt2 f;
    public long h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qoj0 f20975a = roj0.b(1, 0, i99.b, 2);
    public final qoj0 b = roj0.b(0, 0, null, 7);
    public final ArrayList c = new ArrayList();
    public final LinkedHashMap g = new LinkedHashMap();

    public final rg7 a(String str) {
        Object next;
        str.getClass();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (String.valueOf(((rg7) next).f30419a).equals(str)) {
                return (rg7) next;
            }
        }
        next = null;
        return (rg7) next;
    }
}
