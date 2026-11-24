package a;

/* JADX INFO: loaded from: classes.dex */
public final class if80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f14674a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ if80(int i) {
        this.f14674a = i;
    }

    public static String a(int i) {
        return brm0.l("MirrorMode(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof if80) {
            return this.f14674a == ((if80) obj).f14674a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14674a);
    }

    public final String toString() {
        return a(this.f14674a);
    }
}
