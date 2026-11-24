package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class am6 {
    public static final zl6 Companion = new zl6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f1095a;
    public final String b;

    public /* synthetic */ am6(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f1095a = null;
        } else {
            this.f1095a = l;
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
        if (!(obj instanceof am6)) {
            return false;
        }
        am6 am6Var = (am6) obj;
        return Intrinsics.d(this.f1095a, am6Var.f1095a) && Intrinsics.d(this.b, am6Var.b);
    }

    public final int hashCode() {
        Long l = this.f1095a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f1095a, "BetBuilderSubSportResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
