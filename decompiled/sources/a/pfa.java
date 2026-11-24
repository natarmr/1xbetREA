package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class pfa implements tfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26891a;
    public final nga b;
    public final iga c;
    public final nem d;

    public pfa(long j, nga ngaVar, iga igaVar, nem nemVar) {
        this.f26891a = j;
        this.b = ngaVar;
        this.c = igaVar;
        this.d = nemVar;
    }

    @Override // a.tfa
    public final long a() {
        return this.f26891a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfa)) {
            return false;
        }
        pfa pfaVar = (pfa) obj;
        return this.f26891a == pfaVar.f26891a && this.b.equals(pfaVar.b) && this.c.equals(pfaVar.c) && this.d.equals(pfaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f26891a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "LargeCardLargeTeamLogo(gameId=" + this.f26891a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
