package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m5o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m5o f21230a = new m5o(3, l8o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticTennisHeaderItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_tennis_header_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        LinearLayout linearLayout = (LinearLayout) yum0.f(viewInflate, R.id.container);
        if (linearLayout != null) {
            return new l8o0((ConstraintLayout) viewInflate, linearLayout);
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.container)));
        return null;
    }
}
