package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qho0 implements who0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28750a;

    public qho0(String str) {
        this.f28750a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qho0) && this.f28750a.equals(((qho0) obj).f28750a);
    }

    public final int hashCode() {
        return this.f28750a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenBrowser(link=", this.f28750a, Separators.RPAREN);
    }
}
