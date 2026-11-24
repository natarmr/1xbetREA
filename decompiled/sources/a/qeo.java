package a;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qeo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28593a;
    public final long b;
    public final Map c;

    public qeo(String str, long j, Map map) {
        map.getClass();
        this.f28593a = str;
        this.b = j;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qeo)) {
            return false;
        }
        qeo qeoVar = (qeo) obj;
        return this.f28593a.equals(qeoVar.f28593a) && this.b == qeoVar.b && Intrinsics.d(this.c, qeoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(this.f28593a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f28593a + ", timestamp=" + this.b + ", additionalCustomKeys=" + this.c + ')';
    }
}
