package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class gvm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11982a;
    public final int b;
    public final int c;
    public final String d;

    public gvm(String str, int i, int i2, String str2) {
        str.getClass();
        this.f11982a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvm)) {
            return false;
        }
        gvm gvmVar = (gvm) obj;
        return Intrinsics.d(this.f11982a, gvmVar.f11982a) && this.b == gvmVar.b && this.c == gvmVar.c && this.d.equals(gvmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, this.f11982a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", combination=", this.d, Separators.RPAREN, kng0.p(this.b, "Default(opponentName=", this.f11982a, ", firstCard=", ", secondCard="));
    }
}
