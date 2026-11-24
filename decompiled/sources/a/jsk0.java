package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class jsk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f17057a;
    public final List b;

    public jsk0(btk0 btk0Var, List list) {
        list.getClass();
        this.f17057a = btk0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jsk0)) {
            return false;
        }
        jsk0 jsk0Var = (jsk0) obj;
        return this.f17057a.equals(jsk0Var.f17057a) && Intrinsics.d(this.b, jsk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17057a.hashCode() * 31);
    }

    public final String toString() {
        return kng0.j("PrizeDistribution(status=", this.f17057a, ", content=", this.b, Separators.RPAREN);
    }
}
