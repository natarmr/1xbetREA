package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nm10 implements sm10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23751a;

    public nm10(String str) {
        this.f23751a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nm10) && this.f23751a.equals(((nm10) obj).f23751a);
    }

    public final int hashCode() {
        return this.f23751a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(message=", this.f23751a, Separators.RPAREN);
    }
}
