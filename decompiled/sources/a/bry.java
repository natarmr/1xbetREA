package a;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public enum bry {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);

    public static final bst b = new bst();
    public static final LinkedHashMap c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f3101a;

    static {
        bry[] bryVarArrValues = values();
        int iA = wp20.a(bryVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (bry bryVar : bryVarArrValues) {
            linkedHashMap.put(Integer.valueOf(bryVar.f3101a), bryVar);
        }
        c = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    bry(int i) {
        this.f3101a = i;
    }
}
