package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jsl0 implements ksl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17059a;

    public jsl0(String str) {
        this.f17059a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jsl0) && this.f17059a.equals(((jsl0) obj).f17059a);
    }

    public final int hashCode() {
        return this.f17059a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSnack(message=", this.f17059a, Separators.RPAREN);
    }
}
