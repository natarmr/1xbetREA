package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class cqd extends fqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4788a;

    public cqd(String str) {
        this.f4788a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cqd) && this.f4788a.equals(((cqd) obj).f4788a);
    }

    public final int hashCode() {
        return this.f4788a.hashCode();
    }

    public final String toString() {
        return kng0.l("PeriodChanged(period=", this.f4788a, Separators.RPAREN);
    }
}
