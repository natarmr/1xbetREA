package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aax implements bax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f552a;

    public final boolean equals(Object obj) {
        if (obj instanceof aax) {
            return this.f552a == ((aax) obj).f552a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f552a);
    }

    public final String toString() {
        return ua80.e(this.f552a, "NameResId(value=", Separators.RPAREN);
    }
}
