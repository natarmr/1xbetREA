package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a7c implements h7c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f360a;
    public final int b;

    public a7c(String str, int i) {
        this.f360a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7c)) {
            return false;
        }
        a7c a7cVar = (a7c) obj;
        return Intrinsics.d(this.f360a, a7cVar.f360a) && this.b == a7cVar.b;
    }

    public final int hashCode() {
        String str = this.f360a;
        return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "ShowCodeError(message=", this.f360a, ", iconTintResId=", Separators.RPAREN);
    }
}
