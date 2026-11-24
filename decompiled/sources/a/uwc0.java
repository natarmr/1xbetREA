package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uwc0 implements wwc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36385a;

    public uwc0(String str) {
        this.f36385a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uwc0) && this.f36385a.equals(((uwc0) obj).f36385a);
    }

    public final int hashCode() {
        return this.f36385a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenDeepLink(deeplink=", this.f36385a, Separators.RPAREN);
    }
}
