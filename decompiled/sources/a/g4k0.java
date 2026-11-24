package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g4k0 implements l4k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10670a;
    public final String b;

    public g4k0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f10670a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4k0)) {
            return false;
        }
        g4k0 g4k0Var = (g4k0) obj;
        return Intrinsics.d(this.f10670a, g4k0Var.f10670a) && Intrinsics.d(this.b, g4k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f10670a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("Score(firstTeamScore=", this.f10670a, ", secondTeamScore=", this.b, Separators.RPAREN);
    }
}
