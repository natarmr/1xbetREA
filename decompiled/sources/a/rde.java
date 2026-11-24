package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rde implements sie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30287a;
    public final String b;
    public final String c;
    public final boolean d;
    public final ej90 e;

    public rde(String str, String str2, String str3, boolean z, ej90 ej90Var) {
        dj90 dj90Var = dj90.f6173a;
        str2.getClass();
        str3.getClass();
        this.f30287a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = ej90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rde)) {
            return false;
        }
        rde rdeVar = (rde) obj;
        if (!this.f30287a.equals(rdeVar.f30287a) || !Intrinsics.d(this.b, rdeVar.b) || !Intrinsics.d(this.c, rdeVar.c) || this.d != rdeVar.d) {
            return false;
        }
        dj90 dj90Var = dj90.f6173a;
        return this.e == rdeVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((dj90.c.hashCode() + brm0.e(ua80.b(ua80.b(this.f30287a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        dj90 dj90Var = dj90.c;
        StringBuilder sbN = b1j.n("ContentActionItemUiModel(title=", this.f30287a, ", subtitle=", this.b, ", action=");
        brm0.C(this.c, ", actionVisible=", ", position=", sbN, this.d);
        sbN.append(dj90Var);
        sbN.append(", type=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
