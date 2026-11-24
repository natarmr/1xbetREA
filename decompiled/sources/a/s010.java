package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s010 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f31390a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public s010(o0 o0Var, List list, List list2, List list3, List list4, List list5) {
        rz4.B(list, list2, list3, list4, list5);
        this.f31390a = o0Var;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s010)) {
            return false;
        }
        s010 s010Var = (s010) obj;
        return this.f31390a.equals(s010Var.f31390a) && Intrinsics.d(this.b, s010Var.b) && Intrinsics.d(this.c, s010Var.c) && Intrinsics.d(this.d, s010Var.d) && Intrinsics.d(this.e, s010Var.e) && Intrinsics.d(this.f, s010Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a(this.f31390a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LolInfoModel(aboutTournamentModel=");
        sb.append(this.f31390a);
        sb.append(", champions=");
        sb.append(this.b);
        sb.append(", prizeDistribution=");
        b1j.y(", topTeams=", ", topPlayers=", sb, this.c, this.d);
        return kng0.n(", groupModels=", Separators.RPAREN, sb, this.e, this.f);
    }
}
