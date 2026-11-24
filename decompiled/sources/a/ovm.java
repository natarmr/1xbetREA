package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ovm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25932a;
    public final int b;
    public final int c;
    public final String d;

    public ovm(String str, int i, int i2, String str2) {
        str.getClass();
        this.f25932a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovm)) {
            return false;
        }
        ovm ovmVar = (ovm) obj;
        return Intrinsics.d(this.f25932a, ovmVar.f25932a) && this.b == ovmVar.b && this.c == ovmVar.c && this.d.equals(ovmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, this.f25932a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", combination=", this.d, Separators.RPAREN, kng0.p(this.b, "V3(opponentName=", this.f25932a, ", firstCard=", ", secondCard="));
    }
}
