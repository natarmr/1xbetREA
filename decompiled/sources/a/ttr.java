package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ttr implements cur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f34521a;

    public final boolean equals(Object obj) {
        if (obj instanceof ttr) {
            return this.f34521a.equals(((ttr) obj).f34521a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34521a.f1159a.hashCode();
    }

    public final String toString() {
        return w6x.p("GameName(value=", this.f34521a, Separators.RPAREN);
    }
}
