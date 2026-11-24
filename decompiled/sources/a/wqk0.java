package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wqk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ar40 f39595a;

    public wqk0(ar40 ar40Var) {
        this.f39595a = ar40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqk0) && this.f39595a == ((wqk0) obj).f39595a;
    }

    public final int hashCode() {
        return this.f39595a.hashCode();
    }

    public final String toString() {
        return "OnMoreBtnClick(sectionType=" + this.f39595a + Separators.RPAREN;
    }
}
