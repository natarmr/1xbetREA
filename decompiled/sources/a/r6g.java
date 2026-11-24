package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class r6g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29931a;
    public final boolean b;
    public final int c;
    public final int d;

    public r6g(int i, int i2, String str, boolean z) {
        str.getClass();
        this.f29931a = str;
        this.b = z;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6g)) {
            return false;
        }
        r6g r6gVar = (r6g) obj;
        return Intrinsics.d(this.f29931a, r6gVar.f29931a) && this.b == r6gVar.b && this.c == r6gVar.c && this.d == r6gVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, brm0.e(this.f29931a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return w6x.o(this.c, this.d, ", color=", Separators.RPAREN, brm0.u("DayOfWeekParams(title=", this.f29931a, ", backgroundAvailable=", this.b, ", alpha="));
    }
}
