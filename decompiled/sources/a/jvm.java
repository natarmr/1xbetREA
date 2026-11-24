package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jvm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17209a;
    public final int b;
    public final int c;
    public final String d;

    public jvm(String str, int i, int i2, String str2) {
        str.getClass();
        this.f17209a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvm)) {
            return false;
        }
        jvm jvmVar = (jvm) obj;
        return Intrinsics.d(this.f17209a, jvmVar.f17209a) && this.b == jvmVar.b && this.c == jvmVar.c && this.d.equals(jvmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, this.f17209a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", combination=", this.d, Separators.RPAREN, kng0.p(this.b, "V3(opponentName=", this.f17209a, ", firstCard=", ", secondCard="));
    }
}
