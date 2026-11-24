package a;

/* JADX INFO: loaded from: classes4.dex */
public final class t0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33135a;
    public final String b;
    public final long c;

    public t0s(long j, long j2, String str, String str2, String str3) {
        this.f33135a = j;
        this.b = str;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t0s.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        return this.f33135a == ((t0s) obj).f33135a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f33135a);
    }
}
