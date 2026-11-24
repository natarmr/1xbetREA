package a;

import android.gov.nist.core.Separators;
import org.xplatform.favorites.impl.presentation.screen.classic.models.ClassicFavoriteTab;

/* JADX INFO: loaded from: classes4.dex */
public final class lnc implements nnc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassicFavoriteTab f20337a;

    public lnc(ClassicFavoriteTab classicFavoriteTab) {
        this.f20337a = classicFavoriteTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lnc) && this.f20337a == ((lnc) obj).f20337a;
    }

    public final int hashCode() {
        return this.f20337a.hashCode();
    }

    public final String toString() {
        return "ScrollToStart(tab=" + this.f20337a + Separators.RPAREN;
    }
}
