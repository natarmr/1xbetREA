package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q130 implements y130 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27931a;
    public final String b;

    public q130(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f27931a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q130)) {
            return false;
        }
        q130 q130Var = (q130) obj;
        return Intrinsics.d(this.f27931a, q130Var.f27931a) && Intrinsics.d(this.b, q130Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f27931a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ShowMarketInfoDialog(title=", this.f27931a, ", description=", this.b, Separators.RPAREN);
    }
}
