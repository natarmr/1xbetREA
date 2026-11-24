package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class jte implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17095a;

    public final boolean equals(Object obj) {
        if (obj instanceof jte) {
            return this.f17095a.equals(((jte) obj).f17095a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17095a.hashCode();
    }

    public final String toString() {
        return kng0.l("MarketHeaderText(value=", this.f17095a, Separators.RPAREN);
    }
}
