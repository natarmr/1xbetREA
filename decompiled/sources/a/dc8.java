package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dc8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5839a;
    public final String b;
    public final a4x c;

    public dc8(a4x a4xVar, String str, String str2) {
        w6x.x(a4xVar, str, str2);
        this.f5839a = str;
        this.b = str2;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc8)) {
            return false;
        }
        dc8 dc8Var = (dc8) obj;
        return Intrinsics.d(this.f5839a, dc8Var.f5839a) && Intrinsics.d(this.b, dc8Var.b) && Intrinsics.d(this.c, dc8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f5839a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return cs0.n(b1j.n("BonusAccountUiState(title=", this.f5839a, ", description=", this.b, ", accounts="), this.c, Separators.RPAREN);
    }
}
