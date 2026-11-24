package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v7g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36924a;

    public v7g0(String str) {
        this.f36924a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7g0) && this.f36924a.equals(((v7g0) obj).f36924a);
    }

    public final int hashCode() {
        return this.f36924a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenNavigationBottomSheet(teamId=", this.f36924a, Separators.RPAREN);
    }
}
