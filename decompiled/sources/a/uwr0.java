package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uwr0 implements wwr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qt8 f36406a;
    public final Integer b;

    public uwr0(qt8 qt8Var, Integer num) {
        this.f36406a = qt8Var;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uwr0)) {
            return false;
        }
        uwr0 uwr0Var = (uwr0) obj;
        return this.f36406a == uwr0Var.f36406a && Intrinsics.d(this.b, uwr0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f36406a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "BracketVertical(highlightFrom=" + this.f36406a + ", childOffsetRows=" + this.b + Separators.RPAREN;
    }
}
