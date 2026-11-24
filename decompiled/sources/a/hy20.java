package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hy20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13841a;

    public hy20(String str) {
        str.getClass();
        this.f13841a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hy20) && Intrinsics.d(this.f13841a, ((hy20) obj).f13841a);
    }

    public final int hashCode() {
        return this.f13841a.hashCode();
    }

    public final String toString() {
        return kng0.l("MarketUiModel(marketText=", this.f13841a, Separators.RPAREN);
    }
}
