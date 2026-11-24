package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class xuk0 implements zuk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nll0 f41515a;

    public xuk0(nll0 nll0Var) {
        this.f41515a = nll0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xuk0) && this.f41515a.equals(((xuk0) obj).f41515a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.statistics_dont_found_for_event);
    }

    public final String toString() {
        return "SendResultGameCardSideEffect(internalEffect=" + this.f41515a + Separators.RPAREN;
    }
}
