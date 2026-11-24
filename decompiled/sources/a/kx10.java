package a;

/* JADX INFO: loaded from: classes5.dex */
public final class kx10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f19030a;

    public kx10(iz30 iz30Var) {
        this.f19030a = iz30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kx10) && this.f19030a == ((kx10) obj).f19030a;
    }

    public final int hashCode() {
        return Integer.hashCode(1) + (this.f19030a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuItemChampionClubModel(menuItem=" + this.f19030a + ", refId=1)";
    }
}
