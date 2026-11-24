package a;

/* JADX INFO: loaded from: classes2.dex */
public final class bhy extends dhy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsy f2632a;

    public bhy(wsy wsyVar) {
        this.f2632a = wsyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bhy) && this.f2632a.equals(((bhy) obj).f2632a);
    }

    public final int hashCode() {
        return this.f2632a.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.f2632a + ')';
    }
}
