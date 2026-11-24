package a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import org.xplatform.feature.dayexpress.impl.presentation.view.ExpressCardMiddleView;
import org.xplatform.lucky_wheel.presentation.views.LuckyWheelView;
import org.xplatform.ui_core.circleindicator.CircleIndicator;
import org.xplatform.ui_core.viewcomponents.views.SwipeBackLayout;
import org.xplatform.uikit.components.separator.DsSeparator;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;
import org.xplatform.uikit_sport.eventcard.middle.EventCardMiddleBaccarat;
import org.xplatform.uikit_sport.score.SportScore;

/* JADX INFO: loaded from: classes3.dex */
public final class uk5 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35809a;
    public final ViewGroup b;
    public final View c;
    public final View d;
    public final View e;
    public final Object f;
    public final Object g;

    public uk5(EventCardMiddleBaccarat eventCardMiddleBaccarat, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, ImageView imageView4, ImageView imageView5, TextView textView2, TextView textView3, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, TextView textView4, ImageView imageView10, ImageView imageView11, ImageView imageView12, ImageView imageView13, SportScore sportScore) {
        this.f35809a = (byte) 2;
        this.b = eventCardMiddleBaccarat;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = sportScore;
    }

    @Override // a.yfu0
    public final View getRoot() {
        byte b = this.f35809a;
        ViewGroup viewGroup = this.b;
        switch (b) {
            case 0:
                return (ConstraintLayout) viewGroup;
            case 1:
                return (LinearLayout) this.f;
            case 2:
                return (EventCardMiddleBaccarat) viewGroup;
            case 3:
                return (ExpressCardMiddleView) viewGroup;
            case 4:
                return (ConstraintLayout) viewGroup;
            case 5:
                return (CoordinatorLayout) viewGroup;
            case 6:
                return (ConstraintLayout) viewGroup;
            case 7:
                return (ConstraintLayout) viewGroup;
            case 8:
                return (MaterialCardView) viewGroup;
            case 9:
                return (LuckyWheelView) viewGroup;
            default:
                return (ConstraintLayout) viewGroup;
        }
    }

    public uk5(ConstraintLayout constraintLayout, vd7 vd7Var, vd7 vd7Var2, TextView textView, TextView textView2, TextView textView3) {
        this.f35809a = (byte) 7;
        this.b = constraintLayout;
        this.f = vd7Var;
        this.g = vd7Var2;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
    }

    public uk5(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2, View view) {
        this.f35809a = (byte) 6;
        this.b = constraintLayout;
        this.c = textView;
        this.g = imageView;
        this.e = imageView2;
        this.d = textView2;
        this.f = view;
    }

    public uk5(ConstraintLayout constraintLayout, TextView textView, DsSeparator dsSeparator, ImageView imageView, TextView textView2, TextView textView3) {
        this.f35809a = (byte) 0;
        this.b = constraintLayout;
        this.c = textView;
        this.f = dsSeparator;
        this.g = imageView;
        this.d = textView2;
        this.e = textView3;
    }

    public uk5(ConstraintLayout constraintLayout, CircleIndicator circleIndicator, ViewPager viewPager, ImageView imageView, ConstraintLayout constraintLayout2, SwipeBackLayout swipeBackLayout) {
        this.f35809a = (byte) 4;
        this.b = constraintLayout;
        this.c = circleIndicator;
        this.d = viewPager;
        this.g = imageView;
        this.e = constraintLayout2;
        this.f = swipeBackLayout;
    }

    public uk5(LinearLayout linearLayout, ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.f35809a = (byte) 1;
        this.f = linearLayout;
        this.b = constraintLayout;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.g = textView4;
    }

    public uk5(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FrameLayout frameLayout, LoadableShapeableImageView loadableShapeableImageView, nq8 nq8Var, NestedScrollView nestedScrollView) {
        this.f35809a = (byte) 5;
        this.b = coordinatorLayout;
        this.c = appBarLayout;
        this.d = frameLayout;
        this.e = loadableShapeableImageView;
        this.f = nq8Var;
        this.g = nestedScrollView;
    }

    public uk5(MaterialCardView materialCardView, FrameLayout frameLayout, TextView textView, ImageView imageView, ImageView imageView2, TextView textView2) {
        this.f35809a = (byte) 8;
        this.b = materialCardView;
        this.e = frameLayout;
        this.c = textView;
        this.g = imageView;
        this.f = imageView2;
        this.d = textView2;
    }

    public uk5(ExpressCardMiddleView expressCardMiddleView, ImageView imageView, ComposeView composeView, TextView textView, TextView textView2, TextView textView3) {
        this.f35809a = (byte) 3;
        this.b = expressCardMiddleView;
        this.g = imageView;
        this.f = composeView;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
    }

    public /* synthetic */ uk5(ConstraintLayout constraintLayout, ImageView imageView, View view, View view2, View view3, View view4, byte b) {
        this.f35809a = b;
        this.b = constraintLayout;
        this.g = imageView;
        this.c = view;
        this.d = view2;
        this.e = view3;
        this.f = view4;
    }
}
