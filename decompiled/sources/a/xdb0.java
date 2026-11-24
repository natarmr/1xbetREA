package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class xdb0 implements zdb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40685a;

    public xdb0(int i) {
        this.f40685a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xdb0) && this.f40685a == ((xdb0) obj).f40685a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40685a);
    }

    public final String toString() {
        return ua80.e(this.f40685a, "OnWebGamesTopGamesCollectionHeaderClick(categoryId=", Separators.RPAREN);
    }
}
