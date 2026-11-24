package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o30 implements x30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24556a;
    public final String b;

    public o30(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f24556a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o30)) {
            return false;
        }
        o30 o30Var = (o30) obj;
        return Intrinsics.d(this.f24556a, o30Var.f24556a) && Intrinsics.d(this.b, o30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24556a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("RefreshActive(balanceValue=", this.f24556a, ", currency=", this.b, Separators.RPAREN);
    }
}
