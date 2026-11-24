package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.imageview.ShapeableImageView;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dof extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dof f6411a = new dof(3, op20.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/core/databinding/MapStatisticWinrateItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.map_statistic_winrate_item, viewGroup, false);
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
                    i = R.id.tvFirstTeamCountMap;
                    TextView textView = (TextView) yum0.f(viewInflate, R.id.tvFirstTeamCountMap);
                    if (textView != null) {
                        i = R.id.tvFirstTeamPercent;
                        TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvFirstTeamPercent);
                        if (textView2 != null) {
                            i = R.id.tvMapName;
                            TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvMapName);
                            if (textView3 != null) {
                                i = R.id.tvSecondTeamCountMap;
                                TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tvSecondTeamCountMap);
                                if (textView4 != null) {
                                    i = R.id.tvSecondTeamPercent;
                                    TextView textView5 = (TextView) yum0.f(viewInflate, R.id.tvSecondTeamPercent);
                                    if (textView5 != null) {
                                        return new op20((ConstraintLayout) viewInflate, shapeableImageView, textView, textView2, textView3, textView4, textView5);
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
