package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wbg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h7h f38876a;
    public final boolean b;

    public wbg(h7h h7hVar, boolean z) {
        this.f38876a = h7hVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbg)) {
            return false;
        }
        wbg wbgVar = (wbg) obj;
        return this.f38876a.equals(wbgVar.f38876a) && this.b == wbgVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f38876a.hashCode() * 31);
    }

    public final String toString() {
        return "CyberCategorySubGameSectionUiModel(subGame=" + this.f38876a + ", isExpanded=" + this.b + Separators.RPAREN;
    }
}
