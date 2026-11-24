package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xqf implements brf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41315a;

    public final boolean equals(Object obj) {
        if (obj instanceof xqf) {
            return this.f41315a.equals(((xqf) obj).f41315a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41315a.hashCode();
    }

    public final String toString() {
        return kng0.l("Round(value=", this.f41315a, Separators.RPAREN);
    }
}
