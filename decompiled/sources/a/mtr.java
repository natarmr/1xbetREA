package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mtr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22382a;
    public final boolean b;

    public mtr(int i, boolean z) {
        this.f22382a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mtr)) {
            return false;
        }
        mtr mtrVar = (mtr) obj;
        return this.f22382a == mtrVar.f22382a && this.b == mtrVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f22382a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f22382a, "GameCardFavoriteUiModel(iconRes=", ", isFavorite=", Separators.RPAREN, this.b);
    }
}
