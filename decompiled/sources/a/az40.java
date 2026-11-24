package a;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class az40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1700a;
    public final y04 b;

    public az40(LinkedHashMap linkedHashMap, boolean z) {
        this.f1700a = linkedHashMap;
        this.b = new y04(z);
    }

    public final Map a() {
        Pair pair;
        Set<Map.Entry> setEntrySet = this.f1700a.entrySet();
        int iA = wp20.a(r3d.q(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                pair = new Pair(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.f46059a, pair.b);
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (this.b.f41787a.get()) {
            jf4.n("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void c(zsb0 zsb0Var, Object obj) {
        zsb0Var.getClass();
        d(zsb0Var, obj);
    }

    public final void d(zsb0 zsb0Var, Object obj) {
        zsb0Var.getClass();
        b();
        LinkedHashMap linkedHashMap = this.f1700a;
        if (obj == null) {
            b();
            linkedHashMap.remove(zsb0Var);
        } else if (obj instanceof Set) {
            Set setUnmodifiableSet = Collections.unmodifiableSet(CollectionsKt.P0((Set) obj));
            setUnmodifiableSet.getClass();
            linkedHashMap.put(zsb0Var, setUnmodifiableSet);
        } else if (!(obj instanceof byte[])) {
            linkedHashMap.put(zsb0Var, obj);
        } else {
            byte[] bArr = (byte[]) obj;
            linkedHashMap.put(zsb0Var, Arrays.copyOf(bArr, bArr.length));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    public final boolean equals(Object obj) {
        boolean zD;
        if (obj instanceof az40) {
            LinkedHashMap linkedHashMap = ((az40) obj).f1700a;
            LinkedHashMap linkedHashMap2 = this.f1700a;
            if (linkedHashMap != linkedHashMap2) {
                if (linkedHashMap.size() == linkedHashMap2.size()) {
                    if (!linkedHashMap.isEmpty()) {
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            Object obj2 = linkedHashMap2.get(entry.getKey());
                            if (obj2 != null) {
                                Object value = entry.getValue();
                                if (!(value instanceof byte[])) {
                                    zD = Intrinsics.d(value, obj2);
                                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                                    zD = true;
                                } else {
                                    zD = false;
                                }
                            } else {
                                zD = false;
                            }
                            if (!zD) {
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.f1700a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return CollectionsKt.b0(this.f1700a.entrySet(), ",\n", "{\n", "\n}", new da40((byte) 17), 24);
    }

    public /* synthetic */ az40(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
