package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n6o extends rer implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n6o f23004a = new n6o(3, h8o0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lorg/xplatform/cyber/game/universal/impl/databinding/SyntheticTekkenItemBinding;", 0);

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        ViewGroup viewGroup = (ViewGroup) obj2;
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.synthetic_tekken_item, viewGroup, false);
        if (zBooleanValue) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.container;
        LinearLayout linearLayout = (LinearLayout) yum0.f(viewInflate, R.id.container);
        if (linearLayout != null) {
            i = R.id.teamImage;
            ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.teamImage);
            if (imageView != null) {
                i = R.id.tvTeamName;
                TextView textView = (TextView) yum0.f(viewInflate, R.id.tvTeamName);
                if (textView != null) {
                    return new h8o0((ConstraintLayout) viewInflate, linearLayout, imageView, textView);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
