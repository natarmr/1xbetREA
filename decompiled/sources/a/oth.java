package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class oth implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f25830a;
    public final ShapeableImageView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;

    public oth(ConstraintLayout constraintLayout, ShapeableImageView shapeableImageView, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f25830a = constraintLayout;
        this.b = shapeableImageView;
        this.c = imageView;
        this.d = imageView2;
        this.e = imageView3;
        this.f = textView;
        this.g = textView2;
        this.h = textView3;
        this.i = textView4;
        this.j = textView5;
        this.k = textView6;
    }

    public static oth a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.cybergame_series_maps_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivBackground;
        ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewInflate, R.id.ivBackground);
        if (shapeableImageView != null) {
            i = R.id.ivFirstTeamImage;
            ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivFirstTeamImage);
            if (imageView != null) {
                i = R.id.ivLive;
                ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.ivLive);
                if (imageView2 != null) {
                    i = R.id.ivSecondTeamImage;
                    ImageView imageView3 = (ImageView) yum0.f(viewInflate, R.id.ivSecondTeamImage);
                    if (imageView3 != null) {
                        i = R.id.tvFirstTeamName;
                        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvFirstTeamName);
                        if (textView != null) {
                            i = R.id.tvFirstTeamScore;
                            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvFirstTeamScore);
                            if (textView2 != null) {
                                i = R.id.tvMapDescription;
                                TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvMapDescription);
                                if (textView3 != null) {
                                    i = R.id.tvMapName;
                                    TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tvMapName);
                                    if (textView4 != null) {
                                        i = R.id.tvSecondTeamName;
                                        TextView textView5 = (TextView) yum0.f(viewInflate, R.id.tvSecondTeamName);
                                        if (textView5 != null) {
                                            i = R.id.tvSecondTeamScore;
                                            TextView textView6 = (TextView) yum0.f(viewInflate, R.id.tvSecondTeamScore);
                                            if (textView6 != null) {
                                                return new oth((ConstraintLayout) viewInflate, shapeableImageView, imageView, imageView2, imageView3, textView, textView2, textView3, textView4, textView5, textView6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f25830a;
    }
}
