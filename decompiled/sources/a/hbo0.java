package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class hbo0 implements v7h0 {
    public static final gbo0 Companion = new gbo0();
    public static final a8z[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CyberGamesPage f12779a;
    public final CyberGamesParentSectionModel b;

    static {
        wez wezVar = wez.f39042a;
        c = new a8z[]{maz.a(wezVar, new a7n0((byte) 26)), maz.a(wezVar, new a7n0((byte) 27))};
    }

    public /* synthetic */ hbo0(int i, CyberGamesPage cyberGamesPage, CyberGamesParentSectionModel cyberGamesParentSectionModel) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, fbo0.f9271a.getDescriptor());
            throw null;
        }
        this.f12779a = cyberGamesPage;
        this.b = cyberGamesParentSectionModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbo0)) {
            return false;
        }
        hbo0 hbo0Var = (hbo0) obj;
        return Intrinsics.d(this.f12779a, hbo0Var.f12779a) && Intrinsics.d(this.b, hbo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f12779a.hashCode() * 31);
    }

    public final String toString() {
        return "TabCyberRoute(cyberGamesPage=" + this.f12779a + ", parentSection=" + this.b + Separators.RPAREN;
    }

    public hbo0(CyberGamesPage.Real real, CyberGamesParentSectionModel.FromNewPopular fromNewPopular) {
        real.getClass();
        fromNewPopular.getClass();
        this.f12779a = real;
        this.b = fromNewPopular;
    }
}
