package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r44 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29818a;
    public final String b;

    public r44(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f29818a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r44)) {
            return false;
        }
        r44 r44Var = (r44) obj;
        return Intrinsics.d(this.f29818a, r44Var.f29818a) && Intrinsics.d(this.b, r44Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29818a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AuthButtonsModel(authorizationButtonLabel=", this.f29818a, ", registrationButtonLabel=", this.b, Separators.RPAREN);
    }
}
