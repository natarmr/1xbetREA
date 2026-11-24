package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l5o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l5o f19468a = new l5o(3, u0o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticBaseballHeaderItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_baseball_header_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.tvFirstTeamNameTitle;
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvFirstTeamNameTitle);
        if (textView != null) {
            i = R.id.tvSecondTeamNameTitle;
            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvSecondTeamNameTitle);
            if (textView2 != null) {
                i = R.id.tvTeamTitle;
                if (((TextView) yum0.f(viewInflate, R.id.tvTeamTitle)) != null) {
                    return new u0o0((ConstraintLayout) viewInflate, textView, textView2);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
