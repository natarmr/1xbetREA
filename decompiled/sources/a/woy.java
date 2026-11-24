package a;

/* JADX INFO: loaded from: classes6.dex */
public final class woy extends ppy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final voy f39520a;

    public woy(voy voyVar) {
        this.f39520a = voyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof woy) && this.f39520a.equals(((woy) obj).f39520a);
    }

    public final int hashCode() {
        return this.f39520a.hashCode();
    }

    public final String toString() {
        return "AnnotationValue(" + this.f39520a + ')';
    }
}
