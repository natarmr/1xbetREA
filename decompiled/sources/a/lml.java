package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lml {
    public static final lml e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f20301a;
    public final List b;
    public final List c;
    public final List d;

    static {
        List listJ = q3d.j(Integer.valueOf(Response.BAD_REQUEST), 550, 680);
        List listJ2 = q3d.j(q3d.j(250, 350, 450), q3d.j(450, 650, 800), q3d.j(900, 1250, 1550));
        z73 z73Var = ihn.d;
        e = new lml(listJ, listJ2, q3d.j(z73Var, z73Var, hhn.d), q3d.j(4, 3, 1));
    }

    public lml(List list, List list2, List list3, List list4) {
        hne.C(list, list2, list3, list4);
        this.f20301a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lml)) {
            return false;
        }
        lml lmlVar = (lml) obj;
        return Intrinsics.d(this.f20301a, lmlVar.f20301a) && Intrinsics.d(this.b, lmlVar.b) && Intrinsics.d(this.c, lmlVar.c) && Intrinsics.d(this.d, lmlVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(dw9.a(this.f20301a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return kng0.n(", cardsInStages=", Separators.RPAREN, w6x.t("DsAggregatorGamesSpinnerConfig(initialStageDurationMs=", ", otherStagesDurationMs=", this.f20301a, ", stagesEasings=", this.b), this.c, this.d);
    }
}
