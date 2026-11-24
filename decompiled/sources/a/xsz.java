package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class xsz implements vtz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41439a;

    public xsz(String str) {
        str.getClass();
        this.f41439a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xsz) && Intrinsics.d(this.f41439a, ((xsz) obj).f41439a);
    }

    public final int hashCode() {
        return this.f41439a.hashCode();
    }

    public final String toString() {
        return kng0.l("LimitsAfricaFooterUiModel(text=", this.f41439a, Separators.RPAREN);
    }
}
