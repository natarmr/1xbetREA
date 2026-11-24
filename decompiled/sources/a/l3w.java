package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l3w implements h3w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19376a;
    public final String b;
    public final k8x c;

    public l3w(String str, String str2, k8x k8xVar) {
        str.getClass();
        str2.getClass();
        this.f19376a = str;
        this.b = str2;
        this.c = k8xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3w)) {
            return false;
        }
        l3w l3wVar = (l3w) obj;
        return Intrinsics.d(this.f19376a, l3wVar.f19376a) && Intrinsics.d(this.b, l3wVar.b) && this.c.equals(l3wVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f19376a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HistoryItemInfoBlockUiModel(title=", this.f19376a, ", description=", this.b, ", type=");
        sbN.append(this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
