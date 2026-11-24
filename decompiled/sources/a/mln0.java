package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mln0 implements rln0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22000a;
    public final String b;

    public mln0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f22000a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mln0)) {
            return false;
        }
        mln0 mln0Var = (mln0) obj;
        return Intrinsics.d(this.f22000a, mln0Var.f22000a) && Intrinsics.d(this.b, mln0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22000a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ErrorText(supportingText=", this.f22000a, ", supportingValue=", this.b, Separators.RPAREN);
    }
}
