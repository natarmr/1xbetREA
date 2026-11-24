package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class iqa extends jqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f15200a;

    public iqa(ank0 ank0Var) {
        this.f15200a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqa) && this.f15200a.equals(((iqa) obj).f15200a);
    }

    public final int hashCode() {
        return this.f15200a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("TimerChanged(timer=", this.f15200a, Separators.RPAREN);
    }
}
