package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jed0 implements ked0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16368a;

    public jed0(String str) {
        this.f16368a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jed0) && this.f16368a.equals(((jed0) obj).f16368a);
    }

    public final int hashCode() {
        return this.f16368a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowSoundSelectionError(message=", this.f16368a, Separators.RPAREN);
    }
}
