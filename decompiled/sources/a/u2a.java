package a;

/* JADX INFO: loaded from: classes.dex */
public final class u2a extends p2a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yy9 f34935a;

    public u2a(yy9 yy9Var) {
        this.f34935a = yy9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u2a) && this.f34935a.equals(((u2a) obj).f34935a);
    }

    public final int hashCode() {
        return this.f34935a.hashCode();
    }

    public final String toString() {
        return "CameraStateOpen(cameraDevice=" + this.f34935a + ')';
    }
}
