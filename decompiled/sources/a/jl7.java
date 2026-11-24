package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jl7 implements kl7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16701a;
    public final String b;

    public jl7(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f16701a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jl7)) {
            return false;
        }
        jl7 jl7Var = (jl7) obj;
        return Intrinsics.d(this.f16701a, jl7Var.f16701a) && Intrinsics.d(this.b, jl7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16701a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowSnackBarError(message=", this.f16701a, ", subtitle=", this.b, Separators.RPAREN);
    }
}
