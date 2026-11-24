package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class pc8 implements rc8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26745a;

    public final boolean equals(Object obj) {
        if (obj instanceof pc8) {
            return this.f26745a == ((pc8) obj).f26745a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26745a);
    }

    public final String toString() {
        return ua80.e(this.f26745a, "SelectBonus(bonusId=", Separators.RPAREN);
    }
}
