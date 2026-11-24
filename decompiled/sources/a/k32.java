package a;

import android.gov.nist.core.Separators;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class k32 implements l32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nll0 f17597a;

    public k32(nll0 nll0Var) {
        this.f17597a = nll0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k32) && this.f17597a.equals(((k32) obj).f17597a);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.statistics_dont_found_for_event);
    }

    public final String toString() {
        return "SendResultGameCardSideEffect(internalEffect=" + this.f17597a + Separators.RPAREN;
    }
}
