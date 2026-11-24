package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class mlt0 {
    public static final llt0 Companion = new llt0();
    public static final a8z[] d = {null, null, maz.a(wez.f39042a, new tht0(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22011a;
    public final String b;
    public final List c;

    public /* synthetic */ mlt0(int i, String str, String str2, List list) {
        if ((i & 1) == 0) {
            this.f22011a = null;
        } else {
            this.f22011a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlt0)) {
            return false;
        }
        mlt0 mlt0Var = (mlt0) obj;
        return Intrinsics.d(this.f22011a, mlt0Var.f22011a) && Intrinsics.d(this.b, mlt0Var.b) && Intrinsics.d(this.c, mlt0Var.c);
    }

    public final int hashCode() {
        String str = this.f22011a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return dw9.r(b1j.n("UpdateNewParticipantsWSEventResponse(chatId=", this.f22011a, ", dialogId=", this.b, ", participants="), this.c, Separators.RPAREN);
    }
}
