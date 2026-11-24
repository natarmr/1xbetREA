package a;

/* JADX INFO: loaded from: classes3.dex */
public final class h9e implements k9e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12671a;

    public h9e(int i) {
        this.f12671a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h9e) && this.f12671a == ((h9e) obj).f12671a;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (Integer.hashCode(this.f12671a) * 31);
    }

    public final String toString() {
        return ua80.e(this.f12671a, "ScrollToMessage(position=", ", highlight=true)");
    }
}
