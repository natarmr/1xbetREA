package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class vkb implements wkb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nll0 f37564a;

    public vkb(nll0 nll0Var) {
        this.f37564a = nll0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vkb) && this.f37564a.equals(((vkb) obj).f37564a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.statistics_dont_found_for_event);
    }

    public final String toString() {
        return "SendResultGameCardSideEffect(internalEffect=" + this.f37564a + Separators.RPAREN;
    }
}
