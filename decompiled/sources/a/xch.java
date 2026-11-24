package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xch implements cdh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f40645a;
    public final boolean b;

    public xch(String str, boolean z) {
        str.getClass();
        this.f40645a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xch)) {
            return false;
        }
        xch xchVar = (xch) obj;
        return Intrinsics.d(this.f40645a, xchVar.f40645a) && this.b == xchVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f40645a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("MapDescription(description=", this.f40645a, ", needLiveIndicator=", this.b, Separators.RPAREN);
    }
}
