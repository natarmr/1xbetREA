package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bve0 implements hwe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3277a;

    public bve0(int i) {
        this.f3277a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bve0) && this.f3277a == ((bve0) obj).f3277a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3277a);
    }

    public final String toString() {
        return ua80.e(this.f3277a, "OnAuthPickerDialogItemClick(authPickerModelId=", Separators.RPAREN);
    }
}
