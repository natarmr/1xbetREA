package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class usj {
    public static final tsj Companion = new tsj();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f36214a;
    public final Double b;

    public /* synthetic */ usj(int i, Long l, Double d) {
        if ((i & 1) == 0) {
            this.f36214a = null;
        } else {
            this.f36214a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usj)) {
            return false;
        }
        usj usjVar = (usj) obj;
        return Intrinsics.d(this.f36214a, usjVar.f36214a) && Intrinsics.d(this.b, usjVar.b);
    }

    public final int hashCode() {
        Long l = this.f36214a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.b;
        return iHashCode + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        return "DefaultBetSumDataSourceModel(balanceId=" + this.f36214a + ", defaultSum=" + this.b + Separators.RPAREN;
    }

    public usj(Long l, Double d) {
        this.f36214a = l;
        this.b = d;
    }
}
