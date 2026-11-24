package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class uzh0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36535a;

    public uzh0(String str) {
        this.f36535a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uzh0) && this.f36535a.equals(((uzh0) obj).f36535a);
    }

    public final int hashCode() {
        return this.f36535a.hashCode();
    }

    public final String toString() {
        return kng0.l("SelectAwardSubHeaderUiModel(title=", this.f36535a, Separators.RPAREN);
    }
}
