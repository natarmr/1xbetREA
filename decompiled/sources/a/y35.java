package a;

/* JADX INFO: loaded from: classes.dex */
public final class y35 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41935a;

    public y35(Object obj) {
        this.f41935a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof y35) && this.f41935a == ((y35) obj).f41935a;
    }

    public final int hashCode() {
        return this.f41935a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.f41935a + "}";
    }
}
