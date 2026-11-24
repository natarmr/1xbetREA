package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class t880 implements w880 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33503a;
    public final String b;

    public t880(String str, String str2) {
        str.getClass();
        this.f33503a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t880)) {
            return false;
        }
        t880 t880Var = (t880) obj;
        return Intrinsics.d(this.f33503a, t880Var.f33503a) && this.b.equals(t880Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33503a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowErrorSnackBar(title=", this.f33503a, ", message=", this.b, Separators.RPAREN);
    }
}
