package a;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes3.dex */
public final class nug0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f24145a;
    public final MaterialButton b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;

    public nug0(ConstraintLayout constraintLayout, MaterialButton materialButton, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.f24145a = constraintLayout;
        this.b = materialButton;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = textView5;
        this.h = textView6;
        this.i = textView7;
        this.j = textView8;
        this.k = textView9;
        this.l = textView10;
        this.m = textView11;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24145a;
    }
}
