package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class tm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34174a;
    public final sm3 b;
    public final rm3 c;
    public final qm3 d;

    public tm3(boolean z, sm3 sm3Var, rm3 rm3Var, qm3 qm3Var) {
        this.f34174a = z;
        this.b = sm3Var;
        this.c = rm3Var;
        this.d = qm3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tm3)) {
            return false;
        }
        tm3 tm3Var = (tm3) obj;
        return this.f34174a == tm3Var.f34174a && this.b == tm3Var.b && this.c == tm3Var.c && this.d == tm3Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f34174a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AppUpdateSettingsModel(hasDropDownCardsEnable=" + this.f34174a + ", screenType=" + this.b + ", downloadType=" + this.c + ", backgroundType=" + this.d + Separators.RPAREN;
    }
}
