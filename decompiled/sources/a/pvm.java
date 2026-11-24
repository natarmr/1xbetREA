package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pvm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27669a;
    public final int b;
    public final int c;
    public final String d;

    public pvm(String str, int i, int i2, String str2) {
        str.getClass();
        this.f27669a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvm)) {
            return false;
        }
        pvm pvmVar = (pvm) obj;
        return Intrinsics.d(this.f27669a, pvmVar.f27669a) && this.b == pvmVar.b && this.c == pvmVar.c && this.d.equals(pvmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, this.f27669a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", combination=", this.d, Separators.RPAREN, kng0.p(this.b, "V4(opponentName=", this.f27669a, ", firstCard=", ", secondCard="));
    }
}
