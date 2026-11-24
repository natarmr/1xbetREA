package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class t94 implements pa4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33543a;

    public t94(int i) {
        this.f33543a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t94) && this.f33543a == ((t94) obj).f33543a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f33543a);
    }

    public final String toString() {
        return ua80.e(this.f33543a, "OnAuthEntryPointClick(typeByInt=", Separators.RPAREN);
    }
}
