package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class yyg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43464a;
    public final b0h b;
    public final List c;
    public final boolean d;

    public yyg(List list, b0h b0hVar, List list2, boolean z) {
        list.getClass();
        list2.getClass();
        this.f43464a = list;
        this.b = b0hVar;
        this.c = list2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyg)) {
            return false;
        }
        yyg yygVar = (yyg) obj;
        return Intrinsics.d(this.f43464a, yygVar.f43464a) && this.b.equals(yygVar.b) && Intrinsics.d(this.c, yygVar.c) && this.d == yygVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dw9.a((this.b.hashCode() + (this.f43464a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "CyberGamesLeaderBoardModel(organizations=" + this.f43464a + ", ranking=" + this.b + ", availableYears=" + this.c + ", isCurrencySymbolOnLeft=" + this.d + Separators.RPAREN;
    }
}
