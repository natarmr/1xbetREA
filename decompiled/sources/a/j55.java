package a;

/* JADX INFO: loaded from: classes.dex */
public final class j55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imn0 f15917a;

    public j55(imn0 imn0Var) {
        this.f15917a = imn0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof j55) && this.f15917a == ((j55) obj).f15917a;
    }

    public final int hashCode() {
        return this.f15917a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.f15917a + "}";
    }
}
