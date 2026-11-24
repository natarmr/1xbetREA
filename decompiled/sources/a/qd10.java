package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class qd10 implements sd10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28512a;
    public final String b;

    public qd10(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f28512a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qd10)) {
            return false;
        }
        qd10 qd10Var = (qd10) obj;
        return Intrinsics.d(this.f28512a, qd10Var.f28512a) && Intrinsics.d(this.b, qd10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28512a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowErrorDialog(title=", this.f28512a, ", message=", this.b, Separators.RPAREN);
    }
}
