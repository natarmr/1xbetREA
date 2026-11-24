package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xw40 implements zw40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41592a;
    public final String b;

    public xw40(String str, String str2) {
        str.getClass();
        this.f41592a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw40)) {
            return false;
        }
        xw40 xw40Var = (xw40) obj;
        return Intrinsics.d(this.f41592a, xw40Var.f41592a) && this.b.equals(xw40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41592a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("OneTeam(name=", this.f41592a, ", imageUrl=", this.b, Separators.RPAREN);
    }
}
