package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kkr implements mkr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18455a;

    public final boolean equals(Object obj) {
        if (obj instanceof kkr) {
            return this.f18455a.equals(((kkr) obj).f18455a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18455a.hashCode();
    }

    public final String toString() {
        return kng0.l("QuestionNumber(value=", this.f18455a, Separators.RPAREN);
    }
}
