package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vka implements bja {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f37563a;
    public final pdp0 b;
    public final pdp0 c;
    public final kpm d;
    public final String e;
    public final a4x f;
    public final a4x g;
    public final ao8 h;

    public vka(j83 j83Var, pdp0 pdp0Var, pdp0 pdp0Var2, kpm kpmVar, String str, i4 i4Var, i4 i4Var2, ao8 ao8Var) {
        dja djaVar = dja.PENALTY;
        str.getClass();
        i4Var.getClass();
        i4Var2.getClass();
        this.f37563a = j83Var;
        this.b = pdp0Var;
        this.c = pdp0Var2;
        this.d = kpmVar;
        this.e = str;
        this.f = i4Var;
        this.g = i4Var2;
        this.h = ao8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vka)) {
            return false;
        }
        vka vkaVar = (vka) obj;
        dja djaVar = dja.PENALTY;
        return this.f37563a.equals(vkaVar.f37563a) && this.b.equals(vkaVar.b) && this.c.equals(vkaVar.c) && this.d.equals(vkaVar.d) && Intrinsics.d(this.e, vkaVar.e) && Intrinsics.d(this.f, vkaVar.f) && Intrinsics.d(this.g, vkaVar.g) && this.h.equals(vkaVar.h);
    }

    @Override // a.bja
    public final dja getType() {
        return dja.PENALTY;
    }

    public final int hashCode() {
        return this.h.hashCode() + cs0.b(this.g, cs0.b(this.f, ua80.b(dw9.c(this.d, (this.c.f26818a.hashCode() + ((this.b.f26818a.hashCode() + brm0.f(this.f37563a, dja.PENALTY.hashCode() * 31, 31)) * 31)) * 31, 31), 31, this.e), 31), 31);
    }

    public final String toString() {
        dja djaVar = dja.PENALTY;
        StringBuilder sb = new StringBuilder("CardPenaltyUiModel(type=");
        sb.append(djaVar);
        sb.append(", topInfo=");
        sb.append((Object) this.f37563a);
        sb.append(", teamOne=");
        sb.append(this.b);
        sb.append(", teamTwo=");
        sb.append(this.c);
        sb.append(", score=");
        sb.append(this.d);
        sb.append(", penaltyName=");
        sb.append(this.e);
        sb.append(", penaltyTeamOne=");
        hne.y(sb, this.f, ", penaltyTeamTwo=", this.g, ", bottomInfoUiModel=");
        sb.append(this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
