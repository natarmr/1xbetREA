package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fo9 extends io9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9871a;
    public final List b;

    public fo9(String str, List list) {
        list.getClass();
        this.f9871a = str;
        this.b = list;
    }

    @Override // a.io9
    public final String a() {
        return this.f9871a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo9)) {
            return false;
        }
        fo9 fo9Var = (fo9) obj;
        return this.f9871a.equals(fo9Var.f9871a) && Intrinsics.d(this.b, fo9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9871a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CalendarTournamentStageGroupModel(name=", this.f9871a, ", brackets=", this.b, Separators.RPAREN);
    }
}
