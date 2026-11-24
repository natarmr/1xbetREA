package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class u730 implements a830 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f35165a;
    public final String b;

    public u730(udl0 udl0Var, String str) {
        str.getClass();
        this.f35165a = udl0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u730)) {
            return false;
        }
        u730 u730Var = (u730) obj;
        return this.f35165a == u730Var.f35165a && Intrinsics.d(this.b, u730Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35165a.hashCode() * 31);
    }

    public final String toString() {
        return "AllMarketsHidden(sportGameType=" + this.f35165a + ", message=" + this.b + Separators.RPAREN;
    }
}
