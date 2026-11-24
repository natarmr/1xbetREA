package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class rrk implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30988a;
    public final CyberGamesPage b;
    public final b8m c;
    public final enh d;

    public rrk(String str, CyberGamesPage cyberGamesPage, b8m b8mVar, enh enhVar) {
        cyberGamesPage.getClass();
        this.f30988a = str;
        this.b = cyberGamesPage;
        this.c = b8mVar;
        this.d = enhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrk)) {
            return false;
        }
        rrk rrkVar = (rrk) obj;
        return this.f30988a.equals(rrkVar.f30988a) && Intrinsics.d(this.b, rrkVar.b) && this.c.equals(rrkVar.c) && this.d.equals(rrkVar.d);
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f30988a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f30988a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DisciplineDetailsIconFocusChampionshipsUiModel(key=" + this.f30988a + ", cyberGamesPage=" + this.b + ", header=" + this.c + ", tournamentsCollection=" + this.d + Separators.RPAREN;
    }
}
