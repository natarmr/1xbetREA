package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class jqn0 implements nqn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16962a;

    public jqn0(String str) {
        this.f16962a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jqn0) && this.f16962a.equals(((jqn0) obj).f16962a);
    }

    public final int hashCode() {
        return this.f16962a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowError(message=", this.f16962a, Separators.RPAREN);
    }
}
