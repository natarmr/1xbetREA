package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rad implements sad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30129a;
    public final String b;
    public final j83 c;

    public rad(j83 j83Var, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f30129a = str;
        this.b = str2;
        this.c = j83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rad)) {
            return false;
        }
        rad radVar = (rad) obj;
        return Intrinsics.d(this.f30129a, radVar.f30129a) && Intrinsics.d(this.b, radVar.b) && this.c.equals(radVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f30129a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TwoOpponents(teamOneName=", this.f30129a, ", teamTwoName=", this.b, ", score=");
        sbN.append((Object) this.c);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
