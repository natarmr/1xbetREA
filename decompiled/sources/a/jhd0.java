package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jhd0 implements khd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16521a;

    public jhd0(String str) {
        this.f16521a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jhd0) && this.f16521a.equals(((jhd0) obj).f16521a);
    }

    public final int hashCode() {
        return this.f16521a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowTokenExpiredDialog(message=", this.f16521a, Separators.RPAREN);
    }
}
