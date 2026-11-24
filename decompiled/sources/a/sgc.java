package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class sgc implements mgc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32153a;

    public final boolean equals(Object obj) {
        if (obj instanceof sgc) {
            return this.f32153a == ((sgc) obj).f32153a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32153a);
    }

    public final String toString() {
        return ua80.e(this.f32153a, "OnLanguageSelected(id=", Separators.RPAREN);
    }
}
