package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zsq implements uqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44916a;
    public final String b;
    public final String c;
    public final String d;
    public final zmk0 e;
    public final zmk0 f;
    public final usq g;
    public final usq h;
    public final boolean i;
    public final ArrayList j;

    public zsq(String str, String str2, String str3, String str4, zmk0 zmk0Var, zmk0 zmk0Var2, usq usqVar, usq usqVar2, boolean z, ArrayList arrayList) {
        str.getClass();
        str2.getClass();
        this.f44916a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = zmk0Var;
        this.f = zmk0Var2;
        this.g = usqVar;
        this.h = usqVar2;
        this.i = z;
        this.j = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zsq)) {
            return false;
        }
        zsq zsqVar = (zsq) obj;
        return Intrinsics.d(this.f44916a, zsqVar.f44916a) && Intrinsics.d(this.b, zsqVar.b) && this.c.equals(zsqVar.c) && this.d.equals(zsqVar.d) && this.e.equals(zsqVar.e) && this.f.equals(zsqVar.f) && this.g.equals(zsqVar.g) && this.h.equals(zsqVar.h) && this.i == zsqVar.i && this.j.equals(zsqVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + brm0.e((this.h.hashCode() + ((this.g.hashCode() + axq.b(this.f, axq.b(this.e, ua80.b(ua80.b(ua80.b(this.f44916a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31)) * 31)) * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("FootballPeriodUiModel(teamOneName=", this.f44916a, ", teamTwoName=", this.b, ", teamOneImageUrl=");
        f140.v(sbN, this.c, ", teamTwoImageUrl=", this.d, ", teamOneScore=");
        sbN.append(this.e);
        sbN.append(", teamTwoScore=");
        sbN.append(this.f);
        sbN.append(", teamOneFootballEventsUiModel=");
        sbN.append(this.g);
        sbN.append(", teamTwoFootballEventsUiModel=");
        sbN.append(this.h);
        sbN.append(", hostsVsGuests=");
        sbN.append(this.i);
        sbN.append(", periodScoreUiModelList=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
