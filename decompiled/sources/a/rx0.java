package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class rx0 {
    public static final qx0 Companion = new qx0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f31239a;
    public final String b;

    public /* synthetic */ rx0(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f31239a = null;
        } else {
            this.f31239a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx0)) {
            return false;
        }
        rx0 rx0Var = (rx0) obj;
        return Intrinsics.d(this.f31239a, rx0Var.f31239a) && Intrinsics.d(this.b, rx0Var.b);
    }

    public final int hashCode() {
        Long l = this.f31239a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f31239a, "AggregatorGamesProductResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
