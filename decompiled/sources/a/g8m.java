package a;

/* JADX INFO: loaded from: classes5.dex */
public final class g8m extends uzb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4d f10871a = d4d.SECONDARY10;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8m) && this.f10871a == ((g8m) obj).f10871a;
    }

    public final int hashCode() {
        return this.f10871a.hashCode() * 31;
    }

    public final String toString() {
        return "Default(background=" + this.f10871a + ", iconColor=null)";
    }
}
