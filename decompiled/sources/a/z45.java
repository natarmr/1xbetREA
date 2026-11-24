package a;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class z45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43752a;
    public final long b;
    public final Set c;

    public z45(Set set, long j, long j2) {
        this.f43752a = j;
        this.b = j2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z45) {
            z45 z45Var = (z45) obj;
            if (this.f43752a == z45Var.f43752a && this.b == z45Var.b && this.c.equals(z45Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f43752a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f43752a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }
}
