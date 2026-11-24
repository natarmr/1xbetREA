package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lov {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20408a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final List f;
    public final List g;

    public lov(String str, String str2, String str3, String str4, List list, List list2, List list3) {
        b1j.B(list, list2, list3);
        this.f20408a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = list2;
        this.g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lov)) {
            return false;
        }
        lov lovVar = (lov) obj;
        return this.f20408a.equals(lovVar.f20408a) && this.b.equals(lovVar.b) && this.c.equals(lovVar.c) && this.d.equals(lovVar.d) && Intrinsics.d(this.e, lovVar.e) && Intrinsics.d(this.f, lovVar.f) && Intrinsics.d(this.g, lovVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.a(dw9.a(ua80.b(ua80.b(ua80.b(this.f20408a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HeadToHeadModel(teamOneId=", this.f20408a, ", teamTwoId=", this.b, ", teamOneName=");
        f140.v(sbN, this.c, ", teamTwoName=", this.d, ", previousGames=");
        b1j.y(", lastGameTeamOne=", ", lastGameTeamTwo=", sbN, this.e, this.f);
        return dw9.r(sbN, this.g, Separators.RPAREN);
    }
}
