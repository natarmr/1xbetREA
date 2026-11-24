package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a19 implements b19 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61a;
    public final String b;

    public a19(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f61a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a19)) {
            return false;
        }
        a19 a19Var = (a19) obj;
        return Intrinsics.d(this.f61a, a19Var.f61a) && Intrinsics.d(this.b, a19Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f61a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AuthButtons(authorizationButtonLabel=", this.f61a, ", registrationButtonLabel=", this.b, Separators.RPAREN);
    }
}
