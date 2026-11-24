package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uu8 implements vu8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36287a;
    public final String b;

    public uu8(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f36287a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu8)) {
            return false;
        }
        uu8 uu8Var = (uu8) obj;
        return Intrinsics.d(this.f36287a, uu8Var.f36287a) && Intrinsics.d(this.b, uu8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f36287a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AuthButtons(authorizationButtonLabel=", this.f36287a, ", registrationButtonLabel=", this.b, Separators.RPAREN);
    }
}
