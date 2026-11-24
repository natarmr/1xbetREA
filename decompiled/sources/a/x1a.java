package a;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class x1a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rrd f40112a;
    public final ScheduledExecutorService b;

    public x1a(rrd rrdVar, ScheduledExecutorService scheduledExecutorService) {
        this.f40112a = rrdVar;
        this.b = scheduledExecutorService;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x1a) {
            x1a x1aVar = (x1a) obj;
            if (this.f40112a == x1aVar.f40112a && this.b.equals(x1aVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40112a.hashCode() * 31);
    }

    public final String toString() {
        return "ListenerWrapper(listener=" + this.f40112a + ", executor=" + this.b + ')';
    }
}
