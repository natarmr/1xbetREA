package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class kcs0 {
    public static final jcs0 Companion = new jcs0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hcs0 f18076a;
    public final String b;
    public final String c;

    public /* synthetic */ kcs0(int i, hcs0 hcs0Var, String str, String str2) {
        if ((i & 1) == 0) {
            this.f18076a = null;
        } else {
            this.f18076a = hcs0Var;
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
        if (!(obj instanceof kcs0)) {
            return false;
        }
        kcs0 kcs0Var = (kcs0) obj;
        return Intrinsics.d(this.f18076a, kcs0Var.f18076a) && Intrinsics.d(this.b, kcs0Var.b) && Intrinsics.d(this.c, kcs0Var.c);
    }

    public final int hashCode() {
        hcs0 hcs0Var = this.f18076a;
        int iHashCode = (hcs0Var == null ? 0 : hcs0Var.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackMessageWSEvent(tracker=");
        sb.append(this.f18076a);
        sb.append(", chatId=");
        sb.append(this.b);
        sb.append(", dialogId=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
