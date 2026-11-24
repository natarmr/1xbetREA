package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class h6i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i6i0 f12531a;
    public final String b;

    public h6i0(i6i0 i6i0Var, String str) {
        this.f12531a = i6i0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h6i0)) {
            return false;
        }
        h6i0 h6i0Var = (h6i0) obj;
        return this.f12531a == h6i0Var.f12531a && this.b.equals(h6i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12531a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectorUiModel(selectorUiType=" + this.f12531a + ", selectorOptionName=" + this.b + Separators.RPAREN;
    }
}
