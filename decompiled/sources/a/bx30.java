package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class bx30 implements kx30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3358a;
    public final String b;

    public bx30(String str, String str2) {
        str.getClass();
        this.f3358a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx30)) {
            return false;
        }
        bx30 bx30Var = (bx30) obj;
        return Intrinsics.d(this.f3358a, bx30Var.f3358a) && this.b.equals(bx30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3358a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Hide(snackbarTitle=", this.f3358a, ", betId=", this.b, Separators.RPAREN);
    }
}
