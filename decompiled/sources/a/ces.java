package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ces extends oes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4227a;

    public ces(int i) {
        this.f4227a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ces) && this.f4227a == ((ces) obj).f4227a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4227a);
    }

    public final String toString() {
        return ua80.e(this.f4227a, "TeamOneRedCardNumberChanged(teamOneRedCards=", Separators.RPAREN);
    }
}
