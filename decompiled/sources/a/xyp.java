package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xyp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41714a;
    public final String b;

    public xyp(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f41714a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyp)) {
            return false;
        }
        xyp xypVar = (xyp) obj;
        return Intrinsics.d(this.f41714a, xypVar.f41714a) && Intrinsics.d(this.b, xypVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + brm0.e(this.f41714a.hashCode() * 31, 31, true);
    }

    public final String toString() {
        return b1j.k("V2(info=", this.f41714a, ", showBroadcastIcon=true, tagLiveText=", this.b, Separators.RPAREN);
    }
}
