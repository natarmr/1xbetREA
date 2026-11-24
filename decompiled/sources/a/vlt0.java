package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class vlt0 {
    public static final ult0 Companion = new ult0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f37645a;
    public final String b;
    public final String c;

    public /* synthetic */ vlt0(int i, Boolean bool, String str, String str2) {
        if ((i & 1) == 0) {
            this.f37645a = null;
        } else {
            this.f37645a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlt0)) {
            return false;
        }
        vlt0 vlt0Var = (vlt0) obj;
        return Intrinsics.d(this.f37645a, vlt0Var.f37645a) && Intrinsics.d(this.b, vlt0Var.b) && Intrinsics.d(this.c, vlt0Var.c);
    }

    public final int hashCode() {
        Boolean bool = this.f37645a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateOperatorInvokeAvailabilityWSEventResponse(availability=");
        sb.append(this.f37645a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", dialogId=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
