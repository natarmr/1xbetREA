package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import org.xplatform.swipex.impl.presentation.swipex.cardstack.SwipexCardsRecyclerView;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.chips.DsChips;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final class wvn0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f39846a;
    public final TextView b;
    public final TextView c;
    public final SwipexCardsRecyclerView d;
    public final DsButton e;
    public final ConstraintLayout f;
    public final FrameLayout g;
    public final DsChips h;
    public final AppCompatImageView i;
    public final DsButton j;
    public final LottieView k;
    public final View l;
    public final Group m;
    public final AppCompatImageView n;
    public final AppCompatImageView o;
    public final ComposeView p;

    public wvn0(ConstraintLayout constraintLayout, TextView textView, TextView textView2, SwipexCardsRecyclerView swipexCardsRecyclerView, DsButton dsButton, ConstraintLayout constraintLayout2, FrameLayout frameLayout, DsChips dsChips, AppCompatImageView appCompatImageView, DsButton dsButton2, LottieView lottieView, View view, Group group, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, ComposeView composeView) {
        this.f39846a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = swipexCardsRecyclerView;
        this.e = dsButton;
        this.f = constraintLayout2;
        this.g = frameLayout;
        this.h = dsChips;
        this.i = appCompatImageView;
        this.j = dsButton2;
        this.k = lottieView;
        this.l = view;
        this.m = group;
        this.n = appCompatImageView2;
        this.o = appCompatImageView3;
        this.p = composeView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f39846a;
    }
}
