package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class vdb0 implements zdb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37223a;

    public vdb0(int i) {
        this.f37223a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdb0) && this.f37223a == ((vdb0) obj).f37223a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37223a);
    }

    public final String toString() {
        return ua80.e(this.f37223a, "OnWebGamesCollectionHeaderClick(categoryId=", Separators.RPAREN);
    }
}
