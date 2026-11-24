package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class pa10 implements qa10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26634a;

    public /* synthetic */ pa10(int i) {
        this.f26634a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pa10) {
            return this.f26634a == ((pa10) obj).f26634a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26634a);
    }

    public final String toString() {
        return ua80.e(this.f26634a, "RawRes(resId=", Separators.RPAREN);
    }
}
