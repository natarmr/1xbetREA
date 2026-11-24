package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class go9 extends io9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11619a;
    public final List b;

    public go9(String str, List list) {
        list.getClass();
        this.f11619a = str;
        this.b = list;
    }

    @Override // a.io9
    public final String a() {
        return this.f11619a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go9)) {
            return false;
        }
        go9 go9Var = (go9) obj;
        return this.f11619a.equals(go9Var.f11619a) && Intrinsics.d(this.b, go9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f11619a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CalendarTournamentStagePlayoffModel(name=", this.f11619a, ", brackets=", this.b, Separators.RPAREN);
    }
}
