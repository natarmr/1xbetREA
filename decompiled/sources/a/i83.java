package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class i83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14321a;
    public final int b;
    public final int c;
    public final String d;

    public i83(int i, int i2, Object obj, String str) {
        this.f14321a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        ycx.a("Reversed range is not supported");
    }

    public static i83 a(i83 i83Var, f83 f83Var, int i, int i2) {
        Object obj = f83Var;
        if ((i2 & 1) != 0) {
            obj = i83Var.f14321a;
        }
        int i3 = i83Var.b;
        if ((i2 & 4) != 0) {
            i = i83Var.c;
        }
        return new i83(i3, i, obj, i83Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i83)) {
            return false;
        }
        i83 i83Var = (i83) obj;
        return Intrinsics.d(this.f14321a, i83Var.f14321a) && this.b == i83Var.b && this.c == i83Var.c && Intrinsics.d(this.d, i83Var.d);
    }

    public final int hashCode() {
        Object obj = this.f14321a;
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range(item=");
        sb.append(this.f14321a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        return rw2.k(this.c, ", tag=", this.d, Separators.RPAREN, sb);
    }

    public i83(int i, int i2, Object obj) {
        this(i, i2, obj, "");
    }
}
