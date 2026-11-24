package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ny1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final my1 f24309a;
    public final String b;

    public ny1(my1 my1Var, String str) {
        this.f24309a = my1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny1)) {
            return false;
        }
        ny1 ny1Var = (ny1) obj;
        return this.f24309a.equals(ny1Var.f24309a) && Intrinsics.d(this.b, ny1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f24309a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AggregatorTournamentsCardsNativeTagsUiModel(main=" + this.f24309a + ", additionalLabel=" + this.b + Separators.RPAREN;
    }
}
