package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dal {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5753a;
    public final String b;
    public final int c;
    public final int d;
    public final j6l e;
    public final String f;
    public final String g;
    public final int h;
    public final int i;
    public final j6l j;

    public dal(String str, String str2, int i, int i2, j6l j6lVar, String str3, String str4, int i3, int i4, j6l j6lVar2) {
        str.getClass();
        str3.getClass();
        this.f5753a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = j6lVar;
        this.f = str3;
        this.g = str4;
        this.h = i3;
        this.i = i4;
        this.j = j6lVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dal)) {
            return false;
        }
        dal dalVar = (dal) obj;
        return Intrinsics.d(this.f5753a, dalVar.f5753a) && this.b.equals(dalVar.b) && this.c == dalVar.c && this.d == dalVar.d && this.e == dalVar.e && Intrinsics.d(this.f, dalVar.f) && this.g.equals(dalVar.g) && this.h == dalVar.h && this.i == dalVar.i && this.j == dalVar.j;
    }

    public final int hashCode() {
        return this.j.hashCode() + twn.a(this.i, twn.a(this.h, ua80.b(ua80.b((this.e.hashCode() + twn.a(this.d, twn.a(this.c, ua80.b(this.f5753a.hashCode() * 31, 31, this.b), 31), 31)) * 31, 31, this.f), 31, this.g), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("DotaTeamRaceInfoUiModel(firstTeamName=", this.f5753a, ", firstTeamImage=", this.b, ", firstTeamRoshanScore=");
        axq.r(this.c, this.d, ", firstTeamTormentorScore=", ", firstTeamRace=", sbN);
        sbN.append(this.e);
        sbN.append(", secondTeamName=");
        sbN.append(this.f);
        sbN.append(", secondTeamImage=");
        twn.w(this.h, this.g, ", secondTeamRoshanScore=", ", secondTeamTormentorScore=", sbN);
        sbN.append(this.i);
        sbN.append(", secondTeamRace=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
