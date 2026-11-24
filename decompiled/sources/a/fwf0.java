package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class fwf0 implements hwf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10257a;
    public final String b;

    public fwf0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f10257a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fwf0)) {
            return false;
        }
        fwf0 fwf0Var = (fwf0) obj;
        return Intrinsics.d(this.f10257a, fwf0Var.f10257a) && Intrinsics.d(this.b, fwf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10257a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LinkState(url=", this.f10257a, ", webToken=", this.b, Separators.RPAREN);
    }
}
