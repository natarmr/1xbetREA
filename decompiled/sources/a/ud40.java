package a;

/* JADX INFO: loaded from: classes.dex */
public final class ud40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xuz f35463a = new xuz();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ud40) && this.f35463a == ((ud40) obj).f35463a;
    }

    public final int hashCode() {
        return this.f35463a.hashCode() + twn.a(0, Integer.hashCode(0) * 31, 31);
    }

    public final String toString() {
        return "MetadataTransform(past=0, future=0, transformFn=" + this.f35463a + ')';
    }
}
