package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class kfu0 {
    public static final ifu0 Companion = new ifu0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f18213a;
    public final String b;

    public /* synthetic */ kfu0(int i, Boolean bool, String str) {
        if ((i & 1) == 0) {
            this.f18213a = null;
        } else {
            this.f18213a = bool;
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
        if (!(obj instanceof kfu0)) {
            return false;
        }
        kfu0 kfu0Var = (kfu0) obj;
        return Intrinsics.d(this.f18213a, kfu0Var.f18213a) && Intrinsics.d(this.b, kfu0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.f18213a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "VideoResponse(enabled=" + this.f18213a + ", id=" + this.b + Separators.RPAREN;
    }
}
