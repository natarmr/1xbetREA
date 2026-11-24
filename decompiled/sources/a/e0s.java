package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e0s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7003a;
    public final String b;
    public final String c;

    public e0s(String str, String str2, String str3) {
        brm0.B(str, str2, str3);
        this.f7003a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0s)) {
            return false;
        }
        e0s e0sVar = (e0s) obj;
        return Intrinsics.d(this.f7003a, e0sVar.f7003a) && Intrinsics.d(this.b, e0sVar.b) && Intrinsics.d(this.c, e0sVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f7003a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("GameCardUiState(variantAmount=", this.f7003a, ", simpleBetLabel=", this.b, ", optionsSelectedLabel="), this.c, Separators.RPAREN);
    }
}
