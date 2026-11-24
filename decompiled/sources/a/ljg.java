package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ljg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20149a;
    public final f2h b;
    public final f2h c;
    public final v1h d;
    public final List e;
    public final znq0 f;
    public final String g;
    public final String h;
    public final long i;

    public ljg(List list, f2h f2hVar, f2h f2hVar2, v1h v1hVar, List list2, znq0 znq0Var, String str, String str2, long j) {
        list.getClass();
        list2.getClass();
        str.getClass();
        this.f20149a = list;
        this.b = f2hVar;
        this.c = f2hVar2;
        this.d = v1hVar;
        this.e = list2;
        this.f = znq0Var;
        this.g = str;
        this.h = str2;
        this.i = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljg)) {
            return false;
        }
        ljg ljgVar = (ljg) obj;
        return Intrinsics.d(this.f20149a, ljgVar.f20149a) && this.b.equals(ljgVar.b) && this.c.equals(ljgVar.c) && this.d.equals(ljgVar.d) && Intrinsics.d(this.e, ljgVar.e) && this.f.equals(ljgVar.f) && Intrinsics.d(this.g, ljgVar.g) && this.h.equals(ljgVar.h) && this.i == ljgVar.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + ua80.b(ua80.b(rw2.b(dw9.a((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f20149a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f.f44687a), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberCommonLastMatchesInfoModel(teams=");
        sb.append(this.f20149a);
        sb.append(", firstTeam=");
        sb.append(this.b);
        sb.append(", secondTeam=");
        sb.append(this.c);
        sb.append(", games=");
        sb.append(this.d);
        sb.append(", periods=");
        sb.append(this.e);
        sb.append(", dateStart=");
        sb.append(this.f);
        sb.append(", score=");
        f140.v(sb, this.g, ", tournamentTitle=", this.h, ", champId=");
        return brm0.k(this.i, Separators.RPAREN, sb);
    }
}
