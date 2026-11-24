package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xw20 implements cx20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41590a;

    public final boolean equals(Object obj) {
        if (obj instanceof xw20) {
            return this.f41590a == ((xw20) obj).f41590a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f41590a);
    }

    public final String toString() {
        return ua80.e(this.f41590a, "BackgroundColorByPosition(value=", Separators.RPAREN);
    }
}
