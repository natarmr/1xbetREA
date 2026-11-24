package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class nvm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24194a;
    public final int b;
    public final int c;
    public final String d;

    public nvm(String str, int i, int i2, String str2) {
        str.getClass();
        this.f24194a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nvm)) {
            return false;
        }
        nvm nvmVar = (nvm) obj;
        return Intrinsics.d(this.f24194a, nvmVar.f24194a) && this.b == nvmVar.b && this.c == nvmVar.c && this.d.equals(nvmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, this.f24194a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", combination=", this.d, Separators.RPAREN, kng0.p(this.b, "V2(opponentName=", this.f24194a, ", firstCard=", ", secondCard="));
    }
}
