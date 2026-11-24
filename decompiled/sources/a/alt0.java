package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class alt0 {
    public static final zkt0 Companion = new zkt0();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new tht0(11))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1084a;
    public final List b;

    public /* synthetic */ alt0(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f1084a = null;
        } else {
            this.f1084a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alt0)) {
            return false;
        }
        alt0 alt0Var = (alt0) obj;
        return Intrinsics.d(this.f1084a, alt0Var.f1084a) && Intrinsics.d(this.b, alt0Var.b);
    }

    public final int hashCode() {
        String str = this.f1084a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("UpdateLeaveParticipantsWSEventResponse(chatId=", this.f1084a, ", ids=", this.b, Separators.RPAREN);
    }
}
