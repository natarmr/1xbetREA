package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p0c0 implements u0c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nk90 f26143a;

    public p0c0(nk90 nk90Var) {
        this.f26143a = nk90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0c0) && this.f26143a.equals(((p0c0) obj).f26143a);
    }

    public final int hashCode() {
        return this.f26143a.hashCode();
    }

    public final String toString() {
        return "OnGenderSelected(personalGenderChoice=" + this.f26143a + Separators.RPAREN;
    }
}
