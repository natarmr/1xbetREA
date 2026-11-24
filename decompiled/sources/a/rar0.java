package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rar0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f30151a;
    public final List b;
    public final long c;
    public final List d;

    public rar0(List list, List list2, long j, List list3) {
        b1j.B(list, list2, list3);
        this.f30151a = list;
        this.b = list2;
        this.c = j;
        this.d = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rar0)) {
            return false;
        }
        rar0 rar0Var = (rar0) obj;
        return Intrinsics.d(this.f30151a, rar0Var.f30151a) && Intrinsics.d(this.b, rar0Var.b) && this.c == rar0Var.c && Intrinsics.d(this.d, rar0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + rw2.b(dw9.a(this.f30151a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("TopPlayersModel(teams=", ", players=", this.f30151a, ", sportId=", this.b);
        hne.x(sbT, this.c, ", info=", this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
