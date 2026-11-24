package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wka implements cja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f39298a;
    public final edp0 b;
    public final edp0 c;
    public final j83 d;
    public final String e;
    public final a4x f;
    public final a4x g;
    public final bo8 h;

    public wka(j83 j83Var, edp0 edp0Var, edp0 edp0Var2, j83 j83Var2, String str, i4 i4Var, i4 i4Var2, bo8 bo8Var) {
        dja djaVar = dja.PENALTY;
        str.getClass();
        i4Var.getClass();
        i4Var2.getClass();
        this.f39298a = j83Var;
        this.b = edp0Var;
        this.c = edp0Var2;
        this.d = j83Var2;
        this.e = str;
        this.f = i4Var;
        this.g = i4Var2;
        this.h = bo8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wka)) {
            return false;
        }
        wka wkaVar = (wka) obj;
        dja djaVar = dja.PENALTY;
        return this.f39298a.equals(wkaVar.f39298a) && this.b.equals(wkaVar.b) && this.c.equals(wkaVar.c) && this.d.equals(wkaVar.d) && Intrinsics.d(this.e, wkaVar.e) && Intrinsics.d(this.f, wkaVar.f) && Intrinsics.d(this.g, wkaVar.g) && this.h.equals(wkaVar.h);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.PENALTY;
    }

    public final int hashCode() {
        return this.h.hashCode() + cs0.b(this.g, cs0.b(this.f, ua80.b(brm0.f(this.d, (this.c.f7630a.hashCode() + ((this.b.f7630a.hashCode() + brm0.f(this.f39298a, dja.PENALTY.hashCode() * 31, 31)) * 31)) * 31, 31), 31, this.e), 31), 31);
    }

    public final String toString() {
        dja djaVar = dja.PENALTY;
        StringBuilder sb = new StringBuilder("CardPenaltyUiModel(type=");
        sb.append(djaVar);
        sb.append(", topInfo=");
        sb.append((Object) this.f39298a);
        sb.append(", teamOne=");
        sb.append(this.b);
        sb.append(", teamTwo=");
        sb.append(this.c);
        sb.append(", score=");
        sb.append((Object) this.d);
        sb.append(", penaltyName=");
        sb.append(this.e);
        sb.append(", penaltyTeamOne=");
        hne.y(sb, this.f, ", penaltyTeamTwo=", this.g, ", bottomInfoUiModel=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
