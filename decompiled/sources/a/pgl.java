package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pgl implements tgl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ugl f26960a;

    public pgl(ugl uglVar) {
        this.f26960a = uglVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pgl) && this.f26960a.equals(((pgl) obj).f26960a);
    }

    public final int hashCode() {
        return this.f26960a.hashCode();
    }

    public final String toString() {
        return "GameScreenShowing(cellUiModel=" + this.f26960a + Separators.RPAREN;
    }
}
