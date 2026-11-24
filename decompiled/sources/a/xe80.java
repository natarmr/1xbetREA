package a;

/* JADX INFO: loaded from: classes.dex */
public final class xe80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40733a;

    public /* synthetic */ xe80(int i) {
        this.f40733a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xe80) {
            return this.f40733a == ((xe80) obj).f40733a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40733a);
    }

    public final String toString() {
        return twn.m(this.f40733a, "Output-");
    }
}
