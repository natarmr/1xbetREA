package a;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class pgq0 {
    public static final ngq0 Companion = new ngq0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26964a;
    public final long b;
    public final long c;

    public /* synthetic */ pgq0(int i, long j, long j2, long j3) {
        if (1 != (i & 1)) {
            m2x.I(i, 1, mgq0.f21756a.getDescriptor());
            throw null;
        }
        this.f26964a = j;
        this.b = (i & 2) == 0 ? j * 1000 : j2;
        if ((i & 4) == 0) {
            this.c = j / 1000;
        } else {
            this.c = j3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pgq0) && this.f26964a == ((pgq0) obj).f26964a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f26964a);
    }

    public final String toString() {
        return "Time(ms=" + this.f26964a + ')';
    }

    public pgq0(long j) {
        this.f26964a = j;
        this.b = j * 1000;
        this.c = j / 1000;
    }
}
