package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xt90 implements au90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41455a;
    public final String b;

    public xt90(String str, String str2) {
        str2.getClass();
        this.f41455a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt90)) {
            return false;
        }
        xt90 xt90Var = (xt90) obj;
        return this.f41455a.equals(xt90Var.f41455a) && Intrinsics.d(this.b, xt90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41455a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("ButtonText(title=", this.f41455a, ", description=", this.b, Separators.RPAREN);
    }
}
