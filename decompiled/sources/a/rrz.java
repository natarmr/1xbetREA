package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class rrz implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31008a;

    public rrz(int i) {
        this.f31008a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rrz) && this.f31008a == ((rrz) obj).f31008a;
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.deposit_limits_requirements) + (Integer.hashCode(this.f31008a) * 31);
    }

    public final String toString() {
        return ohs0.m("LimitTitleDescriptionUiModel(titleResId=", this.f31008a, ", descriptionResId=", Separators.RPAREN, R.string.deposit_limits_requirements);
    }
}
