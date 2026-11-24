package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class snd implements ynd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cex f32488a;
    public final mdp0 b;
    public final mdp0 c;
    public final String d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final j83 h;

    public snd(cex cexVar, mdp0 mdp0Var, mdp0 mdp0Var2, String str, boolean z, String str2, boolean z2, j83 j83Var) {
        this.f32488a = cexVar;
        this.b = mdp0Var;
        this.c = mdp0Var2;
        this.d = str;
        this.e = z;
        this.f = str2;
        this.g = z2;
        this.h = j83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snd)) {
            return false;
        }
        snd sndVar = (snd) obj;
        return this.f32488a == sndVar.f32488a && this.b.equals(sndVar.b) && this.c.equals(sndVar.c) && this.d.equals(sndVar.d) && this.e == sndVar.e && this.f.equals(sndVar.f) && this.g == sndVar.g && this.h.equals(sndVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + brm0.e(ua80.b(brm0.e(ua80.b((this.c.hashCode() + ((this.b.hashCode() + (this.f32488a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedCardCricketUiModel(inningType=");
        sb.append(this.f32488a);
        sb.append(", teamOne=");
        sb.append(this.b);
        sb.append(", teamTwo=");
        sb.append(this.c);
        sb.append(", teamOneScore=");
        sb.append(this.d);
        sb.append(", teamOneScoreIncrease=");
        f140.s(", teamTwoScore=", this.f, ", teamTwoScoreIncrease=", sb, this.e);
        sb.append(this.g);
        sb.append(", matchInfo=");
        sb.append((Object) this.h);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
