package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class lje implements sie {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20146a;
    public final String b;
    public final boolean c;
    public final dj90 d;
    public final ej90 e;

    public lje(String str, String str2, boolean z, dj90 dj90Var, ej90 ej90Var) {
        str2.getClass();
        this.f20146a = str;
        this.b = str2;
        this.c = z;
        this.d = dj90Var;
        this.e = ej90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lje)) {
            return false;
        }
        lje ljeVar = (lje) obj;
        return this.f20146a.equals(ljeVar.f20146a) && Intrinsics.d(this.b, ljeVar.b) && this.c == ljeVar.c && this.d == ljeVar.d && this.e == ljeVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + brm0.e(ua80.b(this.f20146a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ContentValueItemUiModel(title=", this.f20146a, ", value=", this.b, ", valueVisible=");
        sbN.append(this.c);
        sbN.append(", position=");
        sbN.append(this.d);
        sbN.append(", type=");
        sbN.append(this.e);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
