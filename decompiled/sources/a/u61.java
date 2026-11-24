package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class u61 implements h71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35117a;

    public u61(int i) {
        this.f35117a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u61) && this.f35117a == ((u61) obj).f35117a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35117a);
    }

    public final String toString() {
        return ua80.e(this.f35117a, "OnClickActionItem(id=", Separators.RPAREN);
    }
}
