package a;

/* JADX INFO: loaded from: classes.dex */
public final class mp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22153a;
    public final long b;

    public mp(long j, long j2) {
        this.f22153a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp)) {
            return false;
        }
        mp mpVar = (mp) obj;
        return this.f22153a == mpVar.f22153a && this.b == mpVar.b;
    }

    public final int hashCode() {
        return (((int) this.f22153a) * 31) + ((int) this.b);
    }
}
