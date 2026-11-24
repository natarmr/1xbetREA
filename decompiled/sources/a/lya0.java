package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lya0 implements aza0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kr5 f20854a;
    public final int b;

    public lya0(kr5 kr5Var, int i) {
        kr5Var.getClass();
        this.f20854a = kr5Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lya0)) {
            return false;
        }
        lya0 lya0Var = (lya0) obj;
        return Intrinsics.d(this.f20854a, lya0Var.f20854a) && this.b == lya0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f20854a.hashCode() * 31);
    }

    public final String toString() {
        return "OnOpenOldBanner(banner=" + this.f20854a + ", position=" + this.b + Separators.RPAREN;
    }
}
