package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y1m implements a2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2m f41862a;
    public final x1m b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public y1m(d2m d2mVar, x1m x1mVar, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f41862a = d2mVar;
        this.b = x1mVar;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1m)) {
            return false;
        }
        y1m y1mVar = (y1m) obj;
        return this.f41862a.equals(y1mVar.f41862a) && this.b.equals(y1mVar.b) && Intrinsics.d(this.c, y1mVar.c) && Intrinsics.d(this.d, y1mVar.d) && this.e == y1mVar.e && this.f == y1mVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(ua80.b(ua80.b((this.b.hashCode() + (this.f41862a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Score(style=");
        sb.append(this.f41862a);
        sb.append(", colorStyle=");
        sb.append(this.b);
        sb.append(", firstScore=");
        f140.v(sb, this.c, ", secondScore=", this.d, ", isFirstScoreChange=");
        return ohs0.p(", isSecondScoreChange=", Separators.RPAREN, sb, this.e, this.f);
    }
}
