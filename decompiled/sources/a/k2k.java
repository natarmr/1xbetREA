package a;

import android.view.View;
import androidx.cardview.widget.CardView;
import org.xplatform.promo.impl.settings.presentation.components.PromoAdditionalCardCollection;

/* JADX INFO: loaded from: classes3.dex */
public final class k2k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardView f17577a;
    public final PromoAdditionalCardCollection b;

    public k2k(CardView cardView, PromoAdditionalCardCollection promoAdditionalCardCollection) {
        this.f17577a = cardView;
        this.b = promoAdditionalCardCollection;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f17577a;
    }
}
