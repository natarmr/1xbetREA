package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yin implements bjn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xhn f42701a;

    public yin(xhn xhnVar) {
        this.f42701a = xhnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yin) && this.f42701a.equals(((yin) obj).f42701a);
    }

    public final int hashCode() {
        return this.f42701a.hashCode();
    }

    public final String toString() {
        return "GameStartScreenShowing(cellUiModel=" + this.f42701a + Separators.RPAREN;
    }
}
