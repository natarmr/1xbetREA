package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class th {
    public static final jh Companion = new jh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33938a;
    public final String b;
    public final String c;

    public /* synthetic */ th(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f33938a = null;
        } else {
            this.f33938a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th)) {
            return false;
        }
        th thVar = (th) obj;
        return Intrinsics.d(this.f33938a, thVar.f33938a) && Intrinsics.d(this.b, thVar.b) && Intrinsics.d(this.c, thVar.c);
    }

    public final int hashCode() {
        String str = this.f33938a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return axq.n(b1j.n("Action(type=", this.f33938a, ", reason=", this.b, ", time="), this.c, Separators.RPAREN);
    }
}
