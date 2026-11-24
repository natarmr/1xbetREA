package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class wh7 {
    public static final vh7 Companion = new vh7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f39152a;
    public final String b;

    public /* synthetic */ wh7(int i, Long l, String str) {
        if ((i & 1) == 0) {
            this.f39152a = null;
        } else {
            this.f39152a = l;
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
        if (!(obj instanceof wh7)) {
            return false;
        }
        wh7 wh7Var = (wh7) obj;
        return Intrinsics.d(this.f39152a, wh7Var.f39152a) && Intrinsics.d(this.b, wh7Var.b);
    }

    public final int hashCode() {
        Long l = this.f39152a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return ua80.g(this.f39152a, "BetPlayerZipResponse(id=", ", name=", this.b, Separators.RPAREN);
    }
}
