package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class rk3 implements xk3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30627a;
    public final String b;

    public rk3(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f30627a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk3)) {
            return false;
        }
        rk3 rk3Var = (rk3) obj;
        return Intrinsics.d(this.f30627a, rk3Var.f30627a) && Intrinsics.d(this.b, rk3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30627a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CorruptedFileError(version=", this.f30627a, ", updateUrl=", this.b, Separators.RPAREN);
    }
}
