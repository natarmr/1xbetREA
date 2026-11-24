package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kak implements nak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17967a;

    public kak(String str) {
        this.f17967a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kak) && this.f17967a.equals(((kak) obj).f17967a);
    }

    public final int hashCode() {
        return this.f17967a.hashCode();
    }

    public final String toString() {
        return kng0.l("InvalidRangeError(errorMessage=", this.f17967a, Separators.RPAREN);
    }
}
