package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qn9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29020a;
    public final List b;

    public qn9(String str, List list) {
        list.getClass();
        this.f29020a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qn9)) {
            return false;
        }
        qn9 qn9Var = (qn9) obj;
        return this.f29020a.equals(qn9Var.f29020a) && Intrinsics.d(this.b, qn9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29020a.hashCode() * 31);
    }

    public final String toString() {
        return ohs0.o("CalendarTournamentRoundGroupModel(name=", this.f29020a, ", matches=", this.b, Separators.RPAREN);
    }
}
