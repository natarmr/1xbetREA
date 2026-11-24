package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class j40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15860a;

    public /* synthetic */ j40(String str) {
        this.f15860a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j40) {
            return this.f15860a.equals(((j40) obj).f15860a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15860a.hashCode();
    }

    public final String toString() {
        return kng0.l("AdvanceUiModel(value=", this.f15860a, Separators.RPAREN);
    }
}
