package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w4o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w4o f38549a = new w4o(3, w0o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticBaseballInfoItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_baseball_info_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.tvFirstTeamScore;
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvFirstTeamScore);
        if (textView != null) {
            i = R.id.tvSecondTeamScore;
            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvSecondTeamScore);
            if (textView2 != null) {
                i = R.id.tvSetTitle;
                TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvSetTitle);
                if (textView3 != null) {
                    return new w0o0((ConstraintLayout) viewInflate, textView, textView2, textView3);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
