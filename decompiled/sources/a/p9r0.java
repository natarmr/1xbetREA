package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p9r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26622a;
    public final boolean b;
    public final boolean c;

    public p9r0(String str, boolean z, boolean z2) {
        str.getClass();
        this.f26622a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9r0)) {
            return false;
        }
        p9r0 p9r0Var = (p9r0) obj;
        return Intrinsics.d(this.f26622a, p9r0Var.f26622a) && this.b == p9r0Var.b && this.c == p9r0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f26622a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(brm0.u("TopPlayersCardsControlUiModel(counter=", this.f26622a, ", isUpEnable=", this.b, ", isDownEnable="), this.c, Separators.RPAREN);
    }
}
