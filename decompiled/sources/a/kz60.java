package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kz60 extends lz60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19140a;

    public kz60(int i) {
        this.f19140a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kz60) && this.f19140a == ((kz60) obj).f19140a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19140a);
    }

    public final String toString() {
        return ua80.e(this.f19140a, "VariantOneXGames(number=", Separators.RPAREN);
    }
}
