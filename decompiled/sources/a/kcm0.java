package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kcm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18068a;

    public /* synthetic */ kcm0(int i) {
        this.f18068a = i;
    }

    public static String a(int i) {
        return ua80.e(i, "StatisticColumnId(value=", Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kcm0) {
            return this.f18068a == ((kcm0) obj).f18068a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f18068a);
    }

    public final String toString() {
        return a(this.f18068a);
    }
}
