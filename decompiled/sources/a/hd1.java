package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class hd1 implements ud1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kr5 f12847a;
    public final int b;

    public hd1(kr5 kr5Var, int i) {
        kr5Var.getClass();
        this.f12847a = kr5Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd1)) {
            return false;
        }
        hd1 hd1Var = (hd1) obj;
        return Intrinsics.d(this.f12847a, hd1Var.f12847a) && this.b == hd1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f12847a.hashCode() * 31);
    }

    public final String toString() {
        return "OnOpenOldBanner(banner=" + this.f12847a + ", position=" + this.b + Separators.RPAREN;
    }
}
