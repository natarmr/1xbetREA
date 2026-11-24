package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ql60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28918a;
    public final String b;

    public ql60(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f28918a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql60)) {
            return false;
        }
        ql60 ql60Var = (ql60) obj;
        return Intrinsics.d(this.f28918a, ql60Var.f28918a) && Intrinsics.d(this.b, ql60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28918a.hashCode() * 961);
    }

    public final String toString() {
        return b1j.k("OneOpponentCompactLineEventCardModel(opponentName=", this.f28918a, ", opponentLogo=null, infoLabel=", this.b, Separators.RPAREN);
    }
}
