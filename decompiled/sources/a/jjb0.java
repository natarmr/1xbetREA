package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jjb0 implements kjb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16613a;

    public jjb0(String str) {
        this.f16613a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jjb0) && this.f16613a.equals(((jjb0) obj).f16613a);
    }

    public final int hashCode() {
        return this.f16613a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorMessage(message=", this.f16613a, Separators.RPAREN);
    }
}
