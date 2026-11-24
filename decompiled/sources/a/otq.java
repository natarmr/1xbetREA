package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class otq {
    public static final mtq Companion = new mtq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25841a;
    public final Integer b;

    public /* synthetic */ otq(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f25841a = null;
        } else {
            this.f25841a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otq)) {
            return false;
        }
        otq otqVar = (otq) obj;
        return Intrinsics.d(this.f25841a, otqVar.f25841a) && Intrinsics.d(this.b, otqVar.b);
    }

    public final int hashCode() {
        String str = this.f25841a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "FooterResponse(title=" + this.f25841a + ", color=" + this.b + Separators.RPAREN;
    }
}
