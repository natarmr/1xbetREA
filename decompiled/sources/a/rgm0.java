package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rgm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30445a;
    public final String b;
    public final String c;

    public rgm0(List list, String str, String str2) {
        list.getClass();
        str2.getClass();
        this.f30445a = list;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgm0)) {
            return false;
        }
        rgm0 rgm0Var = (rgm0) obj;
        return Intrinsics.d(this.f30445a, rgm0Var.f30445a) && this.b.equals(rgm0Var.b) && Intrinsics.d(this.c, rgm0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f30445a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(ua80.o("StatisticTeamMapModel(players=", ", teamImage=", this.b, this.f30445a, ", teamName="), this.c, Separators.RPAREN);
    }
}
