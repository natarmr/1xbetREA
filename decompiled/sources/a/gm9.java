package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class gm9 {
    public static final fm9 Companion = new fm9();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new ej8(23))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11531a;
    public final List b;

    public /* synthetic */ gm9(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f11531a = null;
        } else {
            this.f11531a = str;
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
        if (!(obj instanceof gm9)) {
            return false;
        }
        gm9 gm9Var = (gm9) obj;
        return Intrinsics.d(this.f11531a, gm9Var.f11531a) && Intrinsics.d(this.b, gm9Var.b);
    }

    public final int hashCode() {
        String str = this.f11531a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("CalendarTournamentCategoryGroupResponse(name=", this.f11531a, ", rounds=", this.b, Separators.RPAREN);
    }
}
