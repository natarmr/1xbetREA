package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class bym {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3426a;
    public final c280 b;
    public final String c;
    public final String d;
    public final String e;

    public bym(c280 c280Var, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        this.f3426a = str;
        this.b = c280Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bym)) {
            return false;
        }
        bym bymVar = (bym) obj;
        return Intrinsics.d(this.f3426a, bymVar.f3426a) && this.b.equals(bymVar.b) && Intrinsics.d(this.c, bymVar.c) && this.d.equals(bymVar.d) && this.e.equals(bymVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(hne.g(this.b, this.f3426a.hashCode() * 31, 961), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbP = f140.p(this.b, "V3(teamName=", this.f3426a, ", firstOpponentIconOfPair=", ", secondOpponentIconOfPair=null, infoLabel=");
        f140.v(sbP, this.c, ", seedingLeft=", this.d, ", seedingRight=");
        return axq.n(sbP, this.e, Separators.RPAREN);
    }
}
