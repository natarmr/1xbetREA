package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wcd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j700 f38919a;

    public wcd0(j700 j700Var) {
        this.f38919a = j700Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wcd0) && this.f38919a == ((wcd0) obj).f38919a;
    }

    public final int hashCode() {
        return this.f38919a.hashCode();
    }

    public final String toString() {
        return "Shortcut(lineLiveScreenType=" + this.f38919a + Separators.RPAREN;
    }
}
