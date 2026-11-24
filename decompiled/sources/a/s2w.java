package a;

import android.view.View;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes3.dex */
public final class s2w implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialCardView f31524a;
    public final TextView b;
    public final TextView c;

    public s2w(MaterialCardView materialCardView, TextView textView, TextView textView2) {
        this.f31524a = materialCardView;
        this.b = textView;
        this.c = textView2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f31524a;
    }
}
