package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zes extends hfs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f44268a;

    public zes(ank0 ank0Var) {
        this.f44268a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zes) && this.f44268a.equals(((zes) obj).f44268a);
    }

    public final int hashCode() {
        return this.f44268a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("GameScoreChanged(gameScore=", this.f44268a, Separators.RPAREN);
    }
}
