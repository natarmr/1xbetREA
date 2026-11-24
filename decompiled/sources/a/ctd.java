package a;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ctd extends obb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ctd f4930a;
    public static final Map b;

    static {
        btd btdVar = new btd();
        btdVar.put(461L, "FIREPERF_AUTOPUSH");
        btdVar.put(462L, "FIREPERF");
        btdVar.put(675L, "FIREPERF_INTERNAL_LOW");
        btdVar.put(676L, "FIREPERF_INTERNAL_HIGH");
        b = Collections.unmodifiableMap(btdVar);
    }

    @Override // a.obb
    public final String a0() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
