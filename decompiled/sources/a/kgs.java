package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class kgs implements ogs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18255a;

    public kgs(String str) {
        str.getClass();
        this.f18255a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kgs) && Intrinsics.d(this.f18255a, ((kgs) obj).f18255a);
    }

    public final int hashCode() {
        return this.f18255a.hashCode();
    }

    public final String toString() {
        return kng0.l("MarketUiModel(marketText=", this.f18255a, Separators.RPAREN);
    }
}
