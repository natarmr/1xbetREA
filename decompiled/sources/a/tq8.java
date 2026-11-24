package a;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class tq8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34369a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new tq8(0, 0, 0, 0);
    }

    public tq8(int i, int i2, int i3, int i4) {
        this.f34369a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            c99.s(f140.j(i, "Left must be less than or equal to right, left: ", i3, ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        c99.s(f140.j(i2, "top must be less than or equal to bottom, top: ", i4, ", bottom: "));
        throw null;
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.c - this.f34369a;
    }

    public final Rect c() {
        return new Rect(this.f34369a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tq8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        tq8 tq8Var = (tq8) obj;
        return this.f34369a == tq8Var.f34369a && this.b == tq8Var.b && this.c == tq8Var.c && this.d == tq8Var.d;
    }

    public final int hashCode() {
        return (((((this.f34369a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(tq8.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f34369a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return rz4.j(this.d, "] }", sb);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public tq8(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
