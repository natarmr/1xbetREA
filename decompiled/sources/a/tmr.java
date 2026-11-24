package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class tmr implements umr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f34207a;

    public final boolean equals(Object obj) {
        if (obj instanceof tmr) {
            return this.f34207a.equals(((tmr) obj).f34207a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34207a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f34207a, "UpdateDisplayedCards(cards=", Separators.RPAREN);
    }
}
