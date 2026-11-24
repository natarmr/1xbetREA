package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b5l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f2008a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public b5l(o0 o0Var, List list, List list2, List list3, List list4, List list5) {
        rz4.B(list, list2, list3, list4, list5);
        this.f2008a = o0Var;
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
        if (!(obj instanceof b5l)) {
            return false;
        }
        b5l b5lVar = (b5l) obj;
        return this.f2008a.equals(b5lVar.f2008a) && Intrinsics.d(this.b, b5lVar.b) && Intrinsics.d(this.c, b5lVar.c) && Intrinsics.d(this.d, b5lVar.d) && Intrinsics.d(this.e, b5lVar.e) && Intrinsics.d(this.f, b5lVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a(this.f2008a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DotaInfoModel(aboutTournamentModel=");
        sb.append(this.f2008a);
        sb.append(", popularHeroes=");
        sb.append(this.b);
        sb.append(", prizeDistribution=");
        b1j.y(", topTeams=", ", topPlayers=", sb, this.c, this.d);
        return kng0.n(", groupModels=", Separators.RPAREN, sb, this.e, this.f);
    }
}
