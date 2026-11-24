package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v800 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36957a;
    public final int b;
    public final List c;

    public v800(String str, List list, int i) {
        list.getClass();
        this.f36957a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v800)) {
            return false;
        }
        v800 v800Var = (v800) obj;
        return this.f36957a.equals(v800Var.f36957a) && this.b == v800Var.b && Intrinsics.d(this.c, v800Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f36957a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(kng0.p(this.b, "LineUpTeamModel(title=", this.f36957a, ", type=", ", pitchPlayers="), this.c, Separators.RPAREN);
    }
}
