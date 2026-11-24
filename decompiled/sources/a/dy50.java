package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dy50 implements fy50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j460 f6878a;

    public dy50(j460 j460Var) {
        this.f6878a = j460Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dy50) && this.f6878a.equals(((dy50) obj).f6878a);
    }

    public final int hashCode() {
        return this.f6878a.hashCode();
    }

    public final String toString() {
        return "OnAllButtonClick(headerType=" + this.f6878a + Separators.RPAREN;
    }
}
