package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class hdm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f12876a;

    public hdm(i4 i4Var) {
        i4Var.getClass();
        this.f12876a = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hdm) && Intrinsics.d(this.f12876a, ((hdm) obj).f12876a);
    }

    public final int hashCode() {
        return this.f12876a.hashCode();
    }

    public final String toString() {
        return h97.i(this.f12876a, "DsCyberUFCBannerCollectionUiModel(items=", Separators.RPAREN);
    }
}
