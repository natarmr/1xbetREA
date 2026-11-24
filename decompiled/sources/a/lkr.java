package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lkr implements mkr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20213a;

    public final boolean equals(Object obj) {
        if (obj instanceof lkr) {
            return this.f20213a.equals(((lkr) obj).f20213a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20213a.hashCode();
    }

    public final String toString() {
        return kng0.l("QuestionText(value=", this.f20213a, Separators.RPAREN);
    }
}
