package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ya50 extends cb50 {
    public final int b;

    public ya50(int i) {
        super("FAVORITE");
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ya50) && this.b == ((ya50) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return ua80.e(this.b, "Favorite(favoriteCategoryId=", Separators.RPAREN);
    }
}
