package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h0e implements q0e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12230a;
    public final int b;

    public h0e(String str, int i) {
        this.f12230a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0e)) {
            return false;
        }
        h0e h0eVar = (h0e) obj;
        return Intrinsics.d(this.f12230a, h0eVar.f12230a) && this.b == h0eVar.b;
    }

    public final int hashCode() {
        String str = this.f12230a;
        return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return dw9.n(this.b, "ShowCodeError(message=", this.f12230a, ", iconTintResId=", Separators.RPAREN);
    }
}
