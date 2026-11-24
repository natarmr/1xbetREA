package a;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ukw0 extends LinkedHashMap {
    public static final ukw0 b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35848a = true;

    static {
        ukw0 ukw0Var = new ukw0();
        b = ukw0Var;
        ukw0Var.f35848a = false;
    }

    public static int a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof kkw0)) {
                return obj.hashCode();
            }
            e9d0.b();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        int iA = lkw0.a(length, bArr, 0, length);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final ukw0 b() {
        if (isEmpty()) {
            return new ukw0();
        }
        ukw0 ukw0Var = new ukw0(this);
        ukw0Var.f35848a = true;
        return ukw0Var;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        d();
        super.clear();
    }

    public final void d() {
        if (this.f35848a) {
            return;
        }
        e9d0.b();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iA = 0;
        for (Map.Entry entry : entrySet()) {
            iA += a(entry.getValue()) ^ a(entry.getKey());
        }
        return iA;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        d();
        byte[] bArr = lkw0.f20222a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        d();
        for (Object obj : map.keySet()) {
            byte[] bArr = lkw0.f20222a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        d();
        return super.remove(obj);
    }
}
