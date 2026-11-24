package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class o8f0 implements s9f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24827a;

    public o8f0(int i) {
        this.f24827a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8f0) && this.f24827a == ((o8f0) obj).f24827a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f24827a);
    }

    public final String toString() {
        return ua80.e(this.f24827a, "OnAuthPickerDialogItemClick(authPickerModelId=", Separators.RPAREN);
    }
}
