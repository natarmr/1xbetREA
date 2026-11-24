package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class cte implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4931a;

    public final boolean equals(Object obj) {
        if (obj instanceof cte) {
            return this.f4931a.equals(((cte) obj).f4931a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4931a.hashCode();
    }

    public final String toString() {
        return kng0.l("AutoSubText(value=", this.f4931a, Separators.RPAREN);
    }
}
