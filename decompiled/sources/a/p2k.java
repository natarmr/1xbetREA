package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.promo.impl.promocodes.presentation.shop.components.PromoStoreCollection;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.header.DsHeader;

/* JADX INFO: loaded from: classes4.dex */
public final class p2k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f26254a;
    public final DsButton b;
    public final ConstraintLayout c;
    public final DsHeader d;
    public final PromoStoreCollection e;
    public final TextView f;

    public p2k(LinearLayout linearLayout, DsButton dsButton, ConstraintLayout constraintLayout, DsHeader dsHeader, PromoStoreCollection promoStoreCollection, TextView textView) {
        this.f26254a = linearLayout;
        this.b = dsButton;
        this.c = constraintLayout;
        this.d = dsHeader;
        this.e = promoStoreCollection;
        this.f = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f26254a;
    }
}
