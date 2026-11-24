package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class sjf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32301a;
    public final String b;
    public final long c;
    public final String d;
    public final List e;

    public sjf(long j, String str, String str2, String str3, List list) {
        list.getClass();
        this.f32301a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sjf)) {
            return false;
        }
        sjf sjfVar = (sjf) obj;
        return this.f32301a.equals(sjfVar.f32301a) && this.b.equals(sjfVar.b) && this.c == sjfVar.c && this.d.equals(sjfVar.d) && Intrinsics.d(this.e, sjfVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(rw2.b(ua80.b(this.f32301a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Cs2CompositionTeamModel(teamId=", this.f32301a, ", teamTitle=", this.b, ", teamClId=");
        kng0.z(sbN, this.c, ", teamImage=", this.d);
        return ohs0.s(sbN, ", subTeams=", this.e, Separators.RPAREN);
    }
}
