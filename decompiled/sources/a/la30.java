package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class la30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f19688a;
    public final List b;
    public final List c;
    public final long d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public la30(int i, long j, String str, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f19688a = i;
        this.b = list;
        this.c = list2;
        this.d = j;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la30)) {
            return false;
        }
        la30 la30Var = (la30) obj;
        return this.f19688a == la30Var.f19688a && Intrinsics.d(this.b, la30Var.b) && Intrinsics.d(this.c, la30Var.c) && this.d == la30Var.d && this.e.equals(la30Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + rw2.b(dw9.a(dw9.a(Integer.hashCode(this.f19688a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MatchInfoModel(mapCount=");
        sb.append((int) this.f19688a);
        sb.append(", defaultFirstTeamMapWinner=");
        sb.append(this.b);
        sb.append(", defaultSecondTeamMapWinner=");
        sb.append(this.c);
        sb.append(", gameDuration=");
        sb.append(this.d);
        return rw2.o(sb, ", extraInfo=", this.e, Separators.RPAREN);
    }
}
