package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class hdw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12891a;
    public final String b;
    public final String c;
    public final jd6 d;
    public final int e;

    public hdw(String str, String str2, String str3, jd6 jd6Var, int i) {
        str.getClass();
        this.f12891a = str;
        this.b = str2;
        this.c = str3;
        this.d = jd6Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdw)) {
            return false;
        }
        hdw hdwVar = (hdw) obj;
        return Intrinsics.d(this.f12891a, hdwVar.f12891a) && this.b.equals(hdwVar.b) && this.c.equals(hdwVar.c) && this.d.equals(hdwVar.d) && this.e == hdwVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + ua80.b(ua80.b(this.f12891a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HltvAwardsMainNominationNomineesUiModel(id=", this.f12891a, ", image=", this.b, ", title=");
        sbN.append(this.c);
        sbN.append(", bet=");
        sbN.append(this.d);
        sbN.append(", place=");
        return rz4.j(this.e, Separators.RPAREN, sbN);
    }
}
