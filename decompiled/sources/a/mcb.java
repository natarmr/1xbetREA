package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class mcb {
    public static final lcb Companion = new lcb();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21542a;
    public final String b;

    public /* synthetic */ mcb(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.f21542a = null;
        } else {
            this.f21542a = str;
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
        if (!(obj instanceof mcb)) {
            return false;
        }
        mcb mcbVar = (mcb) obj;
        return Intrinsics.d(this.f21542a, mcbVar.f21542a) && Intrinsics.d(this.b, mcbVar.b);
    }

    public final int hashCode() {
        String str = this.f21542a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return b1j.k("ChampImageResponse(typeName=", this.f21542a, ", image=", this.b, Separators.RPAREN);
    }
}
