package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v9v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37053a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;

    public v9v(String str, String str2, String str3, boolean z, String str4) {
        this.f37053a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9v)) {
            return false;
        }
        v9v v9vVar = (v9v) obj;
        return this.f37053a.equals(v9vVar.f37053a) && this.b.equals(v9vVar.b) && this.c == v9vVar.c && this.d.equals(v9vVar.d) && this.e.equals(v9vVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(brm0.e(ua80.b(this.f37053a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("GoldRushCubeUiModel(background=", this.f37053a, ", icon=", this.b, ", needChange=");
        f140.s(", defaultImage=", this.d, ", defaultBackground=", sbN, this.c);
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
