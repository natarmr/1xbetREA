package a;

/* JADX INFO: loaded from: classes2.dex */
public final class mtn implements u4x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22378a;

    public mtn(boolean z) {
        this.f22378a = z;
    }

    @Override // a.u4x
    public final u460 c() {
        return null;
    }

    @Override // a.u4x
    public final boolean isActive() {
        return this.f22378a;
    }

    public final String toString() {
        return axq.m(new StringBuilder("Empty{"), this.f22378a ? "Active" : "New", '}');
    }
}
