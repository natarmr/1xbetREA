package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xbh0 extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xbh0 f40599a = new xbh0(3, xxx.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/ui_core/databinding/ItemSquaredDateViewBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.item_squared_date_view, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.indicator;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.indicator);
        if (imageView != null) {
            i = R.id.indicatorEndGuideline;
            if (((Guideline) yum0.f(viewInflate, R.id.indicatorEndGuideline)) != null) {
                i = R.id.indicatorTopGuideline;
                if (((Guideline) yum0.f(viewInflate, R.id.indicatorTopGuideline)) != null) {
                    i = R.id.textDate;
                    TextView textView = (TextView) yum0.f(viewInflate, R.id.textDate);
                    if (textView != null) {
                        i = R.id.textMonth;
                        TextView textView2 = (TextView) yum0.f(viewInflate, R.id.textMonth);
                        if (textView2 != null) {
                            i = R.id.textYear;
                            TextView textView3 = (TextView) yum0.f(viewInflate, R.id.textYear);
                            if (textView3 != null) {
                                return new xxx((ConstraintLayout) viewInflate, imageView, textView, textView2, textView3);
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
