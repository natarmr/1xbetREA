package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kov implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fov f18648a;
    public final String b;
    public final hov c;
    public final String d;
    public final String e;
    public final int f;

    public kov(fov fovVar, String str, hov hovVar, String str2, String str3, int i) {
        str3.getClass();
        this.f18648a = fovVar;
        this.b = str;
        this.c = hovVar;
        this.d = str2;
        this.e = str3;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kov)) {
            return false;
        }
        kov kovVar = (kov) obj;
        return this.f18648a.equals(kovVar.f18648a) && this.b.equals(kovVar.b) && this.c.equals(kovVar.c) && this.d.equals(kovVar.d) && Intrinsics.d(this.e, kovVar.e) && this.f == kovVar.f;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof kov) && (p6t0Var2 instanceof kov);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ua80.b(ua80.b((this.c.hashCode() + ua80.b((this.f18648a.hashCode() + (Long.hashCode(2L) * 31)) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof kov) || !(p6t0Var2 instanceof kov)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kov kovVar = (kov) p6t0Var;
        kov kovVar2 = (kov) p6t0Var2;
        k9x.G(linkedHashSet, kovVar.f18648a, kovVar2.f18648a);
        k9x.G(linkedHashSet, new gov(kovVar.b), new gov(kovVar2.b));
        k9x.G(linkedHashSet, kovVar.c, kovVar2.c);
        k9x.G(linkedHashSet, new iov(kovVar.d), new iov(kovVar2.d));
        k9x.G(linkedHashSet, new dov(kovVar.e), new dov(kovVar2.e));
        k9x.G(linkedHashSet, new eov(kovVar.f), new eov(kovVar2.f));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("FirstTeamWinCount(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("SecondTeamWinCount(value=", this.d, Separators.RPAREN);
        String strL3 = kng0.l("AdditionalTitle(value=", this.e, Separators.RPAREN);
        String strE = ua80.e(this.f, "Background(value=", Separators.RPAREN);
        StringBuilder sb = new StringBuilder("HeadToHeadLastMatchesHeaderUiModel(id=2, firstTeamImage=");
        sb.append(this.f18648a);
        sb.append(", firstTeamWinCount=");
        sb.append(strL);
        sb.append(", secondTeamImage=");
        sb.append(this.c);
        sb.append(", secondTeamWinCount=");
        sb.append(strL2);
        sb.append(", additionalTitle=");
        return ua80.m(sb, strL3, ", background=", strE, Separators.RPAREN);
    }
}
