package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u780 implements x780 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35172a;
    public final String b;

    public u780(String str, String str2) {
        str.getClass();
        this.f35172a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u780)) {
            return false;
        }
        u780 u780Var = (u780) obj;
        return Intrinsics.d(this.f35172a, u780Var.f35172a) && this.b.equals(u780Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35172a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowErrorSnackBar(title=", this.f35172a, ", message=", this.b, Separators.RPAREN);
    }
}
