package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class yva implements zva {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43309a;
    public final String b;

    public yva(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f43309a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yva)) {
            return false;
        }
        yva yvaVar = (yva) obj;
        return Intrinsics.d(this.f43309a, yvaVar.f43309a) && Intrinsics.d(this.b, yvaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43309a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AuthorizationButtons(loginLabel=", this.f43309a, ", registrationLabel=", this.b, Separators.RPAREN);
    }
}
