package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class zqf implements brf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44805a;

    public final boolean equals(Object obj) {
        if (obj instanceof zqf) {
            return this.f44805a == ((zqf) obj).f44805a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f44805a);
    }

    public final String toString() {
        return ua80.e(this.f44805a, "TerroristsWinMethodIcon(value=", Separators.RPAREN);
    }
}
