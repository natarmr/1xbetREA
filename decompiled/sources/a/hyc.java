package a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class hyc {
    public static final hyc b = new hyc(new HashMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f13853a;

    public hyc(HashMap map) {
        this.f13853a = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hyc) {
            return this.f13853a.equals(((hyc) obj).f13853a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13853a.hashCode();
    }
}
