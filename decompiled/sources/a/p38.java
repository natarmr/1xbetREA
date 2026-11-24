package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p38 implements u38 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26287a;

    public p38(int i) {
        this.f26287a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p38) && this.f26287a == ((p38) obj).f26287a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26287a);
    }

    public final String toString() {
        return ua80.e(this.f26287a, "ShowCountryPhonePrefixPickerDialog(selectedId=", Separators.RPAREN);
    }
}
