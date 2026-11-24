package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class okl0 {
    public static final ekl0 Companion = new ekl0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f25410a;
    public final String b;

    public /* synthetic */ okl0(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f25410a = null;
        } else {
            this.f25410a = l;
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
        if (!(obj instanceof okl0)) {
            return false;
        }
        okl0 okl0Var = (okl0) obj;
        return Intrinsics.d(this.f25410a, okl0Var.f25410a) && Intrinsics.d(this.b, okl0Var.b);
    }

    public final int hashCode() {
        Long l = this.f25410a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f25410a, "SportResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
