package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class szc0 implements tzc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq5 f33066a;

    public szc0(lq5 lq5Var) {
        lq5Var.getClass();
        this.f33066a = lq5Var;
    }

    @Override // a.tzc0
    public final lq5 a() {
        return this.f33066a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof szc0) && Intrinsics.d(this.f33066a, ((szc0) obj).f33066a);
    }

    public final int hashCode() {
        return this.f33066a.hashCode();
    }

    public final String toString() {
        return "Shimmers(styleType=" + this.f33066a + Separators.RPAREN;
    }
}
