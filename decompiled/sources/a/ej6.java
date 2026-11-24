package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ej6 implements gj6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7891a;
    public final String b;

    public ej6(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f7891a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej6)) {
            return false;
        }
        ej6 ej6Var = (ej6) obj;
        return Intrinsics.d(this.f7891a, ej6Var.f7891a) && Intrinsics.d(this.b, ej6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7891a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowMarketInfoDialog(title=", this.f7891a, ", description=", this.b, Separators.RPAREN);
    }
}
