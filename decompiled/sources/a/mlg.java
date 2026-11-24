package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class mlg implements plg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21988a;

    public mlg(int i) {
        this.f21988a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mlg) && this.f21988a == ((mlg) obj).f21988a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21988a);
    }

    public final String toString() {
        return ua80.e(this.f21988a, "DisciplineClick(bannerId=", Separators.RPAREN);
    }
}
