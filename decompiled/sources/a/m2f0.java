package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m2f0 implements q3f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21056a;

    public m2f0(int i) {
        this.f21056a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2f0) && this.f21056a == ((m2f0) obj).f21056a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21056a);
    }

    public final String toString() {
        return ua80.e(this.f21056a, "OnAuthPickerDialogItemClick(authPickerModelId=", Separators.RPAREN);
    }
}
