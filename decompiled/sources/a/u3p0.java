package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class u3p0 implements a4p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35009a;

    public u3p0(int i) {
        this.f35009a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u3p0) && this.f35009a == ((u3p0) obj).f35009a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35009a);
    }

    public final String toString() {
        return ua80.e(this.f35009a, "OnButtonBarClick(buttonId=", Separators.RPAREN);
    }
}
