package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jmd0 implements qmd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16759a;

    public jmd0(String str) {
        this.f16759a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jmd0) && this.f16759a.equals(((jmd0) obj).f16759a);
    }

    public final int hashCode() {
        return this.f16759a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowBetExistErrorDialog(message=", this.f16759a, Separators.RPAREN);
    }
}
