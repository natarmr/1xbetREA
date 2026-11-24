package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class ltx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f20646a;
    public final RoundCornerImageView b;
    public final RoundCornerImageView c;
    public final RecyclerView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final View i;
    public final View j;
    public final View k;
    public final View l;
    public final View m;

    public ltx(ConstraintLayout constraintLayout, RoundCornerImageView roundCornerImageView, RoundCornerImageView roundCornerImageView2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, View view, View view2, View view3, View view4, View view5) {
        this.f20646a = constraintLayout;
        this.b = roundCornerImageView;
        this.c = roundCornerImageView2;
        this.d = recyclerView;
        this.e = textView;
        this.f = textView2;
        this.g = textView3;
        this.h = textView4;
        this.i = view;
        this.j = view2;
        this.k = view3;
        this.l = view4;
        this.m = view5;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f20646a;
    }
}
