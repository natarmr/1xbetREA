package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m560 implements o560 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21207a;

    public m560(String str) {
        this.f21207a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m560) && this.f21207a.equals(((m560) obj).f21207a);
    }

    public final int hashCode() {
        return this.f21207a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowErrorDialog(text=", this.f21207a, Separators.RPAREN);
    }
}
