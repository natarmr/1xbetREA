package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mfh implements nfh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21694a;

    public final boolean equals(Object obj) {
        if (obj instanceof mfh) {
            return this.f21694a.equals(((mfh) obj).f21694a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21694a.hashCode();
    }

    public final String toString() {
        return twn.r(this.f21694a, "Teams(value=", Separators.RPAREN);
    }
}
