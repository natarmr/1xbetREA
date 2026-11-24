package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class use implements yse {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36206a;
    public final heu0 b;
    public final pip0 c;
    public final String d;
    public final pip0 e;
    public final heu0 f;
    public final boolean g;

    public use(String str, heu0 heu0Var, pip0 pip0Var, String str2, pip0 pip0Var2, heu0 heu0Var2, boolean z) {
        this.f36206a = str;
        this.b = heu0Var;
        this.c = pip0Var;
        this.d = str2;
        this.e = pip0Var2;
        this.f = heu0Var2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof use)) {
            return false;
        }
        use useVar = (use) obj;
        return this.f36206a.equals(useVar.f36206a) && this.b.equals(useVar.b) && this.c == useVar.c && this.d.equals(useVar.d) && this.e == useVar.e && this.f.equals(useVar.f) && this.g == useVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f36206a.hashCode() * 31)) * 31)) * 31, 31, this.d)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CyberScoreUiModel(firstTeamScore=");
        sb.append(this.f36206a);
        sb.append(", firstTeamVictoryIndicatorUiModel=");
        sb.append(this.b);
        sb.append(", firstTeamScoreState=");
        sb.append(this.c);
        sb.append(", secondTeamScore=");
        sb.append(this.d);
        sb.append(", secondTeamScoreState=");
        sb.append(this.e);
        sb.append(", secondTeamVictoryIndicatorUiModel=");
        sb.append(this.f);
        sb.append(", showScore=");
        return rw2.p(sb, this.g, Separators.RPAREN);
    }
}
