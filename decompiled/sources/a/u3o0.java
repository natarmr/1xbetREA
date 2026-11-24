package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class u3o0 implements x3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4i f35007a;

    public final boolean equals(Object obj) {
        if (obj instanceof u3o0) {
            return this.f35007a.equals(((u3o0) obj).f35007a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35007a.hashCode();
    }

    public final String toString() {
        return "LargeCardWatermark(model=" + this.f35007a + Separators.RPAREN;
    }
}
