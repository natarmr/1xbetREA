package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class hsk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f13589a;
    public final List b;

    public hsk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f13589a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hsk0)) {
            return false;
        }
        hsk0 hsk0Var = (hsk0) obj;
        return this.f13589a.equals(hsk0Var.f13589a) && Intrinsics.d(this.b, hsk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13589a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("MedalTable(status=", this.f13589a, ", content=", this.b, Separators.RPAREN);
    }
}
