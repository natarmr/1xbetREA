package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class om9 {
    public static final nm9 Companion = new nm9();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new ej8(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25492a;
    public final List b;

    public /* synthetic */ om9(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f25492a = null;
        } else {
            this.f25492a = str;
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
        if (!(obj instanceof om9)) {
            return false;
        }
        om9 om9Var = (om9) obj;
        return Intrinsics.d(this.f25492a, om9Var.f25492a) && Intrinsics.d(this.b, om9Var.b);
    }

    public final int hashCode() {
        String str = this.f25492a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("CalendarTournamentCategorySwissResponse(name=", this.f25492a, ", rounds=", this.b, Separators.RPAREN);
    }
}
