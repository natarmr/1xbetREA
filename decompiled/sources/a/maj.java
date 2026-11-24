package a;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class maj {
    public static final maj b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f21460a;

    static {
        maj majVar = new maj(new LinkedHashMap());
        nkb.I(majVar);
        b = majVar;
    }

    public maj(maj majVar) {
        majVar.getClass();
        this.f21460a = new HashMap(majVar.f21460a);
    }

    public final int a(String str) {
        Object obj = this.f21460a.get(str);
        return ((Number) (obj instanceof Integer ? obj : 0)).intValue();
    }

    public final String b(String str) {
        Object obj = this.f21460a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final boolean c(String str) {
        Object obj = this.f21460a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && maj.class.equals(obj.getClass())) {
                HashMap map = ((maj) obj).f21460a;
                HashMap map2 = this.f21460a;
                Set<String> setKeySet = map2.keySet();
                if (Intrinsics.d(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = ox3.b(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.f21460a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return axq.n(new StringBuilder("Data {"), CollectionsKt.b0(this.f21460a.entrySet(), null, null, null, new x2i((byte) 12), 31), "}");
    }

    public maj(LinkedHashMap linkedHashMap) {
        this.f21460a = new HashMap(linkedHashMap);
    }
}
