package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uqf implements brf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36116a;

    public final boolean equals(Object obj) {
        if (obj instanceof uqf) {
            return this.f36116a == ((uqf) obj).f36116a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36116a);
    }

    public final String toString() {
        return ua80.e(this.f36116a, "ColorRoundText(value=", Separators.RPAREN);
    }
}
