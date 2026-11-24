package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ivm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15451a;
    public final int b;
    public final int c;
    public final String d;

    public ivm(String str, int i, int i2, String str2) {
        str.getClass();
        this.f15451a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivm)) {
            return false;
        }
        ivm ivmVar = (ivm) obj;
        return Intrinsics.d(this.f15451a, ivmVar.f15451a) && this.b == ivmVar.b && this.c == ivmVar.c && this.d.equals(ivmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, this.f15451a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", combination=", this.d, Separators.RPAREN, kng0.p(this.b, "V2(opponentName=", this.f15451a, ", firstCard=", ", secondCard="));
    }
}
