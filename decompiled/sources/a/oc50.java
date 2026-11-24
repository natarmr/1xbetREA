package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class oc50 implements qc50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25013a;
    public final String b;

    public oc50(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f25013a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc50)) {
            return false;
        }
        oc50 oc50Var = (oc50) obj;
        return Intrinsics.d(this.f25013a, oc50Var.f25013a) && Intrinsics.d(this.b, oc50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25013a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AuthButtons(loginText=", this.f25013a, ", registrationText=", this.b, Separators.RPAREN);
    }
}
