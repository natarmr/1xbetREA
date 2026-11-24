package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class oqf implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ank0 f25685a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public oqf(ank0 ank0Var, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f25685a = ank0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqf)) {
            return false;
        }
        oqf oqfVar = (oqf) obj;
        return this.f25685a.equals(oqfVar.f25685a) && this.b.equals(oqfVar.b) && this.c.equals(oqfVar.c) && this.d.equals(oqfVar.d) && this.e.equals(oqfVar.e) && this.f.equals(oqfVar.f) && this.g.equals(oqfVar.g) && this.h.equals(oqfVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f25685a.f1159a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Cs2PlayerWeaponUiModel(playerName=");
        sb.append(this.f25685a);
        sb.append(", additionalImage=");
        sb.append(this.b);
        sb.append(", mainWeaponImage=");
        f140.v(sb, this.c, ", firstWeaponImage=", this.d, ", secondWeaponImage=");
        f140.v(sb, this.e, ", thirdWeaponImage=", this.f, ", fourWeaponImage=");
        return ua80.m(sb, this.g, ", fiveWeaponImage=", this.h, Separators.RPAREN);
    }
}
