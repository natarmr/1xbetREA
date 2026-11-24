package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class sg8 implements tg8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32148a;

    public sg8(int i) {
        this.f32148a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg8) && this.f32148a == ((sg8) obj).f32148a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32148a);
    }

    public final String toString() {
        return ua80.e(this.f32148a, "OnBonusClick(selectedBonusId=", Separators.RPAREN);
    }
}
