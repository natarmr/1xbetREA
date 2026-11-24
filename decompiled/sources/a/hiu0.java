package a;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class hiu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s2m0 f13133a = new s2m0();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();
    public volatile boolean d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                ohs0.D(autoCloseable);
            } catch (Exception e) {
                ohq.p(e);
            }
        }
    }
}
