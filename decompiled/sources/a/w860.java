package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.xplatform.ui_core.viewcomponents.views.NumberItemView;

/* JADX INFO: loaded from: classes6.dex */
public final class w860 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f38708a;
    public final NumberItemView b;
    public final ImageView c;
    public final FrameLayout d;
    public final NumberItemView e;
    public final NumberItemView f;
    public final NumberItemView g;
    public final NumberItemView h;
    public final NumberItemView i;
    public final NumberItemView j;
    public final NumberItemView k;
    public final NumberItemView l;
    public final NumberItemView m;

    public w860(LinearLayout linearLayout, NumberItemView numberItemView, ImageView imageView, FrameLayout frameLayout, NumberItemView numberItemView2, NumberItemView numberItemView3, NumberItemView numberItemView4, NumberItemView numberItemView5, NumberItemView numberItemView6, NumberItemView numberItemView7, NumberItemView numberItemView8, NumberItemView numberItemView9, NumberItemView numberItemView10) {
        this.f38708a = linearLayout;
        this.b = numberItemView;
        this.c = imageView;
        this.d = frameLayout;
        this.e = numberItemView2;
        this.f = numberItemView3;
        this.g = numberItemView4;
        this.h = numberItemView5;
        this.i = numberItemView6;
        this.j = numberItemView7;
        this.k = numberItemView8;
        this.l = numberItemView9;
        this.m = numberItemView10;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f38708a;
    }
}
