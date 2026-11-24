package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v890 implements c990 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36971a;

    public v890(String str) {
        this.f36971a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v890) && this.f36971a.equals(((v890) obj).f36971a);
    }

    public final int hashCode() {
        return this.f36971a.hashCode();
    }

    public final String toString() {
        return kng0.l("OpenInBrowserAction(url=", this.f36971a, Separators.RPAREN);
    }
}
