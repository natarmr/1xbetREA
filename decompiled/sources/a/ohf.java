package a;

import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public enum ohf implements Serializable {
    /* JADX INFO: Fake field, exist only in values array */
    WILD_COIN(0),
    /* JADX INFO: Fake field, exist only in values array */
    RED(1),
    /* JADX INFO: Fake field, exist only in values array */
    PURPLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    GREEN(3),
    /* JADX INFO: Fake field, exist only in values array */
    ORANGE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DIAMOND(5),
    /* JADX INFO: Fake field, exist only in values array */
    BLUE(6);

    public static final std b = new std();
    public static final LinkedHashMap c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f25262a;

    static {
        ohf[] ohfVarArrValues = values();
        int iA = wp20.a(ohfVarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        for (ohf ohfVar : ohfVarArrValues) {
            linkedHashMap.put(Integer.valueOf(ohfVar.f25262a), ohfVar);
        }
        c = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    ohf(int i) {
        this.f25262a = i;
    }
}
