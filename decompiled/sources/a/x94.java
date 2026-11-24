package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class x94 implements pa4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40492a;

    public x94(int i) {
        this.f40492a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x94) && this.f40492a == ((x94) obj).f40492a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40492a);
    }

    public final String toString() {
        return ua80.e(this.f40492a, "OnAuthPickerPhoneChose(authPickerModelId=", Separators.RPAREN);
    }
}
