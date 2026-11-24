package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y67 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42083a;
    public final String b;

    public y67(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f42083a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y67)) {
            return false;
        }
        y67 y67Var = (y67) obj;
        return Intrinsics.d(this.f42083a, y67Var.f42083a) && Intrinsics.d(this.b, y67Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42083a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowSnackSaleError(message=", this.f42083a, ", subtitle=", this.b, Separators.RPAREN);
    }
}
