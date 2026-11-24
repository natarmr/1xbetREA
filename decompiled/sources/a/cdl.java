package a;

/* JADX INFO: loaded from: classes.dex */
public final class cdl {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdl) && ycl.b(10.0f, 10.0f) && ycl.b(40.0f, 40.0f) && ycl.b(10.0f, 10.0f) && ycl.b(40.0f, 40.0f);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + defpackage.c.a(defpackage.c.a(defpackage.c.a(Float.hashCode(10.0f) * 31, 40.0f, 31), 10.0f, 31), 40.0f, 31);
    }

    public final String toString() {
        String strC = ycl.c(10.0f);
        String strC2 = ycl.c(40.0f);
        return ua80.m(b1j.n("DpTouchBoundsExpansion(start=", strC, ", top=", strC2, ", end="), ycl.c(10.0f), ", bottom=", ycl.c(40.0f), ", isLayoutDirectionAware=true)");
    }
}
