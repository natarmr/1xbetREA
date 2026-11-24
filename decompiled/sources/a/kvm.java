package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kvm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18962a;
    public final int b;
    public final int c;
    public final String d;

    public kvm(String str, int i, int i2, String str2) {
        str.getClass();
        this.f18962a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvm)) {
            return false;
        }
        kvm kvmVar = (kvm) obj;
        return Intrinsics.d(this.f18962a, kvmVar.f18962a) && this.b == kvmVar.b && this.c == kvmVar.c && this.d.equals(kvmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, this.f18962a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", combination=", this.d, Separators.RPAREN, kng0.p(this.b, "V4(opponentName=", this.f18962a, ", firstCard=", ", secondCard="));
    }
}
