package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class kjm0 implements ljm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bzm f18393a;
    public final bzm b;
    public final String c;
    public final String d;
    public final String e;

    public kjm0(bzm bzmVar, bzm bzmVar2, String str, String str2, String str3) {
        str.getClass();
        this.f18393a = bzmVar;
        this.b = bzmVar2;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjm0)) {
            return false;
        }
        kjm0 kjm0Var = (kjm0) obj;
        return this.f18393a.equals(kjm0Var.f18393a) && this.b.equals(kjm0Var.b) && Intrinsics.d(this.c, kjm0Var.c) && this.d.equals(kjm0Var.d) && this.e.equals(kjm0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b((this.b.hashCode() + (this.f18393a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoPairs(teamOne=");
        sb.append(this.f18393a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", info=");
        f140.v(sb, this.c, ", seedingLeft=", this.d, ", seedingRight=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
