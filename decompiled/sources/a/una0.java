package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class una0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f35951a;

    public /* synthetic */ una0(int i) {
        this.f35951a = i;
    }

    public static String c(int i) {
        return ua80.e(i, "PlayingCardUiModel(cardDrawableResId=", Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof una0) {
            return this.f35951a == ((una0) obj).f35951a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f35951a);
    }

    public final String toString() {
        return c(this.f35951a);
    }
}
