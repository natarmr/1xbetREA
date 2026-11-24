package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jh9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f16515a;
    public final List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public jh9(o0 o0Var, List list, List list2, List list3, List list4, List list5) {
        rz4.B(list, list2, list3, list4, list5);
        this.f16515a = o0Var;
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
        if (!(obj instanceof jh9)) {
            return false;
        }
        jh9 jh9Var = (jh9) obj;
        return this.f16515a.equals(jh9Var.f16515a) && Intrinsics.d(this.b, jh9Var.b) && Intrinsics.d(this.c, jh9Var.c) && Intrinsics.d(this.d, jh9Var.d) && Intrinsics.d(this.e, jh9Var.e) && Intrinsics.d(this.f, jh9Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a(this.f16515a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CSInfoModel(aboutTournamentModel=");
        sb.append(this.f16515a);
        sb.append(", prizeDistribution=");
        sb.append(this.b);
        sb.append(", mapStatistic=");
        b1j.y(", topTeams=", ", topPlayers=", sb, this.c, this.d);
        return kng0.n(", groupModels=", Separators.RPAREN, sb, this.e, this.f);
    }
}
