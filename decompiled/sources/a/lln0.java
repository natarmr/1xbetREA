package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class lln0 implements qln0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20256a;
    public final String b;

    public lln0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f20256a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lln0)) {
            return false;
        }
        lln0 lln0Var = (lln0) obj;
        return Intrinsics.d(this.f20256a, lln0Var.f20256a) && Intrinsics.d(this.b, lln0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f20256a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ErrorText(supportingText=", this.f20256a, ", supportingValue=", this.b, Separators.RPAREN);
    }
}
