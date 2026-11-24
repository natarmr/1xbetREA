package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class s6o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s6o f31714a = new s6o(3, r8o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticUfcItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_ufc_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.tvRound;
        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvRound);
        if (textView != null) {
            i = R.id.tvTime;
            TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvTime);
            if (textView2 != null) {
                i = R.id.tvTypeOfWinner;
                TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvTypeOfWinner);
                if (textView3 != null) {
                    i = R.id.tvWinner;
                    TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tvWinner);
                    if (textView4 != null) {
                        return new r8o0((ConstraintLayout) viewInflate, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
