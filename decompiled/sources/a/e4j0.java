package a;

/* JADX INFO: loaded from: classes5.dex */
public final class e4j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f7185a;

    public e4j0(double d) {
        this.f7185a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4j0) && Double.compare(this.f7185a, ((e4j0) obj).f7185a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f7185a) * 31;
    }

    public final String toString() {
        return "SettingsMakeBetQuickBetItemModel(actualValue=" + this.f7185a + ", newValue=null)";
    }
}
