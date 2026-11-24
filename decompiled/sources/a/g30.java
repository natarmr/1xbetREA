package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class g30 implements v30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10587a = "";

    @Override // a.v30
    public final String a() {
        return this.f10587a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g30) && this.f10587a.equals(((g30) obj).f10587a);
    }

    public final int hashCode() {
        return this.f10587a.hashCode();
    }

    public final String toString() {
        return kng0.l("NoAdvanceBalance(advanceTitle=", this.f10587a, Separators.RPAREN);
    }
}
