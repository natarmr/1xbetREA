package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class e2k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f7091a;
    public final ImageView b;
    public final AppCompatImageView c;
    public final ConstraintLayout d;
    public final FixedSelectionTextView e;
    public final RecyclerView f;
    public final TextView g;

    public e2k(LinearLayout linearLayout, ImageView imageView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, FixedSelectionTextView fixedSelectionTextView, RecyclerView recyclerView, TextView textView) {
        this.f7091a = linearLayout;
        this.b = imageView;
        this.c = appCompatImageView;
        this.d = constraintLayout;
        this.e = fixedSelectionTextView;
        this.f = recyclerView;
        this.g = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f7091a;
    }
}
