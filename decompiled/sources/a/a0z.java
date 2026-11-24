package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a0z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44a;
    public final long b;
    public final lho c;
    public final znp0 d;
    public final znp0 e;
    public final String f;
    public final int g;
    public final boolean h;
    public final String i;
    public final String j;
    public final mim0 k;

    public a0z(String str, long j, lho lhoVar, znp0 znp0Var, znp0 znp0Var2, String str2, int i, boolean z, String str3, String str4, mim0 mim0Var) {
        brm0.B(str2, str3, str4);
        this.f44a = str;
        this.b = j;
        this.c = lhoVar;
        this.d = znp0Var;
        this.e = znp0Var2;
        this.f = str2;
        this.g = i;
        this.h = z;
        this.i = str3;
        this.j = str4;
        this.k = mim0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0z)) {
            return false;
        }
        a0z a0zVar = (a0z) obj;
        return this.f44a.equals(a0zVar.f44a) && this.b == a0zVar.b && this.c == a0zVar.c && this.d.equals(a0zVar.d) && this.e.equals(a0zVar.e) && Intrinsics.d(this.f, a0zVar.f) && this.g == a0zVar.g && this.h == a0zVar.h && Intrinsics.d(this.i, a0zVar.i) && Intrinsics.d(this.j, a0zVar.j) && this.k.equals(a0zVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ua80.b(ua80.b(brm0.e(twn.a(this.g, ua80.b((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + rw2.b(this.f44a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31, 31, this.f), 31), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbO = f140.o(this.b, "LastGameUiModel(statisticGameId=", this.f44a, ", feedGameId=");
        sbO.append(", statusType=");
        sbO.append(this.c);
        sbO.append(", teamOne=");
        sbO.append(this.d);
        sbO.append(", teamTwo=");
        sbO.append(this.e);
        sbO.append(", gameDate=");
        sbO.append(this.f);
        dw9.v(this.g, ", dateStart=", ", scoreVs=", sbO, this.h);
        f140.v(sbO, ", scoreOne=", this.i, ", scoreTwo=", this.j);
        sbO.append(", card=");
        sbO.append(this.k);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
