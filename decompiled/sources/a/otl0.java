package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class otl0 implements qtl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25835a;

    public final boolean equals(Object obj) {
        if (obj instanceof otl0) {
            return this.f25835a == ((otl0) obj).f25835a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f25835a);
    }

    public final String toString() {
        return ua80.e(this.f25835a, "ImageRes(value=", Separators.RPAREN);
    }
}
