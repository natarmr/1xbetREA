package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class agu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCardView f843a;
    public final MaterialCardView b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;
    public final LinearLayout f;
    public final TextView g;

    public agu0(MaterialCardView materialCardView, MaterialCardView materialCardView2, ImageView imageView, ImageView imageView2, TextView textView, LinearLayout linearLayout, TextView textView2) {
        this.f843a = materialCardView;
        this.b = materialCardView2;
        this.c = imageView;
        this.d = imageView2;
        this.e = textView;
        this.f = linearLayout;
        this.g = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f843a;
    }
}
