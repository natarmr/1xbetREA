package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mp90 implements op90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22167a;

    public mp90(int i) {
        this.f22167a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mp90) && this.f22167a == ((mp90) obj).f22167a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22167a);
    }

    public final String toString() {
        return ua80.e(this.f22167a, "ChoosePickerModel(pickerModelId=", Separators.RPAREN);
    }
}
