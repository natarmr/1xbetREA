package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class hrv implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13551a;
    public final CyberGamesPage b;
    public final b8m c;
    public final ymh d;

    public hrv(String str, CyberGamesPage cyberGamesPage, b8m b8mVar, ymh ymhVar) {
        cyberGamesPage.getClass();
        this.f13551a = str;
        this.b = cyberGamesPage;
        this.c = b8mVar;
        this.d = ymhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hrv)) {
            return false;
        }
        hrv hrvVar = (hrv) obj;
        return this.f13551a.equals(hrvVar.f13551a) && Intrinsics.d(this.b, hrvVar.b) && this.c.equals(hrvVar.c) && this.d.equals(hrvVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f13551a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f13551a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "HeaderFocusTournamentListUiModel(key=" + this.f13551a + ", cyberGamesPage=" + this.b + ", header=" + this.c + ", tournamentList=" + this.d + Separators.RPAREN;
    }
}
