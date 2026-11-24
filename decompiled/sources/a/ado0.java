package a;

/* JADX INFO: loaded from: classes.dex */
public final class ado0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f689a;
    public final float b;
    public final float c;

    public ado0(float f, float f2, float f3) {
        this.f689a = f;
        this.b = f2;
        this.c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ado0)) {
            return false;
        }
        ado0 ado0Var = (ado0) obj;
        return ycl.b(this.f689a, ado0Var.f689a) && ycl.b(this.b, ado0Var.b) && ycl.b(this.c, ado0Var.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + defpackage.c.a(Float.hashCode(this.f689a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TabPosition(left=");
        float f = this.f689a;
        sb.append((Object) ycl.c(f));
        sb.append(", right=");
        float f2 = this.b;
        sb.append((Object) ycl.c(f + f2));
        sb.append(", width=");
        sb.append((Object) ycl.c(f2));
        sb.append(", contentWidth=");
        sb.append((Object) ycl.c(this.c));
        sb.append(')');
        return sb.toString();
    }
}
