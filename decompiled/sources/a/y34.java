package a;

/* JADX INFO: loaded from: classes.dex */
public final class y34 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f41933a;

    public final boolean equals(Object obj) {
        if (obj instanceof y34) {
            return this.f41933a == ((y34) obj).f41933a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41933a);
    }

    public final String toString() {
        return brm0.l("AudioRestrictionMode(value=", this.f41933a, ')');
    }
}
