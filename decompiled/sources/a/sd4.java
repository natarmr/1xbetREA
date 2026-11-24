package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class sd4 implements me4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32014a;

    public sd4(int i) {
        this.f32014a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sd4) && this.f32014a == ((sd4) obj).f32014a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32014a);
    }

    public final String toString() {
        return ua80.e(this.f32014a, "OnAuthPickerPhoneChose(authPickerModelId=", Separators.RPAREN);
    }
}
