package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xa0 implements ya0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40529a;
    public final String b;

    public xa0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f40529a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa0)) {
            return false;
        }
        xa0 xa0Var = (xa0) obj;
        return Intrinsics.d(this.f40529a, xa0Var.f40529a) && Intrinsics.d(this.b, xa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40529a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AuthButtons(authorizationButtonLabel=", this.f40529a, ", registrationButtonLabel=", this.b, Separators.RPAREN);
    }
}
