package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class lzy implements nzy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzy f20925a;

    public lzy(uzy uzyVar) {
        this.f20925a = uzyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lzy) && this.f20925a.equals(((lzy) obj).f20925a);
    }

    public final int hashCode() {
        return this.f20925a.hashCode();
    }

    public final String toString() {
        return "OnGameClicked(lastGameDataUiModel=" + this.f20925a + Separators.RPAREN;
    }
}
