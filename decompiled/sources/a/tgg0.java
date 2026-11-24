package a;

import android.graphics.Point;

/* JADX INFO: loaded from: classes6.dex */
public final class tgg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33911a;
    public final int b;
    public final Point c;

    public tgg0(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.f33911a = i;
        this.b = i2;
        this.c = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tgg0)) {
            return false;
        }
        tgg0 tgg0Var = (tgg0) obj;
        return this.f33911a == tgg0Var.f33911a && this.b == tgg0Var.b && this.c.equals(tgg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f33911a * 31) + this.b) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f33911a;
        if (i == 0) {
            str = "TopLeft";
        } else if (i == 1) {
            str = "TopRight";
        } else if (i != 2) {
            str = i != 3 ? "Invalid" : "BottomLeft";
        } else {
            str = "BottomRight";
        }
        sb.append(str);
        sb.append(", radius=");
        sb.append(this.b);
        sb.append(", center=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
