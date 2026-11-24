package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pv7 implements rv7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dn7 f27650a;

    public final boolean equals(Object obj) {
        if (obj instanceof pv7) {
            return this.f27650a.equals(((pv7) obj).f27650a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f27650a.hashCode();
    }

    public final String toString() {
        return "Content(betSummaryInfoUiModel=" + this.f27650a + Separators.RPAREN;
    }
}
