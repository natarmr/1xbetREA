package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class rn90 implements un90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30778a;

    public final boolean equals(Object obj) {
        if (obj instanceof rn90) {
            return this.f30778a == ((rn90) obj).f30778a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30778a);
    }

    public final String toString() {
        return ua80.e(this.f30778a, "OnPickerItemClick(pickerModelId=", Separators.RPAREN);
    }
}
