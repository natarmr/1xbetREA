package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ewz implements wwz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8550a;

    public ewz(String str) {
        str.getClass();
        this.f8550a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ewz) && Intrinsics.d(this.f8550a, ((ewz) obj).f8550a);
    }

    public final int hashCode() {
        return this.f8550a.hashCode();
    }

    public final String toString() {
        return kng0.l("LimitsIeFooterUiModel(text=", this.f8550a, Separators.RPAREN);
    }
}
