package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class h30 implements w30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12362a = "";

    @Override // a.w30
    public final String a() {
        return this.f12362a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h30) && this.f12362a.equals(((h30) obj).f12362a);
    }

    public final int hashCode() {
        return this.f12362a.hashCode();
    }

    public final String toString() {
        return kng0.l("NoAdvanceBalance(advanceTitle=", this.f12362a, Separators.RPAREN);
    }
}
