package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j2a implements hmx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15771a = new Object();
    public final LinkedHashMap b = new LinkedHashMap();
    public final HashSet c = new HashSet();
    public ig00 d;
    public tu9 e;
    public ru f;

    @Override // a.hmx
    public final void a(List list) throws l3a {
        HashSet<String> hashSet;
        HashMap map = new HashMap();
        synchronized (this.f15771a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.b.keySet());
        }
        try {
            for (String str : hashSet) {
                map.put(str, this.f.e(str));
            }
            synchronized (this.f15771a) {
                try {
                    HashSet hashSet2 = new HashSet(this.b.keySet());
                    hashSet2.removeAll(list);
                    ArrayList<s0a> arrayList = new ArrayList();
                    Iterator it = hashSet2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((s0a) this.b.get((String) it.next()));
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str2 : (ArrayList) list) {
                        if (this.b.containsKey(str2)) {
                            linkedHashMap.put(str2, (s0a) this.b.get(str2));
                        } else {
                            linkedHashMap.put(str2, (s0a) map.get(str2));
                        }
                    }
                    this.b.clear();
                    this.b.putAll(linkedHashMap);
                    for (s0a s0aVar : arrayList) {
                        if (s0aVar != null) {
                            s0aVar.p();
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (k3a e) {
            throw new l3a("Failed to create CameraInternal", e);
        }
    }

    public final s0a b(String str) {
        s0a s0aVar;
        synchronized (this.f15771a) {
            try {
                s0aVar = (s0a) this.b.get(str);
                if (s0aVar == null) {
                    throw new IllegalArgumentException("Invalid camera: " + str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return s0aVar;
    }

    public final LinkedHashSet c() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f15771a) {
            linkedHashSet = new LinkedHashSet(this.b.values());
        }
        return linkedHashSet;
    }

    public final void d(ru ruVar) {
        this.f = ruVar;
        synchronized (this.f15771a) {
            try {
                for (String str : ruVar.d()) {
                    l8x.U("CameraRepository", "Added camera: " + str);
                    s0a s0aVar = (s0a) this.b.put(str, ruVar.e(str));
                    if (s0aVar != null) {
                        s0aVar.release();
                    }
                }
            } catch (k3a e) {
                throw new nbx(e);
            }
        }
    }
}
