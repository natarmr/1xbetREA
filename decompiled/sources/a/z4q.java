package a;

import android.gov.nist.core.Separators;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class z4q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ygq0 f43783a;
    public final Pair b;

    public z4q(ygq0 ygq0Var, Pair pair) {
        ygq0Var.getClass();
        pair.getClass();
        this.f43783a = ygq0Var;
        this.b = pair;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4q)) {
            return false;
        }
        z4q z4qVar = (z4q) obj;
        return this.f43783a == z4qVar.f43783a && Intrinsics.d(this.b, z4qVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43783a.hashCode() * 31);
    }

    public final String toString() {
        return "FilterWithTimeModel(timeFilter=" + this.f43783a + ", timeSeconds=" + this.b + Separators.RPAREN;
    }
}
