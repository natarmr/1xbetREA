package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberDurakCardDeckView;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberDurakGameView;
import org.xplatform.cyber.game.universal.impl.presentation.durak.view.CyberPlayedCardsTableView;

/* JADX INFO: loaded from: classes4.dex */
public final class m1o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CyberDurakGameView f21018a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final CyberDurakCardDeckView e;
    public final k1o0 f;
    public final ImageView g;
    public final TextView h;
    public final CyberPlayedCardsTableView i;
    public final k1o0 j;

    public m1o0(CyberDurakGameView cyberDurakGameView, TextView textView, TextView textView2, TextView textView3, CyberDurakCardDeckView cyberDurakCardDeckView, k1o0 k1o0Var, ImageView imageView, TextView textView4, CyberPlayedCardsTableView cyberPlayedCardsTableView, k1o0 k1o0Var2) {
        this.f21018a = cyberDurakGameView;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = cyberDurakCardDeckView;
        this.f = k1o0Var;
        this.g = imageView;
        this.h = textView4;
        this.i = cyberPlayedCardsTableView;
        this.j = k1o0Var2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f21018a;
    }
}
