package a;

import android.gov.nist.core.Separators;
import org.xplatform.favorites.impl.presentation.screen.category_image_header.models.CategoryImageHeaderTab;

/* JADX INFO: loaded from: classes4.dex */
public final class q5b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final whm f28143a;
    public final CategoryImageHeaderTab b;

    public q5b(whm whmVar, CategoryImageHeaderTab categoryImageHeaderTab) {
        this.f28143a = whmVar;
        this.b = categoryImageHeaderTab;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5b)) {
            return false;
        }
        q5b q5bVar = (q5b) obj;
        return this.f28143a.equals(q5bVar.f28143a) && this.b == q5bVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f28143a.hashCode() * 31);
    }

    public final String toString() {
        return "CategoryImageHeaderUiState(headerModel=" + this.f28143a + ", categoryImageHeaderTab=" + this.b + Separators.RPAREN;
    }
}
