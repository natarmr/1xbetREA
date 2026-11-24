package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.imageview.ShapeableImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class okf extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final okf f25403a = new okf(3, ath.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/counterstrike/impl/databinding/CybergameCs2MapStatisticPickbanItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.cybergame_cs2_map_statistic_pickban_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.guidelineLeft;
        if (((Guideline) yum0.f(viewInflate, R.id.guidelineLeft)) != null) {
            i = R.id.guidelineRight;
            if (((Guideline) yum0.f(viewInflate, R.id.guidelineRight)) != null) {
                i = R.id.ivBackground;
                ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewInflate, R.id.ivBackground);
                if (shapeableImageView != null) {
                    i = R.id.ivFirstTeam;
                    ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivFirstTeam);
                    if (imageView != null) {
                        i = R.id.ivSecondTeam;
                        ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.ivSecondTeam);
                        if (imageView2 != null) {
                            i = R.id.tvDeciderMap;
                            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvDeciderMap);
                            if (textView != null) {
                                i = R.id.tvFirstTeamTitle;
                                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvFirstTeamTitle);
                                if (textView2 != null) {
                                    i = R.id.tvMapName;
                                    TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvMapName);
                                    if (textView3 != null) {
                                        i = R.id.tvSecondTeamTitle;
                                        TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tvSecondTeamTitle);
                                        if (textView4 != null) {
                                            return new ath((ConstraintLayout) viewInflate, shapeableImageView, imageView, imageView2, textView, textView2, textView3, textView4);
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
}
