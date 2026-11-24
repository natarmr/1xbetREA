package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lvm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20721a;
    public final int b;
    public final int c;
    public final String d;

    public lvm(String str, int i, int i2, String str2) {
        str.getClass();
        this.f20721a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lvm)) {
            return false;
        }
        lvm lvmVar = (lvm) obj;
        return Intrinsics.d(this.f20721a, lvmVar.f20721a) && this.b == lvmVar.b && this.c == lvmVar.c && this.d.equals(lvmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, this.f20721a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", combination=", this.d, Separators.RPAREN, kng0.p(this.b, "Default(opponentName=", this.f20721a, ", firstCard=", ", secondCard="));
    }
}
