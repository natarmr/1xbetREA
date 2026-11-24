package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a0d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22a;
    public final String b;

    public a0d0(String str, String str2) {
        this.f22a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0d0)) {
            return false;
        }
        a0d0 a0d0Var = (a0d0) obj;
        return this.f22a.equals(a0d0Var.f22a) && Intrinsics.d(this.b, a0d0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f22a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return b1j.k("Property(name=", this.f22a, ", seekValue=", this.b, Separators.RPAREN);
    }
}
