package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class ghh0 implements hhh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nll0 f11299a;

    public ghh0(nll0 nll0Var) {
        this.f11299a = nll0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ghh0) && this.f11299a.equals(((ghh0) obj).f11299a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.statistics_dont_found_for_event);
    }

    public final String toString() {
        return "SendResultGameCardSideEffect(internalEffect=" + this.f11299a + Separators.RPAREN;
    }
}
