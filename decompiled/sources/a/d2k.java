package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.imageview.ShapeableImageView;
import org.xplatform.ui_core.viewcomponents.views.FixedSelectionTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class d2k implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f5359a;
    public final ShapeableImageView b;
    public final ImageView c;
    public final ConstraintLayout d;
    public final FixedSelectionTextView e;
    public final RecyclerView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;

    public d2k(LinearLayout linearLayout, ShapeableImageView shapeableImageView, ImageView imageView, ConstraintLayout constraintLayout, FixedSelectionTextView fixedSelectionTextView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        this.f5359a = linearLayout;
        this.b = shapeableImageView;
        this.c = imageView;
        this.d = constraintLayout;
        this.e = fixedSelectionTextView;
        this.f = recyclerView;
        this.g = textView;
        this.h = textView2;
        this.i = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f5359a;
    }
}
