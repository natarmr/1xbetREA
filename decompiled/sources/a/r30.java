package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class r30 implements x30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29762a;
    public final String b;

    public r30(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f29762a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r30)) {
            return false;
        }
        r30 r30Var = (r30) obj;
        return Intrinsics.d(this.f29762a, r30Var.f29762a) && Intrinsics.d(this.b, r30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29762a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("RefreshDisabled(balanceValue=", this.f29762a, ", currency=", this.b, Separators.RPAREN);
    }
}
