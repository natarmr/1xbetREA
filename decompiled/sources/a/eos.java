package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class eos {
    public static final dos Companion = new dos();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new o9s(19))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8150a;
    public final List b;

    public /* synthetic */ eos(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f8150a = null;
        } else {
            this.f8150a = str;
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
        if (!(obj instanceof eos)) {
            return false;
        }
        eos eosVar = (eos) obj;
        return Intrinsics.d(this.f8150a, eosVar.f8150a) && Intrinsics.d(this.b, eosVar.b);
    }

    public final int hashCode() {
        String str = this.f8150a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("GamePeriodEventsResponse(periodTitle=", this.f8150a, ", events=", this.b, Separators.RPAREN);
    }
}
