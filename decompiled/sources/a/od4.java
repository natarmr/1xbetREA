package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class od4 implements me4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25060a;

    public od4(int i) {
        this.f25060a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od4) && this.f25060a == ((od4) obj).f25060a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25060a);
    }

    public final String toString() {
        return ua80.e(this.f25060a, "OnAuthEntryPointClick(typeByInt=", Separators.RPAREN);
    }
}
