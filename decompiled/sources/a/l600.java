package a;

/* JADX INFO: loaded from: classes.dex */
public final class l600 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19483a;

    public final boolean equals(Object obj) {
        if (obj instanceof l600) {
            return this.f19483a == ((l600) obj).f19483a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19483a);
    }

    public final String toString() {
        int i = this.f19483a;
        if (i == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        return i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
