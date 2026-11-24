package a;

/* JADX INFO: loaded from: classes5.dex */
public final class xyb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41700a;

    public xyb0(int i) {
        this.f41700a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xyb0) {
            return this.f41700a == ((xyb0) obj).f41700a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f41700a;
    }
}
