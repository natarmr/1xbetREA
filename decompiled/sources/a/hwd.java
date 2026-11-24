package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hwd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ytl f13765a;

    public hwd(ytl ytlVar) {
        this.f13765a = ytlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hwd) && this.f13765a.equals(((hwd) obj).f13765a);
    }

    public final int hashCode() {
        return this.f13765a.hashCode();
    }

    public final String toString() {
        return "ConfirmChooseLanguageBottomSheetUiState(model=" + this.f13765a + Separators.RPAREN;
    }
}
