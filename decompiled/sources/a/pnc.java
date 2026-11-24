package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.favorites.impl.presentation.screen.classic.models.ClassicFavoriteTab;

/* JADX INFO: loaded from: classes4.dex */
public final class pnc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vhm f27280a;
    public final a4x b;
    public final aoo0 c;
    public final int d;
    public final ClassicFavoriteTab e;

    public pnc(vhm vhmVar, a4x a4xVar, aoo0 aoo0Var, int i, ClassicFavoriteTab classicFavoriteTab) {
        a4xVar.getClass();
        this.f27280a = vhmVar;
        this.b = a4xVar;
        this.c = aoo0Var;
        this.d = i;
        this.e = classicFavoriteTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnc)) {
            return false;
        }
        pnc pncVar = (pnc) obj;
        return this.f27280a.equals(pncVar.f27280a) && Intrinsics.d(this.b, pncVar.b) && this.c == pncVar.c && this.d == pncVar.d && this.e == pncVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, (this.c.hashCode() + cs0.b(this.b, this.f27280a.hashCode() * 31, 31)) * 31, 31);
    }

    public final String toString() {
        return "ClassicFavoritesContainerUiState(headerModel=" + this.f27280a + ", tabs=" + this.b + ", tabStyle=" + this.c + ", selectedTabPosition=" + this.d + ", classicFavoriteTab=" + this.e + Separators.RPAREN;
    }
}
