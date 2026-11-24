package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p060 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26134a;
    public final String b;

    public p060(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f26134a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p060)) {
            return false;
        }
        p060 p060Var = (p060) obj;
        return Intrinsics.d(this.f26134a, p060Var.f26134a) && Intrinsics.d(this.b, p060Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26134a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowConfirmResetDialog(title=", this.f26134a, ", message=", this.b, Separators.RPAREN);
    }
}
