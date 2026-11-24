package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m6o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m6o f21281a = new m6o(3, f8o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticTekkenHeaderItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_tekken_header_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) yum0.f(viewInflate, R.id.container);
        if (linearLayout != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            if (((TextView) yum0.f(viewInflate, R.id.tvTime)) != null) {
                return new f8o0(constraintLayout, linearLayout);
            }
            i = R.id.tvTime;
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
