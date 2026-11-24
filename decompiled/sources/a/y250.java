package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class y250 implements z250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41890a;
    public final String b;

    public y250(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f41890a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y250)) {
            return false;
        }
        y250 y250Var = (y250) obj;
        return Intrinsics.d(this.f41890a, y250Var.f41890a) && Intrinsics.d(this.b, y250Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41890a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AuthButtons(authorizationButtonLabel=", this.f41890a, ", registrationButtonLabel=", this.b, Separators.RPAREN);
    }
}
