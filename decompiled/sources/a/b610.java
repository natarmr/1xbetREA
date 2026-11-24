package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b610 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2032a;
    public final String b;

    public b610(String str, String str2) {
        str.getClass();
        this.f2032a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b610)) {
            return false;
        }
        b610 b610Var = (b610) obj;
        return Intrinsics.d(this.f2032a, b610Var.f2032a) && this.b.equals(b610Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f2032a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("LolTeamUiModel(teamName=", this.f2032a, ", teamImage=", this.b, Separators.RPAREN);
    }
}
