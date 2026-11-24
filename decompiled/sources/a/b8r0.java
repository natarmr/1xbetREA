package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b8r0 implements c8r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2171a;
    public final String b;

    public b8r0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f2171a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8r0)) {
            return false;
        }
        b8r0 b8r0Var = (b8r0) obj;
        return Intrinsics.d(this.f2171a, b8r0Var.f2171a) && Intrinsics.d(this.b, b8r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2171a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AuthButtons(loginText=", this.f2171a, ", registrationText=", this.b, Separators.RPAREN);
    }
}
