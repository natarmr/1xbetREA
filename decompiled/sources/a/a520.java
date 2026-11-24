package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class a520 implements l520 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f249a;

    public a520(int i) {
        this.f249a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a520) && this.f249a == ((a520) obj).f249a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f249a);
    }

    public final String toString() {
        return ua80.e(this.f249a, "OnSystemTypeSelected(position=", Separators.RPAREN);
    }
}
