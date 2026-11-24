package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iob extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iob f15109a = new iob(1, que.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/coupon/impl/databinding/CouponChangeBlockDialogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.coupon_change_block_dialog, (ViewGroup) null, false);
        if (viewInflate != null) {
            RecyclerView recyclerView = (RecyclerView) viewInflate;
            return new que(recyclerView, recyclerView);
        }
        hny.u("rootView");
        return null;
    }
}
