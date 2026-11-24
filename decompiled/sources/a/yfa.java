package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class yfa implements zfa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f42531a;
    public final aha b;
    public final vga c;
    public final nem d;

    public yfa(long j, aha ahaVar, vga vgaVar, nem nemVar) {
        this.f42531a = j;
        this.b = ahaVar;
        this.c = vgaVar;
        this.d = nemVar;
    }

    @Override // a.zfa
    public final long a() {
        return this.f42531a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfa)) {
            return false;
        }
        yfa yfaVar = (yfa) obj;
        return this.f42531a == yfaVar.f42531a && this.b.equals(yfaVar.b) && this.c.equals(yfaVar.c) && this.d.equals(yfaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.f42531a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(gameId=" + this.f42531a + ", topBlock=" + this.b + ", middleBlock=" + this.c + ", bottomBlock=" + this.d + Separators.RPAREN;
    }
}
