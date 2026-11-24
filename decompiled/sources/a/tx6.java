package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class tx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pz40 f34681a;
    public final String b;

    public tx6(pz40 pz40Var, String str) {
        pz40Var.getClass();
        str.getClass();
        this.f34681a = pz40Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx6)) {
            return false;
        }
        tx6 tx6Var = (tx6) obj;
        return Intrinsics.d(this.f34681a, tx6Var.f34681a) && Intrinsics.d(this.b, tx6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f34681a.hashCode() * 31);
    }

    public final String toString() {
        return "BetFieldValueUiState(betValue=" + this.f34681a + ", betValuePlaceholder=" + this.b + Separators.RPAREN;
    }
}
