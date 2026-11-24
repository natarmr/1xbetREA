package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class htp {
    public static final gtp Companion = new gtp();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13645a;
    public final String b;

    public /* synthetic */ htp(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f13645a = null;
        } else {
            this.f13645a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htp)) {
            return false;
        }
        htp htpVar = (htp) obj;
        return Intrinsics.d(this.f13645a, htpVar.f13645a) && Intrinsics.d(this.b, htpVar.b);
    }

    public final int hashCode() {
        String str = this.f13645a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("FightStatValueResponse(type=", this.f13645a, ", value=", this.b, Separators.RPAREN);
    }
}
