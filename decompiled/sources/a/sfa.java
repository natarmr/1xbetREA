package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sfa implements tfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32108a;
    public final qga b;
    public final lga c;
    public final nem d;

    public sfa(long j, qga qgaVar, lga lgaVar, nem nemVar) {
        this.f32108a = j;
        this.b = qgaVar;
        this.c = lgaVar;
        this.d = nemVar;
    }

    @Override // a.tfa
    public final long a() {
        return this.f32108a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfa)) {
            return false;
        }
        sfa sfaVar = (sfa) obj;
        return this.f32108a == sfaVar.f32108a && this.b.equals(sfaVar.b) && this.c.equals(sfaVar.c) && this.d.equals(sfaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f32108a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(gameId=" + this.f32108a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
