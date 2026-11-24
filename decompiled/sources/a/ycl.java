package a;

/* JADX INFO: loaded from: classes.dex */
public final class ycl implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f42389a;

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a(this.f42389a, ((ycl) obj).f42389a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ycl) {
            return Float.compare(this.f42389a, ((ycl) obj).f42389a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f42389a);
    }

    public final String toString() {
        return c(this.f42389a);
    }
}
