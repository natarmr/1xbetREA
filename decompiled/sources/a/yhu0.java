package a;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.xplatform.core.presentation.views.cards.LuckyCardButton;

/* JADX INFO: loaded from: classes2.dex */
public final class yhu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f42655a;
    public final LuckyCardButton b;
    public final LuckyCardButton c;
    public final LuckyCardButton d;
    public final LuckyCardButton e;
    public final TextView f;
    public final LuckyCardButton g;
    public final LuckyCardButton h;

    public yhu0(LinearLayout linearLayout, LuckyCardButton luckyCardButton, LuckyCardButton luckyCardButton2, LuckyCardButton luckyCardButton3, LuckyCardButton luckyCardButton4, TextView textView, LuckyCardButton luckyCardButton5, LuckyCardButton luckyCardButton6) {
        this.f42655a = linearLayout;
        this.b = luckyCardButton;
        this.c = luckyCardButton2;
        this.d = luckyCardButton3;
        this.e = luckyCardButton4;
        this.f = textView;
        this.g = luckyCardButton5;
        this.h = luckyCardButton6;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f42655a;
    }
}
