package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j250 implements k250 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15766a;
    public final a4x b;

    public j250(i4 i4Var, String str) {
        str.getClass();
        i4Var.getClass();
        this.f15766a = str;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j250)) {
            return false;
        }
        j250 j250Var = (j250) obj;
        return Intrinsics.d(this.f15766a, j250Var.f15766a) && Intrinsics.d(this.b, j250Var.b);
    }

    @Override // a.k250
    public final String getKey() {
        return this.f15766a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15766a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("VerticalGamesCarousel(key=", this.f15766a, ", items=", this.b, Separators.RPAREN);
    }
}
