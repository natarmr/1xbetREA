package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.swipex.impl.presentation.swipex.cardstack.SwipexCardsRecyclerView;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes6.dex */
public final class ywn0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f43379a;
    public final TextView b;
    public final TextView c;
    public final DsButton d;
    public final SwipexCardsRecyclerView e;
    public final DsButton f;
    public final ConstraintLayout g;
    public final AppCompatImageView h;
    public final ImageView i;
    public final ImageView j;
    public final ImageView k;
    public final DsButton l;
    public final TextView m;
    public final TextView n;

    public ywn0(ConstraintLayout constraintLayout, TextView textView, TextView textView2, DsButton dsButton, SwipexCardsRecyclerView swipexCardsRecyclerView, DsButton dsButton2, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, ImageView imageView, ImageView imageView2, ImageView imageView3, DsButton dsButton3, TextView textView3, TextView textView4) {
        this.f43379a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = dsButton;
        this.e = swipexCardsRecyclerView;
        this.f = dsButton2;
        this.g = constraintLayout2;
        this.h = appCompatImageView;
        this.i = imageView;
        this.j = imageView2;
        this.k = imageView3;
        this.l = dsButton3;
        this.m = textView3;
        this.n = textView4;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f43379a;
    }
}
