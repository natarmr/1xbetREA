package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class qq20 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29146a;
    public final byte b;
    public final int c;
    public final ArrayList d;
    public final String e;
    public final String f;

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public qq20(String str, long j, int i, ArrayList arrayList, String str2, String str3) {
        this.f29146a = str;
        this.b = (int) j;
        this.c = i;
        this.d = arrayList;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq20)) {
            return false;
        }
        qq20 qq20Var = (qq20) obj;
        return this.f29146a.equals(qq20Var.f29146a) && ((long) this.b) == ((long) qq20Var.b) && this.c == qq20Var.c && this.d.equals(qq20Var.d) && this.e.equals(qq20Var.e) && this.f.equals(qq20Var.f);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof qq20) && (p6t0Var2 instanceof qq20) && ((long) ((qq20) p6t0Var).b) == ((long) ((qq20) p6t0Var2).b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f29146a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(twn.g(this.d, twn.a(this.c, rw2.b(this.f29146a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof qq20) || !(p6t0Var2 instanceof qq20)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        qq20 qq20Var = (qq20) p6t0Var;
        qq20 qq20Var2 = (qq20) p6t0Var2;
        k9x.G(linkedHashSet, new lq20(qq20Var.c), new lq20(qq20Var2.c));
        k9x.G(linkedHashSet, new mq20(qq20Var.d), new mq20(qq20Var2.d));
        k9x.G(linkedHashSet, new oq20(qq20Var.e), new oq20(qq20Var2.e));
        k9x.G(linkedHashSet, new nq20(qq20Var.f), new nq20(qq20Var2.f));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        long j = this.b;
        String strE = ua80.e(this.c, "Background(value=", Separators.RPAREN);
        String strO = hne.o("ScoreList(value=", Separators.RPAREN, this.d);
        String strL = kng0.l("TeamName(value=", this.e, Separators.RPAREN);
        String strL2 = kng0.l("TeamImage(value=", this.f, Separators.RPAREN);
        StringBuilder sbO = f140.o(j, "MarbleGamesItemUiModel(key=", this.f29146a, ", id=");
        f140.v(sbO, ", background=", strE, ", scoreList=", strO);
        f140.v(sbO, ", teamName=", strL, ", teamImage=", strL2);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
