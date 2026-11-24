package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k0r0 implements a1r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h1r0 f17483a;
    public final List b;

    public k0r0(h1r0 h1r0Var, List list) {
        list.getClass();
        this.f17483a = h1r0Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0r0)) {
            return false;
        }
        k0r0 k0r0Var = (k0r0) obj;
        return Intrinsics.d(this.f17483a, k0r0Var.f17483a) && Intrinsics.d(this.b, k0r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17483a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorTournaments(status=" + this.f17483a + ", value=" + this.b + Separators.RPAREN;
    }
}
