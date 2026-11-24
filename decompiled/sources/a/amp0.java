package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class amp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1121a;
    public final String b;

    public amp0(String str, String str2) {
        str2.getClass();
        this.f1121a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amp0)) {
            return false;
        }
        amp0 amp0Var = (amp0) obj;
        return this.f1121a.equals(amp0Var.f1121a) && Intrinsics.d(this.b, amp0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1121a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("PlayerRowForTest(playerName=", this.f1121a, ", heroName=", this.b, Separators.RPAREN);
    }
}
