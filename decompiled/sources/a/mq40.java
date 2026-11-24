package a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class mq40 {
    public static final mq40 b = new mq40(Collections.unmodifiableMap(new HashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f22205a;

    public mq40(Map map) {
        this.f22205a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mq40) {
            return this.f22205a.equals(((mq40) obj).f22205a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22205a.hashCode();
    }

    public final String toString() {
        return this.f22205a.toString();
    }
}
