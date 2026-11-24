package a;

/* JADX INFO: loaded from: classes6.dex */
public final class fk50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9674a;

    public final boolean equals(Object obj) {
        if (obj instanceof fk50) {
            return this.f9674a == ((fk50) obj).f9674a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9674a);
    }

    public final String toString() {
        int i = this.f9674a;
        if (i == 1) {
            return "UserInput";
        }
        if (i == 2) {
            return "SideEffect";
        }
        return i == 3 ? "Relocate" : "Invalid";
    }
}
