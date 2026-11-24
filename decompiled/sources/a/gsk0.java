package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gsk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f11835a;
    public final List b;

    public gsk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f11835a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsk0)) {
            return false;
        }
        gsk0 gsk0Var = (gsk0) obj;
        return this.f11835a.equals(gsk0Var.f11835a) && Intrinsics.d(this.b, gsk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11835a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("MapStatistic(status=", this.f11835a, ", content=", this.b, Separators.RPAREN);
    }
}
