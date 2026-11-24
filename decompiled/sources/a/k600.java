package a;

/* JADX INFO: loaded from: classes.dex */
public final class k600 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17743a;

    public final boolean equals(Object obj) {
        if (obj instanceof k600) {
            return this.f17743a == ((k600) obj).f17743a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f17743a);
    }

    public final String toString() {
        int i = this.f17743a;
        if (i == 0) {
            return "LineHeightStyle.Mode.Fixed";
        }
        if (i == 1) {
            return "LineHeightStyle.Mode.Minimum";
        }
        return i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
