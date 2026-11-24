package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ktc0 implements otc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zuc0 f18858a;

    public final boolean equals(Object obj) {
        if (obj instanceof ktc0) {
            return this.f18858a == ((ktc0) obj).f18858a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f18858a.hashCode();
    }

    public final String toString() {
        return "Style(value=" + this.f18858a + Separators.RPAREN;
    }
}
