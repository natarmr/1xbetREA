package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class qkl0 {
    public static final gkl0 Companion = new gkl0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f28891a;
    public final String b;

    public /* synthetic */ qkl0(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f28891a = null;
        } else {
            this.f28891a = l;
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
        if (!(obj instanceof qkl0)) {
            return false;
        }
        qkl0 qkl0Var = (qkl0) obj;
        return Intrinsics.d(this.f28891a, qkl0Var.f28891a) && Intrinsics.d(this.b, qkl0Var.b);
    }

    public final int hashCode() {
        Long l = this.f28891a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f28891a, "SportResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
