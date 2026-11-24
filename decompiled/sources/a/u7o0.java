package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.cyber.game.universal.impl.presentation.seabattle.view.SeaBattleView;

/* JADX INFO: loaded from: classes4.dex */
public final class u7o0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f35194a;
    public final ImageView b;
    public final ImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final SeaBattleView i;
    public final SeaBattleView j;

    public u7o0(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, SeaBattleView seaBattleView, SeaBattleView seaBattleView2) {
        this.f35194a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = textView;
        this.e = textView2;
        this.f = textView3;
        this.g = textView4;
        this.h = textView5;
        this.i = seaBattleView;
        this.j = seaBattleView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f35194a;
    }
}
