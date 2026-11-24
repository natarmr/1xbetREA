package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class iv30 implements lv30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f8w f15426a;

    public iv30(f8w f8wVar) {
        f8wVar.getClass();
        this.f15426a = f8wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iv30) && this.f15426a == ((iv30) obj).f15426a;
    }

    public final int hashCode() {
        return this.f15426a.hashCode();
    }

    public final String toString() {
        return "OnHideHistoryApplied(historyTypeScreen=" + this.f15426a + Separators.RPAREN;
    }
}
