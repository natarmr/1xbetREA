package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class es10 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f8308a;
    public final RoundCornerImageView b;
    public final TextView c;
    public final TextView d;

    public es10(ConstraintLayout constraintLayout, RoundCornerImageView roundCornerImageView, TextView textView, TextView textView2) {
        this.f8308a = constraintLayout;
        this.b = roundCornerImageView;
        this.c = textView;
        this.d = textView2;
    }

    public static es10 a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_champ_banner_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.imgBanner;
        RoundCornerImageView roundCornerImageView = (RoundCornerImageView) yum0.f(viewInflate, R.id.imgBanner);
        if (roundCornerImageView != null) {
            i = R.id.tvDescription;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvDescription);
            if (textView != null) {
                i = R.id.tvTitle;
                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvTitle);
                if (textView2 != null) {
                    return new es10((ConstraintLayout) viewInflate, roundCornerImageView, textView, textView2);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8308a;
    }
}
