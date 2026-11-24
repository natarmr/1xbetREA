package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class szb0 {
    public static final qzb0 Companion = new qzb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f33065a;
    public final String b;

    public /* synthetic */ szb0(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f33065a = null;
        } else {
            this.f33065a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szb0)) {
            return false;
        }
        szb0 szb0Var = (szb0) obj;
        return Intrinsics.d(this.f33065a, szb0Var.f33065a) && Intrinsics.d(this.b, szb0Var.b);
    }

    public final int hashCode() {
        Long l = this.f33065a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f33065a, "ProductResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
