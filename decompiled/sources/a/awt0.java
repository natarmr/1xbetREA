package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class awt0 {
    public static final zvt0 Companion = new zvt0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1591a;
    public final String b;
    public final String c;
    public final Long d;

    public /* synthetic */ awt0(int i, Long l, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f1591a = null;
        } else {
            this.f1591a = str;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof awt0)) {
            return false;
        }
        awt0 awt0Var = (awt0) obj;
        return Intrinsics.d(this.f1591a, awt0Var.f1591a) && Intrinsics.d(this.b, awt0Var.b) && Intrinsics.d(this.c, awt0Var.c) && Intrinsics.d(this.d, awt0Var.d);
    }

    public final int hashCode() {
        String str = this.f1591a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l = this.d;
        return iHashCode3 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("VKUser(firstName=", this.f1591a, ", lastName=", this.b, ", mobilePhone=");
        sbN.append(this.c);
        sbN.append(", id=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
