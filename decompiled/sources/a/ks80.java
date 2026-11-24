package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ks80 implements qs80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18802a;
    public final String b;

    public ks80(String str, String str2) {
        str2.getClass();
        this.f18802a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks80)) {
            return false;
        }
        ks80 ks80Var = (ks80) obj;
        return this.f18802a.equals(ks80Var.f18802a) && Intrinsics.d(this.b, ks80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f18802a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("CheckShowJackpot(jackpotAmount=", this.f18802a, ", deepLink=", this.b, Separators.RPAREN);
    }
}
