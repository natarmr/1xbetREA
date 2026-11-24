package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class uh0 implements a2p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35651a;
    public final String b;

    public uh0(String str) {
        str.getClass();
        this.f35651a = str;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uh0) && Intrinsics.d(this.f35651a, ((uh0) obj).f35651a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.b;
    }

    public final int hashCode() {
        return this.f35651a.hashCode();
    }

    public final String toString() {
        return kng0.l("AggregatorCategoryHeader(text=", this.f35651a, Separators.RPAREN);
    }
}
