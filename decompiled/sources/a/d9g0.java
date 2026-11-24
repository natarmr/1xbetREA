package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class d9g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nll0 f5700a;

    public d9g0(nll0 nll0Var) {
        this.f5700a = nll0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9g0) && this.f5700a.equals(((d9g0) obj).f5700a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.statistics_dont_found_for_event);
    }

    public final String toString() {
        return "SendResultGameCardSideEffect(internalEffect=" + this.f5700a + Separators.RPAREN;
    }
}
