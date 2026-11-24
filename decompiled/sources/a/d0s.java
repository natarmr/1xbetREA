package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5281a;
    public final String b;
    public final String c;

    public d0s(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f5281a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0s)) {
            return false;
        }
        d0s d0sVar = (d0s) obj;
        return Intrinsics.d(this.f5281a, d0sVar.f5281a) && Intrinsics.d(this.b, d0sVar.b) && Intrinsics.d(this.c, d0sVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f5281a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("GameCardUiState(variantAmount=", this.f5281a, ", simpleBetLabel=", this.b, ", optionsSelectedLabel="), this.c, Separators.RPAREN);
    }
}
