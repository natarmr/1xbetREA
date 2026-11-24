package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class i40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f14122a;

    public i40(ank0 ank0Var) {
        this.f14122a = ank0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i40) && this.f14122a.equals(((i40) obj).f14122a);
    }

    public final int hashCode() {
        return this.f14122a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("AdvanceUiModel(value=", this.f14122a, Separators.RPAREN);
    }
}
