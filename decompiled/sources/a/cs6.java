package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class cs6 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCardView f4873a;
    public final ImageView b;
    public final MaterialCardView c;
    public final TextView d;

    public cs6(MaterialCardView materialCardView, ImageView imageView, MaterialCardView materialCardView2, TextView textView) {
        this.f4873a = materialCardView;
        this.b = imageView;
        this.c = materialCardView2;
        this.d = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4873a;
    }
}
