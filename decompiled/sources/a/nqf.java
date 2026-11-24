package a;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class nqf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23956a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final Map f;

    public nqf(boolean z, boolean z2, boolean z3, String str, boolean z4, Map map) {
        this.f23956a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = z4;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqf)) {
            return false;
        }
        nqf nqfVar = (nqf) obj;
        return this.f23956a == nqfVar.f23956a && this.b == nqfVar.b && this.c == nqfVar.c && this.d.equals(nqfVar.d) && this.e == nqfVar.e && this.f.equals(nqfVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(ua80.b(brm0.e(brm0.e(Boolean.hashCode(this.f23956a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("Cs2PlayerWeaponModel(hasHelmet=", ", hasKevlar=", ", hasDefuse=", this.f23956a, this.b);
        f140.s(", weaponName=", this.d, ", hasBomb=", sbQ, this.c);
        sbQ.append(this.e);
        sbQ.append(", grenades=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
