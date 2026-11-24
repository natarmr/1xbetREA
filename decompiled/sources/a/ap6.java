package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ap6 implements ip6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1235a;
    public final String b;

    public ap6(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f1235a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap6)) {
            return false;
        }
        ap6 ap6Var = (ap6) obj;
        return Intrinsics.d(this.f1235a, ap6Var.f1235a) && Intrinsics.d(this.b, ap6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1235a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowErrorDialog(title=", this.f1235a, ", message=", this.b, Separators.RPAREN);
    }
}
