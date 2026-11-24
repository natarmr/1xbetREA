package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class o9r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24895a;
    public final a4x b;

    public o9r0(i4 i4Var, String str) {
        str.getClass();
        i4Var.getClass();
        this.f24895a = str;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9r0)) {
            return false;
        }
        o9r0 o9r0Var = (o9r0) obj;
        return Intrinsics.d(this.f24895a, o9r0Var.f24895a) && Intrinsics.d(this.b, o9r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f24895a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("TopPlayersCardUiModel(blockTitle=", this.f24895a, ", topPlayersPairs=", this.b, Separators.RPAREN);
    }
}
