package a;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class y710 implements chi0 {
    public static final w710 Companion = new w710();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42128a;

    public /* synthetic */ y710(int i, long j) {
        if (1 == (i & 1)) {
            this.f42128a = j;
        } else {
            m2x.I(i, 1, v710.f36901a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y710) && this.f42128a == ((y710) obj).f42128a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f42128a);
    }

    public final String toString() {
        return "LongValue(value=" + this.f42128a + ')';
    }

    public y710(long j) {
        this.f42128a = j;
    }
}
