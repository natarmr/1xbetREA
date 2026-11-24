package a;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes6.dex */
public final class cfs0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCardView f4279a;
    public final TextView b;
    public final TextView c;
    public final TextView d;

    public cfs0(MaterialCardView materialCardView, TextView textView, TextView textView2, TextView textView3) {
        this.f4279a = materialCardView;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4279a;
    }
}
