package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ho9 extends io9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13383a;
    public final List b;

    public ho9(String str, List list) {
        list.getClass();
        this.f13383a = str;
        this.b = list;
    }

    @Override // a.io9
    public final String a() {
        return this.f13383a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho9)) {
            return false;
        }
        ho9 ho9Var = (ho9) obj;
        return this.f13383a.equals(ho9Var.f13383a) && Intrinsics.d(this.b, ho9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f13383a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CalendarTournamentStageSwissModel(name=", this.f13383a, ", brackets=", this.b, Separators.RPAREN);
    }
}
