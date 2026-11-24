package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class xkt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41045a;
    public final List b;

    public xkt0(String str, List list) {
        str.getClass();
        list.getClass();
        this.f41045a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkt0)) {
            return false;
        }
        xkt0 xkt0Var = (xkt0) obj;
        return Intrinsics.d(this.f41045a, xkt0Var.f41045a) && Intrinsics.d(this.b, xkt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f41045a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("UpdateLeaveParticipantsEvent(dialogId=", this.f41045a, ", participantIds=", this.b, Separators.RPAREN);
    }
}
