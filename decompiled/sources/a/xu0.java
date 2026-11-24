package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41488a;
    public final i4 b;

    public xu0(i4 i4Var, String str) {
        i4Var.getClass();
        this.f41488a = str;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu0)) {
            return false;
        }
        xu0 xu0Var = (xu0) obj;
        return this.f41488a.equals(xu0Var.f41488a) && Intrinsics.d(this.b, xu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41488a.hashCode() * 31);
    }

    public final String toString() {
        return "AggregatorGameModePickerUiState(title=" + this.f41488a + ", items=" + this.b + Separators.RPAREN;
    }
}
