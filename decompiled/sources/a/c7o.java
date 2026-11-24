package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c7o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c7o f3874a = new c7o(3, v8o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticVolleyballHeaderItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_volleyball_header_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivFirstServe;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivFirstServe);
        if (imageView != null) {
            i = R.id.ivSecondServe;
            ImageView imageView2 = (ImageView) yum0.f(viewInflate, R.id.ivSecondServe);
            if (imageView2 != null) {
                i = R.id.tvFirstTeamNameTitle;
                TextView textView = (TextView) yum0.f(viewInflate, R.id.tvFirstTeamNameTitle);
                if (textView != null) {
                    i = R.id.tvSecondTeamNameTitle;
                    TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvSecondTeamNameTitle);
                    if (textView2 != null) {
                        i = R.id.tvTeamTitle;
                        if (((TextView) yum0.f(viewInflate, R.id.tvTeamTitle)) != null) {
                            return new v8o0((ConstraintLayout) viewInflate, imageView, imageView2, textView, textView2);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
