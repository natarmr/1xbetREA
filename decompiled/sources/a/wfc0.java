package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class wfc0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wfc0 f39065a = new wfc0(1, zo8.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/makebet_promocodes/impl/databinding/BottomSheetFragmentPromoCodesBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.bottom_sheet_fragment_promo_codes, (ViewGroup) null, false);
        int i = R.id.flLoader;
        FrameLayout frameLayout = (FrameLayout) yum0.f(viewInflate, R.id.flLoader);
        if (frameLayout != null) {
            i = R.id.groupNoPromoCodes;
            Group group = (Group) yum0.f(viewInflate, R.id.groupNoPromoCodes);
            if (group != null) {
                i = R.id.ivPromoCode;
                if (((ImageView) yum0.f(viewInflate, R.id.ivPromoCode)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    int i2 = R.id.rvPromoCodes;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(viewInflate, R.id.rvPromoCodes);
                    if (recyclerView != null) {
                        i2 = R.id.tvPromoCode;
                        if (((TextView) yum0.f(viewInflate, R.id.tvPromoCode)) != null) {
                            return new zo8(constraintLayout, frameLayout, group, recyclerView);
                        }
                    }
                    i = i2;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
