package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class th4 implements ni4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33944a;

    public th4(int i) {
        this.f33944a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof th4) && this.f33944a == ((th4) obj).f33944a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33944a);
    }

    public final String toString() {
        return ua80.e(this.f33944a, "OnAuthPickerPhoneChose(authPickerModelId=", Separators.RPAREN);
    }
}
