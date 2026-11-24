package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class df4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5982a;
    public final String b;

    public df4(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f5982a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df4)) {
            return false;
        }
        df4 df4Var = (df4) obj;
        return Intrinsics.d(this.f5982a, df4Var.f5982a) && Intrinsics.d(this.b, df4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5982a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AuthLoginSimpleHeaderUiModel(title=", this.f5982a, ", subtitle=", this.b, Separators.RPAREN);
    }
}
