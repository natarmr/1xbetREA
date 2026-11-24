package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class pwl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27716a;
    public final String b;

    public pwl0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f27716a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwl0)) {
            return false;
        }
        pwl0 pwl0Var = (pwl0) obj;
        return Intrinsics.d(this.f27716a, pwl0Var.f27716a) && Intrinsics.d(this.b, pwl0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27716a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("StadiumInfoUiModel(title=", this.f27716a, ", value=", this.b, Separators.RPAREN);
    }
}
