package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n08 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22689a;
    public final int b;
    public final int c;

    public n08(int i, int i2, List list) {
        list.getClass();
        this.f22689a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n08)) {
            return false;
        }
        n08 n08Var = (n08) obj;
        return Intrinsics.d(this.f22689a, n08Var.f22689a) && this.b == n08Var.b && this.c == n08Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f22689a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BigPigSeriesModel(throws=");
        sb.append(this.f22689a);
        sb.append(", pointsOfSeries=");
        sb.append(this.b);
        sb.append(", pointsOfGame=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
