package a;

/* JADX INFO: loaded from: classes.dex */
public final class sv2 extends xww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32847a;

    public sv2(int i) {
        this.f32847a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sv2) && ((sv2) obj).f32847a == this.f32847a;
    }

    public final int hashCode() {
        return this.f32847a * 31;
    }
}
