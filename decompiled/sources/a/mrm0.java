package a;

/* JADX INFO: loaded from: classes.dex */
public final class mrm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22281a;

    public static String a(int i) {
        return twn.m(i, "Stream-");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mrm0) {
            return this.f22281a == ((mrm0) obj).f22281a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22281a);
    }

    public final String toString() {
        return a(this.f22281a);
    }
}
