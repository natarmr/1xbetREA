package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aom0 implements bom0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aoq0 f1209a;
    public final String b;

    public aom0(znq0 znq0Var, String str) {
        znq0Var.getClass();
        str.getClass();
        this.f1209a = znq0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aom0)) {
            return false;
        }
        aom0 aom0Var = (aom0) obj;
        return Intrinsics.d(this.f1209a, aom0Var.f1209a) && Intrinsics.d(this.b, aom0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f1209a.hashCode() * 31);
    }

    public final String toString() {
        return "Result(eventDate=" + this.f1209a + ", sabStatus=" + this.b + Separators.RPAREN;
    }
}
