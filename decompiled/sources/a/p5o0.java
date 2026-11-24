package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class p5o0 implements s5o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l4i f26415a;

    public final boolean equals(Object obj) {
        if (obj instanceof p5o0) {
            return this.f26415a.equals(((p5o0) obj).f26415a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26415a.hashCode();
    }

    public final String toString() {
        return "LargeCardWatermark(model=" + this.f26415a + Separators.RPAREN;
    }
}
