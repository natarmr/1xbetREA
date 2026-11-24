package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public final class ekw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CyberGamesPage f7971a;
    public final String b;

    public ekw(String str, CyberGamesPage cyberGamesPage) {
        cyberGamesPage.getClass();
        str.getClass();
        this.f7971a = cyberGamesPage;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekw)) {
            return false;
        }
        ekw ekwVar = (ekw) obj;
        return Intrinsics.d(this.f7971a, ekwVar.f7971a) && Intrinsics.d(this.b, ekwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7971a.hashCode() * 31);
    }

    public final String toString() {
        return "HomeToolbarPage(page=" + this.f7971a + ", title=" + this.b + Separators.RPAREN;
    }
}
