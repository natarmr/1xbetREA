package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class n1e0 implements p1e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22747a;
    public final String b;
    public final v12 c;
    public final String d;

    public n1e0(String str, String str2, v12 v12Var) {
        str.getClass();
        str2.getClass();
        this.f22747a = str;
        this.b = str2;
        this.c = v12Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1e0)) {
            return false;
        }
        n1e0 n1e0Var = (n1e0) obj;
        return Intrinsics.d(this.f22747a, n1e0Var.f22747a) && Intrinsics.d(this.b, n1e0Var.b) && this.c == n1e0Var.c;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(twn.a(R.drawable.ic_glyph_statistics, this.f22747a.hashCode() * 31, 31), 31, this.b);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(R.drawable.ic_glyph_statistics, "RankingCellLUiModel(eventId=", this.f22747a, ", icon=", ", title=");
        sbP.append(this.b);
        sbP.append(", alignmentInSection=");
        sbP.append(this.c);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
