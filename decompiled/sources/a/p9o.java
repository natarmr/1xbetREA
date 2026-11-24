package a;

import android.util.Range;
import android.util.Rational;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p9o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26616a;
    public final int b;
    public final Range c;
    public final Rational d;

    public p9o(boolean z, int i, Range range, Rational rational) {
        range.getClass();
        rational.getClass();
        this.f26616a = z;
        this.b = i;
        this.c = range;
        this.d = rational;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9o)) {
            return false;
        }
        p9o p9oVar = (p9o) obj;
        return this.f26616a == p9oVar.f26616a && this.b == p9oVar.b && Intrinsics.d(this.c, p9oVar.c) && Intrinsics.d(this.d, p9oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + twn.a(this.b, Boolean.hashCode(this.f26616a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "EvCompValue(supported=" + this.f26616a + ", index=" + this.b + ", range=" + this.c + ", step=" + this.d + ')';
    }
}
