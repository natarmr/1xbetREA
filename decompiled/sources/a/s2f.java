package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s2f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31498a;
    public final String b;

    public s2f(String str, String str2) {
        this.f31498a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2f)) {
            return false;
        }
        s2f s2fVar = (s2f) obj;
        return this.f31498a.equals(s2fVar.f31498a) && Intrinsics.d(this.b, s2fVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f31498a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return b1j.k("TextFieldState(couponId=", this.f31498a, ", errorText=", this.b, Separators.RPAREN);
    }
}
