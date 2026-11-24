package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v72 implements y72 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36902a;
    public final String b;

    public v72(String str, String str2) {
        str.getClass();
        this.f36902a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v72)) {
            return false;
        }
        v72 v72Var = (v72) obj;
        return Intrinsics.d(this.f36902a, v72Var.f36902a) && Intrinsics.d(this.b, v72Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f36902a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return b1j.k("Error(title=", this.f36902a, ", subtitle=", this.b, Separators.RPAREN);
    }
}
