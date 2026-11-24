package a;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class y45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final quc f41985a;
    public final HashMap b;

    public y45(quc qucVar, HashMap map) {
        this.f41985a = qucVar;
        this.b = map;
    }

    public final long a(mwb0 mwb0Var, long j, int i) {
        long time = j - this.f41985a.getTime();
        z45 z45Var = (z45) this.b.get(mwb0Var);
        long j2 = z45Var.f43752a;
        int i2 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * ((long) i2)))), time), z45Var.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y45)) {
            return false;
        }
        y45 y45Var = (y45) obj;
        return this.f41985a.equals(y45Var.f41985a) && this.b.equals(y45Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.f41985a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f41985a + ", values=" + this.b + "}";
    }
}
