package a;

/* JADX INFO: loaded from: classes4.dex */
public final class qpb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29109a;

    public qpb0(int i) {
        this.f29109a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qpb0) && this.f29109a == ((qpb0) obj).f29109a;
    }

    public final int hashCode() {
        return Integer.hashCode(3) + (Integer.hashCode(this.f29109a) * 31);
    }

    public final String toString() {
        return ua80.e(this.f29109a, "PowerOfPowerCellSpace(spaceRes=", ", viewSpaceIndex=3)");
    }
}
