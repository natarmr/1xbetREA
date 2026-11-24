package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class uqk implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36122a;
    public final CyberGamesPage b;
    public final fnh c;
    public final m3g d;

    public uqk(String str, CyberGamesPage cyberGamesPage, fnh fnhVar, m3g m3gVar) {
        cyberGamesPage.getClass();
        this.f36122a = str;
        this.b = cyberGamesPage;
        this.c = fnhVar;
        this.d = m3gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uqk)) {
            return false;
        }
        uqk uqkVar = (uqk) obj;
        return this.f36122a.equals(uqkVar.f36122a) && Intrinsics.d(this.b, uqkVar.b) && this.c.equals(uqkVar.c) && this.d.equals(uqkVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f36122a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f36122a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DisciplineDetailsEventFocusTournamentsUiModel(key=" + this.f36122a + ", cyberGamesPage=" + this.b + ", tournamentList=" + this.c + ", buttonBlockState=" + this.d + Separators.RPAREN;
    }
}
