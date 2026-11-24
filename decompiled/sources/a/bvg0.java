package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.button.MaterialButton;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final class bvg0 implements yfu0 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f3278a;
    public final Group b;
    public final MaterialButton c;
    public final FrameLayout d;
    public final NestedScrollView e;
    public final LottieView f;
    public final FrameLayout g;
    public final FrameLayout h;
    public final LinearLayout i;
    public final Group j;
    public final Group k;
    public final SeekBar l;
    public final SeekBar m;
    public final SeekBar n;
    public final DsNavigationBar o;
    public final TextView p;
    public final TextView q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final LinearLayout w;
    public final TextView x;
    public final TextView y;
    public final TextView z;

    public bvg0(ConstraintLayout constraintLayout, Group group, MaterialButton materialButton, FrameLayout frameLayout, NestedScrollView nestedScrollView, LottieView lottieView, FrameLayout frameLayout2, FrameLayout frameLayout3, LinearLayout linearLayout, Group group2, Group group3, SeekBar seekBar, SeekBar seekBar2, SeekBar seekBar3, DsNavigationBar dsNavigationBar, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, LinearLayout linearLayout2, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15) {
        this.f3278a = constraintLayout;
        this.b = group;
        this.c = materialButton;
        this.d = frameLayout;
        this.e = nestedScrollView;
        this.f = lottieView;
        this.g = frameLayout2;
        this.h = frameLayout3;
        this.i = linearLayout;
        this.j = group2;
        this.k = group3;
        this.l = seekBar;
        this.m = seekBar2;
        this.n = seekBar3;
        this.o = dsNavigationBar;
        this.p = textView;
        this.q = textView2;
        this.r = textView3;
        this.s = textView4;
        this.t = textView5;
        this.u = textView6;
        this.v = textView7;
        this.w = linearLayout2;
        this.x = textView8;
        this.y = textView9;
        this.z = textView10;
        this.A = textView11;
        this.B = textView12;
        this.C = textView13;
        this.D = textView14;
        this.E = textView15;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f3278a;
    }
}
