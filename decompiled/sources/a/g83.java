package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class g83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10845a;
    public final int b;
    public int c;
    public final String d;

    public /* synthetic */ g83(Object obj, int i, int i2, int i3) {
        this(i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, obj, (i3 & 8) != 0 ? "" : "androidx.compose.foundation.text.inlineContent");
    }

    public final i83 a(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (!(i != Integer.MIN_VALUE)) {
            ycx.b("Item.end should be set first");
        }
        return new i83(this.b, i, this.f10845a, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g83)) {
            return false;
        }
        g83 g83Var = (g83) obj;
        return Intrinsics.d(this.f10845a, g83Var.f10845a) && this.b == g83Var.b && this.c == g83Var.c && Intrinsics.d(this.d, g83Var.d);
    }

    public final int hashCode() {
        Object obj = this.f10845a;
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        int i = this.c;
        StringBuilder sb = new StringBuilder("MutableRange(item=");
        sb.append(this.f10845a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        return rw2.k(i, ", tag=", this.d, Separators.RPAREN, sb);
    }

    public g83(int i, int i2, Object obj, String str) {
        this.f10845a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
    }
}
