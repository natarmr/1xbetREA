package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ity extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ity f15372a = new ity(1, kty.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/alerts_pipe_impl/databinding/KzFirstDepositBottomSheetBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.kz_first_deposit_bottom_sheet, (ViewGroup) null, false);
        int i = R.id.bottomBar;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(viewInflate, R.id.bottomBar);
        if (dsBottomBar != null) {
            i = R.id.imageView;
            ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(viewInflate, R.id.imageView);
            if (shapeableImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                int i2 = R.id.tvDescription;
                if (((TextView) yum0.f(viewInflate, R.id.tvDescription)) != null) {
                    i2 = R.id.tvTitle;
                    if (((TextView) yum0.f(viewInflate, R.id.tvTitle)) != null) {
                        return new kty(constraintLayout, dsBottomBar, shapeableImageView);
                    }
                }
                i = i2;
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
