package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zi30 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f44422a;
    public final long b;
    public final long c;

    public zi30(long j, long j2, long j3) {
        this.f44422a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f44422a, ((zi30) obj).f44422a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi30)) {
            return false;
        }
        zi30 zi30Var = (zi30) obj;
        return this.f44422a == zi30Var.f44422a && this.b == zi30Var.b && this.c == zi30Var.c;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f44422a), Long.valueOf(this.b), Long.valueOf(this.c));
    }
}
