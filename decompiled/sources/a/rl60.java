package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rl60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30682a;
    public final String b;

    public rl60(String str, String str2) {
        str.getClass();
        this.f30682a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl60)) {
            return false;
        }
        rl60 rl60Var = (rl60) obj;
        return Intrinsics.d(this.f30682a, rl60Var.f30682a) && this.b.equals(rl60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30682a.hashCode() * 961);
    }

    public final String toString() {
        return b1j.k("OneOpponentCompactLiveEventCardModel(opponentName=", this.f30682a, ", opponentLogo=null, infoLabel=", this.b, Separators.RPAREN);
    }
}
